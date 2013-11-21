/*
 * AnredeTabelle.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 26 mit dem Namen "AnredeTabelle"
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

public class AnredeTabelle extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AnredeTabelle";
	public static final int dbTabNummer = 26;
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
	public static int anredeKBZ_Fn = 11;
	public static int _042_001_Sprachen_Nr_Fn = 12;
	public static int anredeBrief_Fn = 13;
	public static int anredeAdresse_Fn = 14;
	public static int anredeTyp_Fn = 15;
	public static int _001_001_Mitarbeiter_DID_Fn = 16;
	public static int anredePersoenlich_Fn = 17;

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
	private java.lang.String anredeKBZ = "";
	private int _042_001_Sprachen_Nr = 0;
	private java.lang.String anredeBrief = "";
	private java.lang.String anredeAdresse = "";
	private int anredeTyp = 0;
	private int _001_001_Mitarbeiter_DID = 0;
	private java.lang.String anredePersoenlich = "";
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
			new FieldSpec("anredeKBZ", 11, 20, "java.lang.String", null),
			new FieldSpec("_042_001_Sprachen_Nr", 12, 0, "int",
					new OneObjectPointer(42, 1, "Sprachen", "nr")),
			new FieldSpec("anredeBrief", 13, 40, "java.lang.String", null),
			new FieldSpec("anredeAdresse", 14, 40, "java.lang.String", null),
			new FieldSpec("anredeTyp", 15, 0, "int", null),
			new FieldSpec("_001_001_Mitarbeiter_DID", 16, 0, "int",
					new OneObjectPointer(1, 1, "Mitarbeiter", "dID")),
			new FieldSpec("anredePersoenlich", 17, 80, "java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public AnredeTabelle() {
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

	public void setAnredeKBZ(java.lang.String inp) {
		anredeKBZ = inp;
	}

	public java.lang.String getAnredeKBZ()

	{
		return anredeKBZ;
	}

	public void set_042_001_Sprachen_Nr(int inp) {
		_042_001_Sprachen_Nr = inp;
	}

	public int get_042_001_Sprachen_Nr()

	{
		return _042_001_Sprachen_Nr;
	}

	public void setAnredeBrief(java.lang.String inp) {
		anredeBrief = inp;
	}

	public java.lang.String getAnredeBrief()

	{
		return anredeBrief;
	}

	public void setAnredeAdresse(java.lang.String inp) {
		anredeAdresse = inp;
	}

	public java.lang.String getAnredeAdresse()

	{
		return anredeAdresse;
	}

	public void setAnredeTyp(int inp) {
		anredeTyp = inp;
	}

	public int getAnredeTyp()

	{
		return anredeTyp;
	}

	public void set_001_001_Mitarbeiter_DID(int inp) {
		_001_001_Mitarbeiter_DID = inp;
	}

	public int get_001_001_Mitarbeiter_DID()

	{
		return _001_001_Mitarbeiter_DID;
	}

	public void setAnredePersoenlich(java.lang.String inp) {
		anredePersoenlich = inp;
	}

	public java.lang.String getAnredePersoenlich()

	{
		return anredePersoenlich;
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
