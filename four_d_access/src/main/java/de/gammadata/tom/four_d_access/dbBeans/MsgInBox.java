/*
 * MsgInBox.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 105 mit dem Namen "MsgInBox"
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

public class MsgInBox extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MsgInBox";
	public static final int dbTabNummer = 105;
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
	public static int messageUID_Fn = 11;
	public static int mailDatum_Fn = 12;
	public static int rcvEmailAdr_Fn = 13;
	public static int rcvName_Fn = 14;
	public static int senderEmailAdr_Fn = 15;
	public static int senderName_Fn = 16;
	public static int replyEmailAdr_Fn = 17;
	public static int replyName_Fn = 18;
	public static int subject_Fn = 19;
	public static int headerSource_Fn = 20;
	public static int anzContentParts_Fn = 21;
	public static int zugriffsrechte_Fn = 22;
	public static int _001_001_MitarbeiterDID_Fn = 23;
	public static int m_001_021_MitarbeiterKBZ_Fn = 24;
	public static int _106_001_AccessGrpDID_Fn = 25;
	public static int m_106_013_AccessGrpKBZ_Fn = 26;
	public static int _038_001_EmailAccountsDID_Fn = 27;
	public static int m_038_013_EmailAccountKBZ_Fn = 28;
	public static int checkerKennzeichen_Fn = 29;
	public static int checkDatum_Fn = 30;
	public static int spamScore_Fn = 31;
	public static int _103_001_MessagesDID_Fn = 32;
	public static int toList_Fn = 33;
	public static int fromList_Fn = 34;
	public static int ccList_Fn = 35;
	public static int replyList_Fn = 36;
	public static int loeschKennzeichen_Fn = 37;
	public static int loeschdatum_Fn = 38;
	public static int _023_001_MessageFolderDID_Fn = 39;
	public static int m_023_011_MessageFolderName_Fn = 40;
	public static int virusCheckerKennzeichen_Fn = 41;
	public static int virusScore_Fn = 42;
	public static int virusCheckDate_Fn = 43;
	public static int mainMsgDID_Fn = 44;
	public static int anzAttachedMsg_Fn = 45;
	public static int lfdNummer_Fn = 46;
	public static int tempMsgNummer_Fn = 47;
	public static int checkLog_Fn = 48;
	public static int javaDate_Fn = 49;
	public static int mailTime_Fn = 50;
	public static int _068_001_KundenDID_Fn = 51;
	public static int _060_001_LieferantenDID_Fn = 52;
	public static int _009_001_AdressenDID_Fn = 53;
	public static int linkTabellenNummer_Fn = 54;
	public static int linkDID_Fn = 55;
	public static int folderName_Fn = 56;
	public static int haschCode_Fn = 57;

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
	private java.lang.String messageUID = "";
	private java.sql.Date mailDatum = new java.sql.Date(0);
	private java.lang.String rcvEmailAdr = "";
	private java.lang.String rcvName = "";
	private java.lang.String senderEmailAdr = "";
	private java.lang.String senderName = "";
	private java.lang.String replyEmailAdr = "";
	private java.lang.String replyName = "";
	private java.lang.StringBuilder subject = new java.lang.StringBuilder();
	private java.lang.StringBuilder headerSource = new java.lang.StringBuilder();
	private int anzContentParts = 0;
	private int zugriffsrechte = 0;
	private int _001_001_MitarbeiterDID = 0;
	private java.lang.String m_001_021_MitarbeiterKBZ = "";
	private int _106_001_AccessGrpDID = 0;
	private java.lang.String m_106_013_AccessGrpKBZ = "";
	private int _038_001_EmailAccountsDID = 0;
	private java.lang.String m_038_013_EmailAccountKBZ = "";
	private int checkerKennzeichen = 0;
	private java.sql.Date checkDatum = new java.sql.Date(0);
	private int spamScore = 0;
	private int _103_001_MessagesDID = 0;
	private java.lang.StringBuilder toList = new java.lang.StringBuilder();
	private java.lang.StringBuilder fromList = new java.lang.StringBuilder();
	private java.lang.StringBuilder ccList = new java.lang.StringBuilder();
	private java.lang.StringBuilder replyList = new java.lang.StringBuilder();
	private int loeschKennzeichen = 0;
	private java.sql.Date loeschdatum = new java.sql.Date(0);
	private int _023_001_MessageFolderDID = 0;
	private java.lang.String m_023_011_MessageFolderName = "";
	private int virusCheckerKennzeichen = 0;
	private int virusScore = 0;
	private java.sql.Date virusCheckDate = new java.sql.Date(0);
	private int mainMsgDID = 0;
	private int anzAttachedMsg = 0;
	private int lfdNummer = 0;
	private int tempMsgNummer = 0;
	private java.lang.StringBuilder checkLog = new java.lang.StringBuilder();
	private int javaDate = 0;
	private java.sql.Time mailTime = new java.sql.Time(0);
	private int _068_001_KundenDID = 0;
	private int _060_001_LieferantenDID = 0;
	private int _009_001_AdressenDID = 0;
	private int linkTabellenNummer = 0;
	private int linkDID = 0;
	private java.lang.String folderName = "";
	private java.lang.String haschCode = "";
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "messageUID", "mailDatum", "rcvEmailAdr",
			"rcvName", "senderEmailAdr", "senderName", "replyEmailAdr",
			"replyName", "subject", "headerSource", "anzContentParts",
			"zugriffsrechte", "_001_001_MitarbeiterDID",
			"m_001_021_MitarbeiterKBZ", "_106_001_AccessGrpDID",
			"m_106_013_AccessGrpKBZ", "_038_001_EmailAccountsDID",
			"m_038_013_EmailAccountKBZ", "checkerKennzeichen", "checkDatum",
			"spamScore", "_103_001_MessagesDID", "toList", "fromList",
			"ccList", "replyList", "loeschKennzeichen", "loeschdatum",
			"_023_001_MessageFolderDID", "m_023_011_MessageFolderName",
			"virusCheckerKennzeichen", "virusScore", "virusCheckDate",
			"mainMsgDID", "anzAttachedMsg", "lfdNummer", "tempMsgNummer",
			"checkLog", "javaDate", "mailTime", "_068_001_KundenDID",
			"_060_001_LieferantenDID", "_009_001_AdressenDID",
			"linkTabellenNummer", "linkDID", "folderName", "haschCode" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

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
			new FieldSpec("messageUID", 11, 80, "java.lang.String", null),
			new FieldSpec("mailDatum", 12, 0, "java.sql.Date", null),
			new FieldSpec("rcvEmailAdr", 13, 80, "java.lang.String", null),
			new FieldSpec("rcvName", 14, 80, "java.lang.String", null),
			new FieldSpec("senderEmailAdr", 15, 80, "java.lang.String", null),
			new FieldSpec("senderName", 16, 80, "java.lang.String", null),
			new FieldSpec("replyEmailAdr", 17, 80, "java.lang.String", null),
			new FieldSpec("replyName", 18, 80, "java.lang.String", null),
			new FieldSpec("subject", 19, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("headerSource", 20, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("anzContentParts", 21, 0, "int", null),
			new FieldSpec("zugriffsrechte", 22, 0, "int", null),
			new FieldSpec("_001_001_MitarbeiterDID", 23, 0, "int",
					new OneObjectPointer(1, 1, "MitarbeiterDID", "")),
			new FieldSpec("m_001_021_MitarbeiterKBZ", 24, 20,
					"java.lang.String", null),
			new FieldSpec("_106_001_AccessGrpDID", 25, 0, "int",
					new OneObjectPointer(106, 1, "AccessGrpDID", "")),
			new FieldSpec("m_106_013_AccessGrpKBZ", 26, 80, "java.lang.String",
					null),
			new FieldSpec("_038_001_EmailAccountsDID", 27, 0, "int",
					new OneObjectPointer(38, 1, "EmailAccountsDID", "")),
			new FieldSpec("m_038_013_EmailAccountKBZ", 28, 80,
					"java.lang.String", null),
			new FieldSpec("checkerKennzeichen", 29, 0, "int", null),
			new FieldSpec("checkDatum", 30, 0, "java.sql.Date", null),
			new FieldSpec("spamScore", 31, 0, "int", null),
			new FieldSpec("_103_001_MessagesDID", 32, 0, "int",
					new OneObjectPointer(103, 1, "MessagesDID", "")),
			new FieldSpec("toList", 33, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("fromList", 34, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("ccList", 35, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("replyList", 36, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("loeschKennzeichen", 37, 0, "int", null),
			new FieldSpec("loeschdatum", 38, 0, "java.sql.Date", null),
			new FieldSpec("_023_001_MessageFolderDID", 39, 0, "int",
					new OneObjectPointer(23, 1, "MessageFolderDID", "")),
			new FieldSpec("m_023_011_MessageFolderName", 40, 80,
					"java.lang.String", null),
			new FieldSpec("virusCheckerKennzeichen", 41, 0, "int", null),
			new FieldSpec("virusScore", 42, 0, "int", null),
			new FieldSpec("virusCheckDate", 43, 0, "java.sql.Date", null),
			new FieldSpec("mainMsgDID", 44, 0, "int", null),
			new FieldSpec("anzAttachedMsg", 45, 0, "int", null),
			new FieldSpec("lfdNummer", 46, 0, "int", null),
			new FieldSpec("tempMsgNummer", 47, 0, "int", null),
			new FieldSpec("checkLog", 48, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("javaDate", 49, 0, "int", null),
			new FieldSpec("mailTime", 50, 0, "java.sql.Time", null),
			new FieldSpec("_068_001_KundenDID", 51, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("_060_001_LieferantenDID", 52, 0, "int",
					new OneObjectPointer(60, 1, "LieferantenDID", "")),
			new FieldSpec("_009_001_AdressenDID", 53, 0, "int",
					new OneObjectPointer(9, 1, "AdressenDID", "")),
			new FieldSpec("linkTabellenNummer", 54, 0, "int", null),
			new FieldSpec("linkDID", 55, 0, "int", null),
			new FieldSpec("folderName", 56, 80, "java.lang.String", null),
			new FieldSpec("haschCode", 57, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public MsgInBox() {
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

	public void setMessageUID(java.lang.String inp) {
		messageUID = inp;
	}

	public java.lang.String getMessageUID()

	{
		return messageUID;
	}

	public void setMailDatum(java.sql.Date inp) {
		mailDatum = inp;
	}

	public java.sql.Date getMailDatum()

	{
		return mailDatum;
	}

	public void setRcvEmailAdr(java.lang.String inp) {
		rcvEmailAdr = inp;
	}

	public java.lang.String getRcvEmailAdr()

	{
		return rcvEmailAdr;
	}

	public void setRcvName(java.lang.String inp) {
		rcvName = inp;
	}

	public java.lang.String getRcvName()

	{
		return rcvName;
	}

	public void setSenderEmailAdr(java.lang.String inp) {
		senderEmailAdr = inp;
	}

	public java.lang.String getSenderEmailAdr()

	{
		return senderEmailAdr;
	}

	public void setSenderName(java.lang.String inp) {
		senderName = inp;
	}

	public java.lang.String getSenderName()

	{
		return senderName;
	}

	public void setReplyEmailAdr(java.lang.String inp) {
		replyEmailAdr = inp;
	}

	public java.lang.String getReplyEmailAdr()

	{
		return replyEmailAdr;
	}

	public void setReplyName(java.lang.String inp) {
		replyName = inp;
	}

	public java.lang.String getReplyName()

	{
		return replyName;
	}

	public void setSubject(java.lang.StringBuilder inp) {
		subject = inp;
	}

	public java.lang.StringBuilder getSubject()

	{
		return subject;
	}

	public void setHeaderSource(java.lang.StringBuilder inp) {
		headerSource = inp;
	}

	public java.lang.StringBuilder getHeaderSource()

	{
		return headerSource;
	}

	public void setAnzContentParts(int inp) {
		anzContentParts = inp;
	}

	public int getAnzContentParts()

	{
		return anzContentParts;
	}

	public void setZugriffsrechte(int inp) {
		zugriffsrechte = inp;
	}

	public int getZugriffsrechte()

	{
		return zugriffsrechte;
	}

	public void set_001_001_MitarbeiterDID(int inp) {
		_001_001_MitarbeiterDID = inp;
	}

	public int get_001_001_MitarbeiterDID()

	{
		return _001_001_MitarbeiterDID;
	}

	public void setM_001_021_MitarbeiterKBZ(java.lang.String inp) {
		m_001_021_MitarbeiterKBZ = inp;
	}

	public java.lang.String getM_001_021_MitarbeiterKBZ()

	{
		return m_001_021_MitarbeiterKBZ;
	}

	public void set_106_001_AccessGrpDID(int inp) {
		_106_001_AccessGrpDID = inp;
	}

	public int get_106_001_AccessGrpDID()

	{
		return _106_001_AccessGrpDID;
	}

	public void setM_106_013_AccessGrpKBZ(java.lang.String inp) {
		m_106_013_AccessGrpKBZ = inp;
	}

	public java.lang.String getM_106_013_AccessGrpKBZ()

	{
		return m_106_013_AccessGrpKBZ;
	}

	public void set_038_001_EmailAccountsDID(int inp) {
		_038_001_EmailAccountsDID = inp;
	}

	public int get_038_001_EmailAccountsDID()

	{
		return _038_001_EmailAccountsDID;
	}

	public void setM_038_013_EmailAccountKBZ(java.lang.String inp) {
		m_038_013_EmailAccountKBZ = inp;
	}

	public java.lang.String getM_038_013_EmailAccountKBZ()

	{
		return m_038_013_EmailAccountKBZ;
	}

	public void setCheckerKennzeichen(int inp) {
		checkerKennzeichen = inp;
	}

	public int getCheckerKennzeichen()

	{
		return checkerKennzeichen;
	}

	public void setCheckDatum(java.sql.Date inp) {
		checkDatum = inp;
	}

	public java.sql.Date getCheckDatum()

	{
		return checkDatum;
	}

	public void setSpamScore(int inp) {
		spamScore = inp;
	}

	public int getSpamScore()

	{
		return spamScore;
	}

	public void set_103_001_MessagesDID(int inp) {
		_103_001_MessagesDID = inp;
	}

	public int get_103_001_MessagesDID()

	{
		return _103_001_MessagesDID;
	}

	public void setToList(java.lang.StringBuilder inp) {
		toList = inp;
	}

	public java.lang.StringBuilder getToList()

	{
		return toList;
	}

	public void setFromList(java.lang.StringBuilder inp) {
		fromList = inp;
	}

	public java.lang.StringBuilder getFromList()

	{
		return fromList;
	}

	public void setCcList(java.lang.StringBuilder inp) {
		ccList = inp;
	}

	public java.lang.StringBuilder getCcList()

	{
		return ccList;
	}

	public void setReplyList(java.lang.StringBuilder inp) {
		replyList = inp;
	}

	public java.lang.StringBuilder getReplyList()

	{
		return replyList;
	}

	public void setLoeschKennzeichen(int inp) {
		loeschKennzeichen = inp;
	}

	public int getLoeschKennzeichen()

	{
		return loeschKennzeichen;
	}

	public void setLoeschdatum(java.sql.Date inp) {
		loeschdatum = inp;
	}

	public java.sql.Date getLoeschdatum()

	{
		return loeschdatum;
	}

	public void set_023_001_MessageFolderDID(int inp) {
		_023_001_MessageFolderDID = inp;
	}

	public int get_023_001_MessageFolderDID()

	{
		return _023_001_MessageFolderDID;
	}

	public void setM_023_011_MessageFolderName(java.lang.String inp) {
		m_023_011_MessageFolderName = inp;
	}

	public java.lang.String getM_023_011_MessageFolderName()

	{
		return m_023_011_MessageFolderName;
	}

	public void setVirusCheckerKennzeichen(int inp) {
		virusCheckerKennzeichen = inp;
	}

	public int getVirusCheckerKennzeichen()

	{
		return virusCheckerKennzeichen;
	}

	public void setVirusScore(int inp) {
		virusScore = inp;
	}

	public int getVirusScore()

	{
		return virusScore;
	}

	public void setVirusCheckDate(java.sql.Date inp) {
		virusCheckDate = inp;
	}

	public java.sql.Date getVirusCheckDate()

	{
		return virusCheckDate;
	}

	public void setMainMsgDID(int inp) {
		mainMsgDID = inp;
	}

	public int getMainMsgDID()

	{
		return mainMsgDID;
	}

	public void setAnzAttachedMsg(int inp) {
		anzAttachedMsg = inp;
	}

	public int getAnzAttachedMsg()

	{
		return anzAttachedMsg;
	}

	public void setLfdNummer(int inp) {
		lfdNummer = inp;
	}

	public int getLfdNummer()

	{
		return lfdNummer;
	}

	public void setTempMsgNummer(int inp) {
		tempMsgNummer = inp;
	}

	public int getTempMsgNummer()

	{
		return tempMsgNummer;
	}

	public void setCheckLog(java.lang.StringBuilder inp) {
		checkLog = inp;
	}

	public java.lang.StringBuilder getCheckLog()

	{
		return checkLog;
	}

	public void setJavaDate(int inp) {
		javaDate = inp;
	}

	public int getJavaDate()

	{
		return javaDate;
	}

	public void setMailTime(java.sql.Time inp) {
		mailTime = inp;
	}

	public java.sql.Time getMailTime()

	{
		return mailTime;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void set_060_001_LieferantenDID(int inp) {
		_060_001_LieferantenDID = inp;
	}

	public int get_060_001_LieferantenDID()

	{
		return _060_001_LieferantenDID;
	}

	public void set_009_001_AdressenDID(int inp) {
		_009_001_AdressenDID = inp;
	}

	public int get_009_001_AdressenDID()

	{
		return _009_001_AdressenDID;
	}

	public void setLinkTabellenNummer(int inp) {
		linkTabellenNummer = inp;
	}

	public int getLinkTabellenNummer()

	{
		return linkTabellenNummer;
	}

	public void setLinkDID(int inp) {
		linkDID = inp;
	}

	public int getLinkDID()

	{
		return linkDID;
	}

	public void setFolderName(java.lang.String inp) {
		folderName = inp;
	}

	public java.lang.String getFolderName()

	{
		return folderName;
	}

	public void setHaschCode(java.lang.String inp) {
		haschCode = inp;
	}

	public java.lang.String getHaschCode()

	{
		return haschCode;
	}

	// generierte getter/setter - Ende

	// Interfaceroutinen

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
	public String[] getXmlFelder1(int mode) {
		return xmlFelder1;
	}

	@Override
	public String[] getXmlFelder1(String mode) {
		return xmlFelder1;
	}

	public String[] getXmlFelderAll() {
		return xmlFelderAll;
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs() {
		return fieldSpecs;
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
