package at.cyberlab.taopix_services.imports.mapper;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.inputobjects.TaopixOrder;
import com.tom.service.dto.BelegDTO;
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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mapper for Tapoix Order Properties.
 *
 * @author gfr
 */
public class TaopixOrderMapper {

  private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.GERMAN);

  /**
   * creates the order position with the product.
   *
   * @param itemProperties HashMap of String, String
   * @return BelegPositionDTO
   */
  public static BelegPositionDTO mapPosition(HashMap<String, String> itemProperties, TaopixTomImportConfig tomImportConfig) {

    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setMandant(tomImportConfig.getMandatorId());

    ProduktKopfDTO produkt = new ProduktKopfDTO();
    produkt.setMandant(tomImportConfig.getMandatorId());
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
    //Pricing
    BigDecimal qty = new BigDecimal(itemProperties.get("qty"));
    BigDecimal gesamtBrutto = new BigDecimal(itemProperties.get("totalsell"));
    BigDecimal steuerGesamt = new BigDecimal(itemProperties.get("totaltax"));
    BigDecimal steuersatz = new BigDecimal(itemProperties.get("taxrate")).setScale(2, RoundingMode.HALF_UP);
    setPreis(pos, qty, gesamtBrutto, steuerGesamt, steuersatz);

    return pos;

  }

  /**
   * Creates a BelegPositionDTO for the shipping costs.
   *
   * @param shippingProperties HashMap of String, String
   * @return BelegPositionDTO or null, if there is no shipping
   */
  public static BelegPositionDTO mapShippingPosition(HashMap<String, String> shipingProperties, TaopixTomImportConfig tomImportConfig) {

    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setMandant(tomImportConfig.getMandatorId());

    ProduktKopfDTO produkt = new ProduktKopfDTO();
    produkt.setMandant(tomImportConfig.getMandatorId());
    pos.setProdukt(produkt);
    produkt.setProduktCode(shipingProperties.get("shippingmethodcode"));
    pos.setBezeichnung(shipingProperties.get("shippingmethodcode"));
    pos.setBeschreibung(String.format(
            "Lieferung: %1$s"
            + "\n%2$s",
            shipingProperties.get("shippingmethodname"),
            shipingProperties.get("shippingrateinfo")));
    //Pricing
    BigDecimal qty = BigDecimal.ONE;
    BigDecimal gesamtBrutto = new BigDecimal(shipingProperties.get("shippingtotalsell"));
    BigDecimal steuerGesamt = new BigDecimal(shipingProperties.get("shippingratetaxtotal"));
    BigDecimal steuersatz = new BigDecimal(shipingProperties.get("shippingratetaxrate")).setScale(2, RoundingMode.HALF_UP);
    setPreis(pos, qty, gesamtBrutto, steuerGesamt, steuersatz);

    return pos;
  }

  /**
   * Handles discounts and returns a BelegPositionDTO, if a discount is given.
   *
   * @param orderProperties HashMap of String, String
   * @param itemProperties HashMap of String, String , needed for taxation
   * @return BelegPositionDTO or null
   */
  public static BelegPositionDTO mapDiscountPosition(HashMap<String, String> orderProperties, HashMap<String, String> itemProperties, TaopixTomImportConfig tomImportConfig) {
    BigDecimal discount = null;
    if (orderProperties.get("totaldiscount") != null) {
      discount = new BigDecimal(orderProperties.get("totaldiscount"));
    }
    if (discount == null || discount.compareTo(BigDecimal.ZERO) == 0) {
      return null; // No discount
    }
    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setMandant(tomImportConfig.getMandatorId());

    ProduktKopfDTO produkt = new ProduktKopfDTO();
    produkt.setMandant(tomImportConfig.getMandatorId());
    pos.setProdukt(produkt);
    produkt.setProduktCode("Aktionsrabatt");
    pos.setBezeichnung(orderProperties.get("vouchercode"));
    pos.setBeschreibung(String.format(
            "vouchercode: %1$s"
            + "\nvoucherdiscountsection: %2$s"
            + "\nvoucherdiscounttype: %3$s",
            orderProperties.get("vouchercode"),
            orderProperties.get("voucherdiscountsection"),
            orderProperties.get("voucherdiscounttype")));
    //Pricing
    BigDecimal qty = BigDecimal.ONE;
    BigDecimal gesamtBrutto = new BigDecimal(orderProperties.get("totaldiscount"));
    //Use taxrate of product to calculate discount
    BigDecimal steuersatz = new BigDecimal(itemProperties.get("taxrate")).setScale(2, RoundingMode.HALF_UP);
    BigDecimal taxDivisor = new BigDecimal("100.00").add(steuersatz);
    BigDecimal gesamtNetto = gesamtBrutto.multiply(new BigDecimal("100.00")).divide(taxDivisor,RoundingMode.HALF_UP);
    BigDecimal steuerGesamt = gesamtBrutto.subtract(gesamtNetto);
    //Discount has to be negative
    setPreis(pos, qty, BigDecimal.ZERO.subtract(gesamtBrutto), BigDecimal.ZERO.subtract(steuerGesamt), steuersatz);

    return pos;

  }

  /**
   * maps the Wrg.
   *
   * @param orderProperties HashMap of String, String
   * @return WrgDTO
   */
  public static WrgDTO mapWrg(HashMap<String, String> orderProperties, TaopixTomImportConfig tomImportConfig) {

    WrgDTO res = new WrgDTO(orderProperties.get("currencycode"), orderProperties.get("currencysymbol"), new BigDecimal(orderProperties.get("currencyexchangerate")));
    res.setMandant(tomImportConfig.getMandatorId());
    return res;

  }

  /**
   * Sets a bunch of additional properties into the order.
   *
   * @param order
   */
  public static void mapOrderProperties(TaopixOrder order, HashMap<String, String> orderProperties, TaopixTomImportConfig tomImportConfig) {
    order.setNummer(tomImportConfig.getOrderNumberOffset() + Integer.parseInt(orderProperties.get("id")));
    order.setUuid("TAOPIX_" + orderProperties.get("id"));
    String payment;
    if ("1".equals(orderProperties.get("paymentreceived"))){
      payment= "bezahlt "+orderProperties.get("paymentmethodcode");
    }else{
      payment="";
    }
    order.setBetreff("TAOPIX " + orderProperties.get("id")+ " "+orderProperties.get("productcode")+ " "+payment);
    order.setMandant(tomImportConfig.getMandatorId());

    order.setWrg(mapWrg(orderProperties, tomImportConfig));
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



  /**
   * Convienence methode for setting pricing.
   *
   * @param pos BelegPositionDTO to set price to
   * @param qty int quantity
   * @param gesamtBrutto BigDecimal
   * @param steuerGesamt BigDecimal
   * @param steuerSatz BigDecimal
   */
  private static void setPreis(BelegPositionDTO pos, BigDecimal qty, BigDecimal gesamtBrutto, BigDecimal steuerGesamt, BigDecimal steuerSatz) {
    pos.setMenge(qty);
    //Gesamtpreis
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
    SteuerArtDTO stArt = new SteuerArtDTO();
    stArt.setSteuersatz(steuerSatz);
    steuer.setSteuerArt(stArt);
    //Einzelpreis
    pos.setEinzelPreis(calculateEinzelPreis(gesamtPreis, qty));
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
}
