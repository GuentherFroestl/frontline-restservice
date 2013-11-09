/**
 * 
 */
package de.gammadata.sync;

import de.gammadata.basics.modelle.PersistenceDO;


public class SyncObjectDO  extends PersistenceDO implements SyncObject{

	private String syncSourceBezeichnung;
	private String syncSourceId;

	/**
	 * 
	 */
	public SyncObjectDO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * @see de.gammadata.sync.BasicSyncObject#getSyncSourceBezeichnung()
	 */
	public String getSyncSourceBezeichnung() {
		return syncSourceBezeichnung;
	}

	/* 
	 * @see de.gammadata.sync.BasicSyncObject#getSyncSourceId()
	 */
	public String getSyncSourceId() {
		return syncSourceId;
	}

	/*
	 * @see de.gammadata.sync.BasicSyncObject#setSyncSourceBezeichnung(java.lang.String)
	 */
	public void setSyncSourceBezeichnung(String bezeichnung) {
		this.syncSourceBezeichnung=bezeichnung;

	}

	/* (non-Javadoc)
	 * @see de.gammadata.sync.BasicSyncObject#setSyncSourceId(java.lang.String)
	 */
	public void setSyncSourceId(String id) {
		this.syncSourceId=id;

	}

	@Override
	public String genMatchString() {
		// TODO Auto-generated method stub
		return null;
	}


}
