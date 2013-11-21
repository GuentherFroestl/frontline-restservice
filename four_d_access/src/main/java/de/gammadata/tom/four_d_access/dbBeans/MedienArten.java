/*
 * MedienArten.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 90 mit dem Namen "MedienArten"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class MedienArten extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "MedienArten";
	public static final int dbTabNummer = 90;
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
	public static int medienArtBez_Fn = 11;
	public static int medienArtBeschreibung_Fn = 12;
	public static int kapazitätsangabe_Fn = 13;
	public static int labelMedienPos_Angabe_1_Fn = 14;
	public static int labelMedienPos_Angabe_2_Fn = 15;
	public static int labelMedienPos_Angabe_3_Fn = 16;
	public static int labelMedienPos_Angabe_4_Fn = 17;
	public static int label_MedienAngabe_1_Fn = 18;
	public static int label_MedienAngabe_2_Fn = 19;
	public static int label_MedienAngabe_3_Fn = 20;
	public static int label_MedienAngabe_4_Fn = 21;
	public static int label_MedienAngabe_5_Fn = 22;
	public static int label_MedienAngabe_6_Fn = 23;
	public static int label_MedienAngabe_7_Fn = 24;
	public static int label_MedienAngabe_8_Fn = 25;
	public static int label_MedienAngabe_9_Fn = 26;
	public static int label_MedienAngabe_10_Fn = 27;
	public static int label_1_Werte_Fn = 28;
	public static int label_2_Werte_Fn = 29;
	public static int label_3_Werte_Fn = 30;
	public static int label_4_Werte_Fn = 31;
	public static int label_5_Werte_Fn = 32;
	public static int label_6_Werte_Fn = 33;
	public static int label_7_Werte_Fn = 34;
	public static int label_8_Werte_Fn = 35;
	public static int label_9_Werte_Fn = 36;
	public static int label_10_Werte_Fn = 37;
	public static int pos_Label_1_Werte_Fn = 38;
	public static int pos_Index_Werte_Fn = 39;
	public static int pos_Dauer_Werte_Fn = 40;
	public static int pos_Bez_Werte_Fn = 41;

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
	private java.lang.String medienArtBez = "";
	private java.lang.StringBuilder medienArtBeschreibung = new java.lang.StringBuilder();
	private java.lang.String kapazitätsangabe = "";
	private java.lang.String labelMedienPos_Angabe_1 = "";
	private java.lang.String labelMedienPos_Angabe_2 = "";
	private java.lang.String labelMedienPos_Angabe_3 = "";
	private java.lang.String labelMedienPos_Angabe_4 = "";
	private java.lang.String label_MedienAngabe_1 = "";
	private java.lang.String label_MedienAngabe_2 = "";
	private java.lang.String label_MedienAngabe_3 = "";
	private java.lang.String label_MedienAngabe_4 = "";
	private java.lang.String label_MedienAngabe_5 = "";
	private java.lang.String label_MedienAngabe_6 = "";
	private java.lang.String label_MedienAngabe_7 = "";
	private java.lang.String label_MedienAngabe_8 = "";
	private java.lang.String label_MedienAngabe_9 = "";
	private java.lang.String label_MedienAngabe_10 = "";
	private java.lang.StringBuilder label_1_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_2_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_3_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_4_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_5_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_6_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_7_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_8_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_9_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder label_10_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder pos_Label_1_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder pos_Index_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder pos_Dauer_Werte = new java.lang.StringBuilder();
	private java.lang.StringBuilder pos_Bez_Werte = new java.lang.StringBuilder();
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
			new FieldSpec("medienArtBez", 11, 80, "java.lang.String", null),
			new FieldSpec("medienArtBeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("kapazitätsangabe", 13, 80, "java.lang.String", null),
			new FieldSpec("labelMedienPos_Angabe_1", 14, 80,
					"java.lang.String", null),
			new FieldSpec("labelMedienPos_Angabe_2", 15, 80,
					"java.lang.String", null),
			new FieldSpec("labelMedienPos_Angabe_3", 16, 80,
					"java.lang.String", null),
			new FieldSpec("labelMedienPos_Angabe_4", 17, 80,
					"java.lang.String", null),
			new FieldSpec("label_MedienAngabe_1", 18, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_2", 19, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_3", 20, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_4", 21, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_5", 22, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_6", 23, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_7", 24, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_8", 25, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_9", 26, 80, "java.lang.String",
					null),
			new FieldSpec("label_MedienAngabe_10", 27, 80, "java.lang.String",
					null),
			new FieldSpec("label_1_Werte", 28, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_2_Werte", 29, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_3_Werte", 30, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_4_Werte", 31, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_5_Werte", 32, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_6_Werte", 33, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_7_Werte", 34, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_8_Werte", 35, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_9_Werte", 36, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("label_10_Werte", 37, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("pos_Label_1_Werte", 38, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("pos_Index_Werte", 39, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("pos_Dauer_Werte", 40, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("pos_Bez_Werte", 41, 32768,
					"java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public MedienArten() {
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

	public void setMedienArtBez(java.lang.String inp) {
		medienArtBez = inp;
	}

	public java.lang.String getMedienArtBez()

	{
		return medienArtBez;
	}

	public void setMedienArtBeschreibung(java.lang.StringBuilder inp) {
		medienArtBeschreibung = inp;
	}

	public java.lang.StringBuilder getMedienArtBeschreibung()

	{
		return medienArtBeschreibung;
	}

	public void setKapazitätsangabe(java.lang.String inp) {
		kapazitätsangabe = inp;
	}

	public java.lang.String getKapazitätsangabe()

	{
		return kapazitätsangabe;
	}

	public void setLabelMedienPos_Angabe_1(java.lang.String inp) {
		labelMedienPos_Angabe_1 = inp;
	}

	public java.lang.String getLabelMedienPos_Angabe_1()

	{
		return labelMedienPos_Angabe_1;
	}

	public void setLabelMedienPos_Angabe_2(java.lang.String inp) {
		labelMedienPos_Angabe_2 = inp;
	}

	public java.lang.String getLabelMedienPos_Angabe_2()

	{
		return labelMedienPos_Angabe_2;
	}

	public void setLabelMedienPos_Angabe_3(java.lang.String inp) {
		labelMedienPos_Angabe_3 = inp;
	}

	public java.lang.String getLabelMedienPos_Angabe_3()

	{
		return labelMedienPos_Angabe_3;
	}

	public void setLabelMedienPos_Angabe_4(java.lang.String inp) {
		labelMedienPos_Angabe_4 = inp;
	}

	public java.lang.String getLabelMedienPos_Angabe_4()

	{
		return labelMedienPos_Angabe_4;
	}

	public void setLabel_MedienAngabe_1(java.lang.String inp) {
		label_MedienAngabe_1 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_1()

	{
		return label_MedienAngabe_1;
	}

	public void setLabel_MedienAngabe_2(java.lang.String inp) {
		label_MedienAngabe_2 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_2()

	{
		return label_MedienAngabe_2;
	}

	public void setLabel_MedienAngabe_3(java.lang.String inp) {
		label_MedienAngabe_3 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_3()

	{
		return label_MedienAngabe_3;
	}

	public void setLabel_MedienAngabe_4(java.lang.String inp) {
		label_MedienAngabe_4 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_4()

	{
		return label_MedienAngabe_4;
	}

	public void setLabel_MedienAngabe_5(java.lang.String inp) {
		label_MedienAngabe_5 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_5()

	{
		return label_MedienAngabe_5;
	}

	public void setLabel_MedienAngabe_6(java.lang.String inp) {
		label_MedienAngabe_6 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_6()

	{
		return label_MedienAngabe_6;
	}

	public void setLabel_MedienAngabe_7(java.lang.String inp) {
		label_MedienAngabe_7 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_7()

	{
		return label_MedienAngabe_7;
	}

	public void setLabel_MedienAngabe_8(java.lang.String inp) {
		label_MedienAngabe_8 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_8()

	{
		return label_MedienAngabe_8;
	}

	public void setLabel_MedienAngabe_9(java.lang.String inp) {
		label_MedienAngabe_9 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_9()

	{
		return label_MedienAngabe_9;
	}

	public void setLabel_MedienAngabe_10(java.lang.String inp) {
		label_MedienAngabe_10 = inp;
	}

	public java.lang.String getLabel_MedienAngabe_10()

	{
		return label_MedienAngabe_10;
	}

	public void setLabel_1_Werte(java.lang.StringBuilder inp) {
		label_1_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_1_Werte()

	{
		return label_1_Werte;
	}

	public void setLabel_2_Werte(java.lang.StringBuilder inp) {
		label_2_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_2_Werte()

	{
		return label_2_Werte;
	}

	public void setLabel_3_Werte(java.lang.StringBuilder inp) {
		label_3_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_3_Werte()

	{
		return label_3_Werte;
	}

	public void setLabel_4_Werte(java.lang.StringBuilder inp) {
		label_4_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_4_Werte()

	{
		return label_4_Werte;
	}

	public void setLabel_5_Werte(java.lang.StringBuilder inp) {
		label_5_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_5_Werte()

	{
		return label_5_Werte;
	}

	public void setLabel_6_Werte(java.lang.StringBuilder inp) {
		label_6_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_6_Werte()

	{
		return label_6_Werte;
	}

	public void setLabel_7_Werte(java.lang.StringBuilder inp) {
		label_7_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_7_Werte()

	{
		return label_7_Werte;
	}

	public void setLabel_8_Werte(java.lang.StringBuilder inp) {
		label_8_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_8_Werte()

	{
		return label_8_Werte;
	}

	public void setLabel_9_Werte(java.lang.StringBuilder inp) {
		label_9_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_9_Werte()

	{
		return label_9_Werte;
	}

	public void setLabel_10_Werte(java.lang.StringBuilder inp) {
		label_10_Werte = inp;
	}

	public java.lang.StringBuilder getLabel_10_Werte()

	{
		return label_10_Werte;
	}

	public void setPos_Label_1_Werte(java.lang.StringBuilder inp) {
		pos_Label_1_Werte = inp;
	}

	public java.lang.StringBuilder getPos_Label_1_Werte()

	{
		return pos_Label_1_Werte;
	}

	public void setPos_Index_Werte(java.lang.StringBuilder inp) {
		pos_Index_Werte = inp;
	}

	public java.lang.StringBuilder getPos_Index_Werte()

	{
		return pos_Index_Werte;
	}

	public void setPos_Dauer_Werte(java.lang.StringBuilder inp) {
		pos_Dauer_Werte = inp;
	}

	public java.lang.StringBuilder getPos_Dauer_Werte()

	{
		return pos_Dauer_Werte;
	}

	public void setPos_Bez_Werte(java.lang.StringBuilder inp) {
		pos_Bez_Werte = inp;
	}

	public java.lang.StringBuilder getPos_Bez_Werte()

	{
		return pos_Bez_Werte;
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
