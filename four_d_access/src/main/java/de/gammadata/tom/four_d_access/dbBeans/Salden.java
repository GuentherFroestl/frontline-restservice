/*
 * Salden.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 35 mit dem Namen "Salden"
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

public class Salden extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Salden";
	public static final int dbTabNummer = 35;
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
	public static int datum_Fn = 11;
	public static int _083_001_GeldkontenDID_Fn = 12;
	public static int m_083_011_GeldkontenBezeichnung_Fn = 13;
	public static int betrag_Fn = 14;
	public static int leer_Fn = 15;
	public static int leer1_Fn = 16;
	public static int leer2_Fn = 17;
	public static int leer3_Fn = 18;
	public static int leer4_Fn = 19;
	public static int leer5_Fn = 20;
	public static int leer6_Fn = 21;
	public static int leer7_Fn = 22;
	public static int leer8_Fn = 23;

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
	private java.sql.Date datum = new java.sql.Date(0);
	private int _083_001_GeldkontenDID = 0;
	private java.lang.String m_083_011_GeldkontenBezeichnung = "";
	private double betrag = 0;
	private int leer = 0;
	private int leer1 = 0;
	private int leer2 = 0;
	private int leer3 = 0;
	private int leer4 = 0;
	private int leer5 = 0;
	private int leer6 = 0;
	private int leer7 = 0;
	private int leer8 = 0;
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
			new FieldSpec("datum", 11, 0, "java.sql.Date", null),
			new FieldSpec("_083_001_GeldkontenDID", 12, 0, "int",
					new OneObjectPointer(83, 1, "GeldkontenDID", "")),
			new FieldSpec("m_083_011_GeldkontenBezeichnung", 13, 40,
					"java.lang.String", null),
			new FieldSpec("betrag", 14, 0, "double", null),
			new FieldSpec("leer", 15, 0, "int", null),
			new FieldSpec("leer1", 16, 0, "int", null),
			new FieldSpec("leer2", 17, 0, "int", null),
			new FieldSpec("leer3", 18, 0, "int", null),
			new FieldSpec("leer4", 19, 0, "int", null),
			new FieldSpec("leer5", 20, 0, "int", null),
			new FieldSpec("leer6", 21, 0, "int", null),
			new FieldSpec("leer7", 22, 0, "int", null),
			new FieldSpec("leer8", 23, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Salden() {
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

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void set_083_001_GeldkontenDID(int inp) {
		_083_001_GeldkontenDID = inp;
	}

	public int get_083_001_GeldkontenDID()

	{
		return _083_001_GeldkontenDID;
	}

	public void setM_083_011_GeldkontenBezeichnung(java.lang.String inp) {
		m_083_011_GeldkontenBezeichnung = inp;
	}

	public java.lang.String getM_083_011_GeldkontenBezeichnung()

	{
		return m_083_011_GeldkontenBezeichnung;
	}

	public void setBetrag(double inp) {
		betrag = inp;
	}

	public double getBetrag()

	{
		return betrag;
	}

	public void setLeer(int inp) {
		leer = inp;
	}

	public int getLeer()

	{
		return leer;
	}

	public void setLeer1(int inp) {
		leer1 = inp;
	}

	public int getLeer1()

	{
		return leer1;
	}

	public void setLeer2(int inp) {
		leer2 = inp;
	}

	public int getLeer2()

	{
		return leer2;
	}

	public void setLeer3(int inp) {
		leer3 = inp;
	}

	public int getLeer3()

	{
		return leer3;
	}

	public void setLeer4(int inp) {
		leer4 = inp;
	}

	public int getLeer4()

	{
		return leer4;
	}

	public void setLeer5(int inp) {
		leer5 = inp;
	}

	public int getLeer5()

	{
		return leer5;
	}

	public void setLeer6(int inp) {
		leer6 = inp;
	}

	public int getLeer6()

	{
		return leer6;
	}

	public void setLeer7(int inp) {
		leer7 = inp;
	}

	public int getLeer7()

	{
		return leer7;
	}

	public void setLeer8(int inp) {
		leer8 = inp;
	}

	public int getLeer8()

	{
		return leer8;
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
