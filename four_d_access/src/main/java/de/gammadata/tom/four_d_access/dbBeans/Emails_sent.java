/*
 * Emails_sent.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 61 mit dem Namen "Emails_sent"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Emails_sent extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Emails_sent";
	public static final int dbTabNummer = 61;
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
	public static int quellDID_Fn = 11;
	public static int tabellenNr_Fn = 12;
	public static int tabellenName_Fn = 13;
	public static int empfaenger_Fn = 14;
	public static int leer3_Fn = 15;
	public static int bodyTyp_Fn = 16;
	public static int absender_Fn = 17;
	public static int anhang_Liste_Fn = 18;
	public static int datum_Fn = 19;
	public static int zeit_Fn = 20;
	public static int bodyText_Fn = 21;
	public static int cc_Liste_Fn = 22;
	public static int bcc_Liste_Fn = 23;
	public static int subject_Fn = 24;
	public static int leer_Fn = 25;
	public static int leer1_Fn = 26;
	public static int leer2_Fn = 27;

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
	private int quellDID = 0;
	private int tabellenNr = 0;
	private java.lang.String tabellenName = "";
	private java.lang.StringBuilder empfaenger = new java.lang.StringBuilder();
	private int leer3 = 0;
	private int bodyTyp = 0;
	private java.lang.String absender = "";
	private java.lang.StringBuilder anhang_Liste = new java.lang.StringBuilder();
	private java.sql.Date datum = new java.sql.Date(0);
	private java.sql.Time zeit = new java.sql.Time(0);
	private byte[] bodyText = new byte[0];
	private java.lang.StringBuilder cc_Liste = new java.lang.StringBuilder();
	private java.lang.StringBuilder bcc_Liste = new java.lang.StringBuilder();
	private java.lang.StringBuilder subject = new java.lang.StringBuilder();
	private java.lang.String leer = "";
	private java.lang.String leer1 = "";
	private java.lang.String leer2 = "";
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
			new FieldSpec("quellDID", 11, 0, "int", null),
			new FieldSpec("tabellenNr", 12, 0, "int", null),
			new FieldSpec("tabellenName", 13, 40, "java.lang.String", null),
			new FieldSpec("empfaenger", 14, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("leer3", 15, 0, "int", null),
			new FieldSpec("bodyTyp", 16, 0, "int", null),
			new FieldSpec("absender", 17, 80, "java.lang.String", null),
			new FieldSpec("anhang_Liste", 18, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("datum", 19, 0, "java.sql.Date", null),
			new FieldSpec("zeit", 20, 0, "java.sql.Time", null),
			new FieldSpec("bodyText", 21, 0, "byte[]", null),
			new FieldSpec("cc_Liste", 22, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("bcc_Liste", 23, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("subject", 24, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("leer", 25, 40, "java.lang.String", null),
			new FieldSpec("leer1", 26, 40, "java.lang.String", null),
			new FieldSpec("leer2", 27, 5, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Emails_sent() {
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

	public void setQuellDID(int inp) {
		quellDID = inp;
	}

	public int getQuellDID()

	{
		return quellDID;
	}

	public void setTabellenNr(int inp) {
		tabellenNr = inp;
	}

	public int getTabellenNr()

	{
		return tabellenNr;
	}

	public void setTabellenName(java.lang.String inp) {
		tabellenName = inp;
	}

	public java.lang.String getTabellenName()

	{
		return tabellenName;
	}

	public void setEmpfaenger(java.lang.StringBuilder inp) {
		empfaenger = inp;
	}

	public java.lang.StringBuilder getEmpfaenger()

	{
		return empfaenger;
	}

	public void setLeer3(int inp) {
		leer3 = inp;
	}

	public int getLeer3()

	{
		return leer3;
	}

	public void setBodyTyp(int inp) {
		bodyTyp = inp;
	}

	public int getBodyTyp()

	{
		return bodyTyp;
	}

	public void setAbsender(java.lang.String inp) {
		absender = inp;
	}

	public java.lang.String getAbsender()

	{
		return absender;
	}

	public void setAnhang_Liste(java.lang.StringBuilder inp) {
		anhang_Liste = inp;
	}

	public java.lang.StringBuilder getAnhang_Liste()

	{
		return anhang_Liste;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setZeit(java.sql.Time inp) {
		zeit = inp;
	}

	public java.sql.Time getZeit()

	{
		return zeit;
	}

	public void setBodyText(byte[] inp) {
		bodyText = inp;
	}

	public byte[] getBodyText()

	{
		return bodyText;
	}

	public void setCc_Liste(java.lang.StringBuilder inp) {
		cc_Liste = inp;
	}

	public java.lang.StringBuilder getCc_Liste()

	{
		return cc_Liste;
	}

	public void setBcc_Liste(java.lang.StringBuilder inp) {
		bcc_Liste = inp;
	}

	public java.lang.StringBuilder getBcc_Liste()

	{
		return bcc_Liste;
	}

	public void setSubject(java.lang.StringBuilder inp) {
		subject = inp;
	}

	public java.lang.StringBuilder getSubject()

	{
		return subject;
	}

	public void setLeer(java.lang.String inp) {
		leer = inp;
	}

	public java.lang.String getLeer()

	{
		return leer;
	}

	public void setLeer1(java.lang.String inp) {
		leer1 = inp;
	}

	public java.lang.String getLeer1()

	{
		return leer1;
	}

	public void setLeer2(java.lang.String inp) {
		leer2 = inp;
	}

	public java.lang.String getLeer2()

	{
		return leer2;
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
