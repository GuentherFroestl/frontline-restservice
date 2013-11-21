/*
 * Reports.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 73 mit dem Namen "Reports"
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

public class Reports extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Reports";
	public static final int dbTabNummer = 73;
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
	public static int reportNr_Fn = 11;
	public static int userReport_Fn = 12;
	public static int report_Fn = 13;
	public static int tabelleNr_Fn = 14;
	public static int reportDaten_Fn = 15;
	public static int x4DLayout_Fn = 16;
	public static int kommentar_Fn = 17;
	public static int prozedur_Fn = 18;
	public static int subTabelle_Fn = 19;
	public static int update_erfolgt_Fn = 20;
	public static int filter_Fn = 21;
	public static int reportTyp_Fn = 22;
	public static int notForPrint_Fn = 23;
	public static int notForFax_Fn = 24;
	public static int notForEmail_Fn = 25;
	public static int vorlage__Fn = 26;
	public static int vorlage_BLOB_Fn = 27;
	public static int vorlage_BLOB2_Fn = 28;
	public static int hTML_Embedded_Fn = 29;
	public static int hTML_Attached_Fn = 30;
	public static int _094_001_FileTyp_Fn = 31;

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
	private int reportNr = 0;
	private boolean userReport = false;
	private java.lang.String report = "";
	private int tabelleNr = 0;
	private byte[] reportDaten = new byte[0];
	private java.lang.String x4DLayout = "";
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private java.lang.String prozedur = "";
	private int subTabelle = 0;
	private boolean update_erfolgt = false;
	private int filter = 0;
	private int reportTyp = 0;
	private boolean notForPrint = false;
	private boolean notForFax = false;
	private boolean notForEmail = false;
	private byte[] vorlage_ = new byte[0];
	private byte[] vorlage_BLOB = new byte[0];
	private byte[] vorlage_BLOB2 = new byte[0];
	private boolean hTML_Embedded = false;
	private boolean hTML_Attached = false;
	private int _094_001_FileTyp = 0;
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
			new FieldSpec("reportNr", 11, 0, "int", null),
			new FieldSpec("userReport", 12, 0, "boolean", null),
			new FieldSpec("report", 13, 40, "java.lang.String", null),
			new FieldSpec("tabelleNr", 14, 0, "int", null),
			new FieldSpec("reportDaten", 15, 0, "byte[]", null),
			new FieldSpec("x4DLayout", 16, 31, "java.lang.String", null),
			new FieldSpec("kommentar", 17, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("prozedur", 18, 31, "java.lang.String", null),
			new FieldSpec("subTabelle", 19, 0, "int", null),
			new FieldSpec("update_erfolgt", 20, 0, "boolean", null),
			new FieldSpec("filter", 21, 0, "int", null),
			new FieldSpec("reportTyp", 22, 0, "int", null),
			new FieldSpec("notForPrint", 23, 0, "boolean", null),
			new FieldSpec("notForFax", 24, 0, "boolean", null),
			new FieldSpec("notForEmail", 25, 0, "boolean", null),
			new FieldSpec("vorlage_", 26, 0, "byte[]", null),
			new FieldSpec("vorlage_BLOB", 27, 0, "byte[]", null),
			new FieldSpec("vorlage_BLOB2", 28, 0, "byte[]", null),
			new FieldSpec("hTML_Embedded", 29, 0, "boolean", null),
			new FieldSpec("hTML_Attached", 30, 0, "boolean", null),
			new FieldSpec("_094_001_FileTyp", 31, 0, "int",
					new OneObjectPointer(94, 1, "FileTyp", "")) };

	// generierte Feldkonstanten - Ende

	public Reports() {
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

	public void setReportNr(int inp) {
		reportNr = inp;
	}

	public int getReportNr()

	{
		return reportNr;
	}

	public void setUserReport(boolean inp) {
		userReport = inp;
	}

	public boolean getUserReport()

	{
		return userReport;
	}

	public void setReport(java.lang.String inp) {
		report = inp;
	}

	public java.lang.String getReport()

	{
		return report;
	}

	public void setTabelleNr(int inp) {
		tabelleNr = inp;
	}

	public int getTabelleNr()

	{
		return tabelleNr;
	}

	public void setReportDaten(byte[] inp) {
		reportDaten = inp;
	}

	public byte[] getReportDaten()

	{
		return reportDaten;
	}

	public void setX4DLayout(java.lang.String inp) {
		x4DLayout = inp;
	}

	public java.lang.String getX4DLayout()

	{
		return x4DLayout;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setProzedur(java.lang.String inp) {
		prozedur = inp;
	}

	public java.lang.String getProzedur()

	{
		return prozedur;
	}

	public void setSubTabelle(int inp) {
		subTabelle = inp;
	}

	public int getSubTabelle()

	{
		return subTabelle;
	}

	public void setUpdate_erfolgt(boolean inp) {
		update_erfolgt = inp;
	}

	public boolean getUpdate_erfolgt()

	{
		return update_erfolgt;
	}

	public void setFilter(int inp) {
		filter = inp;
	}

	public int getFilter()

	{
		return filter;
	}

	public void setReportTyp(int inp) {
		reportTyp = inp;
	}

	public int getReportTyp()

	{
		return reportTyp;
	}

	public void setNotForPrint(boolean inp) {
		notForPrint = inp;
	}

	public boolean getNotForPrint()

	{
		return notForPrint;
	}

	public void setNotForFax(boolean inp) {
		notForFax = inp;
	}

	public boolean getNotForFax()

	{
		return notForFax;
	}

	public void setNotForEmail(boolean inp) {
		notForEmail = inp;
	}

	public boolean getNotForEmail()

	{
		return notForEmail;
	}

	public void setVorlage_(byte[] inp) {
		vorlage_ = inp;
	}

	public byte[] getVorlage_()

	{
		return vorlage_;
	}

	public void setVorlage_BLOB(byte[] inp) {
		vorlage_BLOB = inp;
	}

	public byte[] getVorlage_BLOB()

	{
		return vorlage_BLOB;
	}

	public void setVorlage_BLOB2(byte[] inp) {
		vorlage_BLOB2 = inp;
	}

	public byte[] getVorlage_BLOB2()

	{
		return vorlage_BLOB2;
	}

	public void setHTML_Embedded(boolean inp) {
		hTML_Embedded = inp;
	}

	public boolean getHTML_Embedded()

	{
		return hTML_Embedded;
	}

	public void setHTML_Attached(boolean inp) {
		hTML_Attached = inp;
	}

	public boolean getHTML_Attached()

	{
		return hTML_Attached;
	}

	public void set_094_001_FileTyp(int inp) {
		_094_001_FileTyp = inp;
	}

	public int get_094_001_FileTyp()

	{
		return _094_001_FileTyp;
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
