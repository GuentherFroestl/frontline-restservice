/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.printing;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.event.PrintJobListener;

/**
 *
 * @author gfr
 */
public interface IPrintingUtil {

  DocFlavor flavorPs = DocFlavor.INPUT_STREAM.POSTSCRIPT;

  /**
   * Lookup for available PostScript PrinterServices.
   *
   * @param aset
   * @return
   * @throws PrintException
   */
  PrintService[] getAvailablePsPrintServices(PrintRequestAttributeSet aset) throws PrintException;

  /**
   * select a printservice out of previously retrieved via getAvailablePsPrintServices.
   *
   * @param number int
   */
  void selectPrintService(int number);

  /**
   * returns the actual selected PrintService.
   *
   * @return PrintService
   */
  PrintService getselectedPrintService();

  /**
   * Prints a Postscript document.
   *
   * @param document PS document
   * @param listener PrintJobListener
   * @throws PrintException
   */
  void printPsDoc(Doc document, PrintJobListener listener) throws PrintException;
}
