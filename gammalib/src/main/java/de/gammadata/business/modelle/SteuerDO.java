/**
 * 
 */
package de.gammadata.business.modelle;

import java.math.BigDecimal;
import java.util.Date;


import de.gammadata.basics.modelle.PersistenceDO;

/**
 * Implementiert Steuer
 * @author gfr
 *
 */

public class SteuerDO extends PersistenceDO {
  
  	public enum SteuerFall{INLAND,EU,EXPORT}

	private String bezeichnung;
	private BigDecimal steuersatz=new BigDecimal("0");
	private BigDecimal bruttoMultiplier=null;
	private BigDecimal nettoMultiplier=null;
	private Date gültigAb;
	private Date gültigBis;
	private SteuerDO nachfolgeSteuer;
	private SteuerDO vorgängerSteuer;
	private boolean valid;



	/**
	 * @see de.gammadata.business.modelle.SteuerModell#getBezeichnung()
	 */
	public String getBezeichnung() {
		return this.bezeichnung;
	}

	/**
	 * @see de.gammadata.business.modelle.SteuerModell#getSteuersatz()
	 */
	public BigDecimal getSteuersatz() {
		return this.steuersatz;
	}

	/**
	 * @see de.gammadata.business.modelle.SteuerModell#setBezeichnung(java.lang.String)
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung=bezeichnung;

	}

	/**
	 * @see de.gammadata.business.modelle.SteuerModell#setSteuersatz(java.math.BigDecimal)
	 */
	public void setSteuersatz(BigDecimal steuersatz) {
		this.steuersatz=steuersatz;
		bruttoMultiplier=null;

	}
	/**
	 * 
	 * @return true, wenn Steuer aktuell gültig ist
	 */
	public boolean isValid() {
		return valid;
	}
	/**
	 * 
	 * @param isValid true, wenn Steuer aktuell gültig ist
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Date getGültigAb() {
		return this.gültigAb;
	}
	

	public Date getGültigBis() {
		return this.gültigBis;
	}

	public SteuerDO getNachfolgeSteuer() {
		return this.nachfolgeSteuer;
	}
	

	public SteuerDO getVorgängerSteuer() {
		return this.vorgängerSteuer;
	}

	public void setGültigAb(Date anfangsDatum) {
		this.gültigAb=anfangsDatum;
		
	}

	public void setGültigBis(Date ablaufDatum) {
		this.gültigBis=ablaufDatum;
		
	}

	public void setNachfolgeSteuer(SteuerDO nachfolgeSteuer) {
		this.nachfolgeSteuer=nachfolgeSteuer;
		
	}
	
	public void setVorgängerSteuer(SteuerDO vorgängerSteuer) {
		this.vorgängerSteuer=vorgängerSteuer;
		
	}

	public BigDecimal calculateSteuerBetragVomBrutto(SteuerFall fall,
			BigDecimal betrag, Date leistungsdatum) {
		if (fall.compareTo(SteuerFall.INLAND)!=0){
			return new BigDecimal("0");
		}
		BigDecimal netto = betrag.multiply(getValidSteuer(leistungsdatum).getBruttoMultiplier());
		BigDecimal steuer = betrag.subtract(netto);
		return steuer;
	}
	/**
	 * Vom Nettobetrag wird, je nach Steuerfall, der Steuerbetrag berechnet
	 * @param fall SteuerFall
	 * @param betrag Bemessungsbetrag
	 * @param Date leistungsDatum um bei Änderungen des Steuersatzes flexibel reagieren zu können
	 * @return Steuerbetrag BigDecimal 
	 */

	public BigDecimal calculateSteuerBetragVomNetto(SteuerFall fall,
			BigDecimal betrag, Date leistungsdatum) {
		if (fall.compareTo(SteuerFall.INLAND)!=0){
			return new BigDecimal("0");
		}
		BigDecimal steuer = betrag.multiply(getValidSteuer(leistungsdatum).getNettoMultiplier());
		return steuer;

	}

	BigDecimal getBruttoMultiplier(){
		if (bruttoMultiplier==null){
			BigDecimal f = new BigDecimal("100").add(steuersatz);
			bruttoMultiplier = new BigDecimal("100").divide(f, GeldDO.exactscale, GeldDO.roundingMode);
		}
		return bruttoMultiplier;
	}

	BigDecimal getNettoMultiplier(){
		if (nettoMultiplier==null){
			nettoMultiplier=steuersatz.divide(new BigDecimal("100"), GeldDO.exactscale, GeldDO.roundingMode);
		}
		return nettoMultiplier;
	}

	public SteuerDO getValidSteuer(Date leistungsdatum){
		if (leistungsdatum==null||gültigAb==null)
			return this;
		if (leistungsdatum.before(gültigAb)&&(getVorgängerSteuer()!=null)){
			return getVorgängerSteuer().getValidSteuer(leistungsdatum); //Leistungsdatum im Bereich des Vorgängers
		}
		if (gültigBis!=null&&leistungsdatum.after(gültigBis)&&getNachfolgeSteuer()!=null){
			return getNachfolgeSteuer().getValidSteuer(leistungsdatum); //Leistungsdatum im Bereich des Nachfolgers
		}
		
		return this;	//Der gültige Steuersatz ist dieser	
	}


	@Override
	public String genMatchString() {
		return bezeichnung+MATCH_TRENNZEICHEN
		+steuersatz.setScale(2, GeldDO.roundingMode)+MATCH_TRENNZEICHEN;
	}

	


}
