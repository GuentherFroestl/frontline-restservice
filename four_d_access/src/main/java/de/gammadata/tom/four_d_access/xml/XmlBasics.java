/*
 * XmlBasics.java
 *
 * Created on 9. November 2004, 10:49
 *Stellt statische Basisroutinen für die XML Ausgabe zur Verfügung
 */

package de.gammadata.tom.four_d_access.xml;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.gammadata.tom.four_d_access.dataBase.DbStruktur;
import de.gammadata.tom.four_d_access.dataBase.Kommando;
import de.gammadata.tom.four_d_access.dataBase.KommandoKontext;
import de.gammadata.tom.four_d_access.dataBase.RegisterFilter;
import de.gammadata.tom.four_d_access.dataBase.RegisterView;
import de.gammadata.tom.four_d_access.util.LocaleFormatter;

/**
 * 
 * @author gfr
 */
public class XmlBasics {

	private static Logger logger = Logger.getLogger(XmlBasics.class);

	public static final String tagAuf = "<";
	public static final String tagZu = ">";
	public static final String xmlNewLine = "\n";
	public static final String tagZuNewLine = ">\n";
	public static final String tagZuEnde = "/>";
	public static final String tagZuEndeNewLine = "/>\n";
	public static final String tagAufEnde = "</";
	public static final String attrClass = "class";
	public static final String attrName = "name";
	public static final String attrBez = "bez";
	public static final String attrNummer = "nummer";
	public static final String attrfldnum = "fldnum";
	public static final String attrScope = "scope";
	public static final String attrCode = "code";
	public static final String attrShortClassName = "short";
	public static final String attrMaxlength = "maxlength";
	public static final String attrType = "type";
	public static final String attrDid = "did";
	public static final String attrMode = "mode";
	public static final String attrInputModus = "inputmodus";
	public static final String typeText = "text";
	public static final String typeBoolean = "boolean";
	public static final String typeOneObject = "oneobj";
	public static final String typeNullObject = "nullobj";

	public static final String attrStatus = "status";
	public static final String statusTrue = "ja";
	public static final String statusFalse = "nein";

	// Div 4D tab Xml Werte
	public static final String xmlIsoHeader = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n";

	public static final String op4dStucture = "op4dStructure";
	public static final String op4dTabTag = "op4dTab";
	public static final String op4dTabNameAttr = "tabname";
	public static final String op4dTabNumAttr = "tabnumber";
	public static final String op4dFieldTag = "op4dField";
	public static final String op4dFieldNumberAttr = "fieldnumber";
	public static final String op4dFieldTypeAttr = "fieldtype";
	public static final String op4dFieldJavaTypeAttr = "javatype";
	public static final String op4dFieldTypeNummerAttr = "typenummer";
	public static final String op4dFieldAlphaLenAttr = "alphalength";
	public static final String op4dFieldAttributesAttr = "fieldattributes";
	public static final String op4dFieldIndexNumberAttr = "indexed";
	public static final String op4dFieldJavaFieldNameAttr = "javafieldname";
	public static final String op4dFieldJavaGetterAttr = "javagetter";
	public static final String op4dFieldJavaSetterAttr = "javasetter";
	public static final String op4dFieldOneObjAttr = "oneobjectpointer";
	public static final String op4dFieldValueTrue = "true";
	public static final String op4dFieldValueFalse = "false";

	public static final String op4dFieldOneObjTableName = "oneobjecttablename";
	public static final String op4dFieldOneObjTableNumber = "oneobjecttablenumber";
	public static final String op4dFieldOneObjIndexFieldName = "oneobjectindexfieldname";
	public static final String op4dFieldOneObjIndexFieldNumber = "oneobjectindexfieldnumber";

	// ControllerTags und Atrributes

	// IFs
	public static final String ifTag = "if";
	public static final String elseTag = "else";
	public static final String endifTag = "endif";
	public static final String fieldAttr = "field";
	public static final String valueAttr = "value";

	public static final String controllerContent = "controllergencontent";
	public static final String controllerTag = "controller";
	public static final String controllerKommando = "kommando";
	public static final String controllerKontext = "kontext";
	public static final String controllerObjectScope = "object_scope";// Requestparameter
																		// für
																		// die
																		// Objekt
																		// Scope
	public static final String controllerObjectClass = "object_class"; // Requestparameter
																		// für
																		// die
																		// Objekt
																		// Klasse
	public static final String controllerObjectName = "object_name";
	public static final String controllerObjectMode = "mode";
	public static final String controllerObjectDid = "did";

	public static final String controllerSelectionScope = "selection_scope";
	public static final String controllerSelectionName = "selection_name";

