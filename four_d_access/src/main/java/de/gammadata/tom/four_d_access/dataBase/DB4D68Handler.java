/*
 * DB4D68Handler.java
 *
 * Created on 28. September 2005, 14:11
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Locale;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.xml.sax.InputSource;

import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.util.LocaleFormatter;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.XmlBasics;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * 
 * @author günther
 */
public class DB4D68Handler extends DataBaseHandler {

	private static Logger logger = Logger.getLogger(DataBaseHandler.class);

	public static int comTimeout = 120000; // 120 Sekunden Timeout für Anfragen
	private de.gammadata.tom.four_d_access.xml.XmpSelection resultSelection;

	public static String booleanTrue = "true";
	public static String booleanFalse = "false";

	// Tags und Attribute für XML Kommunication mit Tom-4D

	public static final String xmlTagTomenvelope = "tomenvelope";
	public static final String xmlTagHeader = "header";
	public static final String xmlTagId = "id";
	public static final String xmlTagResultstatus = "resultstatus";
	public static final String xmlTagMessage = "message";
	public static final String xmlTagBody = "body";

	public static final String xmlTagResponseset = "responseset";
	public static final String xmlTagSelection = "selection";
	public static final String xmlTagDbobject = "dbobject";
	public static final String xmlTagField = "field";
	public static final String xmlTagOneobject = "oneobject";
	public static final String xmlTagOneField = "onefield";

	public static final String xmlTagStoreObject = "storeobject";

	public static final String xmlTagSearch = "search";
	public static final String xmlTagSearcharg = "searcharg";
	public static final String xmlTagOrder = "order";
	public static final String xmlTagOrderarg = "orderarg";
	public static final String xmlTagResultset = "resultset";
	public static final String xmlTagResultobject = "resultobject";

	public static final String xmlAttributeUser = "user";
	public static final String xmlAttributePw = "pw";

	public static final String xmlAttributeType = "type";
	public static final String xmlAttributeTypeCode = "typecode";
	public static final String xmlAttributeTab = "tab";
	public static final String xmlAttributeTabnummer = "nummer";
	public static final String xmlAttributeField = "field";
	public static final String xmlAttributeFieldName = "name";
	public static final String xmlAttributeFieldnummer = "nummer";
	public static final String xmlAttributeFieldSpec = "fieldspec";
	public static final String xmlAttributeFieldSpecAll = "all";
	public static final String xmlDidAttribute = "did";
	public static final String xmlAttributeSelectedrecords = "selectedrecords";
	public static final String xmlAttributeStartrecord = "startrecord";
	public static final String xmlAttributeRecordnummer = "recordnumber";
	public static final String xmlAttributeResponserecords = "responserecords";

	public static final String xmlAttributeMaxlength = "maxlength";
	public static final String xmlAttributeRecordlimit = "recordlimit";

	public static final String xmlAttributeLogicoperator = "logicoperator";
	public static final String xmlAttributeLogicopCode = "logicopcode";

	public static final String xmlAttributeCompareoperator = "compareoperator";
	public static final String xmlAttributeCompareopCode = "compareopcode";
	public static final String xmlAttributeComparetab = "comparetab";
	public static final String xmlAttributeComparefield = "comparefield";
	public static final String xmlAttributeComparevalue = "comparevalue";
	public static final String xmlAttributeContinuesearcharg = "continuesearcharg";

	public static final String xmlTagOrderTag = "order";
	public static final String xmlTagOrderArg = "orderarg";

	public static final String xmlAttributeOrderoperator = "orderoperator";
	public static final String xmlAttributeOrderOpCode = "orderopcode";

	public static final String xmlWertAlpha = "alpha";
	public static final String xmlWertText = "text";
	public static final String xmlWertBoolean = "boolean";
	public static final String xmlWertDate = "date";
	public static final String xmlWertTime = "time";
	public static final String xmlWertInteger = "integer";
	public static final String xmlWertLongint = "longint";
	public static final String xmlWertReal = "real";
	public static final String xmlWertSelection = "selection";

	DateFormat dateFormatter; // Wird für die Umwandlung von Datumswerten
								// benötigt

	/**
	 * Creates a new instance of DB4D68Handler
	 * 
	 * @param _dbSpec
	 *            DataBaseSpec
	 */
	public DB4D68Handler(DataBaseSpec _dbSpec) {
		super(_dbSpec);
		dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT,
				Locale.GERMANY);
	}

	@Override
	public de.gammadata.tom.four_d_access.xml.XmpSelection executeQuery() throws TomDbException {

		boolean wasBracketClose = false;
		StringBuilder reqData = new StringBuilder();
		reqData.append(getReqHeader());
		reqData.append("<body>\n");

		// Queryliste
		if (this.queryList.size() > 0) {
			reqData.append("<search>\n");
			for (int i = 0; i < queryList.size(); i++) {

				if (queryList.get(i).getLogicOperator() == QueryPart.bracketOpen) {
					if (wasBracketClose) {

					}
					wasBracketClose = false;
				} else if (queryList.get(i).getLogicOperator() == QueryPart.andBracketOpen) {
					wasBracketClose = false;
				} else if (queryList.get(i).getLogicOperator() == QueryPart.orBracketOpen) {
					wasBracketClose = false;
				} else if (queryList.get(i).getLogicOperator() == QueryPart.bracketClose) {
					wasBracketClose = true;
				}

				reqData.append("<searcharg");
				if (i == 0) {
					reqData.append(" logicopcode=\"0\"");
				} else {
					reqData.append(" logicopcode=\""
							+ Integer.toString(queryList.get(i)
									.getLogicOperator()) + "\"");
				}
				reqData.append(" tab=\""
						+ queryList.get(i).getOperant1().getTableName() + "\"");
				reqData.append(" field=\""
						+ queryList.get(i).getOperant1().getFieldName() + "\"");
				reqData.append(" compareopcode=\""
						+ Integer.toString(queryList.get(i)
								.getCompareOperator()) + "\"");
				if ((queryList.get(i).getOperant2() != null)
						&& (this.getQueryOperator2(queryList.get(i)) != null)) {
					QueryOperant qOp2 = this
							.getQueryOperator2(queryList.get(i));
					if (qOp2.isValue()) {
						String value = "";
						int type = qOp2.getType();
						switch (type) {
						case QueryOperant.typeStringValue: {
							value = qOp2.getStringValue();
							if (queryList.get(i).getCompareOperator() == QueryPart.contains) {
								// jetzt immer als Alphawert behandeln, da
								// contains!!
								// value="@"+value+"@";

							}
							// Noch einen Alphawert behandeln!!
							else if (queryList.get(i).getCompareOperator() == QueryPart.startsWith) {
								// value=value+"@";

							}
							break;
						}
						case QueryOperant.typeSqlDateValue: {
							value = "!"
									+ dateFormatter.format(new java.util.Date(
											qOp2.getSqlDateValue().getTime()))
									+ "!";
							break;
						}
						case QueryOperant.typeSqlRelativeDateValue: {
							value = "!"
									+ dateFormatter.format(new java.util.Date(
											qOp2.getSqlDateValue().getTime()))
									+ "!";
							break;
						}
						case QueryOperant.typeSqlTimeValue: {
							value = "?" + qOp2.getSqlTimeValue().toString()
									+ "?";
							break;
						}
						case QueryOperant.typeSqlRelativeTimeValue: {
							value = "?" + qOp2.getSqlTimeValue().toString()
									+ "?";
							break;
						}
						case QueryOperant.typeIntValue: {
							value = Integer.toString(qOp2.getIntValue());
							break;
						}
						case QueryOperant.typeDoubleValue: {
							value = Double.toString(qOp2.getDoubleValue());
							break;

						}
						case QueryOperant.typeBooleanValue: {
							if (qOp2.getBooleanValue())
								value = DB4D68Handler.booleanTrue;
							else
								value = DB4D68Handler.booleanFalse;

							break;
						}
						default: {
							value = qOp2.getValue();
							break;
						}
						}
						reqData.append(" comparevalue=\"" + value + "\"");
					} else {
						reqData.append(" comparetab=\"" + qOp2.getTableName()
								+ "\"");
						reqData.append(" comparefield=\"" + qOp2.getFieldName()
								+ "\"");
					}
				}

				if ((i + 1) < queryList.size()) {
					reqData.append(" continuesearcharg=\"yes\"/>\n");
				} else {
					reqData.append(" continuesearcharg=\"no\"/>\n");
				}
			}
			reqData.append("</search>\n");
		}

		// OrderListe
		if (this.orderList.size() > 0) {
			reqData.append("<order>\n");
			for (int i = 0; i < orderList.size(); i++) {
				reqData.append("<orderarg");

				reqData.append(" tab=\""
						+ orderList.get(i).getOperant().getTableName() + "\"");
				reqData.append(" field=\""
						+ orderList.get(i).getOperant().getFieldName() + "\"");
				reqData.append(" orderopcode=\""
						+ Integer.toString(orderList.get(i).getOrderOperator())
						+ "\" />");
			}
			reqData.append("</order>\n");
		}

		// Resultsetdefinition

		if (this.getResultObject() != null) {
			reqData.append("<resultset>\n");
			reqData.append("<resultobject tab=\""
					+ this.getResultObject().getXmlClassTag() + "\" nummer=\""
					+ this.getResultObject().getDbTabNummer()
					+ "\" startRecord=\"" + this.getStartRecord()
					+ "\" recordlimit=\"" + this.getRecordLimit() + "\"");

			int[] fieldList = this.getResultObject().getFieldList();
			FieldSpec[] fieldSpecList = this.getResultObject().getFieldSpecs();
			FieldSpec fieldSpec;
			if (this.getResultObject().isAllFields()) {
				reqData.append(" fieldspec=\"all\">\n");
			} else {
				reqData.append(" fieldspec=\"listed\">\n");
				reqData.append("<fieldlist>\n");
				for (int i = 0; i < fieldList.length; i++) {
					fieldSpec = fieldSpecList[fieldList[i] - 1]; // Die
																	// FEldnummern
																	// beginnen
																	// bei 1
					reqData.append("<field name=\"" + fieldSpec.getFieldName()
							+ "\" nummer=\"" + fieldSpec.getFieldNumber()
							+ "\" />\n");
				}
				reqData.append("</fieldlist>\n");
			}

			// Jetzt ggf. die OneObjekte spezifizieren
			StringBuilder oneObjReqData = new StringBuilder();
			int[] oneObjFieldList;
			for (int i = 0; i < fieldList.length; i++) {
				fieldSpec = fieldSpecList[fieldList[i] - 1]; // Die Feldnummern
																// beginnen bei
																// 1
				if (isLoadOneObjects()
						&& fieldSpec.getOneObjectPointer() != null) {
					oneObjReqData.append("<oneobject" + " fkeytabnummer=\""
							+ this.getResultObject().getDbTabNummer()
							+ "\""
							+ " fkeytabname=\""
							+ this.getResultObject().getXmlClassTag()
							+ "\""
							+ " fkeyfieldname=\""
							+ fieldSpec.getFieldName()
							+ "\""
							+ " fkeyfieldnummer=\""
							+ fieldSpec.getFieldNumber()
							+ "\""
							+ " oneobjtabname=\""
							+ fieldSpec.getOneObjectPointer().getTabellenName()
							+ "\""
							+ " oneobjtabnummer=\""
							+ fieldSpec.getOneObjectPointer()
									.getTabellenNummer()
							+ "\""
							+ " oneobjkeyfieldname=\""
							+ fieldSpec.getOneObjectPointer()
									.getIndexFieldName()
							+ "\""
							+ " oneobjkeyfieldnummer=\""
							+ fieldSpec.getOneObjectPointer()
									.getIndexFieldNummer() + "\"");

					oneObjFieldList = DbStruktur
							.getDefaultOneObjFieldList(fieldSpec
									.getOneObjectPointer());
					if (oneObjFieldList != null) {
						oneObjReqData.append(" oneobjfieldspec=\"listed\">\n");
						oneObjReqData.append("<onefieldlist>\n");
						for (int z = 0; z < oneObjFieldList.length; z++) {
							oneObjReqData.append("<onefield nummer=\""
									+ oneObjFieldList[z] + "\" />\n");
						}
						oneObjReqData.append("</onefieldlist>\n");
					} else {
						oneObjReqData.append(" oneobjfieldspec=\"all\">\n");
					}

					oneObjReqData.append("</oneobject>\n");
				}

			}
			if (oneObjReqData.length() > 0) {
				reqData.append("<oneobjlist>\n" + oneObjReqData
						+ "</oneobjlist>\n");
			}
			reqData.append("</resultobject>\n");
			reqData.append("</resultset>\n");
		}

		// Body und Envelpoe Schliessen

		reqData.append("</body></tomenvelope>\n");
		// jetzt den Request senden
		this.setRequest(reqData);

		try {
			logger.debug("Request-XML-Data:\n " + reqData.toString());
			StringBuffer tomresponse = sendRequest(reqData.toString());
			this.setResponse(tomresponse);
			logger.debug("TOM-Response:\n " + tomresponse.toString());
			Response4DSaxHandler responseHandler = parseResponse(tomresponse);
			if (responseHandler.getXmpSelection() != null) {
				resultSelection = responseHandler.getXmpSelection();
				resultSelection.setDisplayedRecs(this.getRecordLimit());
				resultSelection.setDisplaySize(this.getRecordLimit());
			}
		} catch (Exception e) {
			this.setMessage("[DB4D68Handler]sendRequest Fehler:  " + e);
			throw new TomDbException("sendRequest Fehler:  " + e);
		}
		return resultSelection;
	}

	@Override
	public XmpSelection getObjectFromDB(Xmp useObject) throws TomDbException {
		this.openQuery();
		// String didString = Integer.toString(useObject.getDID());
		this.addQueryPart(new QueryPart(new QueryOperant(useObject
				.getXmlClassTag(), "DID"), QueryPart.equal, new QueryOperant(
				useObject.getDID())));
		this.setResultObject(useObject);
		this.setRecordLimit(1);
		XmpSelection resultSelection = this.executeQuery();
		return resultSelection;

	}

	@Override
	public Xmp storeObjectInDB(Xmp storeObj) throws TomDbException {
		int ok = 1;
		if (storeObj == null) {
			throw new TomDbException("Fehler beim Speichern Object==null");
		}
		if (storeObj.getDID() == 0) {
			int[] dids = getNextDid(1);
			if (dids == null || dids.length == 0) {
				throw new TomDbException(
						"Fehler beim Speichern keine DID erhalten");
			}
			storeObj.setDID(dids[0]);
			logger.debug("DB4D68Handler]storeObjectInDB DID erzeugt="
					+ storeObj.getDID());

		}
		StringBuilder reqData = new StringBuilder();
		reqData.append(getReqHeader());
		reqData.append("<body>\n");
		reqData.append("<storeobject new=\"" + storeObj.isNewObject()
				+ "\" >\n");
		reqData.append(genXmlOut4D(storeObj, storeObj.getFieldList(), "", "",
				new de.gammadata.tom.four_d_access.util.LocaleFormatter(Locale.GERMANY)));
		reqData.append("</storeobject>\n");
		reqData.append("</body></tomenvelope>\n");

		this.setRequest(reqData);
		logger.debug("storeObjectInDB() Request:\n" + reqData);
		try {
			StringBuffer response = sendRequest(reqData.toString());
			logger.debug("storeObjectInDB Response:\n" + response);
			storeObj.setNewObject(false);
			// Response noch auswerten !!
			// OutDebug.println(true,
			// "[DB4D68Handler]storeObjectInDB Response:\n"+response);
		} catch (Exception e) {
			throw new TomDbException("Fehler beim Speicher Object=" + storeObj);
		}
		return storeObj;
	}

	@Override
	public int deleteObjectFromDB(Xmp storeObj) throws TomDbException {
		int ok = 1;
		StringBuilder reqData = new StringBuilder();
		reqData.append(getReqHeader());
		reqData.append("<body>\n");
		reqData.append("<deleteobject did=\"" + storeObj.getDID() + "\" tab=\""
				+ storeObj.getXmlClassTag() + "\"" + " nummer=\""
				+ storeObj.getDbTabNummer() + "\" >\n");
		// reqData.append(genXmlOut4D(storeObj,storeObj.getFieldList(),"","",new
		// de.gammadata.tom.four_d_access.util.LocaleFormatter(Locale.GERMANY)));
		reqData.append("</deleteobject>\n");
		reqData.append("</body></tomenvelope>\n");

		this.setRequest(reqData);
		logger.debug("DB4D68Handler]deleteObjectFromDB Request:\n" + reqData);
		try {
			StringBuffer responese4d = sendRequest(reqData.toString());
			// Response noch auswerten !!
			logger.debug("deleteObjectFromDB Response:\n" + responese4d);
		} catch (Exception e) {
			throw new TomDbException(
					"[DB4D68Handler]deleteObjectFromDB Fehler:  " + e);
		}
		return ok;
	}

	@Override
	public synchronized int[] getNextDid(int anz) {
		StringBuilder reqData = new StringBuilder();
		reqData.append(getReqHeader());
		reqData.append("<body>\n");
		reqData.append("<getnextdid anzahl=\"" + anz + "\" />\n");
		reqData.append("</body></tomenvelope>\n");
		int[] nextDidList = null;

		this.setRequest(reqData);
		try {
			StringBuffer response = sendRequest(reqData.toString());
			this.setResponse(response);
			Response4DSaxHandler responseHandler = parseResponse(response);
			return responseHandler.getNextDidList();
		} catch (Exception e) {
			this.setMessage("[DB4D68Handler]getNextDid/sendRequest Fehler:  "
					+ e);
			logger.debug("getNextDid/sendRequest Fehler:  ", e);
		}
		return nextDidList;
	}

	@Override
	public synchronized int getNextNumber(String type) {
		StringBuilder reqData = new StringBuilder();
		reqData.append(getReqHeader());
		reqData.append("<body>\n");
		reqData.append("<getnextnumber type=\"" + type + "\" />\n");
		reqData.append("</body></tomenvelope>\n");
		this.setRequest(reqData);
		try {
			StringBuffer response = sendRequest(reqData.toString());
			this.setResponse(response);
			Response4DSaxHandler responseHandler = parseResponse(response);
			return responseHandler.getNextNumber();
		} catch (Exception e) {
			this.setMessage("[DB4D68Handler]getNextNumber/sendRequest Fehler:  "
					+ e);
			logger.debug("getNextNumber/sendRequest Fehler:  ", e);
		}
		return 0;
	}

	@Override
	public StringBuffer executeProcedure(String xmlProcedure) {

		try {
			StringBuffer response = sendRequest(xmlProcedure);
			this.setResponse(response);
			return response;
		} catch (Exception e) {
			this.setMessage("[DB4D68Handler]executeProcedure/sendRequest Fehler:  "
					+ e);
			logger.debug("executeProcedure/sendRequest Fehler:  ", e);
			return null;
		}
	}

	/*
	 * public String getAlphaDelim() { return alphaDelim; }
	 * 
	 * public String getBooleanTrue() { return "true"; } public String
	 * getBooleanFalse() { return "false"; }
	 */

	private Response4DSaxHandler parseResponse(StringBuffer response) {
		Response4DSaxHandler saxHandler = new Response4DSaxHandler();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			// factory.setValidating(true);
			factory.setNamespaceAware(true);
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(
					new InputSource(new StringReader(response.toString())),
					saxHandler);

		} catch (Exception e) {
			logger.debug(" XmlParser Fehler:" + "\n", e);
		}
		return saxHandler;
	}

	public StringBuilder getReqHeader() {
		StringBuilder reqData = new StringBuilder();
		reqData.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n");
		reqData.append("<tomenvelope>\n<header>\n");
		reqData.append("<id user=\"" + this.getDataBaseSpec().getUserName()
				+ "\"");
		reqData.append(" pw=\"" + this.getDataBaseSpec().getPw() + "\"/>");
		reqData.append("</header>\n");
		return reqData;
	}

	private String encodeOperator(int opCode) {
		switch (opCode) {
		case QueryPart.booleanAnd:
			return "&amp;"; // &
		case QueryPart.booleanOr:
			return "|";
		case QueryPart.notEqual:
			return "#";
		case QueryPart.equal:
			return "=";
		case QueryPart.startsWith:
			return "=";
		case QueryPart.contains:
			return "=";
		case QueryPart.greater:
			return "&gt;"; // >
		case QueryPart.greaterEqual:
			return "&gt;="; // >=
		case QueryPart.less:
			return "&lt;"; // <
		case QueryPart.lessEqual:
			return "&lt;="; // <=

		case OrderPart.asc:
			return "&gt;"; // >
		case OrderPart.desc:
			return "&lt;"; // <

		default:
			return "?";

		}
	}

	private StringBuffer sendRequest(String reqData) throws Exception {
		de.gammadata.tom.four_d_access.util.ZeitMesser zm = new de.gammadata.tom.four_d_access.util.ZeitMesser();
		zm.startMessung();
		java.net.Socket tomCom = new java.net.Socket(this.getDataBaseSpec()
				.getServerAddress(), this.getDataBaseSpec().getServerPort());
		java.io.OutputStream os = tomCom.getOutputStream();
		java.io.OutputStreamWriter osWriter = new java.io.OutputStreamWriter(
				os, "ISO-8859-1");

		tomCom.setSoTimeout(comTimeout);
		InputStream is = tomCom.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is,
				"ISO-8859-1"));

		osWriter.write(reqData);
		osWriter.flush();

		String line;
		int charCount;
		StringBuffer response = new StringBuffer();
		int bufferSize = 500;
		char[] charBuffer = new char[bufferSize];
		try {
			/*
			 * while ((line = in.readLine())!=null) {
			 * response.append(line+"\n"); }
			 */
			while ((charCount = in.read(charBuffer, 0, bufferSize)) > 0) {
				response.append(charBuffer, 0, charCount);
			}

			in.close();
			is.close();
			tomCom.close();
			this.setTimeSpend(zm.getZeitDiff());
			return response;
		} catch (InterruptedIOException ie) {
			in.close();
			is.close();
			tomCom.close();
			this.setTimeSpend(zm.getZeitDiff());
			throw ie;
		} catch (Exception e) {
			in.close();
			is.close();
			tomCom.close();
			this.setTimeSpend(zm.getZeitDiff());
			throw e;
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public StringBuilder genXmlOut4D(Xmp obj, int[] fieldList, String objName,
			String objScope, LocaleFormatter userLocale) {

		StringBuilder sb = new StringBuilder();
		Class cl = obj.getClass();
		Class[] aParams = {};
		Object[] params = {};
		Method m;
		String returnType;
		String xmlObjektClassName = obj.getClass().getName();
		if (fieldList == null) {
			logger.debug("genXmlOut Fehler no FieldList object: "
					+ xmlObjektClassName);
		}
		// Start Tag
		// sb.append(XmlBasics.genXmlStartObjektTag(obj.getXmlClassTag(),
		// xmlObjektClassName, objName));
		sb.append(genXmlStartObjektTag4D(obj));
		sb.append(XmlBasics.newLine());

		// Felder ausgeben
		sb.append(XmlBasics.genXmlStartTag(XmlBasics.controllerObjectFelder));
		sb.append(XmlBasics.newLine());
		FieldSpec[] fieldSpec = obj.getFieldSpecs();
		for (int i = 0; i < fieldList.length; i++) {
			// sb.append(i+": "+felder[i]+" - ");
			String fieldName = fieldSpec[fieldList[i] - 1].getFieldName();
			int fieldNummer = fieldSpec[fieldList[i] - 1].getFieldNumber();
			String mName = XmlBasics.genMethodName("get", fieldName);
			String objString = "";
			// sb.append(mName+" :  ");
			try {
				m = cl.getMethod(mName, aParams);
				returnType = m.getReturnType().toString();

				// Behandlung der Formattierten Ausgabe, je nach returnType
				checkType: {
					// NPE Überprüfung
					if (m.invoke(obj, params) == null) {
						logger.debug("genXmlOut4D Fehler bei Feld= " + i
								+ "Wert==null return Type: " + returnType
								+ ", name;" + m.getName());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("short")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("int")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						logger.debug("genXmlOut: Format Int/number: "
								+ objString);
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("long")) {
						objString = userLocale.formatInteger((Number) m.invoke(
								obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("float")) {
						objString = userLocale.formatNumber((Number) m.invoke(
								obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						logger.debug("genXmlOut: Format float/number: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("double")) {
						objString = userLocale.formatNumber((Number) m.invoke(
								obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						logger.debug("genXmlOut: Format float/number: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("boolean")) {
						objString = m.invoke(obj, params).toString();
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.util.GregorianCalendar")) {
						objString = userLocale
								.formatDate((java.util.GregorianCalendar) m
										.invoke(obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						logger.debug("enXmlOut: Format GregorianCalendar: "
								+ objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Date")) {
						logger.debug("genXmlOut: Format java.sql.Date: ");
						objString = userLocale.getDateOnlyFormat().format(
								(java.sql.Date) m.invoke(obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Time")) {
						logger.debug("genXmlOut: Format java.sql.Time: ");
						objString = userLocale.getTimeOnlyFormat().format(
								(java.sql.Time) m.invoke(obj, params));
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						logger.debug(objString);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.lang.String")) {
						objString = "<![CDATA["
								+ m.invoke(obj, params).toString() + "]]>";
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class de.gammadata.tom.four_d_access.xmlCode")) {
						objString = "<![CDATA["
								+ m.invoke(obj, params).toString() + "]]>";
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class com.tom.HtmlCode")) {
						objString = "<![CDATA["
								+ m.invoke(obj, params).toString() + "]]>";
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuffer")) {
						objString = "<![CDATA["
								+ m.invoke(obj, params).toString() + "]]>";
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuilder")) {
						objString = "<![CDATA["
								+ m.invoke(obj, params).toString()
										.replace("\n", "\\u000d") + "]]>";
						if (objString.length() > 32000) // 4D grenze für Text
						{
							objString = m.invoke(obj, params).toString();
							if (objString.length() > 31500) {
								objString = objString.substring(0, 31500);
							} else {
								objString = objString.substring(0,
										objString.length() - 500);
							}
							objString = "<![CDATA["
									+ objString.replace("\n", "\\u000d")
									+ "]]>";
						}
						sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
								objString, returnType, fieldNummer));
						break checkType;
					}

					// default Zweig

					objString = m.invoke(obj, params).toString();
					sb.append(genXmlFeldTag(xmlObjektClassName, fieldName,
							objString, returnType, fieldNummer));
					logger.debug("genXmlOut: return Type: " + returnType
							+ ", name;" + m.getName() + ", ergebnis: "
							+ objString);
				}

				// sb.append(m.invoke(obj,params).toString()); // Feldinhalt
				// sb.append(" Type: "+m.getReturnType().toString());

				// Methode gefunden

				sb.append(XmlBasics.newLine());
			} catch (Exception e) {
				logger.debug("genXmlOut: " + xmlObjektClassName + "." + mName
						+ " Fehler bei generischer methode!!\n", e);
			}
			// sb.append("\n");
		}

		// Ende Felder
		sb.append(XmlBasics.genXmlEndeTag(XmlBasics.controllerObjectFelder));
		sb.append(XmlBasics.newLine());

		sb.append(XmlBasics.genXmlEndeTag("dbobject"));
		sb.append(XmlBasics.newLine());

		return sb;
	}

	private String genXmlStartObjektTag4D(Xmp obj) {
		return (XmlBasics.tagAuf + "dbobject" + " tab" + "=\""
				+ obj.getXmlClassTag() + "\" " + "nummer" + "=\""
				+ obj.getDbTabNummer() + "\"" + " did" + "=\"" + obj.getDID()
				+ "\"" + XmlBasics.tagZu);
	}

	private String genXmlFeldTag(String objektName, String fieldname,
			String content, String typ, int fieldNummer) {
		return XmlBasics.genXmlTagAuf(xmlTagField)
				+ XmlBasics.genParameter(xmlAttributeFieldnummer,
						Integer.toString(fieldNummer))
				+ XmlBasics.genParameter(xmlAttributeFieldName, fieldname)
				+ XmlBasics.genParameter(XmlBasics.attrType,
						XmlBasics.encodeTypBez(typ)) + XmlBasics.tagZu
				+ content + XmlBasics.genXmlEndeTag(xmlTagField);
	}
}
