package at.cyberlab.taopix_services.imports;

import java.util.HashMap;

import de.gammadata.basics.modelle.LandDO;
import de.gammadata.sync.KontaktImporter;
import de.gammadata.sync.KontaktSyncDO;

/**
 * @author gfr
 *
 */
public interface TaopixKontaktImporter extends KontaktImporter {
	/**
	 * erledigt die Import-Arbeit
	 * @param userId String, id des Taopix-Users im Header
	 * @param propertyListe HashMap<String,String>, Liste mit den Properties des users
	 * @return KontaktSyncDO, SyncObject mit ggf. erzeugten Objecten (KontaktDO)
	 */
	public KontaktSyncDO syncTaopixUser(String userId,HashMap<String,String> propertyListe);
	/**
	 * 
	 * @return
	 */
	public LandDO getStandardLand();
	/**
	 * 
	 * @param standardLand
	 */
	public void setStandardLand(LandDO standardLand);

}
