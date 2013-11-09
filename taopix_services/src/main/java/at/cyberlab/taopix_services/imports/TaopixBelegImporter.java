/**
 * 
 */
package at.cyberlab.taopix_services.imports;

import de.gammadata.business.modelle.BelegDO;
import java.util.HashMap;
import de.gammadata.sync.BelegImporter;
import de.gammadata.sync.BelegSyncDO;

/**
 * Setellt die Funktionalität für das Importieren von Taopix-Orders zur Verfügung
 * @author gfr
 *
 */
public interface TaopixBelegImporter extends BelegImporter {
	
	public BelegSyncDO syncTaopixOrder(String orderID,
			BelegDO order,
			HashMap<String,String> headerProperties,
			HashMap<String,String> itemProperties,
			HashMap<String, String> shippingProperties);

}
