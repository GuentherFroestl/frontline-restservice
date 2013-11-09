/**
 * 
 */
package de.gammadata.basics.modelle;

import java.sql.Timestamp;
import java.util.Date;


/**
 * @author gfr
 *
 */

public abstract class PersistenceDO {
	
	public static final String MATCH_TRENNZEICHEN=" ";

	private int id;
	private int version;


	private int userIdCreator;
	private int userIdModificator;
	private Date createdTimestamp=new Date();
	private Date modifiedTimestamp;
	private String matchString;
	
	public static final int maxMatchLength=512;
	
	public abstract String genMatchString();
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;

	}

	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public int getUserIdCreator() {
		return userIdCreator;
	}

	public int getUserIdModificator() {
		return userIdModificator;
	}
	
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date timestamp) {
		createdTimestamp=timestamp;

	}

	public void setModifiedTimestamp(Date timestamp) {
		modifiedTimestamp=timestamp;

	}

	public void setUserIdCreator(int id) {
		userIdCreator=id;

	}

	public void setUserIdModificator(int id) {
		this.userIdModificator=id;

	}

	public String getMatchString() {
		return matchString;
	}
	
	public void setMatchString(String matchString) {
		this.matchString = matchString;
	}


}
