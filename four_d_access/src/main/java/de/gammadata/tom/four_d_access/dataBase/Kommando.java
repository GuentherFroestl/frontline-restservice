/*
 * Kommando.java
 *
 * Created on 29. März 2006, 11:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package de.gammadata.tom.four_d_access.dataBase;

/**
 * 
 * @author gfr
 * 
 *         DAs Objekt bildet ein Kommando ab, das ein Handler unter einem
 *         Kontext behandelt.
 */
public class Kommando {

	private String name = ""; // Name des Kommandos
	private String code = ""; // code zum Aufruf des Kommandos
	private String bezeichnung = ""; // Text für die Anzeige des Kommandos
	private String target = ""; // Zielfenster Name

	/** Creates a new instance of Kommando */

	public Kommando() {
	}

	public Kommando(String name, String code, String bezeichnung) {
		this.name = name;
		this.code = code;
		this.bezeichnung = bezeichnung;
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

	public void setBezeichnung(String inp) {
		bezeichnung = inp;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setTarget(String inp) {
		target = inp;
	}

	public String getTarget() {
		return target;
	}

}
