/*
 * Kunden.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 68 mit dem Namen "Kunden"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Kunden extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Kunden";
	public static final int dbTabNummer = 68;
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
	public static int kundenNr_Fn = 11;
	public static int _009_001_Adressen_DID_AB_Fn = 12;
	public static int _009_001_Adressen_DID_LF_Fn = 13;
	public static int _009_001_Adressen_DID_RG_Fn = 14;
	public static int lieferantenNr_Fn = 15;
	public static int kommentare_Fn = 16;
	public static int _006_001_Konten_DID_Fn = 17;
	public static int ustID_Fn = 18;
	public static int _005_001_Währungen_DID_Fn = 19;
	public static int kreditLimit_Fn = 20;
	public static int _012_001_Zahlungsbed_DID_Fn = 21;
	public static int m_012_011_Zahlungsbed_KBZ_Fn = 22;
	public static int _042_001_Sprachen_SprachenNr_Fn = 23;
	public static int m_005_011_Währungen_Zeichen_Fn = 24;
	public static int lieferstopp_Fn = 25;
	public static int m_009_011_Adressen_Firmenname_Fn = 26;
	public static int m_009_014_Adressen_Nachname_Fn = 27;
	public static int inland_Fn = 28;
	public static int eU_Fn = 29;
	public static int rDW_Fn = 30;
	public static int _001_001_Mitarbeiter_DID_VB_Fn = 31;
	public static int m_001_021_Mitarbeiter_Kürzel_VB_Fn = 32;
	public static int frei_Haus_Fn = 33;
	public static int m_009_013_Adressen_Vorname_Fn = 34;
	public static int jobNrVorgabe_Fn = 35;
	public static int m_009_017_Adressen_PLZ_Fn = 36;
	public static int next_budget_start_Fn = 37;
	public static int next_budget_end_Fn = 38;
	public static int next_budget_Umsatz_Plan_Fn = 39;
	public static int next_budget_DB_Plan_Fn = 40;
	public static int next_budget_Umsatz_ist_Fn = 41;
	public static int next_budget_DB_ist_Fn = 42;
	public static int next_budget_Bez_Fn = 43;
	public static int current_budget_start_Fn = 44;
	public static int current_budget_end_Fn = 45;
	public static int current_budget_Umsatz_Plan_Fn = 46;
	public static int current_budget_DB_Plan_Fn = 47;
	public static int current_budget_Umsatz_ist_Fn = 48;
	public static int current_budget_DB_ist_Fn = 49;
	public static int current_budget_Bez_Fn = 50;
	public static int last_budget_start_Fn = 51;
	public static int last_budget_end_Fn = 52;
	public static int last_budget_Umsatz_Plan_Fn = 53;
	public static int last_budget_DB_Plan_Fn = 54;
	public static int last_budget_Umsatz_ist_Fn = 55;
	public static int last_budget_DB_ist_Fn = 56;
	public static int last_budget_Bez_Fn = 57;
	public static int anzJobs_Fn = 58;
	public static int m_006_011__017_KontoNr_Fn = 59;
	public static int mwSt_plichtig_Fn = 60;
	public static int datum_letzter_Auftrag_Fn = 61;
	public static int emailMx_Fn = 62;

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
	private int kundenNr = 0;
	private int _009_001_Adressen_DID_AB = 0;
	private int _009_001_Adressen_DID_LF = 0;
	private int _009_001_Adressen_DID_RG = 0;
	private java.lang.String lieferantenNr = "";
	private java.lang.StringBuilder kommentare = new java.lang.StringBuilder();
	private int _006_001_Konten_DID = 0;
	private java.lang.String ustID = "";
	private int _005_001_Währungen_DID = 0;
	private double kreditLimit = 0;
	private int _012_001_Zahlungsbed_DID = 0;
	private java.lang.String m_012_011_Zahlungsbed_KBZ = "";
	private int _042_001_Sprachen_SprachenNr = 0;
	private java.lang.String m_005_011_Währungen_Zeichen = "";
	private boolean lieferstopp = false;
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private boolean inland = false;
	private boolean eU = false;
	private boolean rDW = false;
	private int _001_001_Mitarbeiter_DID_VB = 0;
	private java.lang.String m_001_021_Mitarbeiter_Kürzel_VB = "";
	private boolean frei_Haus = false;
	private java.lang.String m_009_013_Adressen_Vorname = "";
	private java.lang.String jobNrVorgabe = "";
	private java.lang.String m_009_017_Adressen_PLZ = "";
	private java.sql.Date next_budget_start = new java.sql.Date(0);
	private java.sql.Date next_budget_end = new java.sql.Date(0);
	private double next_budget_Umsatz_Plan = 0;
	private double next_budget_DB_Plan = 0;
	private double next_budget_Umsatz_ist = 0;
	private double next_budget_DB_ist = 0;
	private java.lang.String next_budget_Bez = "";
	private java.sql.Date current_budget_start = new java.sql.Date(0);
	private java.sql.Date current_budget_end = new java.sql.Date(0);
	private double current_budget_Umsatz_Plan = 0;
	private double current_budget_DB_Plan = 0;
	private double current_budget_Umsatz_ist = 0;
	private double current_budget_DB_ist = 0;
	private java.lang.String current_budget_Bez = "";
	private java.sql.Date last_budget_start = new java.sql.Date(0);
	private java.sql.Date last_budget_end = new java.sql.Date(0);
	private double last_budget_Umsatz_Plan = 0;
	private double last_budget_DB_Plan = 0;
	private double last_budget_Umsatz_ist = 0;
	private double last_budget_DB_ist = 0;
	private java.lang.String last_budget_Bez = "";
	private int anzJobs = 0;
	private int m_006_011__017_KontoNr = 0;
	private boolean mwSt_plichtig = false;
	private java.sql.Date datum_letzter_Auftrag = new java.sql.Date(0);
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
			new FieldSpec("kundenNr", 11, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_AB", 12, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_LF", 13, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_RG", 14, 0, "int", null),
			new FieldSpec("lieferantenNr", 15, 20, "java.lang.String", null),
			new FieldSpec("kommentare", 16, 0, "java.lang.StringBuilder", null),
			new FieldSpec("_006_001_Konten_DID", 17, 0, "int", null),
			new FieldSpec("ustID", 18, 20, "java.lang.String", null),
			new FieldSpec("_005_001_Währungen_DID", 19, 0, "int", null),
			new FieldSpec("kreditLimit", 20, 0, "double", null),
			new FieldSpec("_012_001_Zahlungsbed_DID", 21, 0, "int", null),
			new FieldSpec("m_012_011_Zahlungsbed_KBZ", 22, 40,
					"java.lang.String", null),
			new FieldSpec("_042_001_Sprachen_SprachenNr", 23, 0, "int", null),
			new FieldSpec("m_005_011_Währungen_Zeichen", 24, 5,
					"java.lang.String", null),
			new FieldSpec("lieferstopp", 25, 0, "boolean", null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 26, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_014_Adressen_Nachname", 27, 40,
					"java.lang.String", null),
			new FieldSpec("inland", 28, 0, "boolean", null),
			new FieldSpec("eU", 29, 0, "boolean", null),
			new FieldSpec("rDW", 30, 0, "boolean", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_VB", 31, 0, "int", null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel_VB", 32, 5,
					"java.lang.String", null),
			new FieldSpec("frei_Haus", 33, 0, "boolean", null),
			new FieldSpec("m_009_013_Adressen_Vorname", 34, 40,
					"java.lang.String", null),
			new FieldSpec("jobNrVorgabe", 35, 30, "java.lang.String", null),
			new FieldSpec("m_009_017_Adressen_PLZ", 36, 10, "java.lang.String",
					null),
			new FieldSpec("next_budget_start", 37, 0, "java.sql.Date", null),
			new FieldSpec("next_budget_end", 38, 0, "java.sql.Date", null),
			new FieldSpec("next_budget_Umsatz_Plan", 39, 0, "double", null),
			new FieldSpec("next_budget_DB_Plan", 40, 0, "double", null),
			new FieldSpec("next_budget_Umsatz_ist", 41, 0, "double", null),
			new FieldSpec("next_budget_DB_ist", 42, 0, "double", null),
			new FieldSpec("next_budget_Bez", 43, 40, "java.lang.String", null),
			new FieldSpec("current_budget_start", 44, 0, "java.sql.Date", null),
			new FieldSpec("current_budget_end", 45, 0, "java.sql.Date", null),
			new FieldSpec("current_budget_Umsatz_Plan", 46, 0, "double", null),
			new FieldSpec("current_budget_DB_Plan", 47, 0, "double", null),
			new FieldSpec("current_budget_Umsatz_ist", 48, 0, "double", null),
			new FieldSpec("current_budget_DB_ist", 49, 0, "double", null),
			new FieldSpec("current_budget_Bez", 50, 40, "java.lang.String",
					null),
			new FieldSpec("last_budget_start", 51, 0, "java.sql.Date", null),
			new FieldSpec("last_budget_end", 52, 0, "java.sql.Date", null),
			new FieldSpec("last_budget_Umsatz_Plan", 53, 0, "double", null),
			new FieldSpec("last_budget_DB_Plan", 54, 0, "double", null),
			new FieldSpec("last_budget_Umsatz_ist", 55, 0, "double", null),
			new FieldSpec("last_budget_DB_ist", 56, 0, "double", null),
			new FieldSpec("last_budget_Bez", 57, 40, "java.lang.String", null),
			new FieldSpec("anzJobs", 58, 0, "int", null),
			new FieldSpec("m_006_011__017_KontoNr", 59, 0, "int", null),
			new FieldSpec("mwSt_plichtig", 60, 0, "boolean", null),
			new FieldSpec("datum_letzter_Auftrag", 61, 0, "java.sql.Date", null),
			new FieldSpec("emailMx", 62, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Kunden() {
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

	public void setKundenNr(int inp) {
		kundenNr = inp;
	}

	public int getKundenNr()

	{
		return kundenNr;
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

	public void setLieferantenNr(java.lang.String inp) {
		lieferantenNr = inp;
	}

	public java.lang.String getLieferantenNr()

	{
		return lieferantenNr;
	}

	public void setKommentare(java.lang.StringBuilder inp) {
		kommentare = inp;
	}

	public java.lang.StringBuilder getKommentare()

	{
		return kommentare;
	}

	public void set_006_001_Konten_DID(int inp) {
		_006_001_Konten_DID = inp;
	}

	public int get_006_001_Konten_DID()

	{
		return _006_001_Konten_DID;
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

	public void setM_012_011_Zahlungsbed_KBZ(java.lang.String inp) {
		m_012_011_Zahlungsbed_KBZ = inp;
	}

	public java.lang.String getM_012_011_Zahlungsbed_KBZ()

	{
		return m_012_011_Zahlungsbed_KBZ;
	}

	public void set_042_001_Sprachen_SprachenNr(int inp) {
		_042_001_Sprachen_SprachenNr = inp;
	}

	public int get_042_001_Sprachen_SprachenNr()

	{
		return _042_001_Sprachen_SprachenNr;
	}

	public void setM_005_011_Währungen_Zeichen(java.lang.String inp) {
		m_005_011_Währungen_Zeichen = inp;
	}

	public java.lang.String getM_005_011_Währungen_Zeichen()

	{
		return m_005_011_Währungen_Zeichen;
	}

	public void setLieferstopp(boolean inp) {
		lieferstopp = inp;
	}

	public boolean getLieferstopp()

	{
		return lieferstopp;
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

	public void set_001_001_Mitarbeiter_DID_VB(int inp) {
		_001_001_Mitarbeiter_DID_VB = inp;
	}

	public int get_001_001_Mitarbeiter_DID_VB()

	{
		return _001_001_Mitarbeiter_DID_VB;
	}

	public void setM_001_021_Mitarbeiter_Kürzel_VB(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel_VB = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel_VB()

	{
		return m_001_021_Mitarbeiter_Kürzel_VB;
	}

	public void setFrei_Haus(boolean inp) {
		frei_Haus = inp;
	}

	public boolean getFrei_Haus()

	{
		return frei_Haus;
	}

	public void setM_009_013_Adressen_Vorname(java.lang.String inp) {
		m_009_013_Adressen_Vorname = inp;
	}

	public java.lang.String getM_009_013_Adressen_Vorname()

	{
		return m_009_013_Adressen_Vorname;
	}

	public void setJobNrVorgabe(java.lang.String inp) {
		jobNrVorgabe = inp;
	}

	public java.lang.String getJobNrVorgabe()

	{
		return jobNrVorgabe;
	}

	public void setM_009_017_Adressen_PLZ(java.lang.String inp) {
		m_009_017_Adressen_PLZ = inp;
	}

	public java.lang.String getM_009_017_Adressen_PLZ()

	{
		return m_009_017_Adressen_PLZ;
	}

	public void setNext_budget_start(java.sql.Date inp) {
		next_budget_start = inp;
	}

	public java.sql.Date getNext_budget_start()

	{
		return next_budget_start;
	}

	public void setNext_budget_end(java.sql.Date inp) {
		next_budget_end = inp;
	}

	public java.sql.Date getNext_budget_end()

	{
		return next_budget_end;
	}

	public void setNext_budget_Umsatz_Plan(double inp) {
		next_budget_Umsatz_Plan = inp;
	}

	public double getNext_budget_Umsatz_Plan()

	{
		return next_budget_Umsatz_Plan;
	}

	public void setNext_budget_DB_Plan(double inp) {
		next_budget_DB_Plan = inp;
	}

	public double getNext_budget_DB_Plan()

	{
		return next_budget_DB_Plan;
	}

	public void setNext_budget_Umsatz_ist(double inp) {
		next_budget_Umsatz_ist = inp;
	}

	public double getNext_budget_Umsatz_ist()

	{
		return next_budget_Umsatz_ist;
	}

	public void setNext_budget_DB_ist(double inp) {
		next_budget_DB_ist = inp;
	}

	public double getNext_budget_DB_ist()

	{
		return next_budget_DB_ist;
	}

	public void setNext_budget_Bez(java.lang.String inp) {
		next_budget_Bez = inp;
	}

	public java.lang.String getNext_budget_Bez()

	{
		return next_budget_Bez;
	}

	public void setCurrent_budget_start(java.sql.Date inp) {
		current_budget_start = inp;
	}

	public java.sql.Date getCurrent_budget_start()

	{
		return current_budget_start;
	}

	public void setCurrent_budget_end(java.sql.Date inp) {
		current_budget_end = inp;
	}

	public java.sql.Date getCurrent_budget_end()

	{
		return current_budget_end;
	}

	public void setCurrent_budget_Umsatz_Plan(double inp) {
		current_budget_Umsatz_Plan = inp;
	}

	public double getCurrent_budget_Umsatz_Plan()

	{
		return current_budget_Umsatz_Plan;
	}

	public void setCurrent_budget_DB_Plan(double inp) {
		current_budget_DB_Plan = inp;
	}

	public double getCurrent_budget_DB_Plan()

	{
		return current_budget_DB_Plan;
	}

	public void setCurrent_budget_Umsatz_ist(double inp) {
		current_budget_Umsatz_ist = inp;
	}

	public double getCurrent_budget_Umsatz_ist()

	{
		return current_budget_Umsatz_ist;
	}

	public void setCurrent_budget_DB_ist(double inp) {
		current_budget_DB_ist = inp;
	}

	public double getCurrent_budget_DB_ist()

	{
		return current_budget_DB_ist;
	}

	public void setCurrent_budget_Bez(java.lang.String inp) {
		current_budget_Bez = inp;
	}

	public java.lang.String getCurrent_budget_Bez()

	{
		return current_budget_Bez;
	}

	public void setLast_budget_start(java.sql.Date inp) {
		last_budget_start = inp;
	}

	public java.sql.Date getLast_budget_start()

	{
		return last_budget_start;
	}

	public void setLast_budget_end(java.sql.Date inp) {
		last_budget_end = inp;
	}

	public java.sql.Date getLast_budget_end()

	{
		return last_budget_end;
	}

	public void setLast_budget_Umsatz_Plan(double inp) {
		last_budget_Umsatz_Plan = inp;
	}

	public double getLast_budget_Umsatz_Plan()

	{
		return last_budget_Umsatz_Plan;
	}

	public void setLast_budget_DB_Plan(double inp) {
		last_budget_DB_Plan = inp;
	}

	public double getLast_budget_DB_Plan()

	{
		return last_budget_DB_Plan;
	}

	public void setLast_budget_Umsatz_ist(double inp) {
		last_budget_Umsatz_ist = inp;
	}

	public double getLast_budget_Umsatz_ist()

	{
		return last_budget_Umsatz_ist;
	}

	public void setLast_budget_DB_ist(double inp) {
		last_budget_DB_ist = inp;
	}

	public double getLast_budget_DB_ist()

	{
		return last_budget_DB_ist;
	}

	public void setLast_budget_Bez(java.lang.String inp) {
		last_budget_Bez = inp;
	}

	public java.lang.String getLast_budget_Bez()

	{
		return last_budget_Bez;
	}

	public void setAnzJobs(int inp) {
		anzJobs = inp;
	}

	public int getAnzJobs()

	{
		return anzJobs;
	}

	public void setM_006_011__017_KontoNr(int inp) {
		m_006_011__017_KontoNr = inp;
	}

	public int getM_006_011__017_KontoNr()

	{
		return m_006_011__017_KontoNr;
	}

	public void setMwSt_plichtig(boolean inp) {
		mwSt_plichtig = inp;
	}

	public boolean getMwSt_plichtig()

	{
		return mwSt_plichtig;
	}

	public void setDatum_letzter_Auftrag(java.sql.Date inp) {
		datum_letzter_Auftrag = inp;
	}

	public java.sql.Date getDatum_letzter_Auftrag()

	{
		return datum_letzter_Auftrag;
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
