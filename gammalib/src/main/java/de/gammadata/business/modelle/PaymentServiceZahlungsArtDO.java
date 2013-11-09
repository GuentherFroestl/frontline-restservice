/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;


/**
 * @author gfr
 *
 */

public class PaymentServiceZahlungsArtDO extends ZahlungsBedingungDO {

	private int zahlungsZielInTagen=ZahlungsBedingung.standardPaymentServiceZiel;

	/**
	 * 
	 */
	public PaymentServiceZahlungsArtDO() {
	}


	public Date getFälligkeitsDatum(Date rechnungsdatum) {
		return new Date(rechnungsdatum.getTime()+zahlungsZielInTagen*ZahlungsBedingung.tagInMillisekunden);
	}


	public Date getSkontoDatum(Date rechnungsdatum) {
		return new Date(rechnungsdatum.getTime());
	}


	public boolean hasSkonto() {
		return false;
	}


	public boolean isBarzahlung() {
		return false;
	}

	public boolean isPaymentService() {
		return true;
	}
	
	public int getZahlungsZielInTagen() {
		return zahlungsZielInTagen;
	}

	public void setZahlungsZielInTagen(int zahlungsZielInTagen) {
		this.zahlungsZielInTagen = zahlungsZielInTagen;
	}

}
