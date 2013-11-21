/*
 * Projektverwaltung.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 24 mit dem Namen "Projektverwaltung"
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

public class Projektverwaltung extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Projektverwaltung";
	public static final int dbTabNummer = 24;
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
	public static int projektKBZ_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int leer_Fn = 13;
	public static int _001_001_Mitarbeiter_DID_Fn = 14;
	public static int startDatum_Fn = 15;
	public static int endDatum_Fn = 16;
	public static int umsatzPlan_Fn = 17;
	public static int umsatzIst_Fn = 18;
	public static int dB_Plan_Fn = 19;
	public static int dB_Ist_Fn = 20;
	public static int erledigt_Fn = 21;
	public static int leer1_Fn = 22;
	public static int m_068_026_Kunden_Firmenname_Fn = 23;
	public static int m_068_027_Kunden_Nachname_Fn = 24;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 25;
	public static int farbcode_Fn = 26;
	public static int _068_001_Kunden_DID_Fn = 27;
	public static int m_068_011_KundenNr_Fn = 28;

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
	private java.lang.String projektKBZ = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private int leer = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private java.sql.Date startDatum = new java.sql.Date(0);
	private java.sql.Date endDatum = new java.sql.Date(0);
	private double umsatzPlan = 0;
	private double umsatzIst = 0;
	private double dB_Plan = 0;
	private double dB_Ist = 0;
	private boolean erledigt = false;
	private java.lang.String leer1 = "";
	private java.lang.String m_068_026_Kunden_Firmenname = "";
	private java.lang.String m_068_027_Kunden_Nachname = "";
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private int farbcode = 0;
	private int _068_001_Kunden_DID = 0;
	private int m_068_011_KundenNr = 0;
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
			new FieldSpec("projektKBZ", 11, 40, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("leer", 13, 0, "int", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 14, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("startDatum", 15, 0, "java.sql.Date", null),
			new FieldSpec("endDatum", 16, 0, "java.sql.Date", null),
			new FieldSpec("umsatzPlan", 17, 0, "double", null),
			new FieldSpec("umsatzIst", 18, 0, "double", null),
			new FieldSpec("dB_Plan", 19, 0, "double", null),
			new FieldSpec("dB_Ist", 20, 0, "double", null),
			new FieldSpec("erledigt", 21, 0, "boolean", null),
			new FieldSpec("leer1", 22, 2, "java.lang.String", null),
			new FieldSpec("m_068_026_Kunden_Firmenname", 23, 40,
					"java.lang.String", null),
			new FieldSpec("m_068_027_Kunden_Nachname", 24, 40,
					"java.lang.String", null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 25, 5,
					"java.lang.String", null),
			new FieldSpec("farbcode", 26, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 27, 0, "int",
					new OneObjectPointer(68, 1, "Kunden", "dID")),
			new FieldSpec("m_068_011_KundenNr", 28, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Projektverwaltung() {
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

	public void setProjektKBZ(java.lang.String inp) {
		projektKBZ = inp;
	}

	public java.lang.String getProjektKBZ()

	{
		return projektKBZ;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setLeer(int inp) {
		leer = inp;
	}

	public int getLeer()

	{
		return leer;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setStartDatum(java.sql.Date inp) {
		startDatum = inp;
	}

	public java.sql.Date getStartDatum()

	{
		return startDatum;
	}

	public void setEndDatum(java.sql.Date inp) {
		endDatum = inp;
	}

	public java.sql.Date getEndDatum()

	{
		return endDatum;
	}

	public void setUmsatzPlan(double inp) {
		umsatzPlan = inp;
	}

	public double getUmsatzPlan()

	{
		return umsatzPlan;
	}

	public void setUmsatzIst(double inp) {
		umsatzIst = inp;
	}

	public double getUmsatzIst()

	{
		return umsatzIst;
	}

	public void setDB_Plan(double inp) {
		dB_Plan = inp;
	}

	public double getDB_Plan()

	{
		return dB_Plan;
	}

	public void setDB_Ist(double inp) {
		dB_Ist = inp;
	}

	public double getDB_Ist()

	{
		return dB_Ist;
	}

	public void setErledigt(boolean inp) {
		erledigt = inp;
	}

	public boolean getErledigt()

	{
		return erledigt;
	}

	public void setLeer1(java.lang.String inp) {
		leer1 = inp;
	}

	public java.lang.String getLeer1()

	{
		return leer1;
	}

	public void setM_068_026_Kunden_Firmenname(java.lang.String inp) {
		m_068_026_Kunden_Firmenname = inp;
	}

	public java.lang.String getM_068_026_Kunden_Firmenname()

	{
		return m_068_026_Kunden_Firmenname;
	}

	public void setM_068_027_Kunden_Nachname(java.lang.String inp) {
		m_068_027_Kunden_Nachname = inp;
	}

	public java.lang.String getM_068_027_Kunden_Nachname()

	{
		return m_068_027_Kunden_Nachname;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
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
