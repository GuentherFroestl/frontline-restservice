/*
 * MerkmalTabelle.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 25 mit dem Namen "MerkmalTabelle"
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

public class MerkmalTabelle extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MerkmalTabelle";
	public static final int dbTabNummer = 25;
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
	public static int _004_001__Merkmalgruppen_DID_Fn = 13;
	public static int m_004_011_Merkmalgruppe_Fn = 14;
	public static int zielTabelle_Fn = 15;
	public static int wertBezeichnung_Fn = 16;
	public static int kommentarHinweis_Fn = 17;

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
	private int _004_001__Merkmalgruppen_DID = 0;
	private java.lang.String m_004_011_Merkmalgruppe = "";
	private int zielTabelle = 0;
	private java.lang.String wertBezeichnung = "";
	private java.lang.StringBuilder kommentarHinweis = new java.lang.StringBuilder();
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
			new FieldSpec("bezeichnung", 11, 40, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_004_001__Merkmalgruppen_DID", 13, 0, "int",
					new OneObjectPointer(4, 1, "Merkmalgruppen", "dID")),
			new FieldSpec("m_004_011_Merkmalgruppe", 14, 40,
					"java.lang.String", null),
			new FieldSpec("zielTabelle", 15, 0, "int", null),
			new FieldSpec("wertBezeichnung", 16, 80, "java.lang.String", null),
			new FieldSpec("kommentarHinweis", 17, 32768,
					"java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public MerkmalTabelle() {
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

	public void set_004_001__Merkmalgruppen_DID(int inp) {
		_004_001__Merkmalgruppen_DID = inp;
	}

	public int get_004_001__Merkmalgruppen_DID()

	{
		return _004_001__Merkmalgruppen_DID;
	}

	public void setM_004_011_Merkmalgruppe(java.lang.String inp) {
		m_004_011_Merkmalgruppe = inp;
	}

	public java.lang.String getM_004_011_Merkmalgruppe()

	{
		return m_004_011_Merkmalgruppe;
	}

	public void setZielTabelle(int inp) {
		zielTabelle = inp;
	}

	public int getZielTabelle()

	{
		return zielTabelle;
	}

	public void setWertBezeichnung(java.lang.String inp) {
		wertBezeichnung = inp;
	}

	public java.lang.String getWertBezeichnung()

	{
		return wertBezeichnung;
	}

	public void setKommentarHinweis(java.lang.StringBuilder inp) {
		kommentarHinweis = inp;
	}

	public java.lang.StringBuilder getKommentarHinweis()

	{
		return kommentarHinweis;
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
