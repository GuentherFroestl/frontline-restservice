/*
 * ArtikelGruppen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 33 mit dem Namen "ArtikelGruppen"
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

public class ArtikelGruppen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "ArtikelGruppen";
	public static final int dbTabNummer = 33;
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
	public static int _006_001_WEKonto_IL_ID_Fn = 13;
	public static int m_006_011__013_WEKonto_IL_Nr_Fn = 14;
	public static int _006_001_Erlöskonto_IL_ID_Fn = 15;
	public static int m_006_011__015_Erlöskonto_IL_Nr_Fn = 16;
	public static int _006_001_WEKonto_EU_ID_Fn = 17;
	public static int m_006_011__017_WEKonto_EU_Nr_Fn = 18;
	public static int _006_001_Erlöskonto_EU_ID_Fn = 19;
	public static int m_006_011__019_Erlöskonto_EU_Nr_Fn = 20;
	public static int _006_001_WEKonto_RDW_ID_Fn = 21;
	public static int m_006_011__021_WEKonto_RDW_Nr_Fn = 22;
	public static int _006_001_Erlöskonto_RDW_ID_Fn = 23;
	public static int m_006_011__023_Erlöskonto_RDW_N_Fn = 24;
	public static int _015_001__ArtikelKategorie_DID_Fn = 25;
	public static int artikelgruppen_Nr_Fn = 26;
	public static int m_015_011_ArtikelKategorien_KBZ_Fn = 27;
	public static int posNr_Fn = 28;
	public static int inaktiv_Fn = 29;

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
	private int _006_001_WEKonto_IL_ID = 0;
	private int m_006_011__013_WEKonto_IL_Nr = 0;
	private int _006_001_Erlöskonto_IL_ID = 0;
	private int m_006_011__015_Erlöskonto_IL_Nr = 0;
	private int _006_001_WEKonto_EU_ID = 0;
	private int m_006_011__017_WEKonto_EU_Nr = 0;
	private int _006_001_Erlöskonto_EU_ID = 0;
	private int m_006_011__019_Erlöskonto_EU_Nr = 0;
	private int _006_001_WEKonto_RDW_ID = 0;
	private int m_006_011__021_WEKonto_RDW_Nr = 0;
	private int _006_001_Erlöskonto_RDW_ID = 0;
	private int m_006_011__023_Erlöskonto_RDW_N = 0;
	private int _015_001__ArtikelKategorie_DID = 0;
	private int artikelgruppen_Nr = 0;
	private java.lang.String m_015_011_ArtikelKategorien_KBZ = "";
	private int posNr = 0;
	private boolean inaktiv = false;
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
			new FieldSpec("_006_001_WEKonto_IL_ID", 13, 0, "int",
					new OneObjectPointer(6, 1, "WEKonto", "iL_ID")),
			new FieldSpec("m_006_011__013_WEKonto_IL_Nr", 14, 0, "int", null),
			new FieldSpec("_006_001_Erlöskonto_IL_ID", 15, 0, "int",
					new OneObjectPointer(6, 1, "Erlöskonto", "iL_ID")),
			new FieldSpec("m_006_011__015_Erlöskonto_IL_Nr", 16, 0, "int", null),
			new FieldSpec("_006_001_WEKonto_EU_ID", 17, 0, "int",
					new OneObjectPointer(6, 1, "WEKonto", "eU_ID")),
			new FieldSpec("m_006_011__017_WEKonto_EU_Nr", 18, 0, "int", null),
			new FieldSpec("_006_001_Erlöskonto_EU_ID", 19, 0, "int",
					new OneObjectPointer(6, 1, "Erlöskonto", "eU_ID")),
			new FieldSpec("m_006_011__019_Erlöskonto_EU_Nr", 20, 0, "int", null),
			new FieldSpec("_006_001_WEKonto_RDW_ID", 21, 0, "int",
					new OneObjectPointer(6, 1, "WEKonto", "rDW_ID")),
			new FieldSpec("m_006_011__021_WEKonto_RDW_Nr", 22, 0, "int", null),
			new FieldSpec("_006_001_Erlöskonto_RDW_ID", 23, 0, "int",
					new OneObjectPointer(6, 1, "Erlöskonto", "rDW_ID")),
			new FieldSpec("m_006_011__023_Erlöskonto_RDW_N", 24, 0, "int", null),
			new FieldSpec("_015_001__ArtikelKategorie_DID", 25, 0, "int",
					new OneObjectPointer(15, 1, "ArtikelKategorie", "dID")),
			new FieldSpec("artikelgruppen_Nr", 26, 0, "int", null),
			new FieldSpec("m_015_011_ArtikelKategorien_KBZ", 27, 40,
					"java.lang.String", null),
			new FieldSpec("posNr", 28, 0, "int", null),
			new FieldSpec("inaktiv", 29, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public ArtikelGruppen() {
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

	public void set_006_001_WEKonto_IL_ID(int inp) {
		_006_001_WEKonto_IL_ID = inp;
	}

	public int get_006_001_WEKonto_IL_ID()

	{
		return _006_001_WEKonto_IL_ID;
	}

	public void setM_006_011__013_WEKonto_IL_Nr(int inp) {
		m_006_011__013_WEKonto_IL_Nr = inp;
	}

	public int getM_006_011__013_WEKonto_IL_Nr()

	{
		return m_006_011__013_WEKonto_IL_Nr;
	}

	public void set_006_001_Erlöskonto_IL_ID(int inp) {
		_006_001_Erlöskonto_IL_ID = inp;
	}

	public int get_006_001_Erlöskonto_IL_ID()

	{
		return _006_001_Erlöskonto_IL_ID;
	}

	public void setM_006_011__015_Erlöskonto_IL_Nr(int inp) {
		m_006_011__015_Erlöskonto_IL_Nr = inp;
	}

	public int getM_006_011__015_Erlöskonto_IL_Nr()

	{
		return m_006_011__015_Erlöskonto_IL_Nr;
	}

	public void set_006_001_WEKonto_EU_ID(int inp) {
		_006_001_WEKonto_EU_ID = inp;
	}

	public int get_006_001_WEKonto_EU_ID()

	{
		return _006_001_WEKonto_EU_ID;
	}

	public void setM_006_011__017_WEKonto_EU_Nr(int inp) {
		m_006_011__017_WEKonto_EU_Nr = inp;
	}

	public int getM_006_011__017_WEKonto_EU_Nr()

	{
		return m_006_011__017_WEKonto_EU_Nr;
	}

	public void set_006_001_Erlöskonto_EU_ID(int inp) {
		_006_001_Erlöskonto_EU_ID = inp;
	}

	public int get_006_001_Erlöskonto_EU_ID()

	{
		return _006_001_Erlöskonto_EU_ID;
	}

	public void setM_006_011__019_Erlöskonto_EU_Nr(int inp) {
		m_006_011__019_Erlöskonto_EU_Nr = inp;
	}

	public int getM_006_011__019_Erlöskonto_EU_Nr()

	{
		return m_006_011__019_Erlöskonto_EU_Nr;
	}

	public void set_006_001_WEKonto_RDW_ID(int inp) {
		_006_001_WEKonto_RDW_ID = inp;
	}

	public int get_006_001_WEKonto_RDW_ID()

	{
		return _006_001_WEKonto_RDW_ID;
	}

	public void setM_006_011__021_WEKonto_RDW_Nr(int inp) {
		m_006_011__021_WEKonto_RDW_Nr = inp;
	}

	public int getM_006_011__021_WEKonto_RDW_Nr()

	{
		return m_006_011__021_WEKonto_RDW_Nr;
	}

	public void set_006_001_Erlöskonto_RDW_ID(int inp) {
		_006_001_Erlöskonto_RDW_ID = inp;
	}

	public int get_006_001_Erlöskonto_RDW_ID()

	{
		return _006_001_Erlöskonto_RDW_ID;
	}

	public void setM_006_011__023_Erlöskonto_RDW_N(int inp) {
		m_006_011__023_Erlöskonto_RDW_N = inp;
	}

	public int getM_006_011__023_Erlöskonto_RDW_N()

	{
		return m_006_011__023_Erlöskonto_RDW_N;
	}

	public void set_015_001__ArtikelKategorie_DID(int inp) {
		_015_001__ArtikelKategorie_DID = inp;
	}

	public int get_015_001__ArtikelKategorie_DID()

	{
		return _015_001__ArtikelKategorie_DID;
	}

	public void setArtikelgruppen_Nr(int inp) {
		artikelgruppen_Nr = inp;
	}

	public int getArtikelgruppen_Nr()

	{
		return artikelgruppen_Nr;
	}

	public void setM_015_011_ArtikelKategorien_KBZ(java.lang.String inp) {
		m_015_011_ArtikelKategorien_KBZ = inp;
	}

	public java.lang.String getM_015_011_ArtikelKategorien_KBZ()

	{
		return m_015_011_ArtikelKategorien_KBZ;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setInaktiv(boolean inp) {
		inaktiv = inp;
	}

	public boolean getInaktiv()

	{
		return inaktiv;
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
