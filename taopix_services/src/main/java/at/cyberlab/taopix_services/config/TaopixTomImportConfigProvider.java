/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import com.tom.service.facade.TomException;
import de.gammadata.tom.util.xml.ISerializer;
import de.gammadata.tom.util.xml.XstreamSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
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
   * @return TaopixTomImportConfig or nul if it does not exist on the classpath
   */
  public static TaopixTomImportConfig getTaopixTomImportConfig(String fileName) throws FileNotFoundException, IOException, URISyntaxException, TomException {
    TaopixTomImportConfig config=null;
    ISerializer serializer = new XstreamSerializer();
    File configFile = new File(fileName);
    if (configFile.exists()&&configFile.canRead()) {
      FileInputStream fi = new FileInputStream(configFile);
      String xml = IOUtils.toString(fi,"UTF-8");
      config = (TaopixTomImportConfig) serializer.deserializeFromXml(xml);
      config.setConfigFilePath(configFile.getAbsolutePath());
    }else{
      throw new TomException("config file nicht gefunden "+configFile.getAbsolutePath());
    }
    return config;
  }
  
  /**
   * Creates a default configuration file and returns the config object.
   * @return File
   * @throws IOException 
   */
  public static TaopixTomImportConfig createDefaultTaopixTomImportConfig(String filePreFix, String fileSuffix) throws IOException {

        File configFile = File.createTempFile(filePreFix, fileSuffix);
        FileOutputStream out = new FileOutputStream(configFile);
        TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
        ISerializer serializer = new XstreamSerializer();
        String xmlOut = serializer.serializeToXml(config);
        IOUtils.write(xmlOut, out,"UTF-8");
        out.close(); 
        config.setConfigFilePath(configFile.getAbsolutePath());
    return config;
  }
}
