/*
 * MediaContentTypen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 101 mit dem Namen "MediaContentTypen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class MediaContentTypen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MediaContentTypen";
	public static final int dbTabNummer = 101;
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
	public static int mediaContentTypBez_Fn = 11;
	public static int mediaContentTypBeschr_Fn = 12;
	public static int mimeType_Fn = 13;
	public static int xSD_Fn = 14;
	public static int label_MedienAssetAngabe_1_Fn = 15;
	public static int label_MedienAssetAngabe_2_Fn = 16;
	public static int label_MedienAssetAngabe_3_Fn = 17;
	public static int xML_Prototype_Fn = 18;
	public static int xSL_Fn = 19;
	public static int cSS_Fn = 20;

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
	private java.lang.String mediaContentTypBez = "";
	private java.lang.StringBuilder mediaContentTypBeschr = new java.lang.StringBuilder();
	private java.lang.String mimeType = "";
	private java.lang.StringBuilder xSD = new java.lang.StringBuilder();
	private java.lang.String label_MedienAssetAngabe_1 = "";
	private java.lang.String label_MedienAssetAngabe_2 = "";
	private java.lang.String label_MedienAssetAngabe_3 = "";
	private java.lang.StringBuilder xML_Prototype = new java.lang.StringBuilder();
	private java.lang.StringBuilder xSL = new java.lang.StringBuilder();
	private java.lang.StringBuilder cSS = new java.lang.StringBuilder();
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
			new FieldSpec("mediaContentTypBez", 11, 80, "java.lang.String",
					null),
			new FieldSpec("mediaContentTypBeschr", 12, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("mimeType", 13, 80, "java.lang.String", null),
			new FieldSpec("xSD", 14, 0, "java.lang.StringBuilder", null),
			new FieldSpec("label_MedienAssetAngabe_1", 15, 80,
					"java.lang.String", null),
			new FieldSpec("label_MedienAssetAngabe_2", 16, 80,
					"java.lang.String", null),
			new FieldSpec("label_MedienAssetAngabe_3", 17, 80,
					"java.lang.String", null),
			new FieldSpec("xML_Prototype", 18, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("xSL", 19, 0, "java.lang.StringBuilder", null),
			new FieldSpec("cSS", 20, 0, "java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public MediaContentTypen() {
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

	public void setMediaContentTypBez(java.lang.String inp) {
		mediaContentTypBez = inp;
	}

	public java.lang.String getMediaContentTypBez()

	{
		return mediaContentTypBez;
	}

	public void setMediaContentTypBeschr(java.lang.StringBuilder inp) {
		mediaContentTypBeschr = inp;
	}

	public java.lang.StringBuilder getMediaContentTypBeschr()

	{
		return mediaContentTypBeschr;
	}

	public void setMimeType(java.lang.String inp) {
		mimeType = inp;
	}

	public java.lang.String getMimeType()

	{
		return mimeType;
	}

	public void setXSD(java.lang.StringBuilder inp) {
		xSD = inp;
	}

	public java.lang.StringBuilder getXSD()

	{
		return xSD;
	}

	public void setLabel_MedienAssetAngabe_1(java.lang.String inp) {
		label_MedienAssetAngabe_1 = inp;
	}

	public java.lang.String getLabel_MedienAssetAngabe_1()

	{
		return label_MedienAssetAngabe_1;
	}

	public void setLabel_MedienAssetAngabe_2(java.lang.String inp) {
		label_MedienAssetAngabe_2 = inp;
	}

	public java.lang.String getLabel_MedienAssetAngabe_2()

	{
		return label_MedienAssetAngabe_2;
	}

	public void setLabel_MedienAssetAngabe_3(java.lang.String inp) {
		label_MedienAssetAngabe_3 = inp;
	}

	public java.lang.String getLabel_MedienAssetAngabe_3()

	{
		return label_MedienAssetAngabe_3;
	}

	public void setXML_Prototype(java.lang.StringBuilder inp) {
		xML_Prototype = inp;
	}

	public java.lang.StringBuilder getXML_Prototype()

	{
		return xML_Prototype;
	}

	public void setXSL(java.lang.StringBuilder inp) {
		xSL = inp;
	}

	public java.lang.StringBuilder getXSL()

	{
		return xSL;
	}

	public void setCSS(java.lang.StringBuilder inp) {
		cSS = inp;
	}

	public java.lang.StringBuilder getCSS()

	{
		return cSS;
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
