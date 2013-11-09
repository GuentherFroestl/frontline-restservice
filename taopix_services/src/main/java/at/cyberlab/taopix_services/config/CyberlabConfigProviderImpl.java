/**
 *
 */
package at.cyberlab.taopix_services.config;

import com.thoughtworks.xstream.XStream;
import de.gammadata.basics.modelle.LandDO;
import de.gammadata.business.modelle.AbholungDO;
import de.gammadata.business.modelle.BarzahlungDO;
import de.gammadata.business.modelle.NettoZahlungsBedingungDO;
import de.gammadata.business.modelle.PaymentServiceZahlungsArtDO;
import de.gammadata.business.modelle.ProduktDO;
import de.gammadata.business.modelle.ProduktDO.Einheit;
import de.gammadata.business.modelle.VersandDO;
import de.gammadata.business.modelle.ZahlungsBedingung;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 * Stellt die Configuration für das Cyberlab-System zur Verfügung Erzeugt Objekte mit Default-Werten falls nich als xml
 * vorhanden
 *
 * @author gfr
 *
 */
public class CyberlabConfigProviderImpl implements CyberlabConfigProvider {

  public static final String TAOPIX_CONFIG_FILE = "taopix.xml";
  public static final String TAOPIX_DEFAULT_FTP_SERVER = "fotobuch.cyberlab.at";
  public static final String TAOPIX_USER = "xml";
  public static final String TAOPIX_PW = "vacr2+2T";
  public static final long TAOPIX_SCAN_INTERVALL = 5 * 60 * 1000L;
  public static final int TAOPIX_START_AUFTRAGSNUMMER = 112500000;
  public static final String BUBU_CONFIG_FILE = "bubu.xml";
  public static final String BUBU_TEMPLATE_FILE = "bubu_template.xml";
  public static final String BUBU_DEFAULT_FTP_SERVER = "ftp-king.bubu.ch";
  public static final String BUBU_DEFAULT_USER = "ftp_cyberlab";
  public static final String BUBU_DEFAULT_PASSWORD = "12CyberLab34";
  public static final Long BUBU_ORDER_ID = 383000000000L;
  public static final Long BUBU_JOB_ID = 382000000000L;
  private FileSystemConfig filesystemConfig;
  private TaopixConfig taopixConfig = null;
  private static final Logger LOG = Logger.getLogger(CyberlabConfigProviderImpl.class.getSimpleName());

  /**
   * @see com.tomagency.cyberlab.server.config.CyberlabConfigProvider#getTaopixConfig()
   */
  @Override
  public TaopixConfig getTaopixConfig() {
//    if (filesystemConfig == null) {
//      LOG.log(Level.SEVERE, "getTaopixConfig(): Fehler FileSystemConfig == null");
//      return null;
//    }
    if (taopixConfig == null) {

      String xml = null;
      XStream xstream = new XStream();

      try {
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/taopix.xml");
        xml = IOUtils.toString(stream, "UTF-8");
      } catch (IOException ex) {
        LOG.log(Level.SEVERE, null, ex);
      }

      if (xml != null) {
        try {
          taopixConfig = (TaopixConfigImpl) xstream.fromXML(xml);
          LOG.log(Level.INFO, "taopixConfig geladen: "+taopixConfig);
        } catch (Exception e) {
          LOG.log(Level.SEVERE, "Fehler beim deserialisieren xml=" + xml, e);
        }
      }
      if (taopixConfig == null) {
        /*
         * Taopix Objekt neu erzeugen und mit defaultwerten füllen
         * und Abspeichern
         */

        taopixConfig = genDefaultTaopixConfig();


        xml = xstream.toXML(taopixConfig);
        LOG.info("new Taopix Configuration\n" + xml);
//				boolean ok=ServletHelper.saveXmlUTF8Body(filesystemConfig.getConfigDirPath()+TAOPIX_CONFIG_FILE, xml);
//				if (ok)
//					LOG.log(Level.SEVERE,"getTaopixConfig(): TaopixConfig neu erzeugt und gespeichert Path= "+
//						filesystemConfig.getConfigDirPath()+TAOPIX_CONFIG_FILE);
//				else
//					LOG.log(Level.SEVERE,"getTaopixConfig(): Fehler beim Speichern TaopixConfig Path= "+
//							filesystemConfig.getConfigDirPath()+TAOPIX_CONFIG_FILE);
      }
    }
    return taopixConfig;
  }

  /**
   * @see com.tomagency.cyberlab.server.config.CyberlabConfigProvider#
   */
  public void setTaopixConfig(TaopixConfig taopixConfig) {
    this.taopixConfig = taopixConfig;

  }

