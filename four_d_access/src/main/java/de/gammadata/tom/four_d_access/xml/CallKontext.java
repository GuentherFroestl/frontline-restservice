/*
 * CallKontext.java
 *
 * Created on 21. März 2005, 11:49
 */

package de.gammadata.tom.four_d_access.xml;

/**
 * 
 * @author gfr
 * 
 *         speichert Informationen über den Handlerstatus wenn Aufrufe, z.B. für
 *         One-Obj erfolgen
 */
public class CallKontext {

	private int id = 0;
	private String modus = "";
	private Xmp xmpObj = null;
	private XmpSelection xmpSelection = null;

	// Felder für den Xmp-Listener
	private Xmp listenerObj;
	private String listenerOneFieldName;

	/** Creates a new instance of CallKontext */
	public CallKontext() {
	}

	// Getter Setter

	public void setId(int inp) {
		id = inp;
	}

	public int getId() {
		return id;
	}

	public void setModus(String inp) {
		modus = inp;
	}

	public String getModus() {
		return modus;
	}

	public void setXmpObj(Xmp inp) {
		xmpObj = inp;
	}

	public Xmp getXmpObj() {
		return xmpObj;
	}

	public void setXmpSelection(XmpSelection inp) {
		xmpSelection = inp;
	}

	public XmpSelection getXmpSelection() {
		return xmpSelection;
	}

	public void setListenerObj(Xmp inp) {
		listenerObj = inp;
	}

	public Xmp getListenerObj() {
		return listenerObj;
	}

	public void setListenerOneFieldName(String inp) {
		listenerOneFieldName = inp;
	}

	public String getListenerOneFieldName() {
		return listenerOneFieldName;
	}

}
