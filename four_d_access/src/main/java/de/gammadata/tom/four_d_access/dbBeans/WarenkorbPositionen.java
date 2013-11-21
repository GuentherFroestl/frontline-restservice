/*
 * WarenkorbPositionen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 8 mit dem Namen "WarenkorbPositionen"
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

public class WarenkorbPositionen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "WarenkorbPositionen";
	public static final int dbTabNummer = 8;
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
	public static int _017_001__Warenkorb_DID_Fn = 11;
	public static int posNr_Fn = 12;
	public static int mengeBestellt_Fn = 13;
	public static int preisNetto_Fn = 14;
	public static int mwst_Fn = 15;
	public static int preisBrutto_Fn = 16;
	public static int mengeGeliefert_Fn = 17;
	public static int nextLiefermenge_Fn = 18;
	public static int locked_Fn = 19;
	public static int _032_001_artDID_Fn = 20;
	public static int artNr_Fn = 21;
	public static int artBez_Fn = 22;
	public static int artTxt_Fn = 23;
	public static int artVK1_Fn = 24;
	public static int artVK2_Fn = 25;
	public static int artEK1_Fn = 26;
	public static int posVK1_Fn = 27;
	public static int artMWST_Satz_Fn = 28;
	public static int liefertermin_Fn = 29;
	public static int nextLiefertermin_Fn = 30;
	public static int lieferstatus_Fn = 31;
	public static int lieferadresse_DID_Fn = 32;
	public static int auftragsPos_DID_Fn = 33;
	public static int rechPos_DID_Fn = 34;
	public static int status_Fn = 35;

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
	private int _017_001__Warenkorb_DID = 0;
	private int posNr = 0;
	private double mengeBestellt = 0;
	private double preisNetto = 0;
	private double mwst = 0;
	private double preisBrutto = 0;
	private double mengeGeliefert = 0;
	private double nextLiefermenge = 0;
	private boolean locked = false;
	private int _032_001_artDID = 0;
	private java.lang.String artNr = "";
	private java.lang.String artBez = "";
	private java.lang.StringBuilder artTxt = new java.lang.StringBuilder();
	private double artVK1 = 0;
	private double artVK2 = 0;
	private double artEK1 = 0;
	private double posVK1 = 0;
	private double artMWST_Satz = 0;
	private java.sql.Date liefertermin = new java.sql.Date(0);
	private java.sql.Date nextLiefertermin = new java.sql.Date(0);
	private int lieferstatus = 0;
	private int lieferadresse_DID = 0;
	private int auftragsPos_DID = 0;
	private int rechPos_DID = 0;
	private java.lang.String status = "";
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
			new FieldSpec("_017_001__Warenkorb_DID", 11, 0, "int",
					new OneObjectPointer(17, 1, "Warenkorb", "dID")),
			new FieldSpec("posNr", 12, 0, "int", null),
			new FieldSpec("mengeBestellt", 13, 0, "double", null),
			new FieldSpec("preisNetto", 14, 0, "double", null),
			new FieldSpec("mwst", 15, 0, "double", null),
			new FieldSpec("preisBrutto", 16, 0, "double", null),
			new FieldSpec("mengeGeliefert", 17, 0, "double", null),
			new FieldSpec("nextLiefermenge", 18, 0, "double", null),
			new FieldSpec("locked", 19, 0, "boolean", null),
			new FieldSpec("_032_001_artDID", 20, 0, "int",
					new OneObjectPointer(32, 1, "artDID", "")),
			new FieldSpec("artNr", 21, 80, "java.lang.String", null),
			new FieldSpec("artBez", 22, 80, "java.lang.String", null),
			new FieldSpec("artTxt", 23, 32768, "java.lang.StringBuilder", null),
			new FieldSpec("artVK1", 24, 0, "double", null),
			new FieldSpec("artVK2", 25, 0, "double", null),
			new FieldSpec("artEK1", 26, 0, "double", null),
			new FieldSpec("posVK1", 27, 0, "double", null),
			new FieldSpec("artMWST_Satz", 28, 0, "double", null),
			new FieldSpec("liefertermin", 29, 0, "java.sql.Date", null),
			new FieldSpec("nextLiefertermin", 30, 0, "java.sql.Date", null),
			new FieldSpec("lieferstatus", 31, 0, "int", null),
			new FieldSpec("lieferadresse_DID", 32, 0, "int", null),
			new FieldSpec("auftragsPos_DID", 33, 0, "int", null),
			new FieldSpec("rechPos_DID", 34, 0, "int", null),
			new FieldSpec("status", 35, 10, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public WarenkorbPositionen() {
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

	public void set_017_001__Warenkorb_DID(int inp) {
		_017_001__Warenkorb_DID = inp;
	}

	public int get_017_001__Warenkorb_DID()

	{
		return _017_001__Warenkorb_DID;
	}

	public void setPosNr(int inp) {
		posNr = inp;
	}

	public int getPosNr()

	{
		return posNr;
	}

	public void setMengeBestellt(double inp) {
		mengeBestellt = inp;
	}

	public double getMengeBestellt()

	{
		return mengeBestellt;
	}

	public void setPreisNetto(double inp) {
		preisNetto = inp;
	}

	public double getPreisNetto()

	{
		return preisNetto;
	}

	public void setMwst(double inp) {
		mwst = inp;
	}

	public double getMwst()

	{
		return mwst;
	}

	public void setPreisBrutto(double inp) {
		preisBrutto = inp;
	}

	public double getPreisBrutto()

	{
		return preisBrutto;
	}

	public void setMengeGeliefert(double inp) {
		mengeGeliefert = inp;
	}

	public double getMengeGeliefert()

	{
		return mengeGeliefert;
	}

	public void setNextLiefermenge(double inp) {
		nextLiefermenge = inp;
	}

	public double getNextLiefermenge()

	{
		return nextLiefermenge;
	}

	public void setLocked(boolean inp) {
		locked = inp;
	}

	public boolean getLocked()

	{
		return locked;
	}

	public void set_032_001_artDID(int inp) {
		_032_001_artDID = inp;
	}

	public int get_032_001_artDID()

	{
		return _032_001_artDID;
	}

	public void setArtNr(java.lang.String inp) {
		artNr = inp;
	}

	public java.lang.String getArtNr()

	{
		return artNr;
	}

	public void setArtBez(java.lang.String inp) {
		artBez = inp;
	}

	public java.lang.String getArtBez()

	{
		return artBez;
	}

	public void setArtTxt(java.lang.StringBuilder inp) {
		artTxt = inp;
	}

	public java.lang.StringBuilder getArtTxt()

	{
		return artTxt;
	}

	public void setArtVK1(double inp) {
		artVK1 = inp;
	}

	public double getArtVK1()

	{
		return artVK1;
	}

	public void setArtVK2(double inp) {
		artVK2 = inp;
	}

	public double getArtVK2()

	{
		return artVK2;
	}

	public void setArtEK1(double inp) {
		artEK1 = inp;
	}

	public double getArtEK1()

	{
		return artEK1;
	}

	public void setPosVK1(double inp) {
		posVK1 = inp;
	}

	public double getPosVK1()

	{
		return posVK1;
	}

	public void setArtMWST_Satz(double inp) {
		artMWST_Satz = inp;
	}

	public double getArtMWST_Satz()

	{
		return artMWST_Satz;
	}

	public void setLiefertermin(java.sql.Date inp) {
		liefertermin = inp;
	}

	public java.sql.Date getLiefertermin()

	{
		return liefertermin;
	}

	public void setNextLiefertermin(java.sql.Date inp) {
		nextLiefertermin = inp;
	}

	public java.sql.Date getNextLiefertermin()

	{
		return nextLiefertermin;
	}

	public void setLieferstatus(int inp) {
		lieferstatus = inp;
	}

	public int getLieferstatus()

	{
		return lieferstatus;
	}

	public void setLieferadresse_DID(int inp) {
		lieferadresse_DID = inp;
	}

	public int getLieferadresse_DID()

	{
		return lieferadresse_DID;
	}

	public void setAuftragsPos_DID(int inp) {
		auftragsPos_DID = inp;
	}

	public int getAuftragsPos_DID()

	{
		return auftragsPos_DID;
	}

	public void setRechPos_DID(int inp) {
		rechPos_DID = inp;
	}

	public int getRechPos_DID()

	{
		return rechPos_DID;
	}

	public void setStatus(java.lang.String inp) {
		status = inp;
	}

	public java.lang.String getStatus()

	{
		return status;
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
