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
 * Test for ImportProcessingChain.
 *
 * @author gfr
 */
public class ImportProcessingChainTest {

  private TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
  private ImportProcessingChain testee;

  public ImportProcessingChainTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    testee = new ImportProcessingChain(config);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of processOrder method, of class ImportProcessingChain.
   */
  @Test
  public void testProcessOrder() throws Exception {
    System.out.println("processOrder");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005476.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("Positionsliste == null", instance.getOrder().getPositionsListe());
    assertFalse("Positionsliste leer", instance.getOrder().getPositionsListe().isEmpty());

    TaopixImportProcessingObject pobj = new TaopixImportProcessingObject();
    pobj.setTaopixOrder(instance.getOrder());

    //Order
    System.out.println("Start processOrder Nummer=" + instance.getOrder().getNummer());
    testee.processOrder(pobj);
    System.out.println("End process Order\n " + pobj.getMessages());


  }
}