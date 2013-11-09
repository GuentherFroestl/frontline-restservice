/**
 * 
 */
package de.gammadata.basics.modelle;

public class PostfachDO extends AdresseDO{

	/**
	 * @see de.gammadata.basics.modelle.AdresseDO#getFormattetAdressString(java.lang.String, java.lang.String)
	 */
	@Override
	public String getFormattetAdressString(String spacer, String eol) {
		return "Postfach"+spacer+getNummer()+eol;
	}
}
