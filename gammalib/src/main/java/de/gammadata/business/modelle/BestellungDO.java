/**
 * 
 */
package de.gammadata.business.modelle;



import de.gammadata.basics.modelle.AdresseDO;
import de.gammadata.basics.modelle.KontaktDO;

/**
 * @author gfr
 *
 */

public class BestellungDO extends BelegDO {
	
	private AdresseDO lieferAdresse;
	private KontaktDO lieferKontakt;
	
	/**
	 * 
	 * @return AdresseDO die Lieferadresse
	 */

	public AdresseDO getLieferAdresse() {
		return lieferAdresse;
	}
	public void setLieferAdresse(AdresseDO lieferAdresse) {
		this.lieferAdresse = lieferAdresse;
	}
	/**
	 * 
	 * @return KontaktDO der LieferKontakt
	 */

	public KontaktDO getLieferKontakt() {
		return lieferKontakt;
	}
	public void setLieferKontakt(KontaktDO lieferKontakt) {
		this.lieferKontakt = lieferKontakt;
	}
	@Override
	public Type getType() {
		return Type.BESTELLUNG;
	}

}
