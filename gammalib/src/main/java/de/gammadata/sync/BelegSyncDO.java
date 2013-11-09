/**
 * 
 */
package de.gammadata.sync;

import de.gammadata.business.modelle.BelegDO;

public class BelegSyncDO extends SyncObjectDO {
	
	private BelegDO beleg;
	
	public BelegSyncDO(){
		
	}

	public BelegDO getBeleg() {
		return beleg;
	}

	public void setBeleg(BelegDO beleg) {
		this.beleg = beleg;
	}

}
