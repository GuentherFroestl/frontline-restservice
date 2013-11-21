/*
 * FileTypen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 94 mit dem Namen "FileTypen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class FileTypen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "FileTypen";
	public static final int dbTabNummer = 94;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int dL_Fn = 2;
	public static int dEAM_Fn = 3;
	public static int dEVON_Fn = 4;
	public static int dGAM_Fn = 5;
	public static int dManadant_Fn = 6;
	public static int dGVON_Fn = 7;
	public static int dG_Fn = 8;
	public static int dStandort_Fn = 9;
	public static int dDEL_Fn = 10;
	public static int fileTypKBZ_Fn = 11;
	public static int fileTypBeschreibung_Fn = 12;
	public static int mIME_Type_Fn = 13;
	public static int wIN_Appendix_Fn = 14;
	public static int mAC_TYP_Fn = 15;
	public static int default_ApplikationBez_Fn = 16;
	public static int default_ApplikationsPfad_Fn = 17;
	public static int image_Fn = 18;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private boolean dL = false;
	private java.sql.Date dEAM = new java.sql.Date(0);
	private int dEVON = 0;
	private java.sql.Date dGAM = new java.sql.Date(0);
	private int dManadant = 0;
	private int dGVON = 0;
	private boolean dG = false;
	private int dStandort = 0;
	private boolean dDEL = false;
	private java.lang.String fileTypKBZ = "";
	private java.lang.StringBuilder fileTypBeschreibung = new java.lang.StringBuilder();
	private java.lang.String mIME_Type = "";
	private java.lang.String wIN_Appendix = "";
	private java.lang.String mAC_TYP = "";
	private java.lang.String default_ApplikationBez = "";
	private java.lang.StringBuilder default_ApplikationsPfad = new java.lang.StringBuilder();
	private boolean image = false;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("dL", 2, 0, "boolean", null),
			new FieldSpec("dEAM", 3, 0, "java.sql.Date", null),
			new FieldSpec("dEVON", 4, 0, "int", null),
			new FieldSpec("dGAM", 5, 0, "java.sql.Date", null),
			new FieldSpec("dManadant", 6, 0, "int", null),
			new FieldSpec("dGVON", 7, 0, "int", null),
			new FieldSpec("dG", 8, 0, "boolean", null),
			new FieldSpec("dStandort", 9, 0, "int", null),
			new FieldSpec("dDEL", 10, 0, "boolean", null),
			new FieldSpec("fileTypKBZ", 11, 40, "java.lang.String", null),
			new FieldSpec("fileTypBeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("mIME_Type", 13, 80, "java.lang.String", null),
			new FieldSpec("wIN_Appendix", 14, 3, "java.lang.String", null),
			new FieldSpec("mAC_TYP", 15, 4, "java.lang.String", null),
			new FieldSpec("default_ApplikationBez", 16, 80, "java.lang.String",
					null),
			new FieldSpec("default_ApplikationsPfad", 17, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("image", 18, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public FileTypen() {
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

	public void setDManadant(int inp) {
		dManadant = inp;
	}

	public int getDManadant()

	{
		return dManadant;
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

	public void setFileTypKBZ(java.lang.String inp) {
		fileTypKBZ = inp;
	}

	public java.lang.String getFileTypKBZ()

	{
		return fileTypKBZ;
	}

	public void setFileTypBeschreibung(java.lang.StringBuilder inp) {
		fileTypBeschreibung = inp;
	}

	public java.lang.StringBuilder getFileTypBeschreibung()

	{
		return fileTypBeschreibung;
	}

	public void setMIME_Type(java.lang.String inp) {
		mIME_Type = inp;
	}

	public java.lang.String getMIME_Type()

	{
		return mIME_Type;
	}

	public void setWIN_Appendix(java.lang.String inp) {
		wIN_Appendix = inp;
	}

	public java.lang.String getWIN_Appendix()

	{
		return wIN_Appendix;
	}

	public void setMAC_TYP(java.lang.String inp) {
		mAC_TYP = inp;
	}

	public java.lang.String getMAC_TYP()

	{
		return mAC_TYP;
	}

	public void setDefault_ApplikationBez(java.lang.String inp) {
		default_ApplikationBez = inp;
	}

	public java.lang.String getDefault_ApplikationBez()

	{
		return default_ApplikationBez;
	}

	public void setDefault_ApplikationsPfad(java.lang.StringBuilder inp) {
		default_ApplikationsPfad = inp;
	}

	public java.lang.StringBuilder getDefault_ApplikationsPfad()

	{
		return default_ApplikationsPfad;
	}

	public void setImage(boolean inp) {
		image = inp;
	}

	public boolean getImage()

	{
		return image;
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
