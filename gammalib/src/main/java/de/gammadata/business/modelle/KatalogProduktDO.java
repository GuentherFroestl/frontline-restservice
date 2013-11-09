/**
 * 
 */
package de.gammadata.business.modelle;



import de.gammadata.basics.modelle.PersistenceDO;

/**
 * Implementierung der Composite Klasse KatalogProdukt
 * @author gfr
 *
 */

public abstract class KatalogProduktDO extends PersistenceDO {


	private KatalogProduktDO parent;
	private String bezeichnung;
	private String beschreibung;
	
	
	public KatalogProduktDO(){
		super();
	}
	
	public KatalogProduktDO(KatalogDO katalog){
		super();
		setParent(katalog);
	}

	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#getName()
	 */
	public String getBezeichnung(){
		return this.bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung=bezeichnung;
	}
	

	/**
	 * @see de.gammadata.business.modelle.Produkt#getBeschreibung()
	 */
	public String getBeschreibung() {
		return this.beschreibung;
	}

	/**
	 * @see de.gammadata.business.modelle.Produkt#setBeschreibung(java.lang.String)
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung=beschreibung;
	}


	public KatalogProduktDO getParent() {
		return this.parent;
	}


	public boolean isRoot() {
		return (this.parent==null);
	}


	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#setParent(de.gammadata.business.modelle.KatalogProdukt)
	 */
	public void setParent(KatalogProduktDO katalogProdukt) {
		this.parent=katalogProdukt;

	}
	
	@Override
	public String genMatchString() {
		return bezeichnung+MATCH_TRENNZEICHEN
		+beschreibung;
	}

}
