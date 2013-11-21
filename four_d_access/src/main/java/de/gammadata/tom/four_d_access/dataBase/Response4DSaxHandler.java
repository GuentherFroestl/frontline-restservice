/*
 * Response4DSaxHandler.java
 *
 * Created on 11. Oktober 2005, 15:34
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import de.gammadata.tom.four_d_access.dbBeans.Auftraege;
import de.gammadata.tom.four_d_access.dbBeans.Laender;
import de.gammadata.tom.four_d_access.dbBeans.RegisterMenues;
import de.gammadata.tom.four_d_access.dbBeans.Raeume;
import de.gammadata.tom.four_d_access.dbBeans.SteuerBetraege;
import de.gammadata.tom.four_d_access.dbBeans.Steuersaetze;
import de.gammadata.tom.four_d_access.dbBeans.Waehrungen;
import de.gammadata.tom.four_d_access.util.LocaleFormatter;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.XmlBasics;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * 
 * @author günther
 */
public class Response4DSaxHandler extends DefaultHandler {
	private static Logger logger = Logger.getLogger(Response4DSaxHandler.class);

	public static String xmlTomenvelopeTag = "tomenvelope";
	public static String xmlHeaderTag = "header";
	public static String xmlIdTag = "id";
	public static String xmlBodyTag = "body";
	public static String xmlSelectionTag = "selection";
	public static String xmlObjectTag = "dbobject";
	public static String xmlOneObjectTag = "oneobject";
	public static String xmlOneObjListTag = "oneobjlist";
	public static String xmlFieldTag = "field";
	public static String xmlNextDidTag = "nextdid";
	public static String xmlNextNumberTag = "nextnumber";
	public static String xmlProcessResultTag = "processresult";

	public static String xmlLocaleAttribute = "locale";
	public static String xmlUserAttribute = "user";
	public static String xmlPwAttribute = "pw";
	public static String xmlTabAttribute = "tab";
	public static String xmlNummerAttrtibute = "nummer";
	public static String xmlNameAttrtibute = "name";
	public static String xmlDidAttribute = "did";
	public static String xmlAnzahlAttribute = "anzahl";
	public static String xmlSelectedrecordsAttribute = "selectedrecords";
	public static String xmlStartrecordAttribute = "startrecord";
	public static String xmlResponserecordsAttribute = "responserecords";
	public static String xmlRecordnumberAttribute = "recordnumber";
	public static String xmlFieldAttribute = "field";
	public static String xmlTypeAttribute = "type";
	public static String xmlTypeCodeAttribute = "typecode";
	public static String xmlMaxlengthAttribute = "maxlength";
	public static String xmlFkeyFeldNummer = "fkeyfieldnummer";

	public static String dbBeansPackageName = "de.gammadata.tom.four_d_access.dbBeans";

	protected XmpSelection xmpSel;
	private Xmp currentObject;
	private Xmp currentOneObject;
	private Xmp masterObject;
	private FieldSpec currentFieldSpec;
	private int current4DFieldType;
	private String currentTagContent;
	private int oneObjFkFeldNummer = 0;
	private int nextDid;
	private int[] nextDidList;
	private int nextNumber;

	public HashMap<String, String> getProcessResults() {
		return processResults;
	}

	private HashMap<String, String> processResults;

	public int getNextNumber() {
		return nextNumber;
	}

	private ArrayList<Integer> objFieldList = null;
	private ArrayList<Integer> oneObjFieldList = null;
	private boolean oneObjOn = false;

	private java.util.HashMap<Integer, Xmp> oneObjectsList = null;

	/** Creates a new instance of Response4DSaxHandler */
	public Response4DSaxHandler() {
	}

	@Override
	public void startDocument() {
		this.processResults = null;
	}

	@Override
	public void endDocument() {

	}

