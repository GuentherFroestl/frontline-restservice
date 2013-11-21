/*
 * DbStruktur.java
 *
 * Created on 1. November 2005, 09:14
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.util.Hashtable;
import java.util.regex.Pattern;

import de.gammadata.tom.four_d_access.util.LocaleFormatter;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.OneObjectPointer;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * 
 * @author günther
 * 
 *         allgemeine Informationen und Defaultwerte über die Datenbank
 */

/*
 * ` Übersicht der Tabellen ` ` **************************** ` Tabelle Nr 1:
 * Mitarbeiter ` Tabelle Nr 2: Benutzergruppen ` Tabelle Nr 3: Steuersätze `
 * Tabelle Nr 4: Merkmalgruppen ` Tabelle Nr 5: Währungen ` Tabelle Nr 6: Konten
 * ` Tabelle Nr 7: Konditionen ` Tabelle Nr 8: WarenkorbPositionen ` Tabelle Nr
 * 9: Adressen ` Tabelle Nr 10: Materialverbrauch ` Tabelle Nr 11: Korrespondenz
 * ` Tabelle Nr 12: Zahlungsbedingungen ` Tabelle Nr 13: Gruppenrechte ` Tabelle
 * Nr 14: AktionsGruppen ` Tabelle Nr 15: ArtikelKategorien ` Tabelle Nr 16:
 * Formrechte ` Tabelle Nr 17: Warenkorb ` Tabelle Nr 18: System ` Tabelle Nr
 * 19: MAZeitverwaltung ` Tabelle Nr 20: Merkmale ` Tabelle Nr 21:
 * AktionsTabelle ` Tabelle Nr 22: Vorgangsverwaltung ` Tabelle Nr 23:
 * MessageFolder ` Tabelle Nr 24: Projektverwaltung ` Tabelle Nr 25:
 * MerkmalTabelle ` Tabelle Nr 26: AnredeTabelle ` Tabelle Nr 27: Sachverwaltung
 * ` Tabelle Nr 28: Sachen ` Tabelle Nr 29: Belgungsarten ` Tabelle Nr 30:
 * Buchungspositionen ` Tabelle Nr 31: MediaContent ` Tabelle Nr 32: Artikel `
 * Tabelle Nr 33: ArtikelGruppen ` Tabelle Nr 34: EkQuellen ` Tabelle Nr 35:
 * Salden ` Tabelle Nr 36: Zahlungszuordnung ` Tabelle Nr 37: Bestaende `
 * Tabelle Nr 38: EmailAccounts ` Tabelle Nr 39: Files ` Tabelle Nr 40: Länder `
 * Tabelle Nr 41: Versandarten ` Tabelle Nr 42: Sprachen ` Tabelle Nr 43:
 * Sprachenfeldnamen ` Tabelle Nr 44: Branchen ` Tabelle Nr 45:
 * Branchenfeldnamen ` Tabelle Nr 46: MerkmaleAllg ` Tabelle Nr 47: Fenster `
 * Tabelle Nr 48: Fensterregister ` Tabelle Nr 49: Register ` Tabelle Nr 50:
 * Registerfelder ` Tabelle Nr 51: GrundUnterregister ` Tabelle Nr 52:
 * AutoUnterregister ` Tabelle Nr 53: Eingabeformen ` Tabelle Nr 54: Mandanten `
 * Tabelle Nr 55: Standorte ` Tabelle Nr 56: Vorgaben ` Tabelle Nr 57:
 * Sprachvariablen ` Tabelle Nr 58: BestellPos ` Tabelle Nr 59: Bestellungen `
 * Tabelle Nr 60: Lieferanten ` Tabelle Nr 61: Emails_sent ` Tabelle Nr 62:
 * AusRechPos ` Tabelle Nr 63: AusRech ` Tabelle Nr 64: Warenbewegungen `
 * Tabelle Nr 65: AuftragsPos ` Tabelle Nr 66: Lieferscheine ` Tabelle Nr 67:
 * Aufträge ` Tabelle Nr 68: Kunden ` Tabelle Nr 69: Geldtransfer ` Tabelle Nr
 * 70: Sites ` Tabelle Nr 71: Kontenrahmen ` Tabelle Nr 72: RegisterFilter `
 * Tabelle Nr 73: Reports ` Tabelle Nr 74: RegisterMenüs ` Tabelle Nr 75:
 * AppSync ` Tabelle Nr 76: Textbausteine ` Tabelle Nr 77: Textbausteinart `
 * Tabelle Nr 78: Einheiten ` Tabelle Nr 79: Buchungsperioden ` Tabelle Nr 80:
 * Lieferpos ` Tabelle Nr 81: Kostenstellen ` Tabelle Nr 82: Buchungsstapel `
 * Tabelle Nr 83: Geldkonten ` Tabelle Nr 84: EinRech ` Tabelle Nr 85:
 * EinRechPos ` Tabelle Nr 86: RegisterAuswahl ` Tabelle Nr 87: ImpExpFilter `
 * Tabelle Nr 88: ImpExpFelder ` Tabelle Nr 89: Kalender ` Tabelle Nr 90:
 * Spezialtage ` Tabelle Nr 91: File_Verwendung ` Tabelle Nr 92:
 * Auftrags_Gruppen ` Tabelle Nr 93: ContentElemente ` Tabelle Nr 94: FileTypen
 * ` Tabelle Nr 95: FileBLOBs ` Tabelle Nr 96: Katalog ` Tabelle Nr 97:
 * Bookmarks ` Tabelle Nr 98: BookmarkLinks ` Tabelle Nr 99: Kontext ` Tabelle
 * Nr 100: EmailPattern ` Tabelle Nr 101: KontextTypen ` Tabelle Nr 102:
 * ChgRecordLog ` Tabelle Nr 103: Messages ` Tabelle Nr 104: MessageContent `
 * Tabelle Nr 105: MsgInBox ` Tabelle Nr 106: AccessGruppen ` Tabelle Nr 107:
 * AccessGroupMembers `
 */

