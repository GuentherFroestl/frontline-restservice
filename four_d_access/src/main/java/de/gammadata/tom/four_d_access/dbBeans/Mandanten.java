/*
 * Mandanten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 54 mit dem Namen "Mandanten"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import java.util.Arrays;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Mandanten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Mandanten";
	public static final int dbTabNummer = 54;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int mandantenNr_Fn = 1;
	public static int aktiv_Fn = 2;
	public static int mandantenBez_Fn = 3;
	public static int standortNr_Fn = 4;
	public static int nextKDNr_Fn = 5;
	public static int nextAuftragNr_Fn = 6;
	public static int branchenNr_Fn = 7;
	public static int _005_001_Währungen_DID_Fn = 8;
	public static int nextLieferantNr_Fn = 9;
	public static int nextBestellNr_Fn = 10;
	public static int nextRechnungNr_Fn = 11;
	public static int nextERNr_Fn = 12;
	public static int _009_001_Adressen_DID_Fn = 13;
	public static int _083_001_GeldkontenDID_Fn = 14;
	public static int m_083_011_GeldkontenBez_Fn = 15;
	public static int m_083_023_KontoNr_Fn = 16;
	public static int internetLoginBez_Fn = 17;
	public static int mahnstufeZinsen_Fn = 18;
	public static int zinssatz_Fn = 19;
	public static int konfigXML_Fn = 20;
	public static int anschriftFenster_Fn = 21;
	public static int anschriftKopf_Fn = 22;
	public static int anschriftFuß_Fn = 23;
	public static int nextLFSNr_Fn = 24;
	public static int _005_001_BezugsWährung_DID_Fn = 25;
	public static int buchungsjahr_Fn = 26;
	public static int letztesBuchungsjahr_Fn = 27;
	public static int _009_001_Adressen_DID_AB_Fn = 28;
	public static int _009_001_Adressen_DID_LF_Fn = 29;
	public static int _009_001_Adressen_DID_RG_Fn = 30;
	public static int kalenderNr_Fn = 31;
	public static int m_005_011__008_WährKBZ_Fn = 32;
	public static int m_005_011__025_BezugsWährKBZ_Fn = 33;
	public static int standardMandant_Fn = 34;
	public static int drucklogo_Fn = 35;
	public static int nextBuchStpNr_Fn = 36;
	public static int isUpdate_Fn = 37;
	public static int differenzDebitorKonto_Fn = 38;
	public static int differenzKreditorKonto_Fn = 39;
	public static int _076_001_Mahnung1_DID_Fn = 40;
	public static int _076_001_Mahnung2_DID_Fn = 41;
	public static int _076_001_Mahnung3_DID_Fn = 42;
	public static int _076_001_Mahnung4_DID_Fn = 43;
	public static int _076_001_Mahnung5_DID_Fn = 44;
	public static int _042_001_Sprachen_SprachenNr_Fn = 45;
	public static int _005_001_BuchWährung_DID_Fn = 46;
	public static int m_005_011__046_BuchWährKBZ_Fn = 47;
	public static int aktueller_Kurs_Fn = 48;
	public static int debitor_Kontenrahmen_Fn = 49;
	public static int kreditor_Kontenrahmen_Fn = 50;
	public static int arbeitstage_Fn = 51;
	public static int kernzeit_von_Fn = 52;
	public static int kernzeit_bis_Fn = 53;
	public static int farbcode_Aktion_Fn = 54;
	public static int farbcode_AktionDone_Fn = 55;
	public static int farbcode_BannerText_Fn = 56;
	public static int faxString_Fn = 57;
	public static int font_Fax_Fn = 58;
	public static int font_Mac_Fn = 59;
	public static int splitCode_Fn = 60;
	public static int font_PC_Fn = 61;
	public static int absender1_Fn = 62;
	public static int font_Abs1_Fn = 63;
	public static int logoLink_Fn = 64;
	public static int scriptDir_Fn = 65;
	public static int nextMedienNummer_Fn = 66;
	public static int fontSize_Fn = 67;
	public static int _068_001_Kunden_DID_Fn = 68;
	public static int nextBarRechnungsNummer_Fn = 69;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int mandantenNr = 0;
	private boolean aktiv = false;
	private java.lang.String mandantenBez = "";
	private int standortNr = 0;
	private int nextKDNr = 0;
	private int nextAuftragNr = 0;
	private int branchenNr = 0;
	private int _005_001_Währungen_DID = 0;
	private int nextLieferantNr = 0;
	private int nextBestellNr = 0;
	private int nextRechnungNr = 0;
	private int nextERNr = 0;
	private int _009_001_Adressen_DID = 0;
	private int _083_001_GeldkontenDID = 0;
	private java.lang.String m_083_011_GeldkontenBez = "";
	private int m_083_023_KontoNr = 0;
	private java.lang.String internetLoginBez = "";
	private int mahnstufeZinsen = 0;
	private double zinssatz = 0;
	private java.lang.StringBuilder konfigXML = new java.lang.StringBuilder();
	private java.lang.StringBuilder anschriftFenster = new java.lang.StringBuilder();
	private java.lang.StringBuilder anschriftKopf = new java.lang.StringBuilder();
	private java.lang.StringBuilder anschriftFuß = new java.lang.StringBuilder();
	private int nextLFSNr = 0;
	private int _005_001_BezugsWährung_DID = 0;
	private int buchungsjahr = 0;
	private int letztesBuchungsjahr = 0;
	private int _009_001_Adressen_DID_AB = 0;
	private int _009_001_Adressen_DID_LF = 0;
	private int _009_001_Adressen_DID_RG = 0;
	private int kalenderNr = 0;
	private java.lang.String m_005_011__008_WährKBZ = "";
	private java.lang.String m_005_011__025_BezugsWährKBZ = "";
	private boolean standardMandant = false;
	private byte[] drucklogo = new byte[0];
	private int nextBuchStpNr = 0;
	private boolean isUpdate = false;
	private int differenzDebitorKonto = 0;
	private int differenzKreditorKonto = 0;
	private int _076_001_Mahnung1_DID = 0;
	private int _076_001_Mahnung2_DID = 0;
	private int _076_001_Mahnung3_DID = 0;
	private int _076_001_Mahnung4_DID = 0;
	private int _076_001_Mahnung5_DID = 0;
	private int _042_001_Sprachen_SprachenNr = 0;
	private int _005_001_BuchWährung_DID = 0;
	private java.lang.String m_005_011__046_BuchWährKBZ = "";
	private boolean aktueller_Kurs = false;
	private boolean debitor_Kontenrahmen = false;
	private boolean kreditor_Kontenrahmen = false;
	private java.lang.String arbeitstage = "";
	private java.sql.Time kernzeit_von = new java.sql.Time(0);
	private java.sql.Time kernzeit_bis = new java.sql.Time(0);
	private int farbcode_Aktion = 0;
	private int farbcode_AktionDone = 0;
	private int farbcode_BannerText = 0;
	private java.lang.String faxString = "";
	private java.lang.String font_Fax = "";
	private java.lang.String font_Mac = "";
	private int splitCode = 0;
	private java.lang.String font_PC = "";
	private java.lang.String absender1 = "";
	private java.lang.String font_Abs1 = "";
	private java.lang.StringBuilder logoLink = new java.lang.StringBuilder();
	private java.lang.StringBuilder scriptDir = new java.lang.StringBuilder();
	private int nextMedienNummer = 0;
	private int fontSize = 0;
	private int _068_001_Kunden_DID = 0;
	private int nextBarRechnungsNummer = 0;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("mandantenNr", 1, 0, "int", null),
			new FieldSpec("aktiv", 2, 0, "boolean", null),
			new FieldSpec("mandantenBez", 3, 40, "java.lang.String", null),
			new FieldSpec("standortNr", 4, 0, "int", null),
			new FieldSpec("nextKDNr", 5, 0, "int", null),
			new FieldSpec("nextAuftragNr", 6, 0, "int", null),
			new FieldSpec("branchenNr", 7, 0, "int", null),
			new FieldSpec("_005_001_Währungen_DID", 8, 0, "int", null),
			new FieldSpec("nextLieferantNr", 9, 0, "int", null),
			new FieldSpec("nextBestellNr", 10, 0, "int", null),
			new FieldSpec("nextRechnungNr", 11, 0, "int", null),
			new FieldSpec("nextERNr", 12, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID", 13, 0, "int", null),
			new FieldSpec("_083_001_GeldkontenDID", 14, 0, "int", null),
			new FieldSpec("m_083_011_GeldkontenBez", 15, 40,
					"java.lang.String", null),
			new FieldSpec("m_083_023_KontoNr", 16, 0, "int", null),
			new FieldSpec("internetLoginBez", 17, 60, "java.lang.String", null),
			new FieldSpec("mahnstufeZinsen", 18, 0, "int", null),
			new FieldSpec("zinssatz", 19, 0, "double", null),
			new FieldSpec("konfigXML", 20, 0, "java.lang.StringBuilder", null),
			new FieldSpec("anschriftFenster", 21, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("anschriftKopf", 22, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("anschriftFuß", 23, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("nextLFSNr", 24, 0, "int", null),
			new FieldSpec("_005_001_BezugsWährung_DID", 25, 0, "int", null),
			new FieldSpec("buchungsjahr", 26, 0, "int", null),
			new FieldSpec("letztesBuchungsjahr", 27, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_AB", 28, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_LF", 29, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_RG", 30, 0, "int", null),
			new FieldSpec("kalenderNr", 31, 0, "int", null),
			new FieldSpec("m_005_011__008_WährKBZ", 32, 5, "java.lang.String",
					null),
			new FieldSpec("m_005_011__025_BezugsWährKBZ", 33, 5,
					"java.lang.String", null),
			new FieldSpec("standardMandant", 34, 0, "boolean", null),
			new FieldSpec("drucklogo", 35, 0, "byte[]", null),
			new FieldSpec("nextBuchStpNr", 36, 0, "int", null),
			new FieldSpec("isUpdate", 37, 0, "boolean", null),
			new FieldSpec("differenzDebitorKonto", 38, 0, "int", null),
			new FieldSpec("differenzKreditorKonto", 39, 0, "int", null),
			new FieldSpec("_076_001_Mahnung1_DID", 40, 0, "int", null),
			new FieldSpec("_076_001_Mahnung2_DID", 41, 0, "int", null),
			new FieldSpec("_076_001_Mahnung3_DID", 42, 0, "int", null),
			new FieldSpec("_076_001_Mahnung4_DID", 43, 0, "int", null),
			new FieldSpec("_076_001_Mahnung5_DID", 44, 0, "int", null),
			new FieldSpec("_042_001_Sprachen_SprachenNr", 45, 0, "int", null),
			new FieldSpec("_005_001_BuchWährung_DID", 46, 0, "int", null),
			new FieldSpec("m_005_011__046_BuchWährKBZ", 47, 5,
					"java.lang.String", null),
			new FieldSpec("aktueller_Kurs", 48, 0, "boolean", null),
			new FieldSpec("debitor_Kontenrahmen", 49, 0, "boolean", null),
			new FieldSpec("kreditor_Kontenrahmen", 50, 0, "boolean", null),
			new FieldSpec("arbeitstage", 51, 7, "java.lang.String", null),
			new FieldSpec("kernzeit_von", 52, 0, "java.sql.Time", null),
			new FieldSpec("kernzeit_bis", 53, 0, "java.sql.Time", null),
			new FieldSpec("farbcode_Aktion", 54, 0, "int", null),
			new FieldSpec("farbcode_AktionDone", 55, 0, "int", null),
			new FieldSpec("farbcode_BannerText", 56, 0, "int", null),
			new FieldSpec("faxString", 57, 80, "java.lang.String", null),
			new FieldSpec("font_Fax", 58, 63, "java.lang.String", null),
			new FieldSpec("font_Mac", 59, 63, "java.lang.String", null),
			new FieldSpec("splitCode", 60, 0, "int", null),
			new FieldSpec("font_PC", 61, 63, "java.lang.String", null),
			new FieldSpec("absender1", 62, 63, "java.lang.String", null),
			new FieldSpec("font_Abs1", 63, 63, "java.lang.String", null),
			new FieldSpec("logoLink", 64, 0, "java.lang.StringBuilder", null),
			new FieldSpec("scriptDir", 65, 0, "java.lang.StringBuilder", null),
			new FieldSpec("nextMedienNummer", 66, 0, "int", null),
			new FieldSpec("fontSize", 67, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 68, 0, "int", null),
			new FieldSpec("nextBarRechnungsNummer", 69, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Mandanten() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setMandantenNr(int inp) {
		mandantenNr = inp;
	}

	public int getMandantenNr()

	{
		return mandantenNr;
	}

	public void setAktiv(boolean inp) {
		aktiv = inp;
	}

	public boolean getAktiv()

	{
		return aktiv;
	}

	public void setMandantenBez(java.lang.String inp) {
		mandantenBez = inp;
	}

	public java.lang.String getMandantenBez()

	{
		return mandantenBez;
	}

	public void setStandortNr(int inp) {
		standortNr = inp;
	}

	public int getStandortNr()

	{
		return standortNr;
	}

	public void setNextKDNr(int inp) {
		nextKDNr = inp;
	}

	public int getNextKDNr()

	{
		return nextKDNr;
	}

	public void setNextAuftragNr(int inp) {
		nextAuftragNr = inp;
	}

	public int getNextAuftragNr()

	{
		return nextAuftragNr;
	}

	public void setBranchenNr(int inp) {
		branchenNr = inp;
	}

	public int getBranchenNr()

	{
		return branchenNr;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setNextLieferantNr(int inp) {
		nextLieferantNr = inp;
	}

	public int getNextLieferantNr()

	{
		return nextLieferantNr;
	}

	public void setNextBestellNr(int inp) {
		nextBestellNr = inp;
	}

	public int getNextBestellNr()

	{
		return nextBestellNr;
	}

	public void setNextRechnungNr(int inp) {
		nextRechnungNr = inp;
	}

	public int getNextRechnungNr()

	{
		return nextRechnungNr;
	}

	public void setNextERNr(int inp) {
		nextERNr = inp;
	}

	public int getNextERNr()

	{
		return nextERNr;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void set_083_001_GeldkontenDID(int inp) {
		_083_001_GeldkontenDID = inp;
	}

	public int get_083_001_GeldkontenDID()

	{
		return _083_001_GeldkontenDID;
	}

	public void setM_083_011_GeldkontenBez(java.lang.String inp) {
		m_083_011_GeldkontenBez = inp;
	}

	public java.lang.String getM_083_011_GeldkontenBez()

	{
		return m_083_011_GeldkontenBez;
	}

	public void setM_083_023_KontoNr(int inp) {
		m_083_023_KontoNr = inp;
	}

	public int getM_083_023_KontoNr()

	{
		return m_083_023_KontoNr;
	}

	public void setInternetLoginBez(java.lang.String inp) {
		internetLoginBez = inp;
	}

	public java.lang.String getInternetLoginBez()

	{
		return internetLoginBez;
	}

	public void setMahnstufeZinsen(int inp) {
		mahnstufeZinsen = inp;
	}

	public int getMahnstufeZinsen()

	{
		return mahnstufeZinsen;
	}

	public void setZinssatz(double inp) {
		zinssatz = inp;
	}

	public double getZinssatz()

	{
		return zinssatz;
	}

	public void setKonfigXML(java.lang.StringBuilder inp) {
		konfigXML = inp;
	}

	public java.lang.StringBuilder getKonfigXML()

	{
		return konfigXML;
	}

	public void setAnschriftFenster(java.lang.StringBuilder inp) {
		anschriftFenster = inp;
	}

	public java.lang.StringBuilder getAnschriftFenster()

	{
		return anschriftFenster;
	}

	public void setAnschriftKopf(java.lang.StringBuilder inp) {
		anschriftKopf = inp;
	}

	public java.lang.StringBuilder getAnschriftKopf()

	{
		return anschriftKopf;
	}

	public void setAnschriftFuß(java.lang.StringBuilder inp) {
		anschriftFuß = inp;
	}

	public java.lang.StringBuilder getAnschriftFuß()

	{
		return anschriftFuß;
	}

	public void setNextLFSNr(int inp) {
		nextLFSNr = inp;
	}

	public int getNextLFSNr()

	{
		return nextLFSNr;
	}

	public void set_005_001_BezugsWährung_DID(int inp) {
		_005_001_BezugsWährung_DID = inp;
	}

	public int get_005_001_BezugsWährung_DID()

	{
		return _005_001_BezugsWährung_DID;
	}

	public void setBuchungsjahr(int inp) {
		buchungsjahr = inp;
	}

	public int getBuchungsjahr()

	{
		return buchungsjahr;
	}

	public void setLetztesBuchungsjahr(int inp) {
		letztesBuchungsjahr = inp;
	}

	public int getLetztesBuchungsjahr()

	{
		return letztesBuchungsjahr;
	}

	public void set_009_001_Adressen_DID_AB(int inp) {
		_009_001_Adressen_DID_AB = inp;
	}

	public int get_009_001_Adressen_DID_AB()

	{
		return _009_001_Adressen_DID_AB;
	}

	public void set_009_001_Adressen_DID_LF(int inp) {
		_009_001_Adressen_DID_LF = inp;
	}

	public int get_009_001_Adressen_DID_LF()

	{
		return _009_001_Adressen_DID_LF;
	}

	public void set_009_001_Adressen_DID_RG(int inp) {
		_009_001_Adressen_DID_RG = inp;
	}

	public int get_009_001_Adressen_DID_RG()

	{
		return _009_001_Adressen_DID_RG;
	}

	public void setKalenderNr(int inp) {
		kalenderNr = inp;
	}

	public int getKalenderNr()

	{
		return kalenderNr;
	}

	public void setM_005_011__008_WährKBZ(java.lang.String inp) {
		m_005_011__008_WährKBZ = inp;
	}

	public java.lang.String getM_005_011__008_WährKBZ()

	{
		return m_005_011__008_WährKBZ;
	}

	public void setM_005_011__025_BezugsWährKBZ(java.lang.String inp) {
		m_005_011__025_BezugsWährKBZ = inp;
	}

	public java.lang.String getM_005_011__025_BezugsWährKBZ()

	{
		return m_005_011__025_BezugsWährKBZ;
	}

	public void setStandardMandant(boolean inp) {
		standardMandant = inp;
	}

	public boolean getStandardMandant()

	{
		return standardMandant;
	}

	public void setDrucklogo(byte[] inp) {
		drucklogo = inp;
	}

	public byte[] getDrucklogo()

	{
		return drucklogo;
	}

	public void setNextBuchStpNr(int inp) {
		nextBuchStpNr = inp;
	}

	public int getNextBuchStpNr()

	{
		return nextBuchStpNr;
	}

	public void setIsUpdate(boolean inp) {
		isUpdate = inp;
	}

	public boolean getIsUpdate()

	{
		return isUpdate;
	}

	public void setDifferenzDebitorKonto(int inp) {
		differenzDebitorKonto = inp;
	}

	public int getDifferenzDebitorKonto()

	{
		return differenzDebitorKonto;
	}

	public void setDifferenzKreditorKonto(int inp) {
		differenzKreditorKonto = inp;
	}

	public int getDifferenzKreditorKonto()

	{
		return differenzKreditorKonto;
	}

	public void set_076_001_Mahnung1_DID(int inp) {
		_076_001_Mahnung1_DID = inp;
	}

	public int get_076_001_Mahnung1_DID()

	{
		return _076_001_Mahnung1_DID;
	}

	public void set_076_001_Mahnung2_DID(int inp) {
		_076_001_Mahnung2_DID = inp;
	}

	public int get_076_001_Mahnung2_DID()

	{
		return _076_001_Mahnung2_DID;
	}

	public void set_076_001_Mahnung3_DID(int inp) {
		_076_001_Mahnung3_DID = inp;
	}

	public int get_076_001_Mahnung3_DID()

	{
		return _076_001_Mahnung3_DID;
	}

	public void set_076_001_Mahnung4_DID(int inp) {
		_076_001_Mahnung4_DID = inp;
	}

	public int get_076_001_Mahnung4_DID()

	{
		return _076_001_Mahnung4_DID;
	}

	public void set_076_001_Mahnung5_DID(int inp) {
		_076_001_Mahnung5_DID = inp;
	}

	public int get_076_001_Mahnung5_DID()

	{
		return _076_001_Mahnung5_DID;
	}

	public void set_042_001_Sprachen_SprachenNr(int inp) {
		_042_001_Sprachen_SprachenNr = inp;
	}

	public int get_042_001_Sprachen_SprachenNr()

	{
		return _042_001_Sprachen_SprachenNr;
	}

	public void set_005_001_BuchWährung_DID(int inp) {
		_005_001_BuchWährung_DID = inp;
	}

	public int get_005_001_BuchWährung_DID()

	{
		return _005_001_BuchWährung_DID;
	}

	public void setM_005_011__046_BuchWährKBZ(java.lang.String inp) {
		m_005_011__046_BuchWährKBZ = inp;
	}

	public java.lang.String getM_005_011__046_BuchWährKBZ()

	{
		return m_005_011__046_BuchWährKBZ;
	}

	public void setAktueller_Kurs(boolean inp) {
		aktueller_Kurs = inp;
	}

	public boolean getAktueller_Kurs()

	{
		return aktueller_Kurs;
	}

	public void setDebitor_Kontenrahmen(boolean inp) {
		debitor_Kontenrahmen = inp;
	}

	public boolean getDebitor_Kontenrahmen()

	{
		return debitor_Kontenrahmen;
	}

	public void setKreditor_Kontenrahmen(boolean inp) {
		kreditor_Kontenrahmen = inp;
	}

	public boolean getKreditor_Kontenrahmen()

	{
		return kreditor_Kontenrahmen;
	}

	public void setArbeitstage(java.lang.String inp) {
		arbeitstage = inp;
	}

	public java.lang.String getArbeitstage()

	{
		return arbeitstage;
	}

	public void setKernzeit_von(java.sql.Time inp) {
		kernzeit_von = inp;
	}

	public java.sql.Time getKernzeit_von()

	{
		return kernzeit_von;
	}

	public void setKernzeit_bis(java.sql.Time inp) {
		kernzeit_bis = inp;
	}

	public java.sql.Time getKernzeit_bis()

	{
		return kernzeit_bis;
	}

	public void setFarbcode_Aktion(int inp) {
		farbcode_Aktion = inp;
	}

	public int getFarbcode_Aktion()

	{
		return farbcode_Aktion;
	}

	public void setFarbcode_AktionDone(int inp) {
		farbcode_AktionDone = inp;
	}

	public int getFarbcode_AktionDone()

	{
		return farbcode_AktionDone;
	}

	public void setFarbcode_BannerText(int inp) {
		farbcode_BannerText = inp;
	}

	public int getFarbcode_BannerText()

	{
		return farbcode_BannerText;
	}

	public void setFaxString(java.lang.String inp) {
		faxString = inp;
	}

	public java.lang.String getFaxString()

	{
		return faxString;
	}

	public void setFont_Fax(java.lang.String inp) {
		font_Fax = inp;
	}

	public java.lang.String getFont_Fax()

	{
		return font_Fax;
	}

	public void setFont_Mac(java.lang.String inp) {
		font_Mac = inp;
	}

	public java.lang.String getFont_Mac()

	{
		return font_Mac;
	}

	public void setSplitCode(int inp) {
		splitCode = inp;
	}

	public int getSplitCode()

	{
		return splitCode;
	}

	public void setFont_PC(java.lang.String inp) {
		font_PC = inp;
	}

	public java.lang.String getFont_PC()

	{
		return font_PC;
	}

	public void setAbsender1(java.lang.String inp) {
		absender1 = inp;
	}

	public java.lang.String getAbsender1()

	{
		return absender1;
	}

	public void setFont_Abs1(java.lang.String inp) {
		font_Abs1 = inp;
	}

	public java.lang.String getFont_Abs1()

	{
		return font_Abs1;
	}

	public void setLogoLink(java.lang.StringBuilder inp) {
		logoLink = inp;
	}

	public java.lang.StringBuilder getLogoLink()

	{
		return logoLink;
	}

	public void setScriptDir(java.lang.StringBuilder inp) {
		scriptDir = inp;
	}

	public java.lang.StringBuilder getScriptDir()

	{
		return scriptDir;
	}

	public void setNextMedienNummer(int inp) {
		nextMedienNummer = inp;
	}

	public int getNextMedienNummer()

	{
		return nextMedienNummer;
	}

	public void setFontSize(int inp) {
		fontSize = inp;
	}

	public int getFontSize()

	{
		return fontSize;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setNextBarRechnungsNummer(int inp) {
		nextBarRechnungsNummer = inp;
	}

	public int getNextBarRechnungsNummer()

	{
		return nextBarRechnungsNummer;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mandanten [printon=");
		builder.append(printon);
		builder.append(", xmlObjektId=");
		builder.append(xmlObjektId);
		builder.append(", mandantenNr=");
		builder.append(mandantenNr);
		builder.append(", aktiv=");
		builder.append(aktiv);
		builder.append(", mandantenBez=");
		builder.append(mandantenBez);
		builder.append(", standortNr=");
		builder.append(standortNr);
		builder.append(", nextKDNr=");
		builder.append(nextKDNr);
		builder.append(", nextAuftragNr=");
		builder.append(nextAuftragNr);
		builder.append(", branchenNr=");
		builder.append(branchenNr);
		builder.append(", _005_001_Währungen_DID=");
		builder.append(_005_001_Währungen_DID);
		builder.append(", nextLieferantNr=");
		builder.append(nextLieferantNr);
		builder.append(", nextBestellNr=");
		builder.append(nextBestellNr);
		builder.append(", nextRechnungNr=");
		builder.append(nextRechnungNr);
		builder.append(", nextERNr=");
		builder.append(nextERNr);
		builder.append(", _009_001_Adressen_DID=");
		builder.append(_009_001_Adressen_DID);
		builder.append(", _083_001_GeldkontenDID=");
		builder.append(_083_001_GeldkontenDID);
		builder.append(", m_083_011_GeldkontenBez=");
		builder.append(m_083_011_GeldkontenBez);
		builder.append(", m_083_023_KontoNr=");
		builder.append(m_083_023_KontoNr);
		builder.append(", internetLoginBez=");
		builder.append(internetLoginBez);
		builder.append(", mahnstufeZinsen=");
		builder.append(mahnstufeZinsen);
		builder.append(", zinssatz=");
		builder.append(zinssatz);
		builder.append(", konfigXML=");
		builder.append(konfigXML);
		builder.append(", anschriftFenster=");
		builder.append(anschriftFenster);
		builder.append(", anschriftKopf=");
		builder.append(anschriftKopf);
		builder.append(", anschriftFuß=");
		builder.append(anschriftFuß);
		builder.append(", nextLFSNr=");
		builder.append(nextLFSNr);
		builder.append(", _005_001_BezugsWährung_DID=");
		builder.append(_005_001_BezugsWährung_DID);
		builder.append(", buchungsjahr=");
		builder.append(buchungsjahr);
		builder.append(", letztesBuchungsjahr=");
		builder.append(letztesBuchungsjahr);
		builder.append(", _009_001_Adressen_DID_AB=");
		builder.append(_009_001_Adressen_DID_AB);
		builder.append(", _009_001_Adressen_DID_LF=");
		builder.append(_009_001_Adressen_DID_LF);
		builder.append(", _009_001_Adressen_DID_RG=");
		builder.append(_009_001_Adressen_DID_RG);
		builder.append(", kalenderNr=");
		builder.append(kalenderNr);
		builder.append(", m_005_011__008_WährKBZ=");
		builder.append(m_005_011__008_WährKBZ);
		builder.append(", m_005_011__025_BezugsWährKBZ=");
		builder.append(m_005_011__025_BezugsWährKBZ);
		builder.append(", standardMandant=");
		builder.append(standardMandant);
		builder.append(", drucklogo=");
		builder.append(Arrays.toString(drucklogo));
		builder.append(", nextBuchStpNr=");
		builder.append(nextBuchStpNr);
		builder.append(", isUpdate=");
		builder.append(isUpdate);
		builder.append(", differenzDebitorKonto=");
		builder.append(differenzDebitorKonto);
		builder.append(", differenzKreditorKonto=");
		builder.append(differenzKreditorKonto);
		builder.append(", _076_001_Mahnung1_DID=");
		builder.append(_076_001_Mahnung1_DID);
		builder.append(", _076_001_Mahnung2_DID=");
		builder.append(_076_001_Mahnung2_DID);
		builder.append(", _076_001_Mahnung3_DID=");
		builder.append(_076_001_Mahnung3_DID);
		builder.append(", _076_001_Mahnung4_DID=");
		builder.append(_076_001_Mahnung4_DID);
		builder.append(", _076_001_Mahnung5_DID=");
		builder.append(_076_001_Mahnung5_DID);
		builder.append(", _042_001_Sprachen_SprachenNr=");
		builder.append(_042_001_Sprachen_SprachenNr);
		builder.append(", _005_001_BuchWährung_DID=");
		builder.append(_005_001_BuchWährung_DID);
		builder.append(", m_005_011__046_BuchWährKBZ=");
		builder.append(m_005_011__046_BuchWährKBZ);
		builder.append(", aktueller_Kurs=");
		builder.append(aktueller_Kurs);
		builder.append(", debitor_Kontenrahmen=");
		builder.append(debitor_Kontenrahmen);
		builder.append(", kreditor_Kontenrahmen=");
		builder.append(kreditor_Kontenrahmen);
		builder.append(", arbeitstage=");
		builder.append(arbeitstage);
		builder.append(", kernzeit_von=");
		builder.append(kernzeit_von);
		builder.append(", kernzeit_bis=");
		builder.append(kernzeit_bis);
		builder.append(", farbcode_Aktion=");
		builder.append(farbcode_Aktion);
		builder.append(", farbcode_AktionDone=");
		builder.append(farbcode_AktionDone);
		builder.append(", farbcode_BannerText=");
		builder.append(farbcode_BannerText);
		builder.append(", faxString=");
		builder.append(faxString);
		builder.append(", font_Fax=");
		builder.append(font_Fax);
		builder.append(", font_Mac=");
		builder.append(font_Mac);
		builder.append(", splitCode=");
		builder.append(splitCode);
		builder.append(", font_PC=");
		builder.append(font_PC);
		builder.append(", absender1=");
		builder.append(absender1);
		builder.append(", font_Abs1=");
		builder.append(font_Abs1);
		builder.append(", logoLink=");
		builder.append(logoLink);
		builder.append(", scriptDir=");
		builder.append(scriptDir);
		builder.append(", nextMedienNummer=");
		builder.append(nextMedienNummer);
		builder.append(", fontSize=");
		builder.append(fontSize);
		builder.append(", _068_001_Kunden_DID=");
		builder.append(_068_001_Kunden_DID);
		builder.append(", nextBarRechnungsNummer=");
		builder.append(nextBarRechnungsNummer);
		builder.append("]");
		return builder.toString();
	}

}
