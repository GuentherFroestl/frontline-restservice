/*
 * ContentElemente.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 93 mit dem Namen "ContentElemente"
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

public class ContentElemente extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "ContentElemente";
	public static final int dbTabNummer = 93;
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
	public static int contentBez_Fn = 11;
	public static int contentInhalt_Fn = 12;
	public static int contentHeader_Fn = 13;
	public static int cont_Subheader_Fn = 14;
	public static int content_XML_Fn = 15;
	public static int content_Short_Text_Fn = 16;
	public static int datensatzDID_Fn = 17;
	public static int mirrorFeld_Fn = 18;
	public static int tabellenNummer_Fn = 19;
	public static int controlTag_Fn = 20;
	public static int _101_001_MediaContentTypen_DID_Fn = 21;
	public static int m_101_012_MediaContentTypen_Bez_Fn = 22;

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
	private java.lang.String contentBez = "";
	private java.lang.StringBuilder contentInhalt = new java.lang.StringBuilder();
	private java.lang.StringBuilder contentHeader = new java.lang.StringBuilder();
	private java.lang.StringBuilder cont_Subheader = new java.lang.StringBuilder();
	private java.lang.StringBuilder content_XML = new java.lang.StringBuilder();
	private java.lang.StringBuilder content_Short_Text = new java.lang.StringBuilder();
	private int datensatzDID = 0;
	private java.lang.String mirrorFeld = "";
	private int tabellenNummer = 0;
	private boolean controlTag = false;
	private int _101_001_MediaContentTypen_DID = 0;
	private java.lang.String m_101_012_MediaContentTypen_Bez = "";
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
			new FieldSpec("contentBez", 11, 60, "java.lang.String", null),
			new FieldSpec("contentInhalt", 12, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("contentHeader", 13, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("cont_Subheader", 14, 0, "java.lang.StringBuilder",
					null),
			new FieldSpec("content_XML", 15, 0, "java.lang.StringBuilder", null),
			new FieldSpec("content_Short_Text", 16, 0,
					"java.lang.StringBuilder", null),
			new FieldSpec("datensatzDID", 17, 0, "int", null),
			new FieldSpec("mirrorFeld", 18, 80, "java.lang.String", null),
			new FieldSpec("tabellenNummer", 19, 0, "int", null),
			new FieldSpec("controlTag", 20, 0, "boolean", null),
			new FieldSpec("_101_001_MediaContentTypen_DID", 21, 0, "int",
					new OneObjectPointer(101, 1, "MediaContentTypen", "dID")),
			new FieldSpec("m_101_012_MediaContentTypen_Bez", 22, 80,
					"java.lang.String", null) };

	// generierte Feldkonstanten - Ende

	public ContentElemente() {
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

	public void setContentBez(java.lang.String inp) {
		contentBez = inp;
	}

	public java.lang.String getContentBez()

	{
		return contentBez;
	}

	public void setContentInhalt(java.lang.StringBuilder inp) {
		contentInhalt = inp;
	}

	public java.lang.StringBuilder getContentInhalt()

	{
		return contentInhalt;
	}

	public void setContentHeader(java.lang.StringBuilder inp) {
		contentHeader = inp;
	}

	public java.lang.StringBuilder getContentHeader()

	{
		return contentHeader;
	}

	public void setCont_Subheader(java.lang.StringBuilder inp) {
		cont_Subheader = inp;
	}

	public java.lang.StringBuilder getCont_Subheader()

	{
		return cont_Subheader;
	}

	public void setContent_XML(java.lang.StringBuilder inp) {
		content_XML = inp;
	}

	public java.lang.StringBuilder getContent_XML()

	{
		return content_XML;
	}

	public void setContent_Short_Text(java.lang.StringBuilder inp) {
		content_Short_Text = inp;
	}

	public java.lang.StringBuilder getContent_Short_Text()

	{
		return content_Short_Text;
	}

	public void setDatensatzDID(int inp) {
		datensatzDID = inp;
	}

	public int getDatensatzDID()

	{
		return datensatzDID;
	}

	public void setMirrorFeld(java.lang.String inp) {
		mirrorFeld = inp;
	}

	public java.lang.String getMirrorFeld()

	{
		return mirrorFeld;
	}

	public void setTabellenNummer(int inp) {
		tabellenNummer = inp;
	}

	public int getTabellenNummer()

	{
		return tabellenNummer;
	}

	public void setControlTag(boolean inp) {
		controlTag = inp;
	}

	public boolean getControlTag()

	{
		return controlTag;
	}

	public void set_101_001_MediaContentTypen_DID(int inp) {
		_101_001_MediaContentTypen_DID = inp;
	}

	public int get_101_001_MediaContentTypen_DID()

	{
		return _101_001_MediaContentTypen_DID;
	}

	public void setM_101_012_MediaContentTypen_Bez(java.lang.String inp) {
		m_101_012_MediaContentTypen_Bez = inp;
	}

	public java.lang.String getM_101_012_MediaContentTypen_Bez()

	{
		return m_101_012_MediaContentTypen_Bez;
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
