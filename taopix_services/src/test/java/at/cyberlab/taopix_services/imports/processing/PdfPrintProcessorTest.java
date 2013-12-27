/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import java.io.File;
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
public class PdfPrintProcessorTest {
  
  public PdfPrintProcessorTest() {
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
   * Test of processOrder method, of class PdfPrintProcessor.
   */
  @Test
  public void testProcessOrder() throws Exception {
    System.out.println("processOrder with PdfPrintProcessor");
    java.net.URL url = Thread.currentThread().getContextClassLoader().getResource("pdf/test.pdf");
    System.out.println("Using pdf-file=" + url);
    File pdfFile = new File(url.toURI());
    assertNotNull("PDFFile == null", pdfFile);
    assertTrue("PdfFile kann nicht gelesen werden "+pdfFile.getAbsolutePath(), pdfFile.exists()&&pdfFile.canRead());
    TaopixImportProcessingObject processingObject = new TaopixImportProcessingObject();
    processingObject.setPdfOrderFile(pdfFile);
    PdfPrintProcessor instance = new PdfPrintProcessor(new TaopixTomImportConfigImpl());
    instance.processOrder(processingObject);
    assertNotNull("SelectedPrinterName == null", instance.getSelectedPrinterName());
    System.out.println("using Printer Name="+instance.getSelectedPrinterName());
    System.out.println("processOrder end ----------");
  }
}