/*
 * Fenster.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 47 mit dem Namen "Fenster"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Fenster extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Fenster";
	public static final int dbTabNummer = 47;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int fensterNr_Fn = 1;
	public static int sID_Fn = 2;
	public static int sortierNr_Fn = 3;
	public static int branchenNr_Fn = 4;
	public static int layout_Fn = 5;
	public static int minBreitePixel_Fn = 6;
	public static int minHöhePixel_Fn = 7;
	public static int anordnung_Fn = 8;
	public static int menuNr_Fn = 9;
	public static int itemNr_Fn = 10;
	public static int uRL_Fn = 11;
	public static int subItemNr_Fn = 12;
	public static int tabelleNr_Fn = 13;
	public static int hTML_File_Fn = 14;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int fensterNr = 0;
	private int sID = 0;
	private int sortierNr = 0;
	private int branchenNr = 0;
	private java.lang.String layout = "";
	private int minBreitePixel = 0;
	private int minHöhePixel = 0;
	private int anordnung = 0;
	private int menuNr = 0;
	private int itemNr = 0;
	private java.lang.StringBuilder uRL = new java.lang.StringBuilder();
	private int subItemNr = 0;
	private int tabelleNr = 0;
	private java.lang.StringBuilder hTML_File = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"fensterNr", "sID", "sortierNr", "branchenNr", "layout", "minBreitePixel",
			"minHöhePixel", "anordnung", "menuNr", "itemNr", "uRL",
			"subItemNr", "tabelleNr", "hTML_File" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("fensterNr", 1, 0, "int", null),
			new FieldSpec("sID", 2, 0, "int", null),
			new FieldSpec("sortierNr", 3, 0, "int", null),
			new FieldSpec("branchenNr", 4, 0, "int", null),
			new FieldSpec("layout", 5, 31, "java.lang.String", null),
			new FieldSpec("minBreitePixel", 6, 0, "int", null),
			new FieldSpec("minHöhePixel", 7, 0, "int", null),
			new FieldSpec("anordnung", 8, 0, "int", null),
			new FieldSpec("menuNr", 9, 0, "int", null),
			new FieldSpec("itemNr", 10, 0, "int", null),
			new FieldSpec("uRL", 11, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("subItemNr", 12, 0, "int", null),
			new FieldSpec("tabelleNr", 13, 0, "int", null),
			new FieldSpec("hTML_File", 14, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Fenster() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setFensterNr(int inp) {
		fensterNr = inp;
	}

	public int getFensterNr()

	{
		return fensterNr;
	}

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setBranchenNr(int inp) {
		branchenNr = inp;
	}

	public int getBranchenNr()

	{
		return branchenNr;
	}

	public void setLayout(java.lang.String inp) {
		layout = inp;
	}

	public java.lang.String getLayout()

	{
		return layout;
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

	public void setAnordnung(int inp) {
		anordnung = inp;
	}

	public int getAnordnung()

	{
		return anordnung;
	}

	public void setMenuNr(int inp) {
		menuNr = inp;
	}

	public int getMenuNr()

	{
		return menuNr;
	}

	public void setItemNr(int inp) {
		itemNr = inp;
	}

	public int getItemNr()

	{
		return itemNr;
	}

	public void setURL(java.lang.StringBuilder inp) {
		uRL = inp;
	}

	public java.lang.StringBuilder getURL()

	{
		return uRL;
	}

	public void setSubItemNr(int inp) {
		subItemNr = inp;
	}

	public int getSubItemNr()

	{
		return subItemNr;
	}

	public void setTabelleNr(int inp) {
		tabelleNr = inp;
	}

	public int getTabelleNr()

	{
		return tabelleNr;
	}

	public void setHTML_File(java.lang.StringBuilder inp) {
		hTML_File = inp;
	}

	public java.lang.StringBuilder getHTML_File()

	{
		return hTML_File;
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
