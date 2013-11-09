/**
 * 
 */
package de.gammadata.sync;



import de.gammadata.business.modelle.BelegDO;
import de.gammadata.business.modelle.KatalogProduktDO;
import de.gammadata.business.modelle.ProduktDO;
import de.gammadata.business.modelle.SteuerDO;

/**
 * @author gfr
 * Dient zum Importieren / synchronisieren von Belegen
 */
public interface BelegImporter {

	public BelegSyncDO searchBelegSyncByExtRef(String extBelegId);
	public BelegSyncDO createBelegSync(String extBelegId, BelegDO beleg);
	public BelegSyncDO syncBelegDO(BelegSyncDO belegSync);
	public String getExtSourceBezeichnung();
	public KatalogProduktDO katalogEintrag(KatalogProduktDO produkt);
	public ProduktDO productEintrag(ProduktDO produkt);
	public SteuerDO steuerEintrag(SteuerDO steuer);
}
