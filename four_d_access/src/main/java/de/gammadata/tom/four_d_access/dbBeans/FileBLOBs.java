/*
 * FileBLOBs.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 95 mit dem Namen "FileBLOBs"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class FileBLOBs extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "FileBLOBs";
	public static final int dbTabNummer = 95;
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
	public static int dE_UM_Fn = 11;
	public static int dG_UM_Fn = 12;
	public static int docName_Fn = 13;
	public static int lock_Modus_Fn = 14;
	public static int locked_Date_Fn = 15;
	public static int locked_Time_Fn = 16;
	public static int locked_von_Tab_Fn = 17;
	public static int locked_von_DID_Fn = 18;
	public static int external_Storage_DID_Fn = 19;
	public static int fileSize_Fn = 20;
	public static int ressource_Flag_Fn = 21;
	public static int dataBLOB_Fn = 22;
	public static int ressourceBLOB_Fn = 23;
	public static int mimeTyp_Fn = 24;

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
	private java.sql.Time dE_UM = new java.sql.Time(0);
	private java.sql.Time dG_UM = new java.sql.Time(0);
	private java.lang.StringBuilder docName = new java.lang.StringBuilder();
	private int lock_Modus = 0;
	private java.sql.Date locked_Date = new java.sql.Date(0);
	private java.sql.Time locked_Time = new java.sql.Time(0);
	private int locked_von_Tab = 0;
	private int locked_von_DID = 0;
	private int external_Storage_DID = 0;
	private double fileSize = 0;
	private int ressource_Flag = 0;
	private byte[] dataBLOB = new byte[0];
	private byte[] ressourceBLOB = new byte[0];
	private java.lang.String mimeTyp = "";
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
			new FieldSpec("dE_UM", 11, 0, "java.sql.Time", null),
			new FieldSpec("dG_UM", 12, 0, "java.sql.Time", null),
			new FieldSpec("docName", 13, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("lock_Modus", 14, 0, "int", null),
			new FieldSpec("locked_Date", 15, 0, "java.sql.Date", null),
			new FieldSpec("locked_Time", 16, 0, "java.sql.Time", null),
			new FieldSpec("locked_von_Tab", 17, 0, "int", null),
			new FieldSpec("locked_von_DID", 18, 0, "int", null),
			new FieldSpec("external_Storage_DID", 19, 0, "int", null),
			new FieldSpec("fileSize", 20, 0, "double", null),
			new FieldSpec("ressource_Flag", 21, 0, "int", null),
			new FieldSpec("dataBLOB", 22, 0, "byte[]", null),
			new FieldSpec("ressourceBLOB", 23, 0, "byte[]", null),
			new FieldSpec("mimeTyp", 24, 40, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public FileBLOBs() {
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

	public void setDE_UM(java.sql.Time inp) {
		dE_UM = inp;
	}

	public java.sql.Time getDE_UM()

	{
		return dE_UM;
	}

	public void setDG_UM(java.sql.Time inp) {
		dG_UM = inp;
	}

	public java.sql.Time getDG_UM()

	{
		return dG_UM;
	}

	public void setDocName(java.lang.StringBuilder inp) {
		docName = inp;
	}

	public java.lang.StringBuilder getDocName()

	{
		return docName;
	}

	public void setLock_Modus(int inp) {
		lock_Modus = inp;
	}

	public int getLock_Modus()

	{
		return lock_Modus;
	}

	public void setLocked_Date(java.sql.Date inp) {
		locked_Date = inp;
	}

	public java.sql.Date getLocked_Date()

	{
		return locked_Date;
	}

	public void setLocked_Time(java.sql.Time inp) {
		locked_Time = inp;
	}

	public java.sql.Time getLocked_Time()

	{
		return locked_Time;
	}

	public void setLocked_von_Tab(int inp) {
		locked_von_Tab = inp;
	}

	public int getLocked_von_Tab()

	{
		return locked_von_Tab;
	}

	public void setLocked_von_DID(int inp) {
		locked_von_DID = inp;
	}

	public int getLocked_von_DID()

	{
		return locked_von_DID;
	}

	public void setExternal_Storage_DID(int inp) {
		external_Storage_DID = inp;
	}

	public int getExternal_Storage_DID()

	{
		return external_Storage_DID;
	}

	public void setFileSize(double inp) {
		fileSize = inp;
	}

	public double getFileSize()

	{
		return fileSize;
	}

	public void setRessource_Flag(int inp) {
		ressource_Flag = inp;
	}

	public int getRessource_Flag()

	{
		return ressource_Flag;
	}

	public void setDataBLOB(byte[] inp) {
		dataBLOB = inp;
	}

	public byte[] getDataBLOB()

	{
		return dataBLOB;
	}

	public void setRessourceBLOB(byte[] inp) {
		ressourceBLOB = inp;
	}

	public byte[] getRessourceBLOB()

	{
		return ressourceBLOB;
	}

	public void setMimeTyp(java.lang.String inp) {
		mimeTyp = inp;
	}

	public java.lang.String getMimeTyp()

	{
		return mimeTyp;
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
