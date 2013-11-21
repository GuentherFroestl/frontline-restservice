/*
 * RegisterMenüs.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 74 mit dem Namen "RegisterMenüs"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class RegisterMenues extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "RegisterMenüs";
	public static final int dbTabNummer = 74;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int registerNr_Fn = 1;
	public static int menüNr_Fn = 2;
	public static int itemNr_Fn = 3;
	public static int sID_Fn = 4;
	public static int befehl_Fn = 5;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int registerNr = 0;
	private int menüNr = 0;
	private int itemNr = 0;
	private int sID = 0;
	private java.lang.String befehl = "";
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("registerNr", 1, 0, "int", null),
			new FieldSpec("menüNr", 2, 0, "int", null),
			new FieldSpec("itemNr", 3, 0, "int", null),
			new FieldSpec("sID", 4, 0, "int", null),
			new FieldSpec("befehl", 5, 31, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public RegisterMenues() {
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

	public void setMenüNr(int inp) {
		menüNr = inp;
	}

	public int getMenüNr()

	{
		return menüNr;
	}

	public void setItemNr(int inp) {
		itemNr = inp;
	}

	public int getItemNr()

	{
		return itemNr;
	}

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setBefehl(java.lang.String inp) {
		befehl = inp;
	}

	public java.lang.String getBefehl()

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
