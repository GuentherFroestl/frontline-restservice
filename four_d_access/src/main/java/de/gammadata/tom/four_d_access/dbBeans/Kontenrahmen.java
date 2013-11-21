/*
 * Kontenrahmen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 71 mit dem Namen "Kontenrahmen"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Kontenrahmen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Kontenrahmen";
	public static final int dbTabNummer = 71;
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
	public static int kontorahmenBez_Fn = 11;
	public static int kontenrahmenBeschreibung_Fn = 12;
	public static int wE_Konten_IL_von_Fn = 13;
	public static int wE_Konten_IL_bis_Fn = 14;
	public static int wE_Konten_EU_von_Fn = 15;
	public static int wE_Konten_EU_bis_Fn = 16;
	public static int wE_Konten_RDW_von_Fn = 17;
	public static int wE_Konten_RDW_bis_Fn = 18;
	public static int eRL_Konten_IL_von_Fn = 19;
	public static int eRL_Konten_IL_bis_Fn = 20;
	public static int eRL_Konten_EU_von_Fn = 21;
	public static int eRL_Konten_EU_bis_Fn = 22;
	public static int eRL_Konten_RDW_von_Fn = 23;
	public static int eRL_Konten_RDW_bis_Fn = 24;
	public static int aR_Beleg_Prefix_Fn = 25;
	public static int eRL_Splittkonto_Fn = 26;
	public static int eR_Beleg_Prefix_Fn = 27;
	public static int wEK_Splitkonto_Fn = 28;
	public static int sammelkonto_ZM_Fn = 29;
	public static int debitoren_Konten_von_Fn = 30;
	public static int debitoren_Konten_bis_Fn = 31;
	public static int kreditoren_Konten_von_Fn = 32;
	public static int kreditoren_Konten_bis_Fn = 33;
	public static int standard_Fn = 34;
	public static int gRP_KontenBuchen_Fn = 35;
	public static int debitorenoffset_Fn = 36;
	public static int kreditorenoffset_Fn = 37;

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
	private java.lang.String kontorahmenBez = "";
	private java.lang.StringBuilder kontenrahmenBeschreibung = new java.lang.StringBuilder();
	private int wE_Konten_IL_von = 0;
	private int wE_Konten_IL_bis = 0;
	private int wE_Konten_EU_von = 0;
	private int wE_Konten_EU_bis = 0;
	private int wE_Konten_RDW_von = 0;
	private int wE_Konten_RDW_bis = 0;
	private int eRL_Konten_IL_von = 0;
	private int eRL_Konten_IL_bis = 0;
	private int eRL_Konten_EU_von = 0;
	private int eRL_Konten_EU_bis = 0;
	private int eRL_Konten_RDW_von = 0;
	private int eRL_Konten_RDW_bis = 0;
	private java.lang.String aR_Beleg_Prefix = "";
	private int eRL_Splittkonto = 0;
	private java.lang.String eR_Beleg_Prefix = "";
	private int wEK_Splitkonto = 0;
	private int sammelkonto_ZM = 0;
	private int debitoren_Konten_von = 0;
	private int debitoren_Konten_bis = 0;
	private int kreditoren_Konten_von = 0;
	private int kreditoren_Konten_bis = 0;
	private boolean standard = false;
	private boolean gRP_KontenBuchen = false;
	private int debitorenoffset = 0;
	private int kreditorenoffset = 0;
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
			new FieldSpec("kontorahmenBez", 11, 40, "java.lang.String", null),
			new FieldSpec("kontenrahmenBeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("wE_Konten_IL_von", 13, 0, "int", null),
			new FieldSpec("wE_Konten_IL_bis", 14, 0, "int", null),
			new FieldSpec("wE_Konten_EU_von", 15, 0, "int", null),
			new FieldSpec("wE_Konten_EU_bis", 16, 0, "int", null),
			new FieldSpec("wE_Konten_RDW_von", 17, 0, "int", null),
			new FieldSpec("wE_Konten_RDW_bis", 18, 0, "int", null),
			new FieldSpec("eRL_Konten_IL_von", 19, 0, "int", null),
			new FieldSpec("eRL_Konten_IL_bis", 20, 0, "int", null),
			new FieldSpec("eRL_Konten_EU_von", 21, 0, "int", null),
			new FieldSpec("eRL_Konten_EU_bis", 22, 0, "int", null),
			new FieldSpec("eRL_Konten_RDW_von", 23, 0, "int", null),
			new FieldSpec("eRL_Konten_RDW_bis", 24, 0, "int", null),
			new FieldSpec("aR_Beleg_Prefix", 25, 5, "java.lang.String", null),
			new FieldSpec("eRL_Splittkonto", 26, 0, "int", null),
			new FieldSpec("eR_Beleg_Prefix", 27, 5, "java.lang.String", null),
			new FieldSpec("wEK_Splitkonto", 28, 0, "int", null),
			new FieldSpec("sammelkonto_ZM", 29, 0, "int", null),
			new FieldSpec("debitoren_Konten_von", 30, 0, "int", null),
			new FieldSpec("debitoren_Konten_bis", 31, 0, "int", null),
			new FieldSpec("kreditoren_Konten_von", 32, 0, "int", null),
			new FieldSpec("kreditoren_Konten_bis", 33, 0, "int", null),
			new FieldSpec("standard", 34, 0, "boolean", null),
			new FieldSpec("gRP_KontenBuchen", 35, 0, "boolean", null),
			new FieldSpec("debitorenoffset", 36, 0, "int", null),
			new FieldSpec("kreditorenoffset", 37, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Kontenrahmen() {
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

	public void setKontorahmenBez(java.lang.String inp) {
		kontorahmenBez = inp;
	}

	public java.lang.String getKontorahmenBez()

	{
		return kontorahmenBez;
	}

	public void setKontenrahmenBeschreibung(java.lang.StringBuilder inp) {
		kontenrahmenBeschreibung = inp;
	}

	public java.lang.StringBuilder getKontenrahmenBeschreibung()

	{
		return kontenrahmenBeschreibung;
	}

	public void setWE_Konten_IL_von(int inp) {
		wE_Konten_IL_von = inp;
	}

	public int getWE_Konten_IL_von()

	{
		return wE_Konten_IL_von;
	}

	public void setWE_Konten_IL_bis(int inp) {
		wE_Konten_IL_bis = inp;
	}

	public int getWE_Konten_IL_bis()

	{
		return wE_Konten_IL_bis;
	}

	public void setWE_Konten_EU_von(int inp) {
		wE_Konten_EU_von = inp;
	}

	public int getWE_Konten_EU_von()

	{
		return wE_Konten_EU_von;
	}

	public void setWE_Konten_EU_bis(int inp) {
		wE_Konten_EU_bis = inp;
	}

	public int getWE_Konten_EU_bis()

	{
		return wE_Konten_EU_bis;
	}

	public void setWE_Konten_RDW_von(int inp) {
		wE_Konten_RDW_von = inp;
	}

	public int getWE_Konten_RDW_von()

	{
		return wE_Konten_RDW_von;
	}

	public void setWE_Konten_RDW_bis(int inp) {
		wE_Konten_RDW_bis = inp;
	}

	public int getWE_Konten_RDW_bis()

	{
		return wE_Konten_RDW_bis;
	}

	public void setERL_Konten_IL_von(int inp) {
		eRL_Konten_IL_von = inp;
	}

	public int getERL_Konten_IL_von()

	{
		return eRL_Konten_IL_von;
	}

	public void setERL_Konten_IL_bis(int inp) {
		eRL_Konten_IL_bis = inp;
	}

	public int getERL_Konten_IL_bis()

	{
		return eRL_Konten_IL_bis;
	}

	public void setERL_Konten_EU_von(int inp) {
		eRL_Konten_EU_von = inp;
	}

	public int getERL_Konten_EU_von()

	{
		return eRL_Konten_EU_von;
	}

	public void setERL_Konten_EU_bis(int inp) {
		eRL_Konten_EU_bis = inp;
	}

	public int getERL_Konten_EU_bis()

	{
		return eRL_Konten_EU_bis;
	}

	public void setERL_Konten_RDW_von(int inp) {
		eRL_Konten_RDW_von = inp;
	}

	public int getERL_Konten_RDW_von()

	{
		return eRL_Konten_RDW_von;
	}

	public void setERL_Konten_RDW_bis(int inp) {
		eRL_Konten_RDW_bis = inp;
	}

	public int getERL_Konten_RDW_bis()

	{
		return eRL_Konten_RDW_bis;
	}

	public void setAR_Beleg_Prefix(java.lang.String inp) {
		aR_Beleg_Prefix = inp;
	}

	public java.lang.String getAR_Beleg_Prefix()

	{
		return aR_Beleg_Prefix;
	}

	public void setERL_Splittkonto(int inp) {
		eRL_Splittkonto = inp;
	}

	public int getERL_Splittkonto()

	{
		return eRL_Splittkonto;
	}

	public void setER_Beleg_Prefix(java.lang.String inp) {
		eR_Beleg_Prefix = inp;
	}

	public java.lang.String getER_Beleg_Prefix()

	{
		return eR_Beleg_Prefix;
	}

	public void setWEK_Splitkonto(int inp) {
		wEK_Splitkonto = inp;
	}

	public int getWEK_Splitkonto()

	{
		return wEK_Splitkonto;
	}

	public void setSammelkonto_ZM(int inp) {
		sammelkonto_ZM = inp;
	}

	public int getSammelkonto_ZM()

	{
		return sammelkonto_ZM;
	}

	public void setDebitoren_Konten_von(int inp) {
		debitoren_Konten_von = inp;
	}

	public int getDebitoren_Konten_von()

	{
		return debitoren_Konten_von;
	}

	public void setDebitoren_Konten_bis(int inp) {
		debitoren_Konten_bis = inp;
	}

	public int getDebitoren_Konten_bis()

	{
		return debitoren_Konten_bis;
	}

	public void setKreditoren_Konten_von(int inp) {
		kreditoren_Konten_von = inp;
	}

	public int getKreditoren_Konten_von()

	{
		return kreditoren_Konten_von;
	}

	public void setKreditoren_Konten_bis(int inp) {
		kreditoren_Konten_bis = inp;
	}

	public int getKreditoren_Konten_bis()

	{
		return kreditoren_Konten_bis;
	}

	public void setStandard(boolean inp) {
		standard = inp;
	}

	public boolean getStandard()

	{
		return standard;
	}

	public void setGRP_KontenBuchen(boolean inp) {
		gRP_KontenBuchen = inp;
	}

	public boolean getGRP_KontenBuchen()

	{
		return gRP_KontenBuchen;
	}

	public void setDebitorenoffset(int inp) {
		debitorenoffset = inp;
	}

	public int getDebitorenoffset()

	{
		return debitorenoffset;
	}

	public void setKreditorenoffset(int inp) {
		kreditorenoffset = inp;
	}

	public int getKreditorenoffset()

	{
		return kreditorenoffset;
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
