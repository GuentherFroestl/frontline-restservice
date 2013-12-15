/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import de.gammadata.tom.util.xml.ISerializer;
import de.gammadata.tom.util.xml.XstreamSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

/**
 * Provider for the configuration.
 *
 * @author gfr
 */
public class TaopixTomImportConfigProvider {

  /**
   * Die config wird geholt / erzeugt.
   *
   * @param filePath String mit Pfad, wenn null wird default Wert verwendet
   * @return TaopixTomImportConfig.
   */
  public static TaopixTomImportConfig getTaopixTomImportConfig(String filePath) throws FileNotFoundException, IOException {
    TaopixTomImportConfig config;
    ISerializer serializer = new XstreamSerializer();
    boolean wasRead = false;
    String path = filePath;
    if (path == null) {
      path = TaopixTomImportConfigImpl.CONFIG_FILE_PATH + TaopixTomImportConfigImpl.CONFIG_FILE_NAME;
    }

    File configFile = new File(path);
    if (configFile.canRead()) {
      FileInputStream fi = new FileInputStream(configFile);
      String xml = IOUtils.toString(fi);

      config = (TaopixTomImportConfig) serializer.deserializeFromXml(xml);
      wasRead = true;
    } else {
      config = new TaopixTomImportConfigImpl();
    }

    

    //Write out
    if (!wasRead) {
      File dir = new File(TaopixTomImportConfigImpl.CONFIG_FILE_PATH);
      if (dir.canWrite()) {
        FileOutputStream out = new FileOutputStream(TaopixTomImportConfigImpl.CONFIG_FILE_PATH + TaopixTomImportConfigImpl.CONFIG_FILE_NAME);
        String xmlOut = serializer.serializeToXml(config);
        IOUtils.write(xmlOut, out);
        out.close();
      }
    }

    return config;
  }
}
