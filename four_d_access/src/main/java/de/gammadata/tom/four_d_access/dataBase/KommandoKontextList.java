/*
 * KommandoKontextList.java
 *
 * Created on 29. März 2006, 14:44
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
public class KommandoKontextList {

	private ArrayList<KommandoKontext> kommandoKontextList;
	private String scope;

	/** Creates a new instance of KommandoKontextList */
	public KommandoKontextList() {
		kommandoKontextList = new ArrayList<KommandoKontext>();
	}

	public KommandoKontextList(String scope) {
		kommandoKontextList = new ArrayList<KommandoKontext>();
	}

	public void setKommandoKontextList(
			ArrayList<KommandoKontext> kommandoKontextList) {
		this.kommandoKontextList = kommandoKontextList;
	}

	public ArrayList<KommandoKontext> getKommandoKontextList() {
		return kommandoKontextList;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getScope() {
		return scope;
	}
}
