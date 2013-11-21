/*
 * Vorgangsverwaltung.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 22 mit dem Namen "Vorgangsverwaltung"
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

public class Vorgangsverwaltung extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Vorgangsverwaltung";
	public static final int dbTabNummer = 22;
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
	public static int vorgangKBZ_Fn = 11;
	public static int beschreibung_Fn = 12;
	public static int last_Kunden_DID_Fn = 13;
	public static int _001_001_Mitarbeiter_DID_Fn = 14;
	public static int startDatum_Fn = 15;
	public static int endDatum_Fn = 16;
	public static int aktVerrVK_Fn = 17;
	public static int aktErldVK_Fn = 18;
	public static int aktNwvrVK_Fn = 19;
	public static int _024_001__Projektverwaltung_DID_Fn = 20;
	public static int ertragsrechnung_Währungszeichen_Fn = 21;
	public static int erledigt_Fn = 22;
	public static int matVerrVK_Fn = 23;
	public static int m_068_026_Kunden_Firmenname_Fn = 24;
	public static int m_068_027_Kunden_Nachname_Fn = 25;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 26;
	public static int jobinArbeit_Fn = 27;
	public static int farbcode_Fn = 28;
	public static int _068_001_Kunden_DID_Fn = 29;
	public static int m_068_011_KundenNr_Fn = 30;
	public static int vorgangNr_Fn = 31;
	public static int ertragsrechnung_am_Fn = 32;
	public static int sumAuf1_Fn = 33;
	public static int sumRech1_Fn = 34;
	public static int sumRest1_Fn = 35;
	public static int sumERech2_Fn = 36;
	public static int sumTät2_Fn = 37;
	public static int sumMat2_Fn = 38;
	public static int sumERech3_Fn = 39;
	public static int sumBest3_Fn = 40;
	public static int sumBest3b_Fn = 41;
	public static int sumTät3_Fn = 42;
	public static int sumTät3b_Fn = 43;
	public static int sumMat3_Fn = 44;
	public static int aufwand_abgerechnet_Fn = 45;
	public static int profit1_Fn = 46;
	public static int matNverrVK_Fn = 47;
	public static int profit2_Fn = 48;
	public static int summe_Profit_geplant_Fn = 49;
	public static int sumERech4_Fn = 50;
	public static int sumTät4_Fn = 51;
	public static int sumMat4_Fn = 52;
	public static int profit3_Fn = 53;
	public static int m_024_011_ProjektKBZ_Fn = 54;
	public static int matNwvrVK_Fn = 55;
	public static int fremdkosten_Fn = 56;
	public static int eigenkosten_Fn = 57;
	public static int nicht_realisiert_Fn = 58;
	public static int jobFolder_Fn = 59;
	public static int _081_001_Kost1_Fn = 60;
	public static int _081_001_Kost2_Fn = 61;
	public static int _005_001_WaehrungDID_Fn = 62;
	public static int _009_001_Adressen_1_Fn = 63;
	public static int _009_001_Adressen_2_Fn = 64;
	public static int milestoneDatum_Fn = 65;
	public static int kommentar_Fn = 66;
	public static int berechnet_Fn = 67;
	public static int nachkalk_Fn = 68;
	public static int job_Status_Fn = 69;
	public static int _032_001_Artikel_DID_Fn = 70;

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
	private java.lang.String vorgangKBZ = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private int last_Kunden_DID = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private java.sql.Date startDatum = new java.sql.Date(0);
	private java.sql.Date endDatum = new java.sql.Date(0);
	private double aktVerrVK = 0;
	private double aktErldVK = 0;
	private double aktNwvrVK = 0;
	private int _024_001__Projektverwaltung_DID = 0;
	private java.lang.String ertragsrechnung_Währungszeichen = "";
	private boolean erledigt = false;
	private double matVerrVK = 0;
	private java.lang.String m_068_026_Kunden_Firmenname = "";
	private java.lang.String m_068_027_Kunden_Nachname = "";
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private boolean jobinArbeit = false;
	private int farbcode = 0;
	private int _068_001_Kunden_DID = 0;
	private int m_068_011_KundenNr = 0;
	private java.lang.String vorgangNr = "";
	private java.sql.Date ertragsrechnung_am = new java.sql.Date(0);
	private double sumAuf1 = 0;
	private double sumRech1 = 0;
	private double sumRest1 = 0;
	private double sumERech2 = 0;
	private double sumTät2 = 0;
	private double sumMat2 = 0;
	private double sumERech3 = 0;
	private double sumBest3 = 0;
	private double sumBest3b = 0;
	private double sumTät3 = 0;
	private double sumTät3b = 0;
	private double sumMat3 = 0;
	private double aufwand_abgerechnet = 0;
	private double profit1 = 0;
	private double matNverrVK = 0;
	private double profit2 = 0;
	private double summe_Profit_geplant = 0;
	private double sumERech4 = 0;
	private double sumTät4 = 0;
	private double sumMat4 = 0;
	private double profit3 = 0;
	private java.lang.String m_024_011_ProjektKBZ = "";
	private double matNwvrVK = 0;
	private double fremdkosten = 0;
	private double eigenkosten = 0;
	private boolean nicht_realisiert = false;
	private java.lang.StringBuilder jobFolder = new java.lang.StringBuilder();
	private int _081_001_Kost1 = 0;
	private int _081_001_Kost2 = 0;
	private int _005_001_WaehrungDID = 0;
	private int _009_001_Adressen_1 = 0;
	private int _009_001_Adressen_2 = 0;
	private java.sql.Date milestoneDatum = new java.sql.Date(0);
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private boolean berechnet = false;
	private boolean nachkalk = false;
	private java.lang.String job_Status = "";
	private int _032_001_Artikel_DID = 0;
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
			new FieldSpec("vorgangKBZ", 11, 80, "java.lang.String", null),
			new FieldSpec("beschreibung", 12, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("last_Kunden_DID", 13, 0, "int", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 14, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("startDatum", 15, 0, "java.sql.Date", null),
			new FieldSpec("endDatum", 16, 0, "java.sql.Date", null),
			new FieldSpec("aktVerrVK", 17, 0, "double", null),
			new FieldSpec("aktErldVK", 18, 0, "double", null),
			new FieldSpec("aktNwvrVK", 19, 0, "double", null),
			new FieldSpec("_024_001__Projektverwaltung_DID", 20, 0, "int",
					new OneObjectPointer(24, 1, "Projektverwaltung", "dID")),
			new FieldSpec("ertragsrechnung_Währungszeichen", 21, 5,
					"java.lang.String", null),
			new FieldSpec("erledigt", 22, 0, "boolean", null),
			new FieldSpec("matVerrVK", 23, 0, "double", null),
			new FieldSpec("m_068_026_Kunden_Firmenname", 24, 40,
					"java.lang.String", null),
			new FieldSpec("m_068_027_Kunden_Nachname", 25, 40,
					"java.lang.String", null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 26, 5,
					"java.lang.String", null),
			new FieldSpec("jobinArbeit", 27, 0, "boolean", null),
			new FieldSpec("farbcode", 28, 0, "int", null),
			new FieldSpec("_068_001_Kunden_DID", 29, 0, "int",
					new OneObjectPointer(68, 1, "Kunden", "dID")),
			new FieldSpec("m_068_011_KundenNr", 30, 0, "int", null),
			new FieldSpec("vorgangNr", 31, 30, "java.lang.String", null),
			new FieldSpec("ertragsrechnung_am", 32, 0, "java.sql.Date", null),
			new FieldSpec("sumAuf1", 33, 0, "double", null),
			new FieldSpec("sumRech1", 34, 0, "double", null),
			new FieldSpec("sumRest1", 35, 0, "double", null),
			new FieldSpec("sumERech2", 36, 0, "double", null),
			new FieldSpec("sumTät2", 37, 0, "double", null),
			new FieldSpec("sumMat2", 38, 0, "double", null),
			new FieldSpec("sumERech3", 39, 0, "double", null),
			new FieldSpec("sumBest3", 40, 0, "double", null),
			new FieldSpec("sumBest3b", 41, 0, "double", null),
			new FieldSpec("sumTät3", 42, 0, "double", null),
			new FieldSpec("sumTät3b", 43, 0, "double", null),
			new FieldSpec("sumMat3", 44, 0, "double", null),
			new FieldSpec("aufwand_abgerechnet", 45, 0, "double", null),
			new FieldSpec("profit1", 46, 0, "double", null),
			new FieldSpec("matNverrVK", 47, 0, "double", null),
			new FieldSpec("profit2", 48, 0, "double", null),
			new FieldSpec("summe_Profit_geplant", 49, 0, "double", null),
			new FieldSpec("sumERech4", 50, 0, "double", null),
			new FieldSpec("sumTät4", 51, 0, "double", null),
			new FieldSpec("sumMat4", 52, 0, "double", null),
			new FieldSpec("profit3", 53, 0, "double", null),
			new FieldSpec("m_024_011_ProjektKBZ", 54, 40, "java.lang.String",
					null),
			new FieldSpec("matNwvrVK", 55, 0, "double", null),
			new FieldSpec("fremdkosten", 56, 0, "double", null),
			new FieldSpec("eigenkosten", 57, 0, "double", null),
			new FieldSpec("nicht_realisiert", 58, 0, "boolean", null),
			new FieldSpec("jobFolder", 59, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("_081_001_Kost1", 60, 0, "int", new OneObjectPointer(
					81, 1, "Kost1", "")),
			new FieldSpec("_081_001_Kost2", 61, 0, "int", new OneObjectPointer(
					81, 1, "Kost2", "")),
			new FieldSpec("_005_001_WaehrungDID", 62, 0, "int",
					new OneObjectPointer(5, 1, "WaehrungDID", "")),
			new FieldSpec("_009_001_Adressen_1", 63, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "1")),
			new FieldSpec("_009_001_Adressen_2", 64, 0, "int",
					new OneObjectPointer(9, 1, "Adressen", "2")),
			new FieldSpec("milestoneDatum", 65, 0, "java.sql.Date", null),
			new FieldSpec("kommentar", 66, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("berechnet", 67, 0, "boolean", null),
			new FieldSpec("nachkalk", 68, 0, "boolean", null),
			new FieldSpec("job_Status", 69, 80, "java.lang.String", null),
			new FieldSpec("_032_001_Artikel_DID", 70, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")) };

	// generierte Feldkonstanten - Ende

	public Vorgangsverwaltung() {
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

	public void setVorgangKBZ(java.lang.String inp) {
		vorgangKBZ = inp;
	}

	public java.lang.String getVorgangKBZ()

	{
		return vorgangKBZ;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setLast_Kunden_DID(int inp) {
		last_Kunden_DID = inp;
	}

	public int getLast_Kunden_DID()

	{
		return last_Kunden_DID;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setStartDatum(java.sql.Date inp) {
		startDatum = inp;
	}

	public java.sql.Date getStartDatum()

	{
		return startDatum;
	}

	public void setEndDatum(java.sql.Date inp) {
		endDatum = inp;
	}

	public java.sql.Date getEndDatum()

	{
		return endDatum;
	}

	public void setAktVerrVK(double inp) {
		aktVerrVK = inp;
	}

	public double getAktVerrVK()

	{
		return aktVerrVK;
	}

	public void setAktErldVK(double inp) {
		aktErldVK = inp;
	}

	public double getAktErldVK()

	{
		return aktErldVK;
	}

	public void setAktNwvrVK(double inp) {
		aktNwvrVK = inp;
	}

	public double getAktNwvrVK()

	{
		return aktNwvrVK;
	}

	public void set_024_001__Projektverwaltung_DID(int inp) {
		_024_001__Projektverwaltung_DID = inp;
	}

	public int get_024_001__Projektverwaltung_DID()

	{
		return _024_001__Projektverwaltung_DID;
	}

	public void setErtragsrechnung_Währungszeichen(java.lang.String inp) {
		ertragsrechnung_Währungszeichen = inp;
	}

	public java.lang.String getErtragsrechnung_Währungszeichen()

	{
		return ertragsrechnung_Währungszeichen;
	}

	public void setErledigt(boolean inp) {
		erledigt = inp;
	}

	public boolean getErledigt()

	{
		return erledigt;
	}

	public void setMatVerrVK(double inp) {
		matVerrVK = inp;
	}

	public double getMatVerrVK()

	{
		return matVerrVK;
	}

	public void setM_068_026_Kunden_Firmenname(java.lang.String inp) {
		m_068_026_Kunden_Firmenname = inp;
	}

	public java.lang.String getM_068_026_Kunden_Firmenname()

	{
		return m_068_026_Kunden_Firmenname;
	}

	public void setM_068_027_Kunden_Nachname(java.lang.String inp) {
		m_068_027_Kunden_Nachname = inp;
	}

	public java.lang.String getM_068_027_Kunden_Nachname()

	{
		return m_068_027_Kunden_Nachname;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setJobinArbeit(boolean inp) {
		jobinArbeit = inp;
	}

	public boolean getJobinArbeit()

	{
		return jobinArbeit;
	}

	public void setFarbcode(int inp) {
		farbcode = inp;
	}

	public int getFarbcode()

	{
		return farbcode;
	}

	public void set_068_001_Kunden_DID(int inp) {
		_068_001_Kunden_DID = inp;
	}

	public int get_068_001_Kunden_DID()

	{
		return _068_001_Kunden_DID;
	}

	public void setM_068_011_KundenNr(int inp) {
		m_068_011_KundenNr = inp;
	}

	public int getM_068_011_KundenNr()

	{
		return m_068_011_KundenNr;
	}

	public void setVorgangNr(java.lang.String inp) {
		vorgangNr = inp;
	}

	public java.lang.String getVorgangNr()

	{
		return vorgangNr;
	}

	public void setErtragsrechnung_am(java.sql.Date inp) {
		ertragsrechnung_am = inp;
	}

	public java.sql.Date getErtragsrechnung_am()

	{
		return ertragsrechnung_am;
	}

	public void setSumAuf1(double inp) {
		sumAuf1 = inp;
	}

	public double getSumAuf1()

	{
		return sumAuf1;
	}

	public void setSumRech1(double inp) {
		sumRech1 = inp;
	}

	public double getSumRech1()

	{
		return sumRech1;
	}

	public void setSumRest1(double inp) {
		sumRest1 = inp;
	}

	public double getSumRest1()

	{
		return sumRest1;
	}

	public void setSumERech2(double inp) {
		sumERech2 = inp;
	}

	public double getSumERech2()

	{
		return sumERech2;
	}

	public void setSumTät2(double inp) {
		sumTät2 = inp;
	}

	public double getSumTät2()

	{
		return sumTät2;
	}

	public void setSumMat2(double inp) {
		sumMat2 = inp;
	}

	public double getSumMat2()

	{
		return sumMat2;
	}

	public void setSumERech3(double inp) {
		sumERech3 = inp;
	}

	public double getSumERech3()

	{
		return sumERech3;
	}

	public void setSumBest3(double inp) {
		sumBest3 = inp;
	}

	public double getSumBest3()

	{
		return sumBest3;
	}

	public void setSumBest3b(double inp) {
		sumBest3b = inp;
	}

	public double getSumBest3b()

	{
		return sumBest3b;
	}

	public void setSumTät3(double inp) {
		sumTät3 = inp;
	}

	public double getSumTät3()

	{
		return sumTät3;
	}

	public void setSumTät3b(double inp) {
		sumTät3b = inp;
	}

	public double getSumTät3b()

	{
		return sumTät3b;
	}

	public void setSumMat3(double inp) {
		sumMat3 = inp;
	}

	public double getSumMat3()

	{
		return sumMat3;
	}

	public void setAufwand_abgerechnet(double inp) {
		aufwand_abgerechnet = inp;
	}

	public double getAufwand_abgerechnet()

	{
		return aufwand_abgerechnet;
	}

	public void setProfit1(double inp) {
		profit1 = inp;
	}

	public double getProfit1()

	{
		return profit1;
	}

	public void setMatNverrVK(double inp) {
		matNverrVK = inp;
	}

	public double getMatNverrVK()

	{
		return matNverrVK;
	}

	public void setProfit2(double inp) {
		profit2 = inp;
	}

	public double getProfit2()

	{
		return profit2;
	}

	public void setSumme_Profit_geplant(double inp) {
		summe_Profit_geplant = inp;
	}

	public double getSumme_Profit_geplant()

	{
		return summe_Profit_geplant;
	}

	public void setSumERech4(double inp) {
		sumERech4 = inp;
	}

	public double getSumERech4()

	{
		return sumERech4;
	}

	public void setSumTät4(double inp) {
		sumTät4 = inp;
	}

	public double getSumTät4()

	{
		return sumTät4;
	}

	public void setSumMat4(double inp) {
		sumMat4 = inp;
	}

	public double getSumMat4()

	{
		return sumMat4;
	}

	public void setProfit3(double inp) {
		profit3 = inp;
	}

	public double getProfit3()

	{
		return profit3;
	}

	public void setM_024_011_ProjektKBZ(java.lang.String inp) {
		m_024_011_ProjektKBZ = inp;
	}

	public java.lang.String getM_024_011_ProjektKBZ()

	{
		return m_024_011_ProjektKBZ;
	}

	public void setMatNwvrVK(double inp) {
		matNwvrVK = inp;
	}

	public double getMatNwvrVK()

	{
		return matNwvrVK;
	}

	public void setFremdkosten(double inp) {
		fremdkosten = inp;
	}

	public double getFremdkosten()

	{
		return fremdkosten;
	}

	public void setEigenkosten(double inp) {
		eigenkosten = inp;
	}

	public double getEigenkosten()

	{
		return eigenkosten;
	}

	public void setNicht_realisiert(boolean inp) {
		nicht_realisiert = inp;
	}

	public boolean getNicht_realisiert()

	{
		return nicht_realisiert;
	}

	public void setJobFolder(java.lang.StringBuilder inp) {
		jobFolder = inp;
	}

	public java.lang.StringBuilder getJobFolder()

	{
		return jobFolder;
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

	public void set_005_001_WaehrungDID(int inp) {
		_005_001_WaehrungDID = inp;
	}

	public int get_005_001_WaehrungDID()

	{
		return _005_001_WaehrungDID;
	}

	public void set_009_001_Adressen_1(int inp) {
		_009_001_Adressen_1 = inp;
	}

	public int get_009_001_Adressen_1()

	{
		return _009_001_Adressen_1;
	}

	public void set_009_001_Adressen_2(int inp) {
		_009_001_Adressen_2 = inp;
	}

	public int get_009_001_Adressen_2()

	{
		return _009_001_Adressen_2;
	}

	public void setMilestoneDatum(java.sql.Date inp) {
		milestoneDatum = inp;
	}

	public java.sql.Date getMilestoneDatum()

	{
		return milestoneDatum;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setBerechnet(boolean inp) {
		berechnet = inp;
	}

	public boolean getBerechnet()

	{
		return berechnet;
	}

	public void setNachkalk(boolean inp) {
		nachkalk = inp;
	}

	public boolean getNachkalk()

	{
		return nachkalk;
	}

	public void setJob_Status(java.lang.String inp) {
		job_Status = inp;
	}

	public java.lang.String getJob_Status()

	{
		return job_Status;
	}

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
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
