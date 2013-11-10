package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.TaopixConfig;
import at.cyberlab.taopix_services.config.CyberlabConfigProvider;
import at.cyberlab.taopix_services.config.FileSystemConfig;
import de.gammadata.basics.modelle.LandDO;
import de.gammadata.basics.modelle.Wrg;
import de.gammadata.business.modelle.AbholungDO;
import de.gammadata.business.modelle.AuftragDO;
import de.gammadata.business.modelle.BarzahlungDO;
import de.gammadata.business.modelle.GeldDO;
import de.gammadata.business.modelle.KatalogDO;
import de.gammadata.business.modelle.NettoZahlungsBedingungDO;
import de.gammadata.business.modelle.PaymentServiceZahlungsArtDO;
import de.gammadata.business.modelle.ProduktDO;
import de.gammadata.business.modelle.ProduktDO.Einheit;
import de.gammadata.business.modelle.SteuerDO;
import de.gammadata.business.modelle.VersandDO;
import de.gammadata.business.modelle.WrgDO;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;
import org.apache.commons.net.ftp.FTPReply;

/**
 * @author gfr
 *
 */
public class TaopixFtpBackgroundScannerImpl {

  public static final String TAOPIX_DIR = "taopix";
  public static final String TAOPIX_FTP_IN_DIR_NAME = "ftp_in";
  public static final String PROCESSED_DIR_NAME = "processed";
  private FileSystemConfig filesystemConfig;
  private CyberlabConfigProvider cyberlabConfigProvider;
  private TaopixXmlParser xmlParser;
  private TaopixKontaktImporterImpl importer;
  private TaopixBelegImporterImpl belegImporter;
  private String info;
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TaopixFtpBackgroundScannerImpl.class.getSimpleName());
  private boolean printFileTrans = false;
  private boolean isInit = false;

  /**
   *
   */
  public TaopixFtpBackgroundScannerImpl() {
  }

  /**
   * @see de.gammadata.util.services.BackgroundScanner#init()
   */
  public boolean init() {


    try {
      if (cyberlabConfigProvider == null) {
        logger.info("init(): Fehler  cyberlabConfigProvider==null");
        return false;
      }
      int abnr = cyberlabConfigProvider.getTaopixConfig().getStartAuftragsNummer();
      logger.info("init()  Taopix StartAuftragsNummer = " + abnr);

//      this.setScanIntervall(cyberlabConfigProvider.getTaopixConfig().getScanIntervall());
      File dir = new File(getFtpDirPath());
      if (!dir.exists() || !dir.canWrite() || !dir.isDirectory()) {
        logger.info("init(): Fehler kann Directory nicht schreiben: "
                + dir.getAbsolutePath()
                + ", canWrite: " + dir.canWrite()
                + ", isDirectory: " + dir.isDirectory());
        return false;
      }

      FTPClient ftp = new FTPClient();;
      ftp.connect(cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());
      int reply = ftp.getReplyCode();

      if (!FTPReply.isPositiveCompletion(reply)) {
        ftp.disconnect();
        logger.info("init(): Fehler  kann nicht mit Ftp-Server verbinden: " + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());
        return false;
      } else {
        logger.info("init() Verbindung mit Ftp-Server ok " + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());

      }
      if (ftp.isConnected()) {
        try {
          ftp.disconnect();
        } catch (Exception f) {
          // do nothing
        }
      }

      isInit = true;
//			    this.setInfo("Initialisiert, aber noch nciht gestartet");
      return true;

    } catch (Exception e) {
      logger.log(Level.SEVERE, "init(): Fehler ", e);
      return false;
    }

  }

  /**
   * @see de.gammadata.util.services.BackgroundScannerImpl#doTheScan()
   */
  public void doTheScan() {
    if (!isInit) {
      init();
    }


    FTPClient ftp = new FTPClient();
    try {
      ftp.connect(cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());
      int reply = ftp.getReplyCode();
      if (!FTPReply.isPositiveCompletion(reply)) {
        ftp.disconnect();
        logger.info("doTheScan(): Fehler  kann nicht mit Ftp-Server verbinden: " + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());
        return;
      }
      if (!ftp.login(cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpUserName(),
              cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpPassword())) {
        ftp.logout();
        ftp.disconnect();
        logger.info("doTheScan(): Fehler  kann nicht mit Ftp-Server verbinden, Login fehlgeschlagen: " + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName());
        return;
      }

//      EntityManager entityManager = getPersistenceManager().getEntityManager();
//      createTaopixXmlParser(entityManager);


      logger.info("================= START TAOPIX FTP IMPORT Zyklus =========================");
      int filesInsgesamt = 0;
      int filesÜbertragen = 0;
      FTPListParseEngine engine = ftp.initiateListParsing();
      boolean weiter = true;
      info = "verbunden mit Ftp-Server: " + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName();
      while (engine.hasNext() & weiter) {
        List<FTPFile> files = Arrays.asList(engine.getNext(25));
//                    System.out.println("Verzeichnis Listing "+files.size()+ " Dateien");

        for (FTPFile file : files) {
          if (file.isFile()) {
            filesInsgesamt++;

            File tempDatei = new File(getFtpDirPath() + file.getName());
            if (!tempDatei.canRead()) {


              FileOutputStream output = new FileOutputStream(tempDatei);
              boolean ok = ftp.retrieveFile(file.getName(), output);
              if (ok) {
                if (printFileTrans) {
                  logger.info(file.getName() + " " + new Date(file.getTimestamp().getTimeInMillis()) + " >>>> " + tempDatei.getAbsolutePath());
                }
                filesÜbertragen++;

              } else {
                logger.info("Fehler beim speichern: " + file.getName() + " " + new Date(file.getTimestamp().getTimeInMillis()) + " >>>> " + tempDatei.getAbsolutePath());
                weiter = false;
              }
            } else {
              if (printFileTrans) {
                logger.info("Datei vorhanden: " + tempDatei.getAbsolutePath());
              }

            }

            xmlParser.parse(tempDatei);
            AuftragDO order = xmlParser.getImportedOrder();
            if (order != null) {
//                    			System.out.println();
              logger.info("Sync Auftrag Nr.: " + order.getNummer() + ", " + order.getSubject() + ",  " + order.getKontakt().getNamenString());
            } else {
              logger.info("Fehler beim Importieren von : " + tempDatei.getAbsolutePath());
            }

          } else {
            if (printFileTrans) {
              logger.info("dir: " + file.getName() + " " + new Date(file.getTimestamp().getTimeInMillis()));
            }
          }
          info = "verbunden mit Ftp-Server: "
                  + cyberlabConfigProvider.getTaopixConfig().getFtpServerConfig().getFtpServerName()
                  + "Files auf ftp-Server: " + filesInsgesamt + " Files neu übertragen: " + filesÜbertragen;

        }
      }

//      if (entityManager != null) {
////        			entityManager.flush();
//        entityManager.close();
//      }


      logger.info("==========================================");
      logger.info("Files auf ftp-Server: " + filesInsgesamt + " Files neu übertragen: " + filesÜbertragen);
      logger.info("=================== IMPORT ENDE=======================");
      info = "Import Zyklus abgeschlossen, #Files insgesamt: " + filesInsgesamt + " #Files neu geholt: " + filesÜbertragen;

    } catch (Exception e) {
      logger.log(Level.SEVERE, info, e);

    }

  }

  private String getFtpDirPath() {
    String getFtpDirPath = filesystemConfig.getDataDirPath() + TAOPIX_DIR + filesystemConfig.getPathSeparator() + TAOPIX_FTP_IN_DIR_NAME + filesystemConfig.getPathSeparator();
    return getFtpDirPath;
  }

  private void createTaopixXmlParser() {


    xmlParser = new TaopixXmlParser();


    /*
     * TaopixKontaktImporter erzeugen
     */
    importer = new TaopixKontaktImporterImpl();

//    LandDAO dao = new LandDAO();
//    List<LandDO> list = dao.findByIso2Code("AT", SEARCHTYPE.EXACT, 0, 0, entityManager);
    List<LandDO> list = new ArrayList<LandDO>();
    if (list.size() > 0) {
      importer.setStandardLand(list.get(0));
      logger.info("StandardLand gefunden, ID: " + list.get(0).getId() + ", " + list.get(0).getEigenNamen());
    } else {
      LandDO land = new LandDO();
      land.setEigenNamen("AUSTRIA");
      land.setIso3166_2_Code("AT");
      land.setIso3166_3_Code("AUT");
      land.setNummernCode(40);
//      dao.storeEntity(land, entityManager);
      importer.setStandardLand(land);
      logger.info("Land neu erzeugt, ID:  " + land.getId() + " " + land.getEigenNamen());
    }
    xmlParser.setKontaktImporter(importer);

    WrgDO eur = new WrgDO();
//    WrgDAO wrgDAO = new WrgDAO();

//    List<WrgDO> wrgListe = wrgDAO.findByString(Wrg.EURO, SEARCHTYPE.EXACT, 0, 0, entityManager);
    List<WrgDO> wrgListe = new ArrayList<WrgDO>();
    if (wrgListe != null && wrgListe.size() > 0) {
      eur = wrgListe.get(0);
    } else {
      logger.info("createTaopixXmlParser: EUR-Wrg nicht gefunden: " + Wrg.EURO);
    }

    xmlParser.setStandardWrg(eur);

    logger.info("------------------------ Steuertabelle erzeugen/prüfen -------------------------");

//    SteuerDAO steuerDao = new SteuerDAO();
    SteuerDO steuer = new SteuerDO();
    steuer.setBezeichnung("standard");
    steuer.setSteuersatz(new BigDecimal("20"));
    steuer.setValid(true);
//    steuer = helper.steuerEintrag(steuerDao, entityManager, steuer);

    SteuerDO erm_steuer = new SteuerDO();
    erm_steuer.setBezeichnung("reduziert");
    erm_steuer.setSteuersatz(new BigDecimal("10"));
    erm_steuer.setValid(true);
//    erm_steuer = helper.steuerEintrag(steuerDao, entityManager, erm_steuer);
/*
     List<SteuerDO> steuern = steuerDao.findBySteuersatz(new BigDecimal("20.00"), SEARCHTYPE.EXACT, 0, 0, entityManager);
     if (steuern != null && steuern.size() > 0) {
     logger.info("Steuersatz 20% gefunden Anzahl: +" + steuern.size() + ", Bez: " + steuern.get(0).getBezeichnung() + ", Satz: " + steuern.get(0).getSteuersatz());
     } else {
     logger.info("Fehler Steuersatz 20% nicht gefunden");
     }


     List<SteuerDO> steuerListe = steuerDao.findAll(0, 0, entityManager);
     if (steuerListe == null || steuerListe.size() < 2) {
     logger.info("createTaopixXmlParser: Fehler Steuerliste hat nicht 2 Steuersätze");
     }

     logger.info("------------------------ Steuertabelle ENDE -------------------------");
     */
    /*
     * BelegImporter erzeugen
     */

    /*
     * Belegimporter DI
     */

    List<SteuerDO> steuerListe = new ArrayList<SteuerDO>();

    belegImporter = new TaopixBelegImporterImpl();

    belegImporter.setSteuerListe(steuerListe);
    TaopixConfig txconfig = cyberlabConfigProvider.getTaopixConfig();
    belegImporter.setTaopixConfig(txconfig);
    xmlParser.setBelegImporter(belegImporter);


    logger.info("------------------------ Produkte erzeugen/prüfen -------------------------");
//    EntityTransaction tx2 = entityManager.getTransaction();
//    tx2.begin();
//    ProduktDAO pDao = new ProduktDAO();
    KatalogDO taopix_kat = new KatalogDO();
    taopix_kat.setBezeichnung(txconfig.getTaopixKatalogName());
//    taopix_kat = (KatalogDO) helper.katalogEintrag(pDao, entityManager, taopix_kat);

    ProduktDO fb_15x20 = new ProduktDO(taopix_kat);
    fb_15x20.setArtikelCode("FB_15x20");
    fb_15x20.setBezeichnung("Fotobuch 15x20,5cm quer");
    fb_15x20.setBeschreibung("Fotobuch 15x20,5cm querformat");
    fb_15x20.setSteuer(erm_steuer);
    fb_15x20.setNettoPreis(new GeldDO(new BigDecimal("9.00"), eur));
    fb_15x20.setEinheit(Einheit.STK);
//    fb_15x20 = (ProduktDO) helper.katalogEintrag(pDao, entityManager, fb_15x20);
    taopix_kat.add(fb_15x20);

    ProduktDO fb_20x20 = new ProduktDO(taopix_kat);
    fb_20x20.setArtikelCode("FB_20x20");
    fb_20x20.setBezeichnung("Fotobuch 20,5x20,5cm");
    fb_20x20.setBeschreibung("Fotobuch 20,5x20,5cm quardratisch");
    fb_20x20.setSteuer(erm_steuer);
    fb_20x20.setNettoPreis(new GeldDO(new BigDecimal("12.00"), eur));
    fb_20x20.setEinheit(Einheit.STK);
//    fb_20x20 = (ProduktDO) helper.katalogEintrag(pDao, entityManager, fb_20x20);
    taopix_kat.add(fb_20x20);

    ProduktDO fb_20X27_H = new ProduktDO(taopix_kat);
    fb_20X27_H.setArtikelCode("FB_20X27_H");
    fb_20X27_H.setBezeichnung("Fotobuch 20,5x27cm, hoch");
    fb_20X27_H.setBeschreibung("Fotobuch 20,5x27cm, hochformat");
    fb_20X27_H.setSteuer(erm_steuer);
    fb_20X27_H.setNettoPreis(new GeldDO(new BigDecimal("19.00"), eur));
    fb_20X27_H.setEinheit(Einheit.STK);
//    fb_20X27_H = (ProduktDO) helper.katalogEintrag(pDao, entityManager, fb_20X27_H);
    taopix_kat.add(fb_20X27_H);

    ProduktDO fb_20x30Q = new ProduktDO(taopix_kat);
    fb_20x30Q.setArtikelCode("FB_20X30_Q");
    fb_20x30Q.setBezeichnung("Fotobuch A4 (29,7x21cm) quer");
    fb_20x30Q.setBeschreibung("Fotobuch A4 (29,7x21cm) querformat");
    fb_20x30Q.setSteuer(erm_steuer);
    fb_20x30Q.setNettoPreis(new GeldDO(new BigDecimal("24.00"), eur));
    fb_20x30Q.setEinheit(Einheit.STK);
//    fb_20x30Q = (ProduktDO) helper.katalogEintrag(pDao, entityManager, fb_20x30Q);
    taopix_kat.add(fb_20x30Q);

    ProduktDO fb_30x30 = new ProduktDO(taopix_kat);
    fb_30x30.setArtikelCode("FB_30X30");
    fb_30x30.setBezeichnung("Fotobuch 30x29,4cm");
    fb_30x30.setBeschreibung("Fotobuch 30x29,4cm");
    fb_30x30.setSteuer(erm_steuer);
    fb_30x30.setNettoPreis(new GeldDO(new BigDecimal("29.00"), eur));
    fb_30x30.setEinheit(Einheit.STK);
//    fb_30x30 = (ProduktDO) helper.katalogEintrag(pDao, entityManager, fb_30x30);
    taopix_kat.add(fb_30x30);


//    pDao.storeEntity(taopix_kat, entityManager);
//			pDao.storeEntity(taopix_kat, entityManager);
    /*
     tx2.commit();

     List<KatalogProduktDO> produktListe = pDao.findByBezeichnung(taopix_kat.getBezeichnung(), SEARCHTYPE.EXACT, 0, 0, entityManager);
     if (produktListe != null && produktListe.size() > 0) {
     KatalogDO result = (KatalogDO) produktListe.get(0);
     logger.info("Katalog gefunden, Bez: " + result.getBezeichnung() + " ID: " + result.getId() + " Liste Produkte");
     if (result.getKatalogProduktList() != null && result.getKatalogProduktList().size() > 0) {
     for (KatalogProduktDO produkt : result.getKatalogProduktList()) {
     if (produkt instanceof ProduktDO) {
     ProduktDO p = (ProduktDO) produkt;
     logger.info("Produkt: " + p.getArtikelCode() + ", " + p.getBezeichnung() + ", brutto: " + p.getBruttoPreis());
     } else {
     logger.info("-------- Katalog : " + produkt.getBezeichnung());
     }
     }
     } else {
     logger.info("Fehler: Produktliste ist leer");
     }
     } else {
     logger.info("Katalog nicht gefunden: " + taopix_kat.getBezeichnung());
     }
     * */

    logger.info("------------------------ VERSAND Artikel erzeugen/Prüfen -------------------------");

    KatalogDO versand_kat = new KatalogDO();
    versand_kat.setBezeichnung(txconfig.getVersandKatalogName());
//    versand_kat = (KatalogDO) helper.katalogEintrag(pDao, entityManager, versand_kat);

    ProduktDO versandStdArtikel = txconfig.getVersandArtikel();
    versandStdArtikel.setSteuer(steuer);
    versandStdArtikel.setParent(versand_kat);
    versandStdArtikel.setNettoPreis(new GeldDO(new BigDecimal("0"), eur));
//    versandStdArtikel = (ProduktDO) helper.katalogEintrag(pDao, entityManager, versandStdArtikel);

    logger.info("Standart Versand-Artikel: " + versandStdArtikel.getArtikelCode() + ", " + versandStdArtikel.getBezeichnung() + ", Steuersatz: " + versandStdArtikel.getSteuer().getSteuersatz());
    txconfig.setVersandArtikel(versandStdArtikel);

    ProduktDO versandReduziertArtikel = txconfig.getVersandArtikelReduzierteSteuer();
    versandReduziertArtikel.setSteuer(erm_steuer);
    versandReduziertArtikel.setParent(versand_kat);
    versandReduziertArtikel.setNettoPreis(new GeldDO(new BigDecimal("0"), eur));
//    versandReduziertArtikel = (ProduktDO) helper.katalogEintrag(pDao, entityManager, versandReduziertArtikel);
    txconfig.setVersandArtikelReduzierteSteuer(versandReduziertArtikel);

    logger.info("Reduzierter Versand-Artikel: " + versandReduziertArtikel.getArtikelCode() + ", " + versandReduziertArtikel.getBezeichnung() + ", Steuersatz: " + versandReduziertArtikel.getSteuer().getSteuersatz());


    logger.info("------------------------ Produkte ENDE -------------------------");


    logger.info("------------------------ Zahlungsbedingungen erzeugen/prüfen -------------------------");
//    ZahlungsBedingungDAO zDao = new ZahlungsBedingungDAO();

    BarzahlungDO bar = (BarzahlungDO) txconfig.getBarzahlung();
//    bar = (BarzahlungDO) helper.zahlungsBedingungEintrag(zDao, entityManager, bar);
    txconfig.setBarzahlung(bar);

    PaymentServiceZahlungsArtDO paypal = (PaymentServiceZahlungsArtDO) txconfig.getPayPalzahlung();
//    paypal = (PaymentServiceZahlungsArtDO) helper.zahlungsBedingungEintrag(zDao, entityManager, paypal);
    txconfig.setPayPalzahlung(paypal);


    NettoZahlungsBedingungDO nettozahlung = (NettoZahlungsBedingungDO) txconfig.getNettozahlung();
//    nettozahlung = (NettoZahlungsBedingungDO) helper.zahlungsBedingungEintrag(zDao, entityManager, nettozahlung);
    txconfig.setNettozahlung(nettozahlung);

    logger.info("------------------------ Zahlungsbedingungen ENDE -------------------------");

    logger.info("------------------------ Versandarten erzeugen/prüfen -------------------------");

//    VersandArtDAO vDao = new VersandArtDAO();

    AbholungDO abholung = (AbholungDO) txconfig.getArtAbholung();
//    abholung = (AbholungDO) helper.versandArtEintrag(vDao, entityManager, abholung);
    txconfig.setArtAbholung(abholung);

    VersandDO versand = (VersandDO) txconfig.getArtVersand();
//    versand = (VersandDO) helper.versandArtEintrag(vDao, entityManager, versand);
    txconfig.setArtVersand(versand);

    VersandDO express = (VersandDO) txconfig.getArtExpressVersand();
//    express = (VersandDO) helper.versandArtEintrag(vDao, entityManager, express);
    txconfig.setArtExpressVersand(express);

  }

  /**
   * @see com.tomagency.cyberlab.server.imports.TaopixFtpBackgroundScanner#getCyberlabConfigProvider()
   */
  public CyberlabConfigProvider getCyberlabConfigProvider() {
    return cyberlabConfigProvider;
  }

  /**
   * @see
   * com.tomagency.cyberlab.server.imports.TaopixFtpBackgroundScanner#setCyberlabConfigProvider(com.tomagency.cyberlab.server.config.CyberlabConfigProvider)
   */
  public void setCyberlabConfigProvider(
          CyberlabConfigProvider cyberlabConfigProvider) {
    this.cyberlabConfigProvider = cyberlabConfigProvider;

  }
}
