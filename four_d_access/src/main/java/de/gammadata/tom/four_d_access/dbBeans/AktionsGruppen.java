/*
 * AktionsGruppen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 14 mit dem Namen "AktionsGruppen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class AktionsGruppen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AktionsGruppen";
	public static final int dbTabNummer = 14;
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
	public static int aktionsGruppenbez_Fn = 11;
	public static int aktionsgruppenbeschr_Fn = 12;
	public static int font_Pc_Fn = 13;
	public static int font_Mac_Fn = 14;
	public static int font_Size_Fn = 15;
	public static int farbcode_Fn = 16;

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
	private java.lang.String aktionsGruppenbez = "";
	private java.lang.StringBuilder aktionsgruppenbeschr = new java.lang.StringBuilder();
	private java.lang.String font_Pc = "";
	private java.lang.String font_Mac = "";
	private int font_Size = 0;
	private int farbcode = 0;
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
			new FieldSpec("aktionsGruppenbez", 11, 40, "java.lang.String", null),
			new FieldSpec("aktionsgruppenbeschr", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("font_Pc", 13, 80, "java.lang.String", null),
			new FieldSpec("font_Mac", 14, 80, "java.lang.String", null),
			new FieldSpec("font_Size", 15, 0, "int", null),
			new FieldSpec("farbcode", 16, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public AktionsGruppen() {
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

	public void setAktionsGruppenbez(java.lang.String inp) {
		aktionsGruppenbez = inp;
	}

	public java.lang.String getAktionsGruppenbez()

	{
		return aktionsGruppenbez;
	}

	public void setAktionsgruppenbeschr(java.lang.StringBuilder inp) {
		aktionsgruppenbeschr = inp;
	}

	public java.lang.StringBuilder getAktionsgruppenbeschr()

	{
		return aktionsgruppenbeschr;
	}

	public void setFont_Pc(java.lang.String inp) {
		font_Pc = inp;
	}

	public java.lang.String getFont_Pc()

	{
		return font_Pc;
	}

	public void setFont_Mac(java.lang.String inp) {
		font_Mac = inp;
	}

	public java.lang.String getFont_Mac()

	{
		return font_Mac;
	}

	public void setFont_Size(int inp) {
		font_Size = inp;
	}

	public int getFont_Size()

	{
		return font_Size;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
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
