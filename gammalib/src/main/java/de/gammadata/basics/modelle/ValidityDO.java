/**
 * 
 */
package de.gammadata.basics.modelle;

import java.util.Date;



/**
 * @author gfr
 *
 */

public abstract class ValidityDO extends PersistenceDO {

	private Date voidDate;
	private boolean voidStatus=false;

	/**
	 * @see de.gammadata.gwt.modelle.Validity#getVoidDate()
	 */
	public Date getVoidDate() {
		return this.voidDate;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Validity#isVoid()
	 */
//	@Transient
	public boolean isVoid() {
		return this.voidStatus;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Validity#makeVoid(java.util.Date)
	 */
	public void makeVoid(Date voidDate) {
		this.voidDate=voidDate;
		this.voidStatus=true;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Validity#setVoid(boolean)
	 */
	public void setVoid(boolean isvoid) {
		this.voidStatus=isvoid;
		if (isvoid)
			this.voidDate=new Date();
	}

	/**
	 * @see de.gammadata.gwt.modelle.Validity#setVoidDate(java.util.Date)
	 */
	public void setVoidDate(Date voidDate) {
		this.voidDate=voidDate;

	}


}
