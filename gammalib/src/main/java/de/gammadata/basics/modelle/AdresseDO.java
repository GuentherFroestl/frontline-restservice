/**
 * 
 */
package de.gammadata.basics.modelle;



/**
 * @author gfr
 *
 */
public  class AdresseDO extends ValidityDO {
  
  public enum Nutzung {FIRMA,PRIVAT,UNBEKANNT};

	private LandDO land;
	private String plz;
	private String stadt;
	private String nummer;
	private Nutzung nutzung = Nutzung.UNBEKANNT;

	/**
	 * Muss in der Unterklasse implementiert werden
	 * @see de.gammadata.basics.modelle.AdressModell#getFormattetAdressString(java.lang.String, java.lang.String)
	 */

	public  String getFormattetAdressString(String spacer, String eol){
		String adr= getPlz()+spacer+getStadt();
		if (getLand()!=null){
			adr+=eol+getLand().getName();
		}
		return adr+eol;
	}
	

	public  String getStandardAdressString(){
		return getFormattetAdressString(" ","\n");
	}

	/**
	 * @see de.gammadata.basics.modelle.AdressModell#getLand()
	 */

	public LandDO getLand() {
		return this.land;
	}
	
	public void setLand(LandDO land) {
		this.land=land;
		
	}

	/**
	 * @see de.gammadata.basics.modelle.AdressModell#getPlz()
	 */
	public String getPlz() {
		return this.plz;
	}

	/**
	 * @see de.gammadata.basics.modelle.AdressModell#getStadt()
	 */
	public String getStadt() {
		return this.stadt;
	}


	/**
	 * @see de.gammadata.basics.modelle.AdressModell#setPlz(java.lang.String)
	 */
	public void setPlz(String plz) {
		this.plz=plz;

	}

	/**
	 * @see de.gammadata.basics.modelle.AdressModell#setStadt(java.lang.String)
	 */
	public void setStadt(String stadt) {
		this.stadt=stadt;

	}

	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#getNummer()
	 */
	public String getNummer() {
		return this.nummer;
	}
	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#setNummer(java.lang.String)
	 */
	public void setNummer(String nummer) {
		this.nummer=nummer;

	}

	public Nutzung getNutzung() {
		return this.nutzung;
	}

	public void setNutzung(Nutzung nutzung) {
		this.nutzung=nutzung;
		
	}

	@Override
	public String genMatchString() {
		if (getLand()!=null)
			return stadt+MATCH_TRENNZEICHEN
			+plz+MATCH_TRENNZEICHEN
			+nummer+MATCH_TRENNZEICHEN
			+getLand().getEigenNamen()
			+getLand().getName();
		else
			return stadt+MATCH_TRENNZEICHEN
			+plz+MATCH_TRENNZEICHEN
			+nummer;
	}

	@Override
	public String toString() {
		return "AdresseDO [land=" + land + ", plz=" + plz + ", stadt=" + stadt
				+ ", nummer=" + nummer + ", nutzung=" + nutzung + ", getId()="
				+ getId() + "]";
	}


}
