/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;


/**
 * @author gfr
 *
 */

public class BarzahlungDO extends ZahlungsBedingungDO {

	/**
	 * 
	 */
	public BarzahlungDO() {
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#getFälligkeitsDatum()
	 */

	public Date getFälligkeitsDatum(Date rechnungsdatum) {
		return rechnungsdatum;
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#getSkontoDatum()
	 */

	public Date getSkontoDatum(Date rechnungsdatum) {
		return rechnungsdatum;
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#hasSkonto()
	 */

	public boolean hasSkonto() {
		return false;
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#isBarzahlung()
	 */

	public boolean isBarzahlung() {
		return true;
	}

	public boolean isPaymentService() {
		return false;
	}

}
