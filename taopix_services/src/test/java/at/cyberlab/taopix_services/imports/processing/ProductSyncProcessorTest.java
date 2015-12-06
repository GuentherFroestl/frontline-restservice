/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
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
public class ProductSyncProcessorTest {

  private CyberlabConfigProviderImpl provider = new CyberlabConfigProviderImpl();
  private TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
  private DataBaseSpec dbSpec;
  private ProductSyncProcessor testee;

  public ProductSyncProcessorTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    dbSpec = provider.getDataBaseSpec();
    config.setDataBaseSpec(dbSpec);
    testee = new ProductSyncProcessor(config);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of processOrder method, of class ProductSyncProcessor.
   */
  @Test
  public void testProcessOrder() throws Exception {

    System.out.println("Start processOrder");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005476.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("Positionsliste == null", instance.getOrder().getPositionsListe());
    assertEquals("Positionsliste != 2", 2, instance.getOrder().getPositionsListe().size());
    TaopixImportProcessingObject pobj = new TaopixImportProcessingObject();
    pobj.setTaopixOrder(instance.getOrder());
    testee.processOrder(pobj);
    System.out.println("Order " + instance.getOrder());
    System.out.println("End processOrder\n " + pobj.getMessages());
  }
}