/*
 * AccessGruppen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 106 mit dem Namen "AccessGruppen"
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

public class AccessGruppen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "AccessGruppen";
	public static final int dbTabNummer = 106;
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
	public static int _001_001_MitarbeiterDID_Owner_Fn = 11;
	public static int m_001_021_MitarbeiterKBZ_Fn = 12;
	public static int gruppenKBZ_Fn = 13;
	public static int gruppenBeschreibung_Fn = 14;

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
	private int _001_001_MitarbeiterDID_Owner = 0;
	private java.lang.String m_001_021_MitarbeiterKBZ = "";
	private java.lang.String gruppenKBZ = "";
	private java.lang.StringBuilder gruppenBeschreibung = new java.lang.StringBuilder();
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "_001_001_MitarbeiterDID_Owner",
			"m_001_021_MitarbeiterKBZ", "gruppenKBZ", "gruppenBeschreibung" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

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
			new FieldSpec("_001_001_MitarbeiterDID_Owner", 11, 0, "int",
					new OneObjectPointer(1, 1, "MitarbeiterDID", "owner")),
			new FieldSpec("m_001_021_MitarbeiterKBZ", 12, 20,
					"java.lang.String", null),
			new FieldSpec("gruppenKBZ", 13, 80, "java.lang.String", null),
			new FieldSpec("gruppenBeschreibung", 14, 32768,
					"java.lang.StringBuilder", null) };

	// generierte Feldkonstanten - Ende

	public AccessGruppen() {
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

	public void set_001_001_MitarbeiterDID_Owner(int inp) {
		_001_001_MitarbeiterDID_Owner = inp;
	}

	public int get_001_001_MitarbeiterDID_Owner()

	{
		return _001_001_MitarbeiterDID_Owner;
	}

	public void setM_001_021_MitarbeiterKBZ(java.lang.String inp) {
		m_001_021_MitarbeiterKBZ = inp;
	}

	public java.lang.String getM_001_021_MitarbeiterKBZ()

	{
		return m_001_021_MitarbeiterKBZ;
	}

	public void setGruppenKBZ(java.lang.String inp) {
		gruppenKBZ = inp;
	}

	public java.lang.String getGruppenKBZ()

	{
		return gruppenKBZ;
	}

	public void setGruppenBeschreibung(java.lang.StringBuilder inp) {
		gruppenBeschreibung = inp;
	}

	public java.lang.StringBuilder getGruppenBeschreibung()

	{
		return gruppenBeschreibung;
	}

	// generierte getter/setter - Ende

	// Interfaceroutinen

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
	public String[] getXmlFelder1(int mode) {
		return xmlFelder1;
	}

	@Override
	public String[] getXmlFelder1(String mode) {
		return xmlFelder1;
	}

	public String[] getXmlFelderAll() {
		return xmlFelderAll;
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs() {
		return fieldSpecs;
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
