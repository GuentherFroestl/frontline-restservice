/*
 * Kalender.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 89 mit dem Namen "Kalender"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Kalender extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Kalender";
	public static final int dbTabNummer = 89;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int kalenderNr_Fn = 1;
	public static int kalenderName_Fn = 2;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int kalenderNr = 0;
	private java.lang.String kalenderName = "";
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"kalenderNr", "kalenderName" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("kalenderNr", 1, 0, "int", null),
			new FieldSpec("kalenderName", 2, 40, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public Kalender() {
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

	public void setKalenderName(java.lang.String inp) {
		kalenderName = inp;
	}

	public java.lang.String getKalenderName()

	{
		return kalenderName;
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
