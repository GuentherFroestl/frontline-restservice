/*
 * MediaAssetLabel.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 31 mit dem Namen "MediaAssetLabel"
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

public class MediaAssetLabel extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MediaAssetLabel";
	public static final int dbTabNummer = 31;
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
	public static int contentTitel_Fn = 11;
	public static int contentbeschreibung_Fn = 12;
	public static int angabe_1_Fn = 13;
	public static int angabe_2_Fn = 14;
	public static int angabe_3_Fn = 15;
	public static int _101_001_MediaTypen_DID_Fn = 16;
	public static int _009_001_Adressen_DID_Author_Fn = 17;
	public static int _009_001_Adressen_DID_Copyright_Fn = 18;
	public static int _022_001_VorgangsDID_Fn = 19;
	public static int m_009_013__017_Adressen_Vorname_Fn = 20;
	public static int m_009_014__017_Adressen_Nachnam_Fn = 21;
	public static int m_022_031_VorgangsNr_Fn = 22;
	public static int m_022_011_VorgangsKBZ_Fn = 23;
	public static int m_0101_011_MediaTypenBez_Fn = 24;
	public static int erstveröffentlichung_Fn = 25;
	public static int _068_001_KundenDID_Fn = 26;
	public static int archiv_Fn = 27;
	public static int archivierungsdatum_Fn = 28;
	public static int _039_001_CoverFileDID_Fn = 29;
	public static int xmlData_Fn = 30;

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
	private java.lang.String contentTitel = "";
	private java.lang.StringBuilder contentbeschreibung = new java.lang.StringBuilder();
	private java.lang.String angabe_1 = "";
	private java.lang.String angabe_2 = "";
	private java.lang.String angabe_3 = "";
	private int _101_001_MediaTypen_DID = 0;
	private int _009_001_Adressen_DID_Author = 0;
	private int _009_001_Adressen_DID_Copyright = 0;
	private int _022_001_VorgangsDID = 0;
	private java.lang.String m_009_013__017_Adressen_Vorname = "";
	private java.lang.String m_009_014__017_Adressen_Nachnam = "";
	private java.lang.String m_022_031_VorgangsNr = "";
	private java.lang.String m_022_011_VorgangsKBZ = "";
	private java.lang.String m_0101_011_MediaTypenBez = "";
	private java.sql.Date erstveröffentlichung = new java.sql.Date(0);
	private int _068_001_KundenDID = 0;
	private java.lang.String archiv = "";
	private java.sql.Date archivierungsdatum = new java.sql.Date(0);
	private int _039_001_CoverFileDID = 0;
	private java.lang.StringBuilder xmlData = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "contentTitel", "contentbeschreibung",
			"angabe_1", "angabe_2", "angabe_3", "_101_001_MediaTypen_DID",
			"_009_001_Adressen_DID_Author", "_009_001_Adressen_DID_Copyright",
			"_022_001_VorgangsDID", "m_009_013__017_Adressen_Vorname",
			"m_009_014__017_Adressen_Nachnam", "m_022_031_VorgangsNr",
			"m_022_011_VorgangsKBZ", "m_0101_011_MediaTypenBez",
			"erstveröffentlichung", "_068_001_KundenDID", "archiv",
			"archivierungsdatum", "_039_001_CoverFileDID", "xmlData" };
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
			new FieldSpec("contentTitel", 11, 80, "java.lang.String", null),
			new FieldSpec("contentbeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("angabe_1", 13, 80, "java.lang.String", null),
			new FieldSpec("angabe_2", 14, 80, "java.lang.String", null),
			new FieldSpec("angabe_3", 15, 80, "java.lang.String", null),
			new FieldSpec("_101_001_MediaTypen_DID", 16, 0, "int",
					new OneObjectPointer(101, 1, "MediaTypen", "dID")),
			new FieldSpec("_009_001_Adressen_DID_Author", 17, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_Author")),
			new FieldSpec("_009_001_Adressen_DID_Copyright", 18, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "dID_Copyright")),
			new FieldSpec("_022_001_VorgangsDID", 19, 0, "int",
					new OneObjectPointer(22, 1, "VorgangsDID", "")),
			new FieldSpec("m_009_013__017_Adressen_Vorname", 20, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_014__017_Adressen_Nachnam", 21, 60,
					"java.lang.String", null),
			new FieldSpec("m_022_031_VorgangsNr", 22, 20, "java.lang.String",
					null),
			new FieldSpec("m_022_011_VorgangsKBZ", 23, 65, "java.lang.String",
					null),
			new FieldSpec("m_0101_011_MediaTypenBez", 24, 40,
					"java.lang.String", null),
			new FieldSpec("erstveröffentlichung", 25, 0, "java.sql.Date", null),
			new FieldSpec("_068_001_KundenDID", 26, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("archiv", 27, 80, "java.lang.String", null),
			new FieldSpec("archivierungsdatum", 28, 0, "java.sql.Date", null),
			new FieldSpec("_039_001_CoverFileDID", 29, 0, "int",
					new OneObjectPointer(39, 1, "CoverFileDID", "")),
			new FieldSpec("xmlData", 30, 32768, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public MediaAssetLabel() {
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

	public void setContentTitel(java.lang.String inp) {
		contentTitel = inp;
	}

	public java.lang.String getContentTitel()

	{
		return contentTitel;
	}

	public void setContentbeschreibung(java.lang.StringBuilder inp) {
		contentbeschreibung = inp;
	}

	public java.lang.StringBuilder getContentbeschreibung()

	{
		return contentbeschreibung;
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

	public void set_101_001_MediaTypen_DID(int inp) {
		_101_001_MediaTypen_DID = inp;
	}

	public int get_101_001_MediaTypen_DID()

	{
		return _101_001_MediaTypen_DID;
	}

	public void set_009_001_Adressen_DID_Author(int inp) {
		_009_001_Adressen_DID_Author = inp;
	}

	public int get_009_001_Adressen_DID_Author()

	{
		return _009_001_Adressen_DID_Author;
	}

	public void set_009_001_Adressen_DID_Copyright(int inp) {
		_009_001_Adressen_DID_Copyright = inp;
	}

	public int get_009_001_Adressen_DID_Copyright()

	{
		return _009_001_Adressen_DID_Copyright;
	}

	public void set_022_001_VorgangsDID(int inp) {
		_022_001_VorgangsDID = inp;
	}

	public int get_022_001_VorgangsDID()

	{
		return _022_001_VorgangsDID;
	}

	public void setM_009_013__017_Adressen_Vorname(java.lang.String inp) {
		m_009_013__017_Adressen_Vorname = inp;
	}

	public java.lang.String getM_009_013__017_Adressen_Vorname()

	{
		return m_009_013__017_Adressen_Vorname;
	}

	public void setM_009_014__017_Adressen_Nachnam(java.lang.String inp) {
		m_009_014__017_Adressen_Nachnam = inp;
	}

	public java.lang.String getM_009_014__017_Adressen_Nachnam()

	{
		return m_009_014__017_Adressen_Nachnam;
	}

	public void setM_022_031_VorgangsNr(java.lang.String inp) {
		m_022_031_VorgangsNr = inp;
	}

	public java.lang.String getM_022_031_VorgangsNr()

	{
		return m_022_031_VorgangsNr;
	}

	public void setM_022_011_VorgangsKBZ(java.lang.String inp) {
		m_022_011_VorgangsKBZ = inp;
	}

	public java.lang.String getM_022_011_VorgangsKBZ()

	{
		return m_022_011_VorgangsKBZ;
	}

	public void setM_0101_011_MediaTypenBez(java.lang.String inp) {
		m_0101_011_MediaTypenBez = inp;
	}

	public java.lang.String getM_0101_011_MediaTypenBez()

	{
		return m_0101_011_MediaTypenBez;
	}

	public void setErstveröffentlichung(java.sql.Date inp) {
		erstveröffentlichung = inp;
	}

	public java.sql.Date getErstveröffentlichung()

	{
		return erstveröffentlichung;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void setArchiv(java.lang.String inp) {
		archiv = inp;
	}

	public java.lang.String getArchiv()

	{
		return archiv;
	}

	public void setArchivierungsdatum(java.sql.Date inp) {
		archivierungsdatum = inp;
	}

	public java.sql.Date getArchivierungsdatum()

	{
		return archivierungsdatum;
	}

	public void set_039_001_CoverFileDID(int inp) {
		_039_001_CoverFileDID = inp;
	}

	public int get_039_001_CoverFileDID()

	{
		return _039_001_CoverFileDID;
	}

	public void setXmlData(java.lang.StringBuilder inp) {
		xmlData = inp;
	}

	public java.lang.StringBuilder getXmlData()

	{
		return xmlData;
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
