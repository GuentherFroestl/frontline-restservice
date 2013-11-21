/*
 * Eingabeformen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 53 mit dem Namen "Eingabeformen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Eingabeformen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Eingabeformen";
	public static final int dbTabNummer = 53;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int tabelleNr_Fn = 2;
	public static int formname_Fn = 3;
	public static int minBreitePixel_Fn = 4;
	public static int minHöhePixel_Fn = 5;
	public static int formNr_Fn = 6;
	public static int anzZusatzregister_Fn = 7;
	public static int branchenNr_Fn = 8;
	public static int objectClassTag_Fn = 9;
	public static int handlerClassName_Fn = 10;
	public static int kommentar_Fn = 11;
	public static int xmlCode_Fn = 12;
	public static int handlerScope_Fn = 13;
	public static int handlerName_Fn = 14;
	public static int xmlFileName_Fn = 15;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private int tabelleNr = 0;
	private java.lang.String formname = "";
	private int minBreitePixel = 0;
	private int minHöhePixel = 0;
	private int formNr = 0;
	private int anzZusatzregister = 0;
	private int branchenNr = 0;
	private java.lang.String objectClassTag = "";
	private java.lang.StringBuilder handlerClassName = new java.lang.StringBuilder();
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private java.lang.StringBuilder xmlCode = new java.lang.StringBuilder();
	private java.lang.String handlerScope = "";
	private java.lang.String handlerName = "";
	private java.lang.StringBuilder xmlFileName = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "tabelleNr", "formname", "minBreitePixel", "minHöhePixel", "formNr",
			"anzZusatzregister", "branchenNr", "objectClassTag",
			"handlerClassName", "kommentar", "xmlCode", "handlerScope",
			"handlerName", "xmlFileName" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("tabelleNr", 2, 0, "int", null),
			new FieldSpec("formname", 3, 31, "java.lang.String", null),
			new FieldSpec("minBreitePixel", 4, 0, "int", null),
			new FieldSpec("minHöhePixel", 5, 0, "int", null),
			new FieldSpec("formNr", 6, 0, "int", null),
			new FieldSpec("anzZusatzregister", 7, 0, "int", null),
			new FieldSpec("branchenNr", 8, 0, "int", null),
			new FieldSpec("objectClassTag", 9, 80, "java.lang.String", null),
			new FieldSpec("handlerClassName", 10, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("kommentar", 11, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("xmlCode", 12, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("handlerScope", 13, 80, "java.lang.String", null),
			new FieldSpec("handlerName", 14, 80, "java.lang.String", null),
			new FieldSpec("xmlFileName", 15, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Eingabeformen() {
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

	public void setTabelleNr(int inp) {
		tabelleNr = inp;
	}

	public int getTabelleNr()

	{
		return tabelleNr;
	}

	public void setFormname(java.lang.String inp) {
		formname = inp;
	}

	public java.lang.String getFormname()

	{
		return formname;
	}

	public void setMinBreitePixel(int inp) {
		minBreitePixel = inp;
	}

	public int getMinBreitePixel()

	{
		return minBreitePixel;
	}

	public void setMinHöhePixel(int inp) {
		minHöhePixel = inp;
	}

	public int getMinHöhePixel()

	{
		return minHöhePixel;
	}

	public void setFormNr(int inp) {
		formNr = inp;
	}

	public int getFormNr()

	{
		return formNr;
	}

	public void setAnzZusatzregister(int inp) {
		anzZusatzregister = inp;
	}

	public int getAnzZusatzregister()

	{
		return anzZusatzregister;
	}

	public void setBranchenNr(int inp) {
		branchenNr = inp;
	}

	public int getBranchenNr()

	{
		return branchenNr;
	}

	public void setObjectClassTag(java.lang.String inp) {
		objectClassTag = inp;
	}

	public java.lang.String getObjectClassTag()

	{
		return objectClassTag;
	}

	public void setHandlerClassName(java.lang.StringBuilder inp) {
		handlerClassName = inp;
	}

	public java.lang.StringBuilder getHandlerClassName()

	{
		return handlerClassName;
	}

	public void setKommentar(java.lang.StringBuilder inp) {
		kommentar = inp;
	}

	public java.lang.StringBuilder getKommentar()

	{
		return kommentar;
	}

	public void setXmlCode(java.lang.StringBuilder inp) {
		xmlCode = inp;
	}

	public java.lang.StringBuilder getXmlCode()

	{
		return xmlCode;
	}

	public void setHandlerScope(java.lang.String inp) {
		handlerScope = inp;
	}

	public java.lang.String getHandlerScope()

	{
		return handlerScope;
	}

	public void setHandlerName(java.lang.String inp) {
		handlerName = inp;
	}

	public java.lang.String getHandlerName()

	{
		return handlerName;
	}

	public void setXmlFileName(java.lang.StringBuilder inp) {
		xmlFileName = inp;
	}

	public java.lang.StringBuilder getXmlFileName()

	{
		return xmlFileName;
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
