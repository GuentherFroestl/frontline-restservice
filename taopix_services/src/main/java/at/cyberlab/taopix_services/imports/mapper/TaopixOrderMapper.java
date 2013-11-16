/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.mapper;

import at.cyberlab.taopix_services.inputobjects.TaopixOrder;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import com.tom.service.dto.WrgDTO;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mapper for Tapoix Order Properties.
 *
 * @author gfr
 */
public class TaopixOrderMapper {

  private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.GERMAN);

  public static BelegPositionDTO mapPosition(HashMap<String, String> itemProperties) {

    BelegPositionDTO pos = new BelegPositionDTO();

    ProduktKopfDTO produkt = new ProduktKopfDTO();
    pos.setProdukt(produkt);
    produkt.setProduktCode(itemProperties.get("productcode"));
    pos.setBezeichnung(itemProperties.get("productname"));
    pos.setBeschreibung(String.format(
            "Projekt: %1$s"
            + "\nSeiten: %2$s"
            + "\nCover PDF-Datei: %3$s"
            + "\nInhalt PDF-Datei: %4$s"
            + "\nInhaltpapier: %5$s %6$s",
            itemProperties.get("projectname"),
            itemProperties.get("pagecount"),
            itemProperties.get("cover1outputfilename"),
            itemProperties.get("pagesoutputfilename"),
            itemProperties.get("papercode"),
            itemProperties.get("papername")));
    if (itemProperties.get("covercode") != null) {
      pos.setBeschreibung(String.format(
              "%1$s"
              + "\nCoverpapier: %2$s %3$s",
              pos.getBeschreibung(),
              itemProperties.get("covercode"),
              itemProperties.get("covername")));
    }

    BigDecimal qty = new BigDecimal(itemProperties.get("qty"));
    pos.setMenge(qty);
    //Gesamtpreis
    BigDecimal gesamtBrutto = new BigDecimal(itemProperties.get("totalsell"));
    BigDecimal steuerGesamt = new BigDecimal(itemProperties.get("totaltax"));
    BigDecimal gesamtNetto = gesamtBrutto.subtract(steuerGesamt);
    PreisDTO gesamtPreis = new PreisDTO();
    pos.setGesamtPreis(gesamtPreis);
    gesamtPreis.setBrutto(true);
    gesamtPreis.setBruttoPreis(gesamtBrutto);
    gesamtPreis.setNettoPreis(gesamtNetto);
    gesamtPreis.setSteuerBetrag(steuerGesamt);
    //Steuern
    SteuerDTO steuer = new SteuerDTO();
    List<SteuerDTO> stList = new ArrayList<SteuerDTO>();
    stList.add(steuer);
    gesamtPreis.setSteuern(stList);
    steuer.setBetrag(steuerGesamt);
    BigDecimal steuersatz = new BigDecimal(itemProperties.get("taxrate")).setScale(2, RoundingMode.HALF_UP);
    SteuerArtDTO stArt = new SteuerArtDTO();
    stArt.setSteuersatz(steuersatz);
    steuer.setSteuerArt(stArt);

    pos.setEinzelPreis(calculateEinzelPreis(gesamtPreis, qty));

    return pos;

  }

  /**
   * Convience routine für EInzelpreisberechnung.
   *
   * @param gesamtPreis PreisDTO
   * @param qty qty
   * @return PreisDTO
   */
  private static PreisDTO calculateEinzelPreis(PreisDTO gesamtPreis, BigDecimal menge) {

    int scale = 4;


    PreisDTO res;
    if (menge.compareTo(BigDecimal.ONE) == 0) {
      res = new PreisDTO(gesamtPreis);
//      //einzelpreis = gesamt
//      res.setBruttoPreis(gesamtPreis.getBruttoPreis().multiply(BigDecimal.ONE));
//      res.setNettoPreis(gesamtPreis.getNettoPreis().multiply(BigDecimal.ONE));
//      res.setSteuerBetrag(gesamtPreis.getSteuerBetrag().multiply(BigDecimal.ONE));
//
//      List<SteuerDTO> stList = new ArrayList<SteuerDTO>();
//      res.setSteuern(stList);
//      for (SteuerDTO gsteuer : gesamtPreis.getSteuern()) {
//        SteuerDTO steuer = new SteuerDTO();
//        steuer.setBetrag(gsteuer.getBetrag().multiply(BigDecimal.ONE));
//        steuer.setSteuerArt(gsteuer.getSteuerArt());
//        stList.add(steuer);
//      }
    } else {
      res = new PreisDTO();
      //einzelpreis = gesamt/qty
      res.setBruttoPreis(gesamtPreis.getBruttoPreis().divide(menge).setScale(scale, RoundingMode.HALF_UP));
      res.setNettoPreis(gesamtPreis.getNettoPreis().divide(menge).setScale(scale, RoundingMode.HALF_UP));
      res.setSteuerBetrag(gesamtPreis.getSteuerBetrag().divide(menge).setScale(scale, RoundingMode.HALF_UP));


      List<SteuerDTO> stList = new ArrayList<SteuerDTO>();
      res.setSteuern(stList);
      for (SteuerDTO gsteuer : gesamtPreis.getSteuern()) {
        SteuerDTO steuer = new SteuerDTO();
        steuer.setBetrag(gsteuer.getBetrag().divide(menge).setScale(scale, RoundingMode.HALF_UP));
        steuer.setSteuerArt(gsteuer.getSteuerArt());
        stList.add(steuer);
      }

    }
    return res;

  }

  /**
   * maps the Wrg.
   *
   * @param orderProperties
   * @return WrgDTO
   */
  public static WrgDTO mapWrg(HashMap<String, String> orderProperties) {

    WrgDTO res = new WrgDTO(orderProperties.get("currencycode"), orderProperties.get("currencysymbol"), new BigDecimal(orderProperties.get("currencyexchangerate")));

    return res;

  }

  /**
   * Sets a bunch of additional properties into the order
   *
   * @param order
   */
  public static void mapOrderProperties(TaopixOrder order, HashMap<String, String> orderProperties) {
    order.setNummer(Integer.parseInt(orderProperties.get("orderid")));
    order.setUuid("TAOPIX_" + orderProperties.get("orderid"));

    order.setWrg(mapWrg(orderProperties));
    try {
      order.setDatum(dateFormat.parse(orderProperties.get("datelastmodified")));
    } catch (ParseException ex) {
      Logger.getLogger(TaopixOrderMapper.class.getName()).log(Level.SEVERE, "Error parsing date=" + orderProperties.get("datelastmodified"), ex);
      order.setDatum(new Date());
    }

    if (orderProperties.get("vouchercode") != null && orderProperties.get("vouchercode").length() > 0) {
      order.setVermerk2("Aktionscode: " + orderProperties.get("vouchercode"));
    }

  }
}
