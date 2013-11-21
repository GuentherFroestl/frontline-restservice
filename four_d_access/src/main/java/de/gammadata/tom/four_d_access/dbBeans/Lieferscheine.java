/*
 * Lieferscheine.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 66 mit dem Namen "Lieferscheine"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Lieferscheine extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Lieferscheine";
	public static final int dbTabNummer = 66;
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
	public static int lfdNr_Fn = 11;
	public static int datum_Fn = 12;
	public static int trackingCode_Fn = 13;
	public static int writePic__Fn = 14;
	public static int eingangsflag_Fn = 15;
	public static int _009_001_Adressen_DID_Fn = 16;
	public static int _068_001_Kunden_DID_Fn = 17;
	public static int _060_001_Lieferanten_DID_Fn = 18;
	public static int _041_001_Versandarten_DID_Fn = 19;
	public static int _035_001_WriteVorlagen_DID_Fn = 20;
	public static int _022_001_Vorgang_DID_Fn = 21;
	public static int vermerk1_Fn = 22;
	public static int vermerk2_Fn = 23;
	public static int vermerk3_Fn = 24;
	public static int vermerk4_Fn = 25;
	public static int m_022_031_VorgangNr_Fn = 26;
	public static int m_009_011_Adressen_Firmenname_Fn = 27;
	public static int m_009_014_Adressen_Nachname_Fn = 28;
	public static int m_068_011_KundenNr_Fn = 29;
	public static int m_060_011_Lieferanten_Nr_Fn = 30;
	public static int m_041_011_VersandartKBZ_Fn = 31;
	public static int _001_001_Mitarbeiter_DID_SB_Fn = 32;
	public static int _012_001_Zahlungsbed_DID_Fn = 33;
	public static int m_012_011_ZahlungsbedKBZ_Fn = 34;
	public static int abrechnungsCode_Fn = 35;
	public static int abzurechnen_bis_Fn = 36;
	public static int abgerechnet_Fn = 37;
	public static int lagerNummer_Fn = 38;
	public static int _005_001_Währungen_DID_Fn = 39;
	public static int m_005_011_WährZeichen_Fn = 40;
	public static int kurs_Fn = 41;
	public static int betrag_Brutto_Fn = 42;
	public static int betrag_Netto_Fn = 43;
	public static int betrag_Mwst_Fn = 44;
	public static int mwSt_pflichtig_Fn = 45;
	public static int mitPreisen_Fn = 46;
	public static int bruttoBeleg_Fn = 47;
	public static int _005_001_BezugsWährung_DID_Fn = 48;
	public static int betreff_Fn = 49;

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
	private int lfdNr = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.lang.String trackingCode = "";
	private byte[] writePic_ = new byte[0];
	private boolean eingangsflag = false;
	private int _009_001_Adressen_DID = 0;
	private int _068_001_Kunden_DID = 0;
	private int _060_001_Lieferanten_DID = 0;
	private int _041_001_Versandarten_DID = 0;
	private int _035_001_WriteVorlagen_DID = 0;
	private int _022_001_Vorgang_DID = 0;
	private java.lang.StringBuilder vermerk1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk2 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk3 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk4 = new java.lang.StringBuilder();
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private int m_068_011_KundenNr = 0;
	private int m_060_011_Lieferanten_Nr = 0;
	private java.lang.String m_041_011_VersandartKBZ = "";
	private int _001_001_Mitarbeiter_DID_SB = 0;
	private int _012_001_Zahlungsbed_DID = 0;
	private java.lang.String m_012_011_ZahlungsbedKBZ = "";
	private int abrechnungsCode = 0;
	private java.sql.Date abzurechnen_bis = new java.sql.Date(0);
	private boolean abgerechnet = false;
	private int lagerNummer = 0;
	private int _005_001_Währungen_DID = 0;
	private java.lang.String m_005_011_WährZeichen = "";
	private double kurs = 0;
	private double betrag_Brutto = 0;
	private double betrag_Netto = 0;
	private double betrag_Mwst = 0;
	private boolean mwSt_pflichtig = false;
	private boolean mitPreisen = false;
	private boolean bruttoBeleg = false;
	private int _005_001_BezugsWährung_DID = 0;
	private java.lang.String betreff = "";
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
			new FieldSpec("lfdNr", 11, 0, "int", null),
			new FieldSpec("datum", 12, 0, "java.sql.Date", null),
			new FieldSpec("trackingCode", 13, 40, "java.lang.String", null),
			new FieldSpec("writePic_", 14, 0, "byte[]", null),
			new FieldSpec("eingangsflag", 15, 0, "boolean", null),
			new FieldSpec("_009_001_Adressen_DID", 16, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 17, 0, "int", null),
			new FieldSpec("_060_001_Lieferanten_DID", 18, 0, "int", null),
			new FieldSpec("_041_001_Versandarten_DID", 19, 0, "int", null),
			new FieldSpec("_035_001_WriteVorlagen_DID", 20, 0, "int", null),
			new FieldSpec("_022_001_Vorgang_DID", 21, 0, "int", null),
			new FieldSpec("vermerk1", 22, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk2", 23, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk3", 24, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk4", 25, 0, "java.lang.StringBuilder", null),
			new FieldSpec("m_022_031_VorgangNr", 26, 30, "java.lang.String",
					null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 27, 80,
					"java.lang.String", null),
			new FieldSpec("m_009_014_Adressen_Nachname", 28, 80,
					"java.lang.String", null),
			new FieldSpec("m_068_011_KundenNr", 29, 0, "int", null),
			new FieldSpec("m_060_011_Lieferanten_Nr", 30, 0, "int", null),
			new FieldSpec("m_041_011_VersandartKBZ", 31, 40,
					"java.lang.String", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_SB", 32, 0, "int", null),
			new FieldSpec("_012_001_Zahlungsbed_DID", 33, 0, "int", null),
			new FieldSpec("m_012_011_ZahlungsbedKBZ", 34, 40,
					"java.lang.String", null),
			new FieldSpec("abrechnungsCode", 35, 0, "int", null),
			new FieldSpec("abzurechnen_bis", 36, 0, "java.sql.Date", null),
			new FieldSpec("abgerechnet", 37, 0, "boolean", null),
			new FieldSpec("lagerNummer", 38, 0, "int", null),
			new FieldSpec("_005_001_Währungen_DID", 39, 0, "int", null),
			new FieldSpec("m_005_011_WährZeichen", 40, 5, "java.lang.String",
					null), new FieldSpec("kurs", 41, 0, "double", null),
			new FieldSpec("betrag_Brutto", 42, 0, "double", null),
			new FieldSpec("betrag_Netto", 43, 0, "double", null),
			new FieldSpec("betrag_Mwst", 44, 0, "double", null),
			new FieldSpec("mwSt_pflichtig", 45, 0, "boolean", null),
			new FieldSpec("mitPreisen", 46, 0, "boolean", null),
			new FieldSpec("bruttoBeleg", 47, 0, "boolean", null),
			new FieldSpec("_005_001_BezugsWährung_DID", 48, 0, "int", null),
			new FieldSpec("betreff", 49, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Lieferscheine() {
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

	public void setLfdNr(int inp) {
		lfdNr = inp;
	}

	public int getLfdNr()

	{
		return lfdNr;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setTrackingCode(java.lang.String inp) {
		trackingCode = inp;
	}

	public java.lang.String getTrackingCode()

	{
		return trackingCode;
	}

	public void setWritePic_(byte[] inp) {
		writePic_ = inp;
	}

	public byte[] getWritePic_()

	{
		return writePic_;
	}

	public void setEingangsflag(boolean inp) {
		eingangsflag = inp;
	}

	public boolean getEingangsflag()

	{
		return eingangsflag;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void set_060_001_Lieferanten_DID(int inp) {
		_060_001_Lieferanten_DID = inp;
	}

	public int get_060_001_Lieferanten_DID()

	{
		return _060_001_Lieferanten_DID;
	}

	public void set_041_001_Versandarten_DID(int inp) {
		_041_001_Versandarten_DID = inp;
	}

	public int get_041_001_Versandarten_DID()

	{
		return _041_001_Versandarten_DID;
	}

	public void set_035_001_WriteVorlagen_DID(int inp) {
		_035_001_WriteVorlagen_DID = inp;
	}

	public int get_035_001_WriteVorlagen_DID()

	{
		return _035_001_WriteVorlagen_DID;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void setVermerk1(java.lang.StringBuilder inp) {
		vermerk1 = inp;
	}

	public java.lang.StringBuilder getVermerk1()

	{
		return vermerk1;
	}

	public void setVermerk2(java.lang.StringBuilder inp) {
		vermerk2 = inp;
	}

	public java.lang.StringBuilder getVermerk2()

	{
		return vermerk2;
	}

	public void setVermerk3(java.lang.StringBuilder inp) {
		vermerk3 = inp;
	}

	public java.lang.StringBuilder getVermerk3()

	{
		return vermerk3;
	}

	public void setVermerk4(java.lang.StringBuilder inp) {
		vermerk4 = inp;
	}

	public java.lang.StringBuilder getVermerk4()

	{
		return vermerk4;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
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

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setM_060_011_Lieferanten_Nr(int inp) {
		m_060_011_Lieferanten_Nr = inp;
	}

	public int getM_060_011_Lieferanten_Nr()

	{
		return m_060_011_Lieferanten_Nr;
	}

	public void setM_041_011_VersandartKBZ(java.lang.String inp) {
		m_041_011_VersandartKBZ = inp;
	}

	public java.lang.String getM_041_011_VersandartKBZ()

	{
		return m_041_011_VersandartKBZ;
	}

	public void set_001_001_Mitarbeiter_DID_SB(int inp) {
		_001_001_Mitarbeiter_DID_SB = inp;
	}

	public int get_001_001_Mitarbeiter_DID_SB()

	{
		return _001_001_Mitarbeiter_DID_SB;
	}

	public void set_012_001_Zahlungsbed_DID(int inp) {
		_012_001_Zahlungsbed_DID = inp;
	}

	public int get_012_001_Zahlungsbed_DID()

	{
		return _012_001_Zahlungsbed_DID;
	}

	public void setM_012_011_ZahlungsbedKBZ(java.lang.String inp) {
		m_012_011_ZahlungsbedKBZ = inp;
	}

	public java.lang.String getM_012_011_ZahlungsbedKBZ()

	{
		return m_012_011_ZahlungsbedKBZ;
	}

	public void setAbrechnungsCode(int inp) {
		abrechnungsCode = inp;
	}

	public int getAbrechnungsCode()

	{
		return abrechnungsCode;
	}

	public void setAbzurechnen_bis(java.sql.Date inp) {
		abzurechnen_bis = inp;
	}

	public java.sql.Date getAbzurechnen_bis()

	{
		return abzurechnen_bis;
	}

	public void setAbgerechnet(boolean inp) {
		abgerechnet = inp;
	}

	public boolean getAbgerechnet()

	{
		return abgerechnet;
	}

	public void setLagerNummer(int inp) {
		lagerNummer = inp;
	}

	public int getLagerNummer()

	{
		return lagerNummer;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setM_005_011_WährZeichen(java.lang.String inp) {
		m_005_011_WährZeichen = inp;
	}

	public java.lang.String getM_005_011_WährZeichen()

	{
		return m_005_011_WährZeichen;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
	}

	public void setBetrag_Brutto(double inp) {
		betrag_Brutto = inp;
	}

	public double getBetrag_Brutto()

	{
		return betrag_Brutto;
	}

	public void setBetrag_Netto(double inp) {
		betrag_Netto = inp;
	}

	public double getBetrag_Netto()

	{
		return betrag_Netto;
	}

	public void setBetrag_Mwst(double inp) {
		betrag_Mwst = inp;
	}

	public double getBetrag_Mwst()

	{
		return betrag_Mwst;
	}

	public void setMwSt_pflichtig(boolean inp) {
		mwSt_pflichtig = inp;
	}

	public boolean getMwSt_pflichtig()

	{
		return mwSt_pflichtig;
	}

	public void setMitPreisen(boolean inp) {
		mitPreisen = inp;
	}

	public boolean getMitPreisen()

	{
		return mitPreisen;
	}

	public void setBruttoBeleg(boolean inp) {
		bruttoBeleg = inp;
	}

	public boolean getBruttoBeleg()

	{
		return bruttoBeleg;
	}

	public void set_005_001_BezugsWährung_DID(int inp) {
		_005_001_BezugsWährung_DID = inp;
	}

	public int get_005_001_BezugsWährung_DID()

	{
		return _005_001_BezugsWährung_DID;
	}

	public void setBetreff(java.lang.String inp) {
		betreff = inp;
	}

	public java.lang.String getBetreff()

	{
		return betreff;
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