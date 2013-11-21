/*
 * Eingabeseiten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 51 mit dem Namen "Eingabeseiten"
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

public class Eingabeseiten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Eingabeseiten";
	public static final int dbTabNummer = 51;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int _053_001_Eingabeformen_Fn = 2;
	public static int seitenNr_Fn = 3;
	public static int sID_Fn = 4;
	public static int orderNr_Fn = 5;
	public static int seitenBez_Fn = 6;
	public static int seitenLayoutCode_Fn = 7;
	public static int kommentar_Fn = 8;
	public static int xmlCode_Fn = 9;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private int _053_001_Eingabeformen = 0;
	private int seitenNr = 0;
	private int sID = 0;
	private int orderNr = 0;
	private java.lang.String seitenBez = "";
	private java.lang.String seitenLayoutCode = "";
	private java.lang.StringBuilder kommentar = new java.lang.StringBuilder();
	private java.lang.StringBuilder xmlCode = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "_053_001_Eingabeformen", "seitenNr", "sID", "orderNr", "seitenBez",
			"seitenLayoutCode", "kommentar", "xmlCode" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("_053_001_Eingabeformen", 2, 0, "int",
					new OneObjectPointer(53, 1, "Eingabeformen", "")),
			new FieldSpec("seitenNr", 3, 0, "int", null),
			new FieldSpec("sID", 4, 0, "int", null),
			new FieldSpec("orderNr", 5, 0, "int", null),
			new FieldSpec("seitenBez", 6, 80, "java.lang.String", null),
			new FieldSpec("seitenLayoutCode", 7, 40, "java.lang.String", null),
			new FieldSpec("kommentar", 8, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("xmlCode", 9, 32768, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Eingabeseiten() {
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

	public void set_053_001_Eingabeformen(int inp) {
		_053_001_Eingabeformen = inp;
	}

	public int get_053_001_Eingabeformen()

	{
		return _053_001_Eingabeformen;
	}

	public void setSeitenNr(int inp) {
		seitenNr = inp;
	}

	public int getSeitenNr()

	{
		return seitenNr;
	}

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setOrderNr(int inp) {
		orderNr = inp;
	}

	public int getOrderNr()

	{
		return orderNr;
	}

	public void setSeitenBez(java.lang.String inp) {
		seitenBez = inp;
	}

	public java.lang.String getSeitenBez()

	{
		return seitenBez;
	}

	public void setSeitenLayoutCode(java.lang.String inp) {
		seitenLayoutCode = inp;
	}

	public java.lang.String getSeitenLayoutCode()

	{
		return seitenLayoutCode;
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
