/*
 * Benutzergruppen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 2 mit dem Namen "Benutzergruppen"
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

public class Benutzergruppen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Benutzergruppen";
	public static final int dbTabNummer = 2;
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
	public static int gruppenname_Fn = 11;
	public static int gruppenbeschreibung_Fn = 12;
	public static int branchenNrLokal_Fn = 13;
	public static int restricted_Fn = 14;
	public static int _096_001_KatalogDID_Fn = 15;
	public static int longinHTML_File_Fn = 16;

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
	private java.lang.String gruppenname = "";
	private java.lang.String gruppenbeschreibung = "";
	private int branchenNrLokal = 0;
	private boolean restricted = false;
	private int _096_001_KatalogDID = 0;
	private java.lang.StringBuilder longinHTML_File = new java.lang.StringBuilder();
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
			new FieldSpec("gruppenname", 11, 40, "java.lang.String", null),
			new FieldSpec("gruppenbeschreibung", 12, 80, "java.lang.String",
					null),
			new FieldSpec("branchenNrLokal", 13, 0, "int", null),
			new FieldSpec("restricted", 14, 0, "boolean", null),
			new FieldSpec("_096_001_KatalogDID", 15, 0, "int",
					new OneObjectPointer(96, 1, "KatalogDID", "")),
			new FieldSpec("longinHTML_File", 16, 32768,
					"java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Benutzergruppen() {
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

	public void setGruppenname(java.lang.String inp) {
		gruppenname = inp;
	}

	public java.lang.String getGruppenname()

	{
		return gruppenname;
	}

	public void setGruppenbeschreibung(java.lang.String inp) {
		gruppenbeschreibung = inp;
	}

	public java.lang.String getGruppenbeschreibung()

	{
		return gruppenbeschreibung;
	}

	public void setBranchenNrLokal(int inp) {
		branchenNrLokal = inp;
	}

	public int getBranchenNrLokal()

	{
		return branchenNrLokal;
	}

	public void setRestricted(boolean inp) {
		restricted = inp;
	}

	public boolean getRestricted()

	{
		return restricted;
	}

	public void set_096_001_KatalogDID(int inp) {
		_096_001_KatalogDID = inp;
	}

	public int get_096_001_KatalogDID()

	{
		return _096_001_KatalogDID;
	}

	public void setLonginHTML_File(java.lang.StringBuilder inp) {
		longinHTML_File = inp;
	}

	public java.lang.StringBuilder getLonginHTML_File()

	{
		return longinHTML_File;
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
