/**
 * 
 */
package de.gammadata.sync;

/**
 * @author gfr
 *
 */
public interface SyncObject {
	/**
	 * 
	 * @return String Bezeichnung der Sync Quelle
	 */
	public String getSyncSourceBezeichnung();
	/**
	 * 
	 * @param bezeichnung String Bezeichnung der Sync Quelle
	 */
	public void setSyncSourceBezeichnung(String bezeichnung);
	/**
	 * 
	 * @return String ID des Objektes in der Sync-Source
	 */
	public String getSyncSourceId();
	/**
	 * 
	 * @param id String ID des Objektes in der Sync-Source
	 */
	public void setSyncSourceId(String id);
	

}
