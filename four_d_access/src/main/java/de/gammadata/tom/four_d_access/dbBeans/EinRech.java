/*
 * EinRech.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 84 mit dem Namen "EinRech"
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

public class EinRech extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EinRech";
	public static final int dbTabNummer = 84;
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
	public static int _060_001_Lieferanten_DID_Fn = 13;
	public static int betrag_Brutto_Fn = 14;
	public static int betrag_MwSt_Fn = 15;
	public static int _005_001_Währungen_DID_Fn = 16;
	public static int kurs_Fn = 17;
	public static int m_012_011_ZahlbedKBZ_Fn = 18;
	public static int _012_001_Zahlungsbed_DID_Fn = 19;
	public static int bezahlt_Fn = 20;
	public static int mahnstufe_Fn = 21;
	public static int lfdNr_Fn = 22;
	public static int gutschrift_Fn = 23;
	public static int storniert_Fn = 24;
	public static int gebucht_Fn = 25;
	public static int _030_001_BuchposDID_Fn = 26;
	public static int buchungslaufdatum_Fn = 27;
	public static int buchungslaufZeit_Fn = 28;
	public static int _001_001_Mitarbeiter_DID_BH_Fn = 29;
	public static int bemerkung_Fn = 30;
	public static int m_060_011_Lieferanten_Nr_Fn = 31;
	public static int m_060_025_Lief_Firmenname_Fn = 32;
	public static int betrag_Netto_Fn = 33;
	public static int fällig_am_Fn = 34;
	public static int skontodatum_Fn = 35;
	public static int m_012_013_ZahlBedSkonto_Fn = 36;
	public static int _001_001_Mitarbeiter_DID_SB_Fn = 37;
	public static int last_Lieferanten_DID_Fn = 38;
	public static int _022_001_Vorgang_DID_Fn = 39;
	public static int m_022_031__039_VorgangNr_Fn = 40;
	public static int _005_001_BezugsWährung_DID_Fn = 41;
	public static int mwSt_plichtig_Fn = 42;
	public static int last_Währungen_DID_Fn = 43;
	public static int m_005_011__016_WährZeichen_Fn = 44;
	public static int _006_001_Sonderkonto_DID_Fn = 45;
	public static int m_082_011__026_BuchStapelNr_Fn = 46;
	public static int heute_zahlen_Fn = 47;
	public static int _006_001_Geldkonten_DID_Fn = 48;
	public static int betrag_Bezahlt_Fn = 49;
	public static int betrag_Skonto_Fn = 50;
	public static int zahlstopp_Fn = 51;
	public static int zahldatum_Fn = 52;
	public static int brutto_Euro_Fn = 53;
	public static int netto_Euro_Fn = 54;
	public static int rechsummeNetto_Fn = 55;
	public static int rechsummeBrutto_Fn = 56;
	public static int _081_001_Kost1_Fn = 57;
	public static int _081_001_Kost2_Fn = 58;

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
	private java.lang.String rechnungsnummer = "";
	private java.sql.Date rechnungsdatum = new java.sql.Date(0);
	private int _060_001_Lieferanten_DID = 0;
	private double betrag_Brutto = 0;
	private double betrag_MwSt = 0;
	private int _005_001_Währungen_DID = 0;
	private double kurs = 0;
	private java.lang.String m_012_011_ZahlbedKBZ = "";
	private int _012_001_Zahlungsbed_DID = 0;
	private boolean bezahlt = false;
	private int mahnstufe = 0;
	private int lfdNr = 0;
	private boolean gutschrift = false;
	private boolean storniert = false;
	private boolean gebucht = false;
	private int _030_001_BuchposDID = 0;
	private java.sql.Date buchungslaufdatum = new java.sql.Date(0);
	private java.sql.Time buchungslaufZeit = new java.sql.Time(0);
	private int _001_001_Mitarbeiter_DID_BH = 0;
	private java.lang.StringBuilder bemerkung = new java.lang.StringBuilder();
	private int m_060_011_Lieferanten_Nr = 0;
	private java.lang.String m_060_025_Lief_Firmenname = "";
	private double betrag_Netto = 0;
	private java.sql.Date fällig_am = new java.sql.Date(0);
	private java.sql.Date skontodatum = new java.sql.Date(0);
	private boolean m_012_013_ZahlBedSkonto = false;
	private int _001_001_Mitarbeiter_DID_SB = 0;
	private int last_Lieferanten_DID = 0;
	private int _022_001_Vorgang_DID = 0;
	private java.lang.String m_022_031__039_VorgangNr = "";
	private int _005_001_BezugsWährung_DID = 0;
	private boolean mwSt_plichtig = false;
	private int last_Währungen_DID = 0;
	private java.lang.String m_005_011__016_WährZeichen = "";
	private int _006_001_Sonderkonto_DID = 0;
	private int m_082_011__026_BuchStapelNr = 0;
	private boolean heute_zahlen = false;
	private int _006_001_Geldkonten_DID = 0;
	private double betrag_Bezahlt = 0;
	private double betrag_Skonto = 0;
	private boolean zahlstopp = false;
	private java.sql.Date zahldatum = new java.sql.Date(0);
	private double brutto_Euro = 0;
	private double netto_Euro = 0;
	private double rechsummeNetto = 0;
	private double rechsummeBrutto = 0;
	private int _081_001_Kost1 = 0;
	private int _081_001_Kost2 = 0;
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
			new FieldSpec("rechnungsnummer", 11, 20, "java.lang.String", null),
			new FieldSpec("rechnungsdatum", 12, 0, "java.sql.Date", null),
			new FieldSpec("_060_001_Lieferanten_DID", 13, 0, "int",
					new OneObjectPointer(60, 1, "Lieferanten", "dID")),
			new FieldSpec("betrag_Brutto", 14, 0, "double", null),
			new FieldSpec("betrag_MwSt", 15, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 16, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("kurs", 17, 0, "double", null),
			new FieldSpec("m_012_011_ZahlbedKBZ", 18, 32, "java.lang.String",
					null),
			new FieldSpec("_012_001_Zahlungsbed_DID", 19, 0, "int",
					new OneObjectPointer(12, 1, "Zahlungsbed", "dID")),
			new FieldSpec("bezahlt", 20, 0, "boolean", null),
			new FieldSpec("mahnstufe", 21, 0, "int", null),
			new FieldSpec("lfdNr", 22, 0, "int", null),
			new FieldSpec("gutschrift", 23, 0, "boolean", null),
			new FieldSpec("storniert", 24, 0, "boolean", null),
			new FieldSpec("gebucht", 25, 0, "boolean", null),
			new FieldSpec("_030_001_BuchposDID", 26, 0, "int",
					new OneObjectPointer(30, 1, "BuchposDID", "")),
			new FieldSpec("buchungslaufdatum", 27, 0, "java.sql.Date", null),
			new FieldSpec("buchungslaufZeit", 28, 0, "java.sql.Time", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_BH", 29, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID_BH")),
			new FieldSpec("bemerkung", 30, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("m_060_011_Lieferanten_Nr", 31, 0, "int", null),
			new FieldSpec("m_060_025_Lief_Firmenname", 32, 40,
					"java.lang.String", null),
			new FieldSpec("betrag_Netto", 33, 0, "double", null),
			new FieldSpec("fällig_am", 34, 0, "java.sql.Date", null),
			new FieldSpec("skontodatum", 35, 0, "java.sql.Date", null),
			new FieldSpec("m_012_013_ZahlBedSkonto", 36, 0, "boolean", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_SB", 37, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID_SB")),
			new FieldSpec("last_Lieferanten_DID", 38, 0, "int", null),
			new FieldSpec("_022_001_Vorgang_DID", 39, 0, "int",
					new OneObjectPointer(22, 1, "Vorgang", "dID")),
			new FieldSpec("m_022_031__039_VorgangNr", 40, 30,
					"java.lang.String", null),
			new FieldSpec("_005_001_BezugsWährung_DID", 41, 0, "int",
					new OneObjectPointer(5, 1, "BezugsWährung", "dID")),
			new FieldSpec("mwSt_plichtig", 42, 0, "boolean", null),
			new FieldSpec("last_Währungen_DID", 43, 0, "int", null),
			new FieldSpec("m_005_011__016_WährZeichen", 44, 5,
					"java.lang.String", null),
			new FieldSpec("_006_001_Sonderkonto_DID", 45, 0, "int",
					new OneObjectPointer(6, 1, "Sonderkonto", "dID")),
			new FieldSpec("m_082_011__026_BuchStapelNr", 46, 0, "int", null),
			new FieldSpec("heute_zahlen", 47, 0, "boolean", null),
			new FieldSpec("_006_001_Geldkonten_DID", 48, 0, "int",
					new OneObjectPointer(6, 1, "Geldkonten", "dID")),
			new FieldSpec("betrag_Bezahlt", 49, 0, "double", null),
			new FieldSpec("betrag_Skonto", 50, 0, "double", null),
			new FieldSpec("zahlstopp", 51, 0, "boolean", null),
			new FieldSpec("zahldatum", 52, 0, "java.sql.Date", null),
			new FieldSpec("brutto_Euro", 53, 0, "double", null),
			new FieldSpec("netto_Euro", 54, 0, "double", null),
			new FieldSpec("rechsummeNetto", 55, 0, "double", null),
			new FieldSpec("rechsummeBrutto", 56, 0, "double", null),
			new FieldSpec("_081_001_Kost1", 57, 0, "int", new OneObjectPointer(
					81, 1, "Kost1", "")),
			new FieldSpec("_081_001_Kost2", 58, 0, "int", new OneObjectPointer(
					81, 1, "Kost2", "")) };

	// generierte Feldkonstanten - Ende

	public EinRech() {
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

	public void setRechnungsnummer(java.lang.String inp) {
		rechnungsnummer = inp;
	}

	public java.lang.String getRechnungsnummer()

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

	public void set_060_001_Lieferanten_DID(int inp) {
		_060_001_Lieferanten_DID = inp;
	}

	public int get_060_001_Lieferanten_DID()

	{
		return _060_001_Lieferanten_DID;
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

	public void setM_012_011_ZahlbedKBZ(java.lang.String inp) {
		m_012_011_ZahlbedKBZ = inp;
	}

	public java.lang.String getM_012_011_ZahlbedKBZ()

	{
		return m_012_011_ZahlbedKBZ;
	}

	public void set_012_001_Zahlungsbed_DID(int inp) {
		_012_001_Zahlungsbed_DID = inp;
	}

	public int get_012_001_Zahlungsbed_DID()

	{
		return _012_001_Zahlungsbed_DID;
	}

	public void setBezahlt(boolean inp) {
		bezahlt = inp;
	}

	public boolean getBezahlt()

	{
		return bezahlt;
	}

	public void setMahnstufe(int inp) {
		mahnstufe = inp;
	}

	public int getMahnstufe()

	{
		return mahnstufe;
	}

	public void setLfdNr(int inp) {
		lfdNr = inp;
	}

	public int getLfdNr()

	{
		return lfdNr;
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

	public void setBuchungslaufdatum(java.sql.Date inp) {
		buchungslaufdatum = inp;
	}

	public java.sql.Date getBuchungslaufdatum()

	{
		return buchungslaufdatum;
	}

	public void setBuchungslaufZeit(java.sql.Time inp) {
		buchungslaufZeit = inp;
	}

	public java.sql.Time getBuchungslaufZeit()

	{
		return buchungslaufZeit;
	}

	public void set_001_001_Mitarbeiter_DID_BH(int inp) {
		_001_001_Mitarbeiter_DID_BH = inp;
	}

	public int get_001_001_Mitarbeiter_DID_BH()

	{
		return _001_001_Mitarbeiter_DID_BH;
	}

	public void setBemerkung(java.lang.StringBuilder inp) {
		bemerkung = inp;
	}

	public java.lang.StringBuilder getBemerkung()

	{
		return bemerkung;
	}

	public void setM_060_011_Lieferanten_Nr(int inp) {
		m_060_011_Lieferanten_Nr = inp;
	}

	public int getM_060_011_Lieferanten_Nr()

	{
		return m_060_011_Lieferanten_Nr;
	}

	public void setM_060_025_Lief_Firmenname(java.lang.String inp) {
		m_060_025_Lief_Firmenname = inp;
	}

	public java.lang.String getM_060_025_Lief_Firmenname()

	{
		return m_060_025_Lief_Firmenname;
	}

	public void setBetrag_Netto(double inp) {
		betrag_Netto = inp;
	}

	public double getBetrag_Netto()

	{
		return betrag_Netto;
	}

	public void setFällig_am(java.sql.Date inp) {
		fällig_am = inp;
	}

	public java.sql.Date getFällig_am()

	{
		return fällig_am;
	}

	public void setSkontodatum(java.sql.Date inp) {
		skontodatum = inp;
	}

	public java.sql.Date getSkontodatum()

	{
		return skontodatum;
	}

	public void setM_012_013_ZahlBedSkonto(boolean inp) {
		m_012_013_ZahlBedSkonto = inp;
	}

	public boolean getM_012_013_ZahlBedSkonto()

	{
		return m_012_013_ZahlBedSkonto;
	}

	public void set_001_001_Mitarbeiter_DID_SB(int inp) {
		_001_001_Mitarbeiter_DID_SB = inp;
	}

	public int get_001_001_Mitarbeiter_DID_SB()

	{
		return _001_001_Mitarbeiter_DID_SB;
	}

	public void setLast_Lieferanten_DID(int inp) {
		last_Lieferanten_DID = inp;
	}

	public int getLast_Lieferanten_DID()

	{
		return last_Lieferanten_DID;
	}

	public void set_022_001_Vorgang_DID(int inp) {
		_022_001_Vorgang_DID = inp;
	}

	public int get_022_001_Vorgang_DID()

	{
		return _022_001_Vorgang_DID;
	}

	public void setM_022_031__039_VorgangNr(java.lang.String inp) {
		m_022_031__039_VorgangNr = inp;
	}

	public java.lang.String getM_022_031__039_VorgangNr()

	{
		return m_022_031__039_VorgangNr;
	}

	public void set_005_001_BezugsWährung_DID(int inp) {
		_005_001_BezugsWährung_DID = inp;
	}

	public int get_005_001_BezugsWährung_DID()

	{
		return _005_001_BezugsWährung_DID;
	}

	public void setMwSt_plichtig(boolean inp) {
		mwSt_plichtig = inp;
	}

	public boolean getMwSt_plichtig()

	{
		return mwSt_plichtig;
	}

	public void setLast_Währungen_DID(int inp) {
		last_Währungen_DID = inp;
	}

	public int getLast_Währungen_DID()

	{
		return last_Währungen_DID;
	}

	public void setM_005_011__016_WährZeichen(java.lang.String inp) {
		m_005_011__016_WährZeichen = inp;
	}

	public java.lang.String getM_005_011__016_WährZeichen()

	{
		return m_005_011__016_WährZeichen;
	}

	public void set_006_001_Sonderkonto_DID(int inp) {
		_006_001_Sonderkonto_DID = inp;
	}

	public int get_006_001_Sonderkonto_DID()

	{
		return _006_001_Sonderkonto_DID;
	}

	public void setM_082_011__026_BuchStapelNr(int inp) {
		m_082_011__026_BuchStapelNr = inp;
	}

	public int getM_082_011__026_BuchStapelNr()

	{
		return m_082_011__026_BuchStapelNr;
	}

	public void setHeute_zahlen(boolean inp) {
		heute_zahlen = inp;
	}

	public boolean getHeute_zahlen()

	{
		return heute_zahlen;
	}

	public void set_006_001_Geldkonten_DID(int inp) {
		_006_001_Geldkonten_DID = inp;
	}

	public int get_006_001_Geldkonten_DID()

	{
		return _006_001_Geldkonten_DID;
	}

	public void setBetrag_Bezahlt(double inp) {
		betrag_Bezahlt = inp;
	}

	public double getBetrag_Bezahlt()

	{
		return betrag_Bezahlt;
	}

	public void setBetrag_Skonto(double inp) {
		betrag_Skonto = inp;
	}

	public double getBetrag_Skonto()

	{
		return betrag_Skonto;
	}

	public void setZahlstopp(boolean inp) {
		zahlstopp = inp;
	}

	public boolean getZahlstopp()

	{
		return zahlstopp;
	}

	public void setZahldatum(java.sql.Date inp) {
		zahldatum = inp;
	}

	public java.sql.Date getZahldatum()

	{
		return zahldatum;
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

	public void setRechsummeNetto(double inp) {
		rechsummeNetto = inp;
	}

	public double getRechsummeNetto()

	{
		return rechsummeNetto;
	}

	public void setRechsummeBrutto(double inp) {
		rechsummeBrutto = inp;
	}

	public double getRechsummeBrutto()

	{
		return rechsummeBrutto;
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
