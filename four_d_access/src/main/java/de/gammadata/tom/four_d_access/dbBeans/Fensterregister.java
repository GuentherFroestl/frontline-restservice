/*
 * Fensterregister.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 48 mit dem Namen "Fensterregister"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Fensterregister extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Fensterregister";
	public static final int dbTabNummer = 48;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int fensterNr_Fn = 1;
	public static int registerNr_Fn = 2;
	public static int sortierNr_Fn = 3;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int fensterNr = 0;
	private int registerNr = 0;
	private int sortierNr = 0;
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"fensterNr", "registerNr", "sortierNr" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("fensterNr", 1, 0, "int", null),
			new FieldSpec("registerNr", 2, 0, "int", null),
			new FieldSpec("sortierNr", 3, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Fensterregister() {
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

	public void setRegisterNr(int inp) {
		registerNr = inp;
	}

	public int getRegisterNr()

	{
		return registerNr;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
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
