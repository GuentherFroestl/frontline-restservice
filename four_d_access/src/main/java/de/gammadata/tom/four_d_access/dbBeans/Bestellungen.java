/*
 * Bestellungen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 59 mit dem Namen "Bestellungen"
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

public class Bestellungen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Bestellungen";
	public static final int dbTabNummer = 59;
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
	public static int _060_001__Lieferanten_DID_Fn = 11;
	public static int _012_001_Zahlungsbed_DID_Fn = 12;
	public static int bestelldatum_Fn = 13;
	public static int _009_001_Adressen_DID_AB_Fn = 14;
	public static int _009_001_Adressen_DID_LF_Fn = 15;
	public static int _009_001_Adressen_DID_RG_Fn = 16;
	public static int _001_001_Mitarbeiter_DID_Fn = 17;
	public static int _005_001_Währungen_DID_Fn = 18;
	public static int kurs_Fn = 19;
	public static int betrag_Netto_Fn = 20;
	public static int betrag_MwSt_Fn = 21;
	public static int vermerk1_Fn = 22;
	public static int vermerk2_Fn = 23;
	public static int vermerk3_Fn = 24;
	public static int vermerk4_Fn = 25;
	public static int leer_Fn = 26;
	public static int writeDID_Fn = 27;
	public static int bestellnummer_Fn = 28;
	public static int liefersperre_Fn = 29;
	public static int imKundenauftrag_Fn = 30;
	public static int m_060_011_LieferantenNr_Fn = 31;
	public static int m_060_025_LieferantenName_Fn = 32;
	public static int last_Lieferanten_DID_Fn = 33;
	public static int _022_001_Vorgänge_DID_Fn = 34;
	public static int m_022_031_VorgangNr_Fn = 35;
	public static int _035_001_WriteVorlagen_DID_Fn = 36;
	public static int writePic__Fn = 37;
	public static int anfrage_Fn = 38;
	public static int betrag_Brutto_Fn = 39;
	public static int _005_001_BezugsWährung_DID_Fn = 40;
	public static int mwSt_plichtig_Fn = 41;
	public static int last_Währungen_DID_Fn = 42;
	public static int m_005_011__018_WährZeichen_Fn = 43;
	public static int betrag_Euro_Fn = 44;
	public static int betreff_Fn = 45;
	public static int _009_001_Adressen_DID_Best_Fn = 46;
	public static int abgeschlossen_Fn = 47;

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
	private int _060_001__Lieferanten_DID = 0;
	private int _012_001_Zahlungsbed_DID = 0;
	private java.sql.Date bestelldatum = new java.sql.Date(0);
	private int _009_001_Adressen_DID_AB = 0;
	private int _009_001_Adressen_DID_LF = 0;
	private int _009_001_Adressen_DID_RG = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private int _005_001_Währungen_DID = 0;
	private double kurs = 0;
	private double betrag_Netto = 0;
	private double betrag_MwSt = 0;
	private java.lang.StringBuilder vermerk1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk2 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk3 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk4 = new java.lang.StringBuilder();
	private boolean leer = false;
	private int writeDID = 0;
	private int bestellnummer = 0;
	private boolean liefersperre = false;
	private boolean imKundenauftrag = false;
	private int m_060_011_LieferantenNr = 0;
	private java.lang.String m_060_025_LieferantenName = "";
	private int last_Lieferanten_DID = 0;
	private int _022_001_Vorgänge_DID = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private int _035_001_WriteVorlagen_DID = 0;
	private byte[] writePic_ = new byte[0];
	private boolean anfrage = false;
	private double betrag_Brutto = 0;
	private int _005_001_BezugsWährung_DID = 0;
	private boolean mwSt_plichtig = false;
	private int last_Währungen_DID = 0;
	private java.lang.String m_005_011__018_WährZeichen = "";
	private double betrag_Euro = 0;
	private java.lang.String betreff = "";
	private int _009_001_Adressen_DID_Best = 0;
	private boolean abgeschlossen = false;
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
			new FieldSpec("_060_001__Lieferanten_DID", 11, 0, "int",
					new OneObjectPointer(60, 1, "Lieferanten", "dID")),
			new FieldSpec("_012_001_Zahlungsbed_DID", 12, 0, "int",
					new OneObjectPointer(12, 1, "Zahlungsbed", "dID")),
			new FieldSpec("bestelldatum", 13, 0, "java.sql.Date", null),
			new FieldSpec("_009_001_Adressen_DID_AB", 14, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_AB")),
			new FieldSpec("_009_001_Adressen_DID_LF", 15, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_LF")),
			new FieldSpec("_009_001_Adressen_DID_RG", 16, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_RG")),
			new FieldSpec("_001_001_Mitarbeiter_DID", 17, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("_005_001_Währungen_DID", 18, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("kurs", 19, 0, "double", null),
			new FieldSpec("betrag_Netto", 20, 0, "double", null),
			new FieldSpec("betrag_MwSt", 21, 0, "double", null),
			new FieldSpec("vermerk1", 22, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("vermerk2", 23, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("vermerk3", 24, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("vermerk4", 25, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("leer", 26, 0, "boolean", null),
			new FieldSpec("writeDID", 27, 0, "int", null),
			new FieldSpec("bestellnummer", 28, 0, "int", null),
			new FieldSpec("liefersperre", 29, 0, "boolean", null),
			new FieldSpec("imKundenauftrag", 30, 0, "boolean", null),
			new FieldSpec("m_060_011_LieferantenNr", 31, 0, "int", null),
			new FieldSpec("m_060_025_LieferantenName", 32, 40,
					"java.lang.String", null),
			new FieldSpec("last_Lieferanten_DID", 33, 0, "int", null),
			new FieldSpec("_022_001_Vorgänge_DID", 34, 0, "int",
					new OneObjectPointer(22, 1, "Vorgänge", "dID")),
			new FieldSpec("m_022_031_VorgangNr", 35, 30, "java.lang.String",
					null),
			new FieldSpec("_035_001_WriteVorlagen_DID", 36, 0, "int",
					new OneObjectPointer(35, 1, "WriteVorlagen", "dID")),
			new FieldSpec("writePic_", 37, 0, "byte[]", null),
			new FieldSpec("anfrage", 38, 0, "boolean", null),
			new FieldSpec("betrag_Brutto", 39, 0, "double", null),
			new FieldSpec("_005_001_BezugsWährung_DID", 40, 0, "int",
					new OneObjectPointer(5, 1, "BezugsWährung", "dID")),
			new FieldSpec("mwSt_plichtig", 41, 0, "boolean", null),
			new FieldSpec("last_Währungen_DID", 42, 0, "int", null),
			new FieldSpec("m_005_011__018_WährZeichen", 43, 5,
					"java.lang.String", null),
			new FieldSpec("betrag_Euro", 44, 0, "double", null),
			new FieldSpec("betreff", 45, 80, "java.lang.String", null),
			new FieldSpec("_009_001_Adressen_DID_Best", 46, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_Best")),
			new FieldSpec("abgeschlossen", 47, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Bestellungen() {
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

	public void set_060_001__Lieferanten_DID(int inp) {
		_060_001__Lieferanten_DID = inp;
	}

	public int get_060_001__Lieferanten_DID()

	{
		return _060_001__Lieferanten_DID;
	}

	public void set_012_001_Zahlungsbed_DID(int inp) {
		_012_001_Zahlungsbed_DID = inp;
	}

	public int get_012_001_Zahlungsbed_DID()

	{
		return _012_001_Zahlungsbed_DID;
	}

	public void setBestelldatum(java.sql.Date inp) {
		bestelldatum = inp;
	}

	public java.sql.Date getBestelldatum()

	{
		return bestelldatum;
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

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
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

	public void setBetrag_Netto(double inp) {
		betrag_Netto = inp;
	}

	public double getBetrag_Netto()

	{
		return betrag_Netto;
	}

	public void setBetrag_MwSt(double inp) {
		betrag_MwSt = inp;
	}

	public double getBetrag_MwSt()

	{
		return betrag_MwSt;
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

	public void setLeer(boolean inp) {
		leer = inp;
	}

	public boolean getLeer()

	{
		return leer;
	}

	public void setWriteDID(int inp) {
		writeDID = inp;
	}

	public int getWriteDID()

	{
		return writeDID;
	}

	public void setBestellnummer(int inp) {
		bestellnummer = inp;
	}

	public int getBestellnummer()

	{
		return bestellnummer;
	}

	public void setLiefersperre(boolean inp) {
		liefersperre = inp;
	}

	public boolean getLiefersperre()

	{
		return liefersperre;
	}

	public void setImKundenauftrag(boolean inp) {
		imKundenauftrag = inp;
	}

	public boolean getImKundenauftrag()

	{
		return imKundenauftrag;
	}

	public void setM_060_011_LieferantenNr(int inp) {
		m_060_011_LieferantenNr = inp;
	}

	public int getM_060_011_LieferantenNr()

	{
		return m_060_011_LieferantenNr;
	}

	public void setM_060_025_LieferantenName(java.lang.String inp) {
		m_060_025_LieferantenName = inp;
	}

	public java.lang.String getM_060_025_LieferantenName()

	{
		return m_060_025_LieferantenName;
	}

	public void setLast_Lieferanten_DID(int inp) {
		last_Lieferanten_DID = inp;
	}

	public int getLast_Lieferanten_DID()

	{
		return last_Lieferanten_DID;
	}

	public void set_022_001_Vorgänge_DID(int inp) {
		_022_001_Vorgänge_DID = inp;
	}

	public int get_022_001_Vorgänge_DID()

	{
		return _022_001_Vorgänge_DID;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void set_035_001_WriteVorlagen_DID(int inp) {
		_035_001_WriteVorlagen_DID = inp;
	}

	public int get_035_001_WriteVorlagen_DID()

	{
		return _035_001_WriteVorlagen_DID;
	}

	public void setWritePic_(byte[] inp) {
		writePic_ = inp;
	}

	public byte[] getWritePic_()

	{
		return writePic_;
	}

	public void setAnfrage(boolean inp) {
		anfrage = inp;
	}

	public boolean getAnfrage()

	{
		return anfrage;
	}

	public void setBetrag_Brutto(double inp) {
		betrag_Brutto = inp;
	}

	public double getBetrag_Brutto()

	{
		return betrag_Brutto;
	}

	public void set_005_001_BezugsWährung_DID(int inp) {
		_005_001_BezugsWährung_DID = inp;
	}

	public int get_005_001_BezugsWährung_DID()

	{
		return _005_001_BezugsWährung_DID;
	}

	public void setMwSt_plichtig(boolean inp) {
		mwSt_plichtig = inp;
	}

	public boolean getMwSt_plichtig()

	{
		return mwSt_plichtig;
	}

	public void setLast_Währungen_DID(int inp) {
		last_Währungen_DID = inp;
	}

	public int getLast_Währungen_DID()

	{
		return last_Währungen_DID;
	}

	public void setM_005_011__018_WährZeichen(java.lang.String inp) {
		m_005_011__018_WährZeichen = inp;
	}

	public java.lang.String getM_005_011__018_WährZeichen()

	{
		return m_005_011__018_WährZeichen;
	}

	public void setBetrag_Euro(double inp) {
		betrag_Euro = inp;
	}

	public double getBetrag_Euro()

	{
		return betrag_Euro;
	}

	public void setBetreff(java.lang.String inp) {
		betreff = inp;
	}

	public java.lang.String getBetreff()

	{
		return betreff;
	}

	public void set_009_001_Adressen_DID_Best(int inp) {
		_009_001_Adressen_DID_Best = inp;
	}

	public int get_009_001_Adressen_DID_Best()

	{
		return _009_001_Adressen_DID_Best;
	}

	public void setAbgeschlossen(boolean inp) {
		abgeschlossen = inp;
	}

	public boolean getAbgeschlossen()

	{
		return abgeschlossen;
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
