/*
 * Konten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 6 mit dem Namen "Konten"
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

public class Konten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Konten";
	public static final int dbTabNummer = 6;
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
	public static int kontoNummer_Fn = 11;
	public static int kontobez_Fn = 12;
	public static int kontosortierNummer_Fn = 13;
	public static int kontobeschreibung_Fn = 14;
	public static int inaktiv_Fn = 15;
	public static int sachkonto_Fn = 16;
	public static int individual_Fn = 17;
	public static int bebuchtJahr_Fn = 18;
	public static int sammelKonto_Fn = 19;
	public static int gesperrt_Fn = 20;
	public static int autoSteuerExport_Fn = 21;
	public static int autoMwst_Fn = 22;
	public static int _003_001_Steuersätze_DID_Fn = 23;
	public static int debitor_Fn = 24;
	public static int kreditor_Fn = 25;
	public static int wE_Fn = 26;
	public static int Erlös_Fn = 27;
	public static int inland_Fn = 28;
	public static int eU_Fn = 29;
	public static int rDW_Fn = 30;
	public static int geldkonto_Fn = 31;
	public static int m_003_011_St_Bez_Fn = 32;
	public static int _009_001_Adressen_DID_Fn = 33;
	public static int m_009_011_Adressen_Firmenname_Fn = 34;
	public static int e_Bilanz_Fn = 35;
	public static int saldo_Fn = 36;
	public static int _060_001_LieferantenDID_Fn = 37;
	public static int m_060_011LieferantenNummer_Fn = 38;
	public static int _068_001_KundenDID_Fn = 39;
	public static int m_068_011_KundenNummer_Fn = 40;

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
	private int kontoNummer = 0;
	private java.lang.String kontobez = "";
	private int kontosortierNummer = 0;
	private java.lang.StringBuilder kontobeschreibung = new java.lang.StringBuilder();
	private boolean inaktiv = false;
	private boolean sachkonto = false;
	private boolean individual = false;
	private java.sql.Date bebuchtJahr = new java.sql.Date(0);
	private boolean sammelKonto = false;
	private boolean gesperrt = false;
	private boolean autoSteuerExport = false;
	private boolean autoMwst = false;
	private int _003_001_Steuersätze_DID = 0;
	private boolean debitor = false;
	private boolean kreditor = false;
	private boolean wE = false;
	private boolean Erlös = false;
	private boolean inland = false;
	private boolean eU = false;
	private boolean rDW = false;
	private boolean geldkonto = false;
	private double m_003_011_St_Bez = 0;
	private int _009_001_Adressen_DID = 0;
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private double e_Bilanz = 0;
	private double saldo = 0;
	private int _060_001_LieferantenDID = 0;
	private int m_060_011LieferantenNummer = 0;
	private int _068_001_KundenDID = 0;
	private int m_068_011_KundenNummer = 0;
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
			new FieldSpec("kontoNummer", 11, 0, "int", null),
			new FieldSpec("kontobez", 12, 80, "java.lang.String", null),
			new FieldSpec("kontosortierNummer", 13, 0, "int", null),
			new FieldSpec("kontobeschreibung", 14, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("inaktiv", 15, 0, "boolean", null),
			new FieldSpec("sachkonto", 16, 0, "boolean", null),
			new FieldSpec("individual", 17, 0, "boolean", null),
			new FieldSpec("bebuchtJahr", 18, 0, "java.sql.Date", null),
			new FieldSpec("sammelKonto", 19, 0, "boolean", null),
			new FieldSpec("gesperrt", 20, 0, "boolean", null),
			new FieldSpec("autoSteuerExport", 21, 0, "boolean", null),
			new FieldSpec("autoMwst", 22, 0, "boolean", null),
			new FieldSpec("_003_001_Steuersätze_DID", 23, 0, "int",
					new OneObjectPointer(3, 1, "Steuersätze", "dID")),
			new FieldSpec("debitor", 24, 0, "boolean", null),
			new FieldSpec("kreditor", 25, 0, "boolean", null),
			new FieldSpec("wE", 26, 0, "boolean", null),
			new FieldSpec("Erlös", 27, 0, "boolean", null),
			new FieldSpec("inland", 28, 0, "boolean", null),
			new FieldSpec("eU", 29, 0, "boolean", null),
			new FieldSpec("rDW", 30, 0, "boolean", null),
			new FieldSpec("geldkonto", 31, 0, "boolean", null),
			new FieldSpec("m_003_011_St_Bez", 32, 0, "double", null),
			new FieldSpec("_009_001_Adressen_DID", 33, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("m_009_011_Adressen_Firmenname", 34, 40,
					"java.lang.String", null),
			new FieldSpec("e_Bilanz", 35, 0, "double", null),
			new FieldSpec("saldo", 36, 0, "double", null),
			new FieldSpec("_060_001_LieferantenDID", 37, 0, "int",
					new OneObjectPointer(60, 1, "LieferantenDID", "")),
			new FieldSpec("m_060_011LieferantenNummer", 38, 0, "int", null),
			new FieldSpec("_068_001_KundenDID", 39, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("m_068_011_KundenNummer", 40, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Konten() {
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

	public void setKontoNummer(int inp) {
		kontoNummer = inp;
	}

	public int getKontoNummer()

	{
		return kontoNummer;
	}

	public void setKontobez(java.lang.String inp) {
		kontobez = inp;
	}

	public java.lang.String getKontobez()

	{
		return kontobez;
	}

	public void setKontosortierNummer(int inp) {
		kontosortierNummer = inp;
	}

	public int getKontosortierNummer()

	{
		return kontosortierNummer;
	}

	public void setKontobeschreibung(java.lang.StringBuilder inp) {
		kontobeschreibung = inp;
	}

	public java.lang.StringBuilder getKontobeschreibung()

	{
		return kontobeschreibung;
	}

	public void setInaktiv(boolean inp) {
		inaktiv = inp;
	}

	public boolean getInaktiv()

	{
		return inaktiv;
	}

	public void setSachkonto(boolean inp) {
		sachkonto = inp;
	}

	public boolean getSachkonto()

	{
		return sachkonto;
	}

	public void setIndividual(boolean inp) {
		individual = inp;
	}

	public boolean getIndividual()

	{
		return individual;
	}

	public void setBebuchtJahr(java.sql.Date inp) {
		bebuchtJahr = inp;
	}

	public java.sql.Date getBebuchtJahr()

	{
		return bebuchtJahr;
	}

	public void setSammelKonto(boolean inp) {
		sammelKonto = inp;
	}

	public boolean getSammelKonto()

	{
		return sammelKonto;
	}

	public void setGesperrt(boolean inp) {
		gesperrt = inp;
	}

	public boolean getGesperrt()

	{
		return gesperrt;
	}

	public void setAutoSteuerExport(boolean inp) {
		autoSteuerExport = inp;
	}

	public boolean getAutoSteuerExport()

	{
		return autoSteuerExport;
	}

	public void setAutoMwst(boolean inp) {
		autoMwst = inp;
	}

	public boolean getAutoMwst()

	{
		return autoMwst;
	}

	public void set_003_001_Steuersätze_DID(int inp) {
		_003_001_Steuersätze_DID = inp;
	}

	public int get_003_001_Steuersätze_DID()

	{
		return _003_001_Steuersätze_DID;
	}

	public void setDebitor(boolean inp) {
		debitor = inp;
	}

	public boolean getDebitor()

	{
		return debitor;
	}

	public void setKreditor(boolean inp) {
		kreditor = inp;
	}

	public boolean getKreditor()

	{
		return kreditor;
	}

	public void setWE(boolean inp) {
		wE = inp;
	}

	public boolean getWE()

	{
		return wE;
	}

	public void setErlös(boolean inp) {
		Erlös = inp;
	}

	public boolean getErlös()

	{
		return Erlös;
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

	public void setGeldkonto(boolean inp) {
		geldkonto = inp;
	}

	public boolean getGeldkonto()

	{
		return geldkonto;
	}

	public void setM_003_011_St_Bez(double inp) {
		m_003_011_St_Bez = inp;
	}

	public double getM_003_011_St_Bez()

	{
		return m_003_011_St_Bez;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
		m_009_011_Adressen_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Adressen_Firmenname()

	{
		return m_009_011_Adressen_Firmenname;
	}

	public void setE_Bilanz(double inp) {
		e_Bilanz = inp;
	}

	public double getE_Bilanz()

	{
		return e_Bilanz;
	}

	public void setSaldo(double inp) {
		saldo = inp;
	}

	public double getSaldo()

	{
		return saldo;
	}

	public void set_060_001_LieferantenDID(int inp) {
		_060_001_LieferantenDID = inp;
	}

	public int get_060_001_LieferantenDID()

	{
		return _060_001_LieferantenDID;
	}

	public void setM_060_011LieferantenNummer(int inp) {
		m_060_011LieferantenNummer = inp;
	}

	public int getM_060_011LieferantenNummer()

	{
		return m_060_011LieferantenNummer;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void setM_068_011_KundenNummer(int inp) {
		m_068_011_KundenNummer = inp;
	}

	public int getM_068_011_KundenNummer()

	{
		return m_068_011_KundenNummer;
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
