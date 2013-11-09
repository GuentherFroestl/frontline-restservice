/**
 * 
 */
package de.gammadata.basics.modelle;

import de.gammadata.basics.modelle.AdresseDO.Nutzung;




/**
 * @author gfr
 *
 */

public class KommAdresseDO extends ValidityDO {
  
  	public enum Type {FESTNETZ, MOBIL, SATELLIT, EMAIL, FACEBOOK, ICQ,MSN,SKYPE,IRC,SONSTIG};

	private String nameNummer;
	private String info;
	private Type type;
	private Nutzung nutzung;

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#getAdressId()
	 */
	public String getNameNummer() {
		return this.nameNummer;
	}

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#getInfo()
	 */
	public String getInfo() {
		return this.info;
	}

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#getType()
	 */
	public Type getType() {
		return this.type;
	}

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#setAdressId(java.lang.String)
	 * Name oder Nummer , AdressID
	 */
	public void setNameNummer(String nameNummer) {
		this.nameNummer=nameNummer;

	}

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#setInfo(java.lang.String)
	 */
	public void setInfo(String info) {
		this.info=info;

	}

	/**
	 * @see de.gammadata.gwt.modelle.KommAdresse#setType(de.gammadata.gwt.modelle.KommAdresse.Type)
	 */
	public void setType(Type type) {
		this.type=type;

	}
	

	public Nutzung getNutzung() {
		return this.nutzung;
	}

	public void setNutzung(Nutzung nutzung) {
		this.nutzung=nutzung;
		
	}


	public String genMatchString() {
		return nameNummer;
	}


}
