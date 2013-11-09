/**
 * 
 */
package de.gammadata.basics.modelle;


/**
 * Implementierung des Land I/F
 * @author gfr
 *
 */

public class LandDO extends PersistenceDO implements Land {

	private String eigenNamen;
	private String iso3166_2_Code;
	private String iso3166_3_Code;
	private String name;
	private int nummernCode;

	/**
	 * @see de.gammadata.basics.modelle.Land#getEigenNamen()
	 */
	public String getEigenNamen() {
		return this.eigenNamen;
	}

	/**
	 * @see de.gammadata.basics.modelle.Land#getIso3166_2_Code()
	 */
	public String getIso3166_2_Code() {
		return this.iso3166_2_Code;
	}

	/**
	 * @see de.gammadata.basics.modelle.Land#getIso3166_3_Code()
	 */
	public String getIso3166_3_Code() {
		return this.iso3166_3_Code;
	}

	/**
	 * @see de.gammadata.basics.modelle.Land#getName()
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @see de.gammadata.basics.modelle.Land#setEigenNamen(java.lang.String)
	 */
	public void setEigenNamen(String eigenNamen) {
		this.eigenNamen=eigenNamen;

	}

	/**
	 * @see de.gammadata.basics.modelle.Land#setIso3166_2_Code(java.lang.String)
	 */
	public void setIso3166_2_Code(String code) {
		this.iso3166_2_Code=code;

	}

	/**
	 * @see de.gammadata.basics.modelle.Land#setIso3166_3_Code(java.lang.String)
	 */
	public void setIso3166_3_Code(String code) {
		this.iso3166_3_Code=code;

	}

	/**
	 * @see de.gammadata.basics.modelle.Land#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name=name;

	}

	public int getNummernCode() {
		return this.nummernCode;
	}

	public void setNummernCode(int code) {
		this.nummernCode=code;
		
	}

	@Override
	public String genMatchString() {
		return 
		name+MATCH_TRENNZEICHEN
		+eigenNamen+MATCH_TRENNZEICHEN
		+iso3166_2_Code+MATCH_TRENNZEICHEN
		+iso3166_3_Code+MATCH_TRENNZEICHEN;
	}

	@Override
	public String toString() {
		return "LandDO [eigenNamen=" + eigenNamen + ", iso3166_2_Code="
				+ iso3166_2_Code + ", iso3166_3_Code=" + iso3166_3_Code
				+ ", name=" + name + ", nummernCode=" + nummernCode
				+ ", getId()=" + getId() + "]";
	}

}
