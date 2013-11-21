/*
 * Katalog.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 96 mit dem Namen "Katalog"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Katalog extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Katalog";
	public static final int dbTabNummer = 96;
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
	public static int katalogBez_Fn = 11;
	public static int katalogBeschreibung_Fn = 12;
	public static int sortierNr_Fn = 13;
	public static int hTML_File_Fn = 14;
	public static int webRootVz_Fn = 15;
	public static int hTML_GEN_DIR_Fn = 16;
	public static int bookmark_File_Fn = 17;
	public static int fileTyp_Fn = 18;
	public static int _022_001_VorgangsDID_Fn = 19;
	public static int m_022_031_VorgangNr_Fn = 20;
	public static int xmlText_Fn = 21;

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
	private java.lang.String katalogBez = "";
	private java.lang.StringBuilder katalogBeschreibung = new java.lang.StringBuilder();
	private int sortierNr = 0;
	private java.lang.String hTML_File = "";
	private java.lang.StringBuilder webRootVz = new java.lang.StringBuilder();
	private java.lang.StringBuilder hTML_GEN_DIR = new java.lang.StringBuilder();
	private java.lang.String bookmark_File = "";
	private java.lang.String fileTyp = "";
	private int _022_001_VorgangsDID = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.StringBuilder xmlText = new java.lang.StringBuilder();
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
			new FieldSpec("katalogBez", 11, 80, "java.lang.String", null),
			new FieldSpec("katalogBeschreibung", 12, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("sortierNr", 13, 0, "int", null),
			new FieldSpec("hTML_File", 14, 80, "java.lang.String", null),
			new FieldSpec("webRootVz", 15, 0, "java.lang.StringBuilder", null),
			new FieldSpec("hTML_GEN_DIR", 16, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("bookmark_File", 17, 80, "java.lang.String", null),
			new FieldSpec("fileTyp", 18, 20, "java.lang.String", null),
			new FieldSpec("_022_001_VorgangsDID", 19, 0, "int", null),
			new FieldSpec("m_022_031_VorgangNr", 20, 30, "java.lang.String",
					null),
			new FieldSpec("xmlText", 21, 0, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Katalog() {
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

	public void setKatalogBez(java.lang.String inp) {
		katalogBez = inp;
	}

	public java.lang.String getKatalogBez()

	{
		return katalogBez;
	}

	public void setKatalogBeschreibung(java.lang.StringBuilder inp) {
		katalogBeschreibung = inp;
	}

	public java.lang.StringBuilder getKatalogBeschreibung()

	{
		return katalogBeschreibung;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setHTML_File(java.lang.String inp) {
		hTML_File = inp;
	}

	public java.lang.String getHTML_File()

	{
		return hTML_File;
	}

	public void setWebRootVz(java.lang.StringBuilder inp) {
		webRootVz = inp;
	}

	public java.lang.StringBuilder getWebRootVz()

	{
		return webRootVz;
	}

	public void setHTML_GEN_DIR(java.lang.StringBuilder inp) {
		hTML_GEN_DIR = inp;
	}

	public java.lang.StringBuilder getHTML_GEN_DIR()

	{
		return hTML_GEN_DIR;
	}

	public void setBookmark_File(java.lang.String inp) {
		bookmark_File = inp;
	}

	public java.lang.String getBookmark_File()

	{
		return bookmark_File;
	}

	public void setFileTyp(java.lang.String inp) {
		fileTyp = inp;
	}

	public java.lang.String getFileTyp()

	{
		return fileTyp;
	}

	public void set_022_001_VorgangsDID(int inp) {
		_022_001_VorgangsDID = inp;
	}

	public int get_022_001_VorgangsDID()

	{
		return _022_001_VorgangsDID;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setXmlText(java.lang.StringBuilder inp) {
		xmlText = inp;
	}

	public java.lang.StringBuilder getXmlText()

	{
		return xmlText;
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
