/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.KontaktDO;
import java.beans.Transient;
import java.util.Date;


public class VersandDO extends VersandArtDO implements VersandArt {
	
	private int lieferZeitInTagen=2;
	private KontaktDO kontakt;
	
	
	
	public int getLieferZeitInTagen() {
		return lieferZeitInTagen;
	}

	public void setLieferZeitInTagen(int lieferZeitInTagen) {
		this.lieferZeitInTagen = lieferZeitInTagen;
	}
	
	public KontaktDO getKontakt() {
		return kontakt;
	}

	public void setKontakt(KontaktDO kontakt) {
		this.kontakt = kontakt;
	}




	public Date getZustellDatum(Date versanddatum) {
		return new Date(versanddatum.getTime()+lieferZeitInTagen*tagInMillisekunden);
	}


	public boolean isAbholung() {
		return false;
	}

}
