/**
 *
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.TaopixConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


import de.gammadata.basics.modelle.VarObjectDO;
import de.gammadata.business.modelle.*;

import de.gammadata.sync.BelegImporterImpl;
import de.gammadata.sync.BelegSyncDO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sellt die Implementierung für den Import vom Taopix-Orders (in Belege) zur Verfügung
 *
 * @author gfr
 *
 */
public class TaopixBelegImporterImpl extends BelegImporterImpl implements
        TaopixBelegImporter {

  private TaopixConfig taopixConfig;
  private List<SteuerDO> steuerListe;
  private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.GERMAN);
  private static final BigDecimal bd0 = new BigDecimal("0");
  private static Logger LOG = Logger.getLogger(TaopixBelegImporterImpl.class.getSimpleName());

  /**
   *
   */
  public TaopixBelegImporterImpl() {
  }


  /*
   * @see de.gammadata.sync.BelegImporterImpl#getExtSourceBezeichnung()
   */
  @Override
  public String getExtSourceBezeichnung() {
    return TaopixConfig.TAOPIX_ORDER;
  }

  public BelegSyncDO syncTaopixOrder(String orderID,
          BelegDO order,
          HashMap<String, String> headerProperties,
          HashMap<String, String> itemProperties,
          HashMap<String, String> shippingProperties) {

    BelegSyncDO syncDO = this.searchBelegSyncByExtRef(orderID);
    if (syncDO != null) {
      LOG.log(Level.INFO, "syncTaopixOrder Beleg gefunden: " + orderID);
      return syncDO;
    }

    LOG.log(Level.INFO, "syncTaopixOrder erzeuge Beleg: " + orderID);
    syncDO = new BelegSyncDO();

    AuftragDO auftrag;
    if (order instanceof AuftragDO) {
      auftrag = (AuftragDO) order;
    } else {
      auftrag = new AuftragDO();
      auftrag.setAdresse(order.getAdresse());
      auftrag.setKontakt(order.getKontakt());
      auftrag.setEmailAdresse(order.getEmailAdresse());
    }

    syncDO.setBeleg(auftrag);
    try {
      /*
       * Beleg Kopfdaten
       */
      auftrag.setUuid(this.getExtSourceBezeichnung() + "_" + headerProperties.get("orderid"));
      int auftragsnummer = Integer.parseInt(headerProperties.get("orderid")) + getTaopixConfig().getStartAuftragsNummer();
      auftrag.setNummer(auftragsnummer);
      auftrag.setStatus("NEU");
      LOG.log(Level.INFO, "syncTaopixOrder setze Auftragsnummer: " + auftrag.getNummer() + " Start Ab-Nr: " + getTaopixConfig().getStartAuftragsNummer() + " Status:" + auftrag.getStatus());
      auftrag.setDatum(dateFormat.parse(headerProperties.get("datelastmodified")));
      auftrag.setBruttoBeleg(true);
      StringBuilder vermerk = new StringBuilder();

      /*
       * Zahlungsbedingung und Versandart
       */

      String paymentCode = headerProperties.get("paymentmethodcode");
      if (this.getTaopixConfig().getTaopixBarzahlungsBezeichnung().equalsIgnoreCase(paymentCode)) {
        auftrag.setZahlungsBedingung(this.getTaopixConfig().getBarzahlung());
      } else if (this.getTaopixConfig().getTaopixPayPalzahlungsBezeichnung().equalsIgnoreCase(paymentCode)) {
        auftrag.setZahlungsBedingung(this.getTaopixConfig().getPayPalzahlung());
      } else {
        auftrag.setZahlungsBedingung(this.getTaopixConfig().getBarzahlung());
        vermerk.append("Taopix-Zahlungsbedingung: " + paymentCode + ", " + headerProperties.get("paymentmethodname"));
        LOG.log(Level.INFO, "syncTaopixOrder " + orderID + ": Paymentcode nicht hinterlegt: " + paymentCode + ", " + headerProperties.get("paymentmethodname"));
      }

      String versandCode = shippingProperties.get("shippingmethodcode");
      if (this.getTaopixConfig().getTaopixAbholungBezeichnung().equalsIgnoreCase(versandCode)) {
        auftrag.setVersandArt(this.getTaopixConfig().getArtAbholung());
      } else if (this.getTaopixConfig().getTaopixExpressVersandBezeichnung().equalsIgnoreCase(versandCode)) {
        auftrag.setVersandArt(this.getTaopixConfig().getArtExpressVersand());
      } else if (this.getTaopixConfig().getTaopixVersandBezeichnung().equalsIgnoreCase(versandCode)) {
        auftrag.setVersandArt(this.getTaopixConfig().getArtVersand());
      } else {
        auftrag.setVersandArt(this.getTaopixConfig().getArtAbholung());
        vermerk.append("Taopix-Versandart: " + versandCode + ", " + shippingProperties.get("shippingmethodname"));
        LOG.log(Level.INFO, "syncTaopixOrder " + orderID + ": shippingcode nicht hinterlegt: " + versandCode + ", " + shippingProperties.get("shippingmethodname"));
      }

      if (vermerk.length() > 0) {
        auftrag.setVermerk(vermerk.toString());
      }

      /*
       * Belegposition
       */

      String produktCode = itemProperties.get("productcode");
      ProduktDO produkt = new ProduktDO();
      //TODO
//			List<ProduktDO> liste=produktDao.findByArtikelCode(produktCode, SEARCHTYPE.EXACT, 0, 0, this.getEm());
      List<ProduktDO> liste = null;
      if (liste != null && liste.size() > 0) {
        produkt = liste.get(0);
      } else {
        LOG.log(Level.INFO, "syncTaopixOrder: Fehler Produkt nicht gefunden: " + produktCode + " Wird neu angelegt");
        KatalogProduktDO taopixKat = new KatalogDO();
        taopixKat.setBezeichnung(taopixConfig.getTaopixKatalogName());
//				taopixKat=this.katalogEintrag(produktDao, getEm(), taopixKat);

        produkt = new ProduktDO((KatalogDO) taopixKat);
        produkt.setArtikelCode(itemProperties.get("productcode"));
        produkt.setBezeichnung(itemProperties.get("productname"));
        produkt.setBeschreibung(itemProperties.get("productname"));
        BigDecimal qty = new BigDecimal(itemProperties.get("qty"));
        BigDecimal productSell = new BigDecimal(itemProperties.get("producttotalsell"));
        BigDecimal productTax = new BigDecimal(itemProperties.get("producttotaltax"));
        BigDecimal produktBrutto = productSell.divide(qty);
        /*
         * SteuerDO suchen
         */
        BigDecimal steuersatz = new BigDecimal(itemProperties.get("taxrate")).setScale(2, RoundingMode.HALF_UP);
        SteuerDO steuer = null;

        for (SteuerDO st : steuerListe) {
          if (st.getSteuersatz().compareTo(steuersatz) == 0) {
            steuer = st;
          }
        }

        if (steuer == null) {
          LOG.log(Level.INFO, "syncTaopixOrder: Steuersatz nicht gefunden: " + steuersatz);
          return null;
        }

        produkt.setSteuer(steuer);
        produkt.setBruttoPreis(new GeldDO(produktBrutto, auftrag.getWrg()));
        //TODO
//				EntityTransaction tx = getEm().getTransaction();
//				tx.begin();
//				produktDao.persistEntity(produkt, getEm());
//				((KatalogDO)taopixKat).add(produkt);
//				produktDao.persistEntity(taopixKat, getEm());
//				tx.commit();
      }

      if (produkt != null) {
        BigDecimal rabattÜbertrag = null;
        BelegPositionDO pos = new BelegPositionDO((BelegDO) auftrag);
        pos.setLlDatum(auftrag.getDatum());
        pos.setProdukt(produkt, new BigDecimal(itemProperties.get("qty")));
        BigDecimal bruttoBetrag = new BigDecimal(itemProperties.get("totalsell"));
        StringBuilder discountSB = new StringBuilder();
        if (headerProperties.get("totaldiscount") != null && headerProperties.get("totaldiscount").length() > 0) {
          BigDecimal discount = new BigDecimal(headerProperties.get("totaldiscount"));
          if (discount.compareTo(bd0) > 0) {
            bruttoBetrag = bruttoBetrag.subtract(discount);
            if (bruttoBetrag.compareTo(bd0) < 0) {
              rabattÜbertrag = bruttoBetrag; //negativer Betrag wird ggf. für den versand verwendet
              bruttoBetrag = new BigDecimal("0"); // Produkt kostet nix da rabatt grösser als Produktpreis
            }
            LOG.log(Level.INFO, "syncTaopixOrder discount endeckt, OrderID: " + orderID + ", PosBruttoBetrag " + itemProperties.get("totalsell") + " - totaldiscount  " + discount + " ergibt PosBruttobetrag " + bruttoBetrag);
            discountSB.append("Rabatt, Betrag " + itemProperties.get("totalsell") + " ");
          }
        }
        pos.setGesamtBruttoPreis(new GeldDO(bruttoBetrag, auftrag.getWrg()));
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

        if (headerProperties.get("vouchercode") != null && headerProperties.get("vouchercode").length() > 0) {
          discountSB.append("Aktionscode: " + headerProperties.get("vouchercode"));
        }
        if (discountSB.length() > 0) {
          pos.setBeschreibung(pos.getBeschreibung() + "\n" + discountSB.toString());
        }

        /*
         * Specobjekt erzeugen und der Position zuordnen
         */
        TaopixFotobuchSpec spec = new TaopixFotobuchSpecImpl(itemProperties);
        XStream xstream = new XStream(new DomDriver());
        VarObjectDO specObj = new VarObjectDO();
        specObj.setObjectClassName(spec.getClass().getName());
        specObj.setXmlStream(xstream.toXML(spec));
        pos.setSpecObject(specObj);

        auftrag.addPosition(pos);  //Position mit Fotobuch Produkt

        /*
         * Versandartikel erzeugen
         */

        if (shippingProperties.containsKey("shippingtotalsell")) {
          BigDecimal shippingPrice = new BigDecimal(shippingProperties.get("shippingtotalsell"));
          if (shippingPrice.compareTo(new BigDecimal(0)) > 0) {
            BelegPositionDO sPos = new BelegPositionDO((BelegDO) auftrag);
            sPos.setLlDatum(auftrag.getDatum());
            if (produkt.getSteuer().getSteuersatz().compareTo(
                    getTaopixConfig().getVersandArtikelReduzierteSteuer().getSteuer().getSteuersatz()) == 0) {
              sPos.setProdukt(getTaopixConfig().getVersandArtikelReduzierteSteuer(), new BigDecimal("1"));
            } else {
              sPos.setProdukt(getTaopixConfig().getVersandArtikel(), new BigDecimal("1"));
            }
            if (rabattÜbertrag != null) {
              shippingPrice = shippingPrice.add(rabattÜbertrag);  //negativer Übertrag vom Produkt
            }

            sPos.setEinzelBruttoPreis(new GeldDO(shippingPrice, auftrag.getWrg()));
            sPos.setBezeichnung(auftrag.getVersandArt().getBezeichnung());
            sPos.setBeschreibung(auftrag.getVersandArt().getBeschreibung());

            auftrag.addPosition(sPos);
          }

        }
        BigDecimal totalOrderBetrag = new BigDecimal(headerProperties.get("total"));
        if (auftrag.getTotal().getBetrag().compareTo(totalOrderBetrag) != 0) {
          LOG.log(Level.INFO, "syncTaopixOrder Abweichung in der Gesamtsummer, OrderID: " + orderID
                  + " total: " + totalOrderBetrag
                  + " AuftragGesamtSumme: " + auftrag.getTotal().getBetrag());
        }

        auftrag.setSubject(String.format("%1$s, Projekt %2$s, Tx %3$s", produktCode, headerProperties.get("projectname"), headerProperties.get("orderid")));
        syncDO = createBelegSync(orderID, auftrag);
      }

    } catch (Exception e) {
      LOG.log(Level.INFO, "Fehler beim Parsen: ", e);
      syncDO = null;
    }

    return syncDO;
  }

  public TaopixConfig getTaopixConfig() {
    return taopixConfig;
  }

  public void setTaopixConfig(TaopixConfig taopixLiterale) {
    this.taopixConfig = taopixLiterale;
  }

  public List<SteuerDO> getSteuerListe() {
    return steuerListe;
  }

  public void setSteuerListe(List<SteuerDO> steuerListe) {
    this.steuerListe = steuerListe;
  }

  @Override
  public BelegSyncDO searchBelegSyncByExtRef(String extBelegId) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public BelegSyncDO createBelegSync(String extBelegId, BelegDO beleg) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public BelegSyncDO syncBelegDO(BelegSyncDO belegSync) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public KatalogProduktDO katalogEintrag(KatalogProduktDO produkt) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ProduktDO productEintrag(ProduktDO produkt) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public SteuerDO steuerEintrag(SteuerDO steuer) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
