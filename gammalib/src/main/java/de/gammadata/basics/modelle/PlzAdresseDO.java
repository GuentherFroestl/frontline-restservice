/**
 * 
 */
package de.gammadata.basics.modelle;


/**
 * @author gfr
 *
 */

public class PlzAdresseDO extends AdresseDO{

	/**
	 * Eine PLZ Adresse hat keine Strasee etc, da sie über die PLZ adressiert wird.
	 * @see de.gammadata.basics.modelle.AdressModell#getFormattetAdressString(java.lang.String, java.lang.String)
	 */
	public String getFormattetAdressString(String spacer, String eol) {
		return "";
	}

}
