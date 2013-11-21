/*
 * EmailAccounts.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 38 mit dem Namen "EmailAccounts"
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

public class EmailAccounts extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EmailAccounts";
	public static final int dbTabNummer = 38;
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
	public static int _001_001_Mitarbeiter_DID_Fn = 11;
	public static int standardKontoSenden_Fn = 12;
	public static int emailKontoBez_Fn = 13;
	public static int emailKontobeschreibung_Fn = 14;
	public static int iMAP_Fn = 15;
	public static int sMTP_Host_Fn = 16;
	public static int pOP3_Host_Fn = 17;
	public static int emailSender_Fn = 18;
	public static int email_Reply_to_Fn = 19;
	public static int username_Fn = 20;
	public static int passwd_Fn = 21;
	public static int sMTP_AUTH_Fn = 22;
	public static int _023_001_MessageFolder_Fn = 23;
	public static int m_023_011_MessageFolderName_Fn = 24;
	public static int m_001_021__011_Mitarbeiter_Kürz_Fn = 25;
	public static int emailScanner_aktiv_Fn = 26;
	public static int _001_001_Mitarbeiter_DID_POP3_Fn = 27;
	public static int m_001_021__027_MitarbeiterKBZ_Fn = 28;
	public static int _106_001_AccessGruppenDID_Fn = 29;
	public static int m_106_013_AccessGruppenKBZ_Fn = 30;
	public static int zugriffsrechte_Fn = 31;
	public static int folder_Fn = 32;

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
	private int _001_001_Mitarbeiter_DID = 0;
	private boolean standardKontoSenden = false;
	private java.lang.String emailKontoBez = "";
	private java.lang.StringBuilder emailKontobeschreibung = new java.lang.StringBuilder();
	private boolean iMAP = false;
	private java.lang.String sMTP_Host = "";
	private java.lang.String pOP3_Host = "";
	private java.lang.String emailSender = "";
	private java.lang.String email_Reply_to = "";
	private java.lang.String username = "";
	private java.lang.String passwd = "";
	private boolean sMTP_AUTH = false;
	private int _023_001_MessageFolder = 0;
	private java.lang.String m_023_011_MessageFolderName = "";
	private java.lang.String m_001_021__011_Mitarbeiter_Kürz = "";
	private boolean emailScanner_aktiv = false;
	private int _001_001_Mitarbeiter_DID_POP3 = 0;
	private java.lang.String m_001_021__027_MitarbeiterKBZ = "";
	private int _106_001_AccessGruppenDID = 0;
	private java.lang.String m_106_013_AccessGruppenKBZ = "";
	private int zugriffsrechte = 0;
	private java.lang.String folder = "";
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
			new FieldSpec("_001_001_Mitarbeiter_DID", 11, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("standardKontoSenden", 12, 0, "boolean", null),
			new FieldSpec("emailKontoBez", 13, 60, "java.lang.String", null),
			new FieldSpec("emailKontobeschreibung", 14, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("iMAP", 15, 0, "boolean", null),
			new FieldSpec("sMTP_Host", 16, 80, "java.lang.String", null),
			new FieldSpec("pOP3_Host", 17, 80, "java.lang.String", null),
			new FieldSpec("emailSender", 18, 80, "java.lang.String", null),
			new FieldSpec("email_Reply_to", 19, 80, "java.lang.String", null),
			new FieldSpec("username", 20, 80, "java.lang.String", null),
			new FieldSpec("passwd", 21, 40, "java.lang.String", null),
			new FieldSpec("sMTP_AUTH", 22, 0, "boolean", null),
			new FieldSpec("_023_001_MessageFolder", 23, 0, "int",
					new OneObjectPointer(23, 1, "MessageFolder", "")),
			new FieldSpec("m_023_011_MessageFolderName", 24, 80,
					"java.lang.String", null),
			new FieldSpec("m_001_021__011_Mitarbeiter_Kürz", 25, 5,
					"java.lang.String", null),
			new FieldSpec("emailScanner_aktiv", 26, 0, "boolean", null),
			new FieldSpec("_001_001_Mitarbeiter_DID_POP3", 27, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID_POP3")),
			new FieldSpec("m_001_021__027_MitarbeiterKBZ", 28, 20,
					"java.lang.String", null),
			new FieldSpec("_106_001_AccessGruppenDID", 29, 0, "int",
					new OneObjectPointer(106, 1, "AccessGruppenDID", "")),
			new FieldSpec("m_106_013_AccessGruppenKBZ", 30, 80,
					"java.lang.String", null),
			new FieldSpec("zugriffsrechte", 31, 0, "int", null),
			new FieldSpec("folder", 32, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public EmailAccounts() {
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

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setStandardKontoSenden(boolean inp) {
		standardKontoSenden = inp;
	}

	public boolean getStandardKontoSenden()

	{
		return standardKontoSenden;
	}

	public void setEmailKontoBez(java.lang.String inp) {
		emailKontoBez = inp;
	}

	public java.lang.String getEmailKontoBez()

	{
		return emailKontoBez;
	}

	public void setEmailKontobeschreibung(java.lang.StringBuilder inp) {
		emailKontobeschreibung = inp;
	}

	public java.lang.StringBuilder getEmailKontobeschreibung()

	{
		return emailKontobeschreibung;
	}

	public void setIMAP(boolean inp) {
		iMAP = inp;
	}

	public boolean getIMAP()

	{
		return iMAP;
	}

	public void setSMTP_Host(java.lang.String inp) {
		sMTP_Host = inp;
	}

	public java.lang.String getSMTP_Host()

	{
		return sMTP_Host;
	}

	public void setPOP3_Host(java.lang.String inp) {
		pOP3_Host = inp;
	}

	public java.lang.String getPOP3_Host()

	{
		return pOP3_Host;
	}

	public void setEmailSender(java.lang.String inp) {
		emailSender = inp;
	}

	public java.lang.String getEmailSender()

	{
		return emailSender;
	}

	public void setEmail_Reply_to(java.lang.String inp) {
		email_Reply_to = inp;
	}

	public java.lang.String getEmail_Reply_to()

	{
		return email_Reply_to;
	}

	public void setUsername(java.lang.String inp) {
		username = inp;
	}

	public java.lang.String getUsername()

	{
		return username;
	}

	public void setPasswd(java.lang.String inp) {
		passwd = inp;
	}

	public java.lang.String getPasswd()

	{
		return passwd;
	}

	public void setSMTP_AUTH(boolean inp) {
		sMTP_AUTH = inp;
	}

	public boolean getSMTP_AUTH()

	{
		return sMTP_AUTH;
	}

	public void set_023_001_MessageFolder(int inp) {
		_023_001_MessageFolder = inp;
	}

	public int get_023_001_MessageFolder()

	{
		return _023_001_MessageFolder;
	}

	public void setM_023_011_MessageFolderName(java.lang.String inp) {
		m_023_011_MessageFolderName = inp;
	}

	public java.lang.String getM_023_011_MessageFolderName()

	{
		return m_023_011_MessageFolderName;
	}

	public void setM_001_021__011_Mitarbeiter_Kürz(java.lang.String inp) {
		m_001_021__011_Mitarbeiter_Kürz = inp;
	}

	public java.lang.String getM_001_021__011_Mitarbeiter_Kürz()

	{
		return m_001_021__011_Mitarbeiter_Kürz;
	}

	public void setEmailScanner_aktiv(boolean inp) {
		emailScanner_aktiv = inp;
	}

	public boolean getEmailScanner_aktiv()

	{
		return emailScanner_aktiv;
	}

	public void set_001_001_Mitarbeiter_DID_POP3(int inp) {
		_001_001_Mitarbeiter_DID_POP3 = inp;
	}

	public int get_001_001_Mitarbeiter_DID_POP3()

	{
		return _001_001_Mitarbeiter_DID_POP3;
	}

	public void setM_001_021__027_MitarbeiterKBZ(java.lang.String inp) {
		m_001_021__027_MitarbeiterKBZ = inp;
	}

	public java.lang.String getM_001_021__027_MitarbeiterKBZ()

	{
		return m_001_021__027_MitarbeiterKBZ;
	}

	public void set_106_001_AccessGruppenDID(int inp) {
		_106_001_AccessGruppenDID = inp;
	}

	public int get_106_001_AccessGruppenDID()

	{
		return _106_001_AccessGruppenDID;
	}

	public void setM_106_013_AccessGruppenKBZ(java.lang.String inp) {
		m_106_013_AccessGruppenKBZ = inp;
	}

	public java.lang.String getM_106_013_AccessGruppenKBZ()

	{
		return m_106_013_AccessGruppenKBZ;
	}

	public void setZugriffsrechte(int inp) {
		zugriffsrechte = inp;
	}

	public int getZugriffsrechte()

	{
		return zugriffsrechte;
	}

	public void setFolder(java.lang.String inp) {
		folder = inp;
	}

	public java.lang.String getFolder()

	{
		return folder;
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
