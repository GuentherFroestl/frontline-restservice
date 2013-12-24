/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import at.cyberlab.taopix_services.imports.TaopixToTomXmlParser;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import org.apache.log4j.Logger;
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
public class PdfGenerateAndPrintProcessorTest {

  private static Logger LOG = Logger.getLogger(PdfGenerateAndPrintProcessorTest.class);
  private CyberlabConfigProviderImpl provider = new CyberlabConfigProviderImpl();
  private TaopixTomImportConfig config = new TaopixTomImportConfigImpl();
  private PdfGenerateProcessor testee;

  public PdfGenerateAndPrintProcessorTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    DataBaseSpec dbSpec = provider.getDataBaseSpec();
    config.setDataBaseSpec(dbSpec);
    testee = new PdfGenerateProcessor(config);

  }

  @After
  public void tearDown() {
  }

  /**
   * Test of processOrder method, of class PdfGenerateProcessor.
   */
  @Test
  public void testProcessOrder() throws Exception {
    System.out.println("Start processOrder");
    java.net.URL url = Thread.currentThread().getContextClassLoader().getResource("xsl/cyberlab_taopix_AB_pdf.xsl");
    System.out.println("Using xsl-file=" + url);
    File xslFile = new File(url.toURI());
    testee.setXsl(xslFile);
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("Positionsliste == null", instance.getOrder().getPositionsListe());
    assertEquals("Positionsliste != 3", 3, instance.getOrder().getPositionsListe().size());
    TaopixImportProcessingObject processionObj = new TaopixImportProcessingObject();
    processionObj.setTaopixOrder(instance.getOrder());
    testee.processOrder(processionObj);
    File pdfFile = processionObj.getPdfOrderFile();
    assertNotNull("PDFFile == null", pdfFile);
    assertTrue("PdfFile kann nicht gelesen werden " + pdfFile.getAbsolutePath(), pdfFile.exists() && pdfFile.canRead());
    assertTrue("PdfFile hat nicht die richtige Größe " + pdfFile.getAbsolutePath(), pdfFile.length() > 1000L);
    //Print the order
    PdfPrintProcessor printInstance = new PdfPrintProcessor(new TaopixTomImportConfigImpl());
    printInstance.processOrder(processionObj);
    System.out.println("End processOrder, tests successful");
    System.out.println(processionObj.getMessages());
  }
}