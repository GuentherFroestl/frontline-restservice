/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.PersistenceDO;
import de.gammadata.basics.modelle.Wrg;


public class WrgDO extends PersistenceDO implements Wrg {

	private double kurs=1d;
	private String wrgBez=Wrg.EURO;
	private String wrgSymbol=Wrg.EURO_SYMBOL;
	
	public WrgDO(){
	
	}
	/**
	 * 
	 * @param bezeichnung zb EUR, USD, GBP
	 * @param symbol $ € 
	 * @param wertEinEuro Wert eines Euros in der Wrg
	 */
	public WrgDO(String bezeichnung, String symbol, double wertEinEuro){
		this.wrgBez=bezeichnung;
		this.wrgSymbol=symbol;
		this.kurs=wertEinEuro;
	}

	/**
	 * Kurs in Relation zur Standardwährung == EUR
	 * wieviel bekommt man für 1 EUR in dieser WRG
	 * @see de.gammadata.gwt.modelle.Wrg#getKurs()
	 * @return double Kurs
	 */
	public double getKurs() {
		return this.kurs;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Wrg#getWrgBez()
	 */
	public String getWrgBez() {
		return this.wrgBez;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Wrg#getWrgSymbol()
	 */
	public String getWrgSymbol() {
		return this.wrgSymbol;
	}

	/**
	 * @see de.gammadata.gwt.modelle.Wrg#setKurs(double)
	 * wieviel bekommt man für 1 EUR in dieser WRG
	 *  @param wertEinEuro Wert eines Euros in der Wrg
	 */
	public void setKurs(double wertEinEuro) {
		this.kurs=wertEinEuro;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Wrg#setWrgBez(java.lang.String)
	 */
	public void setWrgBez(String bez) {
		this.wrgBez=bez;

	}

	/**
	 * @see de.gammadata.gwt.modelle.Wrg#setWrgSymbol(java.lang.String)
	 */
	public void setWrgSymbol(String symbol) {
		this.wrgSymbol=symbol;

	}
	@Override
	public String toString(){
		return wrgSymbol;
	}
	
	@Override
	public String genMatchString() {
		return wrgBez+MATCH_TRENNZEICHEN
		+wrgSymbol+MATCH_TRENNZEICHEN;
	}

}