	@Override
	public void startElement(String namespaceURI, String sName, String qName,
			Attributes attrs) {
		currentTagContent = new String(); // Tag Content löschen
		parseElement: {
			try {
				if (qName.equalsIgnoreCase(xmlHeaderTag)) {

					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlIdTag)) {

					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlBodyTag)) {

					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlNextDidTag)) {
					String didTxt = attrs.getValue(xmlDidAttribute);
					String anzahlTxt = attrs.getValue(xmlAnzahlAttribute);
					if ((didTxt != null) && (anzahlTxt != null)) {
						int did = Integer.parseInt(didTxt);
						nextDid = did;
						int anzahl = Integer.parseInt(anzahlTxt);
						if (anzahl > 0) {
							nextDidList = new int[anzahl];
							for (int i = 0; i < anzahl; i++) {
								nextDidList[i] = did;
								did++;
							}

							logger.debug(" nextDid: " + did + " Anzahl: "
									+ anzahl);
						}

					}
					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlNextNumberTag)) {
					String numberTxt = attrs.getValue(xmlNummerAttrtibute);
					if ((numberTxt != null)) {
						int number = Integer.parseInt(numberTxt);
						this.nextNumber = number;

						logger.debug(" nextNumber: " + number);

					}
					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlProcessResultTag)) {
					this.processResults = new HashMap<String, String>();
					for (int i = 0; i < attrs.getLength(); i++) {
						this.processResults.put(attrs.getQName(i),
								attrs.getValue(i));
					}
					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlSelectionTag)) {
					xmpSel = new XmpSelection();
					String tabelle = attrs.getValue(xmlTabAttribute);
					xmpSel.setContentClass(getXmpInstance(tabelle).getClass());

					String tabNummer = attrs.getValue(xmlNummerAttrtibute);

					xmpSel.setRecordsInDbSelecton(Integer.parseInt(attrs
							.getValue(xmlSelectedrecordsAttribute)));
					xmpSel.setFirstDisplayedRecNr(Integer.parseInt(attrs
							.getValue(xmlStartrecordAttribute)));
					// xmpSel.setDisplayedRecs(Integer.parseInt(attrs.getValue(xmlResponserecordsAttribute)));
					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlObjectTag)) {
					oneObjOn = false;
					String tabelle = attrs.getValue(xmlTabAttribute);
					objFieldList = new ArrayList<Integer>();
					oneObjectsList = new java.util.HashMap<Integer, Xmp>();
					try {
						currentObject = getXmpInstance(tabelle);
						currentObject.setDID(Integer.parseInt(attrs
								.getValue(xmlDidAttribute)));
						masterObject = currentObject;
						logger.debug(" DBObject : "
								+ currentObject.getXmlClassTag() + ", DID: "
								+ currentObject.getDID());
					} catch (Exception e) {
						logger.error(
								" xmlObjectTag Fehler beim ERzeugen Object: ",
								e);
					}

					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlOneObjectTag)) {
					// letztes - HauptObject zwischenspeichern
					oneObjOn = true;
					String tabelle = attrs.getValue(xmlTabAttribute);
					oneObjFieldList = new ArrayList<Integer>();
					try {
						currentObject = getXmpInstance(tabelle);
						currentObject.setDID(Integer.parseInt(attrs
								.getValue(xmlDidAttribute)));
						oneObjFkFeldNummer = Integer.parseInt(attrs
								.getValue(xmlFkeyFeldNummer));
						logger.debug(" OneObject : "
								+ currentObject.getXmlClassTag() + ", DID: "
								+ currentObject.getDID());
					} catch (Exception e) {
						currentObject = null;
						logger.error(
								" xmlObjectTag Fehler beim Erzeugen Object: "
										+ dbBeansPackageName + "." + tabelle, e);
					}
					break parseElement;
				}

				if (qName.equalsIgnoreCase(xmlFieldTag)) {

					int fieldNummer = Integer.parseInt(attrs
							.getValue(xmlNummerAttrtibute));
					if (!oneObjOn) {
						objFieldList.add(new Integer(fieldNummer));
					} else {
						oneObjFieldList.add(new Integer(fieldNummer));
					}
					if (fieldNummer <= currentObject.getFieldSpecs().length) {
						currentFieldSpec = currentObject.getFieldSpecs()[fieldNummer - 1];
						current4DFieldType = Integer.parseInt(attrs
								.getValue(xmlTypeCodeAttribute));
					} else {
						currentFieldSpec = null;
						current4DFieldType = 0;
					}
					break parseElement;
				}
			} catch (Exception e) {
				logger.debug("startElement Fehler: ", e);
			}
		}

	}

	@Override
	public void endElement(String namespaceURI, String sName, String qName) {
		parseElement: {
			if (qName.equalsIgnoreCase(xmlHeaderTag)) {

				break parseElement;
			}

			if (qName.equalsIgnoreCase(xmlIdTag)) {

				break parseElement;
			}

			if (qName.equalsIgnoreCase(xmlBodyTag)) {
				// Object abspeichern
				break parseElement;
			}

			if (qName.equalsIgnoreCase(xmlSelectionTag)) {

				break parseElement;
			}

			if (qName.equalsIgnoreCase(xmlObjectTag)) {
				currentObject = masterObject;
				if (objFieldList != null) {
					int[] fieldList;
					if (objFieldList.size() > currentObject.getFieldSpecs().length) {
						fieldList = new int[currentObject.getFieldSpecs().length];
					} else {
						fieldList = new int[objFieldList.size()];
					}

					for (int fi = 0; fi < fieldList.length; fi++) {
						fieldList[fi] = objFieldList.get(fi).intValue();
					}
					currentObject.setFieldList(fieldList);
				}
				currentObject.setOneObjList(this.oneObjectsList);
				if (this.oneObjectsList != null) {
					logger.debug(" OneObject : "
							+ currentObject.getXmlClassTag()
							+ ", Anzahl OneObj: "
							+ currentObject.getOneObjList().size());
				}
				xmpSel.addToSelection(currentObject);
			}

			if (qName.equalsIgnoreCase(xmlOneObjectTag)) {
				if ((currentObject != null) && (oneObjFieldList != null)) {
					int[] fieldList = new int[oneObjFieldList.size()];
					for (int fi = 0; fi < oneObjFieldList.size(); fi++) {
						fieldList[fi] = oneObjFieldList.get(fi).intValue();
					}
					currentObject.setFieldList(fieldList);
					this.oneObjectsList.put(oneObjFkFeldNummer, currentObject);
				}

				currentObject = masterObject; // Wieder auf Master Object zurück
				oneObjOn = false;
				break parseElement;
			}

			if (qName.equalsIgnoreCase(xmlFieldTag)) {
				// Jetzt das Feld abspeichern
				if (currentFieldSpec != null) {
					logger.debug(" Field abspeichern : "
							+ currentFieldSpec.getFieldNumber() + ", "
							+ currentFieldSpec.getFieldName() + ", "
							+ currentFieldSpec.getFieldType() + " : \""
							+ currentTagContent + "\"");
					try {
						de.gammadata.tom.four_d_access.util.LocaleFormatter lc = new de.gammadata.tom.four_d_access.util.LocaleFormatter(
								Locale.GERMAN);
						setFeldWert(currentObject, currentObject.getClass(),
								currentFieldSpec.getFieldName(),
								currentTagContent,
								currentFieldSpec.getFieldType(), lc);
					} catch (Exception e) {
						logger.debug(
								" setFeldWert: Fehler beim Feld generieren: \n",
								e);
					}
				}

				break parseElement;
			}
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (length > 0)
			currentTagContent = currentTagContent
					+ new String(ch, start, length);
		// logger.debug(" Inhalt länge: "+length+": "+currentTagContent);
	}

	@Override
	public void error(SAXParseException e) throws SAXParseException {
		throw e;
	}

	public void setFeldWert(Object obj, Class objClass, String feldName,
			String feldInput, String feldTypInp, LocaleFormatter userLocale)
			throws Exception {
		try {
			String feldMethodeNameGetter = XmlBasics.genMethodName("get",
					feldName);
			String feldMethodeNameSetter = XmlBasics.genMethodName("set",
					feldName);
			Class[] params = new Class[0];
			Object[] getArgs = new Object[0];
			Method mGet = objClass.getMethod(feldMethodeNameGetter, params);
			Class[] retTypArray = { mGet.getReturnType() };

			if ((feldTypInp == null) || (feldTypInp.length() < 2))
				feldTypInp = mGet.getReturnType().toString();

			checkType: // auf Typen der Eingabe prüfen
			{
				if (feldTypInp.equalsIgnoreCase("int")) {
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray); // Anhand des return-types
					int intInput = userLocale.getIntFormat().parse(feldInput)
							.intValue();
					Object[] argList = { new Integer(intInput) };
					mSet.invoke(obj, argList);
					break checkType;
				}
				if (feldTypInp.equalsIgnoreCase("double")) {
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					double doubleInput = userLocale.getNumFormat()
							.parse(feldInput).doubleValue();
					Object[] argList = { new Double(doubleInput) };
					mSet.invoke(obj, argList);
					break checkType;
				}
				if (feldTypInp.equalsIgnoreCase("boolean")) {
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					Object[] argList = { new Boolean(feldInput) };
					mSet.invoke(obj, argList);
					break checkType;
				}
				if (feldTypInp.equalsIgnoreCase("java.util.GregorianCalendar")) {
					java.util.Date dateIn = userLocale.getDateFormat().parse(
							feldInput);

					if (mGet.invoke(obj, getArgs) != null) // Gibt es schon ein
															// CalenderObject
					{
						java.util.GregorianCalendar dateTime = (java.util.GregorianCalendar) mGet
								.invoke(obj, getArgs);
						dateTime.setTime(dateIn);
						// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: vorhanden, setze date");
					} else // Calendar Oblect noch nicht da
					{
						java.util.GregorianCalendar dateTime = new java.util.GregorianCalendar(
								userLocale.getLocale());
						dateTime.setTime(dateIn);
						Object[] argList = { dateTime };
						Method mSet = objClass.getMethod(feldMethodeNameSetter,
								retTypArray);
						mSet.invoke(obj, argList);
						// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: nicht vorhanden, neu setzen");
					}
					break checkType;
				}

				if (feldTypInp.equalsIgnoreCase("java.sql.Date")) {

					// java.util.Date heute = new java.util.Date();
					// String heuteTxt =
					// userLocale.getDateOnlyFormat().format(heute);
					logger.debug("[XmlParseRequest] setFeldWert java.sql.Date: "
							+ feldInput);
					java.sql.Date dateIn;
					if (feldInput.equalsIgnoreCase("00.00.00")) // Eine Art
																// null-Datum in
																// 4D
					{
						dateIn = new java.sql.Date(userLocale
								.getDateOnlyFormat().parse("01.01.0001")
								.getTime());
					} else {
						dateIn = new java.sql.Date(userLocale
								.getDateOnlyFormat().parse(feldInput).getTime());
					}
					Object[] argList = { dateIn };
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					mSet.invoke(obj, argList);
					// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: nicht vorhanden, neu setzen");

					break checkType;
				}

				if (feldTypInp.equalsIgnoreCase("java.sql.Time")) {
					java.sql.Time dateIn = java.sql.Time.valueOf(feldInput);
					Object[] argList = { dateIn };
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					mSet.invoke(obj, argList);
					// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: nicht vorhanden, neu setzen");

					break checkType;
				}

				if (feldTypInp.equalsIgnoreCase("java.lang.StringBuffer")) {

					String korrInput = feldInput.replace("\\u000d", "\n");
					java.lang.StringBuffer inputObj = new java.lang.StringBuffer(
							korrInput);
					Object[] argList = { inputObj };
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					mSet.invoke(obj, argList);
					// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: nicht vorhanden, neu setzen");

					break checkType;
				}

				if (feldTypInp.equalsIgnoreCase("java.lang.StringBuilder")) {
					String korrInput = feldInput.replace("\\u000d", "\n");
					java.lang.StringBuilder inputObj = new java.lang.StringBuilder(
							korrInput);
					Object[] argList = { inputObj };
					Method mSet = objClass.getMethod(feldMethodeNameSetter,
							retTypArray);
					mSet.invoke(obj, argList);
					// logger.debug("[XmlParseRequest] setFeldWert GregorianCalendar: nicht vorhanden, neu setzen");

					break checkType;
				}

				if (feldTypInp.equalsIgnoreCase("byte[]")) {
					break checkType;
				}

				// Defaultpfad == String
				// Defaultwerte
				Class[] feldTypArray = { Class.forName("java.lang.String") };
				Method mSet = objClass.getMethod(feldMethodeNameSetter,
						feldTypArray);
				Object[] argList = { feldInput };
				mSet.invoke(obj, argList);
			}

			// Ergebis ausgeben
			// logger.debug("[XmlParseRequest] setFeldWert - Feld: "+feldName+" - feldTypInp: "+feldTypInp+" -- Ergebnis: "+mGet.invoke(obj,getArgs).toString());
		} catch (Exception e) {
			logger.debug("[XmlParseRequest] setFeldWert: Fehler beim Feld generieren: "
					+ objClass.getName()
					+ " : "
					+ feldName
					+ " feldtype="
					+ feldTypInp + ", Message=" + e.getMessage());

		}
	}

	public static Xmp getXmpInstance(String tabelle) {
		Xmp currentObject;
		try {
			if ("Aufträge".equalsIgnoreCase(tabelle)) {
				currentObject = new Auftraege();
			} else if ("Länder".equalsIgnoreCase(tabelle)) {
				currentObject = new Laender();
			} else if ("Steuersätze".equalsIgnoreCase(tabelle)) {
				currentObject = new Steuersaetze();
			} else if ("Räume".equalsIgnoreCase(tabelle)) {
				currentObject = new Raeume();
			} else if ("RegisterMenüs".equalsIgnoreCase(tabelle)) {
				currentObject = new RegisterMenues();
			} else if ("SteuerBeträge".equalsIgnoreCase(tabelle)) {
				currentObject = new SteuerBetraege();
			} else if ("Währungen".equalsIgnoreCase(tabelle)) {
				currentObject = new Waehrungen();
			} else {
				currentObject = (Xmp) Class.forName(
						dbBeansPackageName + "." + tabelle).newInstance();
			}

		} catch (Exception e) {
			currentObject = null;
			logger.error(" xmlObjectTag Fehler beim Erzeugen Object: "
					+ dbBeansPackageName + "." + tabelle, e);
		}

		return currentObject;
	}

	public XmpSelection getXmpSelection() {
		return xmpSel;
	}

	public int[] getNextDidList() {
		return nextDidList;
	}
}
