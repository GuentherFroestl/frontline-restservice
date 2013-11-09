/**
 * 
 */
package de.gammadata.sync;


import de.gammadata.basics.modelle.KontaktDO;
import de.gammadata.basics.modelle.LandDO;

/**
 * @author gfr
 * Basis-Implementierung des I/F Kontaktimporter
 * @see de.gammadata.sync.KontaktImporter
 */
public abstract class KontaktImporterImpl extends GenericImporterImpl implements KontaktImporter {

	/**
	 * 
	 */
	

	/**
	 * muss von der konkreten Implementierung überschrieben werden
	 * pro Ext Datenquelle gibt es somit einen Importer
	 */
	public abstract String getExtSourceBezeichnung();

	public KontaktImporterImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * @see de.gammadata.sync.KontaktImporter#searchKontakByExtRef( java.lang.String)
	 * Es wird nach einem SyncEintrag gesucht und - wenn vorhanden - das KontaktObjekt zurückgeliefert
	 */
	public KontaktSyncDO searchKontaktSyncByExtRef(String extKontaktId) {
		KontaktSyncDO result=null;
		try {
			SyncObjectDO obj = searchBelegSyncByExtRef(getExtSourceBezeichnung(),extKontaktId);
			if (obj!=null && obj instanceof KontaktSyncDO){
				result = (KontaktSyncDO)obj;
			}
			else{

			}
		} catch (Exception e) {

		}
		return result;
	}
	
	public KontaktSyncDO createKontaktSync(String extKontaktId, KontaktDO kontakt){
		
		KontaktSyncDO kso=new KontaktSyncDO();
		kso.setSyncSourceId(extKontaktId);
		kso.setSyncSourceBezeichnung(this.getExtSourceBezeichnung());
		kso.setKontakt(kontakt);


		
		return kso;
	}

	/* (non-Javadoc)
	 * @see de.gammadata.sync.KontaktImporter#searchLandByIso2Code(java.lang.String)
	 */
	
	public LandDO searchLandByIso2Code(String iso2Code) {

		return null;
	}

	/* (non-Javadoc)
	 * @see de.gammadata.sync.KontaktImporter#searchLandByIso3Code(java.lang.String)
	 */
	public LandDO searchLandByIso3Code(String iso3Code) {

		return null;
	}

	/*
	 * @see de.gammadata.sync.KontaktImporter#syncKontaktDO(java.lang.String, java.lang.String, de.gammadata.basics.modelle.KontaktDO)
	 */
	public KontaktSyncDO syncKontaktDO(KontaktSyncDO kontaktSync) {
		// TODO Auto-generated method stub
		return kontaktSync;
	}
	


}
