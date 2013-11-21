/*
 * Standorte.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 55 mit dem Namen "Standorte"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Standorte extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Standorte";
	public static final int dbTabNummer = 55;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int standortNr_Fn = 1;
	public static int nextID_Fn = 2;
	public static int standortname_Fn = 3;
	public static int resvNextKDNr_Fn = 4;
	public static int resvMaxNextKDNr_Fn = 5;
	public static int resvNextKDNrGültigBis_Fn = 6;
	public static int resvNextAuftragNr_Fn = 7;
	public static int resvMaxNextAuftragNr_Fn = 8;
	public static int resvNextAuftragNrGültigBis_Fn = 9;
	public static int resvNextLieferantNr_Fn = 10;
	public static int resvMaxNextLieferantNr_Fn = 11;
	public static int resvNextLieferantNrGültigBis_Fn = 12;
	public static int resvNextBestellNr_Fn = 13;
	public static int resvMaxNextBestellNr_Fn = 14;
	public static int resvNextBestellNrGültigBis_Fn = 15;
	public static int resvNextRechnungNr_Fn = 16;
	public static int resvMaxNextRechnungNr_Fn = 17;
	public static int resvNextRechnungNrGültigBis_Fn = 18;
	public static int resvNextERNr_Fn = 19;
	public static int resvMaxNextERNr_Fn = 20;
	public static int resvNextERNrGültigBis_Fn = 21;
	public static int resvNextLFSNr_Fn = 22;
	public static int resvMaxNextLFSNr_Fn = 23;
	public static int resvNextLFSNrGültigBis_Fn = 24;
	public static int lastDID_Fn = 25;
	public static int nextDIDstart_Fn = 26;
	public static int nextDIDmax_Fn = 27;
	public static int standortStatus_Fn = 28;
	public static int standortDID_Fn = 29;
	public static int userName_Fn = 30;
	public static int passWort_Fn = 31;
	public static int remoteDID_Fn = 32;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int standortNr = 0;
	private int nextID = 0;
	private java.lang.String standortname = "";
	private int resvNextKDNr = 0;
	private int resvMaxNextKDNr = 0;
	private java.sql.Date resvNextKDNrGültigBis = new java.sql.Date(0);
	private int resvNextAuftragNr = 0;
	private int resvMaxNextAuftragNr = 0;
	private java.sql.Date resvNextAuftragNrGültigBis = new java.sql.Date(0);
	private int resvNextLieferantNr = 0;
	private int resvMaxNextLieferantNr = 0;
	private java.sql.Date resvNextLieferantNrGültigBis = new java.sql.Date(0);
	private int resvNextBestellNr = 0;
	private int resvMaxNextBestellNr = 0;
	private java.sql.Date resvNextBestellNrGültigBis = new java.sql.Date(0);
	private int resvNextRechnungNr = 0;
	private int resvMaxNextRechnungNr = 0;
	private java.sql.Date resvNextRechnungNrGültigBis = new java.sql.Date(0);
	private int resvNextERNr = 0;
	private int resvMaxNextERNr = 0;
	private java.sql.Date resvNextERNrGültigBis = new java.sql.Date(0);
	private int resvNextLFSNr = 0;
	private int resvMaxNextLFSNr = 0;
	private java.sql.Date resvNextLFSNrGültigBis = new java.sql.Date(0);
	private int lastDID = 0;
	private int nextDIDstart = 0;
	private int nextDIDmax = 0;
	private int standortStatus = 0;
	private int standortDID = 0;
	private java.lang.String userName = "";
	private java.lang.String passWort = "";
	private int remoteDID = 0;
	// generierte felder - Ende

	// generierte feldListe - Anfang

	private static String[] xmlFelderAll = {

	"standortNr", "nextID", "standortname", "resvNextKDNr", "resvMaxNextKDNr",
			"resvNextKDNrGültigBis", "resvNextAuftragNr",
			"resvMaxNextAuftragNr", "resvNextAuftragNrGültigBis",
			"resvNextLieferantNr", "resvMaxNextLieferantNr",
			"resvNextLieferantNrGültigBis", "resvNextBestellNr",
			"resvMaxNextBestellNr", "resvNextBestellNrGültigBis",
			"resvNextRechnungNr", "resvMaxNextRechnungNr",
			"resvNextRechnungNrGültigBis", "resvNextERNr", "resvMaxNextERNr",
			"resvNextERNrGültigBis", "resvNextLFSNr", "resvMaxNextLFSNr",
			"resvNextLFSNrGültigBis", "lastDID", "nextDIDstart", "nextDIDmax",
			"standortStatus", "standortDID", "userName", "passWort",
			"remoteDID" };
	// generierte feldListe - Ende

	private final String[] xmlFelder1 = xmlFelderAll;

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

			new FieldSpec("standortNr", 1, 0, "int", null),
			new FieldSpec("nextID", 2, 0, "int", null),
			new FieldSpec("standortname", 3, 40, "java.lang.String", null),
			new FieldSpec("resvNextKDNr", 4, 0, "int", null),
			new FieldSpec("resvMaxNextKDNr", 5, 0, "int", null),
			new FieldSpec("resvNextKDNrGültigBis", 6, 0, "java.sql.Date", null),
			new FieldSpec("resvNextAuftragNr", 7, 0, "int", null),
			new FieldSpec("resvMaxNextAuftragNr", 8, 0, "int", null),
			new FieldSpec("resvNextAuftragNrGültigBis", 9, 0, "java.sql.Date",
					null),
			new FieldSpec("resvNextLieferantNr", 10, 0, "int", null),
			new FieldSpec("resvMaxNextLieferantNr", 11, 0, "int", null),
			new FieldSpec("resvNextLieferantNrGültigBis", 12, 0,
					"java.sql.Date", null),
			new FieldSpec("resvNextBestellNr", 13, 0, "int", null),
			new FieldSpec("resvMaxNextBestellNr", 14, 0, "int", null),
			new FieldSpec("resvNextBestellNrGültigBis", 15, 0, "java.sql.Date",
					null),
			new FieldSpec("resvNextRechnungNr", 16, 0, "int", null),
			new FieldSpec("resvMaxNextRechnungNr", 17, 0, "int", null),
			new FieldSpec("resvNextRechnungNrGültigBis", 18, 0,
					"java.sql.Date", null),
			new FieldSpec("resvNextERNr", 19, 0, "int", null),
			new FieldSpec("resvMaxNextERNr", 20, 0, "int", null),
			new FieldSpec("resvNextERNrGültigBis", 21, 0, "java.sql.Date", null),
			new FieldSpec("resvNextLFSNr", 22, 0, "int", null),
			new FieldSpec("resvMaxNextLFSNr", 23, 0, "int", null),
			new FieldSpec("resvNextLFSNrGültigBis", 24, 0, "java.sql.Date",
					null), new FieldSpec("lastDID", 25, 0, "int", null),
			new FieldSpec("nextDIDstart", 26, 0, "int", null),
			new FieldSpec("nextDIDmax", 27, 0, "int", null),
			new FieldSpec("standortStatus", 28, 0, "int", null),
			new FieldSpec("standortDID", 29, 0, "int", null),
			new FieldSpec("userName", 30, 32, "java.lang.String", null),
			new FieldSpec("passWort", 31, 32, "java.lang.String", null),
			new FieldSpec("remoteDID", 32, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Standorte() {
		super();
	}

	// generierte getter/setter - Anfang

	public void setStandortNr(int inp) {
		standortNr = inp;
	}

	public int getStandortNr()

	{
		return standortNr;
	}

	public void setNextID(int inp) {
		nextID = inp;
	}

	public int getNextID()

	{
		return nextID;
	}

	public void setStandortname(java.lang.String inp) {
		standortname = inp;
	}

	public java.lang.String getStandortname()

	{
		return standortname;
	}

	public void setResvNextKDNr(int inp) {
		resvNextKDNr = inp;
	}

	public int getResvNextKDNr()

	{
		return resvNextKDNr;
	}

	public void setResvMaxNextKDNr(int inp) {
		resvMaxNextKDNr = inp;
	}

	public int getResvMaxNextKDNr()

	{
		return resvMaxNextKDNr;
	}

	public void setResvNextKDNrGültigBis(java.sql.Date inp) {
		resvNextKDNrGültigBis = inp;
	}

	public java.sql.Date getResvNextKDNrGültigBis()

	{
		return resvNextKDNrGültigBis;
	}

	public void setResvNextAuftragNr(int inp) {
		resvNextAuftragNr = inp;
	}

	public int getResvNextAuftragNr()

	{
		return resvNextAuftragNr;
	}

	public void setResvMaxNextAuftragNr(int inp) {
		resvMaxNextAuftragNr = inp;
	}

	public int getResvMaxNextAuftragNr()

	{
		return resvMaxNextAuftragNr;
	}

	public void setResvNextAuftragNrGültigBis(java.sql.Date inp) {
		resvNextAuftragNrGültigBis = inp;
	}

	public java.sql.Date getResvNextAuftragNrGültigBis()

	{
		return resvNextAuftragNrGültigBis;
	}

	public void setResvNextLieferantNr(int inp) {
		resvNextLieferantNr = inp;
	}

	public int getResvNextLieferantNr()

	{
		return resvNextLieferantNr;
	}

	public void setResvMaxNextLieferantNr(int inp) {
		resvMaxNextLieferantNr = inp;
	}

	public int getResvMaxNextLieferantNr()

	{
		return resvMaxNextLieferantNr;
	}

	public void setResvNextLieferantNrGültigBis(java.sql.Date inp) {
		resvNextLieferantNrGültigBis = inp;
	}

	public java.sql.Date getResvNextLieferantNrGültigBis()

	{
		return resvNextLieferantNrGültigBis;
	}

	public void setResvNextBestellNr(int inp) {
		resvNextBestellNr = inp;
	}

	public int getResvNextBestellNr()

	{
		return resvNextBestellNr;
	}

	public void setResvMaxNextBestellNr(int inp) {
		resvMaxNextBestellNr = inp;
	}

	public int getResvMaxNextBestellNr()

	{
		return resvMaxNextBestellNr;
	}

	public void setResvNextBestellNrGültigBis(java.sql.Date inp) {
		resvNextBestellNrGültigBis = inp;
	}

	public java.sql.Date getResvNextBestellNrGültigBis()

	{
		return resvNextBestellNrGültigBis;
	}

	public void setResvNextRechnungNr(int inp) {
		resvNextRechnungNr = inp;
	}

	public int getResvNextRechnungNr()

	{
		return resvNextRechnungNr;
	}

	public void setResvMaxNextRechnungNr(int inp) {
		resvMaxNextRechnungNr = inp;
	}

	public int getResvMaxNextRechnungNr()

	{
		return resvMaxNextRechnungNr;
	}

	public void setResvNextRechnungNrGültigBis(java.sql.Date inp) {
		resvNextRechnungNrGültigBis = inp;
	}

	public java.sql.Date getResvNextRechnungNrGültigBis()

	{
		return resvNextRechnungNrGültigBis;
	}

	public void setResvNextERNr(int inp) {
		resvNextERNr = inp;
	}

	public int getResvNextERNr()

	{
		return resvNextERNr;
	}

	public void setResvMaxNextERNr(int inp) {
		resvMaxNextERNr = inp;
	}

	public int getResvMaxNextERNr()

	{
		return resvMaxNextERNr;
	}

	public void setResvNextERNrGültigBis(java.sql.Date inp) {
		resvNextERNrGültigBis = inp;
	}

	public java.sql.Date getResvNextERNrGültigBis()

	{
		return resvNextERNrGültigBis;
	}

	public void setResvNextLFSNr(int inp) {
		resvNextLFSNr = inp;
	}

	public int getResvNextLFSNr()

	{
		return resvNextLFSNr;
	}

	public void setResvMaxNextLFSNr(int inp) {
		resvMaxNextLFSNr = inp;
	}

	public int getResvMaxNextLFSNr()

	{
		return resvMaxNextLFSNr;
	}

	public void setResvNextLFSNrGültigBis(java.sql.Date inp) {
		resvNextLFSNrGültigBis = inp;
	}

	public java.sql.Date getResvNextLFSNrGültigBis()

	{
		return resvNextLFSNrGültigBis;
	}

	public void setLastDID(int inp) {
		lastDID = inp;
	}

	public int getLastDID()

	{
		return lastDID;
	}

	public void setNextDIDstart(int inp) {
		nextDIDstart = inp;
	}

	public int getNextDIDstart()

	{
		return nextDIDstart;
	}

	public void setNextDIDmax(int inp) {
		nextDIDmax = inp;
	}

	public int getNextDIDmax()

	{
		return nextDIDmax;
	}

	public void setStandortStatus(int inp) {
		standortStatus = inp;
	}

	public int getStandortStatus()

	{
		return standortStatus;
	}

	public void setStandortDID(int inp) {
		standortDID = inp;
	}

	public int getStandortDID()

	{
		return standortDID;
	}

	public void setUserName(java.lang.String inp) {
		userName = inp;
	}

	public java.lang.String getUserName()

	{
		return userName;
	}

	public void setPassWort(java.lang.String inp) {
		passWort = inp;
	}

	public java.lang.String getPassWort()

	{
		return passWort;
	}

	public void setRemoteDID(int inp) {
		remoteDID = inp;
	}

	public int getRemoteDID()

	{
		return remoteDID;
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
