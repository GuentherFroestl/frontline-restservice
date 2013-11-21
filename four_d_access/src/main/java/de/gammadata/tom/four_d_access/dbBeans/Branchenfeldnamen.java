/*
 * Branchenfeldnamen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 45 mit dem Namen "Branchenfeldnamen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Branchenfeldnamen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Branchenfeldnamen";
	public static final int dbTabNummer = 45;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int branchenNr_Fn = 1;
	public static int sprachenNr_Fn = 2;
	public static int tabelleNr_Fn = 3;
	public static int feldNr_Fn = 4;
	public static int bezeichnung_Fn = 5;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int branchenNr = 0;
	private int sprachenNr = 0;
	private int tabelleNr = 0;
	private int feldNr = 0;
	private java.lang.String bezeichnung = "";
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("branchenNr", 1, 0, "int", null),
			new FieldSpec("sprachenNr", 2, 0, "int", null),
			new FieldSpec("tabelleNr", 3, 0, "int", null),
			new FieldSpec("feldNr", 4, 0, "int", null),
			new FieldSpec("bezeichnung", 5, 31, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Branchenfeldnamen() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setBranchenNr(int inp) {
		branchenNr = inp;
	}

	public int getBranchenNr()

	{
		return branchenNr;
	}

	public void setSprachenNr(int inp) {
		sprachenNr = inp;
	}

	public int getSprachenNr()

	{
		return sprachenNr;
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