	public static final String controllerCmdClass = "cmd_class"; // Requestparameter
																	// für die
																	// Kommando
																	// Klasse
	public static final String controllerCmdScope = "cmd_scope"; // Requestparameter
																	// für die
																	// Kommando
																	// Scope
	public static final String controllerCmdName = "cmd_name"; // Requestparameter
																// für die
																// Kommando
																// Scope

	public static final String controllerRegViewScope = "registerview_scope"; // Requestparameter
																				// für
																				// die
																				// Kommando
																				// Scope
	public static final String controllerRegViewName = "registerview_name"; // Requestparameter
																			// für
																			// die
																			// Kommando
																			// Scope

	public static final String controllerObjectType = "type_";
	public static final String controllerOneObjectType = "oneobj_";
	public static final String controllerSelectedDids = "selection_did";
	public static final String controllerObjectFelder = "object_felder";
	public static final String controllerObjectIncludedObjects = "object_include";
	public static final String controllerObjectScopeSession = "session";
	public static final String controllerObjectScopeRequest = "request";
	public static final String controllerObjectScopeHandler = "handler";
	public static final String controllerObjectScopeProzess = "process";
	public static final String controllerObjectId = "object_id";
	public static final String controllerFileName = "file";
	public static final String controllerContentType = "contenttype";

	public static final String controllerHandlerName = "handler_name";
	public static final String controllerHandlerScope = "handler_scope";
	public static final String controllerHandlerClass = "handler_class";

	public static final String controllerListTag = "list";

	// div Kommandos

	public static final String controllerCmdObjectPut = "object_put";
	public static final String controllerManagedObjectPut = "managed_object_put";
	public static final String controllerManagedSelectionPut = "managed_selection_put";
	public static final String controllerPutSelection = "selection_put";
	public static final String controllerRegisterView = "register_view";
	public static final String controllerCmdXmlCmdPut = "xmlcmd_put";
	public static final String controllerCmdStandardHandlerPut = "standardhandler_put";
	public static final String controllerCmdStylesheet = "use_stylesheet";

	// Tags und Attribute für REgister / FieldList
	public static final String xmpRegisterTag = "register";
	public static final String xmpFieldListTag = "fieldlist";
	public static final String xmpListFieldTag = "listfield";

	public static final String xmpNummerAttr = "nummer";
	public static final String xmpSidAttr = "sid";
	public static final String xmpNameAttr = "name";
	public static final String xmpTargetAttr = "target";
	public static final String xmpRegTabNummerAttr = "regtabnummer";
	public static final String xmpRegTabNameAttr = "regtabname";

	public static final String xmpRegisterViewTag = "registerview";
	public static final String xmpViewNameAttr = "view_name";
	public static final String xmpViewScopeAttr = "view_scope";
	public static final String xmpViewFilterNummer = "filternummer";
	public static final String xmpTagRegisterFilterListe = "regfilterlist";
	public static final String xmpTagRegisterFilter = "regfilter";

	public static final String xmpKommandoListeTag = "kommandoListe";
	public static final String xmpKontextTag = "kontext";
	public static final String xmpKommandoTag = "kommando";
	public static final String xmpCodeAttr = "code";
	public static final String xmpTextAttr = "text";
	public static final String xmpTypeAttr = "type";
	public static final String xmpImageAttr = "imagetag";

	public static final String xmpListRegisterTag = "listreg";
	public static final String xmpRegNummerAttr = "regnummer";
	public static final String xmpListRegNameAttr = "listregname";

	public static final String xmpTagOneObjList = "oneobjlist";

	public static String javaClassPreFix = "class ";

	// Sessionwerte
	public static final String sessionTag = "sessionvalues";
	public static final String sessionId = "id";
	public static final String sessionLink = "sessionlink";
	public static final String requestContext = "requestcontext";
	public static final String requestFile = "requestfile";
	public static final String requestUri = "requesturi";
	public static final String requestQuery = "requestquery";

	// Diverse AusgabeModi

	public static final int modeHeader = 10;
	public static final int modeShort = 20;
	public static final int modeMedium = 30;
	public static final int modeAll = 40;

	// StringCleaner

	private static Pattern falscheZeichen = Pattern
			.compile("\\x00|\\x01|\\x02|\\x03|\\x04|\\x05|\\x06|\\x07|\\x08|\\x0B|\\x0C |\\x0E |\\x0F|\\x10|\\x11|\\x12|\\x13|\\x14|\\x15|\\x16|\\x17|\\x18|\\x19|\\x1A|\\x1B|\\x1C|\\x1D|\\x1E|\\x1F");

	private static boolean printon = false;
	private static boolean errorOn = true;

	/** Creates a new instance of XmlBasics */
	private XmlBasics() {
	}

	public static StringBuffer genXmlOut(Xmp obj, int mode, String objName,
			String objScope) {
		LocaleFormatter userLocale = new LocaleFormatter(Locale.getDefault());
		return genXmlOut(obj, mode, objName, objScope, userLocale);
	}

