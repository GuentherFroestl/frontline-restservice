/*
 * RegisterView.java
 *
 * Created on 19. Oktober 2005, 12:58
 */

package de.gammadata.tom.four_d_access.dataBase;

/**
 *
 * @author günther
 */

import java.util.ArrayList;

public class RegisterView {

	private String selectionName;
	private String selectionScope;
	private Register register;
	private int eingabeFormNummer = 0;
	private ArrayList<KommandoKontext> kommandoKontextList;
	private ArrayList<RegisterFilterListe> filterGruppen;

	/** Creates a new instance of RegisterView */
	public RegisterView() {
	}

	public void setSelectionName(String selectionName) {
		this.selectionName = selectionName;
	}

	public String getSelectionName() {
		return selectionName;
	}

	public void setSelectionScope(String selectionScope) {
		this.selectionScope = selectionScope;
	}

	public String getSelectionScope() {
		return selectionScope;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Register getRegister() {
		return register;
	}

	public void setEingabeFormNummer(int eingabeFormNummer) {
		this.eingabeFormNummer = eingabeFormNummer;
	}

	public int getEingabeFormNummer() {
		return eingabeFormNummer;
	}

	public void setKommandoKontextList(
			ArrayList<KommandoKontext> kommandoKontextList) {
		this.kommandoKontextList = kommandoKontextList;
	}

	public ArrayList<KommandoKontext> getKommandoKontextList() {
		return kommandoKontextList;
	}

	public void setFilterGruppenListe(
			ArrayList<RegisterFilterListe> filterGruppenListe) {
		this.filterGruppen = filterGruppenListe;
	}

	public ArrayList<RegisterFilterListe> getFilterGruppenListe() {
		return filterGruppen;
	}

}
