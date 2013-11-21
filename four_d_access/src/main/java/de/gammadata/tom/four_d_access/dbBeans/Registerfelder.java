/*
 * Registerfelder.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 50 mit dem Namen "Registerfelder"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Registerfelder extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Registerfelder";
	public static final int dbTabNummer = 50;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int registerNr_Fn = 1;
	public static int tabelleNr_Fn = 2;
	public static int feldNr_Fn = 3;
	public static int sortierNr_Fn = 4;
	public static int breite_Fn = 5;
	public static int leer_Fn = 6;
	public static int nonEnterable_Fn = 7;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int registerNr = 0;
	private int tabelleNr = 0;
	private int feldNr = 0;
	private int sortierNr = 0;
	private int breite = 0;
	private int leer = 0;
	private boolean nonEnterable = false;
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"registerNr", "tabelleNr", "feldNr", "sortierNr", "breite", "leer",
			"nonEnterable" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("registerNr", 1, 0, "int", null),
			new FieldSpec("tabelleNr", 2, 0, "int", null),
			new FieldSpec("feldNr", 3, 0, "int", null),
			new FieldSpec("sortierNr", 4, 0, "int", null),
			new FieldSpec("breite", 5, 0, "int", null),
			new FieldSpec("leer", 6, 0, "int", null),
			new FieldSpec("nonEnterable", 7, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Registerfelder() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setRegisterNr(int inp) {
		registerNr = inp;
	}

	public int getRegisterNr()

	{
		return registerNr;
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

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setBreite(int inp) {
		breite = inp;
	}

	public int getBreite()

	{
		return breite;
	}

	public void setLeer(int inp) {
		leer = inp;
	}

	public int getLeer()

	{
		return leer;
	}

	public void setNonEnterable(boolean inp) {
		nonEnterable = inp;
	}

	public boolean getNonEnterable()

	{
		return nonEnterable;
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
