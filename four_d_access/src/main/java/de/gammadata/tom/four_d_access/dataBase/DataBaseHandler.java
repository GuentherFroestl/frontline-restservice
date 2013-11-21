/*
 * DataBaseHandler.java
 *
 * Created on 28. September 2005, 14:08
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.XmlBasics;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * 
 * @author günther
 */
public abstract class DataBaseHandler {

	private static Logger logger = Logger.getLogger(DataBaseHandler.class);

	public abstract de.gammadata.tom.four_d_access.xml.XmpSelection executeQuery()
			throws TomDbException;

	public abstract de.gammadata.tom.four_d_access.xml.XmpSelection getObjectFromDB(Xmp useObject)
			throws TomDbException; // Did als Suchkriterium

	public abstract Xmp storeObjectInDB(Xmp storeObj) throws TomDbException;

	public abstract int deleteObjectFromDB(Xmp storeObj) throws TomDbException;

	public abstract int[] getNextDid(int anz);

	public abstract int getNextNumber(String type);

	public abstract StringBuffer executeProcedure(String xmlProcedure);

	public static String auftragsTyp = "auftrag";
	public static String lieferscheinTyp = "lieferschein";
	public static String rechnungsTyp = "rechnung";
	public static String bestellungTyp = "bestellung";
	public static String einrechTyp = "einrech";
	public static String kundenNummerTyp = "kundennummer";
	public static String lieferantenNummerTyp = "lieferantennummer";

	protected de.gammadata.tom.four_d_access.xml.Xmp resultObject;
	protected de.gammadata.tom.four_d_access.xml.Xmp masterObject;
	protected int startRecord = 0;
	protected int recordLimit = 0;
	protected boolean loadOneObjects = false;
	protected boolean countRows = true;
	protected DataBaseSpec dbSpec;
	protected int timeSpend = 0;
	protected String message = "";
	protected StringBuilder request;
	protected StringBuffer response;

	private int maxRecords = 5000;

	protected ArrayList<QueryPart> queryList;
	protected ArrayList<OrderPart> orderList;

	/**
	 * Creates a new instance of DataBaseHandler
	 * 
	 * @param _dbSpec
	 *            DataBaseSpec
	 */
	public DataBaseHandler(DataBaseSpec _dbSpec) {
		this.dbSpec = _dbSpec;
	}

	public void openQuery() {
		initQuery();
	}

	private void initQuery() {
		this.queryList = new ArrayList<QueryPart>();
		this.orderList = new ArrayList<OrderPart>();
		this.startRecord = 0;
		this.recordLimit = 0;
		this.countRows = false;
	}

	public boolean openQuery(RegisterView regView, Xmp inp) {
		boolean isOk = false;
		initQuery();
		this.setMasterObject(inp);
		this.countRows = true;
		Register reg = regView.getRegister();
		Xmp resObj;
		if (reg != null) {
			try {
				// Result Object festlegen
				resObj = (Xmp) Class.forName(reg.getContentClassName())
						.newInstance();

				// überprüfen, ob die DID mitgeladen wird!!
				setFieldListMitDID(resObj, reg.getIntFieldList());

				this.setResultObject(resObj);

				// Query generieren
				if ((regView.getFilterGruppenListe() == null)
						|| (regView.getFilterGruppenListe().size() == 0)
						|| (regView.getFilterGruppenListe().get(0) == null)) {
					// keine Filter also AllRecords
					this.queryList.add(new QueryPart(new QueryOperant(resObj
							.getXmlClassTag(), resObj.getFieldSpecs()[0]
							.getFieldName()), QueryPart.allRecords));
				} else {
					int anzFilter = regView.getFilterGruppenListe().size();
					this.queryList = new ArrayList<QueryPart>();
					for (int i = 0; i < anzFilter; i++) {
						// ggf Klammer auf
						if (anzFilter > 1) {
							this.queryList.add(new QueryPart(
									QueryPart.bracketOpen));
						}

						// QueryListe aus gewählten filter übernehmen
						int filterNummer = regView.getFilterGruppenListe()
								.get(i).getSelectedFilterNummer();
						if (regView.getFilterGruppenListe().get(i)
								.getFilterListe().get(filterNummer) != null) {
							// ArrayList<QueryPart>
							// qList=regView.getFilterGruppenListe().get(i).getFilterListe().get(filterNummer).getQueryList();
							this.queryList.addAll(regView
									.getFilterGruppenListe().get(i)
									.getFilterListe().get(filterNummer)
									.getQueryList());
						}
						// ggf. Klammer zu
						if (anzFilter > 1) {
							this.queryList.add(new QueryPart(
									QueryPart.bracketClose));
						}
					}
				}

				// Orderlist aus Register holen oder generieren

				if ((reg.getOrderList() != null)
						&& (reg.getOrderList().size() > 0)) {
					this.orderList = reg.getOrderList();
				} else {
					// Orderlist generieren
					// Jetzt einstweilen die ersten 2 Resultfields sortieren
					if (reg.getIntFieldList() != null) {
						int anzSortFelder = reg.getIntFieldList().length;
						// int anzSortFelder = reg.getFieldList().size();
						if (anzSortFelder > 3)
							anzSortFelder = 3; // auf 3 begrenzen
						int fieldSpecNr;
						for (int z = 0; z < anzSortFelder; z++) {
							fieldSpecNr = reg.getIntFieldList()[z] - 1;
							// fieldSpecNr =reg.getFieldList().get(z)-1;
							this.orderList.add(new OrderPart(new QueryOperant(
									resObj.getXmlClassTag(), resObj
											.getFieldSpecs()[fieldSpecNr]
											.getFieldName()), OrderPart.asc));
						}
					}
				}

				isOk = true; // alles klar
			} catch (Exception e) {
				logger.error("Fehler bei openQuery(RegisterView regView):", e);
			}
		}
		return isOk;
	}

