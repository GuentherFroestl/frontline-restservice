/*
 * Buchungspositionen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 30 mit dem Namen "Buchungspositionen"
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

public class Buchungspositionen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Buchungspositionen";
	public static final int dbTabNummer = 30;
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
	public static int _082_001__Buchungsstapel_DID_Fn = 11;
	public static int lfdNr_Fn = 12;
	public static int umsatz_Fn = 13;
	public static int berichtigung_Fn = 14;
	public static int steuerSchluessel_Fn = 15;
	public static int datum_Fn = 16;
	public static int _006_001_GegenkontoDID_Fn = 17;
	public static int _006_001_KontenDID_Fn = 18;
	public static int m_006_011__017_GKontoNr_Fn = 19;
	public static int m_006_011__018_KontoNr_Fn = 20;
	public static int skonto_Fn = 21;
	public static int rundung_Fn = 22;
	public static int buchungstext_Fn = 23;
	public static int beleg1_Fn = 24;
	public static int beleg2_Fn = 25;
	public static int _005_001_Währungen_DID_Fn = 26;
	public static int m_005_011_Währungen_Zeichen_Fn = 27;
	public static int _081_001_Kostenstelle1_Fn = 28;
	public static int _081_001_Kostenstelle2_Fn = 29;
	public static int m_082_011__011_StapelNr_Fn = 30;
	public static int m_081_011__028_Kostst1_Fn = 31;
	public static int m_081_011__029_Kostst2_Fn = 32;
	public static int _003_001_SteuerDID_Fn = 33;
	public static int automatisch_erzeugt_Fn = 34;
	public static int _022_001_Vorgangsverwaltung_DID_Fn = 35;
	public static int weiterverrechenbar_Fn = 36;
	public static int berechnet_Fn = 37;
	public static int exportiert_Fn = 38;
	public static int m_022_031_VorgangNr_Fn = 39;
	public static int quellTab_Fn = 40;
	public static int quellDID_Fn = 41;
	public static int umsatz_soll_Fn = 42;
	public static int umsatz_haben_Fn = 43;

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
	private int _082_001__Buchungsstapel_DID = 0;
	private int lfdNr = 0;
	private double umsatz = 0;
	private int berichtigung = 0;
	private int steuerSchluessel = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private int _006_001_GegenkontoDID = 0;
	private int _006_001_KontenDID = 0;
	private int m_006_011__017_GKontoNr = 0;
	private int m_006_011__018_KontoNr = 0;
	private double skonto = 0;
	private double rundung = 0;
	private java.lang.String buchungstext = "";
	private int beleg1 = 0;
	private int beleg2 = 0;
	private int _005_001_Währungen_DID = 0;
	private java.lang.String m_005_011_Währungen_Zeichen = "";
	private int _081_001_Kostenstelle1 = 0;
	private int _081_001_Kostenstelle2 = 0;
	private int m_082_011__011_StapelNr = 0;
	private int m_081_011__028_Kostst1 = 0;
	private int m_081_011__029_Kostst2 = 0;
	private int _003_001_SteuerDID = 0;
	private boolean automatisch_erzeugt = false;
	private int _022_001_Vorgangsverwaltung_DID = 0;
	private boolean weiterverrechenbar = false;
	private boolean berechnet = false;
	private boolean exportiert = false;
	private java.lang.String m_022_031_VorgangNr = "";
	private int quellTab = 0;
	private int quellDID = 0;
	private double umsatz_soll = 0;
	private double umsatz_haben = 0;
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
			new FieldSpec("_082_001__Buchungsstapel_DID", 11, 0, "int",
					new OneObjectPointer(82, 1, "Buchungsstapel", "dID")),
			new FieldSpec("lfdNr", 12, 0, "int", null),
			new FieldSpec("umsatz", 13, 0, "double", null),
			new FieldSpec("berichtigung", 14, 0, "int", null),
			new FieldSpec("steuerSchluessel", 15, 0, "int", null),
			new FieldSpec("datum", 16, 0, "java.sql.Date", null),
			new FieldSpec("_006_001_GegenkontoDID", 17, 0, "int",
					new OneObjectPointer(6, 1, "GegenkontoDID", "")),
			new FieldSpec("_006_001_KontenDID", 18, 0, "int",
					new OneObjectPointer(6, 1, "KontenDID", "")),
			new FieldSpec("m_006_011__017_GKontoNr", 19, 0, "int", null),
			new FieldSpec("m_006_011__018_KontoNr", 20, 0, "int", null),
			new FieldSpec("skonto", 21, 0, "double", null),
			new FieldSpec("rundung", 22, 0, "double", null),
			new FieldSpec("buchungstext", 23, 30, "java.lang.String", null),
			new FieldSpec("beleg1", 24, 0, "int", null),
			new FieldSpec("beleg2", 25, 0, "int", null),
			new FieldSpec("_005_001_Währungen_DID", 26, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("m_005_011_Währungen_Zeichen", 27, 5,
					"java.lang.String", null),
			new FieldSpec("_081_001_Kostenstelle1", 28, 0, "int",
					new OneObjectPointer(81, 1, "Kostenstelle1", "")),
			new FieldSpec("_081_001_Kostenstelle2", 29, 0, "int",
					new OneObjectPointer(81, 1, "Kostenstelle2", "")),
			new FieldSpec("m_082_011__011_StapelNr", 30, 0, "int", null),
			new FieldSpec("m_081_011__028_Kostst1", 31, 0, "int", null),
			new FieldSpec("m_081_011__029_Kostst2", 32, 0, "int", null),
			new FieldSpec("_003_001_SteuerDID", 33, 0, "int",
					new OneObjectPointer(3, 1, "SteuerDID", "")),
			new FieldSpec("automatisch_erzeugt", 34, 0, "boolean", null),
			new FieldSpec("_022_001_Vorgangsverwaltung_DID", 35, 0, "int",
					new OneObjectPointer(22, 1, "Vorgangsverwaltung", "dID")),
			new FieldSpec("weiterverrechenbar", 36, 0, "boolean", null),
			new FieldSpec("berechnet", 37, 0, "boolean", null),
			new FieldSpec("exportiert", 38, 0, "boolean", null),
			new FieldSpec("m_022_031_VorgangNr", 39, 30, "java.lang.String",
					null), new FieldSpec("quellTab", 40, 0, "int", null),
			new FieldSpec("quellDID", 41, 0, "int", null),
			new FieldSpec("umsatz_soll", 42, 0, "double", null),
			new FieldSpec("umsatz_haben", 43, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Buchungspositionen() {
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

	public void set_082_001__Buchungsstapel_DID(int inp) {
		_082_001__Buchungsstapel_DID = inp;
	}

	public int get_082_001__Buchungsstapel_DID()

	{
		return _082_001__Buchungsstapel_DID;
	}

	public void setLfdNr(int inp) {
		lfdNr = inp;
	}

	public int getLfdNr()

	{
		return lfdNr;
	}

	public void setUmsatz(double inp) {
		umsatz = inp;
	}

	public double getUmsatz()

	{
		return umsatz;
	}

	public void setBerichtigung(int inp) {
		berichtigung = inp;
	}

	public int getBerichtigung()

	{
		return berichtigung;
	}

	public void setSteuerSchluessel(int inp) {
		steuerSchluessel = inp;
	}

	public int getSteuerSchluessel()

	{
		return steuerSchluessel;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void set_006_001_GegenkontoDID(int inp) {
		_006_001_GegenkontoDID = inp;
	}

	public int get_006_001_GegenkontoDID()

	{
		return _006_001_GegenkontoDID;
	}

	public void set_006_001_KontenDID(int inp) {
		_006_001_KontenDID = inp;
	}

	public int get_006_001_KontenDID()

	{
		return _006_001_KontenDID;
	}

	public void setM_006_011__017_GKontoNr(int inp) {
		m_006_011__017_GKontoNr = inp;
	}

	public int getM_006_011__017_GKontoNr()

	{
		return m_006_011__017_GKontoNr;
	}

	public void setM_006_011__018_KontoNr(int inp) {
		m_006_011__018_KontoNr = inp;
	}

	public int getM_006_011__018_KontoNr()

	{
		return m_006_011__018_KontoNr;
	}

	public void setSkonto(double inp) {
		skonto = inp;
	}

	public double getSkonto()

	{
		return skonto;
	}

	public void setRundung(double inp) {
		rundung = inp;
	}

	public double getRundung()

	{
		return rundung;
	}

	public void setBuchungstext(java.lang.String inp) {
		buchungstext = inp;
	}

	public java.lang.String getBuchungstext()

	{
		return buchungstext;
	}

	public void setBeleg1(int inp) {
		beleg1 = inp;
	}

	public int getBeleg1()

	{
		return beleg1;
	}

	public void setBeleg2(int inp) {
		beleg2 = inp;
	}

	public int getBeleg2()

	{
		return beleg2;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setM_005_011_Währungen_Zeichen(java.lang.String inp) {
		m_005_011_Währungen_Zeichen = inp;
	}

	public java.lang.String getM_005_011_Währungen_Zeichen()

	{
		return m_005_011_Währungen_Zeichen;
	}

	public void set_081_001_Kostenstelle1(int inp) {
		_081_001_Kostenstelle1 = inp;
	}

	public int get_081_001_Kostenstelle1()

	{
		return _081_001_Kostenstelle1;
	}

	public void set_081_001_Kostenstelle2(int inp) {
		_081_001_Kostenstelle2 = inp;
	}

	public int get_081_001_Kostenstelle2()

	{
		return _081_001_Kostenstelle2;
	}

	public void setM_082_011__011_StapelNr(int inp) {
		m_082_011__011_StapelNr = inp;
	}

	public int getM_082_011__011_StapelNr()

	{
		return m_082_011__011_StapelNr;
	}

	public void setM_081_011__028_Kostst1(int inp) {
		m_081_011__028_Kostst1 = inp;
	}

	public int getM_081_011__028_Kostst1()

	{
		return m_081_011__028_Kostst1;
	}

	public void setM_081_011__029_Kostst2(int inp) {
		m_081_011__029_Kostst2 = inp;
	}

	public int getM_081_011__029_Kostst2()

	{
		return m_081_011__029_Kostst2;
	}

	public void set_003_001_SteuerDID(int inp) {
		_003_001_SteuerDID = inp;
	}

	public int get_003_001_SteuerDID()

	{
		return _003_001_SteuerDID;
	}

	public void setAutomatisch_erzeugt(boolean inp) {
		automatisch_erzeugt = inp;
	}

	public boolean getAutomatisch_erzeugt()

	{
		return automatisch_erzeugt;
	}

	public void set_022_001_Vorgangsverwaltung_DID(int inp) {
		_022_001_Vorgangsverwaltung_DID = inp;
	}

	public int get_022_001_Vorgangsverwaltung_DID()

	{
		return _022_001_Vorgangsverwaltung_DID;
	}

	public void setWeiterverrechenbar(boolean inp) {
		weiterverrechenbar = inp;
	}

	public boolean getWeiterverrechenbar()

	{
		return weiterverrechenbar;
	}

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void setExportiert(boolean inp) {
		exportiert = inp;
	}

	public boolean getExportiert()

	{
		return exportiert;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setQuellTab(int inp) {
		quellTab = inp;
	}

	public int getQuellTab()

	{
		return quellTab;
	}

	public void setQuellDID(int inp) {
		quellDID = inp;
	}

	public int getQuellDID()

	{
		return quellDID;
	}

	public void setUmsatz_soll(double inp) {
		umsatz_soll = inp;
	}

	public double getUmsatz_soll()

	{
		return umsatz_soll;
	}

	public void setUmsatz_haben(double inp) {
		umsatz_haben = inp;
	}

	public double getUmsatz_haben()

	{
		return umsatz_haben;
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
