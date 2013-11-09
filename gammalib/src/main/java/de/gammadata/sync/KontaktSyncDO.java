/**
 * 
 */
package de.gammadata.sync;


//import org.hibernate.annotations.CascadeType;

import de.gammadata.basics.modelle.KontaktDO;

/**
 * @author gfr
 *
 */

public class KontaktSyncDO extends SyncObjectDO {

	private KontaktDO kontakt;

	/**
	 * 
	 */
	public KontaktSyncDO() {
		// TODO Auto-generated constructor stub
	}

	public KontaktDO getKontakt() {
		return this.kontakt;
	}
	
	public void setKontakt(KontaktDO kontakt){
		this.kontakt=kontakt;
	}



}
