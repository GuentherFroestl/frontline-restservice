/*
 * BookmarkLinks.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 98 mit dem Namen "BookmarkLinks"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class BookmarkLinks extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "BookmarkLinks";
	public static final int dbTabNummer = 98;
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
	public static int _097_001_Bookmarks_Fn = 11;
	public static int linkTyp_Fn = 12;
	public static int sortierNr_Fn = 13;
	public static int tabNr_Fn = 14;
	public static int recDID_Fn = 15;
	public static int queryField_Fn = 16;
	public static int queryValue_Fn = 17;
	public static int queryField2_Fn = 18;
	public static int queryValue2_Fn = 19;
	public static int mirror1_Fn = 20;
	public static int mirror2_Fn = 21;
	public static int sourceFile_Fn = 22;
	public static int sektionNr_Fn = 23;

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
	private int _097_001_Bookmarks = 0;
	private int linkTyp = 0;
	private int sortierNr = 0;
	private int tabNr = 0;
	private int recDID = 0;
	private int queryField = 0;
	private java.lang.String queryValue = "";
	private int queryField2 = 0;
	private java.lang.String queryValue2 = "";
	private java.lang.String mirror1 = "";
	private java.lang.String mirror2 = "";
	private java.lang.StringBuilder sourceFile = new java.lang.StringBuilder();
	private int sektionNr = 0;
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
			new FieldSpec("_097_001_Bookmarks", 11, 0, "int", null),
			new FieldSpec("linkTyp", 12, 0, "int", null),
			new FieldSpec("sortierNr", 13, 0, "int", null),
			new FieldSpec("tabNr", 14, 0, "int", null),
			new FieldSpec("recDID", 15, 0, "int", null),
			new FieldSpec("queryField", 16, 0, "int", null),
			new FieldSpec("queryValue", 17, 80, "java.lang.String", null),
			new FieldSpec("queryField2", 18, 0, "int", null),
			new FieldSpec("queryValue2", 19, 80, "java.lang.String", null),
			new FieldSpec("mirror1", 20, 80, "java.lang.String", null),
			new FieldSpec("mirror2", 21, 80, "java.lang.String", null),
			new FieldSpec("sourceFile", 22, 0, "java.lang.StringBuilder", null),
			new FieldSpec("sektionNr", 23, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public BookmarkLinks() {
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

	public void set_097_001_Bookmarks(int inp) {
		_097_001_Bookmarks = inp;
	}

	public int get_097_001_Bookmarks()

	{
		return _097_001_Bookmarks;
	}

	public void setLinkTyp(int inp) {
		linkTyp = inp;
	}

	public int getLinkTyp()

	{
		return linkTyp;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setTabNr(int inp) {
		tabNr = inp;
	}

	public int getTabNr()

	{
		return tabNr;
	}

	public void setRecDID(int inp) {
		recDID = inp;
	}

	public int getRecDID()

	{
		return recDID;
	}

	public void setQueryField(int inp) {
		queryField = inp;
	}

	public int getQueryField()

	{
		return queryField;
	}

	public void setQueryValue(java.lang.String inp) {
		queryValue = inp;
	}

	public java.lang.String getQueryValue()

	{
		return queryValue;
	}

	public void setQueryField2(int inp) {
		queryField2 = inp;
	}

	public int getQueryField2()

	{
		return queryField2;
	}

	public void setQueryValue2(java.lang.String inp) {
		queryValue2 = inp;
	}

	public java.lang.String getQueryValue2()

	{
		return queryValue2;
	}

	public void setMirror1(java.lang.String inp) {
		mirror1 = inp;
	}

	public java.lang.String getMirror1()

	{
		return mirror1;
	}

	public void setMirror2(java.lang.String inp) {
		mirror2 = inp;
	}

	public java.lang.String getMirror2()

	{
		return mirror2;
	}

	public void setSourceFile(java.lang.StringBuilder inp) {
		sourceFile = inp;
	}

	public java.lang.StringBuilder getSourceFile()

	{
		return sourceFile;
	}

	public void setSektionNr(int inp) {
		sektionNr = inp;
	}

	public int getSektionNr()

	{
		return sektionNr;
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
