/*
 * Mitarbeiter.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 1 mit dem Namen "Mitarbeiter"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Mitarbeiter extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Mitarbeiter";
	public static final int dbTabNummer = 1;
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
	public static int _002_001_Benutzergruppen_DID_Fn = 11;
	public static int nachname_Fn = 12;
	public static int vorname_Fn = 13;
	public static int aktiv_Fn = 14;
	public static int passwort_Fn = 15;
	public static int telefonFirma_Fn = 16;
	public static int _042_001_Sprachen_SprachenNr_Fn = 17;
	public static int internetzugang_Fn = 18;
	public static int _009_001_Adressen_DID_Fn = 19;
	public static int geburtstag_Fn = 20;
	public static int Kürzel_Fn = 21;
	public static int strasse_Fn = 22;
	public static int pLZ_Fn = 23;
	public static int ort_Fn = 24;
	public static int _040_001_Länder_DID_Fn = 25;
	public static int rollen_Fn = 26;
	public static int handy_Fn = 27;
	public static int eMAIL_Fn = 28;
	public static int farbcode_Fn = 29;
	public static int soll_Std_Tag_Fn = 30;
	public static int std_Satz_Int_Fn = 31;
	public static int std_Satz_ext_Fn = 32;
	public static int _005_001_Währungen_DID_Fn = 33;
	public static int _042_001_Sprachen_FormatNr_Fn = 34;
	public static int signet_Fn = 35;
	public static int kontaktDaten_Fn = 36;
	public static int internetUserName_Fn = 37;
	public static int internetPasswort_Fn = 38;
	public static int palmUserName_Fn = 39;
	public static int palmSyncModus_Fn = 40;
	public static int palmSyncTabellen_Fn = 41;
	public static int extern_Fn = 42;
	public static int xML_Config_Fn = 43;

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
	private int _002_001_Benutzergruppen_DID = 0;
	private java.lang.String nachname = "";
	private java.lang.String vorname = "";
	private boolean aktiv = false;
	private java.lang.String passwort = "";
	private java.lang.String telefonFirma = "";
	private int _042_001_Sprachen_SprachenNr = 0;
	private boolean internetzugang = false;
	private int _009_001_Adressen_DID = 0;
	private java.sql.Date geburtstag = new java.sql.Date(0);
	private java.lang.String Kürzel = "";
	private java.lang.String strasse = "";
	private java.lang.String pLZ = "";
	private java.lang.String ort = "";
	private int _040_001_Länder_DID = 0;
	private java.lang.StringBuilder rollen = new java.lang.StringBuilder();
	private java.lang.String handy = "";
	private java.lang.String eMAIL = "";
	private int farbcode = 0;
	private double soll_Std_Tag = 0;
	private double std_Satz_Int = 0;
	private double std_Satz_ext = 0;
	private int _005_001_Währungen_DID = 0;
	private int _042_001_Sprachen_FormatNr = 0;
	private java.lang.StringBuilder signet = new java.lang.StringBuilder();
	private java.lang.StringBuilder kontaktDaten = new java.lang.StringBuilder();
	private java.lang.String internetUserName = "";
	private java.lang.String internetPasswort = "";
	private java.lang.String palmUserName = "";
	private int palmSyncModus = 0;
	private int palmSyncTabellen = 0;
	private boolean extern = false;
	private java.lang.StringBuilder xML_Config = new java.lang.StringBuilder();
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
			new FieldSpec("_002_001_Benutzergruppen_DID", 11, 0, "int", null),
			new FieldSpec("nachname", 12, 40, "java.lang.String", null),
			new FieldSpec("vorname", 13, 40, "java.lang.String", null),
			new FieldSpec("aktiv", 14, 0, "boolean", null),
			new FieldSpec("passwort", 15, 20, "java.lang.String", null),
			new FieldSpec("telefonFirma", 16, 40, "java.lang.String", null),
			new FieldSpec("_042_001_Sprachen_SprachenNr", 17, 0, "int", null),
			new FieldSpec("internetzugang", 18, 0, "boolean", null),
			new FieldSpec("_009_001_Adressen_DID", 19, 0, "int", null),
			new FieldSpec("geburtstag", 20, 0, "java.sql.Date", null),
			new FieldSpec("Kürzel", 21, 5, "java.lang.String", null),
			new FieldSpec("strasse", 22, 60, "java.lang.String", null),
			new FieldSpec("pLZ", 23, 10, "java.lang.String", null),
			new FieldSpec("ort", 24, 40, "java.lang.String", null),
			new FieldSpec("_040_001_Länder_DID", 25, 0, "int", null),
			new FieldSpec("rollen", 26, 0, "java.lang.StringBuilder", null),
			new FieldSpec("handy", 27, 20, "java.lang.String", null),
			new FieldSpec("eMAIL", 28, 40, "java.lang.String", null),
			new FieldSpec("farbcode", 29, 0, "int", null),
			new FieldSpec("soll_Std_Tag", 30, 0, "double", null),
			new FieldSpec("std_Satz_Int", 31, 0, "double", null),
			new FieldSpec("std_Satz_ext", 32, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 33, 0, "int", null),
			new FieldSpec("_042_001_Sprachen_FormatNr", 34, 0, "int", null),
			new FieldSpec("signet", 35, 0, "java.lang.StringBuilder", null),
			new FieldSpec("kontaktDaten", 36, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("internetUserName", 37, 80, "java.lang.String", null),
			new FieldSpec("internetPasswort", 38, 80, "java.lang.String", null),
			new FieldSpec("palmUserName", 39, 40, "java.lang.String", null),
			new FieldSpec("palmSyncModus", 40, 0, "int", null),
			new FieldSpec("palmSyncTabellen", 41, 0, "int", null),
			new FieldSpec("extern", 42, 0, "boolean", null),
			new FieldSpec("xML_Config", 43, 0, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Mitarbeiter() {
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

	@Override
	public void setDMandant(int inp) {
		dMandant = inp;
	}

	@Override
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

	public void set_002_001_Benutzergruppen_DID(int inp) {
		_002_001_Benutzergruppen_DID = inp;
	}

	public int get_002_001_Benutzergruppen_DID()

	{
		return _002_001_Benutzergruppen_DID;
	}

	public void setNachname(java.lang.String inp) {
		nachname = inp;
	}

	public java.lang.String getNachname()

	{
		return nachname;
	}

	public void setVorname(java.lang.String inp) {
		vorname = inp;
	}

	public java.lang.String getVorname()

	{
		return vorname;
	}

	public void setAktiv(boolean inp) {
		aktiv = inp;
	}

	public boolean getAktiv()

	{
		return aktiv;
	}

	public void setPasswort(java.lang.String inp) {
		passwort = inp;
	}

	public java.lang.String getPasswort()

	{
		return passwort;
	}

	public void setTelefonFirma(java.lang.String inp) {
		telefonFirma = inp;
	}

	public java.lang.String getTelefonFirma()

	{
		return telefonFirma;
	}

	public void set_042_001_Sprachen_SprachenNr(int inp) {
		_042_001_Sprachen_SprachenNr = inp;
	}

	public int get_042_001_Sprachen_SprachenNr()

	{
		return _042_001_Sprachen_SprachenNr;
	}

	public void setInternetzugang(boolean inp) {
		internetzugang = inp;
	}

	public boolean getInternetzugang()

	{
		return internetzugang;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void setGeburtstag(java.sql.Date inp) {
		geburtstag = inp;
	}

	public java.sql.Date getGeburtstag()

	{
		return geburtstag;
	}

	public void setKürzel(java.lang.String inp) {
		Kürzel = inp;
	}

	public java.lang.String getKürzel()

	{
		return Kürzel;
	}

	public void setStrasse(java.lang.String inp) {
		strasse = inp;
	}

	public java.lang.String getStrasse()

	{
		return strasse;
	}

	public void setPLZ(java.lang.String inp) {
		pLZ = inp;
	}

	public java.lang.String getPLZ()

	{
		return pLZ;
	}

	public void setOrt(java.lang.String inp) {
		ort = inp;
	}

	public java.lang.String getOrt()

	{
		return ort;
	}

	public void set_040_001_Länder_DID(int inp) {
		_040_001_Länder_DID = inp;
	}

	public int get_040_001_Länder_DID()

	{
		return _040_001_Länder_DID;
	}

	public void setRollen(java.lang.StringBuilder inp) {
		rollen = inp;
	}

	public java.lang.StringBuilder getRollen()

	{
		return rollen;
	}

	public void setHandy(java.lang.String inp) {
		handy = inp;
	}

	public java.lang.String getHandy()

	{
		return handy;
	}

	public void setEMAIL(java.lang.String inp) {
		eMAIL = inp;
	}

	public java.lang.String getEMAIL()

	{
		return eMAIL;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void setSoll_Std_Tag(double inp) {
		soll_Std_Tag = inp;
	}

	public double getSoll_Std_Tag()

	{
		return soll_Std_Tag;
	}

	public void setStd_Satz_Int(double inp) {
		std_Satz_Int = inp;
	}

	public double getStd_Satz_Int()

	{
		return std_Satz_Int;
	}

	public void setStd_Satz_ext(double inp) {
		std_Satz_ext = inp;
	}

	public double getStd_Satz_ext()

	{
		return std_Satz_ext;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void set_042_001_Sprachen_FormatNr(int inp) {
		_042_001_Sprachen_FormatNr = inp;
	}

	public int get_042_001_Sprachen_FormatNr()

	{
		return _042_001_Sprachen_FormatNr;
	}

	public void setSignet(java.lang.StringBuilder inp) {
		signet = inp;
	}

	public java.lang.StringBuilder getSignet()

	{
		return signet;
	}

	public void setKontaktDaten(java.lang.StringBuilder inp) {
		kontaktDaten = inp;
	}

	public java.lang.StringBuilder getKontaktDaten()

	{
		return kontaktDaten;
	}

	public void setInternetUserName(java.lang.String inp) {
		internetUserName = inp;
	}

	public java.lang.String getInternetUserName()

	{
		return internetUserName;
	}

	public void setInternetPasswort(java.lang.String inp) {
		internetPasswort = inp;
	}

	public java.lang.String getInternetPasswort()

	{
		return internetPasswort;
	}

	public void setPalmUserName(java.lang.String inp) {
		palmUserName = inp;
	}

	public java.lang.String getPalmUserName()

	{
		return palmUserName;
	}

	public void setPalmSyncModus(int inp) {
		palmSyncModus = inp;
	}

	public int getPalmSyncModus()

	{
		return palmSyncModus;
	}

	public void setPalmSyncTabellen(int inp) {
		palmSyncTabellen = inp;
	}

	public int getPalmSyncTabellen()

	{
		return palmSyncTabellen;
	}

	public void setExtern(boolean inp) {
		extern = inp;
	}

	public boolean getExtern()

	{
		return extern;
	}

	public void setXML_Config(java.lang.StringBuilder inp) {
		xML_Config = inp;
	}

	public java.lang.StringBuilder getXML_Config()

	{
		return xML_Config;
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
