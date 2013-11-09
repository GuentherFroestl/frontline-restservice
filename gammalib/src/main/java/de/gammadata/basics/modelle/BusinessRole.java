/**
 * 
 */
package de.gammadata.basics.modelle;

import java.util.List;


/**
 * Beschreibt die Rollen, die ein Kontakt im geschäftlichen Kontext annehmen kann.
 * Wird durch Spezialisierungen, wie Kunde, Lieferant etc. erweitert.
 * Die Erweiterung der HauptKontaktDaten dient der Vereinfachung der Aufrufe für die Clients
 * Die Funktionen aus HauptKontaktDaten werden an den PlayedBy-Kontakt delegiert
 * @author gfr
 *
 */
public interface BusinessRole {
	
	/**
	 * 
	 * @return Nummer fortlaufende Nummer
	 */
	public int getNummer();
	/**
	 * 
	 * @param Nummer fortlaufende Nummer
	 */
	public void setNummer(int nummer);
	/**
	 * 
	 * @return uuid zur Identifizierung in verteilten Systemen SOA
	 */
	public String getUuid();
	/**
	 * 
	 * @param uuid zur Identifizierung in verteilten Systemen SOA
	 */
	public void setUuid(String uuid);
	/**
	 * 
	 * @return Ust.Id. für Geschäfte in der EU
	 */
	public String getUstId();
	/**
	 * 
	 * @param ustId Ust.Id. für Geschäfte in der EU
	 */
	public void setUstId(String ustId);
	/**
	 * 
	 * @return Steuernummer für nationale Geschäfte
	 */
	public String getSteuerNummer();
	/**
	 * 
	 * @param steuerNummer Steuernummer für nationale Geschäfte
	 */
	
	public void setSteuerNummer(String steuerNummer);
	
	/**
	 * 
	 * @return Liste der Ansprechpartner in der BusinessUnit
	 */
	public List<AnsprechpartnerRolleDO> getAnsprechpartnerRollenListe();
	/**
	 * 
	 * @param ansprechpartnerRollenListe Liste der Ansprechpartner in der BusinessUnit
	 */
	public void setAnsprechpartnerRollenListe(List<AnsprechpartnerRolleDO> ansprechpartnerRollenListe);
	/**
	 * 
	 * @param ansprechPartner der Ansprechpartner, der hinzu zu fügen ist
	 * @return true, wenn erfolgreich hinzugefügt.
	 */
	public boolean addAnsprechPartner(AnsprechpartnerRolleDO ansprechPartner);
	

}
