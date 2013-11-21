/*
 * Sprachvariablen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 57 mit dem Namen "Sprachvariablen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Sprachvariablen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Sprachvariablen";
	public static final int dbTabNummer = 57;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int sprachenNr_Fn = 1;
	public static int sID_Fn = 2;
	public static int sprachtext_Fn = 3;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int sprachenNr = 0;
	private int sID = 0;
	private java.lang.StringBuilder sprachtext = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"sprachenNr", "sID", "sprachtext" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("sprachenNr", 1, 0, "int", null),
			new FieldSpec("sID", 2, 0, "int", null),
			new FieldSpec("sprachtext", 3, 32768, "java.lang.StringBuilder",
					null) };

	// generierte Feldkonstanten - Ende

	public Sprachvariablen() {
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

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setSprachtext(java.lang.StringBuilder inp) {
		sprachtext = inp;
	}

	public java.lang.StringBuilder getSprachtext()

	{
		return sprachtext;
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
