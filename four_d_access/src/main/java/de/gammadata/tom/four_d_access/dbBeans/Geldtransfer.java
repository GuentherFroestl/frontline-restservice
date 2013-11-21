/*
 * Geldtransfer.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 69 mit dem Namen "Geldtransfer"
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

public class Geldtransfer extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Geldtransfer";
	public static final int dbTabNummer = 69;
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
	public static int _083_001_GeldkontenDID_Fn = 11;
	public static int m_083_011_GeldkontoBezeichnung_Fn = 12;
	public static int _060_001_LieferantenDID_Fn = 13;
	public static int betrag_Fn = 14;
	public static int _005_001_Währungen_DID_Fn = 15;
	public static int kurs_Fn = 16;
	public static int datum_Fn = 17;
	public static int m_005_011__015_Währungszeichen_Fn = 18;
	public static int _005_001_RefWährungen_DID_Fn = 19;
	public static int aus_Eingang_Fn = 20;
	public static int betrag_RefWährung_Fn = 21;
	public static int verwendungszweck_Fn = 22;
	public static int firmenname_Fn = 23;
	public static int bankkontoNr_Fn = 24;
	public static int bankleitzahl_Fn = 25;
	public static int bankname_Fn = 26;
	public static int mitarbeiterID_Fn = 27;
	public static int bH_Transfer_Flag_Fn = 28;
	public static int _006_001_Konten_DID_Fn = 29;
	public static int m_006_011_KontoNr_Fn = 30;
	public static int zahlungsart_Fn = 31;
	public static int m_006_012_KontoBez_Fn = 32;
	public static int _009_001_AdressenDID_Fn = 33;
	public static int adressfeld_Fn = 34;
	public static int lastLieferantenDID_Fn = 35;
	public static int zahlung_ausgführt_Fn = 36;
	public static int _068_001_KundenDID_Fn = 37;
	public static int lastKundenDID_Fn = 38;
	public static int dTA_NR_Fn = 39;
	public static int banked_Fn = 40;
	public static int belegNr_Fn = 41;
	public static int _030_001_BuchPosDID_Fn = 42;
	public static int _022_001_Vorgang_DID_Fn = 43;
	public static int m_022_031__039_VorgangNr_Fn = 44;
	public static int _003_001_Steuersatz_Fn = 45;
	public static int m_003_011SteuersatzBez_Fn = 46;
	public static int steuersatz_Fn = 47;
	public static int manuell_Jobertrag_Fn = 48;
	public static int aufwand_Fn = 49;
	public static int erloes_Fn = 50;
	public static int nettobetrag_Fn = 51;
	public static int _081_001_Kost1_DID_Fn = 52;
	public static int _081_001_Kost2_DID_Fn = 53;
	public static int datum_Transit_Fn = 54;
	public static int _030_001_BuPos_Transit_Fn = 55;

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
	private int _083_001_GeldkontenDID = 0;
	private java.lang.String m_083_011_GeldkontoBezeichnung = "";
	private int _060_001_LieferantenDID = 0;
	private double betrag = 0;
	private int _005_001_Währungen_DID = 0;
	private double kurs = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.lang.String m_005_011__015_Währungszeichen = "";
	private int _005_001_RefWährungen_DID = 0;
	private boolean aus_Eingang = false;
	private double betrag_RefWährung = 0;
	private java.lang.StringBuilder verwendungszweck = new java.lang.StringBuilder();
	private java.lang.String firmenname = "";
	private double bankkontoNr = 0;
	private int bankleitzahl = 0;
	private java.lang.String bankname = "";
	private int mitarbeiterID = 0;
	private boolean bH_Transfer_Flag = false;
	private int _006_001_Konten_DID = 0;
	private int m_006_011_KontoNr = 0;
	private int zahlungsart = 0;
	private java.lang.String m_006_012_KontoBez = "";
	private int _009_001_AdressenDID = 0;
	private java.lang.StringBuilder adressfeld = new java.lang.StringBuilder();
	private int lastLieferantenDID = 0;
	private boolean zahlung_ausgführt = false;
	private int _068_001_KundenDID = 0;
	private int lastKundenDID = 0;
	private int dTA_NR = 0;
	private boolean banked = false;
	private java.lang.String belegNr = "";
	private int _030_001_BuchPosDID = 0;
	private int _022_001_Vorgang_DID = 0;
	private java.lang.String m_022_031__039_VorgangNr = "";
	private int _003_001_Steuersatz = 0;
	private java.lang.String m_003_011SteuersatzBez = "";
	private double steuersatz = 0;
	private int manuell_Jobertrag = 0;
	private boolean aufwand = false;
	private boolean erloes = false;
	private double nettobetrag = 0;
	private int _081_001_Kost1_DID = 0;
	private int _081_001_Kost2_DID = 0;
	private java.sql.Date datum_Transit = new java.sql.Date(0);
	private int _030_001_BuPos_Transit = 0;
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
			new FieldSpec("_083_001_GeldkontenDID", 11, 0, "int",
					new OneObjectPointer(83, 1, "GeldkontenDID", "")),
			new FieldSpec("m_083_011_GeldkontoBezeichnung", 12, 40,
					"java.lang.String", null),
			new FieldSpec("_060_001_LieferantenDID", 13, 0, "int",
					new OneObjectPointer(60, 1, "LieferantenDID", "")),
			new FieldSpec("betrag", 14, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 15, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("kurs", 16, 0, "double", null),
			new FieldSpec("datum", 17, 0, "java.sql.Date", null),
			new FieldSpec("m_005_011__015_Währungszeichen", 18, 5,
					"java.lang.String", null),
			new FieldSpec("_005_001_RefWährungen_DID", 19, 0, "int",
					new OneObjectPointer(5, 1, "RefWährungen", "dID")),
			new FieldSpec("aus_Eingang", 20, 0, "boolean", null),
			new FieldSpec("betrag_RefWährung", 21, 0, "double", null),
			new FieldSpec("verwendungszweck", 22, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("firmenname", 23, 26, "java.lang.String", null),
			new FieldSpec("bankkontoNr", 24, 0, "double", null),
			new FieldSpec("bankleitzahl", 25, 0, "int", null),
			new FieldSpec("bankname", 26, 26, "java.lang.String", null),
			new FieldSpec("mitarbeiterID", 27, 0, "int", null),
			new FieldSpec("bH_Transfer_Flag", 28, 0, "boolean", null),
			new FieldSpec("_006_001_Konten_DID", 29, 0, "int",
					new OneObjectPointer(6, 1, "Konten", "dID")),
			new FieldSpec("m_006_011_KontoNr", 30, 0, "int", null),
			new FieldSpec("zahlungsart", 31, 0, "int", null),
			new FieldSpec("m_006_012_KontoBez", 32, 40, "java.lang.String",
					null),
			new FieldSpec("_009_001_AdressenDID", 33, 0, "int",
					new OneObjectPointer(9, 1, "AdressenDID", "")),
			new FieldSpec("adressfeld", 34, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("lastLieferantenDID", 35, 0, "int", null),
			new FieldSpec("zahlung_ausgführt", 36, 0, "boolean", null),
			new FieldSpec("_068_001_KundenDID", 37, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("lastKundenDID", 38, 0, "int", null),
			new FieldSpec("dTA_NR", 39, 0, "int", null),
			new FieldSpec("banked", 40, 0, "boolean", null),
			new FieldSpec("belegNr", 41, 20, "java.lang.String", null),
			new FieldSpec("_030_001_BuchPosDID", 42, 0, "int",
					new OneObjectPointer(30, 1, "BuchPosDID", "")),
			new FieldSpec("_022_001_Vorgang_DID", 43, 0, "int",
					new OneObjectPointer(22, 1, "Vorgang", "dID")),
			new FieldSpec("m_022_031__039_VorgangNr", 44, 40,
					"java.lang.String", null),
			new FieldSpec("_003_001_Steuersatz", 45, 0, "int",
					new OneObjectPointer(3, 1, "Steuersatz", "")),
			new FieldSpec("m_003_011SteuersatzBez", 46, 40, "java.lang.String",
					null),
			new FieldSpec("steuersatz", 47, 0, "double", null),
			new FieldSpec("manuell_Jobertrag", 48, 0, "int", null),
			new FieldSpec("aufwand", 49, 0, "boolean", null),
			new FieldSpec("erloes", 50, 0, "boolean", null),
			new FieldSpec("nettobetrag", 51, 0, "double", null),
			new FieldSpec("_081_001_Kost1_DID", 52, 0, "int",
					new OneObjectPointer(81, 1, "Kost1", "dID")),
			new FieldSpec("_081_001_Kost2_DID", 53, 0, "int",
					new OneObjectPointer(81, 1, "Kost2", "dID")),
			new FieldSpec("datum_Transit", 54, 0, "java.sql.Date", null),
			new FieldSpec("_030_001_BuPos_Transit", 55, 0, "int",
					new OneObjectPointer(30, 1, "BuPos", "transit")) };

	// generierte Feldkonstanten - Ende

	public Geldtransfer() {
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

	public void set_083_001_GeldkontenDID(int inp) {
		_083_001_GeldkontenDID = inp;
	}

	public int get_083_001_GeldkontenDID()

	{
		return _083_001_GeldkontenDID;
	}

	public void setM_083_011_GeldkontoBezeichnung(java.lang.String inp) {
		m_083_011_GeldkontoBezeichnung = inp;
	}

	public java.lang.String getM_083_011_GeldkontoBezeichnung()

	{
		return m_083_011_GeldkontoBezeichnung;
	}

	public void set_060_001_LieferantenDID(int inp) {
		_060_001_LieferantenDID = inp;
	}

	public int get_060_001_LieferantenDID()

	{
		return _060_001_LieferantenDID;
	}

	public void setBetrag(double inp) {
		betrag = inp;
	}

	public double getBetrag()

	{
		return betrag;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setM_005_011__015_Währungszeichen(java.lang.String inp) {
		m_005_011__015_Währungszeichen = inp;
	}

	public java.lang.String getM_005_011__015_Währungszeichen()

	{
		return m_005_011__015_Währungszeichen;
	}

	public void set_005_001_RefWährungen_DID(int inp) {
		_005_001_RefWährungen_DID = inp;
	}

	public int get_005_001_RefWährungen_DID()

	{
		return _005_001_RefWährungen_DID;
	}

	public void setAus_Eingang(boolean inp) {
		aus_Eingang = inp;
	}

	public boolean getAus_Eingang()

	{
		return aus_Eingang;
	}

	public void setBetrag_RefWährung(double inp) {
		betrag_RefWährung = inp;
	}

	public double getBetrag_RefWährung()

	{
		return betrag_RefWährung;
	}

	public void setVerwendungszweck(java.lang.StringBuilder inp) {
		verwendungszweck = inp;
	}

	public java.lang.StringBuilder getVerwendungszweck()

	{
		return verwendungszweck;
	}

	public void setFirmenname(java.lang.String inp) {
		firmenname = inp;
	}

	public java.lang.String getFirmenname()

	{
		return firmenname;
	}

	public void setBankkontoNr(double inp) {
		bankkontoNr = inp;
	}

	public double getBankkontoNr()

	{
		return bankkontoNr;
	}

	public void setBankleitzahl(int inp) {
		bankleitzahl = inp;
	}

	public int getBankleitzahl()

	{
		return bankleitzahl;
	}

	public void setBankname(java.lang.String inp) {
		bankname = inp;
	}

	public java.lang.String getBankname()

	{
		return bankname;
	}

	public void setMitarbeiterID(int inp) {
		mitarbeiterID = inp;
	}

	public int getMitarbeiterID()

	{
		return mitarbeiterID;
	}

	public void setBH_Transfer_Flag(boolean inp) {
		bH_Transfer_Flag = inp;
	}

	public boolean getBH_Transfer_Flag()

	{
		return bH_Transfer_Flag;
	}

	public void set_006_001_Konten_DID(int inp) {
		_006_001_Konten_DID = inp;
	}

	public int get_006_001_Konten_DID()

	{
		return _006_001_Konten_DID;
	}

	public void setM_006_011_KontoNr(int inp) {
		m_006_011_KontoNr = inp;
	}

	public int getM_006_011_KontoNr()

	{
		return m_006_011_KontoNr;
	}

	public void setZahlungsart(int inp) {
		zahlungsart = inp;
	}

	public int getZahlungsart()

	{
		return zahlungsart;
	}

	public void setM_006_012_KontoBez(java.lang.String inp) {
		m_006_012_KontoBez = inp;
	}

	public java.lang.String getM_006_012_KontoBez()

	{
		return m_006_012_KontoBez;
	}

	public void set_009_001_AdressenDID(int inp) {
		_009_001_AdressenDID = inp;
	}

	public int get_009_001_AdressenDID()

	{
		return _009_001_AdressenDID;
	}

	public void setAdressfeld(java.lang.StringBuilder inp) {
		adressfeld = inp;
	}

	public java.lang.StringBuilder getAdressfeld()

	{
		return adressfeld;
	}

	public void setLastLieferantenDID(int inp) {
		lastLieferantenDID = inp;
	}

	public int getLastLieferantenDID()

	{
		return lastLieferantenDID;
	}

	public void setZahlung_ausgführt(boolean inp) {
		zahlung_ausgführt = inp;
	}

	public boolean getZahlung_ausgführt()

	{
		return zahlung_ausgführt;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void setLastKundenDID(int inp) {
		lastKundenDID = inp;
	}

	public int getLastKundenDID()

	{
		return lastKundenDID;
	}

	public void setDTA_NR(int inp) {
		dTA_NR = inp;
	}

	public int getDTA_NR()

	{
		return dTA_NR;
	}

	public void setBanked(boolean inp) {
		banked = inp;
	}

	public boolean getBanked()

	{
		return banked;
	}

	public void setBelegNr(java.lang.String inp) {
		belegNr = inp;
	}

	public java.lang.String getBelegNr()

	{
		return belegNr;
	}

	public void set_030_001_BuchPosDID(int inp) {
		_030_001_BuchPosDID = inp;
	}

	public int get_030_001_BuchPosDID()

	{
		return _030_001_BuchPosDID;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void setM_022_031__039_VorgangNr(java.lang.String inp) {
		m_022_031__039_VorgangNr = inp;
	}

	public java.lang.String getM_022_031__039_VorgangNr()

	{
		return m_022_031__039_VorgangNr;
	}

	public void set_003_001_Steuersatz(int inp) {
		_003_001_Steuersatz = inp;
	}

	public int get_003_001_Steuersatz()

	{
		return _003_001_Steuersatz;
	}

	public void setM_003_011SteuersatzBez(java.lang.String inp) {
		m_003_011SteuersatzBez = inp;
	}

	public java.lang.String getM_003_011SteuersatzBez()

	{
		return m_003_011SteuersatzBez;
	}

	public void setSteuersatz(double inp) {
		steuersatz = inp;
	}

	public double getSteuersatz()

	{
		return steuersatz;
	}

	public void setManuell_Jobertrag(int inp) {
		manuell_Jobertrag = inp;
	}

	public int getManuell_Jobertrag()

	{
		return manuell_Jobertrag;
	}

	public void setAufwand(boolean inp) {
		aufwand = inp;
	}

	public boolean getAufwand()

	{
		return aufwand;
	}

	public void setErloes(boolean inp) {
		erloes = inp;
	}

	public boolean getErloes()

	{
		return erloes;
	}

	public void setNettobetrag(double inp) {
		nettobetrag = inp;
	}

	public double getNettobetrag()

	{
		return nettobetrag;
	}

	public void set_081_001_Kost1_DID(int inp) {
		_081_001_Kost1_DID = inp;
	}

	public int get_081_001_Kost1_DID()

	{
		return _081_001_Kost1_DID;
	}

	public void set_081_001_Kost2_DID(int inp) {
		_081_001_Kost2_DID = inp;
	}

	public int get_081_001_Kost2_DID()

	{
		return _081_001_Kost2_DID;
	}

	public void setDatum_Transit(java.sql.Date inp) {
		datum_Transit = inp;
	}

	public java.sql.Date getDatum_Transit()

	{
		return datum_Transit;
	}

	public void set_030_001_BuPos_Transit(int inp) {
		_030_001_BuPos_Transit = inp;
	}

	public int get_030_001_BuPos_Transit()

	{
		return _030_001_BuPos_Transit;
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
