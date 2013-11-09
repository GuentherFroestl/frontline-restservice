/**
 * 
 */
package de.gammadata.business.modelle;

import java.util.ArrayList;
import java.util.List;


/**
 * @author gfr
 *
 */


public class KatalogDO extends KatalogProduktDO {

	private List<KatalogProduktDO> katalogProduktListe;
	private String katalogXmlFile;

	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#isKatalog()
	 */

	public boolean isKatalog() {
		return true;
	}

	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#isProdukt()
	 */

	public boolean isProdukt() {
		return false;
	}
	

	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#getKatalogProduktList()
	 */

	public List<KatalogProduktDO> getKatalogProduktList() {
		if (katalogProduktListe==null){
			
			katalogProduktListe=new ArrayList<KatalogProduktDO>();
		}
		return this.katalogProduktListe;
	}

	/**
	 * @see de.gammadata.business.modelle.KatalogProdukt#setKatalogProduktList(java.util.List)
	 */
	public void setKatalogProduktList(List<KatalogProduktDO> katalogProduktListe) {
		this.katalogProduktListe=katalogProduktListe;

	}

	public void add(KatalogProduktDO katalogProdukt) {
		katalogProdukt.setParent(this);
		getKatalogProduktList().add(katalogProdukt);
		
	}

	public void remove(KatalogProduktDO katalogProdukt) {
		getKatalogProduktList().remove(katalogProdukt);
		katalogProdukt.setParent(null);
		
	}

	/* (non-Javadoc)
	 * @see de.gammadata.business.modelle.Katalog#getKatalogXmlFile()
	 */
	public String getKatalogXmlFile() {
		return katalogXmlFile;
	}

	/* (non-Javadoc)
	 * @see de.gammadata.business.modelle.Katalog#setKatalogXmlFile(java.lang.String)
	 */
	public void setKatalogXmlFile(String file) {
		this.katalogXmlFile=file;
		
	}

}
