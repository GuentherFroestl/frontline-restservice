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
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author gfr
 */
@RunWith(value = Parameterized.class)
public class TaopixNeuXmlParserTest {

  TaopixTomImportConfig taopixTomConfig;
  private String inputFilePath;
  private Integer expectedOrderNumber;

  public TaopixNeuXmlParserTest(String inputFilePath, Integer expectedOrderNumber) {
    this.inputFilePath = inputFilePath;
    this.expectedOrderNumber = expectedOrderNumber;
  }

  @Parameters()
  public static Iterable<Object[]> data() {
    return Arrays.asList(new Object[][]{
      {"lamprechter/1090649.xml", 1090649},
      {"lamprechter/1091046.xml", 1091046},
      {"lamprechter/1092947.xml", 1092947},
      {"lamprechter/1093390.xml", 1093390},
      {"lamprechter/1093390.xml", 1093390},}
    );
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    taopixTomConfig = new TaopixTomImportConfigImpl();
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
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(this.inputFilePath);

    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();
    assertNotNull("order == null", instance.getOrder());
    assertEquals("Mandator ID stimmt nicht ", taopixTomConfig.getMandatorId(), instance.getOrder().getMandant());
    Integer tomOrderNr = Integer.parseInt(instance.getOrderId());
    assertEquals("TomOrderNr stimmt nicht ", expectedOrderNumber, tomOrderNr);
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
