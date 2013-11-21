/*
 * Versandarten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 41 mit dem Namen "Versandarten"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class SteuerBetraege extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "SteuerBeträge";
	public static final int dbTabNummer = 107;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int dL_Fn = 2;
	public static int dEAM_Fn = 3;
	public static int dEVON_Fn = 4;
	public static int dGAM_Fn = 5;
	public static int dMandant_Fn = 6;
	public static int dGVON_Fn = 7;
	public static int dG_Fn = 8;
	public static int dStandort_Fn = 9;
	public static int dDEL_Fn = 10;
	public static int _003_001_SteuersätzeDID_Fn = 11;
	public static int m_003_012_SteuersatzIL_fn = 12;
	public static int m_003_011_Steuersatzbez_fn = 13;
	public static int betrag_fn = 14;
	public static int belegTab_fn = 15;
	public static int belegDID_fn = 16;
	public static int bruttoBetrag_fn = 17;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private boolean dL = false;
	private java.sql.Date dEAM = new java.sql.Date(0);
	private int dEVON = 0;
	private java.sql.Date dGAM = new java.sql.Date(0);
	private int dMandant = 0;
	private int dGVON = 0;
	private boolean dG = false;
	private int dStandort = 0;
	private boolean dDEL = false;
	private int _003_001_SteuersätzeDID = 0;
	private double m_003_012_SteuersatzIL = 0.;
	private String m_003_011_Steuersatzbez;
	private double betrag;
	private int belegTab;
	private int belegDID;
	private double bruttoBetrag;

	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("dL", 2, 0, "boolean", null),
			new FieldSpec("dEAM", 3, 0, "java.sql.Date", null),
			new FieldSpec("dEVON", 4, 0, "int", null),
			new FieldSpec("dGAM", 5, 0, "java.sql.Date", null),
			new FieldSpec("dMandant", 6, 0, "int", null),
			new FieldSpec("dGVON", 7, 0, "int", null),
			new FieldSpec("dG", 8, 0, "boolean", null),
			new FieldSpec("dStandort", 9, 0, "int", null),
			new FieldSpec("dDEL", 10, 0, "boolean", null),
			new FieldSpec("_003_001_SteuersätzeDID", 11, 0, "int", null),
			new FieldSpec("m_003_012_SteuersatzIL", 12, 0, "double", null),
			new FieldSpec("m_003_011_Steuersatzbez", 13, 5, "java.lang.String",
					null), new FieldSpec("betrag", 14, 0, "double", null),
			new FieldSpec("belegTab", 15, 0, "int", null),
			new FieldSpec("belegDID", 16, 0, "int", null),
			new FieldSpec("bruttoBetrag", 17, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	/**
	 * @return the steuersatzbez
	 */
	public String getM_003_011_Steuersatzbez() {
		return m_003_011_Steuersatzbez;
	}

	/**
	 * @param steuersatzbez
	 *            the steuersatzbez to set
	 */
	public void setM_003_011_Steuersatzbez(String steuersatzbez) {
		this.m_003_011_Steuersatzbez = steuersatzbez;
	}

	/**
	 * @return the m_003_012_SteuersatzIL
	 */
	public double getM_003_012_SteuersatzIL() {
		return m_003_012_SteuersatzIL;
	}

	/**
	 * @param m_003_012_SteuersatzIL
	 *            the m_003_012_SteuersatzIL to set
	 */
	public void setM_003_012_SteuersatzIL(double m_003_012_SteuersatzIL) {
		this.m_003_012_SteuersatzIL = m_003_012_SteuersatzIL;
	}

	/**
	 * @return the betrag
	 */
	public double getBetrag() {
		return betrag;
	}

	/**
	 * @param betrag
	 *            the betrag to set
	 */
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	/**
	 * @return the belegTab
	 */
	public int getBelegTab() {
		return belegTab;
	}

	/**
	 * @param belegTab
	 *            the belegTab to set
	 */
	public void setBelegTab(int belegTab) {
		this.belegTab = belegTab;
	}

	/**
	 * @return the belegDID
	 */
	public int getBelegDID() {
		return belegDID;
	}

	/**
	 * @param belegDID
	 *            the belegDID to set
	 */
	public void setBelegDID(int belegDID) {
		this.belegDID = belegDID;
	}

	/**
	 * @return the bruttoBetrag
	 */
	public double getBruttoBetrag() {
		return bruttoBetrag;
	}

	/**
	 * @param bruttoBetrag
	 *            the bruttoBetrag to set
	 */
	public void setBruttoBetrag(double bruttoBetrag) {
		this.bruttoBetrag = bruttoBetrag;
	}

	/**
	 * @return the steuersätzeDID
	 */
	public int get_003_001_SteuersätzeDID() {
		return _003_001_SteuersätzeDID;
	}

	/**
	 * @param _003_001_SteuersätzeDID
	 *            the _003_001_SteuersätzeDID to set
	 */
	public void set_003_001_SteuersätzeDID(int _003_001_SteuersätzeDID) {
		this._003_001_SteuersätzeDID = _003_001_SteuersätzeDID;
	}

	public SteuerBetraege() {
		super();
	}

	// generierte getter/setter - Anfang

	@Override
	public void setDID(int inp) {
		dID = inp;
	}

	@Override
	public int getDID()

	{
		return dID;
	}

	public void setDL(boolean inp) {
		dL = inp;
	}

	public boolean getDL()

	{
		return dL;
	}

	public void setDEAM(java.sql.Date inp) {
		dEAM = inp;
	}

	public java.sql.Date getDEAM()

	{
		return dEAM;
	}

	public void setDEVON(int inp) {
		dEVON = inp;
	}

	public int getDEVON()

	{
		return dEVON;
	}

	public void setDGAM(java.sql.Date inp) {
		dGAM = inp;
	}

	public java.sql.Date getDGAM()

	{
		return dGAM;
	}

	public void setDMandant(int inp) {
		dMandant = inp;
	}

	public int getDMandant()

	{
		return dMandant;
	}

	public void setDGVON(int inp) {
		dGVON = inp;
	}

	public int getDGVON()

	{
		return dGVON;
	}

	public void setDG(boolean inp) {
		dG = inp;
	}

	public boolean getDG()

	{
		return dG;
	}

	public void setDStandort(int inp) {
		dStandort = inp;
	}

	public int getDStandort()

	{
		return dStandort;
	}

	public void setDDEL(boolean inp) {
		dDEL = inp;
	}

	public boolean getDDEL()

	{
		return dDEL;
	}

	// generierte getter/setter - Ende

	// Interfaceroutinen

	@Override
	public String getXmlClassTag() {
		return xmlClassTag;
	}

	@Override
	public int getDbTabNummer() {
		return dbTabNummer;
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs() {
		return fieldSpecs;
	}

	public void setFieldSpecs(de.gammadata.tom.four_d_access.xml.FieldSpec[] inp) {
		fieldSpecs = inp;
	}

	@Override
	public int[] getFieldList() {
		if (super.getFieldList() != null) {
			return super.getFieldList();
		} else {
			int[] fl = new int[fieldSpecs.length];
			for (int i = 0; i < fieldSpecs.length; i++) {
				fl[i] = i + 1; // Alle verfügbaren Feldnummern erzeugen
			}

			super.setFieldList(fl);
			return fl;
		}

	}

}
