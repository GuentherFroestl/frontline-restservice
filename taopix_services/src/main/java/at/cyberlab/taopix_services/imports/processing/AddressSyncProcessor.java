/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.AddressKopfDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.AddressService;
import org.apache.log4j.Logger;

/**
 * for syncing the addresses of an order.
 *
 * @author gfr
 */
public class AddressSyncProcessor implements ITaopixOrderImportProcessor {

  private static Logger LOG = Logger.getLogger(AddressSyncProcessor.class);
  private TaopixTomImportConfig config;
  private DataBaseSpec dataBaseSpec;
  private AddressService adrService;

  public AddressSyncProcessor(TaopixTomImportConfig config) {
    this.config = config;
    this.dataBaseSpec = config.getDataBaseSpec();
    adrService = new AddressService(this.dataBaseSpec);
  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {

    if (processingObject == null || processingObject.getTaopixOrder() == null) {
      return; //NOP
    }
    try {
      AddressDTO synOrderAdr;
      AddressDTO synShippingAdr;
      AddressDTO synRechAdr;

      AddressDTO orderAdr = processingObject.getTaopixOrder().getFullOrderAddress();
      synOrderAdr = adrService.syncAddress(orderAdr);

      AddressDTO shipAdr = processingObject.getTaopixOrder().getFullShippingAddress();
      if (orderAdr.getUuid().equals(shipAdr.getUuid())) {
        synShippingAdr = synOrderAdr;
      } else {
        synShippingAdr = adrService.syncAddress(shipAdr);
      }

      AddressDTO rechAdr = processingObject.getTaopixOrder().getFullBillingAddress();
      if (orderAdr.getUuid().equals(rechAdr.getUuid())) {
        synRechAdr = synOrderAdr;
      } else if (shipAdr.getUuid().equals(rechAdr.getUuid())) {
        synRechAdr = synShippingAdr;
      } else {
        synRechAdr = adrService.syncAddress(rechAdr);
      }

      if (synOrderAdr == null || synOrderAdr.getId() == null || synOrderAdr.getId() == 0) {
        throw new ImportException("Sync for order address failed " + synOrderAdr);
      }
      if (synShippingAdr == null || synShippingAdr.getId() == null || synShippingAdr.getId() == 0) {
        throw new ImportException("Sync for shipping address failed " + synShippingAdr);
      }
      if (synRechAdr == null || synRechAdr.getId() == null || synRechAdr.getId() == 0) {
        throw new ImportException("Sync for billing address failed " + synRechAdr);
      }

      processingObject.getTaopixOrder().setAdresse(new AddressKopfDTO(synOrderAdr));
      processingObject.getTaopixOrder().setLieferAdresse(new AddressKopfDTO(synShippingAdr));
      processingObject.getTaopixOrder().setRechnungsAdresse(new AddressKopfDTO(synRechAdr));

    } catch (TomException ex) {
      LOG.error("Fehler beim Adressen Sync " + ex.getMessage(), ex);
      throw new ImportException(ex);
    }
  }
}
