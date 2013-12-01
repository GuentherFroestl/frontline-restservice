/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.imports.ImportException;
import com.tom.service.dto.BelegDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.BelegService;

/**
 * for syncing an order.
 *
 * @author gfr
 */
public class OrderSyncProcessor implements ITaopixOrderImportProcessor {

  private static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(OrderSyncProcessor.class);
  private TaopixTomImportConfig config;
  private DataBaseSpec dataBaseSpec;
  private BelegService belegService;

  /**
   * Constructor with injection.
   *
   * @param config TaopixTomImportConfig
   */
  public OrderSyncProcessor(TaopixTomImportConfig config) {
    this.config = config;
    this.dataBaseSpec = config.getDataBaseSpec();
    this.belegService = new BelegService(this.dataBaseSpec);
  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {
    if (processingObject == null || processingObject.getTaopixOrder() == null || processingObject.getTaopixOrder().getPositionsListe() == null) {
      return; //NOP
    }
    try {
      boolean exists = belegService.checkBelegByNumber(processingObject.getTaopixOrder().getBelegTyp(), processingObject.getTaopixOrder().getNummer());
      if (exists) {
        return; //NOP
      }
      BelegDTO createdBeleg = belegService.createBeleg(processingObject.getTaopixOrder());
      LOG.info("Created Beleg=" + createdBeleg);
    } catch (TomException ex) {
      LOG.error("Fehler beim Ordersync", ex);
      throw new ImportException(ex);
    }
  }
}
