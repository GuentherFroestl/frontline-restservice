/**
 * 
 */
package de.gammadata.business.modelle;

import de.gammadata.business.modelle.SteuerDO.SteuerFall;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Implementiert ein Produkt
 * @author gfr
 *
 */

public class ProduktDO extends KatalogProduktDO {
  
  public enum Einheit{STK,TSD_STK,METER,KILOMETER,QUARDRATMETER,KUBIKMETER,MIN,STD,TAG,MONAT,GRAMM,KILOGRAMM,TONNE};

	private String artikelCode;



	private SteuerDO steuer;
	
	private BigDecimal bruttoBetrag;
	private BigDecimal nettoBetrag;
	private WrgDO wrg;
	private Einheit einheit=Einheit.STK;
	
	public ProduktDO(){
		super();
	}
	
	public ProduktDO(KatalogDO katalog){
		super(katalog);
	}


	public WrgDO getWrg() {
		return wrg;
	}

	public void setWrg(WrgDO wrg) {
		this.wrg = wrg;
	}

	BigDecimal getBruttoBetrag() {
		return bruttoBetrag;
	}

	void setBruttoBetrag(BigDecimal bruttoBetrag) {
		this.bruttoBetrag = bruttoBetrag;
	}

	BigDecimal getNettoBetrag() {
		return nettoBetrag;
	}

	void setNettoBetrag(BigDecimal nettoBetrag) {
		this.nettoBetrag = nettoBetrag;
	}

	/**
	 * @see de.gammadata.business.modelle.Produkt#getArtikelCode()
	 */
	public String getArtikelCode() {
		return this.artikelCode;
	}

	/**
	 * @see de.gammadata.business.modelle.Produkt#getPreis()
	 */

	public GeldDO getNettoPreis() {
		return new GeldDO(this.nettoBetrag,this.wrg);
	}

	public GeldDO getBruttoPreis() {
		return new GeldDO(this.bruttoBetrag,this.wrg);
	}

	public SteuerDO getSteuer() {
		return this.steuer;
	}

	/**
	 * @see de.gammadata.business.modelle.Produkt#setArtikelCode(java.lang.String)
	 */
	public void setArtikelCode(String artikelCode) {
		this.artikelCode=artikelCode;

	}


	/**
	 * @see de.gammadata.business.modelle.Produkt#setPreis(de.gammadata.business.modelle.Geld)
	 */
	public void setNettoPreis(GeldDO preis) {
		if (preis!=null){
			this.nettoBetrag=preis.getBetrag();
			this.wrg=preis.getWrg();
			if (this.getSteuer()!=null){
				this.bruttoBetrag=this.nettoBetrag.add(this.getSteuer().calculateSteuerBetragVomNetto(SteuerFall.INLAND, this.nettoBetrag, new Date()));
			}
		}


	}
	
	public void setBruttoPreis(GeldDO preis) {
		if (preis!=null){
			this.bruttoBetrag=preis.getBetrag();
			this.wrg=preis.getWrg();
			if (this.getSteuer()!=null){
				this.nettoBetrag=this.bruttoBetrag.subtract(this.getSteuer().calculateSteuerBetragVomBrutto(SteuerFall.INLAND, this.bruttoBetrag, new Date()));
			}
		}

	}

	/**
	 * @see de.gammadata.business.modelle.Produkt#setSteuer(de.gammadata.business.modelle.SteuerModell)
	 */
	public void setSteuer(SteuerDO steuer) {
		this.steuer=steuer;
		if (nettoBetrag!=null&steuer!=null){
			this.bruttoBetrag=this.nettoBetrag.add(this.getSteuer().calculateSteuerBetragVomNetto(SteuerFall.INLAND, this.nettoBetrag, new Date()));
		}

	}

	public boolean isKatalog() {
		return false;
	}

	public boolean isProdukt() {
		return true;
	}

	public Einheit getEinheit() {
		return this.einheit;
	}

	public void setEinheit(Einheit einheit) {
		this.einheit=einheit;		
	}

	@Override
	public String genMatchString() {
		// TODO Auto-generated method stub
		return artikelCode+MATCH_TRENNZEICHEN
		+super.genMatchString();
	}


}
