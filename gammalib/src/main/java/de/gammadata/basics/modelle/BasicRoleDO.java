package de.gammadata.basics.modelle;



/**
 * @author gfr
 *
 */

public class BasicRoleDO extends ValidityDO{
  
  	public static enum RoleConstraint {NONE,XOR_SAME_TYPE};
	
	private KontaktDO bezugsKontakt;
	private RoleConstraint constraint=RoleConstraint.XOR_SAME_TYPE;

	/**
	 * 
	 * @see de.gammadata.basics.modelle.BusinessRole#getBezugsKontakt()
	 */

	public KontaktDO getBezugsKontakt() {
		return this.bezugsKontakt;
	}

	/**
	 * @see de.gammadata.basics.modelle.BusinessRole#getRoleConstraint()
	 */

	public RoleConstraint getRoleConstraint() {
		return this.constraint;
	}

	/**
	 * @see de.gammadata.basics.modelle.BusinessRole#hasNoConstraints(de.gammadata.basics.modelle.BusinessRole)
	 */

	public boolean hasNoConstraints(BusinessRole roleToCompare) {
		// TODO Auto-generated method stub
		return true;
	}


	/**
	 * @see de.gammadata.basics.modelle.BusinessRole#setBezugsKontakt(de.gammadata.basics.modelle.Kontakt)
	 */
	public void setBezugsKontakt(KontaktDO kontakt) {
		this.bezugsKontakt=kontakt;

	}

	/**
	 * @see de.gammadata.basics.modelle.BusinessRole#setRoleConstraint(de.gammadata.basics.modelle.BusinessRole.RoleConstraint)
	 */
	public void setRoleConstraint(RoleConstraint constraint) {
		this.constraint=constraint;

	}

	/**
	 * Verwendung von Delegation
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptAdresse()
	 */

	public AdresseDO getHauptAdresse() {
		return getBezugsKontakt()==null ? null : getBezugsKontakt().getHauptAdresse();
	}

	/**
	 * Verwendung von Delegation
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getHauptEmailAdresse()
	 */

	public EmailAdresseDO getHauptEmailAdresse() {
		return getBezugsKontakt()==null ? null : getBezugsKontakt().getHauptEmailAdresse();
	}

	/**
	 * Verwendung von Delegation
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#getNamenString()
	 */

	public String getNamenString() {
		return getBezugsKontakt()==null ? null : getBezugsKontakt().getNamenString();
	}

	/**
	 * Verwendung von Delegation
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptAdresse(de.gammadata.basics.modelle.AdresseDO, boolean)
	 */

	public void setHauptAdresse(AdresseDO adresse) {
		if (getBezugsKontakt()!=null){
			getBezugsKontakt().setHauptAdresse(adresse);
		}

	}

	/**
	 * Verwendung von Delegation
	 * @see de.gammadata.basics.modelle.KontaktHauptDaten#setHauptEmailAdresse(de.gammadata.basics.modelle.EmailAdresseDO, boolean)
	 */

	public void setHauptEmailAdresse(EmailAdresseDO email) {
		if (getBezugsKontakt()!=null){
			getBezugsKontakt().setHauptEmailAdresse(email);
		}

	}
	
	public String genMatchString() {
		StringBuilder sb = new StringBuilder();	
		
		
		if (getBezugsKontakt()!=null)
			sb.append(MATCH_TRENNZEICHEN+getBezugsKontakt().genMatchString());
		
		return sb.toString();
	}



}