	public boolean openQuery(RegisterView regView, int queryField,
			int queryOperator, QueryOperant queryOperant2) {
		boolean isOk = false;
		initQuery();
		this.countRows = true;
		Register reg = regView.getRegister();
		Xmp resObj;
		if (reg != null) {
			try {
				// Result Object festlegen
				resObj = (Xmp) Class.forName(reg.getContentClassName())
						.newInstance();
				setFieldListMitDID(resObj, reg.getIntFieldList());
				this.setResultObject(resObj);
				FieldSpec fSpec = resObj.getFieldSpecs()[queryField - 1];

				this.queryList.add(new QueryPart(new QueryOperant(resObj
						.getXmlClassTag(), fSpec.getFieldName()),
						queryOperator, queryOperant2));

				if ((reg.getOrderList() != null)
						&& (reg.getOrderList().size() > 0)) {
					this.orderList = reg.getOrderList();
				} else {
					// Orderlist generieren
					// Jetzt einstweilen die ersten 2 Resultfields sortieren
					if (reg.getIntFieldList() != null) {
						int anzSortFelder = reg.getIntFieldList().length;
						// int anzSortFelder = reg.getFieldList().size();
						if (anzSortFelder > 3)
							anzSortFelder = 3; // auf 3 begrenzen
						int fieldSpecNr;
						for (int z = 0; z < anzSortFelder; z++) {
							fieldSpecNr = reg.getIntFieldList()[z] - 1;
							// fieldSpecNr =reg.getFieldList().get(z)-1;
							this.orderList.add(new OrderPart(new QueryOperant(
									resObj.getXmlClassTag(), resObj
											.getFieldSpecs()[fieldSpecNr]
											.getFieldName()), OrderPart.asc));
						}
					}
				}
				isOk = true; // alles klar
			} catch (Exception e) {

			}
		}
		return isOk;
	}

	public boolean openQueryAllRecords(RegisterView regView) {
		boolean isOk = false;
		int queryField = 1;
		int queryOperator = QueryPart.allRecords;
		initQuery();
		this.countRows = true;
		Register reg = regView.getRegister();
		Xmp resObj;
		if (reg != null) {
			try {
				// Result Object festlegen
				resObj = (Xmp) Class.forName(reg.getContentClassName())
						.newInstance();
				setFieldListMitDID(resObj, reg.getIntFieldList());
				this.setResultObject(resObj);
				FieldSpec fSpec = resObj.getFieldSpecs()[queryField - 1];

				this.queryList
						.add(new QueryPart(new QueryOperant(resObj
								.getXmlClassTag(), fSpec.getFieldName()),
								queryOperator));

				if ((reg.getOrderList() != null)
						&& (reg.getOrderList().size() > 0)) {
					this.orderList = reg.getOrderList();
				} else {
					// Orderlist generieren
					// Jetzt einstweilen die ersten 2 Resultfields sortieren
					if (reg.getIntFieldList() != null) {
						int anzSortFelder = reg.getIntFieldList().length;
						// int anzSortFelder = reg.getFieldList().size();
						if (anzSortFelder > 3)
							anzSortFelder = 3; // auf 3 begrenzen
						int fieldSpecNr;
						for (int z = 0; z < anzSortFelder; z++) {
							fieldSpecNr = reg.getIntFieldList()[z] - 1;
							// fieldSpecNr =reg.getFieldList().get(z)-1;
							this.orderList.add(new OrderPart(new QueryOperant(
									resObj.getXmlClassTag(), resObj
											.getFieldSpecs()[fieldSpecNr]
											.getFieldName()), OrderPart.asc));
						}
					}
				}
				isOk = true; // alles klar
			} catch (Exception e) {

			}
		}
		return isOk;
	}

