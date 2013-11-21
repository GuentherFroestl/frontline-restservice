/*
 * Warenkorb.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 17 mit dem Namen "Warenkorb"
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

public class Warenkorb extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Warenkorb";
	public static final int dbTabNummer = 17;
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
	public static int bestellvermerk_Fn = 11;
	public static int datum_Fn = 12;
	public static int _009_001_BestellAdrDID_Fn = 13;
	public static int _009_001_LieferAdrDID_Fn = 14;
	public static int _009_001_RechAdrDID_Fn = 15;
	public static int xML_ADR_Fn = 16;
	public static int kundennummer_Fn = 17;
	public static int kundenDID_Fn = 18;
	public static int m_009_011_Adressen_Firmenname_Fn = 19;
	public static int m_009_014_Adressen_Nachname_Fn = 20;
	public static int kennummer_Fn = 21;
	public static int bemerkung_Fn = 22;
	public static int versandart_Fn = 23;
	public static int _005_001_WRGDID_Fn = 24;
	public static int wRG_ZEICHEN_Fn = 25;
	public static int anzPos_Fn = 26;
	public static int nettoWert_Fn = 27;
	public static int mwst_Fn = 28;
	public static int bruttoWert_Fn = 29;
	public static int uhrzeit_Fn = 30;
	public static int status_Fn = 31;

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
	private java.lang.StringBuilder bestellvermerk = new java.lang.StringBuilder();
	private java.sql.Date datum = new java.sql.Date(0);
	private int _009_001_BestellAdrDID = 0;
	private int _009_001_LieferAdrDID = 0;
	private int _009_001_RechAdrDID = 0;
	private java.lang.StringBuilder xML_ADR = new java.lang.StringBuilder();
	private int kundennummer = 0;
	private int kundenDID = 0;
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private int kennummer = 0;
	private java.lang.StringBuilder bemerkung = new java.lang.StringBuilder();
	private java.lang.String versandart = "";
	private int _005_001_WRGDID = 0;
	private java.lang.String wRG_ZEICHEN = "";
	private int anzPos = 0;
	private double nettoWert = 0;
	private double mwst = 0;
	private double bruttoWert = 0;
	private java.sql.Time uhrzeit = new java.sql.Time(0);
	private java.lang.String status = "";
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
			new FieldSpec("bestellvermerk", 11, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("datum", 12, 0, "java.sql.Date", null),
			new FieldSpec("_009_001_BestellAdrDID", 13, 0, "int",
					new OneObjectPointer(9, 1, "BestellAdrDID", "")),
			new FieldSpec("_009_001_LieferAdrDID", 14, 0, "int",
					new OneObjectPointer(9, 1, "LieferAdrDID", "")),
			new FieldSpec("_009_001_RechAdrDID", 15, 0, "int",
					new OneObjectPointer(9, 1, "RechAdrDID", "")),
			new FieldSpec("xML_ADR", 16, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("kundennummer", 17, 0, "int", null),
			new FieldSpec("kundenDID", 18, 0, "int", null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 19, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_014_Adressen_Nachname", 20, 40,
					"java.lang.String", null),
			new FieldSpec("kennummer", 21, 0, "int", null),
			new FieldSpec("bemerkung", 22, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("versandart", 23, 80, "java.lang.String", null),
			new FieldSpec("_005_001_WRGDID", 24, 0, "int",
					new OneObjectPointer(5, 1, "WRGDID", "")),
			new FieldSpec("wRG_ZEICHEN", 25, 3, "java.lang.String", null),
			new FieldSpec("anzPos", 26, 0, "int", null),
			new FieldSpec("nettoWert", 27, 0, "double", null),
			new FieldSpec("mwst", 28, 0, "double", null),
			new FieldSpec("bruttoWert", 29, 0, "double", null),
			new FieldSpec("uhrzeit", 30, 0, "java.sql.Time", null),
			new FieldSpec("status", 31, 10, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Warenkorb() {
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

	public void setBestellvermerk(java.lang.StringBuilder inp) {
		bestellvermerk = inp;
	}

	public java.lang.StringBuilder getBestellvermerk()

	{
		return bestellvermerk;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void set_009_001_BestellAdrDID(int inp) {
		_009_001_BestellAdrDID = inp;
	}

	public int get_009_001_BestellAdrDID()

	{
		return _009_001_BestellAdrDID;
	}

	public void set_009_001_LieferAdrDID(int inp) {
		_009_001_LieferAdrDID = inp;
	}

	public int get_009_001_LieferAdrDID()

	{
		return _009_001_LieferAdrDID;
	}

	public void set_009_001_RechAdrDID(int inp) {
		_009_001_RechAdrDID = inp;
	}

	public int get_009_001_RechAdrDID()

	{
		return _009_001_RechAdrDID;
	}

	public void setXML_ADR(java.lang.StringBuilder inp) {
		xML_ADR = inp;
	}

	public java.lang.StringBuilder getXML_ADR()

	{
		return xML_ADR;
	}

	public void setKundennummer(int inp) {
		kundennummer = inp;
	}

	public int getKundennummer()

	{
		return kundennummer;
	}

	public void setKundenDID(int inp) {
		kundenDID = inp;
	}

	public int getKundenDID()

	{
		return kundenDID;
	}

	public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
		m_009_011_Adressen_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Adressen_Firmenname()

	{
		return m_009_011_Adressen_Firmenname;
	}

	public void setM_009_014_Adressen_Nachname(java.lang.String inp) {
		m_009_014_Adressen_Nachname = inp;
	}

	public java.lang.String getM_009_014_Adressen_Nachname()

	{
		return m_009_014_Adressen_Nachname;
	}

	public void setKennummer(int inp) {
		kennummer = inp;
	}

	public int getKennummer()

	{
		return kennummer;
	}

	public void setBemerkung(java.lang.StringBuilder inp) {
		bemerkung = inp;
	}

	public java.lang.StringBuilder getBemerkung()

	{
		return bemerkung;
	}

	public void setVersandart(java.lang.String inp) {
		versandart = inp;
	}

	public java.lang.String getVersandart()

	{
		return versandart;
	}

	public void set_005_001_WRGDID(int inp) {
		_005_001_WRGDID = inp;
	}

	public int get_005_001_WRGDID()

	{
		return _005_001_WRGDID;
	}

	public void setWRG_ZEICHEN(java.lang.String inp) {
		wRG_ZEICHEN = inp;
	}

	public java.lang.String getWRG_ZEICHEN()

	{
		return wRG_ZEICHEN;
	}

	public void setAnzPos(int inp) {
		anzPos = inp;
	}

	public int getAnzPos()

	{
		return anzPos;
	}

	public void setNettoWert(double inp) {
		nettoWert = inp;
	}

	public double getNettoWert()

	{
		return nettoWert;
	}

	public void setMwst(double inp) {
		mwst = inp;
	}

	public double getMwst()

	{
		return mwst;
	}

	public void setBruttoWert(double inp) {
		bruttoWert = inp;
	}

	public double getBruttoWert()

	{
		return bruttoWert;
	}

	public void setUhrzeit(java.sql.Time inp) {
		uhrzeit = inp;
	}

	public java.sql.Time getUhrzeit()

	{
		return uhrzeit;
	}

	public void setStatus(java.lang.String inp) {
		status = inp;
	}

	public java.lang.String getStatus()

	{
		return status;
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
