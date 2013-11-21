/*
 * BestellPos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 58 mit dem Namen "BestellPos"
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

public class BestellPos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "BestellPos";
	public static final int dbTabNummer = 58;
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
	public static int _059_001__Bestellungen_DID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int m_032_011_Artikel_Nr_Fn = 13;
	public static int bestellNr_Fn = 14;
	public static int bestellbez_Fn = 15;
	public static int menge_Fn = 16;
	public static int eK_Einzel_Netto_Fn = 17;
	public static int mwstSatz_Fn = 18;
	public static int lieferTermin_Fn = 19;
	public static int _065_001_AuftragsPosDID_Fn = 20;
	public static int menge_geliefert_Fn = 21;
	public static int berechnet_Fn = 22;
	public static int _034_001_EKQuellen_DID_Fn = 23;
	public static int posNr_Fn = 24;
	public static int bestelldatum_Position_Fn = 25;
	public static int rücklieferung_Fn = 26;
	public static int storniert_Fn = 27;
	public static int _066_001_Lieferscheine_DID_Fn = 28;
	public static int _022_001_Vorgänge_DID_Fn = 29;
	public static int eK_Gesamt_Netto_Fn = 30;
	public static int eK_Gesamt_Brutto_Fn = 31;
	public static int m_059_031_LieferantenNr_Fn = 32;
	public static int m_059_032_LieferantenName_Fn = 33;
	public static int m_022_031_VorgangNr_Fn = 34;
	public static int m_059_028_BestellNr_Fn = 35;
	public static int zusatztext_Fn = 36;
	public static int ref_Bez_Fn = 37;
	public static int _060_001_Lieferanten_DID_Fn = 38;
	public static int _085_001_ERechPos_DID_Fn = 39;
	public static int eRPosition_Fn = 40;
	public static int last_Artikel_DID_Fn = 41;
	public static int preise_festgelegt_Fn = 42;
	public static int restmenge_Fn = 43;

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
	private int _059_001__Bestellungen_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private java.lang.String m_032_011_Artikel_Nr = "";
	private java.lang.String bestellNr = "";
	private java.lang.String bestellbez = "";
	private double menge = 0;
	private double eK_Einzel_Netto = 0;
	private double mwstSatz = 0;
	private java.sql.Date lieferTermin = new java.sql.Date(0);
	private int _065_001_AuftragsPosDID = 0;
	private double menge_geliefert = 0;
	private boolean berechnet = false;
	private int _034_001_EKQuellen_DID = 0;
	private int posNr = 0;
	private java.sql.Date bestelldatum_Position = new java.sql.Date(0);
	private boolean rücklieferung = false;
	private boolean storniert = false;
	private int _066_001_Lieferscheine_DID = 0;
	private int _022_001_Vorgänge_DID = 0;
	private double eK_Gesamt_Netto = 0;
	private double eK_Gesamt_Brutto = 0;
	private int m_059_031_LieferantenNr = 0;
	private java.lang.String m_059_032_LieferantenName = "";
	private java.lang.String m_022_031_VorgangNr = "";
	private int m_059_028_BestellNr = 0;
	private java.lang.StringBuilder zusatztext = new java.lang.StringBuilder();
	private java.lang.String ref_Bez = "";
	private int _060_001_Lieferanten_DID = 0;
	private int _085_001_ERechPos_DID = 0;
	private boolean eRPosition = false;
	private int last_Artikel_DID = 0;
	private boolean preise_festgelegt = false;
	private double restmenge = 0;
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
			new FieldSpec("_059_001__Bestellungen_DID", 11, 0, "int",
					new OneObjectPointer(59, 1, "Bestellungen", "dID")),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("m_032_011_Artikel_Nr", 13, 40, "java.lang.String",
					null),
			new FieldSpec("bestellNr", 14, 40, "java.lang.String", null),
			new FieldSpec("bestellbez", 15, 60, "java.lang.String", null),
			new FieldSpec("menge", 16, 0, "double", null),
			new FieldSpec("eK_Einzel_Netto", 17, 0, "double", null),
			new FieldSpec("mwstSatz", 18, 0, "double", null),
			new FieldSpec("lieferTermin", 19, 0, "java.sql.Date", null),
			new FieldSpec("_065_001_AuftragsPosDID", 20, 0, "int",
					new OneObjectPointer(65, 1, "AuftragsPosDID", "")),
			new FieldSpec("menge_geliefert", 21, 0, "double", null),
			new FieldSpec("berechnet", 22, 0, "boolean", null),
			new FieldSpec("_034_001_EKQuellen_DID", 23, 0, "int",
					new OneObjectPointer(34, 1, "EKQuellen", "dID")),
			new FieldSpec("posNr", 24, 0, "int", null),
			new FieldSpec("bestelldatum_Position", 25, 0, "java.sql.Date", null),
			new FieldSpec("rücklieferung", 26, 0, "boolean", null),
			new FieldSpec("storniert", 27, 0, "boolean", null),
			new FieldSpec("_066_001_Lieferscheine_DID", 28, 0, "int",
					new OneObjectPointer(66, 1, "Lieferscheine", "dID")),
			new FieldSpec("_022_001_Vorgänge_DID", 29, 0, "int",
					new OneObjectPointer(22, 1, "Vorgänge", "dID")),
			new FieldSpec("eK_Gesamt_Netto", 30, 0, "double", null),
			new FieldSpec("eK_Gesamt_Brutto", 31, 0, "double", null),
			new FieldSpec("m_059_031_LieferantenNr", 32, 0, "int", null),
			new FieldSpec("m_059_032_LieferantenName", 33, 40,
					"java.lang.String", null),
			new FieldSpec("m_022_031_VorgangNr", 34, 30, "java.lang.String",
					null),
			new FieldSpec("m_059_028_BestellNr", 35, 0, "int", null),
			new FieldSpec("zusatztext", 36, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("ref_Bez", 37, 40, "java.lang.String", null),
			new FieldSpec("_060_001_Lieferanten_DID", 38, 0, "int",
					new OneObjectPointer(60, 1, "Lieferanten", "dID")),
			new FieldSpec("_085_001_ERechPos_DID", 39, 0, "int",
					new OneObjectPointer(85, 1, "ERechPos", "dID")),
			new FieldSpec("eRPosition", 40, 0, "boolean", null),
			new FieldSpec("last_Artikel_DID", 41, 0, "int", null),
			new FieldSpec("preise_festgelegt", 42, 0, "boolean", null),
			new FieldSpec("restmenge", 43, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public BestellPos() {
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

	public void set_059_001__Bestellungen_DID(int inp) {
		_059_001__Bestellungen_DID = inp;
	}

	public int get_059_001__Bestellungen_DID()

	{
		return _059_001__Bestellungen_DID;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setM_032_011_Artikel_Nr(java.lang.String inp) {
		m_032_011_Artikel_Nr = inp;
	}

	public java.lang.String getM_032_011_Artikel_Nr()

	{
		return m_032_011_Artikel_Nr;
	}

	public void setBestellNr(java.lang.String inp) {
		bestellNr = inp;
	}

	public java.lang.String getBestellNr()

	{
		return bestellNr;
	}

	public void setBestellbez(java.lang.String inp) {
		bestellbez = inp;
	}

	public java.lang.String getBestellbez()

	{
		return bestellbez;
	}

	public void setMenge(double inp) {
		menge = inp;
	}

	public double getMenge()

	{
		return menge;
	}

	public void setEK_Einzel_Netto(double inp) {
		eK_Einzel_Netto = inp;
	}

	public double getEK_Einzel_Netto()

	{
		return eK_Einzel_Netto;
	}

	public void setMwstSatz(double inp) {
		mwstSatz = inp;
	}

	public double getMwstSatz()

	{
		return mwstSatz;
	}

	public void setLieferTermin(java.sql.Date inp) {
		lieferTermin = inp;
	}

	public java.sql.Date getLieferTermin()

	{
		return lieferTermin;
	}

	public void set_065_001_AuftragsPosDID(int inp) {
		_065_001_AuftragsPosDID = inp;
	}

	public int get_065_001_AuftragsPosDID()

	{
		return _065_001_AuftragsPosDID;
	}

	public void setMenge_geliefert(double inp) {
		menge_geliefert = inp;
	}

	public double getMenge_geliefert()

	{
		return menge_geliefert;
	}

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void set_034_001_EKQuellen_DID(int inp) {
		_034_001_EKQuellen_DID = inp;
	}

	public int get_034_001_EKQuellen_DID()

	{
		return _034_001_EKQuellen_DID;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setBestelldatum_Position(java.sql.Date inp) {
		bestelldatum_Position = inp;
	}

	public java.sql.Date getBestelldatum_Position()

	{
		return bestelldatum_Position;
	}

	public void setRücklieferung(boolean inp) {
		rücklieferung = inp;
	}

	public boolean getRücklieferung()

	{
		return rücklieferung;
	}

	public void setStorniert(boolean inp) {
		storniert = inp;
	}

	public boolean getStorniert()

	{
		return storniert;
	}

	public void set_066_001_Lieferscheine_DID(int inp) {
		_066_001_Lieferscheine_DID = inp;
	}

	public int get_066_001_Lieferscheine_DID()

	{
		return _066_001_Lieferscheine_DID;
	}

	public void set_022_001_Vorgänge_DID(int inp) {
		_022_001_Vorgänge_DID = inp;
	}

	public int get_022_001_Vorgänge_DID()

	{
		return _022_001_Vorgänge_DID;
	}

	public void setEK_Gesamt_Netto(double inp) {
		eK_Gesamt_Netto = inp;
	}

	public double getEK_Gesamt_Netto()

	{
		return eK_Gesamt_Netto;
	}

	public void setEK_Gesamt_Brutto(double inp) {
		eK_Gesamt_Brutto = inp;
	}

	public double getEK_Gesamt_Brutto()

	{
		return eK_Gesamt_Brutto;
	}

	public void setM_059_031_LieferantenNr(int inp) {
		m_059_031_LieferantenNr = inp;
	}

	public int getM_059_031_LieferantenNr()

	{
		return m_059_031_LieferantenNr;
	}

	public void setM_059_032_LieferantenName(java.lang.String inp) {
		m_059_032_LieferantenName = inp;
	}

	public java.lang.String getM_059_032_LieferantenName()

	{
		return m_059_032_LieferantenName;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_059_028_BestellNr(int inp) {
		m_059_028_BestellNr = inp;
	}

	public int getM_059_028_BestellNr()

	{
		return m_059_028_BestellNr;
	}

	public void setZusatztext(java.lang.StringBuilder inp) {
		zusatztext = inp;
	}

	public java.lang.StringBuilder getZusatztext()

	{
		return zusatztext;
	}

	public void setRef_Bez(java.lang.String inp) {
		ref_Bez = inp;
	}

	public java.lang.String getRef_Bez()

	{
		return ref_Bez;
	}

	public void set_060_001_Lieferanten_DID(int inp) {
		_060_001_Lieferanten_DID = inp;
	}

	public int get_060_001_Lieferanten_DID()

	{
		return _060_001_Lieferanten_DID;
	}

	public void set_085_001_ERechPos_DID(int inp) {
		_085_001_ERechPos_DID = inp;
	}

	public int get_085_001_ERechPos_DID()

	{
		return _085_001_ERechPos_DID;
	}

	public void setERPosition(boolean inp) {
		eRPosition = inp;
	}

	public boolean getERPosition()

	{
		return eRPosition;
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

	public void setRestmenge(double inp) {
		restmenge = inp;
	}

	public double getRestmenge()

	{
		return restmenge;
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
