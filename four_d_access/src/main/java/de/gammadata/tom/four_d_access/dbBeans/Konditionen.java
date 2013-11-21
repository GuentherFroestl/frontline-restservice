/*
 * Konditionen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 7 mit dem Namen "Konditionen"
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

public class Konditionen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Konditionen";
	public static final int dbTabNummer = 7;
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
	public static int _068_001__Kunden_DID_Fn = 11;
	public static int aufschlag_Fremdkosten_Fn = 12;
	public static int aufschlag_Fremdkosten_EK_Fn = 13;
	public static int m_068_026_M_009_011_AdrName_Fn = 14;
	public static int rabatt_VK_Fn = 15;
	public static int gruppenbezogen_Fn = 16;
	public static int _033_001_ArtikelGruppen_DID_Fn = 17;
	public static int m_068_011_KundenNr_Fn = 18;
	public static int aufschlag_EK_Fn = 19;
	public static int _032_001_Artikel_DID_Fn = 20;
	public static int internetkondition_Fn = 21;
	public static int leer1_Fn = 22;
	public static int min_Abnahmemenge_Fn = 23;
	public static int min_Abnahmebetrag_Fn = 24;
	public static int _005_001_Währungen_DID_Fn = 25;
	public static int artikelbezogen_Fn = 26;
	public static int f_alle_KND_Fn = 27;
	public static int m_032_011_ArtikelNr_Fn = 28;
	public static int m_032_012_ArtikelKBZ_Fn = 29;
	public static int m_033_011_ArtGrp_Bez_Fn = 30;
	public static int sonderaktion_Fn = 31;
	public static int startDatum_Fn = 32;
	public static int enddatum_Fn = 33;
	public static int m_005_011_Währungszeichen_Fn = 34;
	public static int m_032_019_VK1_Fn = 35;
	public static int m_032_023_EK1_Fn = 36;

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
	private int _068_001__Kunden_DID = 0;
	private boolean aufschlag_Fremdkosten = false;
	private double aufschlag_Fremdkosten_EK = 0;
	private java.lang.String m_068_026_M_009_011_AdrName = "";
	private double rabatt_VK = 0;
	private boolean gruppenbezogen = false;
	private int _033_001_ArtikelGruppen_DID = 0;
	private int m_068_011_KundenNr = 0;
	private double aufschlag_EK = 0;
	private int _032_001_Artikel_DID = 0;
	private boolean internetkondition = false;
	private boolean leer1 = false;
	private double min_Abnahmemenge = 0;
	private double min_Abnahmebetrag = 0;
	private int _005_001_Währungen_DID = 0;
	private boolean artikelbezogen = false;
	private boolean f_alle_KND = false;
	private java.lang.String m_032_011_ArtikelNr = "";
	private java.lang.String m_032_012_ArtikelKBZ = "";
	private java.lang.String m_033_011_ArtGrp_Bez = "";
	private boolean sonderaktion = false;
	private java.sql.Date startDatum = new java.sql.Date(0);
	private java.sql.Date enddatum = new java.sql.Date(0);
	private java.lang.String m_005_011_Währungszeichen = "";
	private double m_032_019_VK1 = 0;
	private double m_032_023_EK1 = 0;
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
			new FieldSpec("_068_001__Kunden_DID", 11, 0, "int",
					new OneObjectPointer(68, 1, "Kunden", "dID")),
			new FieldSpec("aufschlag_Fremdkosten", 12, 0, "boolean", null),
			new FieldSpec("aufschlag_Fremdkosten_EK", 13, 0, "double", null),
			new FieldSpec("m_068_026_M_009_011_AdrName", 14, 50,
					"java.lang.String", null),
			new FieldSpec("rabatt_VK", 15, 0, "double", null),
			new FieldSpec("gruppenbezogen", 16, 0, "boolean", null),
			new FieldSpec("_033_001_ArtikelGruppen_DID", 17, 0, "int",
					new OneObjectPointer(33, 1, "ArtikelGruppen", "dID")),
			new FieldSpec("m_068_011_KundenNr", 18, 0, "int", null),
			new FieldSpec("aufschlag_EK", 19, 0, "double", null),
			new FieldSpec("_032_001_Artikel_DID", 20, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("internetkondition", 21, 0, "boolean", null),
			new FieldSpec("leer1", 22, 0, "boolean", null),
			new FieldSpec("min_Abnahmemenge", 23, 0, "double", null),
			new FieldSpec("min_Abnahmebetrag", 24, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 25, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("artikelbezogen", 26, 0, "boolean", null),
			new FieldSpec("f_alle_KND", 27, 0, "boolean", null),
			new FieldSpec("m_032_011_ArtikelNr", 28, 40, "java.lang.String",
					null),
			new FieldSpec("m_032_012_ArtikelKBZ", 29, 80, "java.lang.String",
					null),
			new FieldSpec("m_033_011_ArtGrp_Bez", 30, 40, "java.lang.String",
					null),
			new FieldSpec("sonderaktion", 31, 0, "boolean", null),
			new FieldSpec("startDatum", 32, 0, "java.sql.Date", null),
			new FieldSpec("enddatum", 33, 0, "java.sql.Date", null),
			new FieldSpec("m_005_011_Währungszeichen", 34, 5,
					"java.lang.String", null),
			new FieldSpec("m_032_019_VK1", 35, 0, "double", null),
			new FieldSpec("m_032_023_EK1", 36, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Konditionen() {
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

	public void set_068_001__Kunden_DID(int inp) {
		_068_001__Kunden_DID = inp;
	}

	public int get_068_001__Kunden_DID()

	{
		return _068_001__Kunden_DID;
	}

	public void setAufschlag_Fremdkosten(boolean inp) {
		aufschlag_Fremdkosten = inp;
	}

	public boolean getAufschlag_Fremdkosten()

	{
		return aufschlag_Fremdkosten;
	}

	public void setAufschlag_Fremdkosten_EK(double inp) {
		aufschlag_Fremdkosten_EK = inp;
	}

	public double getAufschlag_Fremdkosten_EK()

	{
		return aufschlag_Fremdkosten_EK;
	}

	public void setM_068_026_M_009_011_AdrName(java.lang.String inp) {
		m_068_026_M_009_011_AdrName = inp;
	}

	public java.lang.String getM_068_026_M_009_011_AdrName()

	{
		return m_068_026_M_009_011_AdrName;
	}

	public void setRabatt_VK(double inp) {
		rabatt_VK = inp;
	}

	public double getRabatt_VK()

	{
		return rabatt_VK;
	}

	public void setGruppenbezogen(boolean inp) {
		gruppenbezogen = inp;
	}

	public boolean getGruppenbezogen()

	{
		return gruppenbezogen;
	}

	public void set_033_001_ArtikelGruppen_DID(int inp) {
		_033_001_ArtikelGruppen_DID = inp;
	}

	public int get_033_001_ArtikelGruppen_DID()

	{
		return _033_001_ArtikelGruppen_DID;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setAufschlag_EK(double inp) {
		aufschlag_EK = inp;
	}

	public double getAufschlag_EK()

	{
		return aufschlag_EK;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setInternetkondition(boolean inp) {
		internetkondition = inp;
	}

	public boolean getInternetkondition()

	{
		return internetkondition;
	}

	public void setLeer1(boolean inp) {
		leer1 = inp;
	}

	public boolean getLeer1()

	{
		return leer1;
	}

	public void setMin_Abnahmemenge(double inp) {
		min_Abnahmemenge = inp;
	}

	public double getMin_Abnahmemenge()

	{
		return min_Abnahmemenge;
	}

	public void setMin_Abnahmebetrag(double inp) {
		min_Abnahmebetrag = inp;
	}

	public double getMin_Abnahmebetrag()

	{
		return min_Abnahmebetrag;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setArtikelbezogen(boolean inp) {
		artikelbezogen = inp;
	}

	public boolean getArtikelbezogen()

	{
		return artikelbezogen;
	}

	public void setF_alle_KND(boolean inp) {
		f_alle_KND = inp;
	}

	public boolean getF_alle_KND()

	{
		return f_alle_KND;
	}

	public void setM_032_011_ArtikelNr(java.lang.String inp) {
		m_032_011_ArtikelNr = inp;
	}

	public java.lang.String getM_032_011_ArtikelNr()

	{
		return m_032_011_ArtikelNr;
	}

	public void setM_032_012_ArtikelKBZ(java.lang.String inp) {
		m_032_012_ArtikelKBZ = inp;
	}

	public java.lang.String getM_032_012_ArtikelKBZ()

	{
		return m_032_012_ArtikelKBZ;
	}

	public void setM_033_011_ArtGrp_Bez(java.lang.String inp) {
		m_033_011_ArtGrp_Bez = inp;
	}

	public java.lang.String getM_033_011_ArtGrp_Bez()

	{
		return m_033_011_ArtGrp_Bez;
	}

	public void setSonderaktion(boolean inp) {
		sonderaktion = inp;
	}

	public boolean getSonderaktion()

	{
		return sonderaktion;
	}

	public void setStartDatum(java.sql.Date inp) {
		startDatum = inp;
	}

	public java.sql.Date getStartDatum()

	{
		return startDatum;
	}

	public void setEnddatum(java.sql.Date inp) {
		enddatum = inp;
	}

	public java.sql.Date getEnddatum()

	{
		return enddatum;
	}

	public void setM_005_011_Währungszeichen(java.lang.String inp) {
		m_005_011_Währungszeichen = inp;
	}

	public java.lang.String getM_005_011_Währungszeichen()

	{
		return m_005_011_Währungszeichen;
	}

	public void setM_032_019_VK1(double inp) {
		m_032_019_VK1 = inp;
	}

	public double getM_032_019_VK1()

	{
		return m_032_019_VK1;
	}

	public void setM_032_023_EK1(double inp) {
		m_032_023_EK1 = inp;
	}

	public double getM_032_023_EK1()

	{
		return m_032_023_EK1;
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
