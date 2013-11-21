/*
 * AusRech.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 63 mit dem Namen "AusRech"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class AusRech extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AusRech";
	public static final int dbTabNummer = 63;
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
	public static int rechnungsnummer_Fn = 11;
	public static int rechnungsdatum_Fn = 12;
	public static int _001_001_Mitarbeiter_DID_SB_Fn = 13;
	public static int _068_001_Kunden_DID_Fn = 14;
	public static int betrag_Netto_Fn = 15;
	public static int betrag_Brutto_Fn = 16;
	public static int betrag_MwSt_Fn = 17;
	public static int _005_001_Währungen_DID_Fn = 18;
	public static int kurs_Fn = 19;
	public static int m_005_011__054_WährZeichen_Fn = 20;
	public static int mwSt_plichtig_Fn = 21;
	public static int gurschriftflag_Fn = 22;
	public static int proforma_Fn = 23;
	public static int storniert_Fn = 24;
	public static int fällig_Fn = 25;
	public static int betragBezahlt_Fn = 26;
	public static int skontoBetrag_Fn = 27;
	public static int mahnung_Nr1_Fn = 28;
	public static int letzte_Mahnung_am_Fn = 29;
	public static int mahnstufe_Fn = 30;
	public static int bezahlt_Fn = 31;
	public static int gebucht_Fn = 32;
	public static int _030_001_BuchposDID_Fn = 33;
	public static int bHExportDatum_Fn = 34;
	public static int bHExportZeit_Fn = 35;
	public static int _001_001_Mitarbeiter_DID_BH_Fn = 36;
	public static int bemerkung_Fn = 37;
	public static int _006_001_Konten_DID_Fn = 38;
	public static int m_006_011_KontoNummer_Fn = 39;
	public static int _009_001_Adressen_DID_RG_Fn = 40;
	public static int m_068_011_KundenNr_Fn = 41;
	public static int m_068_026_Kunden_Firmenname_Fn = 42;
	public static int _022_001_Vorgang_DID_Fn = 43;
	public static int _012_001_Zahlungsbed_DID_Fn = 44;
	public static int m_009_011_Adressen_Firmenname_Fn = 45;
	public static int m_009_014_Adressen_Nachname_Fn = 46;
	public static int m_022_031_VorgangNr_Fn = 47;
	public static int vermerk1_Fn = 48;
	public static int vermerk2_Fn = 49;
	public static int vermerk3_Fn = 50;
	public static int vermerk4_Fn = 51;
	public static int last_Kunden_DID_Fn = 52;
	public static int last_Währung_DID_Fn = 53;
	public static int _005_001_BezugsWährung_DID_Fn = 54;
	public static int m_005_011__018_WährZeichen_Fn = 55;
	public static int buchungsKey_Fn = 56;
	public static int buchStapelNr_Fn = 57;
	public static int brutto_Euro_Fn = 58;
	public static int netto_Euro_Fn = 59;
	public static int kostenNetto_Fn = 60;
	public static int fremdkostenNetto_Fn = 61;
	public static int writeDocDID_Fn = 62;
	public static int bezahlt_am_Fn = 63;
	public static int mahnstopp_Fn = 64;
	public static int _081_001_Kost1_Fn = 65;
	public static int _081_001_Kost2_Fn = 66;
	public static int mwst_Modus_Fn = 67;
	public static int _066_001_LieferscheinDID_Fn = 68;
	public static int lieferscheinnummer_Fn = 69;
	public static int lieferDatum_Fn = 70;

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
	private int rechnungsnummer = 0;
	private java.sql.Date rechnungsdatum = new java.sql.Date(0);
	private int _001_001_Mitarbeiter_DID_SB = 0;
	private int _068_001_Kunden_DID = 0;
	private double betrag_Netto = 0;
	private double betrag_Brutto = 0;
	private double betrag_MwSt = 0;
	private int _005_001_Währungen_DID = 0;
	private double kurs = 0;
	private java.lang.String m_005_011__054_WährZeichen = "";
	private boolean mwSt_plichtig = false;
	private boolean gurschriftflag = false;
	private boolean proforma = false;
	private boolean storniert = false;
	private java.sql.Date fällig = new java.sql.Date(0);
	private double betragBezahlt = 0;
	private double skontoBetrag = 0;
	private java.sql.Date mahnung_Nr1 = new java.sql.Date(0);
	private java.sql.Date letzte_Mahnung_am = new java.sql.Date(0);
	private int mahnstufe = 0;
	private boolean bezahlt = false;
	private boolean gebucht = false;
	private int _030_001_BuchposDID = 0;
	private java.sql.Date bHExportDatum = new java.sql.Date(0);
	private java.sql.Time bHExportZeit = new java.sql.Time(0);
	private int _001_001_Mitarbeiter_DID_BH = 0;
	private java.lang.String bemerkung = "";
	private int _006_001_Konten_DID = 0;
	private int m_006_011_KontoNummer = 0;
	private int _009_001_Adressen_DID_RG = 0;
	private int m_068_011_KundenNr = 0;
	private java.lang.String m_068_026_Kunden_Firmenname = "";
	private int _022_001_Vorgang_DID = 0;
	private int _012_001_Zahlungsbed_DID = 0;
	private java.lang.String m_009_011_Adressen_Firmenname = "";
	private java.lang.String m_009_014_Adressen_Nachname = "";
	private java.lang.String m_022_031_VorgangNr = "";
	private java.lang.StringBuilder vermerk1 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk2 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk3 = new java.lang.StringBuilder();
	private java.lang.StringBuilder vermerk4 = new java.lang.StringBuilder();
	private int last_Kunden_DID = 0;
	private int last_Währung_DID = 0;
	private int _005_001_BezugsWährung_DID = 0;
	private java.lang.String m_005_011__018_WährZeichen = "";
	private int buchungsKey = 0;
	private int buchStapelNr = 0;
	private double brutto_Euro = 0;
	private double netto_Euro = 0;
	private double kostenNetto = 0;
	private double fremdkostenNetto = 0;
	private int writeDocDID = 0;
	private java.sql.Date bezahlt_am = new java.sql.Date(0);
	private boolean mahnstopp = false;
	private int _081_001_Kost1 = 0;
	private int _081_001_Kost2 = 0;
	private int mwst_Modus = 0;
	private int _066_001_LieferscheinDID = 0;
	private int lieferscheinnummer = 0;
	private java.sql.Date lieferDatum = new java.sql.Date(0);
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
			new FieldSpec("rechnungsnummer", 11, 0, "int", null),
			new FieldSpec("rechnungsdatum", 12, 0, "java.sql.Date", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_SB", 13, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 14, 0, "int", null),
			new FieldSpec("betrag_Netto", 15, 0, "double", null),
			new FieldSpec("betrag_Brutto", 16, 0, "double", null),
			new FieldSpec("betrag_MwSt", 17, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 18, 0, "int", null),
			new FieldSpec("kurs", 19, 0, "double", null),
			new FieldSpec("m_005_011__054_WährZeichen", 20, 5,
					"java.lang.String", null),
			new FieldSpec("mwSt_plichtig", 21, 0, "boolean", null),
			new FieldSpec("gurschriftflag", 22, 0, "boolean", null),
			new FieldSpec("proforma", 23, 0, "boolean", null),
			new FieldSpec("storniert", 24, 0, "boolean", null),
			new FieldSpec("fällig", 25, 0, "java.sql.Date", null),
			new FieldSpec("betragBezahlt", 26, 0, "double", null),
			new FieldSpec("skontoBetrag", 27, 0, "double", null),
			new FieldSpec("mahnung_Nr1", 28, 0, "java.sql.Date", null),
			new FieldSpec("letzte_Mahnung_am", 29, 0, "java.sql.Date", null),
			new FieldSpec("mahnstufe", 30, 0, "int", null),
			new FieldSpec("bezahlt", 31, 0, "boolean", null),
			new FieldSpec("gebucht", 32, 0, "boolean", null),
			new FieldSpec("_030_001_BuchposDID", 33, 0, "int", null),
			new FieldSpec("bHExportDatum", 34, 0, "java.sql.Date", null),
			new FieldSpec("bHExportZeit", 35, 0, "java.sql.Time", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_BH", 36, 0, "int", null),
			new FieldSpec("bemerkung", 37, 80, "java.lang.String", null),
			new FieldSpec("_006_001_Konten_DID", 38, 0, "int", null),
			new FieldSpec("m_006_011_KontoNummer", 39, 0, "int", null),
			new FieldSpec("_009_001_Adressen_DID_RG", 40, 0, "int", null),
			new FieldSpec("m_068_011_KundenNr", 41, 0, "int", null),
			new FieldSpec("m_068_026_Kunden_Firmenname", 42, 40,
					"java.lang.String", null),
			new FieldSpec("_022_001_Vorgang_DID", 43, 0, "int", null),
			new FieldSpec("_012_001_Zahlungsbed_DID", 44, 0, "int", null),
			new FieldSpec("m_009_011_Adressen_Firmenname", 45, 40,
					"java.lang.String", null),
			new FieldSpec("m_009_014_Adressen_Nachname", 46, 40,
					"java.lang.String", null),
			new FieldSpec("m_022_031_VorgangNr", 47, 30, "java.lang.String",
					null),
			new FieldSpec("vermerk1", 48, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk2", 49, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk3", 50, 0, "java.lang.StringBuilder", null),
			new FieldSpec("vermerk4", 51, 0, "java.lang.StringBuilder", null),
			new FieldSpec("last_Kunden_DID", 52, 0, "int", null),
			new FieldSpec("last_Währung_DID", 53, 0, "int", null),
			new FieldSpec("_005_001_BezugsWährung_DID", 54, 0, "int", null),
			new FieldSpec("m_005_011__018_WährZeichen", 55, 5,
					"java.lang.String", null),
			new FieldSpec("buchungsKey", 56, 0, "int", null),
			new FieldSpec("buchStapelNr", 57, 0, "int", null),
			new FieldSpec("brutto_Euro", 58, 0, "double", null),
			new FieldSpec("netto_Euro", 59, 0, "double", null),
			new FieldSpec("kostenNetto", 60, 0, "double", null),
			new FieldSpec("fremdkostenNetto", 61, 0, "double", null),
			new FieldSpec("writeDocDID", 62, 0, "int", null),
			new FieldSpec("bezahlt_am", 63, 0, "java.sql.Date", null),
			new FieldSpec("mahnstopp", 64, 0, "boolean", null),
			new FieldSpec("_081_001_Kost1", 65, 0, "int", null),
			new FieldSpec("_081_001_Kost2", 66, 0, "int", null),
			new FieldSpec("mwst_Modus", 67, 0, "int", null),
			new FieldSpec("_066_001_LieferscheinDID", 68, 0, "int", null),
			new FieldSpec("lieferscheinnummer", 69, 0, "int", null),
			new FieldSpec("lieferDatum", 70, 0, "java.sql.Date", null) };

	// generierte Feldkonstanten - Ende

	public AusRech() {
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

	public void setRechnungsnummer(int inp) {
		rechnungsnummer = inp;
	}

	public int getRechnungsnummer()

	{
		return rechnungsnummer;
	}

	public void setRechnungsdatum(java.sql.Date inp) {
		rechnungsdatum = inp;
	}

	public java.sql.Date getRechnungsdatum()

	{
		return rechnungsdatum;
	}

	public void set_001_001_Mitarbeiter_DID_SB(int inp) {
		_001_001_Mitarbeiter_DID_SB = inp;
	}

	public int get_001_001_Mitarbeiter_DID_SB()

	{
		return _001_001_Mitarbeiter_DID_SB;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setBetrag_Netto(double inp) {
		betrag_Netto = inp;
	}

	public double getBetrag_Netto()

	{
		return betrag_Netto;
	}

	public void setBetrag_Brutto(double inp) {
		betrag_Brutto = inp;
	}

	public double getBetrag_Brutto()

	{
		return betrag_Brutto;
	}

	public void setBetrag_MwSt(double inp) {
		betrag_MwSt = inp;
	}

	public double getBetrag_MwSt()

	{
		return betrag_MwSt;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setKurs(double inp) {
		kurs = inp;
	}

	public double getKurs()

	{
		return kurs;
	}

	public void setM_005_011__054_WährZeichen(java.lang.String inp) {
		m_005_011__054_WährZeichen = inp;
	}

	public java.lang.String getM_005_011__054_WährZeichen()

	{
		return m_005_011__054_WährZeichen;
	}

	public void setMwSt_plichtig(boolean inp) {
		mwSt_plichtig = inp;
	}

	public boolean getMwSt_plichtig()

	{
		return mwSt_plichtig;
	}

	public void setGurschriftflag(boolean inp) {
		gurschriftflag = inp;
	}

	public boolean getGurschriftflag()

	{
		return gurschriftflag;
	}

	public void setProforma(boolean inp) {
		proforma = inp;
	}

	public boolean getProforma()

	{
		return proforma;
	}

	public void setStorniert(boolean inp) {
		storniert = inp;
	}

	public boolean getStorniert()

	{
		return storniert;
	}

	public void setfällig(java.sql.Date inp) {
		fällig = inp;
	}

	public java.sql.Date getfällig()

	{
		return fällig;
	}

	public void setBetragBezahlt(double inp) {
		betragBezahlt = inp;
	}

	public double getBetragBezahlt()

	{
		return betragBezahlt;
	}

	public void setSkontoBetrag(double inp) {
		skontoBetrag = inp;
	}

	public double getSkontoBetrag()

	{
		return skontoBetrag;
	}

	public void setMahnung_Nr1(java.sql.Date inp) {
		mahnung_Nr1 = inp;
	}

	public java.sql.Date getMahnung_Nr1()

	{
		return mahnung_Nr1;
	}

	public void setLetzte_Mahnung_am(java.sql.Date inp) {
		letzte_Mahnung_am = inp;
	}

	public java.sql.Date getLetzte_Mahnung_am()

	{
		return letzte_Mahnung_am;
	}

	public void setMahnstufe(int inp) {
		mahnstufe = inp;
	}

	public int getMahnstufe()

	{
		return mahnstufe;
	}

	public void setBezahlt(boolean inp) {
		bezahlt = inp;
	}

	public boolean getBezahlt()

	{
		return bezahlt;
	}

	public void setGebucht(boolean inp) {
		gebucht = inp;
	}

	public boolean getGebucht()

	{
		return gebucht;
	}

	public void set_030_001_BuchposDID(int inp) {
		_030_001_BuchposDID = inp;
	}

	public int get_030_001_BuchposDID()

	{
		return _030_001_BuchposDID;
	}

	public void setBHExportDatum(java.sql.Date inp) {
		bHExportDatum = inp;
	}

	public java.sql.Date getBHExportDatum()

	{
		return bHExportDatum;
	}

	public void setBHExportZeit(java.sql.Time inp) {
		bHExportZeit = inp;
	}

	public java.sql.Time getBHExportZeit()

	{
		return bHExportZeit;
	}

	public void set_001_001_Mitarbeiter_DID_BH(int inp) {
		_001_001_Mitarbeiter_DID_BH = inp;
	}

	public int get_001_001_Mitarbeiter_DID_BH()

	{
		return _001_001_Mitarbeiter_DID_BH;
	}

	public void setBemerkung(java.lang.String inp) {
		bemerkung = inp;
	}

	public java.lang.String getBemerkung()

	{
		return bemerkung;
	}

	public void set_006_001_Konten_DID(int inp) {
		_006_001_Konten_DID = inp;
	}

	public int get_006_001_Konten_DID()

	{
		return _006_001_Konten_DID;
	}

	public void setM_006_011_KontoNummer(int inp) {
		m_006_011_KontoNummer = inp;
	}

	public int getM_006_011_KontoNummer()

	{
		return m_006_011_KontoNummer;
	}

	public void set_009_001_Adressen_DID_RG(int inp) {
		_009_001_Adressen_DID_RG = inp;
	}

	public int get_009_001_Adressen_DID_RG()

	{
		return _009_001_Adressen_DID_RG;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setM_068_026_Kunden_Firmenname(java.lang.String inp) {
		m_068_026_Kunden_Firmenname = inp;
	}

	public java.lang.String getM_068_026_Kunden_Firmenname()

	{
		return m_068_026_Kunden_Firmenname;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void set_012_001_Zahlungsbed_DID(int inp) {
		_012_001_Zahlungsbed_DID = inp;
	}

	public int get_012_001_Zahlungsbed_DID()

	{
		return _012_001_Zahlungsbed_DID;
	}

	public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
		m_009_011_Adressen_Firmenname = inp;
	}

	public java.lang.String getM_009_011_Adressen_Firmenname()

	{
		return m_009_011_Adressen_Firmenname;
	}

	public void setM_009_014_Adressen_Nachname(java.lang.String inp) {
		m_009_014_Adressen_Nachname = inp;
	}

	public java.lang.String getM_009_014_Adressen_Nachname()

	{
		return m_009_014_Adressen_Nachname;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
	}

	public void setVermerk1(java.lang.StringBuilder inp) {
		vermerk1 = inp;
	}

	public java.lang.StringBuilder getVermerk1()

	{
		return vermerk1;
	}

	public void setVermerk2(java.lang.StringBuilder inp) {
		vermerk2 = inp;
	}

	public java.lang.StringBuilder getVermerk2()

	{
		return vermerk2;
	}

	public void setVermerk3(java.lang.StringBuilder inp) {
		vermerk3 = inp;
	}

	public java.lang.StringBuilder getVermerk3()

	{
		return vermerk3;
	}

	public void setVermerk4(java.lang.StringBuilder inp) {
		vermerk4 = inp;
	}

	public java.lang.StringBuilder getVermerk4()

	{
		return vermerk4;
	}

	public void setLast_Kunden_DID(int inp) {
		last_Kunden_DID = inp;
	}

	public int getLast_Kunden_DID()

	{
		return last_Kunden_DID;
	}

	public void setLast_Währung_DID(int inp) {
		last_Währung_DID = inp;
	}

	public int getLast_Währung_DID()

	{
		return last_Währung_DID;
	}

	public void set_005_001_BezugsWährung_DID(int inp) {
		_005_001_BezugsWährung_DID = inp;
	}

	public int get_005_001_BezugsWährung_DID()

	{
		return _005_001_BezugsWährung_DID;
	}

	public void setM_005_011__018_WährZeichen(java.lang.String inp) {
		m_005_011__018_WährZeichen = inp;
	}

	public java.lang.String getM_005_011__018_WährZeichen()

	{
		return m_005_011__018_WährZeichen;
	}

	public void setBuchungsKey(int inp) {
		buchungsKey = inp;
	}

	public int getBuchungsKey()

	{
		return buchungsKey;
	}

	public void setBuchStapelNr(int inp) {
		buchStapelNr = inp;
	}

	public int getBuchStapelNr()

	{
		return buchStapelNr;
	}

	public void setBrutto_Euro(double inp) {
		brutto_Euro = inp;
	}

	public double getBrutto_Euro()

	{
		return brutto_Euro;
	}

	public void setNetto_Euro(double inp) {
		netto_Euro = inp;
	}

	public double getNetto_Euro()

	{
		return netto_Euro;
	}

	public void setKostenNetto(double inp) {
		kostenNetto = inp;
	}

	public double getKostenNetto()

	{
		return kostenNetto;
	}

	public void setFremdkostenNetto(double inp) {
		fremdkostenNetto = inp;
	}

	public double getFremdkostenNetto()

	{
		return fremdkostenNetto;
	}

	public void setWriteDocDID(int inp) {
		writeDocDID = inp;
	}

	public int getWriteDocDID()

	{
		return writeDocDID;
	}

	public void setBezahlt_am(java.sql.Date inp) {
		bezahlt_am = inp;
	}

	public java.sql.Date getBezahlt_am()

	{
		return bezahlt_am;
	}

	public void setMahnstopp(boolean inp) {
		mahnstopp = inp;
	}

	public boolean getMahnstopp()

	{
		return mahnstopp;
	}

	public void set_081_001_Kost1(int inp) {
		_081_001_Kost1 = inp;
	}

	public int get_081_001_Kost1()

	{
		return _081_001_Kost1;
	}

	public void set_081_001_Kost2(int inp) {
		_081_001_Kost2 = inp;
	}

	public int get_081_001_Kost2()

	{
		return _081_001_Kost2;
	}

	public void setMwst_Modus(int inp) {
		mwst_Modus = inp;
	}

	public int getMwst_Modus()

	{
		return mwst_Modus;
	}

	public void set_066_001_LieferscheinDID(int inp) {
		_066_001_LieferscheinDID = inp;
	}

	public int get_066_001_LieferscheinDID()

	{
		return _066_001_LieferscheinDID;
	}

	public void setLieferscheinnummer(int inp) {
		lieferscheinnummer = inp;
	}

	public int getLieferscheinnummer()

	{
		return lieferscheinnummer;
	}

	public void setLieferDatum(java.sql.Date inp) {
		lieferDatum = inp;
	}

	public java.sql.Date getLieferDatum()

	{
		return lieferDatum;
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
