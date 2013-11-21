/*
 * Zahlungsbedingungen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 12 mit dem Namen "Zahlungsbedingungen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Zahlungsbedingungen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Zahlungsbedingungen";
	public static final int dbTabNummer = 12;
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
	public static int zahlungsbedKBZ_Fn = 11;
	public static int zahlungsziel_Tage_Fn = 12;
	public static int skonto_möglich_Fn = 13;
	public static int skonto_Tage_Fn = 14;
	public static int skonto_Prozent_Fn = 15;
	public static int nachnahme_Fn = 16;
	public static int bargeld_Fn = 17;
	public static int vorauskasse_Fn = 18;
	public static int zahlungsbed_Text_Fn = 19;
	public static int standard_VK_Fn = 20;
	public static int standard_EK_Fn = 21;
	public static int abrechnungsCode_Fn = 22;
	public static int abrechnungsTag_Fn = 23;

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
	private java.lang.String zahlungsbedKBZ = "";
	private int zahlungsziel_Tage = 0;
	private boolean skonto_möglich = false;
	private double skonto_Tage = 0;
	private double skonto_Prozent = 0;
	private boolean nachnahme = false;
	private boolean bargeld = false;
	private boolean vorauskasse = false;
	private java.lang.StringBuilder zahlungsbed_Text = new java.lang.StringBuilder();
	private boolean standard_VK = false;
	private boolean standard_EK = false;
	private int abrechnungsCode = 0;
	private int abrechnungsTag = 0;
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
			new FieldSpec("zahlungsbedKBZ", 11, 40, "java.lang.String", null),
			new FieldSpec("zahlungsziel_Tage", 12, 0, "int", null),
			new FieldSpec("skonto_möglich", 13, 0, "boolean", null),
			new FieldSpec("skonto_Tage", 14, 0, "double", null),
			new FieldSpec("skonto_Prozent", 15, 0, "double", null),
			new FieldSpec("nachnahme", 16, 0, "boolean", null),
			new FieldSpec("bargeld", 17, 0, "boolean", null),
			new FieldSpec("vorauskasse", 18, 0, "boolean", null),
			new FieldSpec("zahlungsbed_Text", 19, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("standard_VK", 20, 0, "boolean", null),
			new FieldSpec("standard_EK", 21, 0, "boolean", null),
			new FieldSpec("abrechnungsCode", 22, 0, "int", null),
			new FieldSpec("abrechnungsTag", 23, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Zahlungsbedingungen() {
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

	public void setZahlungsbedKBZ(java.lang.String inp) {
		zahlungsbedKBZ = inp;
	}

	public java.lang.String getZahlungsbedKBZ()

	{
		return zahlungsbedKBZ;
	}

	public void setZahlungsziel_Tage(int inp) {
		zahlungsziel_Tage = inp;
	}

	public int getZahlungsziel_Tage()

	{
		return zahlungsziel_Tage;
	}

	public void setSkonto_möglich(boolean inp) {
		skonto_möglich = inp;
	}

	public boolean getSkonto_möglich()

	{
		return skonto_möglich;
	}

	public void setSkonto_Tage(double inp) {
		skonto_Tage = inp;
	}

	public double getSkonto_Tage()

	{
		return skonto_Tage;
	}

	public void setSkonto_Prozent(double inp) {
		skonto_Prozent = inp;
	}

	public double getSkonto_Prozent()

	{
		return skonto_Prozent;
	}

	public void setNachnahme(boolean inp) {
		nachnahme = inp;
	}

	public boolean getNachnahme()

	{
		return nachnahme;
	}

	public void setBargeld(boolean inp) {
		bargeld = inp;
	}

	public boolean getBargeld()

	{
		return bargeld;
	}

	public void setVorauskasse(boolean inp) {
		vorauskasse = inp;
	}

	public boolean getVorauskasse()

	{
		return vorauskasse;
	}

	public void setZahlungsbed_Text(java.lang.StringBuilder inp) {
		zahlungsbed_Text = inp;
	}

	public java.lang.StringBuilder getZahlungsbed_Text()

	{
		return zahlungsbed_Text;
	}

	public void setStandard_VK(boolean inp) {
		standard_VK = inp;
	}

	public boolean getStandard_VK()

	{
		return standard_VK;
	}

	public void setStandard_EK(boolean inp) {
		standard_EK = inp;
	}

	public boolean getStandard_EK()

	{
		return standard_EK;
	}

	public void setAbrechnungsCode(int inp) {
		abrechnungsCode = inp;
	}

	public int getAbrechnungsCode()

	{
		return abrechnungsCode;
	}

	public void setAbrechnungsTag(int inp) {
		abrechnungsTag = inp;
	}

	public int getAbrechnungsTag()

	{
		return abrechnungsTag;
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