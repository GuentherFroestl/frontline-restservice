/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.util.printing;

import java.io.InputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.event.PrintJobEvent;
import javax.print.event.PrintJobListener;
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
public class PrintingUtilTest {

  public PrintingUtilTest() {
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
   * Test of getAvailablePsPrintServices method, of class PrintingUtil.
   */
  @Test
  public void testGetAvailablePsPrintServices() throws Exception {
    System.out.println("getAvailablePsPrintServices");
    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
    aset.add(MediaSizeName.ISO_A4);
    PrintingUtil instance = new PrintingUtil();

    PrintService[] result = instance.getAvailablePsPrintServices(aset);
    assertNotNull("Fehler keine PD Drucker gefunden", result);
    for (PrintService ps : result) {
      System.out.println("PrintService = " + ps.getName());
      for (DocFlavor df : ps.getSupportedDocFlavors()) {
        System.out.println("   DocFlavor = " + df);
      }
    }
  }

  /**
   * Test of printPsDoc method, of class PrintingUtil.
   */
  @Test
  public void testPrintPsDoc() throws Exception {
    System.out.println("printPsDoc");
    InputStream psStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("postscript/test.pdf");
    assertNotNull("Fehler postscript/test.pdf nicht gefunden", psStream);
    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
    aset.add(MediaSizeName.ISO_A4);
    PrintingUtil instance = new PrintingUtil();

    PrintService[] result = instance.getAvailablePsPrintServices(aset);
    assertNotNull("Fehler keine PD Drucker gefunden", result);
    assertFalse("Fehler PD Drucker 0  nicht vorhanden", result.length == 0);
    instance.selectPrintService(0);
    assertNotNull("Fehler Printservice selected", instance.getselectedPrintService());
    Doc document = new SimpleDoc(psStream, IPrintingUtil.flavorPs, null);
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
    System.out.println("Print docoument to " + instance.getselectedPrintService());
    instance.printPsDoc(document, listener);
    Thread.sleep(10000);
  }
}