	public static StringBuffer genXmlOut(Xmp obj, int mode, String objName,
			String objScope, LocaleFormatter userLocale) {
		int[] fieldList = obj.getFieldList();
		return genXmlOut(obj, fieldList, objName, objScope, userLocale);
	}

	public static StringBuffer genXmlOut(Xmp obj, String objName,
			String objScope, LocaleFormatter userLocale) {
		int[] fieldList = obj.getFieldList();
		return genXmlOut(obj, fieldList, objName, objScope, userLocale);
	}

	public static StringBuffer genXmlOut(Xmp obj, int[] fieldList,
			String objName, String objScope, LocaleFormatter userLocale) {

		StringBuffer sb = new StringBuffer();
		Class cl = obj.getClass();
		Object[] params = {};
		Class[] mParams = {};
		Method m;
		String xmlTag;
		String returnType;
		String xmlObjektClassName = obj.getClass().getName();
		if (fieldList == null) {
			logger.debug("[XmlBasics] genXmlOut Fehler no FieldList object: "
					+ xmlObjektClassName);
		}
		// Start Tag
		// sb.append(XmlBasics.genXmlStartObjektTag(obj.getXmlClassTag(),
		// xmlObjektClassName, objName));
		sb.append(XmlBasics.genXmlStartObjektTag(obj, objName, objScope));
		sb.append(XmlBasics.newLine());

		// Felder ausgeben
		sb.append(genXmlStartTag(controllerObjectFelder));
		sb.append(XmlBasics.newLine());
		FieldSpec[] fieldSpecList = obj.getFieldSpecs();
		for (int i = 0; i < fieldList.length; i++) {
			// sb.append(i+": "+felder[i]+" - ");
			FieldSpec fSpec = fieldSpecList[fieldList[i] - 1];
			String fieldName = fSpec.getFieldName();
			String mName = genMethodName("get", fieldName);
			String objString = "";
			// sb.append(mName+" :  ");
			try {
				m = cl.getMethod(mName, mParams);
				returnType = m.getReturnType().toString();

				// Behandlung der Formattierten Ausgabe, je nach returnType
				checkType: {
					if (returnType.equalsIgnoreCase("short")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("int")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						logger.debug("[XmlBasics] genXmlOut: Format Int/number: "
								+ objString);
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("long")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("float")) {
						objString = userLocale.formatNumber((Number) m.invoke(
								obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug("[XmlBasics] genXmlOut: Format float/number: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("double")) {
						objString = userLocale.formatNumber((Number) m.invoke(
								obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug("[XmlBasics] genXmlOut: Format float/number: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("boolean")) {
						objString = m.invoke(obj, params).toString();
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.util.GregorianCalendar")) {
						objString = userLocale
								.formatDate((java.util.GregorianCalendar) m
										.invoke(obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug("[XmlBasics] genXmlOut: Format GregorianCalendar: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Date")) {
						logger.debug("[XmlBasics] genXmlOut: Format java.sql.Date: ");
						// objString =
						// userLocale.getDateOnlyFormat().format((java.sql.Date)m.invoke(obj,params));
						objString = userLocale.formatSqlDate((java.sql.Date) m
								.invoke(obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug(objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Timestamp")) {
						logger.debug("[XmlBasics] genXmlOut: Format java.sql.Timestamp: ");
						// objString =
						// userLocale.getDateOnlyFormat().format((java.sql.Date)m.invoke(obj,params));
						objString = userLocale
								.formatSqlDate((java.sql.Timestamp) m.invoke(
										obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug(objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Time")) {
						logger.debug("[XmlBasics] genXmlOut: Format java.sql.Time: ");
						// objString =
						// userLocale.getTimeOnlyFormat().format((java.sql.Time)m.invoke(obj,params));
						objString = userLocale.formatSqlTime((java.sql.Time) m
								.invoke(obj, params));
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						logger.debug(objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.lang.String")) {
						objString = (String) m.invoke(obj, params);

						if ((objString != null) && (objString.length() > 0)) {
							if (fSpec.getFieldType().equalsIgnoreCase(
									"de.gammadata.tom.four_d_access.util.XmlCode")) {
								sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
										objString, returnType, userLocale));
							} else {
								objString = "<![CDATA["
										+ falscheZeichen.matcher(objString)
												.replaceAll(" ") + "]]>";
								sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
										objString, returnType, userLocale));
							}
						} else {
							sb.append(XmlBasics.genXmlFeldTag(obj, fSpec, "",
									returnType, userLocale));
						}
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.XmlCode")) {
						objString = m.invoke(obj, params).toString();
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.HtmlCode")) {
						objString = m.invoke(obj, params).toString();
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));
						break checkType;
					}
					if ((returnType
							.equalsIgnoreCase("class java.lang.StringBuffer"))
							| (returnType
									.equalsIgnoreCase("class java.lang.StringBuilder"))) {
						objString = m.invoke(obj, params).toString();
						if (fSpec.getFieldType().equalsIgnoreCase(
								"de.gammadata.tom.four_d_access.util.XmlCode")) {
							sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
									objString, returnType, userLocale));
						} else {
							objString = falscheZeichen.matcher(
									m.invoke(obj, params).toString())
									.replaceAll(" ");
							sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
									"<![CDATA[" + objString + "]]>",
									returnType, userLocale));
							// Jetzt noch das Feld zusätzlich im X-HTML Format
							// ausgeben
							sb.append(XmlBasics.genXmlEncodedFeldTag(obj,
									"_xml", fSpec, objString, "xmlcopy",
									userLocale));
						}
						break checkType;
					}
					if (returnType.equalsIgnoreCase("interface java.sql.Blob")) {
						java.sql.Blob objBlob = (java.sql.Blob) m.invoke(obj,
								params);
						objString = new String(objBlob.getBytes(1,
								(int) objBlob.length()), "UTF-8");
						objString = "<![CDATA["
								+ falscheZeichen.matcher(objString).replaceAll(
										" ") + "]]>";
						sb.append(XmlBasics.genXmlFeldTag(obj, fSpec,
								objString, returnType, userLocale));

						break checkType;
					}

					// default Zweig

					objString = falscheZeichen.matcher(
							m.invoke(obj, params).toString()).replaceAll(" ");
					sb.append(XmlBasics.genXmlFeldTag(obj, fSpec, objString,
							returnType, userLocale));
					logger.debug("[XmlBasics] genXmlOut: return Type: "
							+ returnType + ", name;" + m.getName()
							+ ", ergebnis: " + objString);
				}

				// sb.append(m.invoke(obj,params).toString()); // Feldinhalt
				// sb.append(" Type: "+m.getReturnType().toString());

				// Methode gefunden

				sb.append(XmlBasics.newLine());
			} catch (Exception e) {
				logger.debug("[XmlBasics] genXmlOut: " + xmlObjektClassName
						+ "." + mName + " Fehler bei generischer methode!!\n",
						e);
			}
			// sb.append("\n");
		}

		// Ende Felder
		sb.append(genXmlEndeTag(controllerObjectFelder));
		sb.append(XmlBasics.newLine());

		// Auf OneObjects Prüfen
		if ((obj.getOneObjList() != null) && (obj.getOneObjList().size() > 0)) {
			logger.debug("[XmlBasics] genXmlOut: OneObjListe bei Obj: "
					+ obj.getXmlClassTag());
			sb.append(genXmlStartTag(xmpTagOneObjList));
			sb.append(XmlBasics.newLine());
			java.util.HashMap<java.lang.Integer, de.gammadata.tom.four_d_access.xml.Xmp> oneObjList = obj
					.getOneObjList();
			Xmp oneObj;
			Integer key;
			for (Iterator it = oneObjList.keySet().iterator(); it.hasNext();) {
				key = (Integer) it.next();
				oneObj = oneObjList.get(key);
				if (oneObj != null) {
					String fieldName = "";
					try {
						FieldSpec fSpec = fieldSpecList[key - 1];
						fieldName = fSpec.getFieldName();
					} catch (Exception e) {
					}
					String oneobjName = "feld_" + Integer.toString(key)
							+ "_oneobj";

					logger.debug("[XmlBasics] genXmlOut: OneObj: "
							+ oneObj.getXmlClassTag() + " Did: "
							+ oneObj.getDID());
					logger.debug("[XmlBasics] genXmlOut: OneObj Anz Felder: "
							+ oneObj.getFieldList().length);
					sb.append("<" + oneobjName + " feldname=\"" + fieldName
							+ "\"" + ">" + XmlBasics.newLine());
					sb.append(genXmlOut(oneObj, oneObj.getFieldList(),
							Integer.toString(key), "oneobjlist", userLocale));
					sb.append(XmlBasics.genXmlEndeTag(oneobjName));
					sb.append(XmlBasics.newLine());
				}
			}
			sb.append(XmlBasics.genXmlEndeTag(xmpTagOneObjList));
			sb.append(XmlBasics.newLine());
		}

		sb.append(XmlBasics.genXmlEndeTag(obj.getXmlClassTag()));
		sb.append(XmlBasics.newLine());

		return sb;
	}

	public static StringBuffer genXmlOut(XmpSelection selection, String mode,
			String objName, String objScope, LocaleFormatter userLocale)

	{

		StringBuffer sb = new StringBuffer();
		int count = selection.getListSize();

		sb.append("<selection name=\"" + objName + "\" scope=\"" + objScope
				+ "\" listsize=\"" + count + "\"" + " firstrecordnumber=\""
				+ selection.getFirstDisplayedRecNr() + "\""
				+ " lastrecordnumber=\"" + selection.getLastDisplayedRecNr()
				+ "\"" + " nextfirstrecordnumber=\""
				+ selection.getNextFirstDisplayedRecNr() + "\""
				+ " nextlastrecordnumber=\""
				+ selection.getNextLastDisplayedRecNr() + "\""
				+ " recordsinselection=\"" + selection.getRecordsInDbSelecton()
				+ "\"" + " islastdisplayed=\"" + selection.isLastRecDisplayed()
				+ "\"" + " isfirstdisplayed=\""
				+ selection.isFirstRecDisplayed() + "\"" + ">");

		if (count > 0) {
			for (ListIterator iter = selection.getSelection().listIterator(); iter
					.hasNext();) {
				try {
					Xmp obj = (Xmp) iter.next();
					logger.debug("[XmlBasics] genXmlOut/Selection  Object: "
							+ obj);
					sb.append(genXmlOut(obj, XmlBasics.modeAll, objName,
							objScope, userLocale));
				} catch (Exception e) {
					logger.debug("[XmlBasics] genXmlOut/Selection: " + objName
							+ " Fehler bei Object aus Liste holen\n" + e);
				}
			}
		}
		sb.append("</selection>");
		sb.append(XmlBasics.newLine());
		return sb;
	}

	public static StringBuffer genXmlOut(XmpSelection selection,
			String objName, String objScope, LocaleFormatter userLocale) {
		int[] fieldList = null;
		if ((selection != null) && (selection.getListSize() > 0)) {
			Xmp fobj = selection.getSelection().get(0);
			if (fobj != null) {
				fieldList = fobj.getFieldList();
			}
		}
		return XmlBasics.genXmlOut(selection, fieldList, objName, objScope,
				userLocale);

	}

	public static StringBuffer genXmlOut(XmpSelection selection,
			int[] fieldList, String objName, String objScope,
			LocaleFormatter userLocale)

	{
		StringBuffer sb = new StringBuffer();
		if (selection != null) {
			int count = selection.getListSize();

			sb.append("<selection name=\"" + objName + "\" scope=\"" + objScope
					+ "\" listsize=\"" + count + "\"" + " firstrecordnumber=\""
					+ selection.getFirstDisplayedRecNr() + "\""
					+ " lastrecordnumber=\""
					+ selection.getLastDisplayedRecNr() + "\""
					+ " nextfirstrecordnumber=\""
					+ selection.getNextFirstDisplayedRecNr() + "\""
					+ " nextlastrecordnumber=\""
					+ selection.getNextLastDisplayedRecNr() + "\""
					+ " recordsinselection=\""
					+ selection.getRecordsInDbSelecton() + "\""
					+ " islastdisplayed=\"" + selection.isLastRecDisplayed()
					+ "\"" + " isfirstdisplayed=\""
					+ selection.isFirstRecDisplayed() + "\"" + ">");

			if (count > 0) {
				for (ListIterator iter = selection.getSelection()
						.listIterator(); iter.hasNext();) {
					try {
						Xmp obj = (Xmp) iter.next();
						logger.debug("[XmlBasics] genXmlOut/Selection  Object: "
								+ obj);
						sb.append(genXmlOut(obj, fieldList, objName, objScope,
								userLocale));
					} catch (Exception e) {
						logger.debug("[XmlBasics] genXmlOut/Selection: "
								+ objName
								+ " Fehler bei Object aus Liste holen\n" + e);
					}
				}
			}
			sb.append("</selection>");
			sb.append(XmlBasics.newLine());
		}
		return sb;
	}

	public static StringBuffer genXmlOut(RegisterView regView, String viewName,
			String viewScope, XmpSelection selection, String objName,
			String objScope, LocaleFormatter userLocale)

	{

		StringBuffer sb = new StringBuffer();
		if (regView != null) {
			int filterSelected;
			// StartTag RegView
			sb.append(tagAuf + xmpRegisterViewTag
					+ genAttribute(xmpViewNameAttr, viewName)
					+ genAttribute(xmpViewScopeAttr, viewScope) + tagZuNewLine);

			// Ausgabe der KommandoListe
			sb.append(genXmlStartTag(xmpKommandoListeTag + xmlNewLine));
			sb.append(genXmlKommandoliste(regView.getKommandoKontextList(),
					viewName));
			sb.append(genXmlEndeTag(xmpKommandoListeTag + xmlNewLine));
			/*
			 * sb.append(genXmlStartTag(xmpKommandoListeTag+xmlNewLine)); if
			 * ((regView
			 * .getKommandoKontextList()!=null)&&(regView.getKommandoKontextList
			 * ().size()>0)) { KommandoKontext ktxList; ArrayList<Kommando>
			 * kmdList; Kommando kmd; for(int
			 * ktxNr=0;ktxNr<regView.getKommandoKontextList().size();ktxNr++) {
			 * ktxList=regView.getKommandoKontextList().get(ktxNr); if
			 * (ktxList!=null) { sb.append(tagAuf +xmpKontextTag
			 * +genAttribute(xmpNameAttr,ktxList.getName()+viewName)
			 * +genAttribute(xmpCodeAttr,ktxList.getCode())
			 * +genAttribute(xmpTypeAttr,ktxList.getType())
			 * +genAttribute(xmpTextAttr,ktxList.getBezeichnung())
			 * +genAttribute(xmpImageAttr,ktxList.getImageTag()) +tagZuNewLine);
			 * kmdList=ktxList.getKommandoList(); if
			 * ((kmdList!=null)&&(kmdList.size()>0)) { for(int
			 * kmdNr=0;kmdNr<kmdList.size();kmdNr++) { kmd=kmdList.get(kmdNr);
			 * 
			 * sb.append(tagAuf +xmpKommandoTag
			 * +genAttribute(xmpNameAttr,kmd.getName())
			 * +genAttribute(xmpCodeAttr,kmd.getCode())
			 * +genAttribute(xmpTextAttr,kmd.getBezeichnung())
			 * +tagZuEndeNewLine); } }
			 * 
			 * 
			 * sb.append(genXmlEndeTag(xmpKontextTag+xmlNewLine)); } } }
			 * sb.append(genXmlEndeTag(xmpKommandoListeTag+xmlNewLine));
			 */

			// StartTag ListRegister
			sb.append(tagAuf
					+ xmpListRegisterTag
					+ genAttribute(xmpListRegNameAttr, regView.getRegister()
							.getName())
					+ genAttribute(xmpRegNummerAttr,
							Integer.toString(regView.getRegister().getNummer()))
					+ tagZuNewLine);

			// RegisterFilterListen
			if ((regView.getFilterGruppenListe() != null)
					&& regView.getFilterGruppenListe().size() > 0) {
				int anzFilterGruppen = regView.getFilterGruppenListe().size();
				for (int f = 0; f < anzFilterGruppen; f++) {
					if ((regView.getFilterGruppenListe().get(f) != null)
							&& (regView.getFilterGruppenListe().get(f)
									.getFilterListe() != null)) {
						filterSelected = regView.getFilterGruppenListe().get(f)
								.getSelectedFilterNummer();
						ArrayList<RegisterFilter> filterListe = regView
								.getFilterGruppenListe().get(f)
								.getFilterListe();
						sb.append(tagAuf
								+ xmpTagRegisterFilterListe
								+ genAttribute(attrNummer, Integer.toString(f))
								+ genAttribute("selectedfilter",
										Integer.toString(filterSelected))
								+ tagZuNewLine);
						String sel = "";
						for (int i = 0; i < filterListe.size(); i++) {
							if (filterSelected == i)
								sel = "selected";
							else
								sel = "";

							sb.append(tagAuf
									+ xmpTagRegisterFilter
									+ genAttribute(
											attrNummer,
											Integer.toString(f) + "-"
													+ Integer.toString(i))
									+ genAttribute(attrBez, filterListe.get(i)
											.getFilterBez())
									+ genAttribute("selected", sel)
									+ tagZuEndeNewLine);
						}
						sb.append(tagAufEnde + xmpTagRegisterFilterListe
								+ tagZuNewLine);

					}
				}
			}

			sb.append(tagAufEnde + xmpListRegisterTag + tagZuNewLine);

			int[] fieldList = regView.getRegister().getIntFieldList();
			int spaltenAnz = fieldList.length;
			// Listenüberschriften erzeugen
			try {
				Xmp regObj = (Xmp) regView.getRegister().getContentClass()
						.newInstance();
				FieldSpec fSpec;
				int listSize = 0;
				if (selection != null)
					listSize = selection.getListSize();

				sb.append(tagAuf
						+ "listheader"
						+ genParameter(attrClass, regObj.getClass().getName())
						+ genParameter(attrShortClassName,
								regObj.getXmlClassTag())
						+ genAttribute("rows", Integer.toString(listSize))
						+ genAttribute("columns", Integer.toString(spaltenAnz))
						+ tagZuNewLine);

				for (int i = 0; i < spaltenAnz; i++) {
					fSpec = regObj.getFieldSpecs()[fieldList[i] - 1];
					sb.append(tagAuf
							+ "columnheader"
							+ genParameter(attrShortClassName,
									fSpec.getFieldName())
							+ genParameter(attrName, regObj.getClass()
									.getName() + "." + fSpec.getFieldName())
							+ genParameter(attrfldnum,
									Integer.toString(fSpec.getFieldNumber()))
							+ genParameter(attrBez, DbStruktur.getFeldName(
									regObj, fSpec, userLocale))
							+ genParameter(attrType,
									encodeTypBez(fSpec.getFieldType()))
							+ tagZuEndeNewLine);
				}
				sb.append(tagAufEnde + "listheader" + tagZuNewLine);

			} catch (Exception e) {
				logger.debug("[XmlBasics]genXmlOut(RegisterView) Fehler beim Erzeugen Object Class: "
						+ regView.getRegister().getContentClassName());
			}

			sb.append(genXmlOut(selection, fieldList, objName, objScope,
					userLocale));
			sb.append(tagAufEnde + xmpRegisterViewTag + tagZuNewLine);
		}
		return sb;
	}

	public static StringBuilder genXmlKommandoliste(
			ArrayList<KommandoKontext> kontextList, String nameApx) {
		StringBuilder sb = new StringBuilder();

		if ((kontextList != null) && (kontextList.size() > 0)) {
			KommandoKontext ktxList;
			ArrayList<Kommando> kmdList;
			Kommando kmd;
			for (int ktxNr = 0; ktxNr < kontextList.size(); ktxNr++) {
				ktxList = kontextList.get(ktxNr);
				if (ktxList != null) {
					sb.append(tagAuf
							+ xmpKontextTag
							+ genAttribute(xmpNameAttr, ktxList.getName()
									+ nameApx)
							+ genAttribute(xmpCodeAttr, ktxList.getCode())
							+ genAttribute(xmpTypeAttr, ktxList.getType())
							+ genAttribute(xmpTextAttr,
									ktxList.getBezeichnung())
							+ genAttribute(xmpImageAttr, ktxList.getImageTag())
							+ tagZuNewLine);
					kmdList = ktxList.getKommandoList();
					if ((kmdList != null) && (kmdList.size() > 0)) {
						for (int kmdNr = 0; kmdNr < kmdList.size(); kmdNr++) {
							kmd = kmdList.get(kmdNr);

							sb.append(tagAuf
									+ xmpKommandoTag
									+ genAttribute(xmpNameAttr, kmd.getName())
									+ genAttribute(xmpCodeAttr, kmd.getCode())
									+ genAttribute(xmpTextAttr,
											kmd.getBezeichnung())
									+ genAttribute(xmpTargetAttr,
											kmd.getTarget()) + tagZuEndeNewLine);
						}
					}

					sb.append(genXmlEndeTag(xmpKontextTag + xmlNewLine));
				}
			}
		}

		return sb;

	}

	public static String genMethodName(String prefix, String feldName) {
		// Setter/Getter des feldes bilden
		char[] temp = feldName.toCharArray();
		temp[0] = Character.toUpperCase(temp[0]);
		String feldMethodeName = prefix + new String(temp);
		return feldMethodeName;

	}

	public static String genXmlStartTag(String tag) {
		return (tagAuf + tag + tagZu);
	}

	public static String genXmlEndeTag(String tag) {
		return (tagAufEnde + tag + tagZu);
	}

	public static String genXmlTagAllg(String tag, String[] attr,
			String[] values, boolean zu) {
		StringBuffer sb = new StringBuffer();

		sb.append(tagAuf + tag + " ");

		for (int i = 0; i < attr.length; i++) {
			if (values.length <= i) {
				sb.append(attr[i] + "=\"\" ");
			} else {
				sb.append(attr[i] + "=\"" + values[i] + "\" ");
			}
		}
		if (zu)
			sb.append(" />");
		else
			sb.append(" >");

		return sb.toString();

	}

	public static String genAttribute(String attr, String value) {
		return (" " + attr + "=\"" + value + "\" ");
	}

	public static String genXmlStartObjektTag(String tag, String className,
			String objName, String objScope) {
		return (tagAuf + tag + " " + attrClass + "=\"" + className + "\" "
				+ attrName + "=\"" + objName + "\" " + attrScope + "=\""
				+ objScope + "\"" + tagZu);
	}

	public static String genXmlStartObjektTag(Xmp obj, String objName,
			String objScope) {
		// if(obj instanceof XmpHandler)
		// {
		//
		// XmpHandler xcmd=(XmpHandler)obj;
		// return (tagAuf
		// +obj.getXmlClassTag()
		// +" "+attrClass+"=\""+obj.getClass().getName()
		// +"\" "+attrShortClassName+"=\""+obj.getXmlClassTag()+"\" "
		// +attrName+"=\""+objName+"\" "
		// +attrScope+"=\""+objScope+"\" "
		// +attrDid+"=\""+obj.getDID()+"\" "
		// +attrMode+"=\""+xcmd.getModus()+"\" "
		// +attrInputModus+"=\""+Boolean.toString(obj.isInputModus())+"\""
		// +tagZu);
		//
		// }
		// else
		// {
		return (tagAuf + obj.getXmlClassTag() + " " + attrClass + "=\""
				+ obj.getClass().getName() + "\" " + attrShortClassName + "=\""
				+ obj.getXmlClassTag() + "\" " + attrName + "=\"" + objName
				+ "\" " + attrScope + "=\"" + objScope + "\" " + attrDid
				+ "=\"" + obj.getDID() + "\" " + attrInputModus + "=\""
				+ Boolean.toString(obj.isInputModus()) + "\"" + tagZu);
		// }
	}

	public static String genXmlCmdListTag(String tag, String objName) {
		return (tagAuf + tag + " " + attrCode + "=\"" + objName + "\"" + tagZuEnde);
	}

	public static String genXmlTagAuf(String tag) {
		return (tagAuf + tag);
	}

	public static String genXmlTagZu() {
		return (tagZu);
	}

	public static String genXmlFeldTag(Xmp obj, FieldSpec fSpec,
			String content, String typ, LocaleFormatter userLocale) {
		String xmlObjektClassName = obj.getClass().getName();
		String feldName = fSpec.getFieldName();
		String maxLengthTxt = genParameter(attrMaxlength,
				Integer.toString(1000));
		if (fSpec.getAlphaLength() > 0) {
			maxLengthTxt = genParameter(attrMaxlength,
					Integer.toString(fSpec.getAlphaLength()));
		}
		return genXmlTagAuf(feldName)
				+ genParameter(attrName, xmlObjektClassName + "." + feldName)
				+ genParameter(attrfldnum,
						Integer.toString(fSpec.getFieldNumber()))
				+ genParameter(attrBez,
						DbStruktur.getFeldName(obj, fSpec, userLocale))
				+ genParameter(attrType, encodeTypBez(typ)) + maxLengthTxt
				+ tagZu + content + genXmlEndeTag(feldName);
	}

	public static String genXmlEncodedFeldTag(Xmp obj, String appendix,
			FieldSpec fSpec, String content, String typ,
			LocaleFormatter userLocale) {
		String xmlObjektClassName = obj.getClass().getName();
		String feldName = fSpec.getFieldName();
		String maxLengthTxt = genParameter(attrMaxlength,
				Integer.toString(1000));
		if (fSpec.getAlphaLength() > 0) {
			maxLengthTxt = genParameter(attrMaxlength,
					Integer.toString(fSpec.getAlphaLength()));
		}

		// String result= encodeTextToXml(content);
		// result = content.replaceAll("&", "&amp;");
		// result = result.replaceAll("<", "&lt;");
		// result = result.replaceAll(">", "&gt;");
		// result = result.replaceAll("\"", "&quot;");
		// result = result.replaceAll("\n", "<br/>");
		// result = result.replaceAll("  ", "<dspace/>");
		return genXmlTagAuf(feldName + appendix)
				+ genParameter(attrName, xmlObjektClassName + "." + feldName)
				+ genParameter(attrfldnum,
						Integer.toString(fSpec.getFieldNumber()))
				+ genParameter(attrBez,
						DbStruktur.getFeldName(obj, fSpec, userLocale))
				+ genParameter(attrType, encodeTypBez(typ)) + maxLengthTxt
				+ tagZu + encodeTextToXml(content)
				+ genXmlEndeTag(feldName + appendix);
	}

	public static String newLine() {
		return "\n";
	}

	public static String encodeTextToXml(String content) {
		String result;
		result = content.replaceAll("&", "&amp;");
		result = result.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		result = result.replaceAll("\"", "&quot;");
		result = result.replaceAll("\n", "<br/>");
		result = result.replaceAll("  ", "<dspace/>");

		return result;
	}

	public static String encodeString(String s) {
		String result = s.replaceAll("&", "&amp;");
		result = result.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		result = result.replaceAll("'", "&apos;");
		result = result.replaceAll("\"", "&aquot;");

		return result;
	}

	public static String encodeTypBez(String type) {
		return type.replace(' ', '_');
	}

	public static String genParameter(String name, String wert) {
		return " " + name + "=\"" + encodeString(wert) + "\"";
	}

	public static String[] concatStringArrays(String[] array1, String[] array2) {
		String[] result = new String[array1.length + array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		return result;
	}

	public static Xmp[] concatXmpArrays(Xmp[] array1, Xmp[] array2) {
		Xmp[] result = new Xmp[array1.length + array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		return result;
	}

	public static FieldSpec[] concatFieldSpecs(FieldSpec[] array1,
			FieldSpec[] array2) {
		FieldSpec[] result = new FieldSpec[array1.length + array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		return result;
	}

	public static int[] concatIntArrays(int[] orgFieldList, int[] addFields) {

		int[] result = new int[orgFieldList.length + addFields.length];
		java.lang.System.arraycopy(orgFieldList, 0, result, 0,
				orgFieldList.length);
		java.lang.System.arraycopy(addFields, 0, result, orgFieldList.length,
				addFields.length);

		return result;

	}

}
