/*
 * Sachverwaltung.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 27 mit dem Namen "Sachverwaltung"
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

public class Sachverwaltung extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Sachverwaltung";
	public static final int dbTabNummer = 27;
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
	public static int _028_001__Sachen_DID_Fn = 11;
	public static int date_Fn = 12;
	public static int time_Fn = 13;
	public static int dauerMin_Fn = 14;
	public static int dauerTage_Fn = 15;
	public static int kommentar_Fn = 16;
	public static int _022_001_Vorgang_DID_Fn = 17;
	public static int _001_001_Mitarbeiter_DID_Fn = 18;
	public static int _009_001_Adressen_DID_Fn = 19;
	public static int _068_001_Kunden_DID_Fn = 20;
	public static int kosten1_Fn = 21;
	public static int kosten2_Fn = 22;
	public static int kosten3_Fn = 23;
	public static int leer_Fn = 24;
	public static int erledigt_Fn = 25;
	public static int weiterverrechnen_Fn = 26;
	public static int erfasst_Fn = 27;
	public static int leer1_Fn = 28;
	public static int sachBild_Fn = 29;
	public static int sachbildfile_Fn = 30;
	public static int _062_001_AusRechPos_DID_Fn = 31;
	public static int leer2_Fn = 32;
	public static int endDate_Fn = 33;
	public static int m_022_031_VorgangNr_Fn = 34;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 35;
	public static int m_068_011_KundenNr_Fn = 36;
	public static int m_068_026_Kunden_Firmenname_Fn = 37;

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
	private int _028_001__Sachen_DID = 0;
	private java.sql.Date date = new java.sql.Date(0);
	private java.sql.Time time = new java.sql.Time(0);
	private int dauerMin = 0;
	private int dauerTage = 0;
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private int _022_001_Vorgang_DID = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private int _009_001_Adressen_DID = 0;
	private int _068_001_Kunden_DID = 0;
	private double kosten1 = 0;
	private double kosten2 = 0;
	private double kosten3 = 0;
	private java.lang.String leer = "";
	private boolean erledigt = false;
	private boolean weiterverrechnen = false;
	private boolean erfasst = false;
	private int leer1 = 0;
	private byte[] sachBild = new byte[0];
	private java.lang.String sachbildfile = "";
	private int _062_001_AusRechPos_DID = 0;
	private java.lang.String leer2 = "";
	private java.sql.Date endDate = new java.sql.Date(0);
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private int m_068_011_KundenNr = 0;
	private java.lang.String m_068_026_Kunden_Firmenname = "";
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
			new FieldSpec("_028_001__Sachen_DID", 11, 0, "int",
					new OneObjectPointer(28, 1, "Sachen", "dID")),
			new FieldSpec("date", 12, 0, "java.sql.Date", null),
			new FieldSpec("time", 13, 0, "java.sql.Time", null),
			new FieldSpec("dauerMin", 14, 0, "int", null),
			new FieldSpec("dauerTage", 15, 0, "int", null),
			new FieldSpec("kommentar", 16, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_022_001_Vorgang_DID", 17, 0, "int",
					new OneObjectPointer(22, 1, "Vorgang", "dID")),
			new FieldSpec("_001_001_Mitarbeiter_DID", 18, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("_009_001_Adressen_DID", 19, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("_068_001_Kunden_DID", 20, 0, "int",
					new OneObjectPointer(68, 1, "Kunden", "dID")),
			new FieldSpec("kosten1", 21, 0, "double", null),
			new FieldSpec("kosten2", 22, 0, "double", null),
			new FieldSpec("kosten3", 23, 0, "double", null),
			new FieldSpec("leer", 24, 2, "java.lang.String", null),
			new FieldSpec("erledigt", 25, 0, "boolean", null),
			new FieldSpec("weiterverrechnen", 26, 0, "boolean", null),
			new FieldSpec("erfasst", 27, 0, "boolean", null),
			new FieldSpec("leer1", 28, 0, "int", null),
			new FieldSpec("sachBild", 29, 0, "byte[]", null),
			new FieldSpec("sachbildfile", 30, 60, "java.lang.String", null),
			new FieldSpec("_062_001_AusRechPos_DID", 31, 0, "int",
					new OneObjectPointer(62, 1, "AusRechPos", "dID")),
			new FieldSpec("leer1", 32, 2, "java.lang.String", null),
			new FieldSpec("endDate", 33, 0, "java.sql.Date", null),
			new FieldSpec("m_022_031_VorgangNr", 34, 30, "java.lang.String",
					null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 35, 5,
					"java.lang.String", null),
			new FieldSpec("m_068_011_KundenNr", 36, 0, "int", null),
			new FieldSpec("m_068_026_Kunden_Firmenname", 37, 40,
					"java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Sachverwaltung() {
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

	public void set_028_001__Sachen_DID(int inp) {
		_028_001__Sachen_DID = inp;
	}

	public int get_028_001__Sachen_DID()

	{
		return _028_001__Sachen_DID;
	}

	public void setDate(java.sql.Date inp) {
		date = inp;
	}

	public java.sql.Date getDate()

	{
		return date;
	}

	public void setTime(java.sql.Time inp) {
		time = inp;
	}

	public java.sql.Time getTime()

	{
		return time;
	}

	public void setDauerMin(int inp) {
		dauerMin = inp;
	}

	public int getDauerMin()

	{
		return dauerMin;
	}

	public void setDauerTage(int inp) {
		dauerTage = inp;
	}

	public int getDauerTage()

	{
		return dauerTage;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
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

	public void setLeer(java.lang.String inp) {
		leer = inp;
	}

	public java.lang.String getLeer()

	{
		return leer;
	}

	public void setErledigt(boolean inp) {
		erledigt = inp;
	}

	public boolean getErledigt()

	{
		return erledigt;
	}

	public void setWeiterverrechnen(boolean inp) {
		weiterverrechnen = inp;
	}

	public boolean getWeiterverrechnen()

	{
		return weiterverrechnen;
	}

	public void setErfasst(boolean inp) {
		erfasst = inp;
	}

	public boolean getErfasst()

	{
		return erfasst;
	}

	public void setLeer1(int inp) {
		leer1 = inp;
	}

	public int getLeer1()

	{
		return leer1;
	}

	public void setSachBild(byte[] inp) {
		sachBild = inp;
	}

	public byte[] getSachBild()

	{
		return sachBild;
	}

	public void setSachbildfile(java.lang.String inp) {
		sachbildfile = inp;
	}

	public java.lang.String getSachbildfile()

	{
		return sachbildfile;
	}

	public void set_062_001_AusRechPos_DID(int inp) {
		_062_001_AusRechPos_DID = inp;
	}

	public int get_062_001_AusRechPos_DID()

	{
		return _062_001_AusRechPos_DID;
	}

	public void setLeer2(java.lang.String inp) {
		leer2 = inp;
	}

	public java.lang.String getLeer2()

	{
		return leer2;
	}

	public void setEndDate(java.sql.Date inp) {
		endDate = inp;
	}

	public java.sql.Date getEndDate()

	{
		return endDate;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setM_068_026_Kunden_Firmenname(java.lang.String inp) {
		m_068_026_Kunden_Firmenname = inp;
	}

	public java.lang.String getM_068_026_Kunden_Firmenname()

	{
		return m_068_026_Kunden_Firmenname;
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
