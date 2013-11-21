/*
 * Räume.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 29 mit dem Namen "Räume"
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

public class Raeume extends BasicBean {
	public static final String xmlClassTag = "Räume";
	public static final int dbTabNummer = 29;
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
	public static int bezeichnung_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int _028_001_Locations_DID_Fn = 13;
	public static int größe_Fn = 14;
	public static int höhe_Fn = 15;
	public static int pL_Anz_Fn = 16;
	public static int u_Anz_Fn = 17;
	public static int reihen_Anz_Fn = 18;
	public static int miete_Fn = 19;
	public static int m_028_011_LocBez_Fn = 20;
	public static int _005_001_Währungen_DID_Fn = 21;
	public static int m_005_011_Währungszeichen_Fn = 22;

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
	private java.lang.String bezeichnung = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private int _028_001_Locations_DID = 0;
	private double größe = 0;
	private double höhe = 0;
	private double pL_Anz = 0;
	private double u_Anz = 0;
	private double reihen_Anz = 0;
	private double miete = 0;
	private java.lang.String m_028_011_LocBez = "";
	private int _005_001_Währungen_DID = 0;
	private java.lang.String m_005_011_Währungszeichen = "";
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
			new FieldSpec("bezeichnung", 11, 80, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_028_001_Locations_DID", 13, 0, "int",
					new OneObjectPointer(28, 1, "Locations", "dID")),
			new FieldSpec("größe", 14, 0, "double", null),
			new FieldSpec("höhe", 15, 0, "double", null),
			new FieldSpec("pL_Anz", 16, 0, "double", null),
			new FieldSpec("u_Anz", 17, 0, "double", null),
			new FieldSpec("reihen_Anz", 18, 0, "double", null),
			new FieldSpec("miete", 19, 0, "double", null),
			new FieldSpec("m_028_011_LocBez", 20, 80, "java.lang.String", null),
			new FieldSpec("_005_001_Währungen_DID", 21, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("m_005_011_Währungszeichen", 22, 20,
					"java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Raeume() {
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

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void set_028_001_Locations_DID(int inp) {
		_028_001_Locations_DID = inp;
	}

	public int get_028_001_Locations_DID()

	{
		return _028_001_Locations_DID;
	}

	public void setGröße(double inp) {
		größe = inp;
	}

	public double getGröße()

	{
		return größe;
	}

	public void setHöhe(double inp) {
		höhe = inp;
	}

	public double getHöhe()

	{
		return höhe;
	}

	public void setPL_Anz(double inp) {
		pL_Anz = inp;
	}

	public double getPL_Anz()

	{
		return pL_Anz;
	}

	public void setU_Anz(double inp) {
		u_Anz = inp;
	}

	public double getU_Anz()

	{
		return u_Anz;
	}

	public void setReihen_Anz(double inp) {
		reihen_Anz = inp;
	}

	public double getReihen_Anz()

	{
		return reihen_Anz;
	}

	public void setMiete(double inp) {
		miete = inp;
	}

	public double getMiete()

	{
		return miete;
	}

	public void setM_028_011_LocBez(java.lang.String inp) {
		m_028_011_LocBez = inp;
	}

	public java.lang.String getM_028_011_LocBez()

	{
		return m_028_011_LocBez;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setM_005_011_Währungszeichen(java.lang.String inp) {
		m_005_011_Währungszeichen = inp;
	}

	public java.lang.String getM_005_011_Währungszeichen()

	{
		return m_005_011_Währungszeichen;
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
