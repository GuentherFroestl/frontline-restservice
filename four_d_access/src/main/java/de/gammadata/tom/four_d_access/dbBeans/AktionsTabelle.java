/*
 * AktionsTabelle.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 21 mit dem Namen "AktionsTabelle"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.OneObjectPointer;

/**
 * 
 * @author gfr
 */

public class AktionsTabelle extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AktionsTabelle";
	public static final int dbTabNummer = 21;
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
	public static int kBZ_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int _032_001_Artikel_DID_Fn = 13;
	public static int _014_001__AktionsGruppen_DID_Fn = 14;
	public static int verrechenbar_Fn = 15;
	public static int farbcode_Fn = 16;
	public static int m_032_011_Artikel_ArtikelNr_Fn = 17;
	public static int milestone_Fn = 18;
	public static int m_014_011_Aktionsgruppe_KBZ_Fn = 19;
	public static int listID_Fn = 20;

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
	private java.lang.String kBZ = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private int _032_001_Artikel_DID = 0;
	private int _014_001__AktionsGruppen_DID = 0;
	private boolean verrechenbar = false;
	private int farbcode = 0;
	private java.lang.String m_032_011_Artikel_ArtikelNr = "";
	private boolean milestone = false;
	private java.lang.String m_014_011_Aktionsgruppe_KBZ = "";
	private int listID = 0;
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
			new FieldSpec("kBZ", 11, 40, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_032_001_Artikel_DID", 13, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("_014_001__AktionsGruppen_DID", 14, 0, "int",
					new OneObjectPointer(14, 1, "AktionsGruppen", "dID")),
			new FieldSpec("verrechenbar", 15, 0, "boolean", null),
			new FieldSpec("farbcode", 16, 0, "int", null),
			new FieldSpec("m_032_011_Artikel_ArtikelNr", 17, 40,
					"java.lang.String", null),
			new FieldSpec("milestone", 18, 0, "boolean", null),
			new FieldSpec("m_014_011_Aktionsgruppe_KBZ", 19, 40,
					"java.lang.String", null),
			new FieldSpec("listID", 20, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public AktionsTabelle() {
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

	public void setKBZ(java.lang.String inp) {
		kBZ = inp;
	}

	public java.lang.String getKBZ()

	{
		return kBZ;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void set_014_001__AktionsGruppen_DID(int inp) {
		_014_001__AktionsGruppen_DID = inp;
	}

	public int get_014_001__AktionsGruppen_DID()

	{
		return _014_001__AktionsGruppen_DID;
	}

	public void setVerrechenbar(boolean inp) {
		verrechenbar = inp;
	}

	public boolean getVerrechenbar()

	{
		return verrechenbar;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void setM_032_011_Artikel_ArtikelNr(java.lang.String inp) {
		m_032_011_Artikel_ArtikelNr = inp;
	}

	public java.lang.String getM_032_011_Artikel_ArtikelNr()

	{
		return m_032_011_Artikel_ArtikelNr;
	}

	public void setMilestone(boolean inp) {
		milestone = inp;
	}

	public boolean getMilestone()

	{
		return milestone;
	}

	public void setM_014_011_Aktionsgruppe_KBZ(java.lang.String inp) {
		m_014_011_Aktionsgruppe_KBZ = inp;
	}

	public java.lang.String getM_014_011_Aktionsgruppe_KBZ()

	{
		return m_014_011_Aktionsgruppe_KBZ;
	}

	public void setListID(int inp) {
		listID = inp;
	}

	public int getListID()

	{
		return listID;
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
