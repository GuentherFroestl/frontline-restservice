/*
 * Kontext.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 99 mit dem Namen "Kontext"
 *
 *
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Kontext extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Kontext";
	public static final int dbTabNummer = 99;
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
	public static int kontextTyp_Fn = 11;
	public static int kontextBezeichnung_Fn = 12;
	public static int _009_001_AdressDID_Fn = 13;
	public static int kontextTab_Nr_Fn = 14;
	public static int kontextTab_DID_Fn = 15;
	public static int wertTyp_1_Fn = 16;
	public static int xML_Fn = 17;
	public static int kontextTab_Mirror_1_Fn = 18;
	public static int kontextTab_Mirror_2_Fn = 19;
	public static int m_009_045_AdressAnredeAdr_Fn = 20;
	public static int m_009_013_AdressVorname_Fn = 21;
	public static int m_009_014_AdressNachname_Fn = 22;
	public static int m_009_011_AdressFirmenN1_Fn = 23;
	public static int m_009_053_AdressFirmenN2_Fn = 24;
	public static int m_009_020_AdressTel_Fn = 25;
	public static int m_009_044_Länder_PostCode_Fn = 26;
	public static int m_009_023_AdressEmail_Fn = 27;
	public static int m_009_017_AdressPLZ_Fn = 28;
	public static int m_009_018_AdressOrt_Fn = 29;
	public static int m_009_018_AdressFeld1_Fn = 30;
	public static int kontextbeschreibung_Fn = 31;
	public static int wert_1_Fn = 32;
	public static int wert_2_Fn = 33;
	public static int datum_Fn = 34;

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
	private int kontextTyp = 0;
	private java.lang.String kontextBezeichnung = "";
	private int _009_001_AdressDID = 0;
	private int kontextTab_Nr = 0;
	private int kontextTab_DID = 0;
	private int wertTyp_1 = 0;
	private java.lang.StringBuilder xML = new java.lang.StringBuilder();
	private java.lang.String kontextTab_Mirror_1 = "";
	private java.lang.String kontextTab_Mirror_2 = "";
	private java.lang.String m_009_045_AdressAnredeAdr = "";
	private java.lang.String m_009_013_AdressVorname = "";
	private java.lang.String m_009_014_AdressNachname = "";
	private java.lang.String m_009_011_AdressFirmenN1 = "";
	private java.lang.String m_009_053_AdressFirmenN2 = "";
	private java.lang.String m_009_020_AdressTel = "";
	private java.lang.String m_009_044_Länder_PostCode = "";
	private java.lang.String m_009_023_AdressEmail = "";
	private java.lang.String m_009_017_AdressPLZ = "";
	private java.lang.String m_009_018_AdressOrt = "";
	private java.lang.String m_009_018_AdressFeld1 = "";
	private java.lang.StringBuilder kontextbeschreibung = new java.lang.StringBuilder();
	private double wert_1 = 0;
	private double wert_2 = 0;
	private java.sql.Date datum = new java.sql.Date(0);
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
			new FieldSpec("kontextTyp", 11, 0, "int", null),
			new FieldSpec("kontextBezeichnung", 12, 80, "java.lang.String",
					null),
			new FieldSpec("_009_001_AdressDID", 13, 0, "int", null),
			new FieldSpec("kontextTab_Nr", 14, 0, "int", null),
			new FieldSpec("kontextTab_DID", 15, 0, "int", null),
			new FieldSpec("wertTyp_1", 16, 0, "int", null),
			new FieldSpec("xML", 17, 0, "java.lang.StringBuilder", null),
			new FieldSpec("kontextTab_Mirror_1", 18, 80, "java.lang.String",
					null),
			new FieldSpec("kontextTab_Mirror_2", 19, 80, "java.lang.String",
					null),
			new FieldSpec("m_009_045_AdressAnredeAdr", 20, 20,
					"java.lang.String", null),
			new FieldSpec("m_009_013_AdressVorname", 21, 80,
					"java.lang.String", null),
			new FieldSpec("m_009_014_AdressNachname", 22, 80,
					"java.lang.String", null),
			new FieldSpec("m_009_011_AdressFirmenN1", 23, 80,
					"java.lang.String", null),
			new FieldSpec("m_009_053_AdressFirmenN2", 24, 80,
					"java.lang.String", null),
			new FieldSpec("m_009_020_AdressTel", 25, 20, "java.lang.String",
					null),
			new FieldSpec("m_009_044_Länder_PostCode", 26, 20,
					"java.lang.String", null),
			new FieldSpec("m_009_023_AdressEmail", 27, 80, "java.lang.String",
					null),
			new FieldSpec("m_009_017_AdressPLZ", 28, 20, "java.lang.String",
					null),
			new FieldSpec("m_009_018_AdressOrt", 29, 80, "java.lang.String",
					null),
			new FieldSpec("m_009_018_AdressFeld1", 30, 80, "java.lang.String",
					null),
			new FieldSpec("kontextbeschreibung", 31, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("wert_1", 32, 0, "double", null),
			new FieldSpec("wert_2", 33, 0, "double", null),
			new FieldSpec("datum", 34, 0, "java.sql.Date", null) };

	// generierte Feldkonstanten - Ende

	public Kontext() {
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

	public void setKontextTyp(int inp) {
		kontextTyp = inp;
	}

	public int getKontextTyp()

	{
		return kontextTyp;
	}

	public void setKontextBezeichnung(java.lang.String inp) {
		kontextBezeichnung = inp;
	}

	public java.lang.String getKontextBezeichnung()

	{
		return kontextBezeichnung;
	}

	public void set_009_001_AdressDID(int inp) {
		_009_001_AdressDID = inp;
	}

	public int get_009_001_AdressDID()

	{
		return _009_001_AdressDID;
	}

	public void setKontextTab_Nr(int inp) {
		kontextTab_Nr = inp;
	}

	public int getKontextTab_Nr()

	{
		return kontextTab_Nr;
	}

	public void setKontextTab_DID(int inp) {
		kontextTab_DID = inp;
	}

	public int getKontextTab_DID()

	{
		return kontextTab_DID;
	}

	public void setWertTyp_1(int inp) {
		wertTyp_1 = inp;
	}

	public int getWertTyp_1()

	{
		return wertTyp_1;
	}

	public void setXML(java.lang.StringBuilder inp) {
		xML = inp;
	}

	public java.lang.StringBuilder getXML()

	{
		return xML;
	}

	public void setKontextTab_Mirror_1(java.lang.String inp) {
		kontextTab_Mirror_1 = inp;
	}

	public java.lang.String getKontextTab_Mirror_1()

	{
		return kontextTab_Mirror_1;
	}

	public void setKontextTab_Mirror_2(java.lang.String inp) {
		kontextTab_Mirror_2 = inp;
	}

	public java.lang.String getKontextTab_Mirror_2()

	{
		return kontextTab_Mirror_2;
	}

	public void setM_009_045_AdressAnredeAdr(java.lang.String inp) {
		m_009_045_AdressAnredeAdr = inp;
	}

	public java.lang.String getM_009_045_AdressAnredeAdr()

	{
		return m_009_045_AdressAnredeAdr;
	}

	public void setM_009_013_AdressVorname(java.lang.String inp) {
		m_009_013_AdressVorname = inp;
	}

	public java.lang.String getM_009_013_AdressVorname()

	{
		return m_009_013_AdressVorname;
	}

	public void setM_009_014_AdressNachname(java.lang.String inp) {
		m_009_014_AdressNachname = inp;
	}

	public java.lang.String getM_009_014_AdressNachname()

	{
		return m_009_014_AdressNachname;
	}

	public void setM_009_011_AdressFirmenN1(java.lang.String inp) {
		m_009_011_AdressFirmenN1 = inp;
	}

	public java.lang.String getM_009_011_AdressFirmenN1()

	{
		return m_009_011_AdressFirmenN1;
	}

	public void setM_009_053_AdressFirmenN2(java.lang.String inp) {
		m_009_053_AdressFirmenN2 = inp;
	}

	public java.lang.String getM_009_053_AdressFirmenN2()

	{
		return m_009_053_AdressFirmenN2;
	}

	public void setM_009_020_AdressTel(java.lang.String inp) {
		m_009_020_AdressTel = inp;
	}

	public java.lang.String getM_009_020_AdressTel()

	{
		return m_009_020_AdressTel;
	}

	public void setM_009_044_Länder_PostCode(java.lang.String inp) {
		m_009_044_Länder_PostCode = inp;
	}

	public java.lang.String getM_009_044_Länder_PostCode()

	{
		return m_009_044_Länder_PostCode;
	}

	public void setM_009_023_AdressEmail(java.lang.String inp) {
		m_009_023_AdressEmail = inp;
	}

	public java.lang.String getM_009_023_AdressEmail()

	{
		return m_009_023_AdressEmail;
	}

	public void setM_009_017_AdressPLZ(java.lang.String inp) {
		m_009_017_AdressPLZ = inp;
	}

	public java.lang.String getM_009_017_AdressPLZ()

	{
		return m_009_017_AdressPLZ;
	}

	public void setM_009_018_AdressOrt(java.lang.String inp) {
		m_009_018_AdressOrt = inp;
	}

	public java.lang.String getM_009_018_AdressOrt()

	{
		return m_009_018_AdressOrt;
	}

	public void setM_009_018_AdressFeld1(java.lang.String inp) {
		m_009_018_AdressFeld1 = inp;
	}

	public java.lang.String getM_009_018_AdressFeld1()

	{
		return m_009_018_AdressFeld1;
	}

	public void setKontextbeschreibung(java.lang.StringBuilder inp) {
		kontextbeschreibung = inp;
	}

	public java.lang.StringBuilder getKontextbeschreibung()

	{
		return kontextbeschreibung;
	}

	public void setWert_1(double inp) {
		wert_1 = inp;
	}

	public double getWert_1()

	{
		return wert_1;
	}

	public void setWert_2(double inp) {
		wert_2 = inp;
	}

	public double getWert_2()

	{
		return wert_2;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
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