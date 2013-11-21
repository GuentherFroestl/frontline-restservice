/*
 * Bookmarks.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 97 mit dem Namen "Bookmarks"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Bookmarks extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Bookmarks";
	public static final int dbTabNummer = 97;
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
	public static int _096_001_KatalogDID_Fn = 11;
	public static int link097_001_Fn = 12;
	public static int sortierNr_Fn = 13;
	public static int ebenenTiefe_Fn = 14;
	public static int bookmarkBez_Fn = 15;
	public static int bookmarkBeschreibung_Fn = 16;
	public static int hTML_File_Fn = 17;
	public static int includeFile1_Fn = 18;
	public static int includeFile2_Fn = 19;
	public static int anzLinks_Fn = 20;
	public static int bookmarkTyp_Fn = 21;
	public static int bezeichnung_Ebene0_Fn = 22;
	public static int bezeichnung_Ebene1_Fn = 23;
	public static int bezeichnung_Ebene2_Fn = 24;
	public static int katalogBez_Fn = 25;
	public static int sortL0_Fn = 26;
	public static int sortL1_Fn = 27;
	public static int sortL2_Fn = 28;
	public static int text1_Fn = 29;
	public static int text2_Fn = 30;
	public static int text3_Fn = 31;
	public static int finalLinkDID_Fn = 32;
	public static int eigeneSeite_Fn = 33;
	public static int unsichtbar_Fn = 34;

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
	private int _096_001_KatalogDID = 0;
	private int link097_001 = 0;
	private int sortierNr = 0;
	private int ebenenTiefe = 0;
	private java.lang.StringBuilder bookmarkBez = new java.lang.StringBuilder();
	private java.lang.StringBuilder bookmarkBeschreibung = new java.lang.StringBuilder();
	private java.lang.String hTML_File = "";
	private java.lang.String includeFile1 = "";
	private java.lang.String includeFile2 = "";
	private int anzLinks = 0;
	private int bookmarkTyp = 0;
	private java.lang.StringBuilder bezeichnung_Ebene0 = new java.lang.StringBuilder();
	private java.lang.StringBuilder bezeichnung_Ebene1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder bezeichnung_Ebene2 = new java.lang.StringBuilder();
	private java.lang.String katalogBez = "";
	private int sortL0 = 0;
	private int sortL1 = 0;
	private int sortL2 = 0;
	private java.lang.StringBuilder text1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder text2 = new java.lang.StringBuilder();
	private java.lang.StringBuilder text3 = new java.lang.StringBuilder();
	private int finalLinkDID = 0;
	private boolean eigeneSeite = false;
	private boolean unsichtbar = false;
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
			new FieldSpec("_096_001_KatalogDID", 11, 0, "int", null),
			new FieldSpec("link097_001", 12, 0, "int", null),
			new FieldSpec("sortierNr", 13, 0, "int", null),
			new FieldSpec("ebenenTiefe", 14, 0, "int", null),
			new FieldSpec("bookmarkBez", 15, 0, "java.lang.StringBuilder", null),
			new FieldSpec("bookmarkBeschreibung", 16, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("hTML_File", 17, 80, "java.lang.String", null),
			new FieldSpec("includeFile1", 18, 80, "java.lang.String", null),
			new FieldSpec("includeFile2", 19, 80, "java.lang.String", null),
			new FieldSpec("anzLinks", 20, 0, "int", null),
			new FieldSpec("bookmarkTyp", 21, 0, "int", null),
			new FieldSpec("bezeichnung_Ebene0", 22, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("bezeichnung_Ebene1", 23, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("bezeichnung_Ebene2", 24, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("katalogBez", 25, 60, "java.lang.String", null),
			new FieldSpec("sortL0", 26, 0, "int", null),
			new FieldSpec("sortL1", 27, 0, "int", null),
			new FieldSpec("sortL2", 28, 0, "int", null),
			new FieldSpec("text1", 29, 0, "java.lang.StringBuilder", null),
			new FieldSpec("text2", 30, 0, "java.lang.StringBuilder", null),
			new FieldSpec("text3", 31, 0, "java.lang.StringBuilder", null),
			new FieldSpec("finalLinkDID", 32, 0, "int", null),
			new FieldSpec("eigeneSeite", 33, 0, "boolean", null),
			new FieldSpec("unsichtbar", 34, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Bookmarks() {
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

	public void set_096_001_KatalogDID(int inp) {
		_096_001_KatalogDID = inp;
	}

	public int get_096_001_KatalogDID()

	{
		return _096_001_KatalogDID;
	}

	public void setLink097_001(int inp) {
		link097_001 = inp;
	}

	public int getLink097_001()

	{
		return link097_001;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setEbenenTiefe(int inp) {
		ebenenTiefe = inp;
	}

	public int getEbenenTiefe()

	{
		return ebenenTiefe;
	}

	public void setBookmarkBez(java.lang.StringBuilder inp) {
		bookmarkBez = inp;
	}

	public java.lang.StringBuilder getBookmarkBez()

	{
		return bookmarkBez;
	}

	public void setBookmarkBeschreibung(java.lang.StringBuilder inp) {
		bookmarkBeschreibung = inp;
	}

	public java.lang.StringBuilder getBookmarkBeschreibung()

	{
		return bookmarkBeschreibung;
	}

	public void setHTML_File(java.lang.String inp) {
		hTML_File = inp;
	}

	public java.lang.String getHTML_File()

	{
		return hTML_File;
	}

	public void setIncludeFile1(java.lang.String inp) {
		includeFile1 = inp;
	}

	public java.lang.String getIncludeFile1()

	{
		return includeFile1;
	}

	public void setIncludeFile2(java.lang.String inp) {
		includeFile2 = inp;
	}

	public java.lang.String getIncludeFile2()

	{
		return includeFile2;
	}

	public void setAnzLinks(int inp) {
		anzLinks = inp;
	}

	public int getAnzLinks()

	{
		return anzLinks;
	}

	public void setBookmarkTyp(int inp) {
		bookmarkTyp = inp;
	}

	public int getBookmarkTyp()

	{
		return bookmarkTyp;
	}

	public void setBezeichnung_Ebene0(java.lang.StringBuilder inp) {
		bezeichnung_Ebene0 = inp;
	}

	public java.lang.StringBuilder getBezeichnung_Ebene0()

	{
		return bezeichnung_Ebene0;
	}

	public void setBezeichnung_Ebene1(java.lang.StringBuilder inp) {
		bezeichnung_Ebene1 = inp;
	}

	public java.lang.StringBuilder getBezeichnung_Ebene1()

	{
		return bezeichnung_Ebene1;
	}

	public void setBezeichnung_Ebene2(java.lang.StringBuilder inp) {
		bezeichnung_Ebene2 = inp;
	}

	public java.lang.StringBuilder getBezeichnung_Ebene2()

	{
		return bezeichnung_Ebene2;
	}

	public void setKatalogBez(java.lang.String inp) {
		katalogBez = inp;
	}

	public java.lang.String getKatalogBez()

	{
		return katalogBez;
	}

	public void setSortL0(int inp) {
		sortL0 = inp;
	}

	public int getSortL0()

	{
		return sortL0;
	}

	public void setSortL1(int inp) {
		sortL1 = inp;
	}

	public int getSortL1()

	{
		return sortL1;
	}

	public void setSortL2(int inp) {
		sortL2 = inp;
	}

	public int getSortL2()

	{
		return sortL2;
	}

	public void setText1(java.lang.StringBuilder inp) {
		text1 = inp;
	}

	public java.lang.StringBuilder getText1()

	{
		return text1;
	}

	public void setText2(java.lang.StringBuilder inp) {
		text2 = inp;
	}

	public java.lang.StringBuilder getText2()

	{
		return text2;
	}

	public void setText3(java.lang.StringBuilder inp) {
		text3 = inp;
	}

	public java.lang.StringBuilder getText3()

	{
		return text3;
	}

	public void setFinalLinkDID(int inp) {
		finalLinkDID = inp;
	}

	public int getFinalLinkDID()

	{
		return finalLinkDID;
	}

	public void setEigeneSeite(boolean inp) {
		eigeneSeite = inp;
	}

	public boolean getEigeneSeite()

	{
		return eigeneSeite;
	}

	public void setUnsichtbar(boolean inp) {
		unsichtbar = inp;
	}

	public boolean getUnsichtbar()

	{
		return unsichtbar;
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
