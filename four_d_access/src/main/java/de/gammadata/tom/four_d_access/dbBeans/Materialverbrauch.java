/*
 * Materialverbrauch.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 10 mit dem Namen "Materialverbrauch"
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

public class Materialverbrauch extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Materialverbrauch";
	public static final int dbTabNummer = 10;
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
	public static int _022_001_Vorgangsverwaltung_DID_Fn = 11;
	public static int _001_001_Mitarbeiter_DID_Fn = 12;
	public static int _009_001_Adressen_DID_Fn = 13;
	public static int kostenTyp_Fn = 14;
	public static int kostenbez_Fn = 15;
	public static int datum_Fn = 16;
	public static int weiterverrechnen_Fn = 17;
	public static int berechnet_Fn = 18;
	public static int _032_001_Artikel_DID_Fn = 19;
	public static int menge_Fn = 20;
	public static int bemerkung_Fn = 21;
	public static int m_065_012_Aufpos_ArtikelDID_Fn = 22;
	public static int m_065_012_Aufpos_ArtikelBez_Fn = 23;
	public static int leer_Fn = 24;
	public static int m_062_028_AusRech_PosNr_Fn = 25;
	public static int m_022_031_VorgangNr_Fn = 26;
	public static int m_032_011_Artikel_ArtikelNr_Fn = 27;
	public static int _062_001_AusRechPos_DID_Fn = 28;
	public static int _065_001_Aufpos_DID_Fn = 29;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 30;
	public static int m_032_012_Artikel_ArtikelKBZ_Fn = 31;
	public static int einzelKosten_Fn = 32;
	public static int gesamtKosten_Fn = 33;
	public static int _005_001_WährungenDID_Fn = 34;
	public static int m_005_011_Währungszeichen_Fn = 35;
	public static int kurs_Fn = 36;

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
	private int _022_001_Vorgangsverwaltung_DID = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private int _009_001_Adressen_DID = 0;
	private int kostenTyp = 0;
	private java.lang.String kostenbez = "";
	private java.sql.Date datum = new java.sql.Date(0);
	private boolean weiterverrechnen = false;
	private boolean berechnet = false;
	private int _032_001_Artikel_DID = 0;
	private double menge = 0;
	private java.lang.StringBuilder bemerkung = new java.lang.StringBuilder();
	private int m_065_012_Aufpos_ArtikelDID = 0;
	private java.lang.String m_065_012_Aufpos_ArtikelBez = "";
	private java.lang.String leer = "";
	private int m_062_028_AusRech_PosNr = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.String m_032_011_Artikel_ArtikelNr = "";
	private int _062_001_AusRechPos_DID = 0;
	private int _065_001_Aufpos_DID = 0;
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private java.lang.String m_032_012_Artikel_ArtikelKBZ = "";
	private double einzelKosten = 0;
	private double gesamtKosten = 0;
	private int _005_001_WährungenDID = 0;
	private java.lang.String m_005_011_Währungszeichen = "";
	private double kurs = 0;
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
			new FieldSpec("_022_001_Vorgangsverwaltung_DID", 11, 0, "int",
					new OneObjectPointer(22, 1, "Vorgangsverwaltung", "dID")),
			new FieldSpec("_001_001_Mitarbeiter_DID", 12, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("_009_001_Adressen_DID", 13, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("kostenTyp", 14, 0, "int", null),
			new FieldSpec("kostenbez", 15, 60, "java.lang.String", null),
			new FieldSpec("datum", 16, 0, "java.sql.Date", null),
			new FieldSpec("weiterverrechnen", 17, 0, "boolean", null),
			new FieldSpec("berechnet", 18, 0, "boolean", null),
			new FieldSpec("_032_001_Artikel_DID", 19, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("menge", 20, 0, "double", null),
			new FieldSpec("bemerkung", 21, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("m_065_012_Aufpos_ArtikelDID", 22, 0, "int", null),
			new FieldSpec("m_065_012_Aufpos_ArtikelBez", 23, 80,
					"java.lang.String", null),
			new FieldSpec("leer", 24, 40, "java.lang.String", null),
			new FieldSpec("m_062_028_AusRech_PosNr", 25, 0, "int", null),
			new FieldSpec("m_022_031_VorgangNr", 26, 30, "java.lang.String",
					null),
			new FieldSpec("m_032_011_Artikel_ArtikelNr", 27, 40,
					"java.lang.String", null),
			new FieldSpec("_062_001_AusRechPos_DID", 28, 0, "int",
					new OneObjectPointer(62, 1, "AusRechPos", "dID")),
			new FieldSpec("_065_001_Aufpos_DID", 29, 0, "int",
					new OneObjectPointer(65, 1, "Aufpos", "dID")),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 30, 5,
					"java.lang.String", null),
			new FieldSpec("m_032_012_Artikel_ArtikelKBZ", 31, 80,
					"java.lang.String", null),
			new FieldSpec("einzelKosten", 32, 0, "double", null),
			new FieldSpec("gesamtKosten", 33, 0, "double", null),
			new FieldSpec("_005_001_WährungenDID", 34, 0, "int",
					new OneObjectPointer(5, 1, "WährungenDID", "")),
			new FieldSpec("m_005_011_Währungszeichen", 35, 4,
					"java.lang.String", null),
			new FieldSpec("kurs", 36, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Materialverbrauch() {
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

	public void set_022_001_Vorgangsverwaltung_DID(int inp) {
		_022_001_Vorgangsverwaltung_DID = inp;
	}

	public int get_022_001_Vorgangsverwaltung_DID()

	{
		return _022_001_Vorgangsverwaltung_DID;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void setKostenTyp(int inp) {
		kostenTyp = inp;
	}

	public int getKostenTyp()

	{
		return kostenTyp;
	}

	public void setKostenbez(java.lang.String inp) {
		kostenbez = inp;
	}

	public java.lang.String getKostenbez()

	{
		return kostenbez;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setWeiterverrechnen(boolean inp) {
		weiterverrechnen = inp;
	}

	public boolean getWeiterverrechnen()

	{
		return weiterverrechnen;
	}

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setMenge(double inp) {
		menge = inp;
	}

	public double getMenge()

	{
		return menge;
	}

	public void setBemerkung(java.lang.StringBuilder inp) {
		bemerkung = inp;
	}

	public java.lang.StringBuilder getBemerkung()

	{
		return bemerkung;
	}

	public void setM_065_012_Aufpos_ArtikelDID(int inp) {
		m_065_012_Aufpos_ArtikelDID = inp;
	}

	public int getM_065_012_Aufpos_ArtikelDID()

	{
		return m_065_012_Aufpos_ArtikelDID;
	}

	public void setM_065_012_Aufpos_ArtikelBez(java.lang.String inp) {
		m_065_012_Aufpos_ArtikelBez = inp;
	}

	public java.lang.String getM_065_012_Aufpos_ArtikelBez()

	{
		return m_065_012_Aufpos_ArtikelBez;
	}

	public void setLeer(java.lang.String inp) {
		leer = inp;
	}

	public java.lang.String getLeer()

	{
		return leer;
	}

	public void setM_062_028_AusRech_PosNr(int inp) {
		m_062_028_AusRech_PosNr = inp;
	}

	public int getM_062_028_AusRech_PosNr()

	{
		return m_062_028_AusRech_PosNr;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_032_011_Artikel_ArtikelNr(java.lang.String inp) {
		m_032_011_Artikel_ArtikelNr = inp;
	}

	public java.lang.String getM_032_011_Artikel_ArtikelNr()

	{
		return m_032_011_Artikel_ArtikelNr;
	}

	public void set_062_001_AusRechPos_DID(int inp) {
		_062_001_AusRechPos_DID = inp;
	}

	public int get_062_001_AusRechPos_DID()

	{
		return _062_001_AusRechPos_DID;
	}

	public void set_065_001_Aufpos_DID(int inp) {
		_065_001_Aufpos_DID = inp;
	}

	public int get_065_001_Aufpos_DID()

	{
		return _065_001_Aufpos_DID;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setM_032_012_Artikel_ArtikelKBZ(java.lang.String inp) {
		m_032_012_Artikel_ArtikelKBZ = inp;
	}

	public java.lang.String getM_032_012_Artikel_ArtikelKBZ()

	{
		return m_032_012_Artikel_ArtikelKBZ;
	}

	public void setEinzelKosten(double inp) {
		einzelKosten = inp;
	}

	public double getEinzelKosten()

	{
		return einzelKosten;
	}

	public void setGesamtKosten(double inp) {
		gesamtKosten = inp;
	}

	public double getGesamtKosten()

	{
		return gesamtKosten;
	}

	public void set_005_001_WährungenDID(int inp) {
		_005_001_WährungenDID = inp;
	}

	public int get_005_001_WährungenDID()

	{
		return _005_001_WährungenDID;
	}

	public void setM_005_011_Währungszeichen(java.lang.String inp) {
		m_005_011_Währungszeichen = inp;
	}

	public java.lang.String getM_005_011_Währungszeichen()

	{
		return m_005_011_Währungszeichen;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
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
