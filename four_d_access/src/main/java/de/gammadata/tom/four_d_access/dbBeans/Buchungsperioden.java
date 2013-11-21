/*
 * Buchungsperioden.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 79 mit dem Namen "Buchungsperioden"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Buchungsperioden extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Buchungsperioden";
	public static final int dbTabNummer = 79;
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
	public static int periodenNummer_Fn = 11;
	public static int periodenBez_Fn = 12;
	public static int anfDatum_Fn = 13;
	public static int endDatum_Fn = 14;
	public static int arbeitstage_Fn = 15;

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
	private int periodenNummer = 0;
	private java.lang.String periodenBez = "";
	private java.sql.Date anfDatum = new java.sql.Date(0);
	private java.sql.Date endDatum = new java.sql.Date(0);
	private double arbeitstage = 0;
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
			new FieldSpec("periodenNummer", 11, 0, "int", null),
			new FieldSpec("periodenBez", 12, 40, "java.lang.String", null),
			new FieldSpec("anfDatum", 13, 0, "java.sql.Date", null),
			new FieldSpec("endDatum", 14, 0, "java.sql.Date", null),
			new FieldSpec("arbeitstage", 15, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Buchungsperioden() {
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

	public void setPeriodenNummer(int inp) {
		periodenNummer = inp;
	}

	public int getPeriodenNummer()

	{
		return periodenNummer;
	}

	public void setPeriodenBez(java.lang.String inp) {
		periodenBez = inp;
	}

	public java.lang.String getPeriodenBez()

	{
		return periodenBez;
	}

	public void setAnfDatum(java.sql.Date inp) {
		anfDatum = inp;
	}

	public java.sql.Date getAnfDatum()

	{
		return anfDatum;
	}

	public void setEndDatum(java.sql.Date inp) {
		endDatum = inp;
	}

	public java.sql.Date getEndDatum()

	{
		return endDatum;
	}

	public void setArbeitstage(double inp) {
		arbeitstage = inp;
	}

	public double getArbeitstage()

	{
		return arbeitstage;
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
