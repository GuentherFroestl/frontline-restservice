/*
 * Länder.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 40 mit dem Namen "Länder"
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

public class Laender extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Länder";
	public static final int dbTabNummer = 40;
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
	public static int landName_Fn = 11;
	public static int postCode_Fn = 12;
	public static int _042_001_Sprachen_SprachenNr_Fn = 13;
	public static int _005_001_Währungen_DID_Fn = 14;
	public static int inland_Fn = 15;
	public static int eU_Fn = 16;
	public static int rDW_Fn = 17;
	public static int iSO3166Code_2_Fn = 18;
	public static int land_Sprachkennung_Fn = 19;
	public static int iSO3166Code_3_Fn = 20;

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
	private java.lang.String landName = "";
	private java.lang.String postCode = "";
	private int _042_001_Sprachen_SprachenNr = 0;
	private int _005_001_Währungen_DID = 0;
	private boolean inland = false;
	private boolean eU = false;
	private boolean rDW = false;
	private java.lang.String iSO3166Code_2 = "";
	private java.lang.String land_Sprachkennung = "";
	private java.lang.String iSO3166Code_3 = "";
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
			new FieldSpec("landName", 11, 80, "java.lang.String", null),
			new FieldSpec("postCode", 12, 5, "java.lang.String", null),
			new FieldSpec("_042_001_Sprachen_SprachenNr", 13, 0, "int",
					new OneObjectPointer(42, 1, "Sprachen", "sprachenNr")),
			new FieldSpec("_005_001_Währungen_DID", 14, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("inland", 15, 0, "boolean", null),
			new FieldSpec("eU", 16, 0, "boolean", null),
			new FieldSpec("rDW", 17, 0, "boolean", null),
			new FieldSpec("iSO3166Code_2", 18, 2, "java.lang.String", null),
			new FieldSpec("land_Sprachkennung", 19, 8, "java.lang.String", null),
			new FieldSpec("iSO3166Code_3", 20, 10, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Laender() {
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

	public void setLandName(java.lang.String inp) {
		landName = inp;
	}

	public java.lang.String getLandName()

	{
		return landName;
	}

	public void setPostCode(java.lang.String inp) {
		postCode = inp;
	}

	public java.lang.String getPostCode()

	{
		return postCode;
	}

	public void set_042_001_Sprachen_SprachenNr(int inp) {
		_042_001_Sprachen_SprachenNr = inp;
	}

	public int get_042_001_Sprachen_SprachenNr()

	{
		return _042_001_Sprachen_SprachenNr;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
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

	public void setISO3166Code_2(java.lang.String inp) {
		iSO3166Code_2 = inp;
	}

	public java.lang.String getISO3166Code_2()

	{
		return iSO3166Code_2;
	}

	public void setLand_Sprachkennung(java.lang.String inp) {
		land_Sprachkennung = inp;
	}

	public java.lang.String getLand_Sprachkennung()

	{
		return land_Sprachkennung;
	}

	public void setISO3166Code_3(java.lang.String inp) {
		iSO3166Code_3 = inp;
	}

	public java.lang.String getISO3166Code_3()

	{
		return iSO3166Code_3;
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
