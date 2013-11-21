/*
 * ImpExpFelder.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 88 mit dem Namen "ImpExpFelder"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class ImpExpFelder extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "ImpExpFelder";
	public static final int dbTabNummer = 88;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int filterNr_Fn = 1;
	public static int sortierNr_Fn = 2;
	public static int tabelleNr_Fn = 3;
	public static int feldNr_Fn = 4;
	public static int bezeichnung_Fn = 5;
	public static int text_Fn = 6;
	public static int leer_Fn = 7;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int filterNr = 0;
	private int sortierNr = 0;
	private int tabelleNr = 0;
	private int feldNr = 0;
	private java.lang.String bezeichnung = "";
	private java.lang.String text = "";
	private java.lang.String leer = "";
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("filterNr", 1, 0, "int", null),
			new FieldSpec("sortierNr", 2, 0, "int", null),
			new FieldSpec("tabelleNr", 3, 0, "int", null),
			new FieldSpec("feldNr", 4, 0, "int", null),
			new FieldSpec("bezeichnung", 5, 40, "java.lang.String", null),
			new FieldSpec("text", 6, 80, "java.lang.String", null),
			new FieldSpec("leer", 7, 2, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public ImpExpFelder() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setFilterNr(int inp) {
		filterNr = inp;
	}

	public int getFilterNr()

	{
		return filterNr;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setTabelleNr(int inp) {
		tabelleNr = inp;
	}

	public int getTabelleNr()

	{
		return tabelleNr;
	}

	public void setFeldNr(int inp) {
		feldNr = inp;
	}

	public int getFeldNr()

	{
		return feldNr;
	}

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setText(java.lang.String inp) {
		text = inp;
	}

	public java.lang.String getText()

	{
		return text;
	}

	public void setLeer(java.lang.String inp) {
		leer = inp;
	}

	public java.lang.String getLeer()

	{
		return leer;
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
