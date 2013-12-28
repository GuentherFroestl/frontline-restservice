/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.imports.ImportException;
import de.gammadata.tom.util.printing.IPrintingUtil;
import de.gammadata.tom.util.printing.PrintingUtil;
import java.io.FileInputStream;
import javax.print.Doc;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import org.apache.log4j.Logger;

/**
 * Utility to print a PostScriptFile being set previously in the processing object.
 *
 * @author gfr
 */
public class PdfPrintProcessor implements ITaopixOrderImportProcessor {

  private static Logger LOG = Logger.getLogger(PdfPrintProcessor.class);
  private final TaopixTomImportConfig config;
  private IPrintingUtil printUtil;
  private String selectedPrinterName;

  /**
   * Constructor with config.
   *
   * @param config TaopixTomImportConfig
   */
  public PdfPrintProcessor(TaopixTomImportConfig config) {
    this.config = config;
  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {
    if (processingObject != null && processingObject.getPdfOrderFile() != null
            && processingObject.getPdfOrderFile().exists() && processingObject.getPdfOrderFile().canRead()) {
      try {
        IPrintingUtil pUtil = initPrintService();
        FileInputStream psStream = new FileInputStream(processingObject.getPdfOrderFile());
        DocAttributeSet dSet = new HashDocAttributeSet(MediaSizeName.ISO_A4);
        Doc document = new SimpleDoc(psStream, PrintingUtil.flavor, dSet);
        pUtil.printPsDoc(document, null);
        processingObject.getMessages().append("\nOrder printed to ").append(pUtil.getselectedPrintService().getName());
      } catch (Exception ex) {
        LOG.error("Fehler beim Drucken des PDF-Files " + ex.getMessage(), ex);
        throw new ImportException("Fehler beim Drucken des PDF-Files " + ex.getMessage());
      }

    } else {
      LOG.error("PDF File does not exist or is not readable ");
    }
  }

  /**
   * Gets the PostScript A4 Printservice.
   *
   * @return PrintService
   * @throws PrintException
   */
  private IPrintingUtil initPrintService() throws PrintException {
    if (printUtil != null) {
      return printUtil;
    }
    printUtil = new PrintingUtil();
    PrintService[] psServices = printUtil.getAvailablePsA4PrintServices();

    if (psServices == null || psServices.length == 0) {
      return null;
    }
    int i = 0;
    int psNr = 0;
    if (config!=null&&config.getPsPrinterName()!=null){
      
      for(PrintService ps : psServices){
        if (ps.getName().equalsIgnoreCase(config.getPsPrinterName())){
          psNr = i;
          break;
        }
        i++;
      }
    }
    printUtil.selectPrintService(psNr);
    setSelectedPrinterName(printUtil.getselectedPrintService().getName());
    return printUtil;
  }

  public String getSelectedPrinterName() {
    return selectedPrinterName;
  }

  public void setSelectedPrinterName(String selectedPrinterName) {
    this.selectedPrinterName = selectedPrinterName;
  }
  
  
}
