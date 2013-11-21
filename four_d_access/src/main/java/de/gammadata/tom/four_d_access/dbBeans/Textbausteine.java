/*
 * Textbausteine.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 76 mit dem Namen "Textbausteine"
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

public class Textbausteine extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Textbausteine";
	public static final int dbTabNummer = 76;
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
	public static int textbausteinBez_Fn = 11;
	public static int _077_001__Textbausteinart_DID_Fn = 12;
	public static int textbausteinSprache1_Fn = 13;
	public static int textbausteinSprache2_Fn = 14;
	public static int textbausteinSprache3_Fn = 15;
	public static int m_077_013_TabellenNummer_Fn = 16;

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
	private java.lang.String textbausteinBez = "";
	private int _077_001__Textbausteinart_DID = 0;
	private java.lang.StringBuilder textbausteinSprache1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder textbausteinSprache2 = new java.lang.StringBuilder();
	private java.lang.StringBuilder textbausteinSprache3 = new java.lang.StringBuilder();
	private int m_077_013_TabellenNummer = 0;
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
			new FieldSpec("textbausteinBez", 11, 40, "java.lang.String", null),
			new FieldSpec("_077_001__Textbausteinart_DID", 12, 0, "int",
					new OneObjectPointer(77, 1, "Textbausteinart", "dID")),
			new FieldSpec("textbausteinSprache1", 13, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("textbausteinSprache2", 14, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("textbausteinSprache3", 15, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("m_077_013_TabellenNummer", 16, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Textbausteine() {
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

	public void setTextbausteinBez(java.lang.String inp) {
		textbausteinBez = inp;
	}

	public java.lang.String getTextbausteinBez()

	{
		return textbausteinBez;
	}

	public void set_077_001__Textbausteinart_DID(int inp) {
		_077_001__Textbausteinart_DID = inp;
	}

	public int get_077_001__Textbausteinart_DID()

	{
		return _077_001__Textbausteinart_DID;
	}

	public void setTextbausteinSprache1(java.lang.StringBuilder inp) {
		textbausteinSprache1 = inp;
	}

	public java.lang.StringBuilder getTextbausteinSprache1()

	{
		return textbausteinSprache1;
	}

	public void setTextbausteinSprache2(java.lang.StringBuilder inp) {
		textbausteinSprache2 = inp;
	}

	public java.lang.StringBuilder getTextbausteinSprache2()

	{
		return textbausteinSprache2;
	}

	public void setTextbausteinSprache3(java.lang.StringBuilder inp) {
		textbausteinSprache3 = inp;
	}

	public java.lang.StringBuilder getTextbausteinSprache3()

	{
		return textbausteinSprache3;
	}

	public void setM_077_013_TabellenNummer(int inp) {
		m_077_013_TabellenNummer = inp;
	}

	public int getM_077_013_TabellenNummer()

	{
		return m_077_013_TabellenNummer;
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
