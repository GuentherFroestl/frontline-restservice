package at.cyberlab.taopix_services.exe;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigProvider;
import at.cyberlab.taopix_services.imports.processing.FtpFilesFetcherImpl;
import at.cyberlab.taopix_services.imports.processing.IFtpFilesFetcher;
import at.cyberlab.taopix_services.imports.processing.ImportException;
import at.cyberlab.taopix_services.imports.processing.TaopixToTomXmlParser;
import at.cyberlab.taopix_services.imports.processing.ITaopixOrderImportProcessor;
import at.cyberlab.taopix_services.imports.processing.ImportProcessingChain;
import at.cyberlab.taopix_services.imports.processing.TaopixImportProcessingObject;
import de.gammadata.tom.util.printing.IPrintingUtil;
import de.gammadata.tom.util.printing.PrintingUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintException;
import javax.print.PrintService;

/**
 * Runs the import for taopix xml files to tom 4D DB
 *
 * @author gfr
 */
public class ImportRunner {

  public static final String CONFIG_FILE_PREFIX = "taopix_import_config";
  public static final String CONFIG_FILE_SUFFIX = ".xml";
  public static final String CONFIG_FILE_NAME = CONFIG_FILE_PREFIX + CONFIG_FILE_SUFFIX;

  /**
   * @param args the command line arguments
   * @throws java.io.IOException
   */
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Bitte Auftragsnummer als Argument angegeben");
      System.exit(1);
    }
    String configFileName = CONFIG_FILE_NAME;
    String orderFileName = null;
    if (args[0].equalsIgnoreCase("-c")) {
      configFileName = args[1];
      orderFileName = args[2];

    } else if (args[0].equalsIgnoreCase("-p")) {
      listPrintServices();
      System.exit(0);
    } else if (args[0].equalsIgnoreCase("-f")) {
      checkFileDirectory(configFileName);
      System.exit(0);
    } else {
      orderFileName = args[0];
    }

    checkConfigFile(configFileName);

    TaopixTomImportConfig importConfig = null;
    try {
      importConfig = TaopixTomImportConfigProvider.getTaopixTomImportConfig(configFileName);

    } catch (Exception ex) {
      System.out.println("Fehler beim Lesen der Konfiguration " + configFileName + " " + ex.getMessage());
    }

    if (importConfig == null) {
      createDefaultConfigFile();
      System.exit(1);
    }

    if (orderFileName == null) {
      System.out.println("Bitte richtigen Pfad zum xml File angeben");
      System.exit(1);
    }

    //Set file pathes, exit may occur in methodes, if pathes are not correct
    setXslFilePath(importConfig);
    setFopConfigFilePath(importConfig);

    // Now we start off
    InputStream xmlStream = null;
    try {
      File xmlFile = new File(orderFileName);
      if (!xmlFile.exists()) {
        System.out.println("File existiert nicht " + orderFileName + " Pfad=" + xmlFile.getAbsolutePath());
        System.exit(1);
      }
      xmlStream = new FileInputStream(xmlFile);

      TaopixToTomXmlParser instance = new TaopixToTomXmlParser(importConfig);
      instance.parse(xmlStream);

      if (instance.getOrder() == null) {
        System.out.println("Der Auftrag ist leer " + orderFileName);
        System.exit(1);
      }
      if (instance.getOrder().getPositionsListe() == null || instance.getOrder().getPositionsListe().isEmpty()) {
        System.out.println("Der Auftrag hat keine Positionen " + orderFileName);
        System.exit(1);
      }

      System.out.println("Auftrag erkannt " + orderFileName);
      ITaopixOrderImportProcessor processor = new ImportProcessingChain(importConfig);

      TaopixImportProcessingObject pobj = new TaopixImportProcessingObject();
      pobj.setTaopixOrder(instance.getOrder());

      //Order
      System.out.println("Starte Verarbeitung des Auftrags Nummer=" + instance.getOrder().getNummer());
      processor.processOrder(pobj);
      System.out.println("Ende des Auftrags Imports\n " + pobj.getMessages());

    } catch (Exception ex) {
      Logger.getLogger(ImportRunner.class.getName()).log(Level.SEVERE, "Ein Fehler ist bei der Verarbeitung aufgetreten:" + ex.getMessage(), ex);
    } finally {
      if (xmlStream != null) {
        xmlStream.close();
      }
    }
  }

  private static void fetchFileFromFTP(String xmlFileName, File xmlFile, TaopixTomImportConfig importConfig) throws ImportException {
    IFtpFilesFetcher ftpInstance = new FtpFilesFetcherImpl();

    System.out.println("Hole file vom FTP-Server " + xmlFileName);
    boolean result = ftpInstance.fetchFtpFile(importConfig.getFtpServerConfig(), xmlFileName, xmlFile);
    if (!result) {
      System.out.println("Fehler beim Holen des FTP Files " + xmlFileName + ", nach Pfad=" + xmlFile.getAbsolutePath());
      System.exit(1);

    }
  }

  private static void checkConfigFile(String path) {

    try {
      System.out.println("Verwende Konfig-Datei =" + path);
      File configFile = new File(path);
      if (configFile.exists() && configFile.canRead()) {
        System.out.println("Konfig-Datei ist lesbar " + configFile.getAbsolutePath());
        return;
      } else {
        System.out.println("Konfig-Datei ist nicht lesbar " + configFile.getAbsolutePath());
        createDefaultConfigFile();
        System.exit(1);
      }
    } catch (Exception ex) {
      System.out.println("Konfig-Datei kann nicht gelesen werden " + path + ", Fehler=" + ex.getMessage());
      System.exit(1);
    }
    createDefaultConfigFile();
    System.exit(1);
  }

  private static void createDefaultConfigFile() {
    try {
      TaopixTomImportConfig conf = TaopixTomImportConfigProvider.createDefaultTaopixTomImportConfig(CONFIG_FILE_PREFIX, CONFIG_FILE_SUFFIX);
      System.out.println("Default Konfigurationsfile erzeugt Pfad=" + conf.getConfigFilePath());
      System.out.println("Konfigfile überprüfen und in config Verzeichnis unter folgendem Namen ablegen=" + CONFIG_FILE_PREFIX + CONFIG_FILE_SUFFIX);
    } catch (IOException ex) {
      System.out.println("Fehler beim Erzeugen der DefaultKonfiguration " + CONFIG_FILE_PREFIX + CONFIG_FILE_SUFFIX + " " + ex.getMessage());
    }

  }

  private static void setXslFilePath(TaopixTomImportConfig importConfig) {
    try {

      File xslFile = new File(importConfig.getXslFileName());
      if (xslFile.exists() && xslFile.canRead()) {
        importConfig.setXslFilePath(xslFile.getAbsolutePath());
        System.out.println("Using xsl-file=" + xslFile.getAbsolutePath());
        return;
      }
    } catch (Exception ex) {
      System.out.println("Fehler xsl-file nicht gefunden " + importConfig.getXslFileName() + " Fehler=" + ex.getMessage());
    }
    System.out.println("Fehler xsl-file nicht gefunden " + importConfig.getXslFileName());
    System.exit(1);
  }

  private static void setFopConfigFilePath(TaopixTomImportConfig importConfig) {
    try {
      java.net.URL url = Thread.currentThread().getContextClassLoader().getResource(importConfig.getFopConfigFile());
      if (url == null) {
        throw new RuntimeException("fop config File nicht vorhanden: " + importConfig.getXslFileName());
      }
      File fopConfigFile = new File(importConfig.getFopConfigFile());
      if (fopConfigFile.exists() && fopConfigFile.canRead()) {
        importConfig.setFopConfigFilePath(fopConfigFile.getAbsolutePath());
        System.out.println("Using fop configfile=" + fopConfigFile.getAbsolutePath());
        return;
      }
    } catch (Exception ex) {
      System.out.println("Fehler fop configfile nicht gefunden " + importConfig.getFopConfigFile() + " Fehler=" + ex.getMessage());
    }
    System.out.println("Fehler fop configfile  nicht gefunden " + importConfig.getFopConfigFile());
    System.exit(1);
  }

  private static String checkFileDirectory(String configFileName) {
    checkConfigFile(configFileName);

    TaopixTomImportConfig importConfig = null;
    try {
      importConfig = TaopixTomImportConfigProvider.getTaopixTomImportConfig(configFileName);
      String dirPath = importConfig.getFilesDirectoryName();
      File dir = new File(dirPath);
      if (dir.canWrite()) {
        System.out.println("Files-Dir kann geschrieben werden path=" + dir.getAbsolutePath());
        return dir.getAbsolutePath();
      } else {
        System.out.println("Fehler: Files-Dir kann nicht geschrieben werden path=" + dir.getAbsolutePath());
        System.exit(1);
      }

    } catch (Exception ex) {
      System.out.println("Fehler beim Lesen der Konfiguration " + configFileName + " " + ex.getMessage());
      System.exit(1);
    }
    return null;
  }

  private static void listPrintServices() {
    try {
      IPrintingUtil pu = new PrintingUtil();
      PrintService[] result = pu.getAvailablePsA4PrintServices();
      if (result != null) {
        for (PrintService ps : result) {
          System.out.println("PrintService A4= " + ps.getName());
        }
      } else {
        System.out.println("Fehler keine PS Drucker gefunden");
      }
    } catch (PrintException ex) {
      System.out.println("Fehler beim Holen der Drucker Services " + ex.getMessage());
    }
  }
}
