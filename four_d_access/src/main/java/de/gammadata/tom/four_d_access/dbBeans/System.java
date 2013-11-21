/*
 * System.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 18 mit dem Namen "System"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class System extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "System";
	public static final int dbTabNummer = 18;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int standortNr_Fn = 1;
	public static int startMandantenNr_Fn = 2;
	public static int versionsNr_Fn = 3;
	public static int anzStartups_Fn = 4;
	public static int anzRecords_Fn = 5;
	public static int branchenVersionNr_Fn = 6;
	public static int spracheNr_Fn = 7;
	public static int z1_Fn = 8;
	public static int modus_Fn = 9;
	public static int l1_Fn = 10;
	public static int updateLevel_Fn = 11;
	public static int lZ_Fn = 12;
	public static int tAN_Fn = 13;
	public static int queryServerModus_Fn = 14;
	public static int queryServerUser_Fn = 15;
	public static int queryServerPw_Fn = 16;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int standortNr = 0;
	private int startMandantenNr = 0;
	private java.lang.String versionsNr = "";
	private int anzStartups = 0;
	private int anzRecords = 0;
	private int branchenVersionNr = 0;
	private int spracheNr = 0;
	private java.sql.Date z1 = new java.sql.Date(0);
	private int modus = 0;
	private int l1 = 0;
	private int updateLevel = 0;
	private byte[] lZ = new byte[0];
	private int tAN = 0;
	private int queryServerModus = 0;
	private java.lang.String queryServerUser = "";
	private java.lang.String queryServerPw = "";
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("standortNr", 1, 0, "int", null),
			new FieldSpec("startMandantenNr", 2, 0, "int", null),
			new FieldSpec("versionsNr", 3, 40, "java.lang.String", null),
			new FieldSpec("anzStartups", 4, 0, "int", null),
			new FieldSpec("anzRecords", 5, 0, "int", null),
			new FieldSpec("branchenVersionNr", 6, 0, "int", null),
			new FieldSpec("spracheNr", 7, 0, "int", null),
			new FieldSpec("z1", 8, 0, "java.sql.Date", null),
			new FieldSpec("modus", 9, 0, "int", null),
			new FieldSpec("l1", 10, 0, "int", null),
			new FieldSpec("updateLevel", 11, 0, "int", null),
			new FieldSpec("lZ", 12, 0, "byte[]", null),
			new FieldSpec("tAN", 13, 0, "int", null),
			new FieldSpec("queryServerModus", 14, 0, "int", null),
			new FieldSpec("queryServerUser", 15, 40, "java.lang.String", null),
			new FieldSpec("queryServerPw", 16, 40, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public System() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setStandortNr(int inp) {
		standortNr = inp;
	}

	public int getStandortNr()

	{
		return standortNr;
	}

	public void setStartMandantenNr(int inp) {
		startMandantenNr = inp;
	}

	public int getStartMandantenNr()

	{
		return startMandantenNr;
	}

	public void setVersionsNr(java.lang.String inp) {
		versionsNr = inp;
	}

	public java.lang.String getVersionsNr()

	{
		return versionsNr;
	}

	public void setAnzStartups(int inp) {
		anzStartups = inp;
	}

	public int getAnzStartups()

	{
		return anzStartups;
	}

	public void setAnzRecords(int inp) {
		anzRecords = inp;
	}

	public int getAnzRecords()

	{
		return anzRecords;
	}

	public void setBranchenVersionNr(int inp) {
		branchenVersionNr = inp;
	}

	public int getBranchenVersionNr()

	{
		return branchenVersionNr;
	}

	public void setSpracheNr(int inp) {
		spracheNr = inp;
	}

	public int getSpracheNr()

	{
		return spracheNr;
	}

	public void setZ1(java.sql.Date inp) {
		z1 = inp;
	}

	public java.sql.Date getZ1()

	{
		return z1;
	}

	public void setModus(int inp) {
		modus = inp;
	}

	public int getModus()

	{
		return modus;
	}

	public void setL1(int inp) {
		l1 = inp;
	}

	public int getL1()

	{
		return l1;
	}

	public void setUpdateLevel(int inp) {
		updateLevel = inp;
	}

	public int getUpdateLevel()

	{
		return updateLevel;
	}

	public void setLZ(byte[] inp) {
		lZ = inp;
	}

	public byte[] getLZ()

	{
		return lZ;
	}

	public void setTAN(int inp) {
		tAN = inp;
	}

	public int getTAN()

	{
		return tAN;
	}

	public void setQueryServerModus(int inp) {
		queryServerModus = inp;
	}

	public int getQueryServerModus()

	{
		return queryServerModus;
	}

	public void setQueryServerUser(java.lang.String inp) {
		queryServerUser = inp;
	}

	public java.lang.String getQueryServerUser()

	{
		return queryServerUser;
	}

	public void setQueryServerPw(java.lang.String inp) {
		queryServerPw = inp;
	}

	public java.lang.String getQueryServerPw()

	{
		return queryServerPw;
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
