/*
 * AppSync.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 75 mit dem Namen "AppSync"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.OneObjectPointer;

/**
 * 
 * @author gfr
 */

public class AppSync extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AppSync";
	public static final int dbTabNummer = 75;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int dL_Fn = 2;
	public static int dEAM_Fn = 3;
	public static int dEVON_Fn = 4;
	public static int dGAM_Fn = 5;
	public static int dMandant_Fn = 6;
	public static int dGVON_Fn = 7;
	public static int dG_Fn = 8;
	public static int dStandort_Fn = 9;
	public static int dDEL_Fn = 10;
	public static int syncApplikationID_Fn = 11;
	public static int _001_001_Mitarbeiter_DID_Fn = 12;
	public static int sycTabNr_Fn = 13;
	public static int syncDID_Fn = 14;
	public static int m_001_021_Mitarbeiter_Kürzel_Fn = 15;
	public static int appSubID_Fn = 16;
	public static int palmRecID_Fn = 17;
	public static int delFlag_Fn = 18;
	public static int mirror1_Fn = 19;
	public static int mirror2_Fn = 20;
	public static int leer_Fn = 21;
	public static int leer1_Fn = 22;
	public static int leer2_Fn = 23;
	public static int leer3_Fn = 24;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private boolean dL = false;
	private java.sql.Date dEAM = new java.sql.Date(0);
	private int dEVON = 0;
	private java.sql.Date dGAM = new java.sql.Date(0);
	private int dMandant = 0;
	private int dGVON = 0;
	private boolean dG = false;
	private int dStandort = 0;
	private boolean dDEL = false;
	private int syncApplikationID = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private int sycTabNr = 0;
	private int syncDID = 0;
	private java.lang.String m_001_021_Mitarbeiter_Kürzel = "";
	private int appSubID = 0;
	private int palmRecID = 0;
	private int delFlag = 0;
	private java.lang.String mirror1 = "";
	private java.lang.String mirror2 = "";
	private java.lang.String leer = "";
	private java.lang.String leer1 = "";
	private java.lang.String leer2 = "";
	private java.lang.String leer3 = "";
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("dL", 2, 0, "boolean", null),
			new FieldSpec("dEAM", 3, 0, "java.sql.Date", null),
			new FieldSpec("dEVON", 4, 0, "int", null),
			new FieldSpec("dGAM", 5, 0, "java.sql.Date", null),
			new FieldSpec("dMandant", 6, 0, "int", null),
			new FieldSpec("dGVON", 7, 0, "int", null),
			new FieldSpec("dG", 8, 0, "boolean", null),
			new FieldSpec("dStandort", 9, 0, "int", null),
			new FieldSpec("dDEL", 10, 0, "boolean", null),
			new FieldSpec("syncApplikationID", 11, 0, "int", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 12, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("sycTabNr", 13, 0, "int", null),
			new FieldSpec("syncDID", 14, 0, "int", null),
			new FieldSpec("m_001_021_Mitarbeiter_Kürzel", 15, 5,
					"java.lang.String", null),
			new FieldSpec("appSubID", 16, 0, "int", null),
			new FieldSpec("palmRecID", 17, 0, "int", null),
			new FieldSpec("delFlag", 18, 0, "int", null),
			new FieldSpec("mirror1", 19, 80, "java.lang.String", null),
			new FieldSpec("mirror2", 20, 80, "java.lang.String", null),
			new FieldSpec("leer", 21, 2, "java.lang.String", null),
			new FieldSpec("leer1", 22, 2, "java.lang.String", null),
			new FieldSpec("leer2", 23, 2, "java.lang.String", null),
			new FieldSpec("leer3", 24, 2, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public AppSync() {
		super();
	}

	// generierte getter/setter - Anfang

	@Override
	public void setDID(int inp) {
		dID = inp;
	}

	@Override
	public int getDID()

	{
		return dID;
	}

	public void setDL(boolean inp) {
		dL = inp;
	}

	public boolean getDL()

	{
		return dL;
	}

	public void setDEAM(java.sql.Date inp) {
		dEAM = inp;
	}

	public java.sql.Date getDEAM()

	{
		return dEAM;
	}

	public void setDEVON(int inp) {
		dEVON = inp;
	}

	public int getDEVON()

	{
		return dEVON;
	}

	public void setDGAM(java.sql.Date inp) {
		dGAM = inp;
	}

	public java.sql.Date getDGAM()

	{
		return dGAM;
	}

	public void setDMandant(int inp) {
		dMandant = inp;
	}

	public int getDMandant()

	{
		return dMandant;
	}

	public void setDGVON(int inp) {
		dGVON = inp;
	}

	public int getDGVON()

	{
		return dGVON;
	}

	public void setDG(boolean inp) {
		dG = inp;
	}

	public boolean getDG()

	{
		return dG;
	}

	public void setDStandort(int inp) {
		dStandort = inp;
	}

	public int getDStandort()

	{
		return dStandort;
	}

	public void setDDEL(boolean inp) {
		dDEL = inp;
	}

	public boolean getDDEL()

	{
		return dDEL;
	}

	public void setSyncApplikationID(int inp) {
		syncApplikationID = inp;
	}

	public int getSyncApplikationID()

	{
		return syncApplikationID;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setSycTabNr(int inp) {
		sycTabNr = inp;
	}

	public int getSycTabNr()

	{
		return sycTabNr;
	}

	public void setSyncDID(int inp) {
		syncDID = inp;
	}

	public int getSyncDID()

	{
		return syncDID;
	}

	public void setM_001_021_Mitarbeiter_Kürzel(java.lang.String inp) {
		m_001_021_Mitarbeiter_Kürzel = inp;
	}

	public java.lang.String getM_001_021_Mitarbeiter_Kürzel()

	{
		return m_001_021_Mitarbeiter_Kürzel;
	}

	public void setAppSubID(int inp) {
		appSubID = inp;
	}

	public int getAppSubID()

	{
		return appSubID;
	}

	public void setPalmRecID(int inp) {
		palmRecID = inp;
	}

	public int getPalmRecID()

	{
		return palmRecID;
	}

	public void setDelFlag(int inp) {
		delFlag = inp;
	}

	public int getDelFlag()

	{
		return delFlag;
	}

	public void setMirror1(java.lang.String inp) {
		mirror1 = inp;
	}

	public java.lang.String getMirror1()

	{
		return mirror1;
	}

	public void setMirror2(java.lang.String inp) {
		mirror2 = inp;
	}

	public java.lang.String getMirror2()

	{
		return mirror2;
	}

	public void setLeer(java.lang.String inp) {
		leer = inp;
	}

	public java.lang.String getLeer()

	{
		return leer;
	}

	public void setLeer1(java.lang.String inp) {
		leer1 = inp;
	}

	public java.lang.String getLeer1()

	{
		return leer1;
	}

	public void setLeer2(java.lang.String inp) {
		leer2 = inp;
	}

	public java.lang.String getLeer2()

	{
		return leer2;
	}

	public void setLeer3(java.lang.String inp) {
		leer3 = inp;
	}

	public java.lang.String getLeer3()

	{
		return leer3;
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
