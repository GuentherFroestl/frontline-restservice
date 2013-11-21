/*
 * Warenbewegungen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 64 mit dem Namen "Warenbewegungen"
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

public class Warenbewegungen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Warenbewegungen";
	public static final int dbTabNummer = 64;
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
	public static int _032_001_Artikel_DID_Fn = 11;
	public static int auftragsID_Fn = 12;
	public static int auftragPosID_Fn = 13;
	public static int lieferDatum_Fn = 14;
	public static int lieferZeitpunkt_Fn = 15;
	public static int lieferMenge_Fn = 16;
	public static int auftragsflag_Fn = 17;
	public static int lieferscheinID_Fn = 18;
	public static int standortID_Fn = 19;
	public static int zugangsflag_Fn = 20;
	public static int manuellbuchung_Fn = 21;
	public static int frei_Fn = 22;
	public static int bestellFlag_Fn = 23;
	public static int bestellID_Fn = 24;
	public static int bestellPosID_Fn = 25;
	public static int bestandGebucht_Fn = 26;
	public static int xyz1_Fn = 27;
	public static int xyz2_Fn = 28;

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
	private int _032_001_Artikel_DID = 0;
	private int auftragsID = 0;
	private int auftragPosID = 0;
	private java.sql.Date lieferDatum = new java.sql.Date(0);
	private java.sql.Time lieferZeitpunkt = new java.sql.Time(0);
	private double lieferMenge = 0;
	private boolean auftragsflag = false;
	private int lieferscheinID = 0;
	private int standortID = 0;
	private boolean zugangsflag = false;
	private boolean manuellbuchung = false;
	private int frei = 0;
	private boolean bestellFlag = false;
	private int bestellID = 0;
	private int bestellPosID = 0;
	private boolean bestandGebucht = false;
	private int xyz1 = 0;
	private boolean xyz2 = false;
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"dID", "dL", "dEAM", "dEVON", "dGAM", "dMandant", "dGVON", "dG",
			"dStandort", "dDEL", "_032_001_Artikel_DID", "auftragsID",
			"auftragPosID", "lieferDatum", "lieferZeitpunkt", "lieferMenge",
			"auftragsflag", "lieferscheinID", "standortID", "zugangsflag",
			"manuellbuchung", "frei", "bestellFlag", "bestellID",
			"bestellPosID", "bestandGebucht", "xyz1", "xyz2" };
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
			new FieldSpec("_032_001_Artikel_DID", 11, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("auftragsID", 12, 0, "int", null),
			new FieldSpec("auftragPosID", 13, 0, "int", null),
			new FieldSpec("lieferDatum", 14, 0, "java.sql.Date", null),
			new FieldSpec("lieferZeitpunkt", 15, 0, "java.sql.Time", null),
			new FieldSpec("lieferMenge", 16, 0, "double", null),
			new FieldSpec("auftragsflag", 17, 0, "boolean", null),
			new FieldSpec("lieferscheinID", 18, 0, "int", null),
			new FieldSpec("standortID", 19, 0, "int", null),
			new FieldSpec("zugangsflag", 20, 0, "boolean", null),
			new FieldSpec("manuellbuchung", 21, 0, "boolean", null),
			new FieldSpec("frei", 22, 0, "int", null),
			new FieldSpec("bestellFlag", 23, 0, "boolean", null),
			new FieldSpec("bestellID", 24, 0, "int", null),
			new FieldSpec("bestellPosID", 25, 0, "int", null),
			new FieldSpec("bestandGebucht", 26, 0, "boolean", null),
			new FieldSpec("xyz1", 27, 0, "int", null),
			new FieldSpec("xyz2", 28, 0, "boolean", null) };

	// generierte Feldkonstanten - Ende

	public Warenbewegungen() {
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

	public void set_032_001_Artikel_DID(int inp) {
		_032_001_Artikel_DID = inp;
	}

	public int get_032_001_Artikel_DID()

	{
		return _032_001_Artikel_DID;
	}

	public void setAuftragsID(int inp) {
		auftragsID = inp;
	}

	public int getAuftragsID()

	{
		return auftragsID;
	}

	public void setAuftragPosID(int inp) {
		auftragPosID = inp;
	}

	public int getAuftragPosID()

	{
		return auftragPosID;
	}

	public void setLieferDatum(java.sql.Date inp) {
		lieferDatum = inp;
	}

	public java.sql.Date getLieferDatum()

	{
		return lieferDatum;
	}

	public void setLieferZeitpunkt(java.sql.Time inp) {
		lieferZeitpunkt = inp;
	}

	public java.sql.Time getLieferZeitpunkt()

	{
		return lieferZeitpunkt;
	}

	public void setLieferMenge(double inp) {
		lieferMenge = inp;
	}

	public double getLieferMenge()

	{
		return lieferMenge;
	}

	public void setAuftragsflag(boolean inp) {
		auftragsflag = inp;
	}

	public boolean getAuftragsflag()

	{
		return auftragsflag;
	}

	public void setLieferscheinID(int inp) {
		lieferscheinID = inp;
	}

	public int getLieferscheinID()

	{
		return lieferscheinID;
	}

	public void setStandortID(int inp) {
		standortID = inp;
	}

	public int getStandortID()

	{
		return standortID;
	}

	public void setZugangsflag(boolean inp) {
		zugangsflag = inp;
	}

	public boolean getZugangsflag()

	{
		return zugangsflag;
	}

	public void setManuellbuchung(boolean inp) {
		manuellbuchung = inp;
	}

	public boolean getManuellbuchung()

	{
		return manuellbuchung;
	}

	public void setFrei(int inp) {
		frei = inp;
	}

	public int getFrei()

	{
		return frei;
	}

	public void setBestellFlag(boolean inp) {
		bestellFlag = inp;
	}

	public boolean getBestellFlag()

	{
		return bestellFlag;
	}

	public void setBestellID(int inp) {
		bestellID = inp;
	}

	public int getBestellID()

	{
		return bestellID;
	}

	public void setBestellPosID(int inp) {
		bestellPosID = inp;
	}

	public int getBestellPosID()

	{
		return bestellPosID;
	}

	public void setBestandGebucht(boolean inp) {
		bestandGebucht = inp;
	}

	public boolean getBestandGebucht()

	{
		return bestandGebucht;
	}

	public void setXyz1(int inp) {
		xyz1 = inp;
	}

	public int getXyz1()

	{
		return xyz1;
	}

	public void setXyz2(boolean inp) {
		xyz2 = inp;
	}

	public boolean getXyz2()

	{
		return xyz2;
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
