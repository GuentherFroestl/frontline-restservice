/**
 * 
 */
package de.gammadata.basics.modelle;


/**
 * @author gfr
 *
 */

public class HausAdresseDO extends AdresseDO{

	private String adressZusatz;
//	private String nummer;
	private String strasse;


	public String getFormattetAdressString(String spacer, String eol) {	
		String adr="";
		if (getAdressZusatz()!=null&&getAdressZusatz().length()>0)
			adr= getAdressZusatz()+eol+getStrasse();
		else
			adr= getStrasse();
		
		if (getNummer()!=null&&getNummer().length()>0)
			adr+=spacer+getNummer();
		
		adr+=eol+super.getFormattetAdressString(spacer, eol);
		
		return adr;
		
	}

	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#getAdressZusatz()
	 */
	public String getAdressZusatz() {
		return this.adressZusatz;
	}


	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#getStrasse()
	 */
	public String getStrasse() {
		return this.strasse;
	}

	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#setAdressZusatz(java.lang.String)
	 */
	public void setAdressZusatz(String zusatz) {
		this.adressZusatz=zusatz;

	}



	/**
	 * @see de.gammadata.basics.modelle.HausAdresse#setStrasse(java.lang.String)
	 */
	public void setStrasse(String strasse) {
		this.strasse=strasse;

	}


  @Override
	public String genMatchString() {
		// TODO Auto-generated method stub
		return getFormattetAdressString(MATCH_TRENNZEICHEN,MATCH_TRENNZEICHEN);
	}


  @Override
	public String toString() {
		return super.toString()+", HausAdresseDO [adressZusatz=" + adressZusatz + ", strasse="
				+ strasse + "]";
	}

}
