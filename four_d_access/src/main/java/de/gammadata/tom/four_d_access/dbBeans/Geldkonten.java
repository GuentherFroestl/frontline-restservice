/*
 * Geldkonten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 83 mit dem Namen "Geldkonten"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Geldkonten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Geldkonten";
	public static final int dbTabNummer = 83;
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
	public static int geldkontoBezeichnung_Fn = 11;
	public static int kassa_Fn = 12;
	public static int bank_Fn = 13;
	public static int sonstiges_Fn = 14;
	public static int bankname_Fn = 15;
	public static int bLZ_Fn = 16;
	public static int bankkontoNr_Fn = 17;
	public static int _009_001_Adressen_DID_Fn = 18;
	public static int _006_001_KontenDID_Fn = 19;
	public static int m_006_011__019_KontoNr_Fn = 20;
	public static int m_009_011_Bank_Firmenname_Fn = 21;
	public static int verfügbarer_Betrag_Fn = 22;
	public static int _005_001_WährungenDID_Fn = 23;
	public static int saldo_Fn = 24;
	public static int saldoDatum_Fn = 25;
	public static int nextDTANr_Fn = 26;
	public static int _006_001_GeldtransitKontoDID_Fn = 27;
	public static int dTATypNr_Fn = 28;
	public static int beschreibung_Fn = 29;

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
	private java.lang.String geldkontoBezeichnung = "";
	private boolean kassa = false;
	private boolean bank = false;
	private boolean sonstiges = false;
	private java.lang.String bankname = "";
	private int bLZ = 0;
	private double bankkontoNr = 0;
	private int _009_001_Adressen_DID = 0;
	private int _006_001_KontenDID = 0;
	private int m_006_011__019_KontoNr = 0;
	private java.lang.String m_009_011_Bank_Firmenname = "";
	private double verfügbarer_Betrag = 0;
	private int _005_001_WährungenDID = 0;
	private double saldo = 0;
	private java.sql.Date saldoDatum = new java.sql.Date(0);
	private int nextDTANr = 0;
	private int _006_001_GeldtransitKontoDID = 0;
	private int dTATypNr = 0;
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
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
			new FieldSpec("geldkontoBezeichnung", 11, 40, "java.lang.String",
					null),
			new FieldSpec("kassa", 12, 0, "boolean", null),
			new FieldSpec("bank", 13, 0, "boolean", null),
			new FieldSpec("sonstiges", 14, 0, "boolean", null),
			new FieldSpec("bankname", 15, 60, "java.lang.String", null),
			new FieldSpec("bLZ", 16, 0, "int", null),
			new FieldSpec("bankkontoNr", 17, 0, "double", null),
			new FieldSpec("_009_001_Adressen_DID", 18, 0, "int", null),
			new FieldSpec("_006_001_KontenDID", 19, 0, "int", null),
			new FieldSpec("m_006_011__019_KontoNr", 20, 0, "int", null),
			new FieldSpec("m_009_011_Bank_Firmenname", 21, 40,
					"java.lang.String", null),
			new FieldSpec("verfügbarer_Betrag", 22, 0, "double", null),
			new FieldSpec("_005_001_WährungenDID", 23, 0, "int", null),
			new FieldSpec("saldo", 24, 0, "double", null),
			new FieldSpec("saldoDatum", 25, 0, "java.sql.Date", null),
			new FieldSpec("nextDTANr", 26, 0, "int", null),
			new FieldSpec("_006_001_GeldtransitKontoDID", 27, 0, "int", null),
			new FieldSpec("dTATypNr", 28, 0, "int", null),
			new FieldSpec("beschreibung", 29, 0, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Geldkonten() {
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

	public void setGeldkontoBezeichnung(java.lang.String inp) {
		geldkontoBezeichnung = inp;
	}

	public java.lang.String getGeldkontoBezeichnung()

	{
		return geldkontoBezeichnung;
	}

	public void setKassa(boolean inp) {
		kassa = inp;
	}

	public boolean getKassa()

	{
		return kassa;
	}

	public void setBank(boolean inp) {
		bank = inp;
	}

	public boolean getBank()

	{
		return bank;
	}

	public void setSonstiges(boolean inp) {
		sonstiges = inp;
	}

	public boolean getSonstiges()

	{
		return sonstiges;
	}

	public void setBankname(java.lang.String inp) {
		bankname = inp;
	}

	public java.lang.String getBankname()

	{
		return bankname;
	}

	public void setBLZ(int inp) {
		bLZ = inp;
	}

	public int getBLZ()

	{
		return bLZ;
	}

	public void setBankkontoNr(double inp) {
		bankkontoNr = inp;
	}

	public double getBankkontoNr()

	{
		return bankkontoNr;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void set_006_001_KontenDID(int inp) {
		_006_001_KontenDID = inp;
	}

	public int get_006_001_KontenDID()

	{
		return _006_001_KontenDID;
	}

	public void setM_006_011__019_KontoNr(int inp) {
		m_006_011__019_KontoNr = inp;
	}

	public int getM_006_011__019_KontoNr()

	{
		return m_006_011__019_KontoNr;
	}

	public void setM_009_011_Bank_Firmenname(java.lang.String inp) {
		m_009_011_Bank_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Bank_Firmenname()

	{
		return m_009_011_Bank_Firmenname;
	}

	public void setVerfügbarer_Betrag(double inp) {
		verfügbarer_Betrag = inp;
	}

	public double getVerfügbarer_Betrag()

	{
		return verfügbarer_Betrag;
	}

	public void set_005_001_WährungenDID(int inp) {
		_005_001_WährungenDID = inp;
	}

	public int get_005_001_WährungenDID()

	{
		return _005_001_WährungenDID;
	}

	public void setSaldo(double inp) {
		saldo = inp;
	}

	public double getSaldo()

	{
		return saldo;
	}

	public void setSaldoDatum(java.sql.Date inp) {
		saldoDatum = inp;
	}

	public java.sql.Date getSaldoDatum()

	{
		return saldoDatum;
	}

	public void setNextDTANr(int inp) {
		nextDTANr = inp;
	}

	public int getNextDTANr()

	{
		return nextDTANr;
	}

	public void set_006_001_GeldtransitKontoDID(int inp) {
		_006_001_GeldtransitKontoDID = inp;
	}

	public int get_006_001_GeldtransitKontoDID()

	{
		return _006_001_GeldtransitKontoDID;
	}

	public void setDTATypNr(int inp) {
		dTATypNr = inp;
	}

	public int getDTATypNr()

	{
		return dTATypNr;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
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