	// public boolean openQuery(StoredQuery sq, int startRec, int displRecs)
	// {
	// boolean isOK=false;
	// this.countRows =false;
	//
	// if (sq!=null)
	// {
	// this.setDataBaseSpec(sq.getDataBaseSpec());
	// this.setRecordLimit(displRecs);
	// this.setResultObject(sq.getResultObject());
	// this.setStartRecord(startRec);
	// this.orderList=sq.getOrderList();
	// this.queryList = sq.getQueryList();
	// this.setMasterObject(sq.getMasterObject());
	// isOK=true;
	// }
	// return isOK;
	// }
	//

	public QueryOperant getQueryOperator2(QueryPart qPart) {
		/*
		 * Routine überprüft ob sicj der QueryOperant 2 auf eine Objekt bezieht
		 * und gibt ggf. den Qop2 mit den Masterwerten zurück
		 */
		QueryOperant qOp = null;
		if (qPart.getOperant2() != null) {
			if (qPart.getOperant2().getType() == QueryOperant.typeMasterObjectField) {
				if ((this.getMasterObject() != null)
						&& (this.getMasterObject().getDbTabNummer() == qPart
								.getOperant2().getTabNummer())) {
					// Objekt passt

					int feldNummer = qPart.getOperant2().getFeldNummer();
					qOp = new QueryOperant();

					// Routine kann durch
					// qOp.setXmpFieldValue(this.getMasterObject(),feldNummer);
					// ersetzt werden

					Class cl = this.getMasterObject().getClass();
					Object[] params = {};
					Class[] mParams = {};
					String returnType;

					FieldSpec fSpec = this.getMasterObject().getFieldSpecs()[feldNummer - 1];
					String fieldName = fSpec.getFieldName();
					String mName = XmlBasics.genMethodName("get", fieldName);

					try {
						Method m = cl.getMethod(mName, mParams);
						returnType = m.getReturnType().toString();

						// Behandlung der Formattierten Ausgabe, je nach
						// returnType
						checkType: {
							if (returnType.equalsIgnoreCase("short")) {
								Short value = (Short) m.invoke(
										this.getMasterObject(), params);
								qOp.setIntValue(value.intValue());
								break checkType;
							}
							if (returnType.equalsIgnoreCase("int")) {
								Integer value = (Integer) m.invoke(
										this.getMasterObject(), params);
								qOp.setIntValue(value.intValue());
								break checkType;
							}
							if (returnType.equalsIgnoreCase("long")) {
								Integer value = (Integer) m.invoke(
										this.getMasterObject(), params);
								qOp.setIntValue(value.intValue());
								break checkType;
							}
							if (returnType.equalsIgnoreCase("float")) {
								Float value = (Float) m.invoke(
										this.getMasterObject(), params);
								qOp.setDoubleValue(value.doubleValue());
								break checkType;
							}
							if (returnType.equalsIgnoreCase("double")) {
								Float value = (Float) m.invoke(
										this.getMasterObject(), params);
								qOp.setDoubleValue(value.doubleValue());
								break checkType;
							}
							if (returnType.equalsIgnoreCase("boolean")) {
								Boolean value = (Boolean) m.invoke(
										this.getMasterObject(), params);
								qOp.setBooleanValue(value.booleanValue());
								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.util.GregorianCalendar")) {
								java.util.GregorianCalendar gDate = ((java.util.GregorianCalendar) m
										.invoke(this.getMasterObject(), params));
								qOp.setSqlDateValue(new java.sql.Date(gDate
										.getTimeInMillis()));

								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.sql.Date")) {

								java.sql.Date gDate = ((java.sql.Date) m
										.invoke(this.getMasterObject(), params));
								qOp.setSqlDateValue(gDate);
								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.sql.Time")) {
								java.sql.Time gDate = ((java.sql.Time) m
										.invoke(this.getMasterObject(), params));
								qOp.setSqlTimeValue(gDate);

								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.lang.String")) {
								qOp.setStringValue((String) m.invoke(
										this.getMasterObject(), params));
								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.XmlCode")) {
								qOp.setStringValue((String) m.invoke(
										this.getMasterObject(), params));
								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.HtmlCode")) {
								qOp.setStringValue((String) m.invoke(
										this.getMasterObject(), params));
								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.lang.StringBuffer")) {

								qOp.setStringValue(m.invoke(
										this.getMasterObject(), params)
										.toString());

								break checkType;
							}
							if (returnType
									.equalsIgnoreCase("class java.lang.StringBuilder")) {
								qOp.setStringValue(m.invoke(
										this.getMasterObject(), params)
										.toString());
								break checkType;
							}

							// default Zweig beliebiger Value angenommen

							qOp.setValue(m.invoke(this.getMasterObject(),
									params).toString());
						}

					} catch (Exception e) {
						logger.error(
								"Fehler bei generischerMethode FeldeName: "
										+ fieldName, e);
						return null;
					}

				} else {
					return null;
				}
			} else {
				return qPart.getOperant2();
			}
		}
		return qOp;
	}

