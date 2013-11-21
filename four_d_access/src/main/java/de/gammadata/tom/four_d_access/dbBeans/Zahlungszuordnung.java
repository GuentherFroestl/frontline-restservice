/*
 * Zahlungszuordnung.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 36 mit dem Namen "Zahlungszuordnung"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Zahlungszuordnung extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Zahlungszuordnung";
	public static final int dbTabNummer = 36;
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
	public static int _069_001_Geldtransfer_DID_Fn = 11;
	public static int betrag_Fn = 12;
	public static int _005_001_WährungenDID_Fn = 13;
	public static int kurs_Fn = 14;
	public static int _005_001_RefWährungenDID_Fn = 15;
	public static int datum_Fn = 16;
	public static int betragRefWährung_Fn = 17;
	public static int soll_Haben_Fn = 18;
	public static int _006_001_KontenDID_Fn = 19;
	public static int m_006_011_KontoNr_Fn = 20;
	public static int _063_001_AusRechDID_Fn = 21;
	public static int m_063_011_AR_Nr_Fn = 22;
	public static int m_063_042_KundenName_Fn = 23;
	public static int _084_001_EinRech_DID_Fn = 24;
	public static int m_084_011_Rech_Nr_Fn = 25;
	public static int m_084_032_Lief_FirmenName_Fn = 26;
	public static int m_005_011__013_WRG_zeichen_Fn = 27;
	public static int skontoBetrag_Fn = 28;
	public static int skontoBetragRefwrg_Fn = 29;
	public static int m_069_020_Aus_Eingang_Fn = 30;

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
	private int _069_001_Geldtransfer_DID = 0;
	private double betrag = 0;
	private int _005_001_WährungenDID = 0;
	private double kurs = 0;
	private int _005_001_RefWährungenDID = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private double betragRefWährung = 0;
	private boolean soll_Haben = false;
	private int _006_001_KontenDID = 0;
	private int m_006_011_KontoNr = 0;
	private int _063_001_AusRechDID = 0;
	private int m_063_011_AR_Nr = 0;
	private java.lang.String m_063_042_KundenName = "";
	private int _084_001_EinRech_DID = 0;
	private java.lang.String m_084_011_Rech_Nr = "";
	private java.lang.String m_084_032_Lief_FirmenName = "";
	private java.lang.String m_005_011__013_WRG_zeichen = "";
	private double skontoBetrag = 0;
	private double skontoBetragRefwrg = 0;
	private boolean m_069_020_Aus_Eingang = false;
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
			new FieldSpec("_069_001_Geldtransfer_DID", 11, 0, "int", null),
			new FieldSpec("betrag", 12, 0, "double", null),
			new FieldSpec("_005_001_WährungenDID", 13, 0, "int", null),
			new FieldSpec("kurs", 14, 0, "double", null),
			new FieldSpec("_005_001_RefWährungenDID", 15, 0, "int", null),
			new FieldSpec("datum", 16, 0, "java.sql.Date", null),
			new FieldSpec("betragRefWährung", 17, 0, "double", null),
			new FieldSpec("soll_Haben", 18, 0, "boolean", null),
			new FieldSpec("_006_001_KontenDID", 19, 0, "int", null),
			new FieldSpec("m_006_011_KontoNr", 20, 0, "int", null),
			new FieldSpec("_063_001_AusRechDID", 21, 0, "int", null),
			new FieldSpec("m_063_011_AR_Nr", 22, 0, "int", null),
			new FieldSpec("m_063_042_KundenName", 23, 40, "java.lang.String",
					null),
			new FieldSpec("_084_001_EinRech_DID", 24, 0, "int", null),
			new FieldSpec("m_084_011_Rech_Nr", 25, 20, "java.lang.String", null),
			new FieldSpec("m_084_032_Lief_FirmenName", 26, 40,
					"java.lang.String", null),
			new FieldSpec("m_005_011__013_WRG_zeichen", 27, 5,
					"java.lang.String", null),
			new FieldSpec("skontoBetrag", 28, 0, "double", null),
			new FieldSpec("skontoBetragRefwrg", 29, 0, "double", null),
			new FieldSpec("m_069_020_Aus_Eingang", 30, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Zahlungszuordnung() {
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

	public void set_069_001_Geldtransfer_DID(int inp) {
		_069_001_Geldtransfer_DID = inp;
	}

	public int get_069_001_Geldtransfer_DID()

	{
		return _069_001_Geldtransfer_DID;
	}

	public void setBetrag(double inp) {
		betrag = inp;
	}

	public double getBetrag()

	{
		return betrag;
	}

	public void set_005_001_WährungenDID(int inp) {
		_005_001_WährungenDID = inp;
	}

	public int get_005_001_WährungenDID()

	{
		return _005_001_WährungenDID;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
	}

	public void set_005_001_RefWährungenDID(int inp) {
		_005_001_RefWährungenDID = inp;
	}

	public int get_005_001_RefWährungenDID()

	{
		return _005_001_RefWährungenDID;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setBetragRefWährung(double inp) {
		betragRefWährung = inp;
	}

	public double getBetragRefWährung()

	{
		return betragRefWährung;
	}

	public void setSoll_Haben(boolean inp) {
		soll_Haben = inp;
	}

	public boolean getSoll_Haben()

	{
		return soll_Haben;
	}

	public void set_006_001_KontenDID(int inp) {
		_006_001_KontenDID = inp;
	}

	public int get_006_001_KontenDID()

	{
		return _006_001_KontenDID;
	}

	public void setM_006_011_KontoNr(int inp) {
		m_006_011_KontoNr = inp;
	}

	public int getM_006_011_KontoNr()

	{
		return m_006_011_KontoNr;
	}

	public void set_063_001_AusRechDID(int inp) {
		_063_001_AusRechDID = inp;
	}

	public int get_063_001_AusRechDID()

	{
		return _063_001_AusRechDID;
	}

	public void setM_063_011_AR_Nr(int inp) {
		m_063_011_AR_Nr = inp;
	}

	public int getM_063_011_AR_Nr()

	{
		return m_063_011_AR_Nr;
	}

	public void setM_063_042_KundenName(java.lang.String inp) {
		m_063_042_KundenName = inp;
	}

	public java.lang.String getM_063_042_KundenName()

	{
		return m_063_042_KundenName;
	}

	public void set_084_001_EinRech_DID(int inp) {
		_084_001_EinRech_DID = inp;
	}

	public int get_084_001_EinRech_DID()

	{
		return _084_001_EinRech_DID;
	}

	public void setM_084_011_Rech_Nr(java.lang.String inp) {
		m_084_011_Rech_Nr = inp;
	}

	public java.lang.String getM_084_011_Rech_Nr()

	{
		return m_084_011_Rech_Nr;
	}

	public void setM_084_032_Lief_FirmenName(java.lang.String inp) {
		m_084_032_Lief_FirmenName = inp;
	}

	public java.lang.String getM_084_032_Lief_FirmenName()

	{
		return m_084_032_Lief_FirmenName;
	}

	public void setM_005_011__013_WRG_zeichen(java.lang.String inp) {
		m_005_011__013_WRG_zeichen = inp;
	}

	public java.lang.String getM_005_011__013_WRG_zeichen()

	{
		return m_005_011__013_WRG_zeichen;
	}

	public void setSkontoBetrag(double inp) {
		skontoBetrag = inp;
	}

	public double getSkontoBetrag()

	{
		return skontoBetrag;
	}

	public void setSkontoBetragRefwrg(double inp) {
		skontoBetragRefwrg = inp;
	}

	public double getSkontoBetragRefwrg()

	{
		return skontoBetragRefwrg;
	}

	public void setM_069_020_Aus_Eingang(boolean inp) {
		m_069_020_Aus_Eingang = inp;
	}

	public boolean getM_069_020_Aus_Eingang()

	{
		return m_069_020_Aus_Eingang;
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