/**
 * 
 */
package de.gammadata.business.modelle;

/**
 * @author gfr
 *
 */

public class AngebotDO extends AuftragDO {
	
	@Override
	public Type getType() {
		return Type.ANGEBOT;
	}

}
