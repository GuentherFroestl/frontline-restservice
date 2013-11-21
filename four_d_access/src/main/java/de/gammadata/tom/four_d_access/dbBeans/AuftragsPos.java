/*
 * AuftragsPos.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 65 mit dem Namen "AuftragsPos"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class AuftragsPos extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AuftragsPos";
	public static final int dbTabNummer = 65;
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
	public static int _067_001__Aufträge_DID_Fn = 11;
	public static int _032_001_Artikel_DID_Fn = 12;
	public static int m_032_011__012_ArtikelNr_Fn = 13;
	public static int artikelBez_Fn = 14;
	public static int artikelBeschr_Fn = 15;
	public static int menge_Fn = 16;
	public static int aE_Datum_Fn = 17;
	public static int wunsch_Liefertermin_Fn = 18;
	public static int liefertermin_Fn = 19;
	public static int vK_Preis_Fn = 20;
	public static int eK_Preis_Fn = 21;
	public static int storniert_Fn = 22;
	public static int rücklieferung_Fn = 23;
	public static int nächsteliefermenge_Fn = 24;
	public static int berrechnet_Fn = 25;
	public static int gelieferteMenge_Fn = 26;
	public static int _080_001_Lieferpos_DID_Fn = 27;
	public static int _003_001_Steuersätze_DID_Fn = 28;
	public static int mwST_Satz_Fn = 29;
	public static int vK_Gesamt_Brutto_Fn = 30;
	public static int posNr_Fn = 31;
	public static int vK_Gesamt_netto_Fn = 32;
	public static int eK_Gesamt_netto_Fn = 33;
	public static int rabatt_Fn = 34;
	public static int m_067_012_Auftragsnr_Fn = 35;
	public static int m_067_040_AB_Firma_Fn = 36;
	public static int m_067_046_VorgangNr_Fn = 37;
	public static int _022_001_Vorgang_DID_Fn = 38;
	public static int _058_001_Bestellpos_DID_Fn = 39;
	public static int bestellt_Fn = 40;
	public static int _062_001_AusRechPos_DID_Fn = 41;
	public static int _068_001_Kunden_DID_Fn = 42;
	public static int last_Artikel_DID_Fn = 43;
	public static int preise_festgelegt_Fn = 44;
	public static int fremdleistung_Fn = 45;
	public static int vK_Liste_Fn = 46;
	public static int grp_Nr_Fn = 47;
	public static int pos_HauptDID_Fn = 48;
	public static int vK_Gesamt_netto_Detail_Fn = 49;
	public static int eK_Gesamt_netto_Detail_Fn = 50;
	public static int m_062_028_AusRech_PosNr_Fn = 51;
	public static int m_058_024_Bestpos_PosNr_Fn = 52;
	public static int m_080_014_Lieferpos_PosNr_Fn = 53;
	public static int weiterverrechnen_Fn = 54;
	public static int preis_typ_Fn = 55;
	public static int anz_DetailPos_Fn = 56;
	public static int xML_Upos_Fn = 57;
	public static int _089_001_Verkaufsarten_DID_Fn = 58;
	public static int m_089_011_Verkaufsarten_KBZ_Fn = 59;

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
	private int _067_001__Aufträge_DID = 0;
	private int _032_001_Artikel_DID = 0;
	private java.lang.String m_032_011__012_ArtikelNr = "";
	private java.lang.String artikelBez = "";
	private java.lang.StringBuilder artikelBeschr = new java.lang.StringBuilder();
	private double menge = 0;
	private java.sql.Date aE_Datum = new java.sql.Date(0);
	private java.sql.Date wunsch_Liefertermin = new java.sql.Date(0);
	private java.sql.Date liefertermin = new java.sql.Date(0);
	private double vK_Preis = 0;
	private double eK_Preis = 0;
	private boolean storniert = false;
	private boolean rücklieferung = false;
	private double nächsteliefermenge = 0;
	private boolean berrechnet = false;
	private double gelieferteMenge = 0;
	private int _080_001_Lieferpos_DID = 0;
	private int _003_001_Steuersätze_DID = 0;
	private double mwST_Satz = 0;
	private double vK_Gesamt_Brutto = 0;
	private int posNr = 0;
	private double vK_Gesamt_netto = 0;
	private double eK_Gesamt_netto = 0;
	private double rabatt = 0;
	private int m_067_012_Auftragsnr = 0;
	private java.lang.String m_067_040_AB_Firma = "";
	private java.lang.String m_067_046_VorgangNr = "";
	private int _022_001_Vorgang_DID = 0;
	private int _058_001_Bestellpos_DID = 0;
	private boolean bestellt = false;
	private int _062_001_AusRechPos_DID = 0;
	private int _068_001_Kunden_DID = 0;
	private int last_Artikel_DID = 0;
	private boolean preise_festgelegt = false;
	private boolean fremdleistung = false;
	private double vK_Liste = 0;
	private int grp_Nr = 0;
	private int pos_HauptDID = 0;
	private double vK_Gesamt_netto_Detail = 0;
	private double eK_Gesamt_netto_Detail = 0;
	private int m_062_028_AusRech_PosNr = 0;
	private int m_058_024_Bestpos_PosNr = 0;
	private int m_080_014_Lieferpos_PosNr = 0;
	private boolean weiterverrechnen = false;
	private int preis_typ = 0;
	private int anz_DetailPos = 0;
	private java.lang.StringBuilder xML_Upos = new java.lang.StringBuilder();
	private int _089_001_Verkaufsarten_DID = 0;
	private java.lang.String m_089_011_Verkaufsarten_KBZ = "";
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
			new FieldSpec("_067_001__Aufträge_DID", 11, 0, "int", null),
			new FieldSpec("_032_001_Artikel_DID", 12, 0, "int", null),
			new FieldSpec("m_032_011__012_ArtikelNr", 13, 40,
					"java.lang.String", null),
			new FieldSpec("artikelBez", 14, 80, "java.lang.String", null),
			new FieldSpec("artikelBeschr", 15, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("menge", 16, 0, "double", null),
			new FieldSpec("aE_Datum", 17, 0, "java.sql.Date", null),
			new FieldSpec("wunsch_Liefertermin", 18, 0, "java.sql.Date", null),
			new FieldSpec("liefertermin", 19, 0, "java.sql.Date", null),
			new FieldSpec("vK_Preis", 20, 0, "double", null),
			new FieldSpec("eK_Preis", 21, 0, "double", null),
			new FieldSpec("storniert", 22, 0, "boolean", null),
			new FieldSpec("rücklieferung", 23, 0, "boolean", null),
			new FieldSpec("nächsteliefermenge", 24, 0, "double", null),
			new FieldSpec("berrechnet", 25, 0, "boolean", null),
			new FieldSpec("gelieferteMenge", 26, 0, "double", null),
			new FieldSpec("_080_001_Lieferpos_DID", 27, 0, "int", null),
			new FieldSpec("_003_001_Steuersätze_DID", 28, 0, "int", null),
			new FieldSpec("mwST_Satz", 29, 0, "double", null),
			new FieldSpec("vK_Gesamt_Brutto", 30, 0, "double", null),
			new FieldSpec("posNr", 31, 0, "int", null),
			new FieldSpec("vK_Gesamt_netto", 32, 0, "double", null),
			new FieldSpec("eK_Gesamt_netto", 33, 0, "double", null),
			new FieldSpec("rabatt", 34, 0, "double", null),
			new FieldSpec("m_067_012_Auftragsnr", 35, 0, "int", null),
			new FieldSpec("m_067_040_AB_Firma", 36, 40, "java.lang.String",
					null),
			new FieldSpec("m_067_046_VorgangNr", 37, 40, "java.lang.String",
					null),
			new FieldSpec("_022_001_Vorgang_DID", 38, 0, "int", null),
			new FieldSpec("_058_001_Bestellpos_DID", 39, 0, "int", null),
			new FieldSpec("bestellt", 40, 0, "boolean", null),
			new FieldSpec("_062_001_AusRechPos_DID", 41, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 42, 0, "int", null),
			new FieldSpec("last_Artikel_DID", 43, 0, "int", null),
			new FieldSpec("preise_festgelegt", 44, 0, "boolean", null),
			new FieldSpec("fremdleistung", 45, 0, "boolean", null),
			new FieldSpec("vK_Liste", 46, 0, "double", null),
			new FieldSpec("grp_Nr", 47, 0, "int", null),
			new FieldSpec("pos_HauptDID", 48, 0, "int", null),
			new FieldSpec("vK_Gesamt_netto_Detail", 49, 0, "double", null),
			new FieldSpec("eK_Gesamt_netto_Detail", 50, 0, "double", null),
			new FieldSpec("m_062_028_AusRech_PosNr", 51, 0, "int", null),
			new FieldSpec("m_058_024_Bestpos_PosNr", 52, 0, "int", null),
			new FieldSpec("m_080_014_Lieferpos_PosNr", 53, 0, "int", null),
			new FieldSpec("weiterverrechnen", 54, 0, "boolean", null),
			new FieldSpec("preis_typ", 55, 0, "int", null),
			new FieldSpec("anz_DetailPos", 56, 0, "int", null),
			new FieldSpec("xML_Upos", 57, 0, "java.lang.StringBuilder", null),
			new FieldSpec("_089_001_Verkaufsarten_DID", 58, 0, "int", null),
			new FieldSpec("m_089_011_Verkaufsarten_KBZ", 59, 80,
					"java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public AuftragsPos() {
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

	public void set_067_001__Aufträge_DID(int inp) {
		_067_001__Aufträge_DID = inp;
	}

	public int get_067_001__Aufträge_DID()

	{
		return _067_001__Aufträge_DID;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setM_032_011__012_ArtikelNr(java.lang.String inp) {
		m_032_011__012_ArtikelNr = inp;
	}

	public java.lang.String getM_032_011__012_ArtikelNr()

	{
		return m_032_011__012_ArtikelNr;
	}

	public void setArtikelBez(java.lang.String inp) {
		artikelBez = inp;
	}

	public java.lang.String getArtikelBez()

	{
		return artikelBez;
	}

	public void setArtikelBeschr(java.lang.StringBuilder inp) {
		artikelBeschr = inp;
	}

	public java.lang.StringBuilder getArtikelBeschr()

	{
		return artikelBeschr;
	}

	public void setMenge(double inp) {
		menge = inp;
	}

	public double getMenge()

	{
		return menge;
	}

	public void setAE_Datum(java.sql.Date inp) {
		aE_Datum = inp;
	}

	public java.sql.Date getAE_Datum()

	{
		return aE_Datum;
	}

	public void setWunsch_Liefertermin(java.sql.Date inp) {
		wunsch_Liefertermin = inp;
	}

	public java.sql.Date getWunsch_Liefertermin()

	{
		return wunsch_Liefertermin;
	}

	public void setLiefertermin(java.sql.Date inp) {
		liefertermin = inp;
	}

	public java.sql.Date getLiefertermin()

	{
		return liefertermin;
	}

	public void setVK_Preis(double inp) {
		vK_Preis = inp;
	}

	public double getVK_Preis()

	{
		return vK_Preis;
	}

	public void setEK_Preis(double inp) {
		eK_Preis = inp;
	}

	public double getEK_Preis()

	{
		return eK_Preis;
	}

	public void setStorniert(boolean inp) {
		storniert = inp;
	}

	public boolean getStorniert()

	{
		return storniert;
	}

	public void setrücklieferung(boolean inp) {
		rücklieferung = inp;
	}

	public boolean getrücklieferung()

	{
		return rücklieferung;
	}

	public void setNächsteliefermenge(double inp) {
		nächsteliefermenge = inp;
	}

	public double getNächsteliefermenge()

	{
		return nächsteliefermenge;
	}

	public void setBerrechnet(boolean inp) {
		berrechnet = inp;
	}

	public boolean getBerrechnet()

	{
		return berrechnet;
	}

	public void setGelieferteMenge(double inp) {
		gelieferteMenge = inp;
	}

	public double getGelieferteMenge()

	{
		return gelieferteMenge;
	}

	public void set_080_001_Lieferpos_DID(int inp) {
		_080_001_Lieferpos_DID = inp;
	}

	public int get_080_001_Lieferpos_DID()

	{
		return _080_001_Lieferpos_DID;
	}

	public void set_003_001_Steuersätze_DID(int inp) {
		_003_001_Steuersätze_DID = inp;
	}

	public int get_003_001_Steuersätze_DID()

	{
		return _003_001_Steuersätze_DID;
	}

	public void setMwST_Satz(double inp) {
		mwST_Satz = inp;
	}

	public double getMwST_Satz()

	{
		return mwST_Satz;
	}

	public void setVK_Gesamt_Brutto(double inp) {
		vK_Gesamt_Brutto = inp;
	}

	public double getVK_Gesamt_Brutto()

	{
		return vK_Gesamt_Brutto;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setVK_Gesamt_netto(double inp) {
		vK_Gesamt_netto = inp;
	}

	public double getVK_Gesamt_netto()

	{
		return vK_Gesamt_netto;
	}

	public void setEK_Gesamt_netto(double inp) {
		eK_Gesamt_netto = inp;
	}

	public double getEK_Gesamt_netto()

	{
		return eK_Gesamt_netto;
	}

	public void setRabatt(double inp) {
		rabatt = inp;
	}

	public double getRabatt()

	{
		return rabatt;
	}

	public void setM_067_012_Auftragsnr(int inp) {
		m_067_012_Auftragsnr = inp;
	}

	public int getM_067_012_Auftragsnr()

	{
		return m_067_012_Auftragsnr;
	}

	public void setM_067_040_AB_Firma(java.lang.String inp) {
		m_067_040_AB_Firma = inp;
	}

	public java.lang.String getM_067_040_AB_Firma()

	{
		return m_067_040_AB_Firma;
	}

	public void setM_067_046_VorgangNr(java.lang.String inp) {
		m_067_046_VorgangNr = inp;
	}

	public java.lang.String getM_067_046_VorgangNr()

	{
		return m_067_046_VorgangNr;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void set_058_001_Bestellpos_DID(int inp) {
		_058_001_Bestellpos_DID = inp;
	}

	public int get_058_001_Bestellpos_DID()

	{
		return _058_001_Bestellpos_DID;
	}

	public void setBestellt(boolean inp) {
		bestellt = inp;
	}

	public boolean getBestellt()

	{
		return bestellt;
	}

	public void set_062_001_AusRechPos_DID(int inp) {
		_062_001_AusRechPos_DID = inp;
	}

	public int get_062_001_AusRechPos_DID()

	{
		return _062_001_AusRechPos_DID;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setLast_Artikel_DID(int inp) {
		last_Artikel_DID = inp;
	}

	public int getLast_Artikel_DID()

	{
		return last_Artikel_DID;
	}

	public void setPreise_festgelegt(boolean inp) {
		preise_festgelegt = inp;
	}

	public boolean getPreise_festgelegt()

	{
		return preise_festgelegt;
	}

	public void setFremdleistung(boolean inp) {
		fremdleistung = inp;
	}

	public boolean getFremdleistung()

	{
		return fremdleistung;
	}

	public void setVK_Liste(double inp) {
		vK_Liste = inp;
	}

	public double getVK_Liste()

	{
		return vK_Liste;
	}

	public void setGrp_Nr(int inp) {
		grp_Nr = inp;
	}

	public int getGrp_Nr()

	{
		return grp_Nr;
	}

	public void setPos_HauptDID(int inp) {
		pos_HauptDID = inp;
	}

	public int getPos_HauptDID()

	{
		return pos_HauptDID;
	}

	public void setVK_Gesamt_netto_Detail(double inp) {
		vK_Gesamt_netto_Detail = inp;
	}

	public double getVK_Gesamt_netto_Detail()

	{
		return vK_Gesamt_netto_Detail;
	}

	public void setEK_Gesamt_netto_Detail(double inp) {
		eK_Gesamt_netto_Detail = inp;
	}

	public double getEK_Gesamt_netto_Detail()

	{
		return eK_Gesamt_netto_Detail;
	}

	public void setM_062_028_AusRech_PosNr(int inp) {
		m_062_028_AusRech_PosNr = inp;
	}

	public int getM_062_028_AusRech_PosNr()

	{
		return m_062_028_AusRech_PosNr;
	}

	public void setM_058_024_Bestpos_PosNr(int inp) {
		m_058_024_Bestpos_PosNr = inp;
	}

	public int getM_058_024_Bestpos_PosNr()

	{
		return m_058_024_Bestpos_PosNr;
	}

	public void setM_080_014_Lieferpos_PosNr(int inp) {
		m_080_014_Lieferpos_PosNr = inp;
	}

	public int getM_080_014_Lieferpos_PosNr()

	{
		return m_080_014_Lieferpos_PosNr;
	}

	public void setWeiterverrechnen(boolean inp) {
		weiterverrechnen = inp;
	}

	public boolean getWeiterverrechnen()

	{
		return weiterverrechnen;
	}

	public void setPreis_typ(int inp) {
		preis_typ = inp;
	}

	public int getPreis_typ()

	{
		return preis_typ;
	}

	public void setAnz_DetailPos(int inp) {
		anz_DetailPos = inp;
	}

	public int getAnz_DetailPos()

	{
		return anz_DetailPos;
	}

	public void setXML_Upos(java.lang.StringBuilder inp) {
		xML_Upos = inp;
	}

	public java.lang.StringBuilder getXML_Upos()

	{
		return xML_Upos;
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
