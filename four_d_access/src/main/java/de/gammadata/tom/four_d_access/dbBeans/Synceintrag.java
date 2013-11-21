/* *******************                   Synceintrag  Start   ******************************* */

/*
 * Synceintrag.java
 *
 * automatisch erzeugtes Java-Bean "Synceintrag"
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;

/**
 * 
 * @author gfr
 */

public class Synceintrag extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Synceintrag";
	public static final int dbTabNummer = 309;
	public String xmlObjektId = this.getClass().getName();

	// generierte Feldnummer-Konstanten

	public static int dID_Fn = 1;
	public static int syncdate_Fn = 2;
	public static int quellobjdb_Fn = 3;
	public static int quellobjclass_Fn = 4;
	public static int quellobjkontext_Fn = 5;
	public static int quellobjdid_Fn = 6;
	public static int zielobjdb_Fn = 7;
	public static int zielobjclass_Fn = 8;
	public static int zielobjkontext_Fn = 9;
	public static int zielobjdid_Fn = 10;

	// generierte Feldkonstanten - Ende

	// generierte felder - Anfang

	private int dID = 0;
	private java.sql.Timestamp syncdate;
	private java.lang.String quellobjdb = "";
	private java.lang.String quellobjclass = "";
	private java.lang.String quellobjkontext = "";
	private int quellobjdid = 0;
	private java.lang.String zielobjdb = "";
	private java.lang.String zielobjclass = "";
	private java.lang.String zielobjkontext = "";
	private int zielobjdid = 0;
	// generierte felder - Ende

	// generierte FieldSpec-Liste

	private static FieldSpec[] fieldSpecs = {

	new FieldSpec("dID", 1, 0, "int", null),
			new FieldSpec("syncdate", 2, 0, "java.sql.Timestamp", null),
			new FieldSpec("quellobjdb", 3, 80, "java.lang.String", null),
			new FieldSpec("quellobjclass", 4, 128, "java.lang.String", null),
			new FieldSpec("quellobjkontext", 5, 80, "java.lang.String", null),
			new FieldSpec("quellobjdid", 6, 0, "int", null),
			new FieldSpec("zielobjdb", 7, 80, "java.lang.String", null),
			new FieldSpec("zielobjclass", 8, 128, "java.lang.String", null),
			new FieldSpec("zielobjkontext", 9, 80, "java.lang.String", null),
			new FieldSpec("zielobjdid", 10, 0, "int", null) };

	// generierte Feldkonstanten - Ende

	public Synceintrag() {
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

	public void setSyncdate(java.sql.Timestamp inp) {
		syncdate = inp;
	}

	public java.sql.Timestamp getSyncdate()

	{
		return syncdate;
	}

	public void setQuellobjdb(java.lang.String inp) {
		quellobjdb = inp;
	}

	public java.lang.String getQuellobjdb()

	{
		return quellobjdb;
	}

	public void setQuellobjclass(java.lang.String inp) {
		quellobjclass = inp;
	}

	public java.lang.String getQuellobjclass()

	{
		return quellobjclass;
	}

	public void setQuellobjkontext(java.lang.String inp) {
		quellobjkontext = inp;
	}

	public java.lang.String getQuellobjkontext()

	{
		return quellobjkontext;
	}

	public void setQuellobjdid(int inp) {
		quellobjdid = inp;
	}

	public int getQuellobjdid()

	{
		return quellobjdid;
	}

	public void setZielobjdb(java.lang.String inp) {
		zielobjdb = inp;
	}

	public java.lang.String getZielobjdb()

	{
		return zielobjdb;
	}

	public void setZielobjclass(java.lang.String inp) {
		zielobjclass = inp;
	}

	public java.lang.String getZielobjclass()

	{
		return zielobjclass;
	}

	public void setZielobjkontext(java.lang.String inp) {
		zielobjkontext = inp;
	}

	public java.lang.String getZielobjkontext()

	{
		return zielobjkontext;
	}

	public void setZielobjdid(int inp) {
		zielobjdid = inp;
	}

	public int getZielobjdid()

	{
		return zielobjdid;
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

/* ******************* Synceintrag Ende ******************************* */
