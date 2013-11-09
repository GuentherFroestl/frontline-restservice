/**
 * 
 */
package de.gammadata.basics.modelle;

/**
 * Fasst die Hauptdaten für einen Lieferanten zusammen
 * @author gfr
 *
 */
public interface LieferantenRolle extends BusinessRole {

	/**
	 * 
	 * @return KundenNummer beim Lieferanten
	 */
	public String getKundenNummer();
	/**
	 * 
	 * @param KundenNummer beim Lieferanten
	 */	
	public void setKundenNummer(String kundenNummer);
}
