/*
 * ChgRecordLog.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 102 mit dem Namen "ChgRecordLog"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class ChgRecordLog extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "ChgRecordLog";
	public static final int dbTabNummer = 102;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int sequenceNumber_Fn = 1;
	public static int tabNum_Fn = 2;
	public static int dID_Fn = 3;
	public static int standort_Fn = 4;
	public static int chgMod_Fn = 5;
	public static int updateState_Fn = 6;
	public static int datum_Fn = 7;
	public static int zeit_Fn = 8;
	public static int timestamp_Fn = 9;
	public static int dstStandortID_Fn = 10;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int sequenceNumber = 0;
	private int tabNum = 0;
	private int dID = 0;
	private int standort = 0;
	private int chgMod = 0;
	private int updateState = 0;
	private java.sql.Date datum = new java.sql.Date(0);
	private java.sql.Time zeit = new java.sql.Time(0);
	private int timestamp = 0;
	private int dstStandortID = 0;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("sequenceNumber", 1, 0, "int", null),
			new FieldSpec("tabNum", 2, 0, "int", null),
			new FieldSpec("dID", 3, 0, "int", null),
			new FieldSpec("standort", 4, 0, "int", null),
			new FieldSpec("chgMod", 5, 0, "int", null),
			new FieldSpec("updateState", 6, 0, "int", null),
			new FieldSpec("datum", 7, 0, "java.sql.Date", null),
			new FieldSpec("zeit", 8, 0, "java.sql.Time", null),
			new FieldSpec("timestamp", 9, 0, "int", null),
			new FieldSpec("dstStandortID", 10, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public ChgRecordLog() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setSequenceNumber(int inp) {
		sequenceNumber = inp;
	}

	public int getSequenceNumber()

	{
		return sequenceNumber;
	}

	public void setTabNum(int inp) {
		tabNum = inp;
	}

	public int getTabNum()

	{
		return tabNum;
	}

	@Override
	public void setDID(int inp) {
		dID = inp;
	}

	@Override
	public int getDID()

	{
		return dID;
	}

	public void setStandort(int inp) {
		standort = inp;
	}

	public int getStandort()

	{
		return standort;
	}

	public void setChgMod(int inp) {
		chgMod = inp;
	}

	public int getChgMod()

	{
		return chgMod;
	}

	public void setUpdateState(int inp) {
		updateState = inp;
	}

	public int getUpdateState()

	{
		return updateState;
	}

	public void setDatum(java.sql.Date inp) {
		datum = inp;
	}

	public java.sql.Date getDatum()

	{
		return datum;
	}

	public void setZeit(java.sql.Time inp) {
		zeit = inp;
	}

	public java.sql.Time getZeit()

	{
		return zeit;
	}

	public void setTimestamp(int inp) {
		timestamp = inp;
	}

	public int getTimestamp()

	{
		return timestamp;
	}

	public void setDstStandortID(int inp) {
		dstStandortID = inp;
	}

	public int getDstStandortID()

	{
		return dstStandortID;
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
