/*
 * Locations.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 28 mit dem Namen "Locations"
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

public class Locations extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Locations";
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
	public static int bezeichnung_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int art_Fn = 13;
	public static int kategorie_Fn = 14;
	public static int lage_Fn = 15;
	public static int bewertungzahl_Fn = 16;
	public static int gesamtbetten_Fn = 17;
	public static int einzelzimmer_Fn = 18;
	public static int doppelzimmer_Fn = 19;
	public static int sonstige_Fn = 20;
	public static int ezPreisAb_Fn = 21;
	public static int ezPreisBis_Fn = 22;
	public static int dzPreisAb_Fn = 23;
	public static int dzPreisBis_Fn = 24;
	public static int tagungsPauschaleVon_Fn = 25;
	public static int tagungsPauschaleBis_Fn = 26;
	public static int tagungsPauschaleBemerkung_Fn = 27;
	public static int entfernungFlughafen_Fn = 28;
	public static int entfernungCity_Fn = 29;
	public static int entfernungMesse_Fn = 30;
	public static int entfernungNV_Fn = 31;
	public static int entfernungAutobahn_Fn = 32;
	public static int provisionZimmer_Fn = 33;
	public static int provisionTagung_Fn = 34;
	public static int provisionCatering_Fn = 35;
	public static int tagungsGesKap_Fn = 36;
	public static int tagungsRäume_Fn = 37;
	public static int _009_001_Adressen_DID_HAdr_Fn = 38;
	public static int _009_001_Adressen_DID_K2_Fn = 39;
	public static int _009_001_Adressen_DID_K3_Fn = 40;
	public static int m_009_016_Adressfeld1_Fn = 41;
	public static int m_009_017_PLZ_Fn = 42;
	public static int m_009_018_Ort_Fn = 43;
	public static int m_009_044_Land_Fn = 44;
	public static int _005_001_Währungen_DID_Fn = 45;
	public static int m_005_011_Währungszeichen_Fn = 46;
	public static int sightSeeing_Fn = 47;
	public static int bewertung_Fn = 48;

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
	private java.lang.String art = "";
	private java.lang.String kategorie = "";
	private java.lang.String lage = "";
	private double bewertungzahl = 0;
	private int gesamtbetten = 0;
	private int einzelzimmer = 0;
	private int doppelzimmer = 0;
	private int sonstige = 0;
	private double ezPreisAb = 0;
	private double ezPreisBis = 0;
	private double dzPreisAb = 0;
	private double dzPreisBis = 0;
	private double tagungsPauschaleVon = 0;
	private double tagungsPauschaleBis = 0;
	private java.lang.StringBuilder tagungsPauschaleBemerkung = new java.lang.StringBuilder();
	private double entfernungFlughafen = 0;
	private double entfernungCity = 0;
	private double entfernungMesse = 0;
	private double entfernungNV = 0;
	private double entfernungAutobahn = 0;
	private double provisionZimmer = 0;
	private double provisionTagung = 0;
	private double provisionCatering = 0;
	private double tagungsGesKap = 0;
	private double tagungsRäume = 0;
	private int _009_001_Adressen_DID_HAdr = 0;
	private int _009_001_Adressen_DID_K2 = 0;
	private int _009_001_Adressen_DID_K3 = 0;
	private java.lang.String m_009_016_Adressfeld1 = "";
	private java.lang.String m_009_017_PLZ = "";
	private java.lang.String m_009_018_Ort = "";
	private java.lang.String m_009_044_Land = "";
	private int _005_001_Währungen_DID = 0;
	private java.lang.String m_005_011_Währungszeichen = "";
	private java.lang.StringBuilder sightSeeing = new java.lang.StringBuilder();
	private java.lang.StringBuilder bewertung = new java.lang.StringBuilder();
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
			new FieldSpec("art", 13, 80, "java.lang.String", null),
			new FieldSpec("kategorie", 14, 80, "java.lang.String", null),
			new FieldSpec("lage", 15, 80, "java.lang.String", null),
			new FieldSpec("bewertungzahl", 16, 0, "double", null),
			new FieldSpec("gesamtbetten", 17, 0, "int", null),
			new FieldSpec("einzelzimmer", 18, 0, "int", null),
			new FieldSpec("doppelzimmer", 19, 0, "int", null),
			new FieldSpec("sonstige", 20, 0, "int", null),
			new FieldSpec("ezPreisAb", 21, 0, "double", null),
			new FieldSpec("ezPreisBis", 22, 0, "double", null),
			new FieldSpec("dzPreisAb", 23, 0, "double", null),
			new FieldSpec("dzPreisBis", 24, 0, "double", null),
			new FieldSpec("tagungsPauschaleVon", 25, 0, "double", null),
			new FieldSpec("tagungsPauschaleBis", 26, 0, "double", null),
			new FieldSpec("tagungsPauschaleBemerkung", 27, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("entfernungFlughafen", 28, 0, "double", null),
			new FieldSpec("entfernungCity", 29, 0, "double", null),
			new FieldSpec("entfernungMesse", 30, 0, "double", null),
			new FieldSpec("entfernungNV", 31, 0, "double", null),
			new FieldSpec("entfernungAutobahn", 32, 0, "double", null),
			new FieldSpec("provisionZimmer", 33, 0, "double", null),
			new FieldSpec("provisionTagung", 34, 0, "double", null),
			new FieldSpec("provisionCatering", 35, 0, "double", null),
			new FieldSpec("tagungsGesKap", 36, 0, "double", null),
			new FieldSpec("tagungsRäume", 37, 0, "double", null),
			new FieldSpec("_009_001_Adressen_DID_HAdr", 38, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_HAdr")),
			new FieldSpec("_009_001_Adressen_DID_K2", 39, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_K2")),
			new FieldSpec("_009_001_Adressen_DID_K3", 40, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_K3")),
			new FieldSpec("m_009_016_Adressfeld1", 41, 40, "java.lang.String",
					null),
			new FieldSpec("m_009_017_PLZ", 42, 10, "java.lang.String", null),
			new FieldSpec("m_009_018_Ort", 43, 20, "java.lang.String", null),
			new FieldSpec("m_009_044_Land", 44, 5, "java.lang.String", null),
			new FieldSpec("_005_001_Währungen_DID", 45, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("m_005_011_Währungszeichen", 46, 5,
					"java.lang.String", null),
			new FieldSpec("sightSeeing", 47, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("bewertung", 48, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Locations() {
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

	public void setArt(java.lang.String inp) {
		art = inp;
	}

	public java.lang.String getArt()

	{
		return art;
	}

	public void setKategorie(java.lang.String inp) {
		kategorie = inp;
	}

	public java.lang.String getKategorie()

	{
		return kategorie;
	}

	public void setLage(java.lang.String inp) {
		lage = inp;
	}

	public java.lang.String getLage()

	{
		return lage;
	}

	public void setBewertungzahl(double inp) {
		bewertungzahl = inp;
	}

	public double getBewertungzahl()

	{
		return bewertungzahl;
	}

	public void setGesamtbetten(int inp) {
		gesamtbetten = inp;
	}

	public int getGesamtbetten()

	{
		return gesamtbetten;
	}

	public void setEinzelzimmer(int inp) {
		einzelzimmer = inp;
	}

	public int getEinzelzimmer()

	{
		return einzelzimmer;
	}

	public void setDoppelzimmer(int inp) {
		doppelzimmer = inp;
	}

	public int getDoppelzimmer()

	{
		return doppelzimmer;
	}

	public void setSonstige(int inp) {
		sonstige = inp;
	}

	public int getSonstige()

	{
		return sonstige;
	}

	public void setEzPreisAb(double inp) {
		ezPreisAb = inp;
	}

	public double getEzPreisAb()

	{
		return ezPreisAb;
	}

	public void setEzPreisBis(double inp) {
		ezPreisBis = inp;
	}

	public double getEzPreisBis()

	{
		return ezPreisBis;
	}

	public void setDzPreisAb(double inp) {
		dzPreisAb = inp;
	}

	public double getDzPreisAb()

	{
		return dzPreisAb;
	}

	public void setDzPreisBis(double inp) {
		dzPreisBis = inp;
	}

	public double getDzPreisBis()

	{
		return dzPreisBis;
	}

	public void setTagungsPauschaleVon(double inp) {
		tagungsPauschaleVon = inp;
	}

	public double getTagungsPauschaleVon()

	{
		return tagungsPauschaleVon;
	}

	public void setTagungsPauschaleBis(double inp) {
		tagungsPauschaleBis = inp;
	}

	public double getTagungsPauschaleBis()

	{
		return tagungsPauschaleBis;
	}

	public void setTagungsPauschaleBemerkung(java.lang.StringBuilder inp) {
		tagungsPauschaleBemerkung = inp;
	}

	public java.lang.StringBuilder getTagungsPauschaleBemerkung()

	{
		return tagungsPauschaleBemerkung;
	}

	public void setEntfernungFlughafen(double inp) {
		entfernungFlughafen = inp;
	}

	public double getEntfernungFlughafen()

	{
		return entfernungFlughafen;
	}

	public void setEntfernungCity(double inp) {
		entfernungCity = inp;
	}

	public double getEntfernungCity()

	{
		return entfernungCity;
	}

	public void setEntfernungMesse(double inp) {
		entfernungMesse = inp;
	}

	public double getEntfernungMesse()

	{
		return entfernungMesse;
	}

	public void setEntfernungNV(double inp) {
		entfernungNV = inp;
	}

	public double getEntfernungNV()

	{
		return entfernungNV;
	}

	public void setEntfernungAutobahn(double inp) {
		entfernungAutobahn = inp;
	}

	public double getEntfernungAutobahn()

	{
		return entfernungAutobahn;
	}

	public void setProvisionZimmer(double inp) {
		provisionZimmer = inp;
	}

	public double getProvisionZimmer()

	{
		return provisionZimmer;
	}

	public void setProvisionTagung(double inp) {
		provisionTagung = inp;
	}

	public double getProvisionTagung()

	{
		return provisionTagung;
	}

	public void setProvisionCatering(double inp) {
		provisionCatering = inp;
	}

	public double getProvisionCatering()

	{
		return provisionCatering;
	}

	public void setTagungsGesKap(double inp) {
		tagungsGesKap = inp;
	}

	public double getTagungsGesKap()

	{
		return tagungsGesKap;
	}

	public void setTagungsRäume(double inp) {
		tagungsRäume = inp;
	}

	public double getTagungsRäume()

	{
		return tagungsRäume;
	}

	public void set_009_001_Adressen_DID_HAdr(int inp) {
		_009_001_Adressen_DID_HAdr = inp;
	}

	public int get_009_001_Adressen_DID_HAdr()

	{
		return _009_001_Adressen_DID_HAdr;
	}

	public void set_009_001_Adressen_DID_K2(int inp) {
		_009_001_Adressen_DID_K2 = inp;
	}

	public int get_009_001_Adressen_DID_K2()

	{
		return _009_001_Adressen_DID_K2;
	}

	public void set_009_001_Adressen_DID_K3(int inp) {
		_009_001_Adressen_DID_K3 = inp;
	}

	public int get_009_001_Adressen_DID_K3()

	{
		return _009_001_Adressen_DID_K3;
	}

	public void setM_009_016_Adressfeld1(java.lang.String inp) {
		m_009_016_Adressfeld1 = inp;
	}

	public java.lang.String getM_009_016_Adressfeld1()

	{
		return m_009_016_Adressfeld1;
	}

	public void setM_009_017_PLZ(java.lang.String inp) {
		m_009_017_PLZ = inp;
	}

	public java.lang.String getM_009_017_PLZ()

	{
		return m_009_017_PLZ;
	}

	public void setM_009_018_Ort(java.lang.String inp) {
		m_009_018_Ort = inp;
	}

	public java.lang.String getM_009_018_Ort()

	{
		return m_009_018_Ort;
	}

	public void setM_009_044_Land(java.lang.String inp) {
		m_009_044_Land = inp;
	}

	public java.lang.String getM_009_044_Land()

	{
		return m_009_044_Land;
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

	public void setSightSeeing(java.lang.StringBuilder inp) {
		sightSeeing = inp;
	}

	public java.lang.StringBuilder getSightSeeing()

	{
		return sightSeeing;
	}

	public void setBewertung(java.lang.StringBuilder inp) {
		bewertung = inp;
	}

	public java.lang.StringBuilder getBewertung()

	{
		return bewertung;
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
