/*
 * Mitarbeiter.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 1 mit dem Namen "Mitarbeiter"
 *
 * 
 */

package de.gammadata.tom.four_d_access.dbBeans;

import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * 
 * @author gfr
 */

public class BasicBean implements Xmp {
	private final boolean printon = true;
	public static final String xmlClassTag = "BasicBean";
	public static final int dbTabNummer = 0;
	public String xmlObjektId = this.getClass().getName();

	private boolean allFields = false;
	private boolean newObject = false;
	private boolean inputModus = false;
	private boolean readOnly = false;

	private int[] readOnlyFieldList = null;
	private int[] primaryFieldList = null;

	// generierte felder - Anfang

	private int dID = -1;
	private int dMandant = 0;

	// generierte felder - Ende

	private final String[] xmlFelder1 = { "dID" };
	private final de.gammadata.tom.four_d_access.xml.FieldSpec[] fs = { new de.gammadata.tom.four_d_access.xml.FieldSpec(
			"dID", 1, 0, "LONGINTEGER", null) };

	private int[] fieldList;

	@Override
	public void setDID(int inp) {
		dID = inp;
	}

	@Override
	public int getDID() {
		return dID;
	}

	/**
	 * Gibt die FeldNummer der uuid-Eigenschaft zurück<br/>
	 * gibt 0, wenn uuid nicht als Feld vorhanden ist<br/>
	 * muss durch Klassen mit uuid überschrieben werden
	 * 
	 * @return int uuid Feldnummer
	 */
	@Override
	public int getUuid_fn() {
		return 0;
	}

	@Override
	public void setDMandant(int inp) {
		dMandant = inp;
	}

	@Override
	public int getDMandant()

	{
		return dMandant;
	}

	@Override
	public String getXmlClassTag() {
		return xmlClassTag;
	}

	public String[] getXmlFelder1(int mode) {
		return xmlFelder1;
	}

	public String[] getXmlFelder1(String mode) {
		return xmlFelder1;
	}

	public void setXmpOneObj(String fieldName, Xmp inpObj) throws Exception {
	}

	private java.util.HashMap<String, Xmp> oneObjectsListOld = null;

	public void putXmpOneObj(String fieldName, Xmp inpObj) {
		if (oneObjectsListOld == null) {
			oneObjectsListOld = new java.util.HashMap<String, Xmp>();
		}

		oneObjectsListOld.put(fieldName, inpObj);

	}

	public Xmp getXmpOneObj(String fieldName) {
		if (oneObjectsListOld == null) {
			return null;
		}

		try {
			Object ob = oneObjectsListOld.get(fieldName);
			if (ob != null) {
				return (Xmp) ob;
			}
			return null;

		} catch (Exception e) {
			return null;
		}
	}

	public int getOneObjDID(String fieldName) {
		return 0;
	}

	@Override
	public void setFieldList(int[] fieldList) {
		this.fieldList = fieldList;
		allFields = false;
	}

	@Override
	public void setFieldList(FieldSpec[] fieldSpecs) {
		if (fieldSpecs == null) {
			allFields = true;
			return;
		}
		int anz = fieldSpecs.length;
		int[] fl = new int[anz];
		int i = 0;
		for (FieldSpec fs : fieldSpecs) {
			fl[i] = fs.getFieldNumber();
			i++;
		}
		this.fieldList = fl;
	}

	@Override
	public int[] getFieldList() {
		return this.fieldList;
	}

	@Override
	public void setAllFields() {
		allFields = true;
		int anz = getFieldSpecs().length;
		int[] fl = new int[anz];
		for (int i = 0; i < anz; i++) {
			fl[i] = i + 1; // Alle verfügbaren Feldnummern erzeugen
		}
		this.fieldList = fl;

	}

	public boolean getAllFields() {
		return allFields;
	}

	@Override
	public boolean isAllFields() {
		return allFields;
	}

	@Override
	public boolean isNewObject() {
		return newObject;
	}

	@Override
	public void setNewObject(boolean inp) {
		newObject = inp;
	}

	boolean allLoaded = false;

	@Override
	public void setAllLoaded(boolean inp) {
		allLoaded = inp;
	}

	@Override
	public boolean isAllLoaded() {
		return allLoaded;
	}

	@Override
	public int getDbTabNummer() {
		return dbTabNummer;
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs() {

		return fs;
	}

	/*
	 * zum Handeln von OneObjekten
	 */
	private java.util.HashMap<Integer, Xmp> oneObjectsList = null;

	@Override
	public void initOneObjList() {
		oneObjectsList = new java.util.HashMap<Integer, Xmp>();
	}

	@Override
	public void setOneObjList(java.util.HashMap<Integer, Xmp> oneObjList) {
		this.oneObjectsList = oneObjList;
	}

	@Override
	public java.util.HashMap<Integer, Xmp> getOneObjList() {
		return this.oneObjectsList;
	}

	@Override
	public void putOneObj(Integer feldNummer, Xmp oneObj) {
		if (this.oneObjectsList == null)
			initOneObjList();
		this.oneObjectsList.put(feldNummer, oneObj);
	}

	@Override
	public Xmp getOneObj(Integer feldNummer) {
		if ((this.oneObjectsList != null) && (feldNummer != null)) {
			return this.oneObjectsList.get(feldNummer);
		} else
			return null;
	}

	@Override
	public boolean isInputModus() {
		return inputModus;
	}

	@Override
	public void setInputModus(boolean inp) {
		inputModus = inp;
	}

	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	@Override
	public void setReadOnly(boolean inp) {
		readOnly = inp;
	}

	@Override
	public void setPrimaryFieldList(int[] input) {
		primaryFieldList = input;
	}

	@Override
	public int[] getPrimaryFieldList() {
		return primaryFieldList;
	}

	@Override
	public void setReadOnlyFieldList(int[] input) {
		readOnlyFieldList = input;
	}

	@Override
	public int[] getReadOnlyFieldList() {
		return readOnlyFieldList;
	}

}