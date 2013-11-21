/*
 * Lieferpos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 80 mit dem Namen "Lieferpos"
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

public class Lieferpos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Lieferpos";
	public static final int dbTabNummer = 80;
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
	public static int _066_001__Lieferscheine_DID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int menge_Fn = 13;
	public static int posNr_Fn = 14;
	public static int m_032_011_Artikel_Nr_Fn = 15;
	public static int artikelbezeichnung_Fn = 16;
	public static int postext_Fn = 17;
	public static int m_066_011_LieferscheinLfdNr_Fn = 18;
	public static int _022_001_Vorgang_DID_Fn = 19;
	public static int m_022_031_VorgangNr_Fn = 20;
	public static int last_Artikel_DID_Fn = 21;
	public static int m_066_012_LieferscheinDatum_Fn = 22;
	public static int m_066_015_LieferscheinFlag_Fn = 23;
	public static int _065_001_AuftragsPosDID_Fn = 24;
	public static int _062_001_AusRechPosDID_Fn = 25;
	public static int verrechnet_Fn = 26;
	public static int bandKbz_Fn = 27;
	public static int _064_001_Medien_DID_Fn = 28;
	public static int m_064_011_Mediennummer_Fn = 29;
	public static int m_064_012_MedienBez_Fn = 30;
	public static int _089_001_Verkaufsarten_DID_Fn = 31;
	public static int m_089_011_Verkaufsarten_KBZ_Fn = 32;
	public static int eP_netto_Fn;
	public static int eP_brutto_Fn;
	public static int mwst_Satz_Fn;
	public static int gP_netto_Fn;
	public static int gP_brutto_Fn;
	public static int _003_001_Steuersätze_DID_Fn;
	public static int vK_netto_liste_Fn;
	public static int rabatt_Fn;

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
	private int _066_001__Lieferscheine_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private double menge = 0;
	private int posNr = 0;
	private java.lang.String m_032_011_Artikel_Nr = "";
	private java.lang.String artikelbezeichnung = "";
	private java.lang.StringBuilder postext = new java.lang.StringBuilder();
	private int m_066_011_LieferscheinLfdNr = 0;
	private int _022_001_Vorgang_DID = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private int last_Artikel_DID = 0;
	private java.sql.Date m_066_012_LieferscheinDatum = new java.sql.Date(0);
	private boolean m_066_015_LieferscheinFlag = false;
	private int _065_001_AuftragsPosDID = 0;
	private int _062_001_AusRechPosDID = 0;
	private boolean verrechnet = false;
	private java.lang.String bandKbz = "";
	private int _064_001_Medien_DID = 0;
	private int m_064_011_Mediennummer = 0;
	private java.lang.String m_064_012_MedienBez = "";
	private int _089_001_Verkaufsarten_DID = 0;
	private java.lang.String m_089_011_Verkaufsarten_KBZ = "";
	private double eP_netto;
	private double eP_brutto;
	private double mwst_Satz;
	private double gP_netto;
	private double gP_brutto;
	private int _003_001_Steuersätze_DID;
	private double vK_netto_liste;
	private double rabatt;

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
			new FieldSpec("_066_001__Lieferscheine_DID", 11, 0, "int",
					new OneObjectPointer(66, 1, "Lieferscheine", "dID")),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("menge", 13, 0, "double", null),
			new FieldSpec("posNr", 14, 0, "int", null),
			new FieldSpec("m_032_011_Artikel_Nr", 15, 40, "java.lang.String",
					null),
			new FieldSpec("artikelbezeichnung", 16, 80, "java.lang.String",
					null),
			new FieldSpec("postext", 17, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("m_066_011_LieferscheinLfdNr", 18, 0, "int", null),
			new FieldSpec("_022_001_Vorgang_DID", 19, 0, "int",
					new OneObjectPointer(22, 1, "Vorgang", "dID")),
			new FieldSpec("m_022_031_VorgangNr", 20, 30, "java.lang.String",
					null),
			new FieldSpec("last_Artikel_DID", 21, 0, "int", null),
			new FieldSpec("m_066_012_LieferscheinDatum", 22, 0,
					"java.sql.Date", null),
			new FieldSpec("m_066_015_LieferscheinFlag", 23, 0, "boolean", null),
			new FieldSpec("_065_001_AuftragsPosDID", 24, 0, "int",
					new OneObjectPointer(65, 1, "AuftragsPosDID", "")),
			new FieldSpec("_062_001_AusRechPosDID", 25, 0, "int",
					new OneObjectPointer(62, 1, "AusRechPosDID", "")),
			new FieldSpec("verrechnet", 26, 0, "boolean", null),
			new FieldSpec("bandKbz", 27, 80, "java.lang.String", null),
			new FieldSpec("_064_001_Medien_DID", 28, 0, "int",
					new OneObjectPointer(64, 1, "Medien", "dID")),
			new FieldSpec("m_064_011_Mediennummer", 29, 0, "int", null),
			new FieldSpec("m_064_012_MedienBez", 30, 80, "java.lang.String",
					null),
			new FieldSpec("_089_001_Verkaufsarten_DID", 31, 0, "int",
					new OneObjectPointer(89, 1, "Verkaufsarten", "dID")),
			new FieldSpec("m_089_011_Verkaufsarten_KBZ", 32, 80,
					"java.lang.String", null),
			new FieldSpec("eP_netto", 33, 0, "double", null),
			new FieldSpec("eP_brutto", 34, 0, "double", null),
			new FieldSpec("mwst_Satz", 35, 0, "double", null),
			new FieldSpec("gP_netto", 35, 0, "double", null),
			new FieldSpec("gP_brutto", 37, 0, "double", null),
			new FieldSpec("_003_001_Steuersätze_DID", 38, 0, "int", null),
			new FieldSpec("vK_netto_liste", 39, 0, "double", null),
			new FieldSpec("rabatt", 40, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Lieferpos() {
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

	public void set_066_001__Lieferscheine_DID(int inp) {
		_066_001__Lieferscheine_DID = inp;
	}

	public int get_066_001__Lieferscheine_DID()

	{
		return _066_001__Lieferscheine_DID;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setMenge(double inp) {
		menge = inp;
	}

	public double getMenge()

	{
		return menge;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setM_032_011_Artikel_Nr(java.lang.String inp) {
		m_032_011_Artikel_Nr = inp;
	}

	public java.lang.String getM_032_011_Artikel_Nr()

	{
		return m_032_011_Artikel_Nr;
	}

	public void setArtikelbezeichnung(java.lang.String inp) {
		artikelbezeichnung = inp;
	}

	public java.lang.String getArtikelbezeichnung()

	{
		return artikelbezeichnung;
	}

	public void setPostext(java.lang.StringBuilder inp) {
		postext = inp;
	}

	public java.lang.StringBuilder getPostext()

	{
		return postext;
	}

	public void setM_066_011_LieferscheinLfdNr(int inp) {
		m_066_011_LieferscheinLfdNr = inp;
	}

	public int getM_066_011_LieferscheinLfdNr()

	{
		return m_066_011_LieferscheinLfdNr;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setLast_Artikel_DID(int inp) {
		last_Artikel_DID = inp;
	}

	public int getLast_Artikel_DID()

	{
		return last_Artikel_DID;
	}

	public void setM_066_012_LieferscheinDatum(java.sql.Date inp) {
		m_066_012_LieferscheinDatum = inp;
	}

	public java.sql.Date getM_066_012_LieferscheinDatum()

	{
		return m_066_012_LieferscheinDatum;
	}

	public void setM_066_015_LieferscheinFlag(boolean inp) {
		m_066_015_LieferscheinFlag = inp;
	}

	public boolean getM_066_015_LieferscheinFlag()

	{
		return m_066_015_LieferscheinFlag;
	}

	public void set_065_001_AuftragsPosDID(int inp) {
		_065_001_AuftragsPosDID = inp;
	}

	public int get_065_001_AuftragsPosDID()

	{
		return _065_001_AuftragsPosDID;
	}

	public void set_062_001_AusRechPosDID(int inp) {
		_062_001_AusRechPosDID = inp;
	}

	public int get_062_001_AusRechPosDID()

	{
		return _062_001_AusRechPosDID;
	}

	public void setVerrechnet(boolean inp) {
		verrechnet = inp;
	}

	public boolean getVerrechnet()

	{
		return verrechnet;
	}

	public void setBandKbz(java.lang.String inp) {
		bandKbz = inp;
	}

	public java.lang.String getBandKbz()

	{
		return bandKbz;
	}

	public void set_064_001_Medien_DID(int inp) {
		_064_001_Medien_DID = inp;
	}

	public int get_064_001_Medien_DID()

	{
		return _064_001_Medien_DID;
	}

	public void setM_064_011_Mediennummer(int inp) {
		m_064_011_Mediennummer = inp;
	}

	public int getM_064_011_Mediennummer()

	{
		return m_064_011_Mediennummer;
	}

	public void setM_064_012_MedienBez(java.lang.String inp) {
		m_064_012_MedienBez = inp;
	}

	public java.lang.String getM_064_012_MedienBez()

	{
		return m_064_012_MedienBez;
	}

	public void set_089_001_Verkaufsarten_DID(int inp) {
		_089_001_Verkaufsarten_DID = inp;
	}

	public int get_089_001_Verkaufsarten_DID()

	{
		return _089_001_Verkaufsarten_DID;
	}

	public void setM_089_011_Verkaufsarten_KBZ(java.lang.String inp) {
		m_089_011_Verkaufsarten_KBZ = inp;
	}

	public java.lang.String getM_089_011_Verkaufsarten_KBZ()

	{
		return m_089_011_Verkaufsarten_KBZ;
	}

	// generierte getter/setter - Ende

	// Interfaceroutinen

	/**
	 * @return the eP_netto
	 */
	public double getEP_netto() {
		return eP_netto;
	}

	/**
	 * @param eP_netto
	 *            the eP_netto to set
	 */
	public void setEP_netto(double eP_netto) {
		this.eP_netto = eP_netto;
	}

	/**
	 * @return the eP_brutto
	 */
	public double getEP_brutto() {
		return eP_brutto;
	}

	/**
	 * @param eP_brutto
	 *            the eP_brutto to set
	 */
	public void setEP_brutto(double eP_brutto) {
		this.eP_brutto = eP_brutto;
	}

	/**
	 * @return the mwst_Satz
	 */
	public double getMwst_Satz() {
		return mwst_Satz;
	}

	/**
	 * @param mwst_Satz
	 *            the mwst_Satz to set
	 */
	public void setMwst_Satz(double mwst_Satz) {
		this.mwst_Satz = mwst_Satz;
	}

	/**
	 * @return the gP_netto
	 */
	public double getGP_netto() {
		return gP_netto;
	}

	/**
	 * @param gP_netto
	 *            the gP_netto to set
	 */
	public void setGP_netto(double gP_netto) {
		this.gP_netto = gP_netto;
	}

	/**
	 * @return the gP_brutto
	 */
	public double getGP_brutto() {
		return gP_brutto;
	}

	/**
	 * @param gP_brutto
	 *            the gP_brutto to set
	 */
	public void setGP_brutto(double gP_brutto) {
		this.gP_brutto = gP_brutto;
	}

	/**
	 * @return the _003_001_Steuersätze_DID
	 */
	public int get_003_001_Steuersätze_DID() {
		return _003_001_Steuersätze_DID;
	}

	/**
	 * @param _003_001_Steuersätze_DID
	 *            the _003_001_Steuersätze_DID to set
	 */
	public void set_003_001_Steuersätze_DID(int _003_001_Steuersätze_DID) {
		this._003_001_Steuersätze_DID = _003_001_Steuersätze_DID;
	}

	/**
	 * @return the vK_netto_liste
	 */
	public double getVK_netto_liste() {
		return vK_netto_liste;
	}

	/**
	 * @param vK_netto_liste
	 *            the vK_netto_liste to set
	 */
	public void setVK_netto_liste(double vK_netto_liste) {
		this.vK_netto_liste = vK_netto_liste;
	}

	/**
	 * @return the rabatt
	 */
	public double getRabatt() {
		return rabatt;
	}

	/**
	 * @param rabatt
	 *            the rabatt to set
	 */
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}

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
