/*
 * Files.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 39 mit dem Namen "Files"
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

public class Files extends BasicBean {
	private final boolean printon = true;
	public static final String xmlClassTag = "Files";
	public static final int dbTabNummer = 39;
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
	public static int fileKBZ_Fn = 11;
	public static int fileBeschreibung_Fn = 12;
	public static int fileOriginalPfad_Fn = 13;
	public static int filename_Fn = 14;
	public static int _094_001_FileTyp_DID_Fn = 15;
	public static int m_094_011_FileTypKBZ_Fn = 16;
	public static int _068_001_KundenDID_Fn = 17;
	public static int fileDatum_Fn = 18;
	public static int filePreviewPfad_Fn = 19;
	public static int _095_001_DataBlob_DID_Fn = 20;
	public static int _091_001_Fileverwendung_Fn = 21;
	public static int _022_001_VorgangsDID_Fn = 22;
	public static int tabNr_Fn = 23;
	public static int recDID_Fn = 24;
	public static int platformID_Pfad_Fn = 25;
	public static int fileServer_DID_Fn = 26;
	public static int m_091_011_FileNr_Fn = 27;
	public static int sortierNr_Fn = 28;
	public static int image_Fn = 29;
	public static int sizeX_Fn = 30;
	public static int sizeY_Fn = 31;
	public static int m_091_012_FileVerwBez_Fn = 32;
	public static int m_022_031_VorgangNr_Fn = 33;

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
	private java.lang.String fileKBZ = "";
	private java.lang.StringBuilder fileBeschreibung = new java.lang.StringBuilder();
	private java.lang.StringBuilder fileOriginalPfad = new java.lang.StringBuilder();
	private java.lang.String filename = "";
	private int _094_001_FileTyp_DID = 0;
	private java.lang.String m_094_011_FileTypKBZ = "";
	private int _068_001_KundenDID = 0;
	private java.sql.Date fileDatum = new java.sql.Date(0);
	private java.lang.StringBuilder filePreviewPfad = new java.lang.StringBuilder();
	private int _095_001_DataBlob_DID = 0;
	private int _091_001_Fileverwendung = 0;
	private int _022_001_VorgangsDID = 0;
	private int tabNr = 0;
	private int recDID = 0;
	private int platformID_Pfad = 0;
	private int fileServer_DID = 0;
	private int m_091_011_FileNr = 0;
	private int sortierNr = 0;
	private boolean image = false;
	private int sizeX = 0;
	private int sizeY = 0;
	private java.lang.String m_091_012_FileVerwBez = "";
	private java.lang.String m_022_031_VorgangNr = "";
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
			new FieldSpec("fileKBZ", 11, 60, "java.lang.String", null),
			new FieldSpec("fileBeschreibung", 12, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("fileOriginalPfad", 13, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("filename", 14, 80, "java.lang.String", null),
			new FieldSpec("_094_001_FileTyp_DID", 15, 0, "int",
					new OneObjectPointer(94, 1, "FileTyp", "dID")),
			new FieldSpec("m_094_011_FileTypKBZ", 16, 40, "java.lang.String",
					null),
			new FieldSpec("_068_001_KundenDID", 17, 0, "int",
					new OneObjectPointer(68, 1, "KundenDID", "")),
			new FieldSpec("fileDatum", 18, 0, "java.sql.Date", null),
			new FieldSpec("filePreviewPfad", 19, 32768,
					"java.lang.StringBuilder", null),
			new FieldSpec("_095_001_DataBlob_DID", 20, 0, "int",
					new OneObjectPointer(95, 1, "DataBlob", "dID")),
			new FieldSpec("_091_001_Fileverwendung", 21, 0, "int",
					new OneObjectPointer(91, 1, "Fileverwendung", "")),
			new FieldSpec("_022_001_VorgangsDID", 22, 0, "int",
					new OneObjectPointer(22, 1, "VorgangsDID", "")),
			new FieldSpec("tabNr", 23, 0, "int", null),
			new FieldSpec("recDID", 24, 0, "int", null),
			new FieldSpec("platformID_Pfad", 25, 0, "int", null),
			new FieldSpec("fileServer_DID", 26, 0, "int", null),
			new FieldSpec("m_091_011_FileNr", 27, 0, "int", null),
			new FieldSpec("sortierNr", 28, 0, "int", null),
			new FieldSpec("image", 29, 0, "boolean", null),
			new FieldSpec("sizeX", 30, 0, "int", null),
			new FieldSpec("sizeY", 31, 0, "int", null),
			new FieldSpec("m_091_012_FileVerwBez", 32, 40, "java.lang.String",
					null),
			new FieldSpec("m_022_031_VorgangNr", 33, 30, "java.lang.String",
					null) };

	// generierte Feldkonstanten - Ende

	public Files() {
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

	public void setFileKBZ(java.lang.String inp) {
		fileKBZ = inp;
	}

	public java.lang.String getFileKBZ()

	{
		return fileKBZ;
	}

	public void setFileBeschreibung(java.lang.StringBuilder inp) {
		fileBeschreibung = inp;
	}

	public java.lang.StringBuilder getFileBeschreibung()

	{
		return fileBeschreibung;
	}

	public void setFileOriginalPfad(java.lang.StringBuilder inp) {
		fileOriginalPfad = inp;
	}

	public java.lang.StringBuilder getFileOriginalPfad()

	{
		return fileOriginalPfad;
	}

	public void setFilename(java.lang.String inp) {
		filename = inp;
	}

	public java.lang.String getFilename()

	{
		return filename;
	}

	public void set_094_001_FileTyp_DID(int inp) {
		_094_001_FileTyp_DID = inp;
	}

	public int get_094_001_FileTyp_DID()

	{
		return _094_001_FileTyp_DID;
	}

	public void setM_094_011_FileTypKBZ(java.lang.String inp) {
		m_094_011_FileTypKBZ = inp;
	}

	public java.lang.String getM_094_011_FileTypKBZ()

	{
		return m_094_011_FileTypKBZ;
	}

	public void set_068_001_KundenDID(int inp) {
		_068_001_KundenDID = inp;
	}

	public int get_068_001_KundenDID()

	{
		return _068_001_KundenDID;
	}

	public void setFileDatum(java.sql.Date inp) {
		fileDatum = inp;
	}

	public java.sql.Date getFileDatum()

	{
		return fileDatum;
	}

	public void setFilePreviewPfad(java.lang.StringBuilder inp) {
		filePreviewPfad = inp;
	}

	public java.lang.StringBuilder getFilePreviewPfad()

	{
		return filePreviewPfad;
	}

	public void set_095_001_DataBlob_DID(int inp) {
		_095_001_DataBlob_DID = inp;
	}

	public int get_095_001_DataBlob_DID()

	{
		return _095_001_DataBlob_DID;
	}

	public void set_091_001_Fileverwendung(int inp) {
		_091_001_Fileverwendung = inp;
	}

	public int get_091_001_Fileverwendung()

	{
		return _091_001_Fileverwendung;
	}

	public void set_022_001_VorgangsDID(int inp) {
		_022_001_VorgangsDID = inp;
	}

	public int get_022_001_VorgangsDID()

	{
		return _022_001_VorgangsDID;
	}

	public void setTabNr(int inp) {
		tabNr = inp;
	}

	public int getTabNr()

	{
		return tabNr;
	}

	public void setRecDID(int inp) {
		recDID = inp;
	}

	public int getRecDID()

	{
		return recDID;
	}

	public void setPlatformID_Pfad(int inp) {
		platformID_Pfad = inp;
	}

	public int getPlatformID_Pfad()

	{
		return platformID_Pfad;
	}

	public void setFileServer_DID(int inp) {
		fileServer_DID = inp;
	}

	public int getFileServer_DID()

	{
		return fileServer_DID;
	}

	public void setM_091_011_FileNr(int inp) {
		m_091_011_FileNr = inp;
	}

	public int getM_091_011_FileNr()

	{
		return m_091_011_FileNr;
	}

	public void setSortierNr(int inp) {
		sortierNr = inp;
	}

	public int getSortierNr()

	{
		return sortierNr;
	}

	public void setImage(boolean inp) {
		image = inp;
	}

	public boolean getImage()

	{
		return image;
	}

	public void setSizeX(int inp) {
		sizeX = inp;
	}

	public int getSizeX()

	{
		return sizeX;
	}

	public void setSizeY(int inp) {
		sizeY = inp;
	}

	public int getSizeY()

	{
		return sizeY;
	}

	public void setM_091_012_FileVerwBez(java.lang.String inp) {
		m_091_012_FileVerwBez = inp;
	}

	public java.lang.String getM_091_012_FileVerwBez()

	{
		return m_091_012_FileVerwBez;
	}

	public void setM_022_031_VorgangNr(java.lang.String inp) {
		m_022_031_VorgangNr = inp;
	}

	public java.lang.String getM_022_031_VorgangNr()

	{
		return m_022_031_VorgangNr;
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
