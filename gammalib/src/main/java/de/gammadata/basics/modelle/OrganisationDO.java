package de.gammadata.basics.modelle;



public class OrganisationDO extends KontaktDO {
  
  	public enum Type {EINZELFIRMA,UNTERNEHMEN,VEREIN,STAATLICH,NGO};

	private int anzahlMitarbeiter;
	private String registrierungsAngaben;
	private Type type;

	/**
	 * @see de.gammadata.basics.modelle.Organisation#getAnzahlMitarbeiter()
	 */
	public int getAnzahlMitarbeiter() {
		return this.anzahlMitarbeiter;
	}

	/**
	 * @see de.gammadata.basics.modelle.Organisation#getRegistrierungsAngaben()
	 */
	public String getRegistrierungsAngaben() {
		return this.registrierungsAngaben;
	}

	/**
	 * @see de.gammadata.basics.modelle.Organisation#setAnzahlMitarbeiter(int)
	 */
	public void setAnzahlMitarbeiter(int anzahl) {
		this.anzahlMitarbeiter=anzahl;

	}


	/**
	 * @see de.gammadata.basics.modelle.Organisation#setRegistrierungsAngaben(java.lang.String)
	 */
	public void setRegistrierungsAngaben(String regAngaben) {
		this.registrierungsAngaben=regAngaben;

	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type=type;
		
	}

}
