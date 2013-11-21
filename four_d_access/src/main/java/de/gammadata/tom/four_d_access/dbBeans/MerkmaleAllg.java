/*
 * MerkmaleAllg.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 46 mit dem Namen "MerkmaleAllg"
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

public class MerkmaleAllg extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MerkmaleAllg";
	public static final int dbTabNummer = 46;
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
	public static int m_025_011_MerkmalBez_Fn = 11;
	public static int kommentar_Fn = 12;
	public static int wert_Fn = 13;
	public static int _025_001_MerkmalTabelle_DID_Fn = 14;
	public static int wertBezeichnung_Fn = 15;
	public static int recordDID_Fn = 16;
	public static int zielTabelle_Fn = 17;
	public static int tabellenname_Fn = 18;
	public static int leer_1_Fn = 19;
	public static int recordBez_Fn = 20;

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
	private java.lang.String m_025_011_MerkmalBez = "";
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private double wert = 0;
	private int _025_001_MerkmalTabelle_DID = 0;
	private java.lang.String wertBezeichnung = "";
	private int recordDID = 0;
	private int zielTabelle = 0;
	private java.lang.String tabellenname = "";
	private int leer_1 = 0;
	private java.lang.String recordBez = "";
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
			new FieldSpec("m_025_011_MerkmalBez", 11, 40, "java.lang.String",
					null),
			new FieldSpec("kommentar", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("wert", 13, 0, "double", null),
			new FieldSpec("_025_001_MerkmalTabelle_DID", 14, 0, "int",
					new OneObjectPointer(25, 1, "MerkmalTabelle", "dID")),
			new FieldSpec("wertBezeichnung", 15, 80, "java.lang.String", null),
			new FieldSpec("recordDID", 16, 0, "int", null),
			new FieldSpec("zielTabelle", 17, 0, "int", null),
			new FieldSpec("tabellenname", 18, 80, "java.lang.String", null),
			new FieldSpec("leer_1", 19, 0, "int", null),
			new FieldSpec("recordBez", 20, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public MerkmaleAllg() {
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

	public void setM_025_011_MerkmalBez(java.lang.String inp) {
		m_025_011_MerkmalBez = inp;
	}

	public java.lang.String getM_025_011_MerkmalBez()

	{
		return m_025_011_MerkmalBez;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setWert(double inp) {
		wert = inp;
	}

	public double getWert()

	{
		return wert;
	}

	public void set_025_001_MerkmalTabelle_DID(int inp) {
		_025_001_MerkmalTabelle_DID = inp;
	}

	public int get_025_001_MerkmalTabelle_DID()

	{
		return _025_001_MerkmalTabelle_DID;
	}

	public void setWertBezeichnung(java.lang.String inp) {
		wertBezeichnung = inp;
	}

	public java.lang.String getWertBezeichnung()

	{
		return wertBezeichnung;
	}

	public void setRecordDID(int inp) {
		recordDID = inp;
	}

	public int getRecordDID()

	{
		return recordDID;
	}

	public void setZielTabelle(int inp) {
		zielTabelle = inp;
	}

	public int getZielTabelle()

	{
		return zielTabelle;
	}

	public void setTabellenname(java.lang.String inp) {
		tabellenname = inp;
	}

	public java.lang.String getTabellenname()

	{
		return tabellenname;
	}

	public void setLeer_1(int inp) {
		leer_1 = inp;
	}

	public int getLeer_1()

	{
		return leer_1;
	}

	public void setRecordBez(java.lang.String inp) {
		recordBez = inp;
	}

	public java.lang.String getRecordBez()

	{
		return recordBez;
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
