/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.LandDTO;
import java.io.File;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gfr
 */
public class TaopixToTomXmlParserTest {
  
  public TaopixToTomXmlParserTest() {
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
   * Test of parse method, of class TaopixToTomXmlParser.
   */
  @Ignore
  @Test
  public void testParse_File() throws Exception {
    System.out.println("parse");
    File xmlFile = null;
    TaopixToTomXmlParser instance = null;
    instance.parse(xmlFile);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser.
   */
  @Test
  public void testParse_InputStream() throws Exception {
    System.out.println("parse");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005272.xml");
    TaopixToTomObjectMapperImpl mapper = new TaopixToTomObjectMapperImpl();
    LandDTO land = new LandDTO();
    land.setiSO3166Code_2("AT");
    land.setiSO3166Code_3("AUT");
    land.setLandName("Austria");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(mapper);
    instance.parse(xmlStream);
    AddressDTO orderAdr=instance.getOrderAddress();
    System.out.println(orderAdr);
    Assert.assertNotNull("orderAdr == null", orderAdr.toString());
  }
}