public class DbStruktur {

	public static int anzahlTabellen = 104;
	private static String[][] feldNamen = null;

	private static Hashtable<Integer, Register> registerListe;

	private static String defaultEingabeXmlFile = "eingabe_default.xml";
	private static String defaultListeXmlFile = "liste_default.xml";
	private static String defaultSendmailXmlFile = "eingabe_sendmailhandler.xml";

	private static Pattern einagbePattern = Pattern.compile(".*eingabe.*");
	private static Pattern listenPattern = Pattern.compile(".*liste.*");

	/** Creates a new instance of DbStruktur */
	public DbStruktur() {
	}

	
	static public void setDefaultEingabeXmlFile(String inp) {
		defaultEingabeXmlFile = inp;
	}

	static public String getDefaultEingabeXmlFile() {
		return defaultEingabeXmlFile;
	}

	static public void setDefaultListeXmlFile(String inp) {
		defaultListeXmlFile = inp;
	}

	static public String getDefaultListeXmlFile() {
		return defaultListeXmlFile;
	}

	static public void setDefaultSendmailXmlFile(String inp) {
		defaultSendmailXmlFile = inp;
	}

	static public String getDefaultSendmailXmlFile() {
		return defaultSendmailXmlFile;
	}


	static public Hashtable<Integer, Register> getRegisterListe() {
		return registerListe;
	}

	static public void setRegisterListe(Hashtable<Integer, Register> inp) {
		registerListe = inp;
	}

	public static Register getRegister(int regNr) {
		return registerListe.get(new Integer(regNr));
	}

	public static Register getRegister(Integer regNr) {
		return registerListe.get(regNr);
	}

