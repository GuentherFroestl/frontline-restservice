/*
 * Lieferanten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 60 mit dem Namen "Lieferanten"
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

public class Lieferanten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Lieferanten";
	public static final int dbTabNummer = 60;
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
	public static int lieferantenNR_Fn = 11;
	public static int _009_001_Adressen_DID_Fn = 12;
	public static int kundenNr_Fn = 13;
	public static int kommentare_Fn = 14;
	public static int _006_001_Konten_Kreditorkonto_Fn = 15;
	public static int ustID_Fn = 16;
	public static int _005_001_Währungen_DID_Fn = 17;
	public static int kreditLimit_Fn = 18;
	public static int _012_001_Zahlungsbed_DID_Fn = 19;
	public static int bank_Fn = 20;
	public static int bLZ_Fn = 21;
	public static int kontoNr_Fn = 22;
	public static int _042_001_Sprachen_Nr_Fn = 23;
	public static int m_009_014_Adressen_Nachname_Fn = 24;
	public static int m_009_011_Adressen_Firmenname_Fn = 25;
	public static int lieferstopp_Fn = 26;
	public static int inland_Fn = 27;
	public static int eU_Fn = 28;
	public static int rDW_Fn = 29;
	public static int frei_Haus_Fn = 30;
	public static int m_009_020_Adressen_Telefon_Fn = 31;
	public static int mwSt_plichtig_Fn = 32;
	public static int m_006_011__015_KontoNr_Fn = 33;
	public static int m_005_011__017_Währung_Fn = 34;
	public static int internetshop_Fn = 35;
	public static int username_Fn = 36;
	public static int kennwort_Fn = 37;
	public static int iBAN_Fn = 38;
	public static int bIC_SWIFT_Fn = 39;
	public static int emailMx_Fn = 40;

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
	private int lieferantenNR = 0;
	private int _009_001_Adressen_DID = 0;
	private java.lang.String kundenNr = "";
	private java.lang.StringBuilder kommentare = new java.lang.StringBuilder();
	private int _006_001_Konten_Kreditorkonto = 0;
	private java.lang.String ustID = "";
	private int _005_001_Währungen_DID = 0;
	private double kreditLimit = 0;
	private int _012_001_Zahlungsbed_DID = 0;
	private java.lang.String bank = "";
	private int bLZ = 0;
	private double kontoNr = 0;
	private int _042_001_Sprachen_Nr = 0;
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private boolean lieferstopp = false;
	private boolean inland = false;
	private boolean eU = false;
	private boolean rDW = false;
	private boolean frei_Haus = false;
	private java.lang.String m_009_020_Adressen_Telefon = "";
	private boolean mwSt_plichtig = false;
	private int m_006_011__015_KontoNr = 0;
	private java.lang.String m_005_011__017_Währung = "";
	private java.lang.StringBuilder internetshop = new java.lang.StringBuilder();
	private java.lang.String username = "";
	private java.lang.String kennwort = "";
	private java.lang.String iBAN = "";
	private java.lang.String bIC_SWIFT = "";
	private java.lang.String emailMx = "";
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
			new FieldSpec("lieferantenNR", 11, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID", 12, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("kundenNr", 13, 40, "java.lang.String", null),
			new FieldSpec("kommentare", 14, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_006_001_Konten_Kreditorkonto", 15, 0, "int",
					new OneObjectPointer(6, 1, "Konten", "kreditorkonto")),
			new FieldSpec("ustID", 16, 20, "java.lang.String", null),
			new FieldSpec("_005_001_Währungen_DID", 17, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("kreditLimit", 18, 0, "double", null),
			new FieldSpec("_012_001_Zahlungsbed_DID", 19, 0, "int",
					new OneObjectPointer(12, 1, "Zahlungsbed", "dID")),
			new FieldSpec("bank", 20, 60, "java.lang.String", null),
			new FieldSpec("bLZ", 21, 0, "int", null),
			new FieldSpec("kontoNr", 22, 0, "double", null),
			new FieldSpec("_042_001_Sprachen_Nr", 23, 0, "int",
					new OneObjectPointer(42, 1, "Sprachen", "nr")),
			new FieldSpec("m_009_014_Adressen_Nachname", 24, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 25, 40,
					"java.lang.String", null),
			new FieldSpec("lieferstopp", 26, 0, "boolean", null),
			new FieldSpec("inland", 27, 0, "boolean", null),
			new FieldSpec("eU", 28, 0, "boolean", null),
			new FieldSpec("rDW", 29, 0, "boolean", null),
			new FieldSpec("frei_Haus", 30, 0, "boolean", null),
			new FieldSpec("m_009_020_Adressen_Telefon", 31, 20,
					"java.lang.String", null),
			new FieldSpec("mwSt_plichtig", 32, 0, "boolean", null),
			new FieldSpec("m_006_011__015_KontoNr", 33, 0, "int", null),
			new FieldSpec("m_005_011__017_Währung", 34, 5, "java.lang.String",
					null),
			new FieldSpec("internetshop", 35, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("username", 36, 40, "java.lang.String", null),
			new FieldSpec("kennwort", 37, 40, "java.lang.String", null),
			new FieldSpec("iBAN", 38, 40, "java.lang.String", null),
			new FieldSpec("bIC_SWIFT", 39, 20, "java.lang.String", null),
			new FieldSpec("emailMx", 40, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Lieferanten() {
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

	public void setLieferantenNR(int inp) {
		lieferantenNR = inp;
	}

	public int getLieferantenNR()

	{
		return lieferantenNR;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void setKundenNr(java.lang.String inp) {
		kundenNr = inp;
	}

	public java.lang.String getKundenNr()

	{
		return kundenNr;
	}

	public void setKommentare(java.lang.StringBuilder inp) {
		kommentare = inp;
	}

	public java.lang.StringBuilder getKommentare()

	{
		return kommentare;
	}

	public void set_006_001_Konten_Kreditorkonto(int inp) {
		_006_001_Konten_Kreditorkonto = inp;
	}

	public int get_006_001_Konten_Kreditorkonto()

	{
		return _006_001_Konten_Kreditorkonto;
	}

	public void setUstID(java.lang.String inp) {
		ustID = inp;
	}

	public java.lang.String getUstID()

	{
		return ustID;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setKreditLimit(double inp) {
		kreditLimit = inp;
	}

	public double getKreditLimit()

	{
		return kreditLimit;
	}

	public void set_012_001_Zahlungsbed_DID(int inp) {
		_012_001_Zahlungsbed_DID = inp;
	}

	public int get_012_001_Zahlungsbed_DID()

	{
		return _012_001_Zahlungsbed_DID;
	}

	public void setBank(java.lang.String inp) {
		bank = inp;
	}

	public java.lang.String getBank()

	{
		return bank;
	}

	public void setBLZ(int inp) {
		bLZ = inp;
	}

	public int getBLZ()

	{
		return bLZ;
	}

	public void setKontoNr(double inp) {
		kontoNr = inp;
	}

	public double getKontoNr()

	{
		return kontoNr;
	}

	public void set_042_001_Sprachen_Nr(int inp) {
		_042_001_Sprachen_Nr = inp;
	}

	public int get_042_001_Sprachen_Nr()

	{
		return _042_001_Sprachen_Nr;
	}

	public void setM_009_014_Adressen_Nachname(java.lang.String inp) {
		m_009_014_Adressen_Nachname = inp;
	}

	public java.lang.String getM_009_014_Adressen_Nachname()

	{
		return m_009_014_Adressen_Nachname;
	}

	public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
		m_009_011_Adressen_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Adressen_Firmenname()

	{
		return m_009_011_Adressen_Firmenname;
	}

	public void setLieferstopp(boolean inp) {
		lieferstopp = inp;
	}

	public boolean getLieferstopp()

	{
		return lieferstopp;
	}

	public void setInland(boolean inp) {
		inland = inp;
	}

	public boolean getInland()

	{
		return inland;
	}

	public void setEU(boolean inp) {
		eU = inp;
	}

	public boolean getEU()

	{
		return eU;
	}

	public void setRDW(boolean inp) {
		rDW = inp;
	}

	public boolean getRDW()

	{
		return rDW;
	}

	public void setFrei_Haus(boolean inp) {
		frei_Haus = inp;
	}

	public boolean getFrei_Haus()

	{
		return frei_Haus;
	}

	public void setM_009_020_Adressen_Telefon(java.lang.String inp) {
		m_009_020_Adressen_Telefon = inp;
	}

	public java.lang.String getM_009_020_Adressen_Telefon()

	{
		return m_009_020_Adressen_Telefon;
	}

	public void setMwSt_plichtig(boolean inp) {
		mwSt_plichtig = inp;
	}

	public boolean getMwSt_plichtig()

	{
		return mwSt_plichtig;
	}

	public void setM_006_011__015_KontoNr(int inp) {
		m_006_011__015_KontoNr = inp;
	}

	public int getM_006_011__015_KontoNr()

	{
		return m_006_011__015_KontoNr;
	}

	public void setM_005_011__017_Währung(java.lang.String inp) {
		m_005_011__017_Währung = inp;
	}

	public java.lang.String getM_005_011__017_Währung()

	{
		return m_005_011__017_Währung;
	}

	public void setInternetshop(java.lang.StringBuilder inp) {
		internetshop = inp;
	}

	public java.lang.StringBuilder getInternetshop()

	{
		return internetshop;
	}

	public void setUsername(java.lang.String inp) {
		username = inp;
	}

	public java.lang.String getUsername()

	{
		return username;
	}

	public void setKennwort(java.lang.String inp) {
		kennwort = inp;
	}

	public java.lang.String getKennwort()

	{
		return kennwort;
	}

	public void setIBAN(java.lang.String inp) {
		iBAN = inp;
	}

	public java.lang.String getIBAN()

	{
		return iBAN;
	}

	public void setBIC_SWIFT(java.lang.String inp) {
		bIC_SWIFT = inp;
	}

	public java.lang.String getBIC_SWIFT()

	{
		return bIC_SWIFT;
	}

	public void setEmailMx(java.lang.String inp) {
		emailMx = inp;
	}

	public java.lang.String getEmailMx()

	{
		return emailMx;
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
