/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegPositionDTO;
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


    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();
    
    AddressDTO address = instance.getOrderAddress();
    System.out.println("Orderaddress= " + address);
    Assert.assertNotNull("orderAdr == null", address.toString());
    Assert.assertEquals("name does not match 'Ott'", "Ott", address.getName());
    Assert.assertEquals("vorname does not match 'Katrin'", "Katrin", address.getVorname());
    Assert.assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", address.getEmail());
    Assert.assertEquals("plz does not match '2345'", "2345", address.getPlz());
    Assert.assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", address.getStadt());
    Assert.assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", address.getStrasse());
    Assert.assertEquals("mobilTelefon does not match '069912273745'", "069912273745", address.getMobilTelefon());
    Assert.assertNotNull("land == null", address.getLand());
    Assert.assertEquals("land.landName does not match 'Austria'", "Austria", address.getLand().getLandName());
    Assert.assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", address.getLand().getiSO3166Code_2());

    AddressDTO shipaddress  = instance.getShippingAddress();
    System.out.println("Shippingaddress=" + shipaddress);
    Assert.assertNotNull("orderAdr == null", shipaddress.toString());
    Assert.assertEquals("name does not match 'Ott'", "Ott", shipaddress.getName());
    Assert.assertEquals("vorname does not match 'Katrin'", "Katrin", shipaddress.getVorname());
    Assert.assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", shipaddress.getEmail());
    Assert.assertEquals("plz does not match '2345'", "2345", shipaddress.getPlz());
    Assert.assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", shipaddress.getStadt());
    Assert.assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", shipaddress.getStrasse());
    Assert.assertEquals("mobilTelefon does not match '069912273745'", "069912273745", shipaddress.getMobilTelefon());
    Assert.assertNotNull("land == null", shipaddress.getLand());
    Assert.assertEquals("land.landName does not match 'Austria'", "Austria", shipaddress.getLand().getLandName());
    Assert.assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", shipaddress.getLand().getiSO3166Code_2());
    
    Assert.assertTrue("Order and shipping addresse don't match",address.equals(shipaddress));

    BelegPositionDTO pos = instance.getPosition();
    System.out.println("BelegPosition=" + pos);
    
    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());
    System.out.println("TaopixOrder=" + instance.getOrder());

    

    InputStream xmlStream2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance2 = new TaopixToTomXmlParser();
    instance2.parse(xmlStream2);
    xmlStream2.close();
    
    Assert.assertFalse("Order and shipping addresse shouldn't match",instance2.getOrderAddress().equals(instance2.getShippingAddress()));

    BelegPositionDTO pos2 = instance2.getPosition();
    System.out.println("BelegPosition=" + pos2);
    
    






  }
}