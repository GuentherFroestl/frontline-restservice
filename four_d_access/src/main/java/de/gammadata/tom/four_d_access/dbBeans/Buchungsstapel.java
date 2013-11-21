/*
 * Buchungsstapel.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 82 mit dem Namen "Buchungsstapel"
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

public class Buchungsstapel extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Buchungsstapel";
	public static final int dbTabNummer = 82;
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
	public static int buchungslaufNr_Fn = 11;
	public static int bezeichnung_Fn = 12;
	public static int anzBuchungen_Fn = 13;
	public static int lfdNr_Fn = 14;
	public static int anfangsbetrag_Fn = 15;
	public static int lfdBetrag_Fn = 16;
	public static int _005_001_Währungen_DID_Fn = 17;
	public static int m_079_013_AnfDatum_Fn = 18;
	public static int m_079_014_EndDatum_Fn = 19;
	public static int _079_001__Buchungsperiode_Fn = 20;
	public static int _006_001_KontenDID_Fn = 21;
	public static int m_006_011_KontoNr_Fn = 22;
	public static int automatisch_erzeugt_Fn = 23;
	public static int exportiert_Fn = 24;

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
	private int buchungslaufNr = 0;
	private java.lang.String bezeichnung = "";
	private int anzBuchungen = 0;
	private int lfdNr = 0;
	private double anfangsbetrag = 0;
	private double lfdBetrag = 0;
	private int _005_001_Währungen_DID = 0;
	private java.sql.Date m_079_013_AnfDatum = new java.sql.Date(0);
	private java.sql.Date m_079_014_EndDatum = new java.sql.Date(0);
	private int _079_001__Buchungsperiode = 0;
	private int _006_001_KontenDID = 0;
	private int m_006_011_KontoNr = 0;
	private boolean automatisch_erzeugt = false;
	private boolean exportiert = false;
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
			new FieldSpec("buchungslaufNr", 11, 0, "int", null),
			new FieldSpec("bezeichnung", 12, 40, "java.lang.String", null),
			new FieldSpec("anzBuchungen", 13, 0, "int", null),
			new FieldSpec("lfdNr", 14, 0, "int", null),
			new FieldSpec("anfangsbetrag", 15, 0, "double", null),
			new FieldSpec("lfdBetrag", 16, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 17, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("m_079_013_AnfDatum", 18, 0, "java.sql.Date", null),
			new FieldSpec("m_079_014_EndDatum", 19, 0, "java.sql.Date", null),
			new FieldSpec("_079_001__Buchungsperiode", 20, 0, "int",
					new OneObjectPointer(79, 1, "Buchungsperiode", "")),
			new FieldSpec("_006_001_KontenDID", 21, 0, "int",
					new OneObjectPointer(6, 1, "KontenDID", "")),
			new FieldSpec("m_006_011_KontoNr", 22, 0, "int", null),
			new FieldSpec("automatisch_erzeugt", 23, 0, "boolean", null),
			new FieldSpec("exportiert", 24, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Buchungsstapel() {
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

	public void setBuchungslaufNr(int inp) {
		buchungslaufNr = inp;
	}

	public int getBuchungslaufNr()

	{
		return buchungslaufNr;
	}

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setAnzBuchungen(int inp) {
		anzBuchungen = inp;
	}

	public int getAnzBuchungen()

	{
		return anzBuchungen;
	}

	public void setLfdNr(int inp) {
		lfdNr = inp;
	}

	public int getLfdNr()

	{
		return lfdNr;
	}

	public void setAnfangsbetrag(double inp) {
		anfangsbetrag = inp;
	}

	public double getAnfangsbetrag()

	{
		return anfangsbetrag;
	}

	public void setLfdBetrag(double inp) {
		lfdBetrag = inp;
	}

	public double getLfdBetrag()

	{
		return lfdBetrag;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setM_079_013_AnfDatum(java.sql.Date inp) {
		m_079_013_AnfDatum = inp;
	}

	public java.sql.Date getM_079_013_AnfDatum()

	{
		return m_079_013_AnfDatum;
	}

	public void setM_079_014_EndDatum(java.sql.Date inp) {
		m_079_014_EndDatum = inp;
	}

	public java.sql.Date getM_079_014_EndDatum()

	{
		return m_079_014_EndDatum;
	}

	public void set_079_001__Buchungsperiode(int inp) {
		_079_001__Buchungsperiode = inp;
	}

	public int get_079_001__Buchungsperiode()

	{
		return _079_001__Buchungsperiode;
	}

	public void set_006_001_KontenDID(int inp) {
		_006_001_KontenDID = inp;
	}

	public int get_006_001_KontenDID()

	{
		return _006_001_KontenDID;
	}

	public void setM_006_011_KontoNr(int inp) {
		m_006_011_KontoNr = inp;
	}

	public int getM_006_011_KontoNr()

	{
		return m_006_011_KontoNr;
	}

	public void setAutomatisch_erzeugt(boolean inp) {
		automatisch_erzeugt = inp;
	}

	public boolean getAutomatisch_erzeugt()

	{
		return automatisch_erzeugt;
	}

	public void setExportiert(boolean inp) {
		exportiert = inp;
	}

	public boolean getExportiert()

	{
		return exportiert;
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
