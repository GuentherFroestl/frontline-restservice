/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;

/**
 * Modelliert die Versandarten
 * wird durch abstrakte und konkrete Implementierungen realisiert
 * @author gfr
 *
 */
public interface VersandArt {
	
	public static final int tagInMillisekunden = 24 * 60 * 60 * 1000;
	
	public String getBezeichnung();
	public void setBezeichnung(String bezeichnung);
	public String getBeschreibung();
	public void setBeschreibung(String beschreibung);
	/**
	 * 
	 * @return true, wenn abgeholt wird
	 */
	public boolean isAbholung();
	/**
	 * 
	 * @param versanddatum Datum des Versands
	 * @return Date, voraussichtliches Zustelldatum
	 */
	public Date getZustellDatum(Date versanddatum);

}
