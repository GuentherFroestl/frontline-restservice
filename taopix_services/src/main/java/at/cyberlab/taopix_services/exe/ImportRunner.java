/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.exe;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import at.cyberlab.taopix_services.imports.TaopixToTomXmlParser;
import at.cyberlab.taopix_services.imports.processing.ITaopixOrderImportProcessor;
import at.cyberlab.taopix_services.imports.processing.ImportProcessingChain;
import at.cyberlab.taopix_services.imports.processing.TaopixImportProcessingObject;
import de.gammadata.tom.util.xml.ISerializer;
import de.gammadata.tom.util.xml.XstreamSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 * Runs the import for taopix xml files to tom 4D DB
 *
 * @author gfr
 */
public class ImportRunner {

//  private TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
//  private ITaopixOrderImportProcessor processor;
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("Bitte Server IP und Filepfad als Argument angegeben");
      System.exit(1);
    }
    File xmlFile = new File(args[1]);
    if (!xmlFile.canRead()) {
      System.out.println("Kann das File unter dem angegeben Pfad nich lesen=" + args[1]);
    }
    // Now we start off

    try {
      InputStream xmlStream = new FileInputStream(xmlFile);
      TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
      instance.parse(xmlStream);
      xmlStream.close();

      if (instance.getOrder() == null) {
        System.out.println("Der Auftrag ist leer " + args[1]);
        System.exit(1);
      }
      if (instance.getOrder().getPositionsListe() == null || instance.getOrder().getPositionsListe().isEmpty()) {
        System.out.println("Der Auftrag hat keine Positionen " + args[1]);
        System.exit(1);
      }

      System.out.println("Auftrag erkannt " + args[1]);
      //now the processing
      TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
      config.getDataBaseSpec().setServerAddress(args[0]); //192.168.9.84  194.232.93.195
      ITaopixOrderImportProcessor processor = new ImportProcessingChain(config);

      TaopixImportProcessingObject pobj = new TaopixImportProcessingObject();
      pobj.setTaopixOrder(instance.getOrder());

      //Order
      System.out.println("Starte Verarbeitung des Auftrags Nummer=" + instance.getOrder().getNummer());
      processor.processOrder(pobj);
      System.out.println("Ende des Auftrags Imports\n " + pobj.getMessages());

    } catch (Exception ex) {
      Logger.getLogger(ImportRunner.class.getName()).log(Level.SEVERE, "Ein Fehler ist bei der Verarbeitung aufgetreten:" + ex.getMessage(), ex);
    }
  }
  

}