	static public int[] getDefaultOneObjFieldList(OneObjectPointer onepointer) {
		int[] fieldList = null;
		if (onepointer != null) {
			int tab = onepointer.getTabellenNummer();
			switch (tab) {
			case 1: // Mitarbeiter
			{
				fieldList = new int[] { 12, 13, 14, 21, 28, 35, 36 };
				break;
			}
			case 2: // Benutzergruppen
			{
				fieldList = new int[] { 11 };
				break;
			}
			case 5: // Währungen
			{
				fieldList = new int[] { 11, 15 };
				break;
			}
			case 6: // Konten
			{
				fieldList = new int[] { 11, 12 };
				break;
			}
			case 9: // Adressen
			{
				fieldList = new int[] { 11, 45, 13, 14, 20, 21, 22, 23, 16, 17,
						18 };
				break;
			}
			case 11: // Korrespondenz
			{
				fieldList = new int[] { 12, 15, 21, 25, 26 };
				break;
			}
			case 12: // Zahlungsbedingungen
			{
				fieldList = new int[] { 11, 12, 15 };
				break;
			}
			case 15: // Artikel Kategorien
			{
				fieldList = new int[] { 11 };
				break;
			}
			case 21: // AktionsTabelle
			{
				fieldList = new int[] { 11 };
				break;
			}
			case 22: // Vorgangsverwaltung
			{
				fieldList = new int[] { 11, 31 };
				break;
			}
			case 26: // AnredeTabelle
			{
				fieldList = new int[] { 11, 13, 14 };
				break;
			}
			case 38: // EmailAccounts
			{
				fieldList = new int[] { 13, 14 };
				break;
			}
			case 40: // Länder
			{
				fieldList = new int[] { 11, 12 };
				break;
			}
			case 42: // Sprachen
			{
				fieldList = new int[] { 1, 2 };
				break;
			}
			case 60: // Lieferanten
			{
				fieldList = new int[] { 11, 13, 25 };
				break;
			}
			case 68: // Kunden
			{
				fieldList = new int[] { 11, 15, 26 };
				break;
			}
			case 106: // AccessGruppen
			{
				fieldList = new int[] { 13, 14 };
				break;
			}
			default: {
				fieldList = new int[] { 11, 12 };
				break;
			}
			}
		}
		return fieldList;
	}

	static public void setFeldNamenArray(String[][] inp) {
		feldNamen = inp;
	}

	public static String[][] getFeldNamenArray() {
		return feldNamen;
	}

	public static String getFeldName(int tabNummer, int feldNummer,
			LocaleFormatter lc) {
		String feldname = null;
		try {
			feldname = feldNamen[tabNummer - 1][feldNummer];

		} catch (Exception e) {

		}
		return feldname;
	}

	public static String getFeldName(Xmp obj, FieldSpec fSpec,
			LocaleFormatter lc) {
		int tabNummer = obj.getDbTabNummer();
		String feldname = null;
		try {
			feldname = fSpec.getFieldName(); // Default
		} catch (Exception e) {

		}

		if (feldNamen == null)
			return feldname; // Falls keine Feldnamen hinterlegt sind

		try {
			feldname = feldNamen[tabNummer - 1][fSpec.getFieldNumber()];
		} catch (Exception e) {

		}
		return feldname;
	}

	public static void setFeldName(int tabNummer, int feldNummer,
			String feldname, LocaleFormatter lc) {
		try {
			feldNamen[tabNummer - 1][feldNummer] = feldname;

		} catch (Exception e) {

		}
	}

	public static void setTabellenName(int tabNummer, String tabname,
			LocaleFormatter lc) {
		try {
			feldNamen[tabNummer - 1][0] = tabname;

		} catch (Exception e) {

		}
	}

	public static String getTabellenName(int tabNummer, LocaleFormatter lc) {
		String feldname = null;
		try {
			feldname = feldNamen[tabNummer - 1][0];

		} catch (Exception e) {

		}
		return feldname;
	}

}
