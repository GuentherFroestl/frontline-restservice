package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.OneObjectPointer;

/**
 * 
 * @author gfr
 */

public class EingabeSeitenObjekte extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EingabeSeitenObjekte";
	public static final int dbTabNummer = 52;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int _051_001_Eingabeseiten_Fn = 2;
	public static int _049_001_RegisterNr_Fn = 3;
	public static int sortierNr_Fn = 4;
	public static int _053_001_EingabeFormInput_Fn = 5;
	public static int tabellenNummer_Fn = 6;
	public static int eingabeformName_Fn = 7;
	public static int xmlFilterCode_Fn = 8;
	public static int xmlCodeForObjects_Fn = 9;
	public static int isRegister_Fn = 10;
	public static int reloadAlways_Fn = 11;
	public static int objektName_Fn = 12;
	public static int objectClass_Fn = 13;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private int _051_001_Eingabeseiten = 0;
	private int _049_001_RegisterNr = 0;
	private int sortierNr = 0;
	private int _053_001_EingabeFormInput = 0;
	private int tabellenNummer = 0;
	private java.lang.String eingabeformName = "";
	private java.lang.StringBuilder xmlFilterCode = new java.lang.StringBuilder();
	private java.lang.StringBuilder xmlCodeForObjects = new java.lang.StringBuilder();
	private boolean isRegister = false;
	private boolean reloadAlways = false;
	private java.lang.String objektName = "";
	private java.lang.StringBuilder objectClass = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "_051_001_Eingabeseiten", "_049_001_RegisterNr", "sortierNr",
			"_053_001_EingabeFormInput", "tabellenNummer", "eingabeformName",
			"xmlFilterCode", "xmlCodeForObjects", "isRegister", "reloadAlways",
			"objektName", "objectClass" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("_051_001_Eingabeseiten", 2, 0, "int",
					new OneObjectPointer(51, 1, "Eingabeseiten", "")),
			new FieldSpec("_049_001_RegisterNr", 3, 0, "int",
					new OneObjectPointer(49, 1, "RegisterNr", "")),
			new FieldSpec("sortierNr", 4, 0, "int", null),
			new FieldSpec("_053_001_EingabeFormInput", 5, 0, "int",
					new OneObjectPointer(53, 1, "EingabeFormInput", "")),
			new FieldSpec("tabellenNummer", 6, 0, "int", null),
			new FieldSpec("eingabeformName", 7, 40, "java.lang.String", null),
			new FieldSpec("xmlFilterCode", 8, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("xmlCodeForObjects", 9, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("isRegister", 10, 0, "boolean", null),
			new FieldSpec("reloadAlways", 11, 0, "boolean", null),
			new FieldSpec("objektName", 12, 80, "java.lang.String", null),
			new FieldSpec("objectClass", 13, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public EingabeSeitenObjekte() {
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

	public void set_051_001_Eingabeseiten(int inp) {
		_051_001_Eingabeseiten = inp;
	}

	public int get_051_001_Eingabeseiten()

	{
		return _051_001_Eingabeseiten;
	}

	public void set_049_001_RegisterNr(int inp) {
		_049_001_RegisterNr = inp;
	}

	public int get_049_001_RegisterNr()

	{
		return _049_001_RegisterNr;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void set_053_001_EingabeFormInput(int inp) {
		_053_001_EingabeFormInput = inp;
	}

	public int get_053_001_EingabeFormInput()

	{
		return _053_001_EingabeFormInput;
	}

	public void setTabellenNummer(int inp) {
		tabellenNummer = inp;
	}

	public int getTabellenNummer()

	{
		return tabellenNummer;
	}

	public void setEingabeformName(java.lang.String inp) {
		eingabeformName = inp;
	}

	public java.lang.String getEingabeformName()

	{
		return eingabeformName;
	}

	public void setXmlFilterCode(java.lang.StringBuilder inp) {
		xmlFilterCode = inp;
	}

	public java.lang.StringBuilder getXmlFilterCode()

	{
		return xmlFilterCode;
	}

	public void setXmlCodeForObjects(java.lang.StringBuilder inp) {
		xmlCodeForObjects = inp;
	}

	public java.lang.StringBuilder getXmlCodeForObjects()

	{
		return xmlCodeForObjects;
	}

	public void setIsRegister(boolean inp) {
		isRegister = inp;
	}

	public boolean getIsRegister()

	{
		return isRegister;
	}

	public void setReloadAlways(boolean inp) {
		reloadAlways = inp;
	}

	public boolean getReloadAlways()

	{
		return reloadAlways;
	}

	public void setObjektName(java.lang.String inp) {
		objektName = inp;
	}

	public java.lang.String getObjektName()

	{
		return objektName;
	}

	public void setObjectClass(java.lang.StringBuilder inp) {
		objectClass = inp;
	}

	public java.lang.StringBuilder getObjectClass()

	{
		return objectClass;
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
