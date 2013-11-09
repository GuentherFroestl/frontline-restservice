/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;


import de.gammadata.basics.modelle.PersistenceDO;

/**
 * @author gfr
 *
 */

public abstract class ZahlungsBedingungDO extends PersistenceDO implements ZahlungsBedingung {

	private String beschreibung;
	private String bezeichnung;

	/**
	 * 
	 */
	public ZahlungsBedingungDO() {
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingung#getBeschreibung()
	 */
	public String getBeschreibung() {
		return this.beschreibung;
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingung#getBezeichnung()
	 */
	public String getBezeichnung() {
		return this.bezeichnung;
	}


	public abstract Date getFälligkeitsDatum(Date rechnungsdatum);

	public abstract Date getSkontoDatum(Date rechnungsdatum);


	public abstract boolean hasSkonto();


	public abstract boolean isBarzahlung();
	

	public abstract boolean isPaymentService();

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingung#setBeschreibung(java.lang.String)
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung=beschreibung;

	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingung#setBezeichnung(java.lang.String)
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung=bezeichnung;

	}
	@Override
	public String genMatchString() {
		return bezeichnung+MATCH_TRENNZEICHEN
		+beschreibung;
	}


}
