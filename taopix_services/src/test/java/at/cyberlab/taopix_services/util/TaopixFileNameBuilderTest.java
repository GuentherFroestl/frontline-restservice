/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.util;

import at.cyberlab.taopix_services.imports.ImportException;
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
public class TaopixFileNameBuilderTest {
  
  public TaopixFileNameBuilderTest() {
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
   * Test of build method, of class TaopixFileNameBuilder.
   */
  @Test
  public void testBuild() throws Exception {
    System.out.println("testBuild");
    String orderNumber = "006000";
    String expResult = "0006000.xml";
    String result = TaopixFileNameBuilder.build(orderNumber);
    assertEquals("Fehler Filename stimmt nicht",expResult, result);
    result = TaopixFileNameBuilder.build("6000");
    assertEquals("Fehler Filename stimmt nicht",expResult, result);
    result = TaopixFileNameBuilder.build("000006000");
    assertEquals("Fehler Filename stimmt nicht",expResult, result);
    System.out.println("testBuild ok Ergebnis="+result);
  }
  
    /**
   * Test of build method, of class TaopixFileNameBuilder.
   */
  @Test
  public void testBuildWithExecption() throws Exception {
    System.out.println("testBuildWithExecption");
    String orderNumber = "600ab";
    String result = null;
    try {
      result = TaopixFileNameBuilder.build(orderNumber);
      fail("Keine Exeption beim parsen von 600ab");
    } catch (ImportException importException) {
      //Empty
    }
    System.out.println("testBuildWithExecption ok ");
  }
}