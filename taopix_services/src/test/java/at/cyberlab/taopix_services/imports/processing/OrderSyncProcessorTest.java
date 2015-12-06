/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
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
public class OrderSyncProcessorTest {

  private TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
  private AddressSyncProcessor adrSyncPrcessor;
  private ProductSyncProcessor productSyncProcessor;
  private OrderSyncProcessor orderSyncProcessor;

  public OrderSyncProcessorTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    adrSyncPrcessor = new AddressSyncProcessor(config);
    productSyncProcessor = new ProductSyncProcessor(config);
    orderSyncProcessor = new OrderSyncProcessor(config);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of processOrder method, of class AddressSyncProcessor.
   */
  @Test
  public void testProcessOrder() throws Exception {
    System.out.println("processOrder");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lamprechter/1090649.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("Positionsliste == null", instance.getOrder().getPositionsListe());
    assertFalse("Positionsliste leer", instance.getOrder().getPositionsListe().isEmpty());
    TaopixImportProcessingObject pobj = new TaopixImportProcessingObject();

    pobj.setTaopixOrder(instance.getOrder());
    System.out.println("Order Number="+instance.getOrder().getNummer());
    //Addresses
    System.out.println("syncAdresses");
    adrSyncPrcessor.processOrder(pobj);
    System.out.println("OrderAdr=" + instance.getOrder().getAdresse());
    System.out.println("LieferAdr=" + instance.getOrder().getLieferAdresse());
    System.out.println("RechAdr=" + instance.getOrder().getRechnungsAdresse());


    //Product
    System.out.println("syncProducts");
    productSyncProcessor.processOrder(pobj);

    //Order
    System.out.println("syncOrder UUID=" + instance.getOrder().getUuid());
    orderSyncProcessor.processOrder(pobj);

    System.out.println("End processOrder\n " + pobj.getMessages());
  }
}