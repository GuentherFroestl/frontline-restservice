/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.PersistenceDO;
import java.beans.Transient;
import java.math.BigDecimal;


public class SteuerBetragDO extends PersistenceDO {

	private BelegDO beleg;
	private BigDecimal bruttoBetrag;
	private BigDecimal nettoBetrag;
	private WrgDO wrg;
	private SteuerDO steuer;
	
	public SteuerBetragDO(){
		super();
	}
	
	public SteuerBetragDO(SteuerDO steuer,WrgDO wrg){
		super();
		setSteuer(steuer);
		setWrg(wrg);
		bruttoBetrag = new BigDecimal("0").setScale(GeldDO.exactscale, GeldDO.roundingMode);
		nettoBetrag = new BigDecimal("0").setScale(GeldDO.exactscale, GeldDO.roundingMode);
	}
	
	public BigDecimal getBruttoBetrag() {
		return bruttoBetrag;
	}

	public void setBruttoBetrag(BigDecimal bruttoBetrag) {
		this.bruttoBetrag = bruttoBetrag;
	}

	public BigDecimal getNettoBetrag() {
		return nettoBetrag;
	}

	public void setNettoBetrag(BigDecimal nettoBetrag) {
		this.nettoBetrag = nettoBetrag;
	}

	public WrgDO getWrg() {
		return wrg;
	}

	public void setWrg(WrgDO wrg) {
		this.wrg = wrg;
	}

	public void setBeleg(BelegDO beleg) {
		this.beleg = beleg;
	}



	public GeldDO getBruttoSumme() {
		return new GeldDO(bruttoBetrag,wrg);
	}


	public GeldDO getNettoSumme() {
		return new GeldDO(nettoBetrag,wrg);
	}
	
	@Transient
	public GeldDO getSteuerSumme() {
		if (nettoBetrag==null||bruttoBetrag==null)
			return new GeldDO(new BigDecimal("0"),wrg);
		BigDecimal steuersumme = bruttoBetrag.subtract(nettoBetrag).setScale(GeldDO.roundscale, GeldDO.roundingMode);
		return new GeldDO(steuersumme,wrg);
	}

	public SteuerDO getSteuer() {
		return this.steuer;
	}

	/**
	 * @see de.gammadata.business.modelle.SteuerBetrag#setBruttoSumme(de.gammadata.business.modelle.GeldDO)
	 */
	public void setBruttoSumme(GeldDO bruttoSumme) {
		this.bruttoBetrag=bruttoSumme.getBetrag();
	}

	/**
	 * @see de.gammadata.business.modelle.SteuerBetrag#setNettoSumme(de.gammadata.business.modelle.GeldDO)
	 */
	public void setNettoSumme(GeldDO nettoSumme) {
		this.nettoBetrag=nettoSumme.getBetrag();

	}

	/**
	 * @see de.gammadata.business.modelle.SteuerBetrag#setSteuer(de.gammadata.business.modelle.SteuerDO)
	 */
	public void setSteuer(SteuerDO steuer) {
		this.steuer=steuer;

	}

	public BelegDO getBeleg() {
		return this.beleg;
	}

	public void setBelegDO(BelegDO beleg) {
		this.beleg=beleg;
		
	}

	@Override
	public String genMatchString() {
		// TODO Auto-generated method stub
		return null;
	}


}
