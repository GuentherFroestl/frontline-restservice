/*
 * Vorgaben.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 56 mit dem Namen "Vorgaben"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Vorgaben extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Vorgaben";
	public static final int dbTabNummer = 56;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int aL_Fontname_Fn = 1;
	public static int aL_Height1_Fn = 2;
	public static int aL_Height2_Fn = 3;
	public static int aL_Height3_Fn = 4;
	public static int aL_Style1_Fn = 5;
	public static int aL_Style2_Fn = 6;
	public static int aL_Style3_Fn = 7;
	public static int vorgabeNr_Fn = 8;
	public static int vorgabeName_Fn = 9;
	public static int aL_Height1_Mac_Fn = 10;
	public static int aL_Height2_Mac_Fn = 11;
	public static int aL_Height3_Mac_Fn = 12;
	public static int aL_Fontname_Mac_Fn = 13;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private java.lang.String aL_Fontname = "";
	private int aL_Height1 = 0;
	private int aL_Height2 = 0;
	private int aL_Height3 = 0;
	private int aL_Style1 = 0;
	private int aL_Style2 = 0;
	private int aL_Style3 = 0;
	private int vorgabeNr = 0;
	private java.lang.String vorgabeName = "";
	private int aL_Height1_Mac = 0;
	private int aL_Height2_Mac = 0;
	private int aL_Height3_Mac = 0;
	private java.lang.String aL_Fontname_Mac = "";
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"aL_Fontname", "aL_Height1", "aL_Height2", "aL_Height3", "aL_Style1",
			"aL_Style2", "aL_Style3", "vorgabeNr", "vorgabeName",
			"aL_Height1_Mac", "aL_Height2_Mac", "aL_Height3_Mac",
			"aL_Fontname_Mac" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("aL_Fontname", 1, 40, "java.lang.String", null),
			new FieldSpec("aL_Height1", 2, 0, "int", null),
			new FieldSpec("aL_Height2", 3, 0, "int", null),
			new FieldSpec("aL_Height3", 4, 0, "int", null),
			new FieldSpec("aL_Style1", 5, 0, "int", null),
			new FieldSpec("aL_Style2", 6, 0, "int", null),
			new FieldSpec("aL_Style3", 7, 0, "int", null),
			new FieldSpec("vorgabeNr", 8, 0, "int", null),
			new FieldSpec("vorgabeName", 9, 40, "java.lang.String", null),
			new FieldSpec("aL_Height1_Mac", 10, 0, "int", null),
			new FieldSpec("aL_Height2_Mac", 11, 0, "int", null),
			new FieldSpec("aL_Height3_Mac", 12, 0, "int", null),
			new FieldSpec("aL_Fontname_Mac", 13, 40, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Vorgaben() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setAL_Fontname(java.lang.String inp) {
		aL_Fontname = inp;
	}

	public java.lang.String getAL_Fontname()

	{
		return aL_Fontname;
	}

	public void setAL_Height1(int inp) {
		aL_Height1 = inp;
	}

	public int getAL_Height1()

	{
		return aL_Height1;
	}

	public void setAL_Height2(int inp) {
		aL_Height2 = inp;
	}

	public int getAL_Height2()

	{
		return aL_Height2;
	}

	public void setAL_Height3(int inp) {
		aL_Height3 = inp;
	}

	public int getAL_Height3()

	{
		return aL_Height3;
	}

	public void setAL_Style1(int inp) {
		aL_Style1 = inp;
	}

	public int getAL_Style1()

	{
		return aL_Style1;
	}

	public void setAL_Style2(int inp) {
		aL_Style2 = inp;
	}

	public int getAL_Style2()

	{
		return aL_Style2;
	}

	public void setAL_Style3(int inp) {
		aL_Style3 = inp;
	}

	public int getAL_Style3()

	{
		return aL_Style3;
	}

	public void setVorgabeNr(int inp) {
		vorgabeNr = inp;
	}

	public int getVorgabeNr()

	{
		return vorgabeNr;
	}

	public void setVorgabeName(java.lang.String inp) {
		vorgabeName = inp;
	}

	public java.lang.String getVorgabeName()

	{
		return vorgabeName;
	}

	public void setAL_Height1_Mac(int inp) {
		aL_Height1_Mac = inp;
	}

	public int getAL_Height1_Mac()

	{
		return aL_Height1_Mac;
	}

	public void setAL_Height2_Mac(int inp) {
		aL_Height2_Mac = inp;
	}

	public int getAL_Height2_Mac()

	{
		return aL_Height2_Mac;
	}

	public void setAL_Height3_Mac(int inp) {
		aL_Height3_Mac = inp;
	}

	public int getAL_Height3_Mac()

	{
		return aL_Height3_Mac;
	}

	public void setAL_Fontname_Mac(java.lang.String inp) {
		aL_Fontname_Mac = inp;
	}

	public java.lang.String getAL_Fontname_Mac()

	{
		return aL_Fontname_Mac;
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
