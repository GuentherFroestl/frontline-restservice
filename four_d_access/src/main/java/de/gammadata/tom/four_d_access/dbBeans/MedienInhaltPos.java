/*
 * MedienInhaltPos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 92 mit dem Namen "MedienInhaltPos"
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

public class MedienInhaltPos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MedienInhaltPos";
	public static final int dbTabNummer = 92;
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
	public static int _064_001__Medien_DID_Fn = 11;
	public static int posNr_Fn = 12;
	public static int inhaltBez_Fn = 13;
	public static int inhaltBeschreibung_Fn = 14;
	public static int indexAngabe_Fn = 15;
	public static int dauerAngabe_Fn = 16;
	public static int angabe_1_Fn = 17;
	public static int angabe_2_Fn = 18;
	public static int angabe_3_Fn = 19;
	public static int angabe_4_Fn = 20;
	public static int angabe_5_Fn = 21;
	public static int _031_001_MediaContentLabel_DID_Fn = 22;
	public static int m_031_011_ContentTitel_Fn = 23;
	public static int m_064_011_Mediennummer_Fn = 24;

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
	private int _064_001__Medien_DID = 0;
	private int posNr = 0;
	private java.lang.String inhaltBez = "";
	private java.lang.StringBuilder inhaltBeschreibung = new java.lang.StringBuilder();
	private java.lang.String indexAngabe = "";
	private java.lang.String dauerAngabe = "";
	private java.lang.String angabe_1 = "";
	private java.lang.String angabe_2 = "";
	private java.lang.String angabe_3 = "";
	private java.lang.String angabe_4 = "";
	private java.lang.String angabe_5 = "";
	private int _031_001_MediaContentLabel_DID = 0;
	private java.lang.String m_031_011_ContentTitel = "";
	private int m_064_011_Mediennummer = 0;
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
			new FieldSpec("_064_001__Medien_DID", 11, 0, "int",
					new OneObjectPointer(64, 1, "Medien", "dID")),
			new FieldSpec("posNr", 12, 0, "int", null),
			new FieldSpec("inhaltBez", 13, 80, "java.lang.String", null),
			new FieldSpec("inhaltBeschreibung", 14, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("indexAngabe", 15, 80, "java.lang.String", null),
			new FieldSpec("dauerAngabe", 16, 80, "java.lang.String", null),
			new FieldSpec("angabe_1", 17, 80, "java.lang.String", null),
			new FieldSpec("angabe_2", 18, 80, "java.lang.String", null),
			new FieldSpec("angabe_3", 19, 80, "java.lang.String", null),
			new FieldSpec("angabe_4", 20, 80, "java.lang.String", null),
			new FieldSpec("angabe_5", 21, 80, "java.lang.String", null),
			new FieldSpec("_031_001_MediaContentLabel_DID", 22, 0, "int",
					new OneObjectPointer(31, 1, "MediaContentLabel", "dID")),
			new FieldSpec("m_031_011_ContentTitel", 23, 80, "java.lang.String",
					null),
			new FieldSpec("m_064_011_Mediennummer", 24, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public MedienInhaltPos() {
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

	public void set_064_001__Medien_DID(int inp) {
		_064_001__Medien_DID = inp;
	}

	public int get_064_001__Medien_DID()

	{
		return _064_001__Medien_DID;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setInhaltBez(java.lang.String inp) {
		inhaltBez = inp;
	}

	public java.lang.String getInhaltBez()

	{
		return inhaltBez;
	}

	public void setInhaltBeschreibung(java.lang.StringBuilder inp) {
		inhaltBeschreibung = inp;
	}

	public java.lang.StringBuilder getInhaltBeschreibung()

	{
		return inhaltBeschreibung;
	}

	public void setIndexAngabe(java.lang.String inp) {
		indexAngabe = inp;
	}

	public java.lang.String getIndexAngabe()

	{
		return indexAngabe;
	}

	public void setDauerAngabe(java.lang.String inp) {
		dauerAngabe = inp;
	}

	public java.lang.String getDauerAngabe()

	{
		return dauerAngabe;
	}

	public void setAngabe_1(java.lang.String inp) {
		angabe_1 = inp;
	}

	public java.lang.String getAngabe_1()

	{
		return angabe_1;
	}

	public void setAngabe_2(java.lang.String inp) {
		angabe_2 = inp;
	}

	public java.lang.String getAngabe_2()

	{
		return angabe_2;
	}

	public void setAngabe_3(java.lang.String inp) {
		angabe_3 = inp;
	}

	public java.lang.String getAngabe_3()

	{
		return angabe_3;
	}

	public void setAngabe_4(java.lang.String inp) {
		angabe_4 = inp;
	}

	public java.lang.String getAngabe_4()

	{
		return angabe_4;
	}

	public void setAngabe_5(java.lang.String inp) {
		angabe_5 = inp;
	}

	public java.lang.String getAngabe_5()

	{
		return angabe_5;
	}

	public void set_031_001_MediaContentLabel_DID(int inp) {
		_031_001_MediaContentLabel_DID = inp;
	}

	public int get_031_001_MediaContentLabel_DID()

	{
		return _031_001_MediaContentLabel_DID;
	}

	public void setM_031_011_ContentTitel(java.lang.String inp) {
		m_031_011_ContentTitel = inp;
	}

	public java.lang.String getM_031_011_ContentTitel()

	{
		return m_031_011_ContentTitel;
	}

	public void setM_064_011_Mediennummer(int inp) {
		m_064_011_Mediennummer = inp;
	}

	public int getM_064_011_Mediennummer()

	{
		return m_064_011_Mediennummer;
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
