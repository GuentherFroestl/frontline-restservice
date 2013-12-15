/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.util.printing;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.event.PrintJobListener;

/**
 * Utility calss for prining.
 *
 * @author gfr
 */
public class PrintingUtil implements IPrintingUtil {

  PrintService[] pservices;
  PrintService service;
  DocFlavor flavor;
  PrintRequestAttributeSet printerSettings;

  @Override
  public PrintService[] getAvailablePsPrintServices(PrintRequestAttributeSet aset) throws PrintException {
    flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
    printerSettings = aset;
    pservices = PrintServiceLookup.lookupPrintServices(flavor, aset);
    return pservices;
  }

  @Override
  public void printPsDoc(Doc document, PrintJobListener listener) throws PrintException {
    if (document == null) {
      throw new PrintException("PS Document ist leer");
    }
    DocPrintJob pj = service.createPrintJob();
    if (listener != null) {
      pj.addPrintJobListener(listener);
    }
    pj.print(document, printerSettings);
  }

  @Override
  public void selectPrintService(int number) {
    service = pservices[number];
  }

  @Override
  public PrintService getselectedPrintService() {
    return service;
  }
}
