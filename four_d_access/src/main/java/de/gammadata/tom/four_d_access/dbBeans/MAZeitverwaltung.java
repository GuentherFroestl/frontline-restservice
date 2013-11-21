/*
 * MAZeitverwaltung.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 19 mit dem Namen "MAZeitverwaltung"
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

public class MAZeitverwaltung extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MAZeitverwaltung";
	public static final int dbTabNummer = 19;
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
	public static int _021_001__AktionsTabelle_DID_Fn = 11;
	public static int datum_Fn = 12;
	public static int uhrzeit_Fn = 13;
	public static int dauerStd_Fn = 14;
	public static int dauerTage_Fn = 15;
	public static int kommentar_Fn = 16;
	public static int _022_001_Vorgangsverwaltung_DID_Fn = 17;
	public static int _001_001_Mitarbeiter_DID_Fn = 18;
	public static int _009_001_Adressen_DID_Fn = 19;
	public static int syncPalm_Fn = 20;
	public static int kosten1_Fn = 21;
	public static int listID_Fn = 22;
	public static int priorität_Fn = 23;
	public static int erledigt_Fn = 24;
	public static int weiterverrechnen_Fn = 25;
	public static int berechnet_Fn = 26;
	public static int privat_Fn = 27;
	public static int inArbeit_Fn = 28;
	public static int m_021_011_Aktionstabelle_KBZ_Fn = 29;
	public static int m_009_011_Adressen_Firmenname_Fn = 30;
	public static int m_009_014_Adressen_Nachname_Fn = 31;
	public static int m_001_042_extern_Fn = 32;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 33;
	public static int std_geplant_Fn = 34;
	public static int erledigt_Prozent_Fn = 35;
	public static int tage_geplant_Fn = 36;
	public static int _062_001_AusRechPos_DID_Fn = 37;
	public static int _065_001_Aufpos_DID_Fn = 38;
	public static int m_065_012_ArtikelDID_Fn = 39;
	public static int m_065_014_ArtikelBez_Fn = 40;
	public static int typ_Fn = 41;
	public static int m_022_031_VorgangNr_Fn = 42;
	public static int anfDatum_berechnet_Fn = 43;
	public static int endDatum_geplant_Fn = 44;
	public static int m_062_028_AusRech_PosNr_Fn = 45;
	public static int palmDID_Fn = 46;
	public static int kBZ_Fn = 47;
	public static int enddatum_Fn = 48;
	public static int erledigungsDatum_Fn = 49;
	public static int _005_001_WährungenDID_Fn = 50;
	public static int m_005_011_Währungszeichen_Fn = 51;
	public static int kurs_Fn = 52;
	public static int m_022_029_KundenDID_Fn = 53;

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
	private int _021_001__AktionsTabelle_DID = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.sql.Time uhrzeit = new java.sql.Time(0);
	private double dauerStd = 0;
	private double dauerTage = 0;
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private int _022_001_Vorgangsverwaltung_DID = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private int _009_001_Adressen_DID = 0;
	private boolean syncPalm = false;
	private double kosten1 = 0;
	private int listID = 0;
	private int priorität = 0;
	private boolean erledigt = false;
	private boolean weiterverrechnen = false;
	private boolean berechnet = false;
	private boolean privat = false;
	private boolean inArbeit = false;
	private java.lang.String m_021_011_Aktionstabelle_KBZ = "";
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private boolean m_001_042_extern = false;
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private double std_geplant = 0;
	private double erledigt_Prozent = 0;
	private double tage_geplant = 0;
	private int _062_001_AusRechPos_DID = 0;
	private int _065_001_Aufpos_DID = 0;
	private int m_065_012_ArtikelDID = 0;
	private java.lang.String m_065_014_ArtikelBez = "";
	private int typ = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private java.sql.Date anfDatum_berechnet = new java.sql.Date(0);
	private java.sql.Date endDatum_geplant = new java.sql.Date(0);
	private int m_062_028_AusRech_PosNr = 0;
	private int palmDID = 0;
	private java.lang.String kBZ = "";
	private java.sql.Date enddatum = new java.sql.Date(0);
	private java.sql.Date erledigungsDatum = new java.sql.Date(0);
	private int _005_001_WährungenDID = 0;
	private java.lang.String m_005_011_Währungszeichen = "";
	private double kurs = 0;
	private int m_022_029_KundenDID = 0;
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
			new FieldSpec("_021_001__AktionsTabelle_DID", 11, 0, "int",
					new OneObjectPointer(21, 1, "AktionsTabelle", "dID")),
			new FieldSpec("datum", 12, 0, "java.sql.Date", null),
			new FieldSpec("uhrzeit", 13, 0, "java.sql.Time", null),
			new FieldSpec("dauerStd", 14, 0, "double", null),
			new FieldSpec("dauerTage", 15, 0, "double", null),
			new FieldSpec("kommentar", 16, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_022_001_Vorgangsverwaltung_DID", 17, 0, "int",
					new OneObjectPointer(22, 1, "Vorgangsverwaltung", "dID")),
			new FieldSpec("_001_001_Mitarbeiter_DID", 18, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("_009_001_Adressen_DID", 19, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("syncPalm", 20, 0, "boolean", null),
			new FieldSpec("kosten1", 21, 0, "double", null),
			new FieldSpec("listID", 22, 0, "int", null),
			new FieldSpec("priorität", 23, 0, "int", null),
			new FieldSpec("erledigt", 24, 0, "boolean", null),
			new FieldSpec("weiterverrechnen", 25, 0, "boolean", null),
			new FieldSpec("berechnet", 26, 0, "boolean", null),
			new FieldSpec("privat", 27, 0, "boolean", null),
			new FieldSpec("inArbeit", 28, 0, "boolean", null),
			new FieldSpec("m_021_011_Aktionstabelle_KBZ", 29, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 30, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_014_Adressen_Nachname", 31, 40,
					"java.lang.String", null),
			new FieldSpec("m_001_042_extern", 32, 0, "boolean", null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 33, 5,
					"java.lang.String", null),
			new FieldSpec("std_geplant", 34, 0, "double", null),
			new FieldSpec("erledigt_Prozent", 35, 0, "double", null),
			new FieldSpec("tage_geplant", 36, 0, "double", null),
			new FieldSpec("_062_001_AusRechPos_DID", 37, 0, "int", null),
			new FieldSpec("_065_001_Aufpos_DID", 38, 0, "int", null),
			new FieldSpec("m_065_012_ArtikelDID", 39, 0, "int", null),
			new FieldSpec("m_065_014_ArtikelBez", 40, 60, "java.lang.String",
					null),
			new FieldSpec("typ", 41, 0, "int", null),
			new FieldSpec("m_022_031_VorgangNr", 42, 30, "java.lang.String",
					null),
			new FieldSpec("anfDatum_berechnet", 43, 0, "java.sql.Date", null),
			new FieldSpec("endDatum_geplant", 44, 0, "java.sql.Date", null),
			new FieldSpec("m_062_028_AusRech_PosNr", 45, 0, "int", null),
			new FieldSpec("palmDID", 46, 0, "int", null),
			new FieldSpec("kBZ", 47, 80, "java.lang.String", null),
			new FieldSpec("enddatum", 48, 0, "java.sql.Date", null),
			new FieldSpec("erledigungsDatum", 49, 0, "java.sql.Date", null),
			new FieldSpec("_005_001_WährungenDID", 50, 0, "int", null),
			new FieldSpec("m_005_011_Währungszeichen", 51, 4,
					"java.lang.String", null),
			new FieldSpec("kurs", 52, 0, "double", null),
			new FieldSpec("m_022_029_KundenDID", 53, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public MAZeitverwaltung() {
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

	public void set_021_001__AktionsTabelle_DID(int inp) {
		_021_001__AktionsTabelle_DID = inp;
	}

	public int get_021_001__AktionsTabelle_DID()

	{
		return _021_001__AktionsTabelle_DID;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setUhrzeit(java.sql.Time inp) {
		uhrzeit = inp;
	}

	public java.sql.Time getUhrzeit()

	{
		return uhrzeit;
	}

	public void setDauerStd(double inp) {
		dauerStd = inp;
	}

	public double getDauerStd()

	{
		return dauerStd;
	}

	public void setDauerTage(double inp) {
		dauerTage = inp;
	}

	public double getDauerTage()

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

	public void set_022_001_Vorgangsverwaltung_DID(int inp) {
		_022_001_Vorgangsverwaltung_DID = inp;
	}

	public int get_022_001_Vorgangsverwaltung_DID()

	{
		return _022_001_Vorgangsverwaltung_DID;
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

	public void setSyncPalm(boolean inp) {
		syncPalm = inp;
	}

	public boolean getSyncPalm()

	{
		return syncPalm;
	}

	public void setKosten1(double inp) {
		kosten1 = inp;
	}

	public double getKosten1()

	{
		return kosten1;
	}

	public void setListID(int inp) {
		listID = inp;
	}

	public int getListID()

	{
		return listID;
	}

	public void setPriorität(int inp) {
		priorität = inp;
	}

	public int getPriorität()

	{
		return priorität;
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

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void setPrivat(boolean inp) {
		privat = inp;
	}

	public boolean getPrivat()

	{
		return privat;
	}

	public void setInArbeit(boolean inp) {
		inArbeit = inp;
	}

	public boolean getInArbeit()

	{
		return inArbeit;
	}

	public void setM_021_011_Aktionstabelle_KBZ(java.lang.String inp) {
		m_021_011_Aktionstabelle_KBZ = inp;
	}

	public java.lang.String getM_021_011_Aktionstabelle_KBZ()

	{
		return m_021_011_Aktionstabelle_KBZ;
	}

	public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
		m_009_011_Adressen_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Adressen_Firmenname()

	{
		return m_009_011_Adressen_Firmenname;
	}

	public void setM_009_014_Adressen_Nachname(java.lang.String inp) {
		m_009_014_Adressen_Nachname = inp;
	}

	public java.lang.String getM_009_014_Adressen_Nachname()

	{
		return m_009_014_Adressen_Nachname;
	}

	public void setM_001_042_extern(boolean inp) {
		m_001_042_extern = inp;
	}

	public boolean getM_001_042_extern()

	{
		return m_001_042_extern;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setStd_geplant(double inp) {
		std_geplant = inp;
	}

	public double getStd_geplant()

	{
		return std_geplant;
	}

	public void setErledigt_Prozent(double inp) {
		erledigt_Prozent = inp;
	}

	public double getErledigt_Prozent()

	{
		return erledigt_Prozent;
	}

	public void setTage_geplant(double inp) {
		tage_geplant = inp;
	}

	public double getTage_geplant()

	{
		return tage_geplant;
	}

	public void set_062_001_AusRechPos_DID(int inp) {
		_062_001_AusRechPos_DID = inp;
	}

	public int get_062_001_AusRechPos_DID()

	{
		return _062_001_AusRechPos_DID;
	}

	public void set_065_001_Aufpos_DID(int inp) {
		_065_001_Aufpos_DID = inp;
	}

	public int get_065_001_Aufpos_DID()

	{
		return _065_001_Aufpos_DID;
	}

	public void setM_065_012_ArtikelDID(int inp) {
		m_065_012_ArtikelDID = inp;
	}

	public int getM_065_012_ArtikelDID()

	{
		return m_065_012_ArtikelDID;
	}

	public void setM_065_014_ArtikelBez(java.lang.String inp) {
		m_065_014_ArtikelBez = inp;
	}

	public java.lang.String getM_065_014_ArtikelBez()

	{
		return m_065_014_ArtikelBez;
	}

	public void setTyp(int inp) {
		typ = inp;
	}

	public int getTyp()

	{
		return typ;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setAnfDatum_berechnet(java.sql.Date inp) {
		anfDatum_berechnet = inp;
	}

	public java.sql.Date getAnfDatum_berechnet()

	{
		return anfDatum_berechnet;
	}

	public void setEndDatum_geplant(java.sql.Date inp) {
		endDatum_geplant = inp;
	}

	public java.sql.Date getEndDatum_geplant()

	{
		return endDatum_geplant;
	}

	public void setM_062_028_AusRech_PosNr(int inp) {
		m_062_028_AusRech_PosNr = inp;
	}

	public int getM_062_028_AusRech_PosNr()

	{
		return m_062_028_AusRech_PosNr;
	}

	public void setPalmDID(int inp) {
		palmDID = inp;
	}

	public int getPalmDID()

	{
		return palmDID;
	}

	public void setKBZ(java.lang.String inp) {
		kBZ = inp;
	}

	public java.lang.String getKBZ()

	{
		return kBZ;
	}

	public void setEnddatum(java.sql.Date inp) {
		enddatum = inp;
	}

	public java.sql.Date getEnddatum()

	{
		return enddatum;
	}

	public void setErledigungsDatum(java.sql.Date inp) {
		erledigungsDatum = inp;
	}

	public java.sql.Date getErledigungsDatum()

	{
		return erledigungsDatum;
	}

	public void set_005_001_WährungenDID(int inp) {
		_005_001_WährungenDID = inp;
	}

	public int get_005_001_WährungenDID()

	{
		return _005_001_WährungenDID;
	}

	public void setM_005_011_Währungszeichen(java.lang.String inp) {
		m_005_011_Währungszeichen = inp;
	}

	public java.lang.String getM_005_011_Währungszeichen()

	{
		return m_005_011_Währungszeichen;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
	}

	public void setM_022_029_KundenDID(int inp) {
		m_022_029_KundenDID = inp;
	}

	public int getM_022_029_KundenDID()

	{
		return m_022_029_KundenDID;
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
