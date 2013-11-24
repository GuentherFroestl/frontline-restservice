/*
 * Aufträge.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 67 mit dem Namen "Aufträge"
 *
 * 
 */
package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 *
 * @author gfr
 */
public class Auftraege extends BasicBean {

  private final boolean printon = true;
  public static final String xmlClassTag = "Aufträge";
  public static final int dbTabNummer = 67;
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
  public static int _068_001_Kunden_DID_Fn = 11;
  public static int lfd_Nr_Fn = 12;
  public static int ang_AuftragTyp_Fn = 13;
  public static int _009_001_Adressen_DID_AB_Fn = 14;
  public static int _009_001_Adressen_DID_LF_Fn = 15;
  public static int _009_001_Adressen_DID_RG_Fn = 16;
  public static int storno_Fn = 17;
  public static int soll_Haben_Fn = 18;
  public static int _022_001_Vorgang_DID_Fn = 19;
  public static int _001_001_Mitarbeiter_DID_VB_Fn = 20;
  public static int m_001_021__020_Ma_Kürzel_VB_Fn = 21;
  public static int _005_001_Währungen_DID_Fn = 22;
  public static int kurs_Fn = 23;
  public static int betrag_MwSt_Fn = 24;
  public static int betrag_Netto_Fn = 25;
  public static int auftragsKosten_Fn = 26;
  public static int vermerk1_Fn = 27;
  public static int vermerk2_Fn = 28;
  public static int vermerk3_Fn = 29;
  public static int vermerk4_Fn = 30;
  public static int _012_001_Zahlungsbed_DID_Fn = 31;
  public static int last_Kunden_DID_Fn = 32;
  public static int writePic__Fn = 33;
  public static int creditCheckFlag_Fn = 34;
  public static int lieferungOK_Fn = 35;
  public static int _001_001_Mitarbeiter_DID_Credit_Fn = 36;
  public static int checkDate_Fn = 37;
  public static int _001_001_Mitarbeiter_DID_SB_Fn = 38;
  public static int m_001_021__038_Ma_Kürzel_SB_Fn = 39;
  public static int m_009_011_Adressen_Firmenname_Fn = 40;
  public static int m_009_014_Adressen_Nachname_Fn = 41;
  public static int m_068_011_KundenNr_Fn = 42;
  public static int _035_001_WriteVorlagen_DID_Fn = 43;
  public static int eingangsdatum_Fn = 44;
  public static int betreff_Fn = 45;
  public static int m_022_031_VorgangNr_Fn = 46;
  public static int last_Währungen_DID_Fn = 47;
  public static int betrag_Brutto_Fn = 48;
  public static int mwSt_pflichtig_Fn = 49;
  public static int _005_001_BezugsWährung_DID_Fn = 50;
  public static int m_005_011__022_WährZeichen_Fn = 51;
  public static int abgeschlossen_Fn = 52;
  public static int muster_Fn = 53;
  public static int betrag_Euro_Fn = 54;
  public static int importDID_Fn = 55;
  public static int fremdkosten_Fn = 56;
  public static int preis_typ_Fn = 57;
  public static int uuid_Fn = 58;
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
  private int _068_001_Kunden_DID = 0;
  private int lfd_Nr = 0;
  private boolean ang_AuftragTyp = false;
  private int _009_001_Adressen_DID_AB = 0;
  private int _009_001_Adressen_DID_LF = 0;
  private int _009_001_Adressen_DID_RG = 0;
  private boolean storno = false;
  private boolean soll_Haben = false;
  private int _022_001_Vorgang_DID = 0;
  private int _001_001_Mitarbeiter_DID_VB = 0;
  private java.lang.String m_001_021__020_Ma_Kürzel_VB = "";
  private int _005_001_Währungen_DID = 0;
  private double kurs = 0;
  private double betrag_MwSt = 0;
  private double betrag_Netto = 0;
  private double auftragsKosten = 0;
  private java.lang.StringBuilder vermerk1 = new java.lang.StringBuilder();
  private java.lang.StringBuilder vermerk2 = new java.lang.StringBuilder();
  private java.lang.StringBuilder vermerk3 = new java.lang.StringBuilder();
  private java.lang.StringBuilder vermerk4 = new java.lang.StringBuilder();
  private int _012_001_Zahlungsbed_DID = 0;
  private int last_Kunden_DID = 0;
  private byte[] writePic_ = new byte[0];
  private boolean creditCheckFlag = false;
  private boolean lieferungOK = false;
  private int _001_001_Mitarbeiter_DID_Credit = 0;
  private java.sql.Date checkDate = new java.sql.Date(0);
  private int _001_001_Mitarbeiter_DID_SB = 0;
  private java.lang.String m_001_021__038_Ma_Kürzel_SB = "";
  private java.lang.String m_009_011_Adressen_Firmenname = "";
  private java.lang.String m_009_014_Adressen_Nachname = "";
  private int m_068_011_KundenNr = 0;
  private int _035_001_WriteVorlagen_DID = 0;
  private java.sql.Date eingangsdatum = new java.sql.Date(0);
  private java.lang.String betreff = "";
  private java.lang.String m_022_031_VorgangNr = "";
  private int last_Währungen_DID = 0;
  private double betrag_Brutto = 0;
  private boolean mwSt_pflichtig = false;
  private int _005_001_BezugsWährung_DID = 0;
  private java.lang.String m_005_011__022_WährZeichen = "";
  private boolean abgeschlossen = false;
  private boolean muster = false;
  private double betrag_Euro = 0;
  private int importDID = 0;
  private double fremdkosten = 0;
  private int preis_typ = 0;
  private String uuid = "";
  // generierte felder - Ende
  public static FieldSpec FIRMENNAME = new FieldSpec(
          "m_009_011_Adressen_Firmenname", 40, 80, "java.lang.String", null);
  public static FieldSpec NACHNAME = new FieldSpec(
          "m_009_014_Adressen_Nachname", 41, 80, "java.lang.String", null);
  public static FieldSpec ADR_ID = new FieldSpec("_009_001_Adressen_DID_AB",
          14, 0, "int", null);
  public static FieldSpec BELEGNUMMER = new FieldSpec("lfd_Nr", 12, 0, "int",
          null);
  public static FieldSpec BELEG_DATUM = new FieldSpec("eingangsdatum", 44, 0,
          "java.sql.Date", null);
  public static FieldSpec BETRAG_BRUTTO = new FieldSpec("betrag_Brutto", 48,
          0, "double", null);
  public static FieldSpec BETRAG_NETTO = new FieldSpec("betrag_Netto", 25, 0,
          "double", null);
  public static FieldSpec WRG_BEZEICHNUNG = new FieldSpec(
          "m_005_011__022_WährZeichen", 51, 5, "java.lang.String", null);
  public static FieldSpec MANDANT = new FieldSpec("dMandant", 6, 0, "int",
          null);
  public static FieldSpec ABGESCHLOSSEN = new FieldSpec("abgeschlossen", 52,
          0, "boolean", null);
  public static FieldSpec TYP_ANGEBOT = new FieldSpec("ang_AuftragTyp", 13,
          0, "boolean", null);
  public static FieldSpec BETREFF = new FieldSpec("betreff", 45, 80,
          "java.lang.String", null);
  public static FieldSpec PROJEKT_ID = new FieldSpec("_022_001_Vorgang_DID",
          19, 0, "int", null);
  public static FieldSpec PROJEKT_NAME = new FieldSpec("m_022_031_VorgangNr",
          46, 30, "java.lang.String", null);
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
    new FieldSpec("_068_001_Kunden_DID", 11, 0, "int", null),
    new FieldSpec("lfd_Nr", 12, 0, "int", null),
    new FieldSpec("ang_AuftragTyp", 13, 0, "boolean", null),
    new FieldSpec("_009_001_Adressen_DID_AB", 14, 0, "int", null),
    new FieldSpec("_009_001_Adressen_DID_LF", 15, 0, "int", null),
    new FieldSpec("_009_001_Adressen_DID_RG", 16, 0, "int", null),
    new FieldSpec("storno", 17, 0, "boolean", null),
    new FieldSpec("soll_Haben", 18, 0, "boolean", null),
    new FieldSpec("_022_001_Vorgang_DID", 19, 0, "int", null),
    new FieldSpec("_001_001_Mitarbeiter_DID_VB", 20, 0, "int", null),
    new FieldSpec("m_001_021__020_Ma_Kürzel_VB", 21, 5,
    "java.lang.String", null),
    new FieldSpec("_005_001_Währungen_DID", 22, 0, "int", null),
    new FieldSpec("kurs", 23, 0, "double", null),
    new FieldSpec("betrag_MwSt", 24, 0, "double", null),
    new FieldSpec("betrag_Netto", 25, 0, "double", null),
    new FieldSpec("auftragsKosten", 26, 0, "double", null),
    new FieldSpec("vermerk1", 27, 0, "java.lang.StringBuilder", null),
    new FieldSpec("vermerk2", 28, 0, "java.lang.StringBuilder", null),
    new FieldSpec("vermerk3", 29, 0, "java.lang.StringBuilder", null),
    new FieldSpec("vermerk4", 30, 0, "java.lang.StringBuilder", null),
    new FieldSpec("_012_001_Zahlungsbed_DID", 31, 0, "int", null),
    new FieldSpec("last_Kunden_DID", 32, 0, "int", null),
    new FieldSpec("writePic_", 33, 0, "byte[]", null),
    new FieldSpec("creditCheckFlag", 34, 0, "boolean", null),
    new FieldSpec("lieferungOK", 35, 0, "boolean", null),
    new FieldSpec("_001_001_Mitarbeiter_DID_Credit", 36, 0, "int", null),
    new FieldSpec("checkDate", 37, 0, "java.sql.Date", null),
    new FieldSpec("_001_001_Mitarbeiter_DID_SB", 38, 0, "int", null),
    new FieldSpec("m_001_021__038_Ma_Kürzel_SB", 39, 5,
    "java.lang.String", null),
    new FieldSpec("m_009_011_Adressen_Firmenname", 40, 80,
    "java.lang.String", null),
    new FieldSpec("m_009_014_Adressen_Nachname", 41, 80,
    "java.lang.String", null),
    new FieldSpec("m_068_011_KundenNr", 42, 0, "int", null),
    new FieldSpec("_035_001_WriteVorlagen_DID", 43, 0, "int", null),
    new FieldSpec("eingangsdatum", 44, 0, "java.sql.Date", null),
    new FieldSpec("betreff", 45, 80, "java.lang.String", null),
    new FieldSpec("m_022_031_VorgangNr", 46, 30, "java.lang.String",
    null),
    new FieldSpec("last_Währungen_DID", 47, 0, "int", null),
    new FieldSpec("betrag_Brutto", 48, 0, "double", null),
    new FieldSpec("mwSt_pflichtig", 49, 0, "boolean", null),
    new FieldSpec("_005_001_BezugsWährung_DID", 50, 0, "int", null),
    new FieldSpec("m_005_011__022_WährZeichen", 51, 5,
    "java.lang.String", null),
    new FieldSpec("abgeschlossen", 52, 0, "boolean", null),
    new FieldSpec("muster", 53, 0, "boolean", null),
    new FieldSpec("betrag_Euro", 54, 0, "double", null),
    new FieldSpec("importDID", 55, 0, "int", null),
    new FieldSpec("fremdkosten", 56, 0, "double", null),
    new FieldSpec("preis_typ", 57, 0, "int", null),
    new FieldSpec("uuid", 58, 80,"java.lang.String", null)};

  // generierte Feldkonstanten - Ende
  public Auftraege() {
    super();
  }

  // generierte getter/setter - Anfang
  @Override
  public void setDID(int inp) {
    dID = inp;
  }

  @Override
  public int getDID() {
    return dID;
  }

  public void setDL(boolean inp) {
    dL = inp;
  }

  public boolean getDL() {
    return dL;
  }

  public void setDEAM(java.sql.Date inp) {
    dEAM = inp;
  }

  public java.sql.Date getDEAM() {
    return dEAM;
  }

  public void setDEVON(int inp) {
    dEVON = inp;
  }

  public int getDEVON() {
    return dEVON;
  }

  public void setDGAM(java.sql.Date inp) {
    dGAM = inp;
  }

  public java.sql.Date getDGAM() {
    return dGAM;
  }

  public void setDMandant(int inp) {
    dMandant = inp;
  }

  public int getDMandant() {
    return dMandant;
  }

  public void setDGVON(int inp) {
    dGVON = inp;
  }

  public int getDGVON() {
    return dGVON;
  }

  public void setDG(boolean inp) {
    dG = inp;
  }

  public boolean getDG() {
    return dG;
  }

  public void setDStandort(int inp) {
    dStandort = inp;
  }

  public int getDStandort() {
    return dStandort;
  }

  public void setDDEL(boolean inp) {
    dDEL = inp;
  }

  public boolean getDDEL() {
    return dDEL;
  }

  public void set_068_001_Kunden_DID(int inp) {
    _068_001_Kunden_DID = inp;
  }

  public int get_068_001_Kunden_DID() {
    return _068_001_Kunden_DID;
  }

  public void setLfd_Nr(int inp) {
    lfd_Nr = inp;
  }

  public int getLfd_Nr() {
    return lfd_Nr;
  }

  public void setAng_AuftragTyp(boolean inp) {
    ang_AuftragTyp = inp;
  }

  public boolean getAng_AuftragTyp() {
    return ang_AuftragTyp;
  }

  public void set_009_001_Adressen_DID_AB(int inp) {
    _009_001_Adressen_DID_AB = inp;
  }

  public int get_009_001_Adressen_DID_AB() {
    return _009_001_Adressen_DID_AB;
  }

  public void set_009_001_Adressen_DID_LF(int inp) {
    _009_001_Adressen_DID_LF = inp;
  }

  public int get_009_001_Adressen_DID_LF() {
    return _009_001_Adressen_DID_LF;
  }

  public void set_009_001_Adressen_DID_RG(int inp) {
    _009_001_Adressen_DID_RG = inp;
  }

  public int get_009_001_Adressen_DID_RG() {
    return _009_001_Adressen_DID_RG;
  }

  public void setStorno(boolean inp) {
    storno = inp;
  }

  public boolean getStorno() {
    return storno;
  }

  public void setSoll_Haben(boolean inp) {
    soll_Haben = inp;
  }

  public boolean getSoll_Haben() {
    return soll_Haben;
  }

  public void set_022_001_Vorgang_DID(int inp) {
    _022_001_Vorgang_DID = inp;
  }

  public int get_022_001_Vorgang_DID() {
    return _022_001_Vorgang_DID;
  }

  public void set_001_001_Mitarbeiter_DID_VB(int inp) {
    _001_001_Mitarbeiter_DID_VB = inp;
  }

  public int get_001_001_Mitarbeiter_DID_VB() {
    return _001_001_Mitarbeiter_DID_VB;
  }

  public void setM_001_021__020_Ma_Kürzel_VB(java.lang.String inp) {
    m_001_021__020_Ma_Kürzel_VB = inp;
  }

  public java.lang.String getM_001_021__020_Ma_Kürzel_VB() {
    return m_001_021__020_Ma_Kürzel_VB;
  }

  public void set_005_001_Währungen_DID(int inp) {
    _005_001_Währungen_DID = inp;
  }

  public int get_005_001_Währungen_DID() {
    return _005_001_Währungen_DID;
  }

  public void setKurs(double inp) {
    kurs = inp;
  }

  public double getKurs() {
    return kurs;
  }

  public void setBetrag_MwSt(double inp) {
    betrag_MwSt = inp;
  }

  public double getBetrag_MwSt() {
    return betrag_MwSt;
  }

  public void setBetrag_Netto(double inp) {
    betrag_Netto = inp;
  }

  public double getBetrag_Netto() {
    return betrag_Netto;
  }

  public void setAuftragsKosten(double inp) {
    auftragsKosten = inp;
  }

  public double getAuftragsKosten() {
    return auftragsKosten;
  }

  public void setVermerk1(java.lang.StringBuilder inp) {
    vermerk1 = inp;
  }

  public java.lang.StringBuilder getVermerk1() {
    return vermerk1;
  }

  public void setVermerk2(java.lang.StringBuilder inp) {
    vermerk2 = inp;
  }

  public java.lang.StringBuilder getVermerk2() {
    return vermerk2;
  }

  public void setVermerk3(java.lang.StringBuilder inp) {
    vermerk3 = inp;
  }

  public java.lang.StringBuilder getVermerk3() {
    return vermerk3;
  }

  public void setVermerk4(java.lang.StringBuilder inp) {
    vermerk4 = inp;
  }

  public java.lang.StringBuilder getVermerk4() {
    return vermerk4;
  }

  public void set_012_001_Zahlungsbed_DID(int inp) {
    _012_001_Zahlungsbed_DID = inp;
  }

  public int get_012_001_Zahlungsbed_DID() {
    return _012_001_Zahlungsbed_DID;
  }

  public void setLast_Kunden_DID(int inp) {
    last_Kunden_DID = inp;
  }

  public int getLast_Kunden_DID() {
    return last_Kunden_DID;
  }

  public void setWritePic_(byte[] inp) {
    writePic_ = inp;
  }

  public byte[] getWritePic_() {
    return writePic_;
  }

  public void setCreditCheckFlag(boolean inp) {
    creditCheckFlag = inp;
  }

  public boolean getCreditCheckFlag() {
    return creditCheckFlag;
  }

  public void setLieferungOK(boolean inp) {
    lieferungOK = inp;
  }

  public boolean getLieferungOK() {
    return lieferungOK;
  }

  public void set_001_001_Mitarbeiter_DID_Credit(int inp) {
    _001_001_Mitarbeiter_DID_Credit = inp;
  }

  public int get_001_001_Mitarbeiter_DID_Credit() {
    return _001_001_Mitarbeiter_DID_Credit;
  }

  public void setCheckDate(java.sql.Date inp) {
    checkDate = inp;
  }

  public java.sql.Date getCheckDate() {
    return checkDate;
  }

  public void set_001_001_Mitarbeiter_DID_SB(int inp) {
    _001_001_Mitarbeiter_DID_SB = inp;
  }

  public int get_001_001_Mitarbeiter_DID_SB() {
    return _001_001_Mitarbeiter_DID_SB;
  }

  public void setM_001_021__038_Ma_Kürzel_SB(java.lang.String inp) {
    m_001_021__038_Ma_Kürzel_SB = inp;
  }

  public java.lang.String getM_001_021__038_Ma_Kürzel_SB() {
    return m_001_021__038_Ma_Kürzel_SB;
  }

  public void setM_009_011_Adressen_Firmenname(java.lang.String inp) {
    m_009_011_Adressen_Firmenname = inp;
  }

  public java.lang.String getM_009_011_Adressen_Firmenname() {
    return m_009_011_Adressen_Firmenname;
  }

  public void setM_009_014_Adressen_Nachname(java.lang.String inp) {
    m_009_014_Adressen_Nachname = inp;
  }

  public java.lang.String getM_009_014_Adressen_Nachname() {
    return m_009_014_Adressen_Nachname;
  }

  public void setM_068_011_KundenNr(int inp) {
    m_068_011_KundenNr = inp;
  }

  public int getM_068_011_KundenNr() {
    return m_068_011_KundenNr;
  }

  public void set_035_001_WriteVorlagen_DID(int inp) {
    _035_001_WriteVorlagen_DID = inp;
  }

  public int get_035_001_WriteVorlagen_DID() {
    return _035_001_WriteVorlagen_DID;
  }

  public void setEingangsdatum(java.sql.Date inp) {
    eingangsdatum = inp;
  }

  public java.sql.Date getEingangsdatum() {
    return eingangsdatum;
  }

  public void setBetreff(java.lang.String inp) {
    betreff = inp;
  }

  public java.lang.String getBetreff() {
    return betreff;
  }

  public void setM_022_031_VorgangNr(java.lang.String inp) {
    m_022_031_VorgangNr = inp;
  }

  public java.lang.String getM_022_031_VorgangNr() {
    return m_022_031_VorgangNr;
  }

  public void setLast_Währungen_DID(int inp) {
    last_Währungen_DID = inp;
  }

  public int getLast_Währungen_DID() {
    return last_Währungen_DID;
  }

  public void setBetrag_Brutto(double inp) {
    betrag_Brutto = inp;
  }

  public double getBetrag_Brutto() {
    return betrag_Brutto;
  }

  public void setMwSt_pflichtig(boolean inp) {
    mwSt_pflichtig = inp;
  }

  public boolean getMwSt_pflichtig() {
    return mwSt_pflichtig;
  }

  public void set_005_001_BezugsWährung_DID(int inp) {
    _005_001_BezugsWährung_DID = inp;
  }

  public int get_005_001_BezugsWährung_DID() {
    return _005_001_BezugsWährung_DID;
  }

  public void setM_005_011__022_WährZeichen(java.lang.String inp) {
    m_005_011__022_WährZeichen = inp;
  }

  public java.lang.String getM_005_011__022_WährZeichen() {
    return m_005_011__022_WährZeichen;
  }

  public void setAbgeschlossen(boolean inp) {
    abgeschlossen = inp;
  }

  public boolean getAbgeschlossen() {
    return abgeschlossen;
  }

  public void setMuster(boolean inp) {
    muster = inp;
  }

  public boolean getMuster() {
    return muster;
  }

  public void setBetrag_Euro(double inp) {
    betrag_Euro = inp;
  }

  public double getBetrag_Euro() {
    return betrag_Euro;
  }

  public void setImportDID(int inp) {
    importDID = inp;
  }

  public int getImportDID() {
    return importDID;
  }

  public void setFremdkosten(double inp) {
    fremdkosten = inp;
  }

  public double getFremdkosten() {
    return fremdkosten;
  }

  public void setPreis_typ(int inp) {
    preis_typ = inp;
  }

  public int getPreis_typ() {
    return preis_typ;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
