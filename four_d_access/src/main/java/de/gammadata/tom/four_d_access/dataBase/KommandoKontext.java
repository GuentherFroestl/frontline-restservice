/*
 * KommandoKontext.java
 *
 * Created on 29. März 2006, 11:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.util.ArrayList;

/**
 * 
 * @author gfr
 */
public class KommandoKontext {

	/** Creates a new instance of KommandoKontext */

	private String name = ""; // Name des Kommandos
	private String code = ""; // code zum Aufruf des Kommandos
	private String type = ""; // typ z.B. singelClick
	private String bezeichnung = ""; // Text für die Anzeige des Kommandos
	private String imageTag = ""; // Bild für Anzeige

	private ArrayList<Kommando> kommandoList;

	/** Creates a new instance of Kommando */

	public KommandoKontext() {
	}

	public KommandoKontext(String name, String code, String bezeichnung,
			String type, String imageTag) {
		this.name = name;
		this.code = code;
		this.bezeichnung = bezeichnung;
		this.type = type;
		this.imageTag = imageTag;

	}

	public void setKommandoList(ArrayList<Kommando> inp) {
		kommandoList = inp;
	}

	public ArrayList<Kommando> getKommandoList() {
		return kommandoList;
	}

	public void setName(String inp) {
		name = inp;
	}

	public String getName() {
		return name;
	}

	public void setCode(String inp) {
		code = inp;
	}

	public String getCode() {
		return code;
	}

	public void setType(String inp) {
		type = inp;
	}

	public String getType() {
		return type;
	}

	public void setBezeichnung(String inp) {
		bezeichnung = inp;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setImageTag(String inp) {
		imageTag = inp;
	}

	public String getImageTag() {
		return imageTag;
	}
}
