/*
 * RegisterFilterListe.java
 *
 * Created on 13. März 2006, 15:59
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
public class RegisterFilterListe {

	private ArrayList<RegisterFilter> regFilterList;
	private int selectedFilterNummer = 0;

	/**
	 * Creates a new instance of RegisterFilterListe
	 */
	public RegisterFilterListe() {
		regFilterList = new ArrayList<RegisterFilter>();
	}

	public void setSelectedFilterNummer(int nummer) {
		this.selectedFilterNummer = nummer;
	}

	public int getSelectedFilterNummer() {
		return selectedFilterNummer;
	}

	public void setFilterListe(ArrayList<RegisterFilter> regFilterList) {
		this.regFilterList = regFilterList;
	}

	public ArrayList<RegisterFilter> getFilterListe() {
		return regFilterList;
	}

}
