/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.Date;


/**
 * @author gfr
 *
 */

public class AbholungDO extends VersandArtDO implements VersandArt {
	

	/**
	 * @see de.gammadata.business.modelle.VersandArtDO#getZustellDatum(java.util.Date)
	 */

	public Date getZustellDatum(Date versanddatum) {
		return new Date(versanddatum.getTime());
	}

	/**
	 * @see de.gammadata.business.modelle.VersandArtDO#isAbholung()
	 */

	public boolean isAbholung() {
		return true;
	}

}
