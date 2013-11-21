/*
 * Kontext.java
 *
 * Created on 22. November 2005, 11:21
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.util.Random;

/**
 * 
 * @author günther
 */
public class Kontext {
	private String id = "";
	private String kontextArt = "";
	private String xmlFile = "";
	private String xslFile = "";
	private String handlerClassName;
	private String handlerName;
	private Register searchRegister;
	private String selectionName;
	private String selectionScope;
	private String backUri;

	private int resultFieldNummer;

	/** Creates a new instance of Kontext */
	public Kontext() {
		Random rdGenerator = new Random();
		id = "K" + Integer.toString(rdGenerator.nextInt(1000000))
				+ Integer.toString(rdGenerator.nextInt(1000000)) + "X";
	}

	public Kontext(String id) {
		this.id = id;
	}

	/*
	 * public void setId(String inp) { id = inp; }
	 */
	public String getId() {
		return id;
	}

	public void setKontextArt(String inp) {
		kontextArt = inp;
	}

	public String getKontextArt() {
		return kontextArt;
	}

	public void setXmlFile(String inp) {
		xmlFile = inp;
	}

	public String getXmlFile() {
		return xmlFile;
	}

	public void setXslFile(String inp) {
		xslFile = inp;
	}

	public String getXslFile() {
		return xslFile;
	}

	public void setHandlerClassName(String inp) {
		handlerClassName = inp;
	}

	public String getHandlerClassName() {
		return handlerClassName;
	}

	public void setHandlerName(String inp) {
		handlerName = inp;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setResultFieldNummer(int inp) {
		resultFieldNummer = inp;
	}

	public int getResultFieldNummer() {
		return resultFieldNummer;
	}

	public void setSearchRegister(Register searchRegister) {
		this.searchRegister = searchRegister;
	}

	public Register getSearchRegister() {
		return this.searchRegister;
	}

	public void setSelectionScope(String inp) {
		selectionScope = inp;
	}

	public String getSelectionScope() {
		return selectionScope;
	}

	public void setSelectionName(String inp) {
		selectionName = inp;
	}

	public String getSelectionName() {
		return selectionName;
	}

	public String getBackUri() {
		return backUri;
	}

	public void setBackUri(String backUri) {
		this.backUri = backUri;
	}
}
