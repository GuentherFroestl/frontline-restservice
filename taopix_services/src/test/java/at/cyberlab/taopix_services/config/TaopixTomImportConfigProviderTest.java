/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gfr
 */
public class TaopixTomImportConfigProviderTest {

  public static final String CONFIG_FILE_PREFIX = "taopix_import_config_test";
  public static final String CONFIG_FILE_SUFFIX = ".xml";
  public static final String CONFIG_FILE_NAME = CONFIG_FILE_PREFIX + CONFIG_FILE_SUFFIX;

  public TaopixTomImportConfigProviderTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of createDefaultTaopixTomImportConfig method, of class TaopixTomImportConfigProvider.
   */
  @Test
  public void createDefaultTaopixTomImportConfigTest() throws Exception {
    System.out.println("createDefaultTaopixTomImportConfig");
    TaopixTomImportConfig result = TaopixTomImportConfigProvider.createDefaultTaopixTomImportConfig(CONFIG_FILE_PREFIX, CONFIG_FILE_SUFFIX);
    assertNotNull("Kein TaopixTomImportConfig erzeugt", result);
    assertNotNull("Kein configFilePath erzeugt", result.getConfigFilePath());
    System.out.println("configFilePath=" + result.getConfigFilePath());
  }
  
  /**
   * Test of getTaopixTomImportConfig method, of class TaopixTomImportConfigProvider.
   */
  @Test
  public void getTaopixTomImportConfigTest() throws Exception {
    System.out.println("getTaopixTomImportConfigTest");
    TaopixTomImportConfig result = TaopixTomImportConfigProvider.getTaopixTomImportConfig("config/"+CONFIG_FILE_NAME);
    assertNotNull("Kein TaopixTomImportConfig erzeugt", result);
    assertNotNull("Kein configFilePath erzeugt", result.getConfigFilePath());
    System.out.println("configFilePath=" + result.getConfigFilePath());
  }
}