/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegPositionDTO;
import java.io.InputStream;
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
public class TaopixNeuXmlParserTest {

  TaopixTomImportConfig taopixTomConfig = new TaopixTomImportConfigImpl();

  public TaopixNeuXmlParserTest() {
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
  @Test
  public void testParseTaopixOrder() throws Exception {
    System.out.println("parse");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/taopix_neu.xml");


    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();
    assertNotNull("order == null", instance.getOrder());
    assertEquals("Mandator ID stimmt nicht ", taopixTomConfig.getMandatorId(), instance.getOrder().getMandant());
    Integer tomOrderNr = taopixTomConfig.getOrderNumberOffset()+Integer.parseInt(instance.getOrderId());
//    assertEquals("TomOrderNr stimmt nicht ", new Integer(112505272), tomOrderNr);
    System.out.println("Order= " + instance.getOrder());

    
    AddressDTO address = instance.getOrderAddress();
    System.out.println("Orderaddress= " + address);

    AddressDTO shipaddress = instance.getShippingAddress();
    System.out.println("Shippingaddress=" + shipaddress);
    
    BelegPositionDTO pos = instance.getPosition();
    System.out.println("Product=" + pos);

    BelegPositionDTO transport = instance.getTransport();
    System.out.println("transport=" + transport);

    BelegPositionDTO discount = instance.getDiscount();
    System.out.println("Discount=" + discount);


  }

}