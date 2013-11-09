/**
 * 
 */
package de.gammadata.business.modelle;

import java.math.BigDecimal;





/**
 * @author gfr
 *
 */

public class GeldDO {
  
  	public static final int exactscale = 8;
	public static final int roundscale = 2;
	public static final int roundingMode = BigDecimal.ROUND_HALF_UP;

	private BigDecimal betrag;
	private WrgDO wrg;

	/**
	 * 
	 */
	public GeldDO() {
	}
	public GeldDO(String betragTxt){
		this.betrag=new  BigDecimal(betragTxt);
		wrg = new WrgDO();
	}
	
	public GeldDO(BigDecimal betrag){
		this.betrag=betrag;
		wrg = new WrgDO();
	}
	public GeldDO(BigDecimal betrag, WrgDO wrg){
		this.betrag=betrag;
		this.wrg=wrg;
	}
	
	public GeldDO(double betrag){
		this.setBetrag(betrag);
		wrg = new WrgDO();
	}
	
	public GeldDO(double betrag, WrgDO wrg){
		this.setBetrag(betrag);
		this.wrg=wrg;
	}
	
	

	public GeldDO(GeldDO geld) {		
			this.betrag=geld.getBetrag();
			this.wrg=geld.getWrg();		
	}



	/**
	 * @see de.gammadata.business.modelle.Geld#getBetrag()
	 */

	public BigDecimal getBetrag() {
		return this.betrag;
	}

	/**
	 * @see de.gammadata.business.modelle.Geld#getWrg()
	 */

	public WrgDO getWrg() {
		return this.wrg;
	}

	/**
	 * @see de.gammadata.business.modelle.Geld#setBetrag(java.math.BigDecimal)
	 */
	public void setBetrag(BigDecimal betrag) {
		this.betrag=betrag;

	}
	
	/**
	 * @see de.gammadata.business.modelle.Geld#setBetrag(double)
	 */
	public void setBetrag(String betrag) {
		this.setBetrag(new BigDecimal(betrag));

	}
	/**
	 * @see de.gammadata.business.modelle.Geld#setBetrag(double)
	 */
	public void setBetrag(double betrag) {
		this.setBetrag(Double.toString(betrag));

	}

	/**
	 * @see de.gammadata.business.modelle.Geld#setWrg(de.gammadata.business.modelle.Wrg)
	 */
	public void setWrg(WrgDO wrg) {
		this.wrg=wrg;

	}
	
	/**
	 * @see de.gammadata.business.modelle.Geld#getDoubleBetrag()
	 */

	public double getDoubleBetrag() {
		return this.betrag.doubleValue();
	}
	/**
	 * @see de.gammadata.business.modelle.Geld#subtractTo(de.gammadata.business.modelle.Geld)
	 */
	public void subtractTo(GeldDO geld) {
		this.betrag=this.betrag.subtract(geld.getBetrag());

	}
	/**
	 * @see de.gammadata.business.modelle.Geld#addTo(de.gammadata.business.modelle.Geld)
	 */
	public void addTo(GeldDO geld) {
		this.betrag=this.betrag.add(geld.getBetrag());
	}

	/**
	 * @see de.gammadata.business.modelle.Geld#divideTo(java.math.BigDecimal)
	 */
	public void divideTo(BigDecimal divisor) {
		this.betrag=this.betrag.divide(divisor, exactscale, roundingMode);
	}
	
	/**
	 * @see de.gammadata.business.modelle.Geld#multiplyTo(java.math.BigDecimal)
	 */
	public void multiplyTo(BigDecimal multiplikator) {
		this.betrag=this.betrag.multiply(multiplikator).setScale(exactscale, roundingMode);

	}

	public BigDecimal getBetrag(WrgDO zielWrg) {
		if (this.getWrg().getWrgBez().equalsIgnoreCase(zielWrg.getWrgBez())){
			return this.getBetrag(); //keine Umrechnung notwendig
		}
		else{
			double wert=this.betrag.doubleValue()*zielWrg.getKurs()/this.getWrg().getKurs();
			return new BigDecimal(wert).setScale(roundscale, roundingMode);
		}
		
	}
	
	@Override
	public String toString(){
		return wrg.getWrgSymbol()+" "+betrag.toString();
	}
	


}
