/*
 * OneObjectPointer.java
 *
 * Created on 10. Oktober 2005, 12:09
 */

package de.gammadata.tom.four_d_access.xml;

/**
 * 
 * @author günther
 */
public class OneObjectPointer {
	private String tabellenName;
	private int tabellenNummer;
	private String indexFieldName;
	private int indexFieldNummer;

	/** Creates a new instance of OneObjectPointer */
	public OneObjectPointer() {
	}

	public OneObjectPointer(int tabellenNummer, int indexFieldNummer,
			String tabellenName, String indexFieldName) {
		this.tabellenName = tabellenName;
		this.tabellenNummer = tabellenNummer;
		this.indexFieldName = indexFieldName;
		this.indexFieldNummer = indexFieldNummer;
	}

	public void setTabellenName(String tabellenName) {
		this.tabellenName = tabellenName;
	}

	public String getTabellenName() {
		return this.tabellenName;
	}

	public void setTabellenNummer(int tabellenNummer) {
		this.tabellenNummer = tabellenNummer;
	}

	public int getTabellenNummer() {
		return this.tabellenNummer;
	}

	public void setIndexFieldName(String indexFieldName) {
		this.indexFieldName = indexFieldName;
	}

	public String getIndexFieldName() {
		return this.indexFieldName;
	}

	public void setIndexFieldNummer(int indexFieldNummer) {
		this.indexFieldNummer = indexFieldNummer;
	}

	public int getIndexFieldNummer() {
		return this.indexFieldNummer;
	}
}
