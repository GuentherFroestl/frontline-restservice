/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.PersistenceDO;
import java.beans.Transient;
import java.util.Date;

public  abstract class VersandArtDO extends PersistenceDO implements VersandArt{
	
	

	private String beschreibung;
	private String bezeichnung;
	
	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Transient
	public abstract Date getZustellDatum(Date versanddatum);
	
	@Transient
	public abstract boolean isAbholung();

	@Override
	public String genMatchString() {
		return bezeichnung+MATCH_TRENNZEICHEN
		+beschreibung;
	}


}
