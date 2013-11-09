/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;


/**
 * @author gfr
 *
 */

public class NettoZahlungsBedingungDO extends ZahlungsBedingungDO implements
		ZahlungsBedingung {
	
	private int zahlungsZielInTagen=ZahlungsBedingung.standardZahlungsZiel;
	/**
	 * 
	 */
	public NettoZahlungsBedingungDO() {

	}
	
	public int getZahlungsZielInTagen() {
		return zahlungsZielInTagen;
	}

	public void setZahlungsZielInTagen(int zahlungsZielInTagen) {
		this.zahlungsZielInTagen = zahlungsZielInTagen;
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#getFälligkeitsDatum(java.util.Date)
	 */

	public Date getFälligkeitsDatum(Date rechnungsdatum) {
		return new Date(rechnungsdatum.getTime()+zahlungsZielInTagen*ZahlungsBedingung.tagInMillisekunden);
	}

	/**
	 * @see de.gammadata.business.modelle.ZahlungsBedingungDO#getSkontoDatum(java.util.Date)
	 */

	public Date getSkontoDatum(Date rechnungsdatum) {
		return new Date(rechnungsdatum.getTime());
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
		return false;
	}
	

	public boolean isPaymentService() {
		return false;
	}

}
