/*
 * Medien.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 64 mit dem Namen "Medien"
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

public class Medien extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Medien";
	public static final int dbTabNummer = 64;
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
	public static int medienNummer_Fn = 11;
	public static int medienBezeichnung_Fn = 12;
	public static int erstellungsDatum_Fn = 13;
	public static int medienUntertitel_Fn = 14;
	public static int medienbeschreibung_Fn = 15;
	public static int _090_001_MedienArten_DID_Fn = 16;
	public static int m_090_011_MedienArtBez_Fn = 17;
	public static int _022_001_Vorgangsverwaltung_DID_Fn = 18;
	public static int m_022_031_VorgangNr_Fn = 19;
	public static int m_022_011_VorgangKBZ_Fn = 20;
	public static int _009_001_Adressen_DID_Fn = 21;
	public static int m_009_011_Firmenname_Fn = 22;
	public static int m_009_014_Nachname_Fn = 23;
	public static int angabe_1_Fn = 24;
	public static int angabe_2_Fn = 25;
	public static int angabe_3_Fn = 26;
	public static int angabe_4_Fn = 27;
	public static int angabe_5_Fn = 28;
	public static int angabe_6_Fn = 29;
	public static int angabe_7_Fn = 30;
	public static int angabe_8_Fn = 31;
	public static int angabe_9_Fn = 32;
	public static int angabe_10_Fn = 33;
	public static int dauer_Fn = 34;
	public static int archivbezeichnung_Fn = 35;
	public static int archivIndex_Fn = 36;
	public static int original_Fn = 37;
	public static int _001_001_Mitarbeiter_DID_Fn = 38;
	public static int m_001_021_MitarbeiterKürzel_Fn = 39;
	public static int prüfdatum_Fn = 40;
	public static int prüfbemerkung_Fn = 41;

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
	private int medienNummer = 0;
	private java.lang.String medienBezeichnung = "";
	private java.sql.Date erstellungsDatum = new java.sql.Date(0);
	private java.lang.String medienUntertitel = "";
	private java.lang.StringBuilder medienbeschreibung = new java.lang.StringBuilder();
	private int _090_001_MedienArten_DID = 0;
	private java.lang.String m_090_011_MedienArtBez = "";
	private int _022_001_Vorgangsverwaltung_DID = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.String m_022_011_VorgangKBZ = "";
	private int _009_001_Adressen_DID = 0;
	private java.lang.String m_009_011_Firmenname = "";
	private java.lang.String m_009_014_Nachname = "";
	private java.lang.String angabe_1 = "";
	private java.lang.String angabe_2 = "";
	private java.lang.String angabe_3 = "";
	private java.lang.String angabe_4 = "";
	private java.lang.String angabe_5 = "";
	private java.lang.String angabe_6 = "";
	private java.lang.String angabe_7 = "";
	private java.lang.String angabe_8 = "";
	private java.lang.String angabe_9 = "";
	private java.lang.String angabe_10 = "";
	private java.lang.String dauer = "";
	private java.lang.StringBuilder archivbezeichnung = new java.lang.StringBuilder();
	private java.lang.String archivIndex = "";
	private boolean original = false;
	private int _001_001_Mitarbeiter_DID = 0;
	private java.lang.String m_001_021_MitarbeiterKürzel = "";
	private java.sql.Date prüfdatum = new java.sql.Date(0);
	private java.lang.StringBuilder prüfbemerkung = new java.lang.StringBuilder();
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
			new FieldSpec("medienNummer", 11, 0, "int", null),
			new FieldSpec("medienBezeichnung", 12, 80, "java.lang.String", null),
			new FieldSpec("erstellungsDatum", 13, 0, "java.sql.Date", null),
			new FieldSpec("medienUntertitel", 14, 80, "java.lang.String", null),
			new FieldSpec("medienbeschreibung", 15, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("_090_001_MedienArten_DID", 16, 0, "int",
					new OneObjectPointer(90, 1, "MedienArten", "dID")),
			new FieldSpec("m_090_011_MedienArtBez", 17, 80, "java.lang.String",
					null),
			new FieldSpec("_022_001_Vorgangsverwaltung_DID", 18, 0, "int",
					new OneObjectPointer(22, 1, "Vorgangsverwaltung", "dID")),
			new FieldSpec("m_022_031_VorgangNr", 19, 30, "java.lang.String",
					null),
			new FieldSpec("m_022_011_VorgangKBZ", 20, 80, "java.lang.String",
					null),
			new FieldSpec("_009_001_Adressen_DID", 21, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("m_009_011_Firmenname", 22, 80, "java.lang.String",
					null),
			new FieldSpec("m_009_014_Nachname", 23, 80, "java.lang.String",
					null),
			new FieldSpec("angabe_1", 24, 80, "java.lang.String", null),
			new FieldSpec("angabe_2", 25, 80, "java.lang.String", null),
			new FieldSpec("angabe_3", 26, 80, "java.lang.String", null),
			new FieldSpec("angabe_4", 27, 80, "java.lang.String", null),
			new FieldSpec("angabe_5", 28, 80, "java.lang.String", null),
			new FieldSpec("angabe_6", 29, 80, "java.lang.String", null),
			new FieldSpec("angabe_7", 30, 80, "java.lang.String", null),
			new FieldSpec("angabe_8", 31, 10, "java.lang.String", null),
			new FieldSpec("angabe_9", 32, 80, "java.lang.String", null),
			new FieldSpec("angabe_10", 33, 80, "java.lang.String", null),
			new FieldSpec("dauer", 34, 80, "java.lang.String", null),
			new FieldSpec("archivbezeichnung", 35, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("archivIndex", 36, 80, "java.lang.String", null),
			new FieldSpec("original", 37, 0, "boolean", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 38, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("m_001_021_MitarbeiterKürzel", 39, 5,
					"java.lang.String", null),
			new FieldSpec("prüfdatum", 40, 0, "java.sql.Date", null),
			new FieldSpec("prüfbemerkung", 41, 32768,
					"java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Medien() {
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

	public void setMedienNummer(int inp) {
		medienNummer = inp;
	}

	public int getMedienNummer()

	{
		return medienNummer;
	}

	public void setMedienBezeichnung(java.lang.String inp) {
		medienBezeichnung = inp;
	}

	public java.lang.String getMedienBezeichnung()

	{
		return medienBezeichnung;
	}

	public void setErstellungsDatum(java.sql.Date inp) {
		erstellungsDatum = inp;
	}

	public java.sql.Date getErstellungsDatum()

	{
		return erstellungsDatum;
	}

	public void setMedienUntertitel(java.lang.String inp) {
		medienUntertitel = inp;
	}

	public java.lang.String getMedienUntertitel()

	{
		return medienUntertitel;
	}

	public void setMedienbeschreibung(java.lang.StringBuilder inp) {
		medienbeschreibung = inp;
	}

	public java.lang.StringBuilder getMedienbeschreibung()

	{
		return medienbeschreibung;
	}

	public void set_090_001_MedienArten_DID(int inp) {
		_090_001_MedienArten_DID = inp;
	}

	public int get_090_001_MedienArten_DID()

	{
		return _090_001_MedienArten_DID;
	}

	public void setM_090_011_MedienArtBez(java.lang.String inp) {
		m_090_011_MedienArtBez = inp;
	}

	public java.lang.String getM_090_011_MedienArtBez()

	{
		return m_090_011_MedienArtBez;
	}

	public void set_022_001_Vorgangsverwaltung_DID(int inp) {
		_022_001_Vorgangsverwaltung_DID = inp;
	}

	public int get_022_001_Vorgangsverwaltung_DID()

	{
		return _022_001_Vorgangsverwaltung_DID;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_022_011_VorgangKBZ(java.lang.String inp) {
		m_022_011_VorgangKBZ = inp;
	}

	public java.lang.String getM_022_011_VorgangKBZ()

	{
		return m_022_011_VorgangKBZ;
	}

	public void set_009_001_Adressen_DID(int inp) {
		_009_001_Adressen_DID = inp;
	}

	public int get_009_001_Adressen_DID()

	{
		return _009_001_Adressen_DID;
	}

	public void setM_009_011_Firmenname(java.lang.String inp) {
		m_009_011_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Firmenname()

	{
		return m_009_011_Firmenname;
	}

	public void setM_009_014_Nachname(java.lang.String inp) {
		m_009_014_Nachname = inp;
	}

	public java.lang.String getM_009_014_Nachname()

	{
		return m_009_014_Nachname;
	}

	public void setAngabe_1(java.lang.String inp) {
		angabe_1 = inp;
	}

	public java.lang.String getAngabe_1()

	{
		return angabe_1;
	}

	public void setAngabe_2(java.lang.String inp) {
		angabe_2 = inp;
	}

	public java.lang.String getAngabe_2()

	{
		return angabe_2;
	}

	public void setAngabe_3(java.lang.String inp) {
		angabe_3 = inp;
	}

	public java.lang.String getAngabe_3()

	{
		return angabe_3;
	}

	public void setAngabe_4(java.lang.String inp) {
		angabe_4 = inp;
	}

	public java.lang.String getAngabe_4()

	{
		return angabe_4;
	}

	public void setAngabe_5(java.lang.String inp) {
		angabe_5 = inp;
	}

	public java.lang.String getAngabe_5()

	{
		return angabe_5;
	}

	public void setAngabe_6(java.lang.String inp) {
		angabe_6 = inp;
	}

	public java.lang.String getAngabe_6()

	{
		return angabe_6;
	}

	public void setAngabe_7(java.lang.String inp) {
		angabe_7 = inp;
	}

	public java.lang.String getAngabe_7()

	{
		return angabe_7;
	}

	public void setAngabe_8(java.lang.String inp) {
		angabe_8 = inp;
	}

	public java.lang.String getAngabe_8()

	{
		return angabe_8;
	}

	public void setAngabe_9(java.lang.String inp) {
		angabe_9 = inp;
	}

	public java.lang.String getAngabe_9()

	{
		return angabe_9;
	}

	public void setAngabe_10(java.lang.String inp) {
		angabe_10 = inp;
	}

	public java.lang.String getAngabe_10()

	{
		return angabe_10;
	}

	public void setDauer(java.lang.String inp) {
		dauer = inp;
	}

	public java.lang.String getDauer()

	{
		return dauer;
	}

	public void setArchivbezeichnung(java.lang.StringBuilder inp) {
		archivbezeichnung = inp;
	}

	public java.lang.StringBuilder getArchivbezeichnung()

	{
		return archivbezeichnung;
	}

	public void setArchivIndex(java.lang.String inp) {
		archivIndex = inp;
	}

	public java.lang.String getArchivIndex()

	{
		return archivIndex;
	}

	public void setOriginal(boolean inp) {
		original = inp;
	}

	public boolean getOriginal()

	{
		return original;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setM_001_021_MitarbeiterKürzel(java.lang.String inp) {
		m_001_021_MitarbeiterKürzel = inp;
	}

	public java.lang.String getM_001_021_MitarbeiterKürzel()

	{
		return m_001_021_MitarbeiterKürzel;
	}

	public void setPrüfdatum(java.sql.Date inp) {
		prüfdatum = inp;
	}

	public java.sql.Date getPrüfdatum()

	{
		return prüfdatum;
	}

	public void setPrüfbemerkung(java.lang.StringBuilder inp) {
		prüfbemerkung = inp;
	}

	public java.lang.StringBuilder getPrüfbemerkung()

	{
		return prüfbemerkung;
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
