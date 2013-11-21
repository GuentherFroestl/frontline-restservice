/*
 * Sites.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 70 mit dem Namen "Sites"
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

public class Sites extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Sites";
	public static final int dbTabNummer = 70;
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
	public static int siteBez_Fn = 11;
	public static int siteBeschreibung_Fn = 12;
	public static int iP_Adresse_Fn = 13;
	public static int masterSite_Fn = 14;
	public static int _002_001_BenutzergrpDID_Fn = 15;
	public static int rootdir_Fn = 16;
	public static int logindir_Fn = 17;
	public static int startHTMLfile_Fn = 18;
	public static int _042_001_SprachenNr_Fn = 19;
	public static int iTomDir_Fn = 20;
	public static int fensterHTML_File_Fn = 21;
	public static int rootDir_Pfad_Fn = 22;
	public static int _040_001_Land_Fn = 23;
	public static int _005_001_Währung_Fn = 24;
	public static int hostName_Fn = 25;
	public static int rootDir_WebStyle_Fn = 26;
	public static int showRecordHTML_File_Fn = 27;
	public static int defaultFile_Fn = 28;

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
	private java.lang.String siteBez = "";
	private java.lang.StringBuilder siteBeschreibung = new java.lang.StringBuilder();
	private java.lang.String iP_Adresse = "";
	private boolean masterSite = false;
	private int _002_001_BenutzergrpDID = 0;
	private java.lang.String rootdir = "";
	private java.lang.String logindir = "";
	private java.lang.StringBuilder startHTMLfile = new java.lang.StringBuilder();
	private int _042_001_SprachenNr = 0;
	private java.lang.String iTomDir = "";
	private java.lang.StringBuilder fensterHTML_File = new java.lang.StringBuilder();
	private java.lang.StringBuilder rootDir_Pfad = new java.lang.StringBuilder();
	private int _040_001_Land = 0;
	private int _005_001_Währung = 0;
	private java.lang.String hostName = "";
	private java.lang.StringBuilder rootDir_WebStyle = new java.lang.StringBuilder();
	private java.lang.StringBuilder showRecordHTML_File = new java.lang.StringBuilder();
	private java.lang.StringBuilder defaultFile = new java.lang.StringBuilder();
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
			new FieldSpec("siteBez", 11, 40, "java.lang.String", null),
			new FieldSpec("siteBeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("iP_Adresse", 13, 30, "java.lang.String", null),
			new FieldSpec("masterSite", 14, 0, "boolean", null),
			new FieldSpec("_002_001_BenutzergrpDID", 15, 0, "int",
					new OneObjectPointer(2, 1, "BenutzergrpDID", "")),
			new FieldSpec("rootdir", 16, 40, "java.lang.String", null),
			new FieldSpec("logindir", 17, 80, "java.lang.String", null),
			new FieldSpec("startHTMLfile", 18, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("_042_001_SprachenNr", 19, 0, "int",
					new OneObjectPointer(42, 1, "SprachenNr", "")),
			new FieldSpec("iTomDir", 20, 40, "java.lang.String", null),
			new FieldSpec("fensterHTML_File", 21, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("rootDir_Pfad", 22, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_040_001_Land", 23, 0, "int", new OneObjectPointer(
					40, 1, "Land", "")),
			new FieldSpec("_005_001_Währung", 24, 0, "int",
					new OneObjectPointer(5, 1, "Währung", "")),
			new FieldSpec("hostName", 25, 80, "java.lang.String", null),
			new FieldSpec("rootDir_WebStyle", 26, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("showRecordHTML_File", 27, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("defaultFile", 28, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Sites() {
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

	public void setSiteBez(java.lang.String inp) {
		siteBez = inp;
	}

	public java.lang.String getSiteBez()

	{
		return siteBez;
	}

	public void setSiteBeschreibung(java.lang.StringBuilder inp) {
		siteBeschreibung = inp;
	}

	public java.lang.StringBuilder getSiteBeschreibung()

	{
		return siteBeschreibung;
	}

	public void setIP_Adresse(java.lang.String inp) {
		iP_Adresse = inp;
	}

	public java.lang.String getIP_Adresse()

	{
		return iP_Adresse;
	}

	public void setMasterSite(boolean inp) {
		masterSite = inp;
	}

	public boolean getMasterSite()

	{
		return masterSite;
	}

	public void set_002_001_BenutzergrpDID(int inp) {
		_002_001_BenutzergrpDID = inp;
	}

	public int get_002_001_BenutzergrpDID()

	{
		return _002_001_BenutzergrpDID;
	}

	public void setRootdir(java.lang.String inp) {
		rootdir = inp;
	}

	public java.lang.String getRootdir()

	{
		return rootdir;
	}

	public void setLogindir(java.lang.String inp) {
		logindir = inp;
	}

	public java.lang.String getLogindir()

	{
		return logindir;
	}

	public void setStartHTMLfile(java.lang.StringBuilder inp) {
		startHTMLfile = inp;
	}

	public java.lang.StringBuilder getStartHTMLfile()

	{
		return startHTMLfile;
	}

	public void set_042_001_SprachenNr(int inp) {
		_042_001_SprachenNr = inp;
	}

	public int get_042_001_SprachenNr()

	{
		return _042_001_SprachenNr;
	}

	public void setITomDir(java.lang.String inp) {
		iTomDir = inp;
	}

	public java.lang.String getITomDir()

	{
		return iTomDir;
	}

	public void setFensterHTML_File(java.lang.StringBuilder inp) {
		fensterHTML_File = inp;
	}

	public java.lang.StringBuilder getFensterHTML_File()

	{
		return fensterHTML_File;
	}

	public void setRootDir_Pfad(java.lang.StringBuilder inp) {
		rootDir_Pfad = inp;
	}

	public java.lang.StringBuilder getRootDir_Pfad()

	{
		return rootDir_Pfad;
	}

	public void set_040_001_Land(int inp) {
		_040_001_Land = inp;
	}

	public int get_040_001_Land()

	{
		return _040_001_Land;
	}

	public void set_005_001_Währung(int inp) {
		_005_001_Währung = inp;
	}

	public int get_005_001_Währung()

	{
		return _005_001_Währung;
	}

	public void setHostName(java.lang.String inp) {
		hostName = inp;
	}

	public java.lang.String getHostName()

	{
		return hostName;
	}

	public void setRootDir_WebStyle(java.lang.StringBuilder inp) {
		rootDir_WebStyle = inp;
	}

	public java.lang.StringBuilder getRootDir_WebStyle()

	{
		return rootDir_WebStyle;
	}

	public void setShowRecordHTML_File(java.lang.StringBuilder inp) {
		showRecordHTML_File = inp;
	}

	public java.lang.StringBuilder getShowRecordHTML_File()

	{
		return showRecordHTML_File;
	}

	public void setDefaultFile(java.lang.StringBuilder inp) {
		defaultFile = inp;
	}

	public java.lang.StringBuilder getDefaultFile()

	{
		return defaultFile;
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
