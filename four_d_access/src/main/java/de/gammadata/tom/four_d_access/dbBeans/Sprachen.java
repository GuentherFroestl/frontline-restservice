/*
 * Sprachen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 42 mit dem Namen "Sprachen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Sprachen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Sprachen";
	public static final int dbTabNummer = 42;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int sprachenNr_Fn = 1;
	public static int bezeichnung_Fn = 2;
	public static int sprachID_Fn = 3;
	public static int webDir_Fn = 4;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int sprachenNr = 0;
	private java.lang.String bezeichnung = "";
	private int sprachID = 0;
	private java.lang.StringBuilder webDir = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("sprachenNr", 1, 0, "int", null),
			new FieldSpec("bezeichnung", 2, 40, "java.lang.String", null),
			new FieldSpec("sprachID", 3, 0, "int", null),
			new FieldSpec("webDir", 4, 32768, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public Sprachen() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setSprachenNr(int inp) {
		sprachenNr = inp;
	}

	public int getSprachenNr()

	{
		return sprachenNr;
	}

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setSprachID(int inp) {
		sprachID = inp;
	}

	public int getSprachID()

	{
		return sprachID;
	}

	public void setWebDir(java.lang.StringBuilder inp) {
		webDir = inp;
	}

	public java.lang.StringBuilder getWebDir()

	{
		return webDir;
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
