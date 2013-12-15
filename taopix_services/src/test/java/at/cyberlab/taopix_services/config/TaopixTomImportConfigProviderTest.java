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
   * Test of getTaopixTomImportConfig method, of class TaopixTomImportConfigProvider.
   */
  @Test
  public void testGetTaopixTomImportConfig() throws Exception {
    System.out.println("getTaopixTomImportConfig");
    String filePath = null;
    TaopixTomImportConfig result = TaopixTomImportConfigProvider.getTaopixTomImportConfig(filePath);
    assertNotNull("Kein TaopixTomImportConfig erzeugt", result);
    System.out.println("result="+result);
  }
}