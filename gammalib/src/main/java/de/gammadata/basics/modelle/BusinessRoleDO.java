/**
 * 
 */
package de.gammadata.basics.modelle;

import java.util.ArrayList;
import java.util.List;



/**
 * @author gfr
 *
 */


public class BusinessRoleDO extends BasicRoleDO{

//	private KontaktDO bezugsKontakt;
//	private RoleConstraint constraint=RoleConstraint.XOR_SAME_TYPE;
//
//	/**
//	 * 
//	 * @see de.gammadata.basics.modelle.BusinessRole#getBezugsKontakt()
//	 */
//	@OneToOne(cascade = CascadeType.REFRESH)
//	public KontaktDO getBezugsKontakt() {
//		return this.bezugsKontakt;
//	}
//
//	/**
//	 * @see de.gammadata.basics.modelle.BusinessRole#getRoleConstraint()
//	 */
//	@Enumerated(EnumType.STRING)
//	public RoleConstraint getRoleConstraint() {
//		return this.constraint;
//	}
//
//	/**
//	 * @see de.gammadata.basics.modelle.BusinessRole#hasNoConstraints(de.gammadata.basics.modelle.BusinessRole)
//	 */
//	@Transient
//	public boolean hasNoConstraints(BusinessRole roleToCompare) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//
//	/**
//	 * @see de.gammadata.basics.modelle.BusinessRole#setBezugsKontakt(de.gammadata.basics.modelle.Kontakt)
//	 */
//	public void setBezugsKontakt(KontaktDO kontakt) {
//		this.bezugsKontakt=kontakt;
//
//	}
//
//	/**
//	 * @see de.gammadata.basics.modelle.BusinessRole#setRoleConstraint(de.gammadata.basics.modelle.BusinessRole.RoleConstraint)
//	 */
//	public void setRoleConstraint(RoleConstraint constraint) {
//		this.constraint=constraint;
//
//	}
//
//	/**
//	 * Verwendung von Delegation
//	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptAdresse()
//	 */
//	@Transient
//	public AdresseDO getHauptAdresse() {
//		return getBezugsKontakt()==null ? null : getBezugsKontakt().getHauptAdresse();
//	}
//
//	/**
//	 * Verwendung von Delegation
//	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptEmailAdresse()
//	 */
//	@Transient
//	public EmailAdresseDO getHauptEmailAdresse() {
//		return getBezugsKontakt()==null ? null : getBezugsKontakt().getHauptEmailAdresse();
//	}
//
//	/**
//	 * Verwendung von Delegation
//	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getNamenString()
//	 */
//	@Transient
//	public String getNamenString() {
//		return getBezugsKontakt()==null ? null : getBezugsKontakt().getNamenString();
//	}
//
//	/**
//	 * Verwendung von Delegation
//	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptAdresse(de.gammadata.basics.modelle.AdresseDO, boolean)
//	 */
//	@Transient
//	public void setHauptAdresse(AdresseDO adresse) {
//		if (getBezugsKontakt()!=null){
//			getBezugsKontakt().setHauptAdresse(adresse);
//		}
//
//	}
//
//	/**
//	 * Verwendung von Delegation
//	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptEmailAdresse(de.gammadata.basics.modelle.EmailAdresseDO, boolean)
//	 */
//	@Transient
//	public void setHauptEmailAdresse(EmailAdresseDO email) {
//		if (getBezugsKontakt()!=null){
//			getBezugsKontakt().setHauptEmailAdresse(email);
//		}
//
//	}
	

	private int nummer;
	private String steuerNummer;
	private String ustId;
	private String uuid;


	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#getNummer()
	 */
	public int getNummer() {
		return this.nummer;
	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#getSteuerNummer()
	 */
	public String getSteuerNummer() {
		return this.steuerNummer;
	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#getUstId()
	 */
	public String getUstId() {
		return this.ustId;
	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#getUuid()
	 */
	public String getUuid() {
		return this.uuid;
	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#setNummer(int)
	 */
	public void setNummer(int nummer) {
		this.nummer=nummer;

	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#setSteuerNummer(java.lang.String)
	 */
	public void setSteuerNummer(String steuerNummer) {
		this.steuerNummer=steuerNummer;

	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#setUstId(java.lang.String)
	 */
	public void setUstId(String ustId) {
		this.ustId=ustId;

	}

	/**
	 * @see de.gammadata.business.modelle.BusinessPartner#setUuid(java.lang.String)
	 */
	public void setUuid(String uuid) {
		this.uuid=uuid;

	}
	
	private List<AnsprechpartnerRolleDO> ansprechpartnerRollenListe;

	/**
	 * @see de.gammadata.basics.modelle.BusinessUnitRole#getAnsprechpartnerRollenListe()
	 */

	public List<AnsprechpartnerRolleDO> getAnsprechpartnerRollenListe() {
		return this.ansprechpartnerRollenListe;
	}

	/**
	 * @see de.gammadata.basics.modelle.BusinessUnitRole#setAnsprechpartnerRollenListe(java.util.List)
	 */
	public void setAnsprechpartnerRollenListe(
			List<AnsprechpartnerRolleDO> ansprechpartnerRollenListe) {
		this.ansprechpartnerRollenListe=ansprechpartnerRollenListe;

	}
	/**
	 * @see de.gammadata.basics.modelle.BusinessUnitRole#addAnsprechPartner(AnsprechpartnerRolle)
	 */

	public boolean addAnsprechPartner(AnsprechpartnerRolleDO ansprechPartner) {
		if (ansprechPartner==null)
			return false;
		if (getAnsprechpartnerRollenListe()==null)
			setAnsprechpartnerRollenListe(new ArrayList<AnsprechpartnerRolleDO>());
		getAnsprechpartnerRollenListe().add(ansprechPartner);
		ansprechPartner.setBusinessUnit(this);
		return true;
	}
	


	public String genMatchString() {
		StringBuilder sb = new StringBuilder();	
		sb.append(super.genMatchString());
		
		sb.append(Integer.toString(nummer)+MATCH_TRENNZEICHEN
				+ustId+MATCH_TRENNZEICHEN
				+steuerNummer);
		
		return sb.toString();
	}


}
