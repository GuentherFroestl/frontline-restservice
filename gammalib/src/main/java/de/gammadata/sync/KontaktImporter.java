/**
 * 
 */
package de.gammadata.sync;


import de.gammadata.basics.modelle.KontaktDO;
import de.gammadata.basics.modelle.LandDO;

/**
 * @author gfr
 * Dient zum Importieren Synchronisieren von Kontakten
 */
public interface KontaktImporter {
	
	public KontaktSyncDO searchKontaktSyncByExtRef(String extKontaktId);
	public KontaktSyncDO createKontaktSync(String extKontaktId, KontaktDO kontakt);
	public LandDO searchLandByIso2Code(String iso2Code);
	public LandDO searchLandByIso3Code(String iso3Code);
	public KontaktSyncDO syncKontaktDO(KontaktSyncDO kontaktSync);
	public String getExtSourceBezeichnung();

}
