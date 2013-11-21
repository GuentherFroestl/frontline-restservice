/*
 * Steuersätze.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 3 mit dem Namen "Steuersätze"
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

public class Steuersaetze extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Steuersätze";
	public static final int dbTabNummer = 3;
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
	public static int steuersatzbez_Fn = 11;
	public static int steuersatzIL_Fn = 12;
	public static int steuersatzEU_Fn = 13;
	public static int skonti_ERL_0UST_Fn = 14;
	public static int gültig_ab_Fn = 15;
	public static int gültig_bis_Fn = 16;
	public static int weiterberrechnen_Fn = 17;
	public static int standardsteuersatz_Fn = 18;
	public static int nachfolgeSteuersatz_DID_Fn = 19;
	public static int nachfolgeStSatzWert_IL_Fn = 20;
	public static int nachfolgeStSatzEU_Fn = 21;
	public static int skonti_WEK_0VST_Fn = 22;
	public static int datevSchluessel_UST_Fn = 23;
	public static int datevSchluessel_VST_Fn = 24;
	public static int erloeseRDW_Fn = 25;
	public static int wEKRDW_Fn = 26;
	public static int _006_001_UST_KontoDID_Fn = 27;
	public static int _006_001_ErloeskontoDID_Fn = 28;
	public static int _006_001_VST_KontoDID_Fn = 29;
	public static int _006_001_WareneinkaufDID_Fn = 30;
	public static int _006_001_Erl_EG_KontoDID_Fn = 31;
	public static int skonti_Erloese_Fn = 32;
	public static int _006_001_WEK_EG_KontoDID_Fn = 33;
	public static int skontiWEK_Fn = 34;
	public static int arech_exclusiv_Fn = 35;
	public static int vorherigerSteuersatz_DID_Fn = 36;
	public static int vorherigerSteuersatz_Wert_Fn = 37;

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
	private java.lang.String steuersatzbez = "";
	private double steuersatzIL = 0;
	private double steuersatzEU = 0;
	private int skonti_ERL_0UST = 0;
	private java.sql.Date gültig_ab = new java.sql.Date(0);
	private java.sql.Date gültig_bis = new java.sql.Date(0);
	private boolean weiterberrechnen = false;
	private boolean standardsteuersatz = false;
	private int nachfolgeSteuersatz_DID = 0;
	private double nachfolgeStSatzWert_IL = 0;
	private double nachfolgeStSatzEU = 0;
	private int skonti_WEK_0VST = 0;
	private int datevSchluessel_UST = 0;
	private int datevSchluessel_VST = 0;
	private int erloeseRDW = 0;
	private int wEKRDW = 0;
	private int _006_001_UST_KontoDID = 0;
	private int _006_001_ErloeskontoDID = 0;
	private int _006_001_VST_KontoDID = 0;
	private int _006_001_WareneinkaufDID = 0;
	private int _006_001_Erl_EG_KontoDID = 0;
	private int skonti_Erloese = 0;
	private int _006_001_WEK_EG_KontoDID = 0;
	private int skontiWEK = 0;
	private boolean arech_exclusiv = false;
	private int vorherigerSteuersatz_DID = 0;
	private double vorherigerSteuersatz_Wert = 0;
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
			new FieldSpec("steuersatzbez", 11, 40, "java.lang.String", null),
			new FieldSpec("steuersatzIL", 12, 0, "double", null),
			new FieldSpec("steuersatzEU", 13, 0, "double", null),
			new FieldSpec("skonti_ERL_0UST", 14, 0, "int", null),
			new FieldSpec("gültig_ab", 15, 0, "java.sql.Date", null),
			new FieldSpec("gültig_bis", 16, 0, "java.sql.Date", null),
			new FieldSpec("weiterberrechnen", 17, 0, "boolean", null),
			new FieldSpec("standardsteuersatz", 18, 0, "boolean", null),
			new FieldSpec("nachfolgeSteuersatz_DID", 19, 0, "int", null),
			new FieldSpec("nachfolgeStSatzWert_IL", 20, 0, "double", null),
			new FieldSpec("nachfolgeStSatzEU", 21, 0, "double", null),
			new FieldSpec("skonti_WEK_0VST", 22, 0, "int", null),
			new FieldSpec("datevSchluessel_UST", 23, 0, "int", null),
			new FieldSpec("datevSchluessel_VST", 24, 0, "int", null),
			new FieldSpec("erloeseRDW", 25, 0, "int", null),
			new FieldSpec("wEKRDW", 26, 0, "int", null),
			new FieldSpec("_006_001_UST_KontoDID", 27, 0, "int",
					new OneObjectPointer(6, 1, "UST", "kontoDID")),
			new FieldSpec("_006_001_ErloeskontoDID", 28, 0, "int",
					new OneObjectPointer(6, 1, "ErloeskontoDID", "")),
			new FieldSpec("_006_001_VST_KontoDID", 29, 0, "int",
					new OneObjectPointer(6, 1, "VST", "kontoDID")),
			new FieldSpec("_006_001_WareneinkaufDID", 30, 0, "int",
					new OneObjectPointer(6, 1, "WareneinkaufDID", "")),
			new FieldSpec("_006_001_Erl_EG_KontoDID", 31, 0, "int",
					new OneObjectPointer(6, 1, "Erl", "eG_KontoDID")),
			new FieldSpec("skonti_Erloese", 32, 0, "int", null),
			new FieldSpec("_006_001_WEK_EG_KontoDID", 33, 0, "int",
					new OneObjectPointer(6, 1, "WEK", "eG_KontoDID")),
			new FieldSpec("skontiWEK", 34, 0, "int", null),
			new FieldSpec("arech_exclusiv", 35, 0, "boolean", null),
			new FieldSpec("vorherigerSteuersatz_DID", 36, 0, "int", null),
			new FieldSpec("vorherigerSteuersatz_Wert", 37, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public Steuersaetze() {
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

	public void setSteuersatzbez(java.lang.String inp) {
		steuersatzbez = inp;
	}

	public java.lang.String getSteuersatzbez()

	{
		return steuersatzbez;
	}

	public void setSteuersatzIL(double inp) {
		steuersatzIL = inp;
	}

	public double getSteuersatzIL()

	{
		return steuersatzIL;
	}

	public void setSteuersatzEU(double inp) {
		steuersatzEU = inp;
	}

	public double getSteuersatzEU()

	{
		return steuersatzEU;
	}

	public void setSkonti_ERL_0UST(int inp) {
		skonti_ERL_0UST = inp;
	}

	public int getSkonti_ERL_0UST()

	{
		return skonti_ERL_0UST;
	}

	public void setgültig_ab(java.sql.Date inp) {
		gültig_ab = inp;
	}

	public java.sql.Date getgültig_ab()

	{
		return gültig_ab;
	}

	public void setgültig_bis(java.sql.Date inp) {
		gültig_bis = inp;
	}

	public java.sql.Date getgültig_bis()

	{
		return gültig_bis;
	}

	public void setWeiterberrechnen(boolean inp) {
		weiterberrechnen = inp;
	}

	public boolean getWeiterberrechnen()

	{
		return weiterberrechnen;
	}

	public void setStandardsteuersatz(boolean inp) {
		standardsteuersatz = inp;
	}

	public boolean getStandardsteuersatz()

	{
		return standardsteuersatz;
	}

	public void setNachfolgeSteuersatz_DID(int inp) {
		nachfolgeSteuersatz_DID = inp;
	}

	public int getNachfolgeSteuersatz_DID()

	{
		return nachfolgeSteuersatz_DID;
	}

	public void setNachfolgeStSatzWert_IL(double inp) {
		nachfolgeStSatzWert_IL = inp;
	}

	public double getNachfolgeStSatzWert_IL()

	{
		return nachfolgeStSatzWert_IL;
	}

	public void setNachfolgeStSatzEU(double inp) {
		nachfolgeStSatzEU = inp;
	}

	public double getNachfolgeStSatzEU()

	{
		return nachfolgeStSatzEU;
	}

	public void setSkonti_WEK_0VST(int inp) {
		skonti_WEK_0VST = inp;
	}

	public int getSkonti_WEK_0VST()

	{
		return skonti_WEK_0VST;
	}

	public void setDatevSchluessel_UST(int inp) {
		datevSchluessel_UST = inp;
	}

	public int getDatevSchluessel_UST()

	{
		return datevSchluessel_UST;
	}

	public void setDatevSchluessel_VST(int inp) {
		datevSchluessel_VST = inp;
	}

	public int getDatevSchluessel_VST()

	{
		return datevSchluessel_VST;
	}

	public void setErloeseRDW(int inp) {
		erloeseRDW = inp;
	}

	public int getErloeseRDW()

	{
		return erloeseRDW;
	}

	public void setWEKRDW(int inp) {
		wEKRDW = inp;
	}

	public int getWEKRDW()

	{
		return wEKRDW;
	}

	public void set_006_001_UST_KontoDID(int inp) {
		_006_001_UST_KontoDID = inp;
	}

	public int get_006_001_UST_KontoDID()

	{
		return _006_001_UST_KontoDID;
	}

	public void set_006_001_ErloeskontoDID(int inp) {
		_006_001_ErloeskontoDID = inp;
	}

	public int get_006_001_ErloeskontoDID()

	{
		return _006_001_ErloeskontoDID;
	}

	public void set_006_001_VST_KontoDID(int inp) {
		_006_001_VST_KontoDID = inp;
	}

	public int get_006_001_VST_KontoDID()

	{
		return _006_001_VST_KontoDID;
	}

	public void set_006_001_WareneinkaufDID(int inp) {
		_006_001_WareneinkaufDID = inp;
	}

	public int get_006_001_WareneinkaufDID()

	{
		return _006_001_WareneinkaufDID;
	}

	public void set_006_001_Erl_EG_KontoDID(int inp) {
		_006_001_Erl_EG_KontoDID = inp;
	}

	public int get_006_001_Erl_EG_KontoDID()

	{
		return _006_001_Erl_EG_KontoDID;
	}

	public void setSkonti_Erloese(int inp) {
		skonti_Erloese = inp;
	}

	public int getSkonti_Erloese()

	{
		return skonti_Erloese;
	}

	public void set_006_001_WEK_EG_KontoDID(int inp) {
		_006_001_WEK_EG_KontoDID = inp;
	}

	public int get_006_001_WEK_EG_KontoDID()

	{
		return _006_001_WEK_EG_KontoDID;
	}

	public void setSkontiWEK(int inp) {
		skontiWEK = inp;
	}

	public int getSkontiWEK()

	{
		return skontiWEK;
	}

	public void setArech_exclusiv(boolean inp) {
		arech_exclusiv = inp;
	}

	public boolean getArech_exclusiv()

	{
		return arech_exclusiv;
	}

	public void setVorherigerSteuersatz_DID(int inp) {
		vorherigerSteuersatz_DID = inp;
	}

	public int getVorherigerSteuersatz_DID()

	{
		return vorherigerSteuersatz_DID;
	}

	public void setVorherigerSteuersatz_Wert(double inp) {
		vorherigerSteuersatz_Wert = inp;
	}

	public double getVorherigerSteuersatz_Wert()

	{
		return vorherigerSteuersatz_Wert;
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
