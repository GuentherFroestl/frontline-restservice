/*
 * Spezialtage.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 90 mit dem Namen "Spezialtage"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Spezialtage extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Spezialtage";
	public static final int dbTabNummer = 90;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int kalenderNr_Fn = 1;
	public static int datum_Fn = 2;
	public static int bezeichnung_Fn = 3;
	public static int arbeitstag_Fn = 4;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int kalenderNr = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.lang.String bezeichnung = "";
	private boolean arbeitstag = false;
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"kalenderNr", "datum", "bezeichnung", "arbeitstag" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("kalenderNr", 1, 0, "int", null),
			new FieldSpec("datum", 2, 0, "java.sql.Date", null),
			new FieldSpec("bezeichnung", 3, 30, "java.lang.String", null),
			new FieldSpec("arbeitstag", 4, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Spezialtage() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setKalenderNr(int inp) {
		kalenderNr = inp;
	}

	public int getKalenderNr()

	{
		return kalenderNr;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setArbeitstag(boolean inp) {
		arbeitstag = inp;
	}

	public boolean getArbeitstag()

	{
		return arbeitstag;
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
