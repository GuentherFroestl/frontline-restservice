/*
 * ImpExpFilter.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 87 mit dem Namen "ImpExpFilter"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class ImpExpFilter extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "ImpExpFilter";
	public static final int dbTabNummer = 87;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int filterNr_Fn = 1;
	public static int bezeichnung_Fn = 2;
	public static int beschreibung_Fn = 3;
	public static int tabelleNr_Fn = 4;
	public static int intern_Fn = 5;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int filterNr = 0;
	private java.lang.String bezeichnung = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private int tabelleNr = 0;
	private boolean intern = false;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("filterNr", 1, 0, "int", null),
			new FieldSpec("bezeichnung", 2, 40, "java.lang.String", null),
			new FieldSpec("beschreibung", 3, 32768, "java.lang.StringBuilder",
					null), new FieldSpec("tabelleNr", 4, 0, "int", null),
			new FieldSpec("intern", 5, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public ImpExpFilter() {
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

	public void setBezeichnung(java.lang.String inp) {
		bezeichnung = inp;
	}

	public java.lang.String getBezeichnung()

	{
		return bezeichnung;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setTabelleNr(int inp) {
		tabelleNr = inp;
	}

	public int getTabelleNr()

	{
		return tabelleNr;
	}

	public void setIntern(boolean inp) {
		intern = inp;
	}

	public boolean getIntern()

	{
		return intern;
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
