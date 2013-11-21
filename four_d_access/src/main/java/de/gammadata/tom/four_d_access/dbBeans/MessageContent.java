/*
 * MessageContent.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 104 mit dem Namen "MessageContent"
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

public class MessageContent extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MessageContent";
	public static final int dbTabNummer = 104;
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
	public static int _105_001_MessageDID_Fn = 11;
	public static int contentType_Fn = 12;
	public static int contentDisposition_Fn = 13;
	public static int contentEncoding_Fn = 14;
	public static int contentFileName_Fn = 15;
	public static int headerSource_Fn = 16;
	public static int size_Fn = 17;
	public static int contentFileLink_Fn = 18;
	public static int textContent_Fn = 19;
	public static int content_intern_gespeichert_Fn = 20;
	public static int verweisAttachedMessage_Fn = 21;
	public static int virusCheckerKennzeichen_Fn = 22;
	public static int virusScore_Fn = 23;
	public static int virusCheckDate_Fn = 24;
	public static int contentPosNr_Fn = 25;
	public static int contentID_Fn = 26;
	public static int fileNameIntern_Fn = 27;
	public static int contentDescription_Fn = 28;
	public static int binaryContent_Fn = 29;

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
	private int _105_001_MessageDID = 0;
	private java.lang.String contentType = "";
	private java.lang.String contentDisposition = "";
	private java.lang.String contentEncoding = "";
	private java.lang.StringBuilder contentFileName = new java.lang.StringBuilder();
	private java.lang.StringBuilder headerSource = new java.lang.StringBuilder();
	private int size = 0;
	private java.lang.StringBuilder contentFileLink = new java.lang.StringBuilder();
	private java.lang.StringBuilder textContent = new java.lang.StringBuilder();
	private boolean content_intern_gespeichert = false;
	private int verweisAttachedMessage = 0;
	private int virusCheckerKennzeichen = 0;
	private int virusScore = 0;
	private java.sql.Date virusCheckDate = new java.sql.Date(0);
	private int contentPosNr = 0;
	private java.lang.String contentID = "";
	private java.lang.String fileNameIntern = "";
	private java.lang.StringBuilder contentDescription = new java.lang.StringBuilder();
	private byte[] binaryContent = new byte[0];
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "_105_001_MessageDID", "contentType",
			"contentDisposition", "contentEncoding", "contentFileName",
			"headerSource", "size", "contentFileLink", "textContent",
			"content_intern_gespeichert", "verweisAttachedMessage",
			"virusCheckerKennzeichen", "virusScore", "virusCheckDate",
			"contentPosNr", "contentID", "fileNameIntern",
			"contentDescription", "binaryContent" };
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
			new FieldSpec("_105_001_MessageDID", 11, 0, "int",
					new OneObjectPointer(105, 1, "MessageDID", "")),
			new FieldSpec("contentType", 12, 80, "java.lang.String", null),
			new FieldSpec("contentDisposition", 13, 80, "java.lang.String",
					null),
			new FieldSpec("contentEncoding", 14, 80, "java.lang.String", null),
			new FieldSpec("contentFileName", 15, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("headerSource", 16, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("size", 17, 0, "int", null),
			new FieldSpec("contentFileLink", 18, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("textContent", 19, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("content_intern_gespeichert", 20, 0, "boolean", null),
			new FieldSpec("verweisAttachedMessage", 21, 0, "int", null),
			new FieldSpec("virusCheckerKennzeichen", 22, 0, "int", null),
			new FieldSpec("virusScore", 23, 0, "int", null),
			new FieldSpec("virusCheckDate", 24, 0, "java.sql.Date", null),
			new FieldSpec("contentPosNr", 25, 0, "int", null),
			new FieldSpec("contentID", 26, 80, "java.lang.String", null),
			new FieldSpec("fileNameIntern", 27, 80, "java.lang.String", null),
			new FieldSpec("contentDescription", 28, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("binaryContent", 29, 0, "byte[]", null) };

	// generierte Feldkonstanten - Ende

	public MessageContent() {
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

	public void set_105_001_MessageDID(int inp) {
		_105_001_MessageDID = inp;
	}

	public int get_105_001_MessageDID()

	{
		return _105_001_MessageDID;
	}

	public void setContentType(java.lang.String inp) {
		contentType = inp;
	}

	public java.lang.String getContentType()

	{
		return contentType;
	}

	public void setContentDisposition(java.lang.String inp) {
		contentDisposition = inp;
	}

	public java.lang.String getContentDisposition()

	{
		return contentDisposition;
	}

	public void setContentEncoding(java.lang.String inp) {
		contentEncoding = inp;
	}

	public java.lang.String getContentEncoding()

	{
		return contentEncoding;
	}

	public void setContentFileName(java.lang.StringBuilder inp) {
		contentFileName = inp;
	}

	public java.lang.StringBuilder getContentFileName()

	{
		return contentFileName;
	}

	public void setHeaderSource(java.lang.StringBuilder inp) {
		headerSource = inp;
	}

	public java.lang.StringBuilder getHeaderSource()

	{
		return headerSource;
	}

	public void setSize(int inp) {
		size = inp;
	}

	public int getSize()

	{
		return size;
	}

	public void setContentFileLink(java.lang.StringBuilder inp) {
		contentFileLink = inp;
	}

	public java.lang.StringBuilder getContentFileLink()

	{
		return contentFileLink;
	}

	public void setTextContent(java.lang.StringBuilder inp) {
		textContent = inp;
	}

	public java.lang.StringBuilder getTextContent()

	{
		return textContent;
	}

	public void setContent_intern_gespeichert(boolean inp) {
		content_intern_gespeichert = inp;
	}

	public boolean getContent_intern_gespeichert()

	{
		return content_intern_gespeichert;
	}

	public void setVerweisAttachedMessage(int inp) {
		verweisAttachedMessage = inp;
	}

	public int getVerweisAttachedMessage()

	{
		return verweisAttachedMessage;
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

	public void setContentPosNr(int inp) {
		contentPosNr = inp;
	}

	public int getContentPosNr()

	{
		return contentPosNr;
	}

	public void setContentID(java.lang.String inp) {
		contentID = inp;
	}

	public java.lang.String getContentID()

	{
		return contentID;
	}

	public void setFileNameIntern(java.lang.String inp) {
		fileNameIntern = inp;
	}

	public java.lang.String getFileNameIntern()

	{
		return fileNameIntern;
	}

	public void setContentDescription(java.lang.StringBuilder inp) {
		contentDescription = inp;
	}

	public java.lang.StringBuilder getContentDescription()

	{
		return contentDescription;
	}

	public void setBinaryContent(byte[] inp) {
		binaryContent = inp;
	}

	public byte[] getBinaryContent()

	{
		return binaryContent;
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
