/**
 * 
 */
package de.gammadata.basics.modelle;

public class LieferantenRolleDO extends BusinessRoleDO {

	private String kundenNummer;

	/**
	 * KundenNummer beim Lieferanten
	 * @see de.gammadata.basics.modelle.LieferantenRolle#getLieferantenNummer()
	 * 
	 */
	public String getKundenNummer() {
		return this.kundenNummer;
	}

	/**
	 * KundenNummer beim Lieferanten
	 * @see de.gammadata.basics.modelle.LieferantenRolle#setLieferantenNummer(int)
	 * 
	 */
	public void setKundenNummer(String kundenNummer) {
		this.kundenNummer=kundenNummer;

	}

}
