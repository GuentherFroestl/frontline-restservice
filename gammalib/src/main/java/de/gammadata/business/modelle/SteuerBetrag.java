/**
 * 
 */
package de.gammadata.business.modelle;

/**
 * Klasse und die Impl. modellieren den Steuerbetrag für eine Steuerart
 * es gibt eine referenz auf die Steuer und die Brutto/Netto Beträge
 * @author gfr
 *
 */
public interface SteuerBetrag {
	/**
	 * 
	 * @return SteuerDO die Steuer
	 */
	public SteuerDO getSteuer();
	/**
	 * 
	 * @param steuer SteuerDO die Steuer
	 */
	public void setSteuer(SteuerDO steuer);
	/**
	 * 
	 * @return BelegDO zugehöriger Beleg
	 */
	public BelegDO getBeleg();
	/**
	 * 
	 * @param beleg BelegDO zugehöriger Beleg
	 */
	public void setBelegDO(BelegDO beleg);
	/**
	 * 
	 * @return GeldDO die NettoSumme
	 */
	public GeldDO getNettoSumme();
	/**
	 * 
	 * @param nettoSumme GeldDO die NettoSumme
	 */
	public void setNettoSumme(GeldDO nettoSumme);
	
	/**
	 * 
	 * @return GeldDO die BruttoSumme
	 */
	public GeldDO getBruttoSumme();
	/**
	 * 
	 * @param bruttoSumme GeldDO die BruttoSumme
	 */
	public void setBruttoSumme(GeldDO bruttoSumme);
	/**
	 * 
	 * @return GeldDO Steuersumme, als Komfortroutine
	 */
	public GeldDO getSteuerSumme();
	

}
