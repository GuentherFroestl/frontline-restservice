/*
 * Branchen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 44 mit dem Namen "Branchen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Branchen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Branchen";
	public static final int dbTabNummer = 44;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int branchenNr_Fn = 1;
	public static int sID_Fn = 2;
	public static int selctedBranchenNR_Fn = 3;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int branchenNr = 0;
	private int sID = 0;
	private int selctedBranchenNR = 0;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("branchenNr", 1, 0, "int", null),
			new FieldSpec("sID", 2, 0, "int", null),
			new FieldSpec("selctedBranchenNR", 3, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Branchen() {
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

	public void setSID(int inp) {
		sID = inp;
	}

	public int getSID()

	{
		return sID;
	}

	public void setSelctedBranchenNR(int inp) {
		selctedBranchenNR = inp;
	}

	public int getSelctedBranchenNR()

	{
		return selctedBranchenNR;
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
