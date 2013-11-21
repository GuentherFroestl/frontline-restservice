/*
 * EinRechPos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 85 mit dem Namen "EinRechPos"
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

public class EinRechPos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EinRechPos";
	public static final int dbTabNummer = 85;
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
	public static int _084_001__EinRech_DID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int menge_Fn = 13;
	public static int eK_Einzel_netto_Fn = 14;
	public static int mwST_Satz_Fn = 15;
	public static int eK_Gesamt_netto_Fn = 16;
	public static int m_032_011_Artikel_Nr_Fn = 17;
	public static int artikelbezeichnung_Fn = 18;
	public static int posNr_Fn = 19;
	public static int _022_001_Vorgang_DID_Fn = 20;
	public static int _006_001_Konten_DID_Fn = 21;
	public static int eK_Gesamt_Brutto_Fn = 22;
	public static int m_084_022__011_LfdRechNr_Fn = 23;
	public static int weiterverrechnen_Fn = 24;
	public static int _062_001_AusRechPos_DID_Fn = 25;
	public static int berechnet_Fn = 26;
	public static int m_022_031_VorgangNr_Fn = 27;
	public static int m_084_031_Lieferanten_Nr_Fn = 28;
	public static int m_084_032_Lief_Firmenname_Fn = 29;
	public static int last_Artikel_DID_Fn = 30;
	public static int preise_festgelegt_Fn = 31;
	public static int _030_001_Buchpos_DID_Fn = 32;
	public static int m_062_028_AusRech_PosNr_Fn = 33;
	public static int _058_001_BestellPos_DID_Fn = 34;
	public static int _065_001_AuftragsPosDID_Fn = 35;
	public static int _003_001_SteuerSatzDID_Fn = 36;
	public static int datum_Fn = 37;
	public static int m_084_016_WRG_DID_Fn = 38;
	public static int m_084_017_Kurs_Fn = 39;

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
	private int _084_001__EinRech_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private double menge = 0;
	private double eK_Einzel_netto = 0;
	private double mwST_Satz = 0;
	private double eK_Gesamt_netto = 0;
	private java.lang.String m_032_011_Artikel_Nr = "";
	private java.lang.String artikelbezeichnung = "";
	private int posNr = 0;
	private int _022_001_Vorgang_DID = 0;
	private int _006_001_Konten_DID = 0;
	private double eK_Gesamt_Brutto = 0;
	private int m_084_022__011_LfdRechNr = 0;
	private boolean weiterverrechnen = false;
	private int _062_001_AusRechPos_DID = 0;
	private boolean berechnet = false;
	private java.lang.String m_022_031_VorgangNr = "";
	private int m_084_031_Lieferanten_Nr = 0;
	private java.lang.String m_084_032_Lief_Firmenname = "";
	private int last_Artikel_DID = 0;
	private boolean preise_festgelegt = false;
	private int _030_001_Buchpos_DID = 0;
	private int m_062_028_AusRech_PosNr = 0;
	private int _058_001_BestellPos_DID = 0;
	private int _065_001_AuftragsPosDID = 0;
	private int _003_001_SteuerSatzDID = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private int m_084_016_WRG_DID = 0;
	private double m_084_017_Kurs = 0;
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
			new FieldSpec("_084_001__EinRech_DID", 11, 0, "int",
					new OneObjectPointer(84, 1, "EinRech", "dID")),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("menge", 13, 0, "double", null),
			new FieldSpec("eK_Einzel_netto", 14, 0, "double", null),
			new FieldSpec("mwST_Satz", 15, 0, "double", null),
			new FieldSpec("eK_Gesamt_netto", 16, 0, "double", null),
			new FieldSpec("m_032_011_Artikel_Nr", 17, 40, "java.lang.String",
					null),
			new FieldSpec("artikelbezeichnung", 18, 60, "java.lang.String",
					null),
			new FieldSpec("posNr", 19, 0, "int", null),
			new FieldSpec("_022_001_Vorgang_DID", 20, 0, "int",
					new OneObjectPointer(22, 1, "Vorgang", "dID")),
			new FieldSpec("_006_001_Konten_DID", 21, 0, "int",
					new OneObjectPointer(6, 1, "Konten", "dID")),
			new FieldSpec("eK_Gesamt_Brutto", 22, 0, "double", null),
			new FieldSpec("m_084_022__011_LfdRechNr", 23, 0, "int", null),
			new FieldSpec("weiterverrechnen", 24, 0, "boolean", null),
			new FieldSpec("_062_001_AusRechPos_DID", 25, 0, "int",
					new OneObjectPointer(62, 1, "AusRechPos", "dID")),
			new FieldSpec("berechnet", 26, 0, "boolean", null),
			new FieldSpec("m_022_031_VorgangNr", 27, 30, "java.lang.String",
					null),
			new FieldSpec("m_084_031_Lieferanten_Nr", 28, 0, "int", null),
			new FieldSpec("m_084_032_Lief_Firmenname", 29, 40,
					"java.lang.String", null),
			new FieldSpec("last_Artikel_DID", 30, 0, "int", null),
			new FieldSpec("preise_festgelegt", 31, 0, "boolean", null),
			new FieldSpec("_030_001_Buchpos_DID", 32, 0, "int",
					new OneObjectPointer(30, 1, "Buchpos", "dID")),
			new FieldSpec("m_062_028_AusRech_PosNr", 33, 0, "int", null),
			new FieldSpec("_058_001_BestellPos_DID", 34, 0, "int",
					new OneObjectPointer(58, 1, "BestellPos", "dID")),
			new FieldSpec("_065_001_AuftragsPosDID", 35, 0, "int",
					new OneObjectPointer(65, 1, "AuftragsPosDID", "")),
			new FieldSpec("_003_001_SteuerSatzDID", 36, 0, "int",
					new OneObjectPointer(3, 1, "SteuerSatzDID", "")),
			new FieldSpec("datum", 37, 0, "java.sql.Date", null),
			new FieldSpec("m_084_016_WRG_DID", 38, 0, "int", null),
			new FieldSpec("m_084_017_Kurs", 39, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public EinRechPos() {
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

	public void set_084_001__EinRech_DID(int inp) {
		_084_001__EinRech_DID = inp;
	}

	public int get_084_001__EinRech_DID()

	{
		return _084_001__EinRech_DID;
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

	public void setEK_Einzel_netto(double inp) {
		eK_Einzel_netto = inp;
	}

	public double getEK_Einzel_netto()

	{
		return eK_Einzel_netto;
	}

	public void setMwST_Satz(double inp) {
		mwST_Satz = inp;
	}

	public double getMwST_Satz()

	{
		return mwST_Satz;
	}

	public void setEK_Gesamt_netto(double inp) {
		eK_Gesamt_netto = inp;
	}

	public double getEK_Gesamt_netto()

	{
		return eK_Gesamt_netto;
	}

	public void setM_032_011_Artikel_Nr(java.lang.String inp) {
		m_032_011_Artikel_Nr = inp;
	}

	public java.lang.String getM_032_011_Artikel_Nr()

	{
		return m_032_011_Artikel_Nr;
	}

	public void setArtikelbezeichnung(java.lang.String inp) {
		artikelbezeichnung = inp;
	}

	public java.lang.String getArtikelbezeichnung()

	{
		return artikelbezeichnung;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void set_006_001_Konten_DID(int inp) {
		_006_001_Konten_DID = inp;
	}

	public int get_006_001_Konten_DID()

	{
		return _006_001_Konten_DID;
	}

	public void setEK_Gesamt_Brutto(double inp) {
		eK_Gesamt_Brutto = inp;
	}

	public double getEK_Gesamt_Brutto()

	{
		return eK_Gesamt_Brutto;
	}

	public void setM_084_022__011_LfdRechNr(int inp) {
		m_084_022__011_LfdRechNr = inp;
	}

	public int getM_084_022__011_LfdRechNr()

	{
		return m_084_022__011_LfdRechNr;
	}

	public void setWeiterverrechnen(boolean inp) {
		weiterverrechnen = inp;
	}

	public boolean getWeiterverrechnen()

	{
		return weiterverrechnen;
	}

	public void set_062_001_AusRechPos_DID(int inp) {
		_062_001_AusRechPos_DID = inp;
	}

	public int get_062_001_AusRechPos_DID()

	{
		return _062_001_AusRechPos_DID;
	}

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_084_031_Lieferanten_Nr(int inp) {
		m_084_031_Lieferanten_Nr = inp;
	}

	public int getM_084_031_Lieferanten_Nr()

	{
		return m_084_031_Lieferanten_Nr;
	}

	public void setM_084_032_Lief_Firmenname(java.lang.String inp) {
		m_084_032_Lief_Firmenname = inp;
	}

	public java.lang.String getM_084_032_Lief_Firmenname()

	{
		return m_084_032_Lief_Firmenname;
	}

	public void setLast_Artikel_DID(int inp) {
		last_Artikel_DID = inp;
	}

	public int getLast_Artikel_DID()

	{
		return last_Artikel_DID;
	}

	public void setPreise_festgelegt(boolean inp) {
		preise_festgelegt = inp;
	}

	public boolean getPreise_festgelegt()

	{
		return preise_festgelegt;
	}

	public void set_030_001_Buchpos_DID(int inp) {
		_030_001_Buchpos_DID = inp;
	}

	public int get_030_001_Buchpos_DID()

	{
		return _030_001_Buchpos_DID;
	}

	public void setM_062_028_AusRech_PosNr(int inp) {
		m_062_028_AusRech_PosNr = inp;
	}

	public int getM_062_028_AusRech_PosNr()

	{
		return m_062_028_AusRech_PosNr;
	}

	public void set_058_001_BestellPos_DID(int inp) {
		_058_001_BestellPos_DID = inp;
	}

	public int get_058_001_BestellPos_DID()

	{
		return _058_001_BestellPos_DID;
	}

	public void set_065_001_AuftragsPosDID(int inp) {
		_065_001_AuftragsPosDID = inp;
	}

	public int get_065_001_AuftragsPosDID()

	{
		return _065_001_AuftragsPosDID;
	}

	public void set_003_001_SteuerSatzDID(int inp) {
		_003_001_SteuerSatzDID = inp;
	}

	public int get_003_001_SteuerSatzDID()

	{
		return _003_001_SteuerSatzDID;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setM_084_016_WRG_DID(int inp) {
		m_084_016_WRG_DID = inp;
	}

	public int getM_084_016_WRG_DID()

	{
		return m_084_016_WRG_DID;
	}

	public void setM_084_017_Kurs(double inp) {
		m_084_017_Kurs = inp;
	}

	public double getM_084_017_Kurs()

	{
		return m_084_017_Kurs;
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
