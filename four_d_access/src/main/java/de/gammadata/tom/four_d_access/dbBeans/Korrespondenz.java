/*
 * Korrespondenz.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 11 mit dem Namen "Korrespondenz"
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

public class Korrespondenz extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Korrespondenz";
	public static final int dbTabNummer = 11;
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
	public static int _009_001__Adressen_DID_Fn = 11;
	public static int datum_Fn = 12;
	public static int _001_001_Mitarbeiter_DID_Fn = 13;
	public static int blob__Fn = 14;
	public static int betreff_Fn = 15;
	public static int versandart_Fn = 16;
	public static int _035_001_WriteVorlagen_Fn = 17;
	public static int text_Fn = 18;
	public static int _022_001_Vorgangsverwaltung_DID_Fn = 19;
	public static int _068_001_Kunden_DID_Fn = 20;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 21;
	public static int m_022_031_VorgangNr_Fn = 22;
	public static int m_068_011_KundenNr_Fn = 23;
	public static int writeDocDID_Fn = 24;
	public static int m_009_011_Firmenname_Fn = 25;
	public static int m_009_014_Nachname_Fn = 26;
	public static int versandartTyp_Fn = 27;
	public static int _060_001_LieferantenDID_Fn = 28;

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
	private int _009_001__Adressen_DID = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private int _001_001_Mitarbeiter_DID = 0;
	private byte[] blob_ = new byte[0];
	private java.lang.String betreff = "";
	private java.lang.String versandart = "";
	private int _035_001_WriteVorlagen = 0;
	private java.lang.StringBuilder text = new java.lang.StringBuilder();
	private int _022_001_Vorgangsverwaltung_DID = 0;
	private int _068_001_Kunden_DID = 0;
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private java.lang.String m_022_031_VorgangNr = "";
	private int m_068_011_KundenNr = 0;
	private int writeDocDID = 0;
	private java.lang.String m_009_011_Firmenname = "";
	private java.lang.String m_009_014_Nachname = "";
	private int versandartTyp = 0;
	private int _060_001_LieferantenDID = 0;
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
			new FieldSpec("_009_001__Adressen_DID", 11, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID")),
			new FieldSpec("datum", 12, 0, "java.sql.Date", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 13, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("blob_", 14, 0, "byte[]", null),
			new FieldSpec("betreff", 15, 80, "java.lang.String", null),
			new FieldSpec("versandart", 16, 20, "java.lang.String", null),
			new FieldSpec("_035_001_WriteVorlagen", 17, 0, "int",
					new OneObjectPointer(35, 1, "WriteVorlagen", "")),
			new FieldSpec("text", 18, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("_022_001_Vorgangsverwaltung_DID", 19, 0, "int",
					new OneObjectPointer(22, 1, "Vorgangsverwaltung", "dID")),
			new FieldSpec("_068_001_Kunden_DID", 20, 0, "int",
					new OneObjectPointer(68, 1, "Kunden", "dID")),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 21, 5,
					"java.lang.String", null),
			new FieldSpec("m_022_031_VorgangNr", 22, 30, "java.lang.String",
					null),
			new FieldSpec("m_068_011_KundenNr", 23, 0, "int", null),
			new FieldSpec("writeDocDID", 24, 0, "int", null),
			new FieldSpec("m_009_011_Firmenname", 25, 50, "java.lang.String",
					null),
			new FieldSpec("m_009_014_Nachname", 26, 40, "java.lang.String",
					null),
			new FieldSpec("versandartTyp", 27, 0, "int", null),
			new FieldSpec("_060_001_LieferantenDID", 28, 0, "int",
					new OneObjectPointer(60, 1, "Lieferanten", "dID")) };

	// generierte Feldkonstanten - Ende

	public Korrespondenz() {
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

	public void set_009_001__Adressen_DID(int inp) {
		_009_001__Adressen_DID = inp;
	}

	public int get_009_001__Adressen_DID()

	{
		return _009_001__Adressen_DID;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setBlob_(byte[] inp) {
		blob_ = inp;
	}

	public byte[] getBlob_()

	{
		return blob_;
	}

	public void setBetreff(java.lang.String inp) {
		betreff = inp;
	}

	public java.lang.String getBetreff()

	{
		return betreff;
	}

	public void setVersandart(java.lang.String inp) {
		versandart = inp;
	}

	public java.lang.String getVersandart()

	{
		return versandart;
	}

	public void set_035_001_WriteVorlagen(int inp) {
		_035_001_WriteVorlagen = inp;
	}

	public int get_035_001_WriteVorlagen()

	{
		return _035_001_WriteVorlagen;
	}

	public void setText(java.lang.StringBuilder inp) {
		text = inp;
	}

	public java.lang.StringBuilder getText()

	{
		return text;
	}

	public void set_022_001_Vorgangsverwaltung_DID(int inp) {
		_022_001_Vorgangsverwaltung_DID = inp;
	}

	public int get_022_001_Vorgangsverwaltung_DID()

	{
		return _022_001_Vorgangsverwaltung_DID;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setWriteDocDID(int inp) {
		writeDocDID = inp;
	}

	public int getWriteDocDID()

	{
		return writeDocDID;
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

	public void setVersandartTyp(int inp) {
		versandartTyp = inp;
	}

	public int getVersandartTyp()

	{
		return versandartTyp;
	}

	public void set_060_001_LieferantenDID(int inp) {
		_060_001_LieferantenDID = inp;
	}

	public int get_060_001_LieferantenDID()

	{
		return _060_001_LieferantenDID;
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
