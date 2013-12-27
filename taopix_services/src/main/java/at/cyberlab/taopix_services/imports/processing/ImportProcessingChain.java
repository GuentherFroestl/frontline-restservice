/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.imports.ImportException;
import com.tom.service.dto.BelegTyp;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.service.BelegService;
import java.util.ArrayList;
import java.util.List;

/**
 * forms a chain of ImportProcessors for importing taopix orders to Tom 4D DB.
 *
 * @author gfr
 */
public class ImportProcessingChain implements ITaopixOrderImportProcessor {

  private static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(ImportProcessingChain.class);
  private List<ITaopixOrderImportProcessor> processingChain;
  private BelegService belegService;
  private PdfGenerateProcessor pdfProcessor;
  private PdfPrintProcessor printProcessor;

  /**
   * Constructor with injection.
   *
   * @param config TaopixTomImportConfig
   */
  public ImportProcessingChain(TaopixTomImportConfig config) {
    belegService = new BelegService(config.getDataBaseSpec());
    processingChain = new ArrayList<ITaopixOrderImportProcessor>();
    processingChain.add(new AddressSyncProcessor(config));
    processingChain.add(new ProductSyncProcessor(config));
    processingChain.add(new OrderSyncProcessor(config));
    pdfProcessor = new PdfGenerateProcessor(config);
    processingChain.add(pdfProcessor);
    printProcessor = new PdfPrintProcessor(config);
    processingChain.add(printProcessor);

  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {
    try {
      boolean belegExists = belegService.checkBelegByNumber(BelegTyp.AUFTRAG, processingObject.getTaopixOrder().getNummer());
      if (!belegExists) {
        for (ITaopixOrderImportProcessor processor : processingChain) {
          processor.processOrder(processingObject);
        }
      } else {
        LOG.info("Beleg " + processingObject.getTaopixOrder().getNummer() + " bereits vorhanden, drucke Order");
        pdfProcessor.processOrder(processingObject);
        printProcessor.processOrder(processingObject);
      }

    } catch (TomException ex) {
      LOG.error("Fehler beim Durchführen des Imports", ex);
    }

  }
}
