/*
 * Bestaende.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 37 mit dem Namen "Bestaende"
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

public class Bestaende extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Bestaende";
	public static final int dbTabNummer = 37;
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
	public static int standortID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int bestandsMenge_Fn = 13;
	public static int datum_Fn = 14;
	public static int time_Fn = 15;
	public static int inventurflag_Fn = 16;
	public static int m_032_011_ArtikelNr_Fn = 17;
	public static int m_032_012_ArtikelBezeichnung_Fn = 18;
	public static int eK_einzeln_Fn = 19;
	public static int eK_Gesamt_Fn = 20;
	public static int last_Artikel_DID_Fn = 21;
	public static int m_032_040_Ref_Bez_Fn = 22;

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
	private int standortID = 0;
	private int _032_001_Artikel_DID = 0;
	private double bestandsMenge = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.sql.Time time = new java.sql.Time(0);
	private boolean inventurflag = false;
	private java.lang.String m_032_011_ArtikelNr = "";
	private java.lang.String m_032_012_ArtikelBezeichnung = "";
	private double eK_einzeln = 0;
	private double eK_Gesamt = 0;
	private int last_Artikel_DID = 0;
	private java.lang.String m_032_040_Ref_Bez = "";
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
			new FieldSpec("standortID", 11, 0, "int", null),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("bestandsMenge", 13, 0, "double", null),
			new FieldSpec("datum", 14, 0, "java.sql.Date", null),
			new FieldSpec("time", 15, 0, "java.sql.Time", null),
			new FieldSpec("inventurflag", 16, 0, "boolean", null),
			new FieldSpec("m_032_011_ArtikelNr", 17, 40, "java.lang.String",
					null),
			new FieldSpec("m_032_012_ArtikelBezeichnung", 18, 80,
					"java.lang.String", null),
			new FieldSpec("eK_einzeln", 19, 0, "double", null),
			new FieldSpec("eK_Gesamt", 20, 0, "double", null),
			new FieldSpec("last_Artikel_DID", 21, 0, "int", null),
			new FieldSpec("m_032_040_Ref_Bez", 22, 40, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Bestaende() {
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

	public void setStandortID(int inp) {
		standortID = inp;
	}

	public int getStandortID()

	{
		return standortID;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setBestandsMenge(double inp) {
		bestandsMenge = inp;
	}

	public double getBestandsMenge()

	{
		return bestandsMenge;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setTime(java.sql.Time inp) {
		time = inp;
	}

	public java.sql.Time getTime()

	{
		return time;
	}

	public void setInventurflag(boolean inp) {
		inventurflag = inp;
	}

	public boolean getInventurflag()

	{
		return inventurflag;
	}

	public void setM_032_011_ArtikelNr(java.lang.String inp) {
		m_032_011_ArtikelNr = inp;
	}

	public java.lang.String getM_032_011_ArtikelNr()

	{
		return m_032_011_ArtikelNr;
	}

	public void setM_032_012_ArtikelBezeichnung(java.lang.String inp) {
		m_032_012_ArtikelBezeichnung = inp;
	}

	public java.lang.String getM_032_012_ArtikelBezeichnung()

	{
		return m_032_012_ArtikelBezeichnung;
	}

	public void setEK_einzeln(double inp) {
		eK_einzeln = inp;
	}

	public double getEK_einzeln()

	{
		return eK_einzeln;
	}

	public void setEK_Gesamt(double inp) {
		eK_Gesamt = inp;
	}

	public double getEK_Gesamt()

	{
		return eK_Gesamt;
	}

	public void setLast_Artikel_DID(int inp) {
		last_Artikel_DID = inp;
	}

	public int getLast_Artikel_DID()

	{
		return last_Artikel_DID;
	}

	public void setM_032_040_Ref_Bez(java.lang.String inp) {
		m_032_040_Ref_Bez = inp;
	}

	public java.lang.String getM_032_040_Ref_Bez()

	{
		return m_032_040_Ref_Bez;
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
