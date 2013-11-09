/**
 * 
 */
package de.gammadata.basics.modelle;

import java.util.ArrayList;
import java.util.List;




/**
 * Oberklasse für alle Kontaktarten wie Perso, Firma, Org ..
 * @author gfr
 *
 */

public class KontaktDO extends PersistenceDO{

	private List<AdresseDO> adressenListe;
	private List<BasicRoleDO> businessRollenListe;
	private List<KommAdresseDO> kommAdressenListe;
	private KundenRolleDO kundenRolle;
	private AdresseDO hauptAdresse;
	private EmailAdresseDO hauptEmailAdresse;
	private String name;
	private String uuid;	

	public String getName() {
		return this.name;
	}
	/**
	 * @see de.gammadata.basics.modelle.KontaktModell#setName()
	 */
	public void setName(String name) {
		this.name=name;
		
	}



	public boolean addBusinessRolle(BasicRoleDO rolle) {
		if (rolle==null)
			return false;
		if (getBusinessRollenList()==null)
			setBusinessRollenList(new ArrayList<BasicRoleDO>());
		getBusinessRollenList().add(rolle);
		rolle.setBezugsKontakt(this);
		return true;
	}


	public List<AdresseDO> getAdressenListe() {
		return this.adressenListe;
	}



	public List<BasicRoleDO> getBusinessRollenList() {
		return this.businessRollenListe;
	}


	public List<KommAdresseDO> getKommAdressenListe() {
		return this.kommAdressenListe;
	}


	public KundenRolleDO getKundenRolle() {
		return this.kundenRolle;
	}
	/**
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptAdresse()
	 */

	public AdresseDO getHauptAdresse() {
		return this.hauptAdresse;
	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptEmailAdresse()
	 */

	public EmailAdresseDO getHauptEmailAdresse() {
		return this.hauptEmailAdresse;
	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktModell#setAdressenListe(java.util.List)
	 */
	public void setAdressenListe(List<AdresseDO> adressenListe) {
		this.adressenListe=adressenListe;

	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktModell#setBusinessRollenList(java.util.List)
	 */
	public void setBusinessRollenList(List<BasicRoleDO> rollenListe) {
		this.businessRollenListe=rollenListe;

	}
	

	/**
	 * @see de.gammadata.basics.modelle.KontaktModell#setKommAdressenListe(java.util.List)
	 */
	public void setKommAdressenListe(List<KommAdresseDO> kommAdressenListe) {
		this.kommAdressenListe=kommAdressenListe;

	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktModell#setKundenRolle(de.gammadata.basics.modelle.KundenRolle)
	 */
	public void setKundenRolle(KundenRolleDO kundenRolle) {
		if (kundenRolle==null)
			return;
		this.kundenRolle=kundenRolle;
		kundenRolle.setBezugsKontakt(this);

	}



	/**
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getNamenString()
	 */

	public String getNamenString() {
		return this.name;
	}

	public String getAdressString(){
		if (this.getHauptAdresse()==null)
			return "";
		return this.getHauptAdresse().getFormattetAdressString(MATCH_TRENNZEICHEN, MATCH_TRENNZEICHEN);
	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptAdresse(de.gammadata.basics.modelle.AdresseDO)
	 */
	public void setHauptAdresse(AdresseDO adresse) {
		this.hauptAdresse=adresse;

	}

	/**
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptEmailAdresse(de.gammadata.basics.modelle.EmailAdresseDO)
	 */
	public void setHauptEmailAdresse(EmailAdresseDO email) {
		this.hauptEmailAdresse=email;

	}
	public boolean addKommAdresse(KommAdresseDO kommAdresse) {
		if (kommAdresse==null)
			return false;
		if (this.getKommAdressenListe()==null)
			this.kommAdressenListe = new ArrayList<KommAdresseDO>();
		this.kommAdressenListe.add(kommAdresse);
		return false;
	}
	
	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid=uuid;
		
	}
	


	public String genMatchString() {
		StringBuilder sb = new StringBuilder();	
		sb.append(name);
		if (getHauptAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getHauptAdresse().genMatchString());
		if (getHauptEmailAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getHauptEmailAdresse().genMatchString());
		
		return sb.toString();
	}

}
