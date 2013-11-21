/*
 * EmailPattern.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 100 mit dem Namen "EmailPattern"
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

public class EmailPattern extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EmailPattern";
	public static final int dbTabNummer = 100;
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
	public static int patternBezeichnung_Fn = 11;
	public static int kommentar_Fn = 12;
	public static int regExPattern_Fn = 13;
	public static int mimeHeaderName_Fn = 14;
	public static int _023_001_FolderDID_Fn = 15;
	public static int aktionsCode_Fn = 16;
	public static int processBeanClass_Fn = 17;
	public static int hoursToDelete_Fn = 18;
	public static int _038_001_EmailAccounts_Fn = 19;
	public static int m_038_013_EmailKontoBez_Fn = 20;
	public static int m_023_011_FolderName_Fn = 21;
	public static int forAllEmailAccounts_Fn = 22;
	public static int senderID_Listed_Code_Fn = 23;
	public static int guppenOrderNummer_Fn = 24;
	public static int orderNummer_Fn = 25;
	public static int spamScore_Fn = 26;

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
	private java.lang.String patternBezeichnung = "";
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private java.lang.StringBuilder regExPattern = new java.lang.StringBuilder();
	private java.lang.String mimeHeaderName = "";
	private int _023_001_FolderDID = 0;
	private java.lang.String aktionsCode = "";
	private java.lang.StringBuilder processBeanClass = new java.lang.StringBuilder();
	private int hoursToDelete = 0;
	private int _038_001_EmailAccounts = 0;
	private java.lang.String m_038_013_EmailKontoBez = "";
	private java.lang.String m_023_011_FolderName = "";
	private boolean forAllEmailAccounts = false;
	private int senderID_Listed_Code = 0;
	private int guppenOrderNummer = 0;
	private int orderNummer = 0;
	private int spamScore = 0;
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
			new FieldSpec("patternBezeichnung", 11, 80, "java.lang.String",
					null),
			new FieldSpec("kommentar", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("regExPattern", 13, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("mimeHeaderName", 14, 80, "java.lang.String", null),
			new FieldSpec("_023_001_FolderDID", 15, 0, "int",
					new OneObjectPointer(23, 1, "FolderDID", "")),
			new FieldSpec("aktionsCode", 16, 24, "java.lang.String", null),
			new FieldSpec("processBeanClass", 17, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("hoursToDelete", 18, 0, "int", null),
			new FieldSpec("_038_001_EmailAccounts", 19, 0, "int",
					new OneObjectPointer(38, 1, "EmailAccounts", "")),
			new FieldSpec("m_038_013_EmailKontoBez", 20, 60,
					"java.lang.String", null),
			new FieldSpec("m_023_011_FolderName", 21, 80, "java.lang.String",
					null),
			new FieldSpec("forAllEmailAccounts", 22, 0, "boolean", null),
			new FieldSpec("senderID_Listed_Code", 23, 0, "int", null),
			new FieldSpec("guppenOrderNummer", 24, 0, "int", null),
			new FieldSpec("orderNummer", 25, 0, "int", null),
			new FieldSpec("spamScore", 26, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public EmailPattern() {
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

	public void setPatternBezeichnung(java.lang.String inp) {
		patternBezeichnung = inp;
	}

	public java.lang.String getPatternBezeichnung()

	{
		return patternBezeichnung;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setRegExPattern(java.lang.StringBuilder inp) {
		regExPattern = inp;
	}

	public java.lang.StringBuilder getRegExPattern()

	{
		return regExPattern;
	}

	public void setMimeHeaderName(java.lang.String inp) {
		mimeHeaderName = inp;
	}

	public java.lang.String getMimeHeaderName()

	{
		return mimeHeaderName;
	}

	public void set_023_001_FolderDID(int inp) {
		_023_001_FolderDID = inp;
	}

	public int get_023_001_FolderDID()

	{
		return _023_001_FolderDID;
	}

	public void setAktionsCode(java.lang.String inp) {
		aktionsCode = inp;
	}

	public java.lang.String getAktionsCode()

	{
		return aktionsCode;
	}

	public void setProcessBeanClass(java.lang.StringBuilder inp) {
		processBeanClass = inp;
	}

	public java.lang.StringBuilder getProcessBeanClass()

	{
		return processBeanClass;
	}

	public void setHoursToDelete(int inp) {
		hoursToDelete = inp;
	}

	public int getHoursToDelete()

	{
		return hoursToDelete;
	}

	public void set_038_001_EmailAccounts(int inp) {
		_038_001_EmailAccounts = inp;
	}

	public int get_038_001_EmailAccounts()

	{
		return _038_001_EmailAccounts;
	}

	public void setM_038_013_EmailKontoBez(java.lang.String inp) {
		m_038_013_EmailKontoBez = inp;
	}

	public java.lang.String getM_038_013_EmailKontoBez()

	{
		return m_038_013_EmailKontoBez;
	}

	public void setM_023_011_FolderName(java.lang.String inp) {
		m_023_011_FolderName = inp;
	}

	public java.lang.String getM_023_011_FolderName()

	{
		return m_023_011_FolderName;
	}

	public void setForAllEmailAccounts(boolean inp) {
		forAllEmailAccounts = inp;
	}

	public boolean getForAllEmailAccounts()

	{
		return forAllEmailAccounts;
	}

	public void setSenderID_Listed_Code(int inp) {
		senderID_Listed_Code = inp;
	}

	public int getSenderID_Listed_Code()

	{
		return senderID_Listed_Code;
	}

	public void setGuppenOrderNummer(int inp) {
		guppenOrderNummer = inp;
	}

	public int getGuppenOrderNummer()

	{
		return guppenOrderNummer;
	}

	public void setOrderNummer(int inp) {
		orderNummer = inp;
	}

	public int getOrderNummer()

	{
		return orderNummer;
	}

	public void setSpamScore(int inp) {
		spamScore = inp;
	}

	public int getSpamScore()

	{
		return spamScore;
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
