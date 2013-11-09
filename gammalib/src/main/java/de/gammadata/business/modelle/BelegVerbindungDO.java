/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.PersistenceDO;
import de.gammadata.business.modelle.BelegDO.Type;
import javax.swing.text.html.parser.Entity;

/**
 * @author gfr
 * Assoziationsklasse für die Verbindungen von Belegen/Belegpositionen
 */

public class BelegVerbindungDO  extends PersistenceDO {
	
	private Type type;
	private BelegPositionDO quellBelegPosition;
	private int id;
	private BelegPositionDO zielBelegPosition;

	private BelegDO quellBeleg;
	private BelegDO zielBeleg;


	/**
	 * ANGEBOT,AUFTRAG,LIEFERSCHEIN,RECHNUNG,BESTELLUNG,EINGANGSRECHNUNG
	 * @return Type, Art des Belegs
	 */
	public Type getType(){
		return this.type;
	}
	
	/**
	 * ANGEBOT,AUFTRAG,LIEFERSCHEIN,RECHNUNG,BESTELLUNG,EINGANGSRECHNUNG
	 * @param typ Type, Art des ZielBelegs
	 */
	public void setType(Type typ){
		this.type=type;
	}
	/**
	 * 
	 * @return BelegPositionDO, Position von der die Verbindung ausgeht
	 */

	public BelegPositionDO getQuellBelegPosition(){
		return this.quellBelegPosition;
	}
	/**
	 * 
	 * @param BelegPositionDO, Position von der die Verbindung ausgeht
	 */
	public void setQuellBelegPosition(BelegPositionDO position){
		this.quellBelegPosition=position;
	}
	
	/**
	 * 
	 * @return BelegPositionDO, Position zu Verbindung zeigt
	 */

	public BelegPositionDO getZielBelegPosition(){
		return this.zielBelegPosition;
	}
	/**
	 * 
	 * @param BelegPositionDO, Position zu Verbindung zeigt
	 */
	public void setZielBelegPosition(BelegPositionDO position){
		this.zielBelegPosition=position;
	}

	public BelegDO getQuellBeleg() {
		return quellBeleg;
	}

	public void setQuellBeleg(BelegDO quellBeleg) {
		this.quellBeleg = quellBeleg;
	}

	public BelegDO getZielBeleg() {
		return zielBeleg;
	}

	public void setZielBeleg(BelegDO zielBeleg) {
		this.zielBeleg = zielBeleg;
	}

	@Override
	public String genMatchString() {
		StringBuilder sb = new StringBuilder();
		if (getType()!=null)
			sb.append(getType().toString());
		if (getZielBeleg()!=null)
			sb.append(getZielBeleg().genMatchString());
		if (getQuellBeleg()!=null)
			sb.append(getQuellBeleg().genMatchString());
		return null;
	}

}
