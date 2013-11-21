/*
 * Sachen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 28 mit dem Namen "Sachen"
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

public class Sachen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Sachen";
	public static final int dbTabNummer = 28;
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
	public static int sachbezeichnung_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int kennzeichen1_Fn = 13;
	public static int kennzeichen2_Fn = 14;
	public static int kennzeichen3_Fn = 15;
	public static int kennzeichen4_Fn = 16;
	public static int kennzahl1_Fn = 17;
	public static int kennzahl2_Fn = 18;
	public static int kennzahl3_Fn = 19;
	public static int kennzahl4_Fn = 20;
	public static int kosten1_Fn = 21;
	public static int kosten2_Fn = 22;
	public static int kosten3_Fn = 23;
	public static int strasse_Fn = 24;
	public static int pLZ_Fn = 25;
	public static int ort_Fn = 26;
	public static int _040_001_Länder_DID_Fn = 27;
	public static int _032_001_Artikel_DID_Fn = 28;
	public static int farbcode_Fn = 29;
	public static int bild_Fn = 30;

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
	private java.lang.String sachbezeichnung = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private java.lang.String kennzeichen1 = "";
	private java.lang.String kennzeichen2 = "";
	private java.lang.String kennzeichen3 = "";
	private java.lang.String kennzeichen4 = "";
	private double kennzahl1 = 0;
	private double kennzahl2 = 0;
	private double kennzahl3 = 0;
	private double kennzahl4 = 0;
	private double kosten1 = 0;
	private double kosten2 = 0;
	private double kosten3 = 0;
	private java.lang.String strasse = "";
	private java.lang.String pLZ = "";
	private java.lang.String ort = "";
	private int _040_001_Länder_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private int farbcode = 0;
	private byte[] bild = new byte[0];
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "sachbezeichnung", "beschreibung",
			"kennzeichen1", "kennzeichen2", "kennzeichen3", "kennzeichen4",
			"kennzahl1", "kennzahl2", "kennzahl3", "kennzahl4", "kosten1",
			"kosten2", "kosten3", "strasse", "pLZ", "ort",
			"_040_001_Länder_DID", "_032_001_Artikel_DID", "farbcode", "bild" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

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
			new FieldSpec("sachbezeichnung", 11, 40, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("kennzeichen1", 13, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen2", 14, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen3", 15, 40, "java.lang.String", null),
			new FieldSpec("kennzeichen4", 16, 40, "java.lang.String", null),
			new FieldSpec("kennzahl1", 17, 0, "double", null),
			new FieldSpec("kennzahl2", 18, 0, "double", null),
			new FieldSpec("kennzahl3", 19, 0, "double", null),
			new FieldSpec("kennzahl4", 20, 0, "double", null),
			new FieldSpec("kosten1", 21, 0, "double", null),
			new FieldSpec("kosten2", 22, 0, "double", null),
			new FieldSpec("kosten3", 23, 0, "double", null),
			new FieldSpec("strasse", 24, 40, "java.lang.String", null),
			new FieldSpec("pLZ", 25, 40, "java.lang.String", null),
			new FieldSpec("ort", 26, 40, "java.lang.String", null),
			new FieldSpec("_040_001_Länder_DID", 27, 0, "int",
					new OneObjectPointer(40, 1, "Länder", "dID")),
			new FieldSpec("_032_001_Artikel_DID", 28, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("farbcode", 29, 0, "int", null),
			new FieldSpec("bild", 30, 0, "byte[]", null) };

	// generierte Feldkonstanten - Ende

	public Sachen() {
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

	public void setSachbezeichnung(java.lang.String inp) {
		sachbezeichnung = inp;
	}

	public java.lang.String getSachbezeichnung()

	{
		return sachbezeichnung;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setKennzeichen1(java.lang.String inp) {
		kennzeichen1 = inp;
	}

	public java.lang.String getKennzeichen1()

	{
		return kennzeichen1;
	}

	public void setKennzeichen2(java.lang.String inp) {
		kennzeichen2 = inp;
	}

	public java.lang.String getKennzeichen2()

	{
		return kennzeichen2;
	}

	public void setKennzeichen3(java.lang.String inp) {
		kennzeichen3 = inp;
	}

	public java.lang.String getKennzeichen3()

	{
		return kennzeichen3;
	}

	public void setKennzeichen4(java.lang.String inp) {
		kennzeichen4 = inp;
	}

	public java.lang.String getKennzeichen4()

	{
		return kennzeichen4;
	}

	public void setKennzahl1(double inp) {
		kennzahl1 = inp;
	}

	public double getKennzahl1()

	{
		return kennzahl1;
	}

	public void setKennzahl2(double inp) {
		kennzahl2 = inp;
	}

	public double getKennzahl2()

	{
		return kennzahl2;
	}

	public void setKennzahl3(double inp) {
		kennzahl3 = inp;
	}

	public double getKennzahl3()

	{
		return kennzahl3;
	}

	public void setKennzahl4(double inp) {
		kennzahl4 = inp;
	}

	public double getKennzahl4()

	{
		return kennzahl4;
	}

	public void setKosten1(double inp) {
		kosten1 = inp;
	}

	public double getKosten1()

	{
		return kosten1;
	}

	public void setKosten2(double inp) {
		kosten2 = inp;
	}

	public double getKosten2()

	{
		return kosten2;
	}

	public void setKosten3(double inp) {
		kosten3 = inp;
	}

	public double getKosten3()

	{
		return kosten3;
	}

	public void setStrasse(java.lang.String inp) {
		strasse = inp;
	}

	public java.lang.String getStrasse()

	{
		return strasse;
	}

	public void setPLZ(java.lang.String inp) {
		pLZ = inp;
	}

	public java.lang.String getPLZ()

	{
		return pLZ;
	}

	public void setOrt(java.lang.String inp) {
		ort = inp;
	}

	public java.lang.String getOrt()

	{
		return ort;
	}

	public void set_040_001_Länder_DID(int inp) {
		_040_001_Länder_DID = inp;
	}

	public int get_040_001_Länder_DID()

	{
		return _040_001_Länder_DID;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void setBild(byte[] inp) {
		bild = inp;
	}

	public byte[] getBild()

	{
		return bild;
	}

	// generierte getter/setter - Ende

	// Interfaceroutinen

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
	public String[] getXmlFelder1(int mode) {
		return xmlFelder1;
	}

	@Override
	public String[] getXmlFelder1(String mode) {
		return xmlFelder1;
	}

	public String[] getXmlFelderAll() {
		return xmlFelderAll;
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs() {
		return fieldSpecs;
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