  public FileSystemConfig getFilesystemConfig() {
    return filesystemConfig;
  }

  public void setFilesystemConfig(FileSystemConfig filesystemConfig) {
    this.filesystemConfig = filesystemConfig;
  }

  private TaopixConfig genDefaultTaopixConfig() {
    TaopixConfig tc = new TaopixConfigImpl();

    tc.setStartAuftragsNummer(TAOPIX_START_AUFTRAGSNUMMER);

    FtpServerConfig ftpConfig = new FtpServerConfigImpl();
    ftpConfig.setFtpServerName(TAOPIX_DEFAULT_FTP_SERVER);
    ftpConfig.setFtpUserName(TAOPIX_USER);
    ftpConfig.setFtpPassword(TAOPIX_PW);
    tc.setFtpServerConfig(ftpConfig);

    tc.setScanIntervall(TAOPIX_SCAN_INTERVALL); //Scanintervall in ms = 5min

    LandDO land = new LandDO();
    land.setName("AUSTRIA");
    land.setEigenNamen("Österreich");
    land.setIso3166_2_Code("AT");
    land.setIso3166_3_Code("AUT");
    land.setNummernCode(40);
    tc.setStandardLand(land);

    tc.setTaopixAbholungBezeichnung("COLLECTION");
    tc.setTaopixBarzahlungsBezeichnung("COD");
    tc.setTaopixExpressVersandBezeichnung("EXPRESS");
    tc.setTaopixVersandBezeichnung("STANDARDPOST");
    tc.setTaopixPayPalzahlungsBezeichnung("PAYPAL");
    tc.setVersandKatalogName("Versand");

    tc.setStandardSteuerBezeichnung("Standard");
    tc.setStandardSteuerBetrag(new BigDecimal("20.00"));
    tc.setReduzierteSteuerBezeichnung("Reduziert");
    tc.setReduzierteBetrag(new BigDecimal("10.00"));

    AbholungDO artAbholung = new AbholungDO();
    artAbholung.setBezeichnung("abholung");
    artAbholung.setBeschreibung("Abholung");
    tc.setArtAbholung(artAbholung);

    VersandDO artVersand = new VersandDO();
    artVersand.setBezeichnung("versand");
    artVersand.setBeschreibung("Standardversand mit Paketdienst");
    artVersand.setLieferZeitInTagen(2);
    tc.setArtVersand(artVersand);

    VersandDO artExpress = new VersandDO();
    artExpress.setBezeichnung("express");
    artExpress.setBeschreibung("Expressversand mit Paketdienst");
    artExpress.setLieferZeitInTagen(1);
    tc.setArtExpressVersand(artExpress);

    BarzahlungDO bar = new BarzahlungDO();
    bar.setBezeichnung("bar");
    bar.setBeschreibung("Barzahlung");
    tc.setBarzahlung(bar);

    PaymentServiceZahlungsArtDO paypal = new PaymentServiceZahlungsArtDO();
    paypal.setBezeichnung("paypal");
    paypal.setBeschreibung("Zahlung über PayPal");
    paypal.setZahlungsZielInTagen(ZahlungsBedingung.standardPaymentServiceZiel);
    tc.setPayPalzahlung(paypal);

    NettoZahlungsBedingungDO nettozahlung = new NettoZahlungsBedingungDO();
    nettozahlung.setBezeichnung("netto");
    nettozahlung.setBeschreibung("Zahlung rein netto in " + Integer.toString(ZahlungsBedingung.standardZahlungsZiel) + " Tagen");
    nettozahlung.setZahlungsZielInTagen(ZahlungsBedingung.standardZahlungsZiel);
    tc.setNettozahlung(nettozahlung);

    ProduktDO versandArtikel = new ProduktDO();
    versandArtikel.setArtikelCode("Versand-Std-Steuer");
    versandArtikel.setBezeichnung("Versand Standard Steuer");
    versandArtikel.setBeschreibung("Versandkosten zum standard Steuersatz");
    versandArtikel.setEinheit(Einheit.STK);
    tc.setVersandArtikel(versandArtikel);

    ProduktDO versandArtikelReduzierteSteuer = new ProduktDO();
    versandArtikelReduzierteSteuer.setArtikelCode("Versand-Reduzierte-Steuer");
    versandArtikelReduzierteSteuer.setBezeichnung("Versand Reduzierte Steuer");
    versandArtikelReduzierteSteuer.setBeschreibung("Versandkosten zum reduzierten Steuersatz");
    versandArtikelReduzierteSteuer.setEinheit(Einheit.STK);
    tc.setVersandArtikelReduzierteSteuer(versandArtikelReduzierteSteuer);


    return tc;
  }
}
