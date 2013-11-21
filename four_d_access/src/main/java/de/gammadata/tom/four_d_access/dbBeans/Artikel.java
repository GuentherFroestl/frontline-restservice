/*
 * Artikel.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 32 mit dem Namen "Artikel"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Artikel extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Artikel";
	public static final int dbTabNummer = 32;
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
	public static int artikelNr_Fn = 11;
	public static int kurzbeschreibung_Fn = 12;
	public static int beschreibung_Fn = 13;
	public static int internetAktiv_Fn = 14;
	public static int eK_Fn = 15;
	public static int m_078_011_Einheit_Fn = 16;
	public static int inAktiv_Fn = 17;
	public static int _033_001__ArtikelGruppen_DID_Fn = 18;
	public static int vK1_Fn = 19;
	public static int vK2_Fn = 20;
	public static int vK3_Fn = 21;
	public static int vK4_Fn = 22;
	public static int eK1_Fn = 23;
	public static int eK2_Fn = 24;
	public static int eK3_Fn = 25;
	public static int posNr_Fn = 26;
	public static int fixKosten_Fn = 27;
	public static int gewicht_Fn = 28;
	public static int intrastatNr_Fn = 29;
	public static int verkauf90Tg_Fn = 30;
	public static int verkauf365Tg_Fn = 31;
	public static int markup_Fn = 32;
	public static int verpackungseinheit_Fn = 33;
	public static int _003_001_Steuersätze_DID_Fn = 34;
	public static int _005_001_Währungen_DID_Fn = 35;
	public static int m_005_011_Währungen_Zeichen_Fn = 36;
	public static int m_033_026_ArtikelGruppen_Nr_Fn = 37;
	public static int m_033_011_ArtikelGruppen_KBZ_Fn = 38;
	public static int m_033_027_ArtikelGrp_Kategorie_Fn = 39;
	public static int ref_Bez_Fn = 40;
	public static int lagerbestand_Fn = 41;
	public static int m_003_012__034_Steuersatz_IL_Fn = 42;
	public static int _078_001__Einheiten_DID_Fn = 43;
	public static int fremdleistung_Fn = 44;
	public static int _064_001_Medien_DID_Fn = 45;
	public static int uSP_Handel_Fn = 46;
	public static int binding_Fn = 47;
	public static int veroeffentlichung_Fn = 48;
	public static int auflageNr_Fn = 49;
	public static int seiten_Fn = 50;
	public static int uSP_Endkunde_Fn = 51;
	public static int image_dropped_Fn = 52;
	public static int bestandDatum_Fn = 53;
	public static int bestandZeit_Fn = 54;
	public static int eANCode_Fn = 55;
	public static int m_064_011_MedienNummer_Fn = 56;
	public static int titel_Fn = 57;
	public static int untertitel_Fn = 58;
	public static int autoren_Fn = 59;
	public static int Ausführung_Fn = 60;
	public static int cover_Fn = 61;
	public static int Überzug_Fn = 62;
	public static int kapitalband_Fn = 63;
	public static int schutzumschlag_Fn = 64;
	public static int leseband_Fn = 65;
	public static int Rückenprägung_Fn = 66;
	public static int kern_Fn = 67;
	public static int format_Fn = 68;

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
	private java.lang.String artikelNr = "";
	private java.lang.String kurzbeschreibung = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private boolean internetAktiv = false;
	private boolean eK = false;
	private java.lang.String m_078_011_Einheit = "";
	private boolean inAktiv = false;
	private int _033_001__ArtikelGruppen_DID = 0;
	private double vK1 = 0;
	private double vK2 = 0;
	private double vK3 = 0;
	private double vK4 = 0;
	private double eK1 = 0;
	private double eK2 = 0;
	private double eK3 = 0;
	private int posNr = 0;
	private boolean fixKosten = false;
	private double gewicht = 0;
	private java.lang.String intrastatNr = "";
	private double verkauf90Tg = 0;
	private double verkauf365Tg = 0;
	private double markup = 0;
	private double verpackungseinheit = 0;
	private int _003_001_Steuersätze_DID = 0;
	private int _005_001_Währungen_DID = 0;
	private java.lang.String m_005_011_Währungen_Zeichen = "";
	private int m_033_026_ArtikelGruppen_Nr = 0;
	private java.lang.String m_033_011_ArtikelGruppen_KBZ = "";
	private java.lang.String m_033_027_ArtikelGrp_Kategorie = "";
	private java.lang.String ref_Bez = "";
	private double lagerbestand = 0;
	private double m_003_012__034_Steuersatz_IL = 0;
	private int _078_001__Einheiten_DID = 0;
	private boolean fremdleistung = false;
	private int _064_001_Medien_DID = 0;
	private java.lang.StringBuilder uSP_Handel = new java.lang.StringBuilder();
	private java.lang.String binding = "";
	private java.sql.Date veroeffentlichung = new java.sql.Date(0);
	private int auflageNr = 0;
	private int seiten = 0;
	private java.lang.StringBuilder uSP_Endkunde = new java.lang.StringBuilder();
	private byte[] image_dropped = new byte[0];
	private java.sql.Date bestandDatum = new java.sql.Date(0);
	private java.sql.Time bestandZeit = new java.sql.Time(0);
	private java.lang.String eANCode = "";
	private int m_064_011_MedienNummer = 0;
	private java.lang.String titel = "";
	private java.lang.String untertitel = "";
	private java.lang.String autoren = "";
	private java.lang.String Ausführung = "";
	private java.lang.String cover = "";
	private java.lang.String Überzug = "";
	private java.lang.String kapitalband = "";
	private java.lang.String schutzumschlag = "";
	private java.lang.String leseband = "";
	private java.lang.String Rückenprägung = "";
	private java.lang.String kern = "";
	private java.lang.String format = "";
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
			new FieldSpec("artikelNr", 11, 40, "java.lang.String", null),
			new FieldSpec("kurzbeschreibung", 12, 80, "java.lang.String", null),
			new FieldSpec("beschreibung", 13, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("internetAktiv", 14, 0, "boolean", null),
			new FieldSpec("eK", 15, 0, "boolean", null),
			new FieldSpec("m_078_011_Einheit", 16, 20, "java.lang.String", null),
			new FieldSpec("inAktiv", 17, 0, "boolean", null),
			new FieldSpec("_033_001__ArtikelGruppen_DID", 18, 0, "int", null),
			new FieldSpec("vK1", 19, 0, "double", null),
			new FieldSpec("vK2", 20, 0, "double", null),
			new FieldSpec("vK3", 21, 0, "double", null),
			new FieldSpec("vK4", 22, 0, "double", null),
			new FieldSpec("eK1", 23, 0, "double", null),
			new FieldSpec("eK2", 24, 0, "double", null),
			new FieldSpec("eK3", 25, 0, "double", null),
			new FieldSpec("posNr", 26, 0, "int", null),
			new FieldSpec("fixKosten", 27, 0, "boolean", null),
			new FieldSpec("gewicht", 28, 0, "double", null),
			new FieldSpec("intrastatNr", 29, 40, "java.lang.String", null),
			new FieldSpec("verkauf90Tg", 30, 0, "double", null),
			new FieldSpec("verkauf365Tg", 31, 0, "double", null),
			new FieldSpec("markup", 32, 0, "double", null),
			new FieldSpec("verpackungseinheit", 33, 0, "double", null),
			new FieldSpec("_003_001_Steuersätze_DID", 34, 0, "int", null),
			new FieldSpec("_005_001_Währungen_DID", 35, 0, "int", null),
			new FieldSpec("m_005_011_Währungen_Zeichen", 36, 5,
					"java.lang.String", null),
			new FieldSpec("m_033_026_ArtikelGruppen_Nr", 37, 0, "int", null),
			new FieldSpec("m_033_011_ArtikelGruppen_KBZ", 38, 40,
					"java.lang.String", null),
			new FieldSpec("m_033_027_ArtikelGrp_Kategorie", 39, 40,
					"java.lang.String", null),
			new FieldSpec("ref_Bez", 40, 80, "java.lang.String", null),
			new FieldSpec("lagerbestand", 41, 0, "double", null),
			new FieldSpec("m_003_012__034_Steuersatz_IL", 42, 0, "double", null),
			new FieldSpec("_078_001__Einheiten_DID", 43, 0, "int", null),
			new FieldSpec("fremdleistung", 44, 0, "boolean", null),
			new FieldSpec("_064_001_Medien_DID", 45, 0, "int", null),
			new FieldSpec("uSP_Handel", 46, 0, "java.lang.StringBuilder", null),
			new FieldSpec("binding", 47, 80, "java.lang.String", null),
			new FieldSpec("veroeffentlichung", 48, 0, "java.sql.Date", null),
			new FieldSpec("auflageNr", 49, 0, "int", null),
			new FieldSpec("seiten", 50, 0, "int", null),
			new FieldSpec("uSP_Endkunde", 51, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("image_dropped", 52, 0, "byte[]", null),
			new FieldSpec("bestandDatum", 53, 0, "java.sql.Date", null),
			new FieldSpec("bestandZeit", 54, 0, "java.sql.Time", null),
			new FieldSpec("eANCode", 55, 40, "java.lang.String", null),
			new FieldSpec("m_064_011_MedienNummer", 56, 0, "int", null),
			new FieldSpec("titel", 57, 80, "java.lang.String", null),
			new FieldSpec("untertitel", 58, 80, "java.lang.String", null),
			new FieldSpec("autoren", 59, 80, "java.lang.String", null),
			new FieldSpec("Ausführung", 60, 80, "java.lang.String", null),
			new FieldSpec("cover", 61, 80, "java.lang.String", null),
			new FieldSpec("Überzug", 62, 80, "java.lang.String", null),
			new FieldSpec("kapitalband", 63, 80, "java.lang.String", null),
			new FieldSpec("schutzumschlag", 64, 80, "java.lang.String", null),
			new FieldSpec("leseband", 65, 80, "java.lang.String", null),
			new FieldSpec("Rückenprägung", 66, 80, "java.lang.String", null),
			new FieldSpec("kern", 67, 80, "java.lang.String", null),
			new FieldSpec("format", 68, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Artikel() {
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

	public void setArtikelNr(java.lang.String inp) {
		artikelNr = inp;
	}

	public java.lang.String getArtikelNr()

	{
		return artikelNr;
	}

	public void setKurzbeschreibung(java.lang.String inp) {
		kurzbeschreibung = inp;
	}

	public java.lang.String getKurzbeschreibung()

	{
		return kurzbeschreibung;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setInternetAktiv(boolean inp) {
		internetAktiv = inp;
	}

	public boolean getInternetAktiv()

	{
		return internetAktiv;
	}

	public void setEK(boolean inp) {
		eK = inp;
	}

	public boolean getEK()

	{
		return eK;
	}

	public void setM_078_011_Einheit(java.lang.String inp) {
		m_078_011_Einheit = inp;
	}

	public java.lang.String getM_078_011_Einheit()

	{
		return m_078_011_Einheit;
	}

	public void setInAktiv(boolean inp) {
		inAktiv = inp;
	}

	public boolean getInAktiv()

	{
		return inAktiv;
	}

	public void set_033_001__ArtikelGruppen_DID(int inp) {
		_033_001__ArtikelGruppen_DID = inp;
	}

	public int get_033_001__ArtikelGruppen_DID()

	{
		return _033_001__ArtikelGruppen_DID;
	}

	public void setVK1(double inp) {
		vK1 = inp;
	}

	public double getVK1()

	{
		return vK1;
	}

	public void setVK2(double inp) {
		vK2 = inp;
	}

	public double getVK2()

	{
		return vK2;
	}

	public void setVK3(double inp) {
		vK3 = inp;
	}

	public double getVK3()

	{
		return vK3;
	}

	public void setVK4(double inp) {
		vK4 = inp;
	}

	public double getVK4()

	{
		return vK4;
	}

	public void setEK1(double inp) {
		eK1 = inp;
	}

	public double getEK1()

	{
		return eK1;
	}

	public void setEK2(double inp) {
		eK2 = inp;
	}

	public double getEK2()

	{
		return eK2;
	}

	public void setEK3(double inp) {
		eK3 = inp;
	}

	public double getEK3()

	{
		return eK3;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setFixKosten(boolean inp) {
		fixKosten = inp;
	}

	public boolean getFixKosten()

	{
		return fixKosten;
	}

	public void setGewicht(double inp) {
		gewicht = inp;
	}

	public double getGewicht()

	{
		return gewicht;
	}

	public void setIntrastatNr(java.lang.String inp) {
		intrastatNr = inp;
	}

	public java.lang.String getIntrastatNr()

	{
		return intrastatNr;
	}

	public void setVerkauf90Tg(double inp) {
		verkauf90Tg = inp;
	}

	public double getVerkauf90Tg()

	{
		return verkauf90Tg;
	}

	public void setVerkauf365Tg(double inp) {
		verkauf365Tg = inp;
	}

	public double getVerkauf365Tg()

	{
		return verkauf365Tg;
	}

	public void setMarkup(double inp) {
		markup = inp;
	}

	public double getMarkup()

	{
		return markup;
	}

	public void setVerpackungseinheit(double inp) {
		verpackungseinheit = inp;
	}

	public double getVerpackungseinheit()

	{
		return verpackungseinheit;
	}

	public void set_003_001_Steuersätze_DID(int inp) {
		_003_001_Steuersätze_DID = inp;
	}

	public int get_003_001_Steuersätze_DID()

	{
		return _003_001_Steuersätze_DID;
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

	public void setM_033_026_ArtikelGruppen_Nr(int inp) {
		m_033_026_ArtikelGruppen_Nr = inp;
	}

	public int getM_033_026_ArtikelGruppen_Nr()

	{
		return m_033_026_ArtikelGruppen_Nr;
	}

	public void setM_033_011_ArtikelGruppen_KBZ(java.lang.String inp) {
		m_033_011_ArtikelGruppen_KBZ = inp;
	}

	public java.lang.String getM_033_011_ArtikelGruppen_KBZ()

	{
		return m_033_011_ArtikelGruppen_KBZ;
	}

	public void setM_033_027_ArtikelGrp_Kategorie(java.lang.String inp) {
		m_033_027_ArtikelGrp_Kategorie = inp;
	}

	public java.lang.String getM_033_027_ArtikelGrp_Kategorie()

	{
		return m_033_027_ArtikelGrp_Kategorie;
	}

	public void setRef_Bez(java.lang.String inp) {
		ref_Bez = inp;
	}

	public java.lang.String getRef_Bez()

	{
		return ref_Bez;
	}

	public void setLagerbestand(double inp) {
		lagerbestand = inp;
	}

	public double getLagerbestand()

	{
		return lagerbestand;
	}

	public void setM_003_012__034_Steuersatz_IL(double inp) {
		m_003_012__034_Steuersatz_IL = inp;
	}

	public double getM_003_012__034_Steuersatz_IL()

	{
		return m_003_012__034_Steuersatz_IL;
	}

	public void set_078_001__Einheiten_DID(int inp) {
		_078_001__Einheiten_DID = inp;
	}

	public int get_078_001__Einheiten_DID()

	{
		return _078_001__Einheiten_DID;
	}

	public void setFremdleistung(boolean inp) {
		fremdleistung = inp;
	}

	public boolean getFremdleistung()

	{
		return fremdleistung;
	}

	public void set_064_001_Medien_DID(int inp) {
		_064_001_Medien_DID = inp;
	}

	public int get_064_001_Medien_DID()

	{
		return _064_001_Medien_DID;
	}

	public void setUSP_Handel(java.lang.StringBuilder inp) {
		uSP_Handel = inp;
	}

	public java.lang.StringBuilder getUSP_Handel()

	{
		return uSP_Handel;
	}

	public void setBinding(java.lang.String inp) {
		binding = inp;
	}

	public java.lang.String getBinding()

	{
		return binding;
	}

	public void setVeroeffentlichung(java.sql.Date inp) {
		veroeffentlichung = inp;
	}

	public java.sql.Date getVeroeffentlichung()

	{
		return veroeffentlichung;
	}

	public void setAuflageNr(int inp) {
		auflageNr = inp;
	}

	public int getAuflageNr()

	{
		return auflageNr;
	}

	public void setSeiten(int inp) {
		seiten = inp;
	}

	public int getSeiten()

	{
		return seiten;
	}

	public void setUSP_Endkunde(java.lang.StringBuilder inp) {
		uSP_Endkunde = inp;
	}

	public java.lang.StringBuilder getUSP_Endkunde()

	{
		return uSP_Endkunde;
	}

	public void setImage_dropped(byte[] inp) {
		image_dropped = inp;
	}

	public byte[] getImage_dropped()

	{
		return image_dropped;
	}

	public void setBestandDatum(java.sql.Date inp) {
		bestandDatum = inp;
	}

	public java.sql.Date getBestandDatum()

	{
		return bestandDatum;
	}

	public void setBestandZeit(java.sql.Time inp) {
		bestandZeit = inp;
	}

	public java.sql.Time getBestandZeit()

	{
		return bestandZeit;
	}

	public void setEANCode(java.lang.String inp) {
		eANCode = inp;
	}

	public java.lang.String getEANCode()

	{
		return eANCode;
	}

	public void setM_064_011_MedienNummer(int inp) {
		m_064_011_MedienNummer = inp;
	}

	public int getM_064_011_MedienNummer()

	{
		return m_064_011_MedienNummer;
	}

	public void setTitel(java.lang.String inp) {
		titel = inp;
	}

	public java.lang.String getTitel()

	{
		return titel;
	}

	public void setUntertitel(java.lang.String inp) {
		untertitel = inp;
	}

	public java.lang.String getUntertitel()

	{
		return untertitel;
	}

	public void setAutoren(java.lang.String inp) {
		autoren = inp;
	}

	public java.lang.String getAutoren()

	{
		return autoren;
	}

	public void setAusführung(java.lang.String inp) {
		Ausführung = inp;
	}

	public java.lang.String getAusführung()

	{
		return Ausführung;
	}

	public void setCover(java.lang.String inp) {
		cover = inp;
	}

	public java.lang.String getCover()

	{
		return cover;
	}

	public void setÜberzug(java.lang.String inp) {
		Überzug = inp;
	}

	public java.lang.String getÜberzug()

	{
		return Überzug;
	}

	public void setKapitalband(java.lang.String inp) {
		kapitalband = inp;
	}

	public java.lang.String getKapitalband()

	{
		return kapitalband;
	}

	public void setSchutzumschlag(java.lang.String inp) {
		schutzumschlag = inp;
	}

	public java.lang.String getSchutzumschlag()

	{
		return schutzumschlag;
	}

	public void setLeseband(java.lang.String inp) {
		leseband = inp;
	}

	public java.lang.String getLeseband()

	{
		return leseband;
	}

	public void setRückenprägung(java.lang.String inp) {
		Rückenprägung = inp;
	}

	public java.lang.String getRückenprägung()

	{
		return Rückenprägung;
	}

	public void setKern(java.lang.String inp) {
		kern = inp;
	}

	public java.lang.String getKern()

	{
		return kern;
	}

	public void setFormat(java.lang.String inp) {
		format = inp;
	}

	public java.lang.String getFormat()

	{
		return format;
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
