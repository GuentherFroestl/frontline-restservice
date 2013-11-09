/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;

/**
 * Modelliert die verschiedenen Zahlungsbedingunegn für Belege
 * @author gfr
 *
 */
public interface ZahlungsBedingung {
	
	public static final int tagInMillisekunden = 24 * 60 * 60 * 1000;
	public static final int standardZahlungsZiel = 7; //Zahlungsziel Netto Rechnung
	public static final int standardZahlungsZielSkonto = 14; //Zahlungsziel für Skonto Rechnung
	public static final int standardSkontoZiel = 7; //Zahlungsziel für Inanspruchnahme von Skonto
	public static final int standardPaymentServiceZiel = 1; //Zahlungsziel für Inanspruchnahme von Skonto
	
	
	
	public String getBezeichnung();
	public void setBezeichnung(String bezeichnung);
	public String getBeschreibung();
	public void setBeschreibung(String beschreibung);
	/**
	 * 
	 * @return true, wenn Barzahlung, wird von Unterklassen implementiert
	 */
	public boolean isBarzahlung();
	/**
	 * 
	 * @return true, wenn Zahlung über ein CC-Unternehmen oder PayPal abgewickelt wird
	 */
	public boolean isPaymentService();
	/**
	 * 
	 * @return Date wann die Rechnung fällig wäre, wird von Unterklassen implementiert
	 */
	public Date getFälligkeitsDatum(Date rechnungsdatum);
	/**
	 * 
	 * @return true, wenn Skonto möglich ist, wird von Unterklassen implementiert
	 */
	public boolean hasSkonto();
	/**
	 * 
	 * @return Date, wann die Zahlung mit Skonto fällig wäre, wird von Unterklassen implementiert
	 */
	public Date getSkontoDatum(Date rechnungsdatum);

}
