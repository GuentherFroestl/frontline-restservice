/*
 * Währungen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 5 mit dem Namen "Währungen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Waehrungen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Währungen";
	public static final int dbTabNummer = 5;
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
	public static int Währungszeichen_Fn = 11;
	public static int Währungsbezeichnung_Fn = 12;
	public static int druckzeichen_Fn = 13;
	public static int bezugskurs_Fn = 14;
	public static int aktueller_Kurs_Fn = 15;
	public static int datum_aktuellerKurs_Fn = 16;
	public static int datum_Bezugskurs_Fn = 17;
	public static int bezugskurs_aktiv_Fn = 18;
	public static int warne_bei_Toleranz_Fn = 19;
	public static int toleranz_Fn = 20;

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
	private java.lang.String Währungszeichen = "";
	private java.lang.String Währungsbezeichnung = "";
	private java.lang.String druckzeichen = "";
	private double bezugskurs = 0;
	private double aktueller_Kurs = 0;
	private java.sql.Date datum_aktuellerKurs = new java.sql.Date(0);
	private java.sql.Date datum_Bezugskurs = new java.sql.Date(0);
	private boolean bezugskurs_aktiv = false;
	private boolean warne_bei_Toleranz = false;
	private double toleranz = 0;
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
			new FieldSpec("Währungszeichen", 11, 5, "java.lang.String", null),
			new FieldSpec("Währungsbezeichnung", 12, 40, "java.lang.String",
					null),
			new FieldSpec("druckzeichen", 13, 10, "java.lang.String", null),
			new FieldSpec("bezugskurs", 14, 0, "double", null),
			new FieldSpec("aktueller_Kurs", 15, 0, "double", null),
			new FieldSpec("datum_aktuellerKurs", 16, 0, "java.sql.Date", null),
			new FieldSpec("datum_Bezugskurs", 17, 0, "java.sql.Date", null),
			new FieldSpec("bezugskurs_aktiv", 18, 0, "boolean", null),
			new FieldSpec("warne_bei_Toleranz", 19, 0, "boolean", null),
			new FieldSpec("toleranz", 20, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Waehrungen() {
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

	public void setWährungszeichen(java.lang.String inp) {
		Währungszeichen = inp;
	}

	public java.lang.String getWährungszeichen()

	{
		return Währungszeichen;
	}

	public void setWährungsbezeichnung(java.lang.String inp) {
		Währungsbezeichnung = inp;
	}

	public java.lang.String getWährungsbezeichnung()

	{
		return Währungsbezeichnung;
	}

	public void setDruckzeichen(java.lang.String inp) {
		druckzeichen = inp;
	}

	public java.lang.String getDruckzeichen()

	{
		return druckzeichen;
	}

	public void setBezugskurs(double inp) {
		bezugskurs = inp;
	}

	public double getBezugskurs()

	{
		return bezugskurs;
	}

	public void setAktueller_Kurs(double inp) {
		aktueller_Kurs = inp;
	}

	public double getAktueller_Kurs()

	{
		return aktueller_Kurs;
	}

	public void setDatum_AktuellerKurs(java.sql.Date inp) {
		datum_aktuellerKurs = inp;
	}

	public java.sql.Date getDatum_AktuellerKurs()

	{
		return datum_aktuellerKurs;
	}

	public void setDatum_Bezugskurs(java.sql.Date inp) {
		datum_Bezugskurs = inp;
	}

	public java.sql.Date getDatum_Bezugskurs()

	{
		return datum_Bezugskurs;
	}

	public void setBezugskurs_aktiv(boolean inp) {
		bezugskurs_aktiv = inp;
	}

	public boolean getBezugskurs_aktiv()

	{
		return bezugskurs_aktiv;
	}

	public void setWarne_bei_Toleranz(boolean inp) {
		warne_bei_Toleranz = inp;
	}

	public boolean getWarne_bei_Toleranz()

	{
		return warne_bei_Toleranz;
	}

	public void setToleranz(double inp) {
		toleranz = inp;
	}

	public double getToleranz()

	{
		return toleranz;
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