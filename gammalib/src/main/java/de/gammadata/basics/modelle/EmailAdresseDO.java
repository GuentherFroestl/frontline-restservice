/**
 * 
 */
package de.gammadata.basics.modelle;

/**
 * @author gfr
 *
 */

public class EmailAdresseDO extends KommAdresseDO {
	
	private String personalName;

	public EmailAdresseDO(){
		setType(Type.EMAIL);
	}
	

	public Type getType() {
		return Type.EMAIL;
	}

	public String getPersonalName() {
		return this.personalName;
	}

	public void setPersonalName(String personalName) {
		this.personalName=personalName;
		
	}

	@Override
	public String genMatchString() {
		return super.genMatchString()+MATCH_TRENNZEICHEN
		+personalName;
	}

}
