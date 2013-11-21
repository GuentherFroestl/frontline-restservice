/*
 * Adressen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 9 mit dem Namen "Adressen"
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

public class Adressen extends BasicBean {

	public static final String xmlClassTag = "Adressen";
	public static final int dbTabNummer = 9;
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
	public static int firmenname_Fn = 11;
	public static int _026_001__AnredeTabelle_DID_Fn = 12;
	public static int vorname_Fn = 13;
	public static int nachname_Fn = 14;
	public static int abteilung_Fn = 15;
	public static int adressfeld1_Fn = 16;
	public static int pLZ_Fn = 17;
	public static int ort_Fn = 18;
	public static int _040_001_Länder_DID_Fn = 19;
	public static int telefon_Fn = 20;
	public static int fax_Fn = 21;
	public static int handy_Fn = 22;
	public static int eMail_Fn = 23;
	public static int wWW_Fn = 24;
	public static int titel_Fn = 25;
	public static int telefon_Privat_Fn = 26;
	public static int _042_001_Sprachen_SprachenNr_Fn = 27;
	public static int m_068_011_KundenNr_Fn = 28;
	public static int geburtstag_Fn = 29;
	public static int mailflag1_Fn = 30;
	public static int mailflag2_Fn = 31;
	public static int kunde_Fn = 32;
	public static int lieferant_Fn = 33;
	public static int spedition_Fn = 34;
	public static int berater_Fn = 35;
	public static int sonstiges1_Fn = 36;
	public static int sonstiges2_Fn = 37;
	public static int sonstiges3_Fn = 38;
	public static int geburtstagskarte_Fn = 39;
	public static int telFileTransfer_Fn = 40;
	public static int fTP_Fn = 41;
	public static int farbcode_Fn = 42;
	public static int m_042_002_Sprachen_Bezeichnung_Fn = 43;
	public static int m_040_012_Länder_PostCode_Fn = 44;
	public static int m_026_014_Anrede_Adr_Fn = 45;
	public static int position_Fn = 46;
	public static int kommentar_Fn = 47;
	public static int adressfeld2_Fn = 48;
	public static int adressfeld3_Fn = 49;
	public static int kennzeichen1_Fn = 50;
	public static int kennzeichen2_Fn = 51;
	public static int kennzeichen3_Fn = 52;
	public static int firmenname2_Fn = 53;
	public static int hotSync_Fn = 54;
	public static int palmDID_Fn = 55;
	public static int privat_Fn = 56;
	public static int importDID_Fn = 57;
	public static int importKBZ_Fn = 58;
	public static int _068_001_KundenDID_Fn = 59;
	public static int internetPasswort_Fn = 60;
	public static int _023_001_MessageFolderDID_Fn = 61;
	public static int inaktiv_Fn = 62;
	public static int personenprofil_Fn = 63;
	public static int _060_001_LieferantenDID_Fn = 64;
	public static int m_060_011_LieferantenNR_Fn = 65;
	public static int dayOfYearGeb_Fn = 66;
	public static int email2_Fn = 67;
	public static int uuid_Fn = 68;

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
	private java.lang.String firmenname = "";
	private int _026_001__AnredeTabelle_DID = 0;
	private java.lang.String vorname = "";
	private java.lang.String nachname = "";
	private java.lang.String abteilung = "";
	private java.lang.String adressfeld1 = "";
	private java.lang.String pLZ = "";
	private java.lang.String ort = "";
	private int _040_001_Länder_DID = 0;
	private java.lang.String telefon = "";
	private java.lang.String fax = "";
	private java.lang.String handy = "";
	private java.lang.String eMail = "";
	private java.lang.String wWW = "";
	private java.lang.String titel = "";
	private java.lang.String telefon_Privat = "";
	private int _042_001_Sprachen_SprachenNr = 0;
	private int m_068_011_KundenNr = 0;
	private java.sql.Date geburtstag = new java.sql.Date(0);
	private boolean mailflag1 = false;
	private boolean mailflag2 = false;
	private boolean kunde = false;
	private boolean lieferant = false;
	private boolean spedition = false;
	private boolean berater = false;
	private boolean sonstiges1 = false;
	private boolean sonstiges2 = false;
	private boolean sonstiges3 = false;
	private boolean geburtstagskarte = false;
	private java.lang.String telFileTransfer = "";
	private java.lang.String fTP = "";
	private int farbcode = 0;
	private java.lang.String m_042_002_Sprachen_Bezeichnung = "";
	private java.lang.String m_040_012_Länder_PostCode = "";
	private java.lang.String m_026_014_Anrede_Adr = "";
	private java.lang.String position = "";
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private java.lang.String adressfeld2 = "";
	private java.lang.String adressfeld3 = "";
	private java.lang.String kennzeichen1 = "";
	private java.lang.String kennzeichen2 = "";
	private java.lang.String kennzeichen3 = "";
	private java.lang.String firmenname2 = "";
	private boolean hotSync = false;
	private int palmDID = 0;
	private boolean privat = false;
	private int importDID = 0;
	private java.lang.String importKBZ = "";
	private int _068_001_KundenDID = 0;
	private java.lang.String internetPasswort = "";
	private int _023_001_MessageFolderDID = 0;
	private boolean inaktiv = false;
	private java.lang.StringBuilder personenprofil = new java.lang.StringBuilder();
	private int _060_001_LieferantenDID = 0;
	private int m_060_011_LieferantenNR = 0;
	private int dayOfYearGeb = 0;
	private java.lang.String email2 = "";
	private java.lang.String uuid = "";
	// generierte felder - Ende

	// public static FieldSpec UUID = new FieldSpec("uuid", 68, 80,
	// "java.lang.String", null);
	// public static FieldSpec VORNAME = new FieldSpec("vorname", 13, 40,
	// "java.lang.String", null);
	// public static FieldSpec NACHNAME = new FieldSpec("nachname", 14, 60,
	// "java.lang.String", null);
	// public static FieldSpec FIRMENNAME = new FieldSpec("firmenname", 11, 50,
	// "java.lang.String", null);
	// public static FieldSpec FIRMENNAME_2 = new FieldSpec("firmenname2", 53,
	// 50,
	// "java.lang.String", null);
	// public static FieldSpec TELEFON = new FieldSpec("telefon", 20, 40,
	// "java.lang.String", null);
	// public static FieldSpec HANDY = new FieldSpec("handy", 22, 40,
	// "java.lang.String", null);
	// public static FieldSpec EMAIL = new FieldSpec("eMail", 23, 80,
	// "java.lang.String", null);
	// public static FieldSpec EMAIL2 = new FieldSpec("email2", 67, 80,
	// "java.lang.String", null);
	// public static FieldSpec PLZ = new FieldSpec("pLZ", 17, 10,
	// "java.lang.String", null);
	// public static FieldSpec ORT = new FieldSpec("ort", 18, 40,
	// "java.lang.String", null);
	// public static FieldSpec STRASSE = new FieldSpec("adressfeld1", 16, 40,
	// "java.lang.String", null);

	// generierte FieldSpec-Listes

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
			new FieldSpec("firmenname", 11, 50, "java.lang.String", null),
			new FieldSpec("_026_001__AnredeTabelle_DID", 12, 0, "int",
					new OneObjectPointer(26, 1, "AnredeTabelle", "dID")),
			new FieldSpec("vorname", 13, 40, "java.lang.String", null),
			new FieldSpec("nachname", 14, 60, "java.lang.String", null),
			new FieldSpec("abteilung", 15, 40, "java.lang.String", null),
			new FieldSpec("adressfeld1", 16, 40, "java.lang.String", null),
			new FieldSpec("pLZ", 17, 10, "java.lang.String", null),
			new FieldSpec("ort", 18, 40, "java.lang.String", null),
			new FieldSpec("_040_001_Länder_DID", 19, 0, "int",
					new OneObjectPointer(40, 1, "Länder", "dID")),
			new FieldSpec("telefon", 20, 40, "java.lang.String", null),
			new FieldSpec("fax", 21, 40, "java.lang.String", null),
			new FieldSpec("handy", 22, 40, "java.lang.String", null),
			new FieldSpec("eMail", 23, 80, "java.lang.String", null),
			new FieldSpec("wWW", 24, 80, "java.lang.String", null),
			new FieldSpec("titel", 25, 40, "java.lang.String", null),
			new FieldSpec("telefon_Privat", 26, 40, "java.lang.String", null),
			new FieldSpec("_042_001_Sprachen_SprachenNr", 27, 0, "int",
					new OneObjectPointer(42, 1, "Sprachen", "sprachenNr")),
			new FieldSpec("m_068_011_KundenNr", 28, 0, "int", null),
			new FieldSpec("geburtstag", 29, 0, "java.sql.Date", null),
			new FieldSpec("mailflag1", 30, 0, "boolean", null),
			new FieldSpec("mailflag2", 31, 0, "boolean", null),
			new FieldSpec("kunde", 32, 0, "boolean", null),
			new FieldSpec("lieferant", 33, 0, "boolean", null),
			new FieldSpec("spedition", 34, 0, "boolean", null),
			new FieldSpec("berater", 35, 0, "boolean", null),
			new FieldSpec("sonstiges1", 36, 0, "boolean", null),
			new FieldSpec("sonstiges2", 37, 0, "boolean", null),
			new FieldSpec("sonstiges3", 38, 0, "boolean", null),
			new FieldSpec("geburtstagskarte", 39, 0, "boolean", null),
			new FieldSpec("telFileTransfer", 40, 40, "java.lang.String", null),
			new FieldSpec("fTP", 41, 80, "java.lang.String", null),
			new FieldSpec("farbcode", 42, 0, "int", null),
			new FieldSpec("m_042_002_Sprachen_Bezeichnung", 43, 40,
					"java.lang.String", null),
			new FieldSpec("m_040_012_Länder_PostCode", 44, 5,
					"java.lang.String", null),
			new FieldSpec("m_026_014_Anrede_Adr", 45, 20, "java.lang.String",
					null),
			new FieldSpec("position", 46, 40, "java.lang.String", null),
			new FieldSpec("kommentar", 47, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("adressfeld2", 48, 40, "java.lang.String", null),
			new FieldSpec("adressfeld3", 49, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen1", 50, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen2", 51, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen3", 52, 40, "java.lang.String", null),
			new FieldSpec("firmenname2", 53, 50, "java.lang.String", null),
			new FieldSpec("hotSync", 54, 0, "boolean", null),
			new FieldSpec("palmDID", 55, 0, "int", null),
			new FieldSpec("privat", 56, 0, "boolean", null),
			new FieldSpec("importDID", 57, 0, "int", null),
			new FieldSpec("importKBZ", 58, 40, "java.lang.String", null),
			new FieldSpec("_068_001_KundenDID", 59, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("internetPasswort", 60, 20, "java.lang.String", null),
			new FieldSpec("_023_001_MessageFolderDID", 61, 0, "int",
					new OneObjectPointer(23, 1, "MessageFolderDID", "")),
			new FieldSpec("inaktiv", 62, 0, "boolean", null),
			new FieldSpec("personenprofil", 63, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("_060_001_LieferantenDID", 64, 0, "int",
					new OneObjectPointer(60, 1, "LieferantenDID", "")),
			new FieldSpec("m_060_011_LieferantenNR", 65, 0, "int", null),
			new FieldSpec("dayOfYearGeb", 66, 0, "int", null),
			new FieldSpec("email2", 67, 80, "java.lang.String", null),
			new FieldSpec("uuid", 68, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Adressen() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.gammadata.tom.four_d_access.dbBeans.BasicBean#getUuid_fn()
	 */
	@Override
	public int getUuid_fn() {
		return uuid_Fn;
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

	public void setFirmenname(java.lang.String inp) {
		firmenname = inp;
	}

	public java.lang.String getFirmenname()

	{
		return firmenname;
	}

	public void set_026_001__AnredeTabelle_DID(int inp) {
		_026_001__AnredeTabelle_DID = inp;
	}

	public int get_026_001__AnredeTabelle_DID()

	{
		return _026_001__AnredeTabelle_DID;
	}

	public void setVorname(java.lang.String inp) {
		vorname = inp;
	}

	public java.lang.String getVorname()

	{
		return vorname;
	}

	public void setNachname(java.lang.String inp) {
		nachname = inp;
	}

	public java.lang.String getNachname()

	{
		return nachname;
	}

	public void setAbteilung(java.lang.String inp) {
		abteilung = inp;
	}

	public java.lang.String getAbteilung()

	{
		return abteilung;
	}

	public void setAdressfeld1(java.lang.String inp) {
		adressfeld1 = inp;
	}

	public java.lang.String getAdressfeld1()

	{
		return adressfeld1;
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

	public void setTelefon(java.lang.String inp) {
		telefon = inp;
	}

	public java.lang.String getTelefon()

	{
		return telefon;
	}

	public void setFax(java.lang.String inp) {
		fax = inp;
	}

	public java.lang.String getFax()

	{
		return fax;
	}

	public void setHandy(java.lang.String inp) {
		handy = inp;
	}

	public java.lang.String getHandy()

	{
		return handy;
	}

	public void setEMail(java.lang.String inp) {
		eMail = inp;
	}

	public java.lang.String getEMail()

	{
		return eMail;
	}

	public void setWWW(java.lang.String inp) {
		wWW = inp;
	}

	public java.lang.String getWWW()

	{
		return wWW;
	}

	public void setTitel(java.lang.String inp) {
		titel = inp;
	}

	public java.lang.String getTitel()

	{
		return titel;
	}

	public void setTelefon_Privat(java.lang.String inp) {
		telefon_Privat = inp;
	}

	public java.lang.String getTelefon_Privat()

	{
		return telefon_Privat;
	}

	public void set_042_001_Sprachen_SprachenNr(int inp) {
		_042_001_Sprachen_SprachenNr = inp;
	}

	public int get_042_001_Sprachen_SprachenNr()

	{
		return _042_001_Sprachen_SprachenNr;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setGeburtstag(java.sql.Date inp) {
		geburtstag = inp;
	}

	public java.sql.Date getGeburtstag()

	{
		return geburtstag;
	}

	public void setMailflag1(boolean inp) {
		mailflag1 = inp;
	}

	public boolean getMailflag1()

	{
		return mailflag1;
	}

	public void setMailflag2(boolean inp) {
		mailflag2 = inp;
	}

	public boolean getMailflag2()

	{
		return mailflag2;
	}

	public void setKunde(boolean inp) {
		kunde = inp;
	}

	public boolean getKunde()

	{
		return kunde;
	}

	public void setLieferant(boolean inp) {
		lieferant = inp;
	}

	public boolean getLieferant()

	{
		return lieferant;
	}

	public void setSpedition(boolean inp) {
		spedition = inp;
	}

	public boolean getSpedition()

	{
		return spedition;
	}

	public void setBerater(boolean inp) {
		berater = inp;
	}

	public boolean getBerater()

	{
		return berater;
	}

	public void setSonstiges1(boolean inp) {
		sonstiges1 = inp;
	}

	public boolean getSonstiges1()

	{
		return sonstiges1;
	}

	public void setSonstiges2(boolean inp) {
		sonstiges2 = inp;
	}

	public boolean getSonstiges2()

	{
		return sonstiges2;
	}

	public void setSonstiges3(boolean inp) {
		sonstiges3 = inp;
	}

	public boolean getSonstiges3()

	{
		return sonstiges3;
	}

	public void setGeburtstagskarte(boolean inp) {
		geburtstagskarte = inp;
	}

	public boolean getGeburtstagskarte()

	{
		return geburtstagskarte;
	}

	public void setTelFileTransfer(java.lang.String inp) {
		telFileTransfer = inp;
	}

	public java.lang.String getTelFileTransfer()

	{
		return telFileTransfer;
	}

	public void setFTP(java.lang.String inp) {
		fTP = inp;
	}

	public java.lang.String getFTP()

	{
		return fTP;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void setM_042_002_Sprachen_Bezeichnung(java.lang.String inp) {
		m_042_002_Sprachen_Bezeichnung = inp;
	}

	public java.lang.String getM_042_002_Sprachen_Bezeichnung()

	{
		return m_042_002_Sprachen_Bezeichnung;
	}

	public void setM_040_012_Länder_PostCode(java.lang.String inp) {
		m_040_012_Länder_PostCode = inp;
	}

	public java.lang.String getM_040_012_Länder_PostCode()

	{
		return m_040_012_Länder_PostCode;
	}

	public void setM_026_014_Anrede_Adr(java.lang.String inp) {
		m_026_014_Anrede_Adr = inp;
	}

	public java.lang.String getM_026_014_Anrede_Adr()

	{
		return m_026_014_Anrede_Adr;
	}

	public void setPosition(java.lang.String inp) {
		position = inp;
	}

	public java.lang.String getPosition()

	{
		return position;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setAdressfeld2(java.lang.String inp) {
		adressfeld2 = inp;
	}

	public java.lang.String getAdressfeld2()

	{
		return adressfeld2;
	}

	public void setAdressfeld3(java.lang.String inp) {
		adressfeld3 = inp;
	}

	public java.lang.String getAdressfeld3()

	{
		return adressfeld3;
	}

	public void setKennzeichen1(java.lang.String inp) {
		kennzeichen1 = inp;
	}

	public java.lang.String getKennzeichen1()

	{
		return kennzeichen1;
	}

	public void setKennzeichen2(java.lang.String inp) {
		kennzeichen2 = inp;
	}

	public java.lang.String getKennzeichen2()

	{
		return kennzeichen2;
	}

	public void setKennzeichen3(java.lang.String inp) {
		kennzeichen3 = inp;
	}

	public java.lang.String getKennzeichen3()

	{
		return kennzeichen3;
	}

	public void setFirmenname2(java.lang.String inp) {
		firmenname2 = inp;
	}

	public java.lang.String getFirmenname2()

	{
		return firmenname2;
	}

	public void setHotSync(boolean inp) {
		hotSync = inp;
	}

	public boolean getHotSync()

	{
		return hotSync;
	}

	public void setPalmDID(int inp) {
		palmDID = inp;
	}

	public int getPalmDID()

	{
		return palmDID;
	}

	public void setPrivat(boolean inp) {
		privat = inp;
	}

	public boolean getPrivat()

	{
		return privat;
	}

	public void setImportDID(int inp) {
		importDID = inp;
	}

	public int getImportDID()

	{
		return importDID;
	}

	public void setImportKBZ(java.lang.String inp) {
		importKBZ = inp;
	}

	public java.lang.String getImportKBZ()

	{
		return importKBZ;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void setInternetPasswort(java.lang.String inp) {
		internetPasswort = inp;
	}

	public java.lang.String getInternetPasswort()

	{
		return internetPasswort;
	}

	public void set_023_001_MessageFolderDID(int inp) {
		_023_001_MessageFolderDID = inp;
	}

	public int get_023_001_MessageFolderDID()

	{
		return _023_001_MessageFolderDID;
	}

	public void setInaktiv(boolean inp) {
		inaktiv = inp;
	}

	public boolean getInaktiv()

	{
		return inaktiv;
	}

	public void setPersonenprofil(java.lang.StringBuilder inp) {
		personenprofil = inp;
	}

	public java.lang.StringBuilder getPersonenprofil()

	{
		return personenprofil;
	}

	public void set_060_001_LieferantenDID(int inp) {
		_060_001_LieferantenDID = inp;
	}

	public int get_060_001_LieferantenDID()

	{
		return _060_001_LieferantenDID;
	}

	public void setM_060_011_LieferantenNR(int inp) {
		m_060_011_LieferantenNR = inp;
	}

	public int getM_060_011_LieferantenNR()

	{
		return m_060_011_LieferantenNR;
	}

	public void setDayOfYearGeb(int inp) {
		dayOfYearGeb = inp;
	}

	public int getDayOfYearGeb()

	{
		return dayOfYearGeb;
	}

	public void setEmail2(java.lang.String inp) {
		email2 = inp;
	}

	public java.lang.String getEmail2()

	{
		return email2;
	}

	public void setUuid(java.lang.String inp) {
		uuid = inp;
	}

	public java.lang.String getUuid()

	{
		return uuid;
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
		builder.append("Adressen [new=");
		builder.append(isNewObject());
		builder.append(", uuid=");
		builder.append(uuid);
		builder.append(", xmlObjektId=");
		builder.append(xmlObjektId);
		builder.append(", dID=");
		builder.append(dID);
		builder.append(", dL=");
		builder.append(dL);
		builder.append(", dEAM=");
		builder.append(dEAM);
		builder.append(", dEVON=");
		builder.append(dEVON);
		builder.append(", dGAM=");
		builder.append(dGAM);
		builder.append(", dMandant=");
		builder.append(dMandant);
		builder.append(", dGVON=");
		builder.append(dGVON);
		builder.append(", dG=");
		builder.append(dG);
		builder.append(", dStandort=");
		builder.append(dStandort);
		builder.append(", dDEL=");
		builder.append(dDEL);
		builder.append(", firmenname=");
		builder.append(firmenname);
		builder.append(", _026_001__AnredeTabelle_DID=");
		builder.append(_026_001__AnredeTabelle_DID);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", abteilung=");
		builder.append(abteilung);
		builder.append(", adressfeld1=");
		builder.append(adressfeld1);
		builder.append(", pLZ=");
		builder.append(pLZ);
		builder.append(", ort=");
		builder.append(ort);
		builder.append(", _040_001_Länder_DID=");
		builder.append(_040_001_Länder_DID);
		builder.append(", telefon=");
		builder.append(telefon);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", handy=");
		builder.append(handy);
		builder.append(", eMail=");
		builder.append(eMail);
		builder.append(", wWW=");
		builder.append(wWW);
		builder.append(", titel=");
		builder.append(titel);
		builder.append(", telefon_Privat=");
		builder.append(telefon_Privat);
		builder.append(", _042_001_Sprachen_SprachenNr=");
		builder.append(_042_001_Sprachen_SprachenNr);
		builder.append(", m_068_011_KundenNr=");
		builder.append(m_068_011_KundenNr);
		builder.append(", geburtstag=");
		builder.append(geburtstag);
		builder.append(", mailflag1=");
		builder.append(mailflag1);
		builder.append(", mailflag2=");
		builder.append(mailflag2);
		builder.append(", kunde=");
		builder.append(kunde);
		builder.append(", lieferant=");
		builder.append(lieferant);
		builder.append(", spedition=");
		builder.append(spedition);
		builder.append(", berater=");
		builder.append(berater);
		builder.append(", sonstiges1=");
		builder.append(sonstiges1);
		builder.append(", sonstiges2=");
		builder.append(sonstiges2);
		builder.append(", sonstiges3=");
		builder.append(sonstiges3);
		builder.append(", geburtstagskarte=");
		builder.append(geburtstagskarte);
		builder.append(", telFileTransfer=");
		builder.append(telFileTransfer);
		builder.append(", fTP=");
		builder.append(fTP);
		builder.append(", farbcode=");
		builder.append(farbcode);
		builder.append(", m_042_002_Sprachen_Bezeichnung=");
		builder.append(m_042_002_Sprachen_Bezeichnung);
		builder.append(", m_040_012_Länder_PostCode=");
		builder.append(m_040_012_Länder_PostCode);
		builder.append(", m_026_014_Anrede_Adr=");
		builder.append(m_026_014_Anrede_Adr);
		builder.append(", position=");
		builder.append(position);
		builder.append(", kommentar=");
		builder.append(kommentar);
		builder.append(", adressfeld2=");
		builder.append(adressfeld2);
		builder.append(", adressfeld3=");
		builder.append(adressfeld3);
		builder.append(", kennzeichen1=");
		builder.append(kennzeichen1);
		builder.append(", kennzeichen2=");
		builder.append(kennzeichen2);
		builder.append(", kennzeichen3=");
		builder.append(kennzeichen3);
		builder.append(", firmenname2=");
		builder.append(firmenname2);
		builder.append(", hotSync=");
		builder.append(hotSync);
		builder.append(", palmDID=");
		builder.append(palmDID);
		builder.append(", privat=");
		builder.append(privat);
		builder.append(", importDID=");
		builder.append(importDID);
		builder.append(", importKBZ=");
		builder.append(importKBZ);
		builder.append(", _068_001_KundenDID=");
		builder.append(_068_001_KundenDID);
		builder.append(", internetPasswort=");
		builder.append(internetPasswort);
		builder.append(", _023_001_MessageFolderDID=");
		builder.append(_023_001_MessageFolderDID);
		builder.append(", inaktiv=");
		builder.append(inaktiv);
		builder.append(", personenprofil=");
		builder.append(personenprofil);
		builder.append(", _060_001_LieferantenDID=");
		builder.append(_060_001_LieferantenDID);
		builder.append(", m_060_011_LieferantenNR=");
		builder.append(m_060_011_LieferantenNR);
		builder.append(", dayOfYearGeb=");
		builder.append(dayOfYearGeb);
		builder.append(", email2=");
		builder.append(email2);
		builder.append("]");
		return builder.toString();
	}

	public String toStringCompact() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adressen [dID=");
		builder.append(dID);
		builder.append(", uuid=");
		builder.append(uuid);
		builder.append(", dMandant=");
		builder.append(dMandant);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", firmenname=");
		builder.append(firmenname);
		builder.append(" " + firmenname2);
		builder.append(", adressfeld1=");
		builder.append(adressfeld1);
		builder.append(", pLZ=");
		builder.append(pLZ);
		builder.append(", ort=");
		builder.append(ort);
		builder.append(", telefon=");
		builder.append(telefon);
		builder.append(", handy=");
		builder.append(handy);
		builder.append(", eMail=");
		builder.append(eMail);
		builder.append(", email2=");
		builder.append(email2);
		builder.append("]");
		return builder.toString();
	}

}
