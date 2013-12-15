/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.util.xml;

import de.gammadata.tom.util.printing.IPrintingUtil;
import de.gammadata.tom.util.printing.PrintingUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.print.Doc;
import javax.print.PrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.event.PrintJobEvent;
import javax.print.event.PrintJobListener;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gfr
 */
public class XsltUtilTest {
  
  XsltUtil instance = new XsltUtil();
  
  public XsltUtilTest() {
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
   * Test of transform method, of class XsltUtil.
   */
  @Ignore
  @Test
  public void testTransform_3args_1() throws Exception {
    System.out.println("transform");
    Source xml = null;
    StreamSource xsl = null;
    StreamResult result_2 = null;
    instance = new XsltUtil();
    instance.transform(xml, xsl, result_2);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of transform method, of class XsltUtil.
   */
  @Ignore
  @Test
  public void testTransform_3args_2() throws Exception {
    System.out.println("transform");
    File xmlFile = null;
    File xslFile = null;
    File resultFile = null;
    instance = new XsltUtil();
    instance.transform(xmlFile, xslFile, resultFile);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of transform method, of class XsltUtil.
   */
  @Ignore
  @Test
  public void testTransform_Object_InputStream() throws Exception {
    System.out.println("transform");
    Object obj = null;
    InputStream xslFileStream = null;
    instance = new XsltUtil();
    String expResult = "";
    String result = instance.transform(obj, xslFileStream);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of transformWithFOP method, of class XsltUtil.
   */
  @Ignore
  @Test
  public void testTransformWithFOP_3args_1() throws Exception {
    System.out.println("transformWithFOP");
    Object obj = null;
    InputStream xslFileStream = null;
    OutputStream result_2 = null;
    instance = new XsltUtil();
    instance.transformWithFOP(obj, xslFileStream, result_2);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of transformWithFOP method, of class XsltUtil.
   */  
  @Test
  public void testTransformWithFOPwithStreams() throws Exception {
    System.out.println("transformWithFOP");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("xml/auftrag.xml");
    assertNotNull("xml/auftrag.xml konnte nicht geöffnert werden", xmlStream);
    Source xml = new StreamSource(xmlStream);
    InputStream xslStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("xsl/cyberlab_beleg_pdf.xsl");
    assertNotNull("xsl/cyberlab_beleg_pdf.xml konnte nicht geöffnert werden", xslStream);
    StreamSource xsl = new StreamSource(xslStream);
    File out = File.createTempFile("test", ".pdf");
    assertNotNull("test.pdf konnte nicht erzeugt werden", out);
    assertTrue("test.pdf kann nicht geschrieben werden "+out.getAbsolutePath(), out.canWrite());
    OutputStream result = new FileOutputStream(out);
    assertNotNull("test.pdf konnte nicht erzeugt werden", xslStream);
    instance = new XsltUtil();
    instance.transformWithFOP(xml, xsl, result);
    result.close();
    System.out.println("transformWithFOP erfolgreich PDf-Datei="+out.getAbsolutePath());
    Doc document = new SimpleDoc(result, IPrintingUtil.flavorPs, null);
  }
  
    /**
   * Test of transformWithFOP method, of class XsltUtil.
   */  
  @Test
  public void testTransformWithFOPwithPrinting() throws Exception {
    System.out.println("transformWithFOP");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("xml/auftrag.xml");
    assertNotNull("xml/auftrag.xml konnte nicht geöffnert werden", xmlStream);
    Source xml = new StreamSource(xmlStream);
    InputStream xslStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("xsl/cyberlab_beleg_pdf.xsl");
    assertNotNull("xsl/cyberlab_beleg_pdf.xml konnte nicht geöffnert werden", xslStream);
    StreamSource xsl = new StreamSource(xslStream);

    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    assertNotNull("test.pdf konnte nicht erzeugt werden", xslStream);
    instance = new XsltUtil();
    instance.transformWithFOP(xml, xsl, outStream);
    System.out.println("transformWithFOP erfolgreich PDf-Datei="+"\n"+outStream.toString());
    ByteArrayInputStream pdf = new ByteArrayInputStream(outStream.toByteArray());
    Doc document = new SimpleDoc(pdf, IPrintingUtil.flavorPs, null);

    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
    aset.add(MediaSizeName.ISO_A4);
    PrintingUtil printUtil = new PrintingUtil();

    PrintService[] printers = printUtil.getAvailablePsPrintServices(aset);
    assertNotNull("Fehler keine PD Drucker gefunden", printers);
    assertFalse("Fehler PD Drucker 0  nicht vorhanden", printers.length == 0);
    printUtil.selectPrintService(0);
    assertNotNull("Fehler Printservice selected", printUtil.getselectedPrintService());
        PrintJobListener listener = new PrintJobListener() {
      @Override
      public void printDataTransferCompleted(PrintJobEvent pje) {
        System.out.println("printDataTransferCompleted = " + pje.getPrintEventType());
      }

      @Override
      public void printJobCompleted(PrintJobEvent pje) {
        System.out.println("printJobCompleted = " + pje.getPrintEventType());
      }

      @Override
      public void printJobFailed(PrintJobEvent pje) {
        System.out.println("printJobFailed = " + pje.getPrintEventType());
      }

      @Override
      public void printJobCanceled(PrintJobEvent pje) {
        System.out.println("printJobCanceled = " + pje.getPrintEventType());
      }

      @Override
      public void printJobNoMoreEvents(PrintJobEvent pje) {
        System.out.println("printJobNoMoreEvents = " + pje.getPrintEventType());
      }

      @Override
      public void printJobRequiresAttention(PrintJobEvent pje) {
        System.out.println("printJobRequiresAttention = " + pje.getPrintEventType());
      }
    };
    System.out.println("Print docoument to " + printUtil.getselectedPrintService());
    printUtil.printPsDoc(document, listener);
    Thread.sleep(10000);

  }

  /**
   * Test of transformWithFOP method, of class XsltUtil.
   */
  @Ignore
  @Test
  public void testTransformWithFOP_3args_3() throws Exception {
    System.out.println("transformWithFOP");
    File xmlFile = null;
    File xslFile = null;
    File resultFile = null;
    instance = new XsltUtil();
    instance.transformWithFOP(xmlFile, xslFile, resultFile);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}