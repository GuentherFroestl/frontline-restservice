/*
 * Xmp.java
 *
 * Created on 17. November 2004, 10:02
 */

package de.gammadata.tom.four_d_access.xml;

/**
 * 
 * @author gfr Dieses Interface beschreibt die Funktionen für den XML-Workflow
 */
public interface Xmp {

	public String getXmlClassTag();

	public int getDbTabNummer();

	// public String[] getXmlFelder1(int mode); //obsolent?
	// public String[] getXmlFelder1(String mode); //obsolent?
	public int getDID();

	public void setDID(int dID);

	public void setDMandant(int inp);

	public int getDMandant();

	/**
	 * Gibt die FeldNummer der uuid-Eigenschaft zurück<br/>
	 * gibt 0, wenn uuid nicht als Feld vorhanden ist<br/>
	 * muss durch Klassen mit uuid überschrieben werden
	 * 
	 * @return int uuid Feldnummer
	 */
	public int getUuid_fn();

	// zum Handeln von Objekt-Feldern
	public void setFieldList(int[] fieldList);

	public void setFieldList(FieldSpec[] fieldSpecs);

	public int[] getFieldList();

	public boolean isAllFields();

	public void setAllFields();

	public boolean isAllLoaded();

	public void setAllLoaded(boolean inp);

	public FieldSpec[] getFieldSpecs();

	// zum Handlen von Primary Keys

	public void setPrimaryFieldList(int[] fieldList);

	public int[] getPrimaryFieldList();

	// zum Handeln von Read/write

	public boolean isNewObject();

	public void setNewObject(boolean inp);

	public boolean isInputModus();

	public void setInputModus(boolean inp);

	public void setReadOnly(boolean inp);

	public boolean isReadOnly();

	public void setReadOnlyFieldList(int[] fieldList);

	public int[] getReadOnlyFieldList();

	// zum Handeln von OneObjekten
	public void initOneObjList();

	public void setOneObjList(java.util.HashMap<Integer, Xmp> oneObjList);

	public java.util.HashMap<Integer, Xmp> getOneObjList();

	public void putOneObj(Integer feldNummer, Xmp oneObj);

	public Xmp getOneObj(Integer feldNummer);
}
