/*
 * EkQuellen.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 34 mit dem Namen "EkQuellen"
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

public class EkQuellen extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "EkQuellen";
	public static final int dbTabNummer = 34;
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
	public static int _032_001__Artikel_DID_Fn = 11;
	public static int _060_001_Lieferanten_DID_Fn = 12;
	public static int bestellNr_Fn = 13;
	public static int bestellBez_Fn = 14;
	public static int beschreibung_Fn = 15;
	public static int eK1_Fn = 16;
	public static int eK2_Fn = 17;
	public static int eK3_Fn = 18;
	public static int eK4_Fn = 19;
	public static int _005_001_Währungen_DID_Fn = 20;
	public static int verpackungseinheit_Fn = 21;
	public static int m_060_011_Lieferanten_Nr_Fn = 22;
	public static int m_060_025_Lief_Firmenname_Fn = 23;
	public static int m_032_011_Artikel_ArtikelNR_Fn = 24;
	public static int m_032_012_Artikel_ArtikelKBZ_Fn = 25;
	public static int m_032_038_Artikel_Artikelgrp_Fn = 26;
	public static int m_005_011_WährungenZeichen_Fn = 27;
	public static int m_032_040_Artikel_Refbez_Fn = 28;
	public static int m_032_019_Artikel_VK1_Fn = 29;
	public static int lieferzeit_Tage_Fn = 30;
	public static int vorzugslieferant_Fn = 31;
	public static int artikelgruppen_Bezug_Fn = 32;
	public static int _033_001_ArtikelGruppen_DID_Fn = 33;
	public static int m_033_026_ArtikelGruppen_NR_Fn = 34;
	public static int m_033_011_ArtikelGruppen_KBZ_Fn = 35;
	public static int rabatt_für_Gruppe_Fn = 36;

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
	private int _032_001__Artikel_DID = 0;
	private int _060_001_Lieferanten_DID = 0;
	private java.lang.String bestellNr = "";
	private java.lang.String bestellBez = "";
	private java.lang.StringBuilder beschreibung = new java.lang.StringBuilder();
	private double eK1 = 0;
	private double eK2 = 0;
	private double eK3 = 0;
	private double eK4 = 0;
	private int _005_001_Währungen_DID = 0;
	private double verpackungseinheit = 0;
	private int m_060_011_Lieferanten_Nr = 0;
	private java.lang.String m_060_025_Lief_Firmenname = "";
	private java.lang.String m_032_011_Artikel_ArtikelNR = "";
	private java.lang.String m_032_012_Artikel_ArtikelKBZ = "";
	private java.lang.String m_032_038_Artikel_Artikelgrp = "";
	private java.lang.String m_005_011_WährungenZeichen = "";
	private java.lang.String m_032_040_Artikel_Refbez = "";
	private double m_032_019_Artikel_VK1 = 0;
	private int lieferzeit_Tage = 0;
	private boolean vorzugslieferant = false;
	private boolean artikelgruppen_Bezug = false;
	private int _033_001_ArtikelGruppen_DID = 0;
	private int m_033_026_ArtikelGruppen_NR = 0;
	private java.lang.String m_033_011_ArtikelGruppen_KBZ = "";
	private double rabatt_für_Gruppe = 0;
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
			new FieldSpec("_032_001__Artikel_DID", 11, 0, "int",
					new OneObjectPointer(32, 1, "Artikel", "dID")),
			new FieldSpec("_060_001_Lieferanten_DID", 12, 0, "int",
					new OneObjectPointer(60, 1, "Lieferanten", "dID")),
			new FieldSpec("bestellNr", 13, 40, "java.lang.String", null),
			new FieldSpec("bestellBez", 14, 60, "java.lang.String", null),
			new FieldSpec("beschreibung", 15, 32768, "java.lang.StringBuilder",
					null),
			new FieldSpec("eK1", 16, 0, "double", null),
			new FieldSpec("eK2", 17, 0, "double", null),
			new FieldSpec("eK3", 18, 0, "double", null),
			new FieldSpec("eK4", 19, 0, "double", null),
			new FieldSpec("_005_001_Währungen_DID", 20, 0, "int",
					new OneObjectPointer(5, 1, "Währungen", "dID")),
			new FieldSpec("verpackungseinheit", 21, 0, "double", null),
			new FieldSpec("m_060_011_Lieferanten_Nr", 22, 0, "int", null),
			new FieldSpec("m_060_025_Lief_Firmenname", 23, 40,
					"java.lang.String", null),
			new FieldSpec("m_032_011_Artikel_ArtikelNR", 24, 40,
					"java.lang.String", null),
			new FieldSpec("m_032_012_Artikel_ArtikelKBZ", 25, 80,
					"java.lang.String", null),
			new FieldSpec("m_032_038_Artikel_Artikelgrp", 26, 40,
					"java.lang.String", null),
			new FieldSpec("m_005_011_WährungenZeichen", 27, 10,
					"java.lang.String", null),
			new FieldSpec("m_032_040_Artikel_Refbez", 28, 40,
					"java.lang.String", null),
			new FieldSpec("m_032_019_Artikel_VK1", 29, 0, "double", null),
			new FieldSpec("lieferzeit_Tage", 30, 0, "int", null),
			new FieldSpec("vorzugslieferant", 31, 0, "boolean", null),
			new FieldSpec("artikelgruppen_Bezug", 32, 0, "boolean", null),
			new FieldSpec("_033_001_ArtikelGruppen_DID", 33, 0, "int",
					new OneObjectPointer(33, 1, "ArtikelGruppen", "dID")),
			new FieldSpec("m_033_026_ArtikelGruppen_NR", 34, 0, "int", null),
			new FieldSpec("m_033_011_ArtikelGruppen_KBZ", 35, 40,
					"java.lang.String", null),
			new FieldSpec("rabatt_für_Gruppe", 36, 0, "double", null) };

	// generierte Feldkonstanten - Ende

	public EkQuellen() {
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

	public void set_032_001__Artikel_DID(int inp) {
		_032_001__Artikel_DID = inp;
	}

	public int get_032_001__Artikel_DID()

	{
		return _032_001__Artikel_DID;
	}

	public void set_060_001_Lieferanten_DID(int inp) {
		_060_001_Lieferanten_DID = inp;
	}

	public int get_060_001_Lieferanten_DID()

	{
		return _060_001_Lieferanten_DID;
	}

	public void setBestellNr(java.lang.String inp) {
		bestellNr = inp;
	}

	public java.lang.String getBestellNr()

	{
		return bestellNr;
	}

	public void setBestellBez(java.lang.String inp) {
		bestellBez = inp;
	}

	public java.lang.String getBestellBez()

	{
		return bestellBez;
	}

	public void setBeschreibung(java.lang.StringBuilder inp) {
		beschreibung = inp;
	}

	public java.lang.StringBuilder getBeschreibung()

	{
		return beschreibung;
	}

	public void setEK1(double inp) {
		eK1 = inp;
	}

	public double getEK1()

	{
		return eK1;
	}

	public void setEK2(double inp) {
		eK2 = inp;
	}

	public double getEK2()

	{
		return eK2;
	}

	public void setEK3(double inp) {
		eK3 = inp;
	}

	public double getEK3()

	{
		return eK3;
	}

	public void setEK4(double inp) {
		eK4 = inp;
	}

	public double getEK4()

	{
		return eK4;
	}

	public void set_005_001_Währungen_DID(int inp) {
		_005_001_Währungen_DID = inp;
	}

	public int get_005_001_Währungen_DID()

	{
		return _005_001_Währungen_DID;
	}

	public void setVerpackungseinheit(double inp) {
		verpackungseinheit = inp;
	}

	public double getVerpackungseinheit()

	{
		return verpackungseinheit;
	}

	public void setM_060_011_Lieferanten_Nr(int inp) {
		m_060_011_Lieferanten_Nr = inp;
	}

	public int getM_060_011_Lieferanten_Nr()

	{
		return m_060_011_Lieferanten_Nr;
	}

	public void setM_060_025_Lief_Firmenname(java.lang.String inp) {
		m_060_025_Lief_Firmenname = inp;
	}

	public java.lang.String getM_060_025_Lief_Firmenname()

	{
		return m_060_025_Lief_Firmenname;
	}

	public void setM_032_011_Artikel_ArtikelNR(java.lang.String inp) {
		m_032_011_Artikel_ArtikelNR = inp;
	}

	public java.lang.String getM_032_011_Artikel_ArtikelNR()

	{
		return m_032_011_Artikel_ArtikelNR;
	}

	public void setM_032_012_Artikel_ArtikelKBZ(java.lang.String inp) {
		m_032_012_Artikel_ArtikelKBZ = inp;
	}

	public java.lang.String getM_032_012_Artikel_ArtikelKBZ()

	{
		return m_032_012_Artikel_ArtikelKBZ;
	}

	public void setM_032_038_Artikel_Artikelgrp(java.lang.String inp) {
		m_032_038_Artikel_Artikelgrp = inp;
	}

	public java.lang.String getM_032_038_Artikel_Artikelgrp()

	{
		return m_032_038_Artikel_Artikelgrp;
	}

	public void setM_005_011_WährungenZeichen(java.lang.String inp) {
		m_005_011_WährungenZeichen = inp;
	}

	public java.lang.String getM_005_011_WährungenZeichen()

	{
		return m_005_011_WährungenZeichen;
	}

	public void setM_032_040_Artikel_Refbez(java.lang.String inp) {
		m_032_040_Artikel_Refbez = inp;
	}

	public java.lang.String getM_032_040_Artikel_Refbez()

	{
		return m_032_040_Artikel_Refbez;
	}

	public void setM_032_019_Artikel_VK1(double inp) {
		m_032_019_Artikel_VK1 = inp;
	}

	public double getM_032_019_Artikel_VK1()

	{
		return m_032_019_Artikel_VK1;
	}

	public void setLieferzeit_Tage(int inp) {
		lieferzeit_Tage = inp;
	}

	public int getLieferzeit_Tage()

	{
		return lieferzeit_Tage;
	}

	public void setVorzugslieferant(boolean inp) {
		vorzugslieferant = inp;
	}

	public boolean getVorzugslieferant()

	{
		return vorzugslieferant;
	}

	public void setArtikelgruppen_Bezug(boolean inp) {
		artikelgruppen_Bezug = inp;
	}

	public boolean getArtikelgruppen_Bezug()

	{
		return artikelgruppen_Bezug;
	}

	public void set_033_001_ArtikelGruppen_DID(int inp) {
		_033_001_ArtikelGruppen_DID = inp;
	}

	public int get_033_001_ArtikelGruppen_DID()

	{
		return _033_001_ArtikelGruppen_DID;
	}

	public void setM_033_026_ArtikelGruppen_NR(int inp) {
		m_033_026_ArtikelGruppen_NR = inp;
	}

	public int getM_033_026_ArtikelGruppen_NR()

	{
		return m_033_026_ArtikelGruppen_NR;
	}

	public void setM_033_011_ArtikelGruppen_KBZ(java.lang.String inp) {
		m_033_011_ArtikelGruppen_KBZ = inp;
	}

	public java.lang.String getM_033_011_ArtikelGruppen_KBZ()

	{
		return m_033_011_ArtikelGruppen_KBZ;
	}

	public void setRabatt_für_Gruppe(double inp) {
		rabatt_für_Gruppe = inp;
	}

	public double getRabatt_für_Gruppe()

	{
		return rabatt_für_Gruppe;
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
