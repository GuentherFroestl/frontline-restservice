/**
 * 
 */
package de.gammadata.basics.modelle;


/**
 * implementiert AnsprechpartnerRolle
 * beidseitig navigierbar, zum Kontakt und zur Geschäftseinheit
 * @see de.gammadata.basics.modelle.AnsprechpartnerRolle
 * @author gfr
 *
 */

public class AnsprechpartnerRolleDO extends BasicRoleDO {
  
  	public static enum Type {BESITZER,GL,VERTRIEB,MKTG,TECHNIK,IT,VERSAND, PRODUKTION, RECHT,SICHERHEIT,LIEFERANSCHRIFT,RECHNUNGSANSCHRIFT};

	private BusinessRoleDO businessUnit;
	private Type type;

	/**
	 * @see de.gammadata.basics.modelle.AnsprechpartnerRolle#getBusinessUnit()
	 * @OneToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	 */

	public BusinessRoleDO getBusinessUnit() {
		return this.businessUnit;
	}

	/**
	 * @see de.gammadata.basics.modelle.AnsprechpartnerRolle#getType()
	 */

	public Type getType() {
		return this.type;
	}

	/**
	 * @see de.gammadata.basics.modelle.AnsprechpartnerRolle#setBusinessUnit(de.gammadata.basics.modelle.BusinessUnitRoleDO)
	 */
	public void setBusinessUnit(BusinessRoleDO organisation) {
		this.businessUnit=organisation;

	}

	/**
	 * @see de.gammadata.basics.modelle.AnsprechpartnerRolle#setType(de.gammadata.basics.modelle.AnsprechpartnerRolle.Type)
	 */
	public void setType(Type type) {
		this.type=type;

	}

}
