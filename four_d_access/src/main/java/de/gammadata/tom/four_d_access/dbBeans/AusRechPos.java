/*
 * AusRechPos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 62 mit dem Namen "AusRechPos"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class AusRechPos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AusRechPos";
	public static final int dbTabNummer = 62;
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
	public static int _063_001_AusRech_DID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int menge_Fn = 13;
	public static int vK_Einzel_netto_Fn = 14;
	public static int mWST_Satz_Fn = 15;
	public static int _006_001_Konten_DID_Fn = 16;
	public static int m_032_011__012_Artikel_ArtikelN_Fn = 17;
	public static int gutschrift_Fn = 18;
	public static int storniert_Fn = 19;
	public static int artikelBez_Fn = 20;
	public static int _065_001_AuftragsPos_DID_Fn = 21;
	public static int m_063_011_AusRech_Nr_Fn = 22;
	public static int kosten_einzel_netto_Fn = 23;
	public static int vK_Gesamt_netto_Fn = 24;
	public static int m_022_031_VorgangNr_Fn = 25;
	public static int artikelBeschreibung_Fn = 26;
	public static int m_068_011_KundenNr_Fn = 27;
	public static int posNr_Fn = 28;
	public static int last_Artikel_DID_Fn = 29;
	public static int kosten_Gesamt_Netto_Fn = 30;
	public static int vK_Gesamt_brutto_Fn = 31;
	public static int preise_festgelegt_Fn = 32;
	public static int _068_001_Kunden_DID_Fn = 33;
	public static int _022_001_Vorgang_DID_Fn = 34;
	public static int kostenanteil_Fremdleistung_Fn = 35;
	public static int kostenanteil_Eigenleistung_Fn = 36;
	public static int fremdleistung_Fn = 37;
	public static int datum_Fn = 38;
	public static int m_063_018_WRG_DID_Fn = 39;
	public static int m_063_019_Kurs_Fn = 40;
	public static int _066_001_LieferscheinDID_Fn = 41;
	public static int lieferScheinNr_Fn = 42;
	public static int lieferDatum_Fn = 43;
	public static int _003_001_Steuersatz_DID_Fn = 44;
	public static int _089_001_Verkaufsarten_DID_Fn = 45;
	public static int m_089_011_Verkaufsarten_KBZ_Fn = 46;
	public static int datumBis_Fn = 47;
	public static int listenpreis_Fn = 48;
	public static int rabatt_Fn = 49;

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
	private int _063_001_AusRech_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private double menge = 0;
	private double vK_Einzel_netto = 0;
	private double mWST_Satz = 0;
	private int _006_001_Konten_DID = 0;
	private java.lang.String m_032_011__012_Artikel_ArtikelN = "";
	private boolean gutschrift = false;
	private boolean storniert = false;
	private java.lang.String artikelBez = "";
	private int _065_001_AuftragsPos_DID = 0;
	private int m_063_011_AusRech_Nr = 0;
	private double kosten_einzel_netto = 0;
	private double vK_Gesamt_netto = 0;
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.StringBuilder artikelBeschreibung = new java.lang.StringBuilder();
	private int m_068_011_KundenNr = 0;
	private int posNr = 0;
	private int last_Artikel_DID = 0;
	private double kosten_Gesamt_Netto = 0;
	private double vK_Gesamt_brutto = 0;
	private boolean preise_festgelegt = false;
	private int _068_001_Kunden_DID = 0;
	private int _022_001_Vorgang_DID = 0;
	private double kostenanteil_Fremdleistung = 0;
	private double kostenanteil_Eigenleistung = 0;
	private boolean fremdleistung = false;
	private java.sql.Date datum = new java.sql.Date(0);
	private int m_063_018_WRG_DID = 0;
	private double m_063_019_Kurs = 0;
	private int _066_001_LieferscheinDID = 0;
	private int lieferScheinNr = 0;
	private java.sql.Date lieferDatum = new java.sql.Date(0);
	private int _003_001_Steuersatz_DID = 0;
	private int _089_001_Verkaufsarten_DID = 0;
	private java.lang.String m_089_011_Verkaufsarten_KBZ = "";
	private java.sql.Date datumBis = new java.sql.Date(0);
	private double listenpreis = 0;
	private double rabatt = 0;
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
			new FieldSpec("_063_001_AusRech_DID", 11, 0, "int", null),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int", null),
			new FieldSpec("menge", 13, 0, "double", null),
			new FieldSpec("vK_Einzel_netto", 14, 0, "double", null),
			new FieldSpec("mWST_Satz", 15, 0, "double", null),
			new FieldSpec("_006_001_Konten_DID", 16, 0, "int", null),
			new FieldSpec("m_032_011__012_Artikel_ArtikelN", 17, 40,
					"java.lang.String", null),
			new FieldSpec("gutschrift", 18, 0, "boolean", null),
			new FieldSpec("storniert", 19, 0, "boolean", null),
			new FieldSpec("artikelBez", 20, 80, "java.lang.String", null),
			new FieldSpec("_065_001_AuftragsPos_DID", 21, 0, "int", null),
			new FieldSpec("m_063_011_AusRech_Nr", 22, 0, "int", null),
			new FieldSpec("kosten_einzel_netto", 23, 0, "double", null),
			new FieldSpec("vK_Gesamt_netto", 24, 0, "double", null),
			new FieldSpec("m_022_031_VorgangNr", 25, 30, "java.lang.String",
					null),
			new FieldSpec("artikelBeschreibung", 26, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("m_068_011_KundenNr", 27, 0, "int", null),
			new FieldSpec("posNr", 28, 0, "int", null),
			new FieldSpec("last_Artikel_DID", 29, 0, "int", null),
			new FieldSpec("kosten_Gesamt_Netto", 30, 0, "double", null),
			new FieldSpec("vK_Gesamt_brutto", 31, 0, "double", null),
			new FieldSpec("preise_festgelegt", 32, 0, "boolean", null),
			new FieldSpec("_068_001_Kunden_DID", 33, 0, "int", null),
			new FieldSpec("_022_001_Vorgang_DID", 34, 0, "int", null),
			new FieldSpec("kostenanteil_Fremdleistung", 35, 0, "double", null),
			new FieldSpec("kostenanteil_Eigenleistung", 36, 0, "double", null),
			new FieldSpec("fremdleistung", 37, 0, "boolean", null),
			new FieldSpec("datum", 38, 0, "java.sql.Date", null),
			new FieldSpec("m_063_018_WRG_DID", 39, 0, "int", null),
			new FieldSpec("m_063_019_Kurs", 40, 0, "double", null),
			new FieldSpec("_066_001_LieferscheinDID", 41, 0, "int", null),
			new FieldSpec("lieferScheinNr", 42, 0, "int", null),
			new FieldSpec("lieferDatum", 43, 0, "java.sql.Date", null),
			new FieldSpec("_003_001_Steuersatz_DID", 44, 0, "int", null),
			new FieldSpec("_089_001_Verkaufsarten_DID", 45, 0, "int", null),
			new FieldSpec("m_089_011_Verkaufsarten_KBZ", 46, 80,
					"java.lang.String", null),
			new FieldSpec("datumBis", 47, 0, "java.sql.Date", null),
			new FieldSpec("listenpreis", 48, 0, "double", null),
			new FieldSpec("rabatt", 49, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public AusRechPos() {
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

	public void set_063_001_AusRech_DID(int inp) {
		_063_001_AusRech_DID = inp;
	}

	public int get_063_001_AusRech_DID()

	{
		return _063_001_AusRech_DID;
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

	public void setVK_Einzel_netto(double inp) {
		vK_Einzel_netto = inp;
	}

	public double getVK_Einzel_netto()

	{
		return vK_Einzel_netto;
	}

	public void setMWST_Satz(double inp) {
		mWST_Satz = inp;
	}

	public double getMWST_Satz()

	{
		return mWST_Satz;
	}

	public void set_006_001_Konten_DID(int inp) {
		_006_001_Konten_DID = inp;
	}

	public int get_006_001_Konten_DID()

	{
		return _006_001_Konten_DID;
	}

	public void setM_032_011__012_Artikel_ArtikelN(java.lang.String inp) {
		m_032_011__012_Artikel_ArtikelN = inp;
	}

	public java.lang.String getM_032_011__012_Artikel_ArtikelN()

	{
		return m_032_011__012_Artikel_ArtikelN;
	}

	public void setGutschrift(boolean inp) {
		gutschrift = inp;
	}

	public boolean getGutschrift()

	{
		return gutschrift;
	}

	public void setStorniert(boolean inp) {
		storniert = inp;
	}

	public boolean getStorniert()

	{
		return storniert;
	}

	public void setArtikelBez(java.lang.String inp) {
		artikelBez = inp;
	}

	public java.lang.String getArtikelBez()

	{
		return artikelBez;
	}

	public void set_065_001_AuftragsPos_DID(int inp) {
		_065_001_AuftragsPos_DID = inp;
	}

	public int get_065_001_AuftragsPos_DID()

	{
		return _065_001_AuftragsPos_DID;
	}

	public void setM_063_011_AusRech_Nr(int inp) {
		m_063_011_AusRech_Nr = inp;
	}

	public int getM_063_011_AusRech_Nr()

	{
		return m_063_011_AusRech_Nr;
	}

	public void setKosten_einzel_netto(double inp) {
		kosten_einzel_netto = inp;
	}

	public double getKosten_einzel_netto()

	{
		return kosten_einzel_netto;
	}

	public void setVK_Gesamt_netto(double inp) {
		vK_Gesamt_netto = inp;
	}

	public double getVK_Gesamt_netto()

	{
		return vK_Gesamt_netto;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setArtikelBeschreibung(java.lang.StringBuilder inp) {
		artikelBeschreibung = inp;
	}

	public java.lang.StringBuilder getArtikelBeschreibung()

	{
		return artikelBeschreibung;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setLast_Artikel_DID(int inp) {
		last_Artikel_DID = inp;
	}

	public int getLast_Artikel_DID()

	{
		return last_Artikel_DID;
	}

	public void setKosten_Gesamt_Netto(double inp) {
		kosten_Gesamt_Netto = inp;
	}

	public double getKosten_Gesamt_Netto()

	{
		return kosten_Gesamt_Netto;
	}

	public void setVK_Gesamt_brutto(double inp) {
		vK_Gesamt_brutto = inp;
	}

	public double getVK_Gesamt_brutto()

	{
		return vK_Gesamt_brutto;
	}

	public void setPreise_festgelegt(boolean inp) {
		preise_festgelegt = inp;
	}

	public boolean getPreise_festgelegt()

	{
		return preise_festgelegt;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void setKostenanteil_Fremdleistung(double inp) {
		kostenanteil_Fremdleistung = inp;
	}

	public double getKostenanteil_Fremdleistung()

	{
		return kostenanteil_Fremdleistung;
	}

	public void setKostenanteil_Eigenleistung(double inp) {
		kostenanteil_Eigenleistung = inp;
	}

	public double getKostenanteil_Eigenleistung()

	{
		return kostenanteil_Eigenleistung;
	}

	public void setFremdleistung(boolean inp) {
		fremdleistung = inp;
	}

	public boolean getFremdleistung()

	{
		return fremdleistung;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setM_063_018_WRG_DID(int inp) {
		m_063_018_WRG_DID = inp;
	}

	public int getM_063_018_WRG_DID()

	{
		return m_063_018_WRG_DID;
	}

	public void setM_063_019_Kurs(double inp) {
		m_063_019_Kurs = inp;
	}

	public double getM_063_019_Kurs()

	{
		return m_063_019_Kurs;
	}

	public void set_066_001_LieferscheinDID(int inp) {
		_066_001_LieferscheinDID = inp;
	}

	public int get_066_001_LieferscheinDID()

	{
		return _066_001_LieferscheinDID;
	}

	public void setLieferScheinNr(int inp) {
		lieferScheinNr = inp;
	}

	public int getLieferScheinNr()

	{
		return lieferScheinNr;
	}

	public void setLieferDatum(java.sql.Date inp) {
		lieferDatum = inp;
	}

	public java.sql.Date getLieferDatum()

	{
		return lieferDatum;
	}

	public void set_003_001_Steuersatz_DID(int inp) {
		_003_001_Steuersatz_DID = inp;
	}

	public int get_003_001_Steuersatz_DID()

	{
		return _003_001_Steuersatz_DID;
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

	public void setDatumBis(java.sql.Date inp) {
		datumBis = inp;
	}

	public java.sql.Date getDatumBis()

	{
		return datumBis;
	}

	public void setListenpreis(double inp) {
		listenpreis = inp;
	}

	public double getListenpreis()

	{
		return listenpreis;
	}

	public void setRabatt(double inp) {
		rabatt = inp;
	}

	public double getRabatt()

	{
		return rabatt;
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