	public static void setFieldListMitDID(Xmp resObj, int[] fListOriginal) {
		// überprüfen, ob die DID mitgeladen wird!!
		boolean hasEins = false;
		for (int i = 0; i < fListOriginal.length; i++) {
			if (fListOriginal[i] == 1) {
				hasEins = true;
				break;
			}
		}
		if (!hasEins) // Die Eins anfügen
		{
			int[] newFlist = new int[fListOriginal.length + 1];
			newFlist[0] = 1; // Die Eins== DID mit aufnehmen
			for (int i = 1; i < newFlist.length; i++) {
				newFlist[i] = fListOriginal[i - 1]; // Rest Rüberkopieren

			}
			resObj.setFieldList(newFlist);
		} else
			resObj.setFieldList(fListOriginal);
	}

	public void addQueryPart(QueryPart inp) {
		queryList.add(inp);
	}

	public void addOrderPart(OrderPart inp) {
		orderList.add(inp);
	}

	public void setDataBaseSpec(DataBaseSpec inp) {
		dbSpec = inp;
	}

	public DataBaseSpec getDataBaseSpec() {
		return dbSpec;
	}

	public void setResultObject(de.gammadata.tom.four_d_access.xml.Xmp inp) {
		resultObject = inp;
	}

	public de.gammadata.tom.four_d_access.xml.Xmp getResultObject() {
		return this.resultObject;
	}

	public void setMasterObject(de.gammadata.tom.four_d_access.xml.Xmp inp) {
		this.masterObject = inp;
	}

	public de.gammadata.tom.four_d_access.xml.Xmp getMasterObject() {
		return this.masterObject;
	}

	public void setStartRecord(int inp) {
		startRecord = inp;
	}

	public int getStartRecord() {
		return startRecord;
	}

	public void setRecordLimit(int inp) {
		recordLimit = inp;
	}

	public int getRecordLimit() {
		return recordLimit;
	}

	public void setMaxRecords(int inp) {
		maxRecords = inp;
	}

	public int getMaxRecords() {
		return maxRecords;
	}

	public void setTimeSpend(int inp) {
		timeSpend = inp;
	}

	public int getTimeSpend() {
		return timeSpend;
	}

	public void setMessage(String inp) {
		message = inp;
	}

	public String getMessage() {
		return message;
	}

	public void setRequest(StringBuilder inp) {
		request = inp;
	}

	public StringBuilder getRequest() {
		return request;
	}

	public void setResponse(StringBuffer inp) {
		response = inp;
	}

	public StringBuffer getResponse() {
		return response;
	}

	// public StoredQuery getStoredQuery()
	// {
	// StoredQuery sq = new StoredQuery();
	// sq.setDataBaseSpec(this.dbSpec);
	// sq.setOrderList(this.orderList);
	// sq.setQueryList(this.queryList);
	// sq.setRecordLimit(this.recordLimit);
	// sq.setResultObject(this.resultObject);
	// sq.setStartRecord(this.startRecord);
	// sq.setMasterObject(this.getMasterObject());
	// return sq;
	// }

	public void setQueryList(ArrayList<QueryPart> inp) {
		this.queryList = inp;
	}

	public ArrayList<QueryPart> getQueryList() {
		return this.queryList;
	}

	public void setOrderList(ArrayList<OrderPart> inp) {
		this.orderList = inp;
	}

	public ArrayList<OrderPart> getOrderList() {
		return this.orderList;
	}

	public void setCountRows(boolean inp) {
		countRows = inp;
	}

	public boolean getCountRows() {
		return countRows;
	}

	/**
	 * @return the loadOneObjects
	 */
	public boolean isLoadOneObjects() {
		return loadOneObjects;
	}

	/**
	 * @param loadOneObjects
	 *            the loadOneObjects to set
	 */
	public void setLoadOneObjects(boolean loadOneObjects) {
		this.loadOneObjects = loadOneObjects;
	}

}
