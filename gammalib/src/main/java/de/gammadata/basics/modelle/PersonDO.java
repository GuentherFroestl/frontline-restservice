/**
 * 
 */
package de.gammadata.basics.modelle;

import java.util.Date;

/**
 * Implementiert eine natürliche Person
 * @author gfr
 *
 */

public class PersonDO extends KontaktDO {

	/**
	 * Geschlecht
	 * @author gfr
	 *
	 */
	public enum Geschlecht{MANN,FRAU,UNBEKANNT};

	private Date geburtsDatum;
	private String geburtsOrt;
	private String geburtsName;
	private Geschlecht geschlecht;
	private String sozialversicherungsNummer;
	private String titel;
	private String zusatzNamen;
	private String vorname;
	private String nachname;
	

	public String getNamenString() {
		String res="";
		
		if (this.getTitel()!=null && this.getTitel().length()>0)
			res+=this.getTitel()+" ";
		if (this.getVorname()!=null && this.getVorname().length()>0)
			res+=this.getVorname()+" ";
		if (this.getNachname()!=null && this.getNachname().length()>0)
			res+=this.getNachname();
		if (this.getName()!=null && this.getName().length()>0)
			res+=" "+this.getName();
		
		return res;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getGeburtsDatum()
	 */
	public Date getGeburtsDatum() {
		return this.geburtsDatum;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getGeburtsOrt()
	 */
	public String getGeburtsOrt() {
		return this.geburtsOrt;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getGeburtsname()
	 */
	public String getGeburtsname() {
		return this.geburtsName;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getGeschlecht()
	 */
	public Geschlecht getGeschlecht() {
		return this.geschlecht;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getSozialversicherungsNummer()
	 */
	public String getSozialversicherungsNummer() {
		return this.sozialversicherungsNummer;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getTitel()
	 */
	public String getTitel() {
		return this.titel;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getVorname()
	 */
	public String getVorname() {
		return this.vorname;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#getZusatzNamen()
	 */
	public String getZusatzNamen() {
		return this.zusatzNamen;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setGeburtsDatum(java.util.Date)
	 */
	public void setGeburtsDatum(Date gebDatum) {
		this.geburtsDatum=gebDatum;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setGeburtsOrt(java.lang.String)
	 */
	public void setGeburtsOrt(String ort) {
		this.geburtsOrt=ort;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setGeburtsname(java.lang.String)
	 */
	public void setGeburtsname(String geburtsname) {
		this.geburtsName=geburtsname;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setGeschlecht(de.gammadata.gwt.modelle.Person.Geschlecht)
	 */
	public void setGeschlecht(Geschlecht sex) {
		this.geschlecht=sex;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setSozialversicherungsNummer(java.lang.String)
	 */
	public void setSozialversicherungsNummer(String nummer) {
		this.sozialversicherungsNummer=nummer;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setTitel(java.lang.String)
	 */
	public void setTitel(String titel) {
		this.titel=titel;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setVorname(java.lang.String)
	 */
	public void setVorname(String vorname) {
		this.vorname=vorname;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Person#setZusatzNamen(java.lang.String)
	 */
	public void setZusatzNamen(String zusatzNamen) {
		this.zusatzNamen=zusatzNamen;

	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
		
	}
	
	@Override
	public String genMatchString() {
		StringBuilder sb = new StringBuilder();	
		sb.append(getNamenString());
		if (getHauptEmailAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getHauptEmailAdresse().genMatchString());
		if (getHauptAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getHauptAdresse().genMatchString());
		
		return sb.toString();
	}
	
	

}
