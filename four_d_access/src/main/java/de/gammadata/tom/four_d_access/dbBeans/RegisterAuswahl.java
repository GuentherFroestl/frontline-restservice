/*
 * RegisterAuswahl.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 86 mit dem Namen "RegisterAuswahl"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class RegisterAuswahl extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "RegisterAuswahl";
	public static final int dbTabNummer = 86;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int registerNr_Fn = 1;
	public static int sortierNr_Fn = 2;
	public static int sID_Fn = 3;
	public static int befehl_Fn = 4;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int registerNr = 0;
	private int sortierNr = 0;
	private int sID = 0;
	private java.lang.StringBuilder befehl = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("registerNr", 1, 0, "int", null),
			new FieldSpec("sortierNr", 2, 0, "int", null),
			new FieldSpec("sID", 3, 0, "int", null),
			new FieldSpec("befehl", 4, 32768, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public RegisterAuswahl() {
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

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setBefehl(java.lang.StringBuilder inp) {
		befehl = inp;
	}

	public java.lang.StringBuilder getBefehl()

	{
		return befehl;
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
