/**
 * 
 */
package de.gammadata.basics.modelle;

/**
 * Beschreibt ein Land / einen Staat im Sinne der Postadresse
 * @author gfr
 *
 */
public interface Land {
	
	/**
	 * 
	 * @return 2 Buchstabencode lt ISO 3166 Alpha-2
	 */
	public String getIso3166_2_Code();
	/**
	 * 
	 * @param code 2 Buchstabencode lt ISO 3166 Alpha-2
	 */
	public void setIso3166_2_Code(String code);
	/**
	 * 
	 * @return 3 Buchstabencode lt ISO 3166 Alpha-3
	 */
	public String getIso3166_3_Code();
	/**
	 * 
	 * @param code  3 Buchstabencode lt ISO 3166 Alpha-3
	 */
	public void setIso3166_3_Code(String code);
	/**
	 * 
	 * @return Name/Bezeichnung des Land in der Anwendungssprache
	 */
	public String getName();
	/**
	 * 
	 * @param name Name/Bezeichnung des Land in der Anwendungssprache
	 */
	public void setName(String name);
	/**
	 * 
	 * @return Name/Bezeichnung des Land in der Landessprache
	 */
	public String getEigenNamen();
	/**
	 * 
	 * @param eigenNamen  Name/Bezeichnung des Land in der Landessprache
	 */
	public void setEigenNamen(String eigenNamen);
	/**
	 * 
	 * @return Land Nummer
	 */
	public int getNummernCode();
	/**
	 * 
	 * @param code  Land Nummer
	 */
	public void setNummernCode(int code);

}
