/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.dbBeans.BookmarkLinks;
import de.gammadata.tom.four_d_access.dbBeans.ContentElemente;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.XmlBasics;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * 
 * @author gfr
 */
public class DataBaseUtilities {

	private static Logger logger = Logger.getLogger(DataBaseUtilities.class);

	// public static boolean saveRecord(DataBaseHandler zielDbHandler, Xmp
	// copyObj,boolean noOverwrite) throws TomDbException
	// {
	// int[] smallFieldList={1};
	// int[] fieldList = copyObj.getFieldList();
	//
	// copyObj.setFieldList(smallFieldList);
	// XmpSelection workSel=zielDbHandler.getObjectFromDB(copyObj);
	//
	// copyObj.setFieldList(fieldList); //Objekt sollte ansonsten unverändert
	// sein
	//
	// if ((workSel!=null)&&(workSel.getListSize()>0))
	// {
	// copyObj.setNewObject(false);
	// if(noOverwrite)
	// {
	// return false; //vorhandenes Objekt nicht überschreiben
	// }
	// }
	// else
	// {
	// copyObj.setNewObject(true);
	// }
	// int copyResult=zielDbHandler.storeObjectInDB(copyObj);
	// if (copyResult>0)
	// {
	// return true;
	// }
	// else
	// {
	// return false;
	// }
	//
	// }

	public static Xmp loadRecord(DataBaseHandler quellDbHandler, Xmp searchObj)
			throws TomDbException {
		XmpSelection workSel = quellDbHandler.getObjectFromDB(searchObj);

		if ((workSel != null) && (workSel.getListSize() > 0)) {
			return workSel.getSelectedObject(0);
		} else {
			return null;

		}

	}

	// public static Xmp copyObject(DataBaseHandler quellDbHandler,
	// DataBaseHandler zielDbHandler,int tabnr,int did,boolean overwrite)
	// {
	// Xmp searchObj=null;
	// Xmp resultObj=null;
	//
	// try {
	// switch (tabnr)
	// {
	// case 93:
	// searchObj = new ContentElemente();
	// break;
	//
	// }
	//
	// if (searchObj != null) {
	// searchObj.setDID(did);
	// searchObj.setAllFields(searchObj.getFieldSpecs());
	// resultObj = loadRecord(quellDbHandler, searchObj);
	//
	// if (resultObj!=null)
	// {
	// DataBaseUtilities.saveRecord(zielDbHandler, resultObj, overwrite);
	// }
	// else
	// {
	// OutDebug.println(errorOn,"[DataBaseUtilities]copyObject QuellObjekt nicht gefunden Tab/Feld: "+tabnr+"/"+"/"+did);
	//
	// }
	//
	//
	// }
	// }
	// catch (Exception e)
	// {
	// OutDebug.println(errorOn,"[DataBaseUtilities]loadFieldValue Fehler bei generischerMethode Tab/Feld: "+tabnr+"/"+"/"+did,e);
	//
	// }
	//
	// return resultObj;
	// }

	public static XmpSelection getBmLinks(DataBaseHandler objectDbHandler,
			int bmDid, int sectionNr, boolean filterSection)
			throws TomDbException {
		Xmp searchObj = new BookmarkLinks();
		searchObj.setAllFields();
		objectDbHandler.openQuery();
		objectDbHandler.setResultObject(searchObj);

		objectDbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
				BookmarkLinks._097_001_Bookmarks_Fn), QueryPart.equal,
				new QueryOperant(bmDid)));

		if (filterSection) {
			objectDbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
					new QueryOperant(searchObj, BookmarkLinks.sektionNr_Fn),
					QueryPart.equal, new QueryOperant(sectionNr)));
		}

		objectDbHandler.addOrderPart(new OrderPart(new QueryOperant(searchObj,
				BookmarkLinks.sortierNr_Fn), OrderPart.asc));

		XmpSelection result = objectDbHandler.executeQuery();

		return result;

	}

	public static String loadFieldValue(DataBaseHandler quellDbHandler,
			int tabnr, int did, int fieldnr) {
		String value = null;
		Xmp searchObj = null;
		Xmp resultObj = null;
		try {
			switch (tabnr) {
			case 93:
				searchObj = new ContentElemente();
				break;

			}

			if (searchObj != null) {
				searchObj.setDID(did);
				searchObj.setAllFields();
				resultObj = loadRecord(quellDbHandler, searchObj);
				if (resultObj != null) {
					value = getFieldValue(resultObj, fieldnr);

				}
			}

		} catch (Exception e) {
			logger.error(
					"loadFieldValue Fehler bei generischerMethode Tab/Feld/DID: "
							+ tabnr + "/" + fieldnr + "/" + did, e);

		}

		return value;
	}

	public static String getFieldValue(Xmp obj, int feldNummer) {
		/*
		 * Routine überprüft ob sicj der QueryOperant 2 auf eine Objekt bezieht
		 * und gibt ggf. den Qop2 mit den Masterwerten zurück
		 */
		String fieldValue = "";

		if (obj != null) {
			// Objekt passt

			Class cl = obj.getClass();
			Object[] params = {};
			Class[] mParams = {};
			String returnType;

			FieldSpec fSpec = obj.getFieldSpecs()[feldNummer - 1];
			String fieldName = fSpec.getFieldName();
			String mName = XmlBasics.genMethodName("get", fieldName);

			try {
				Method m = cl.getMethod(mName, mParams);
				returnType = m.getReturnType().toString();

				// Behandlung der Formattierten Ausgabe, je nach returnType
				checkType: {
					if (returnType.equalsIgnoreCase("short")) {
						fieldValue = m.invoke(obj, params).toString();

						break checkType;
					}
					if (returnType.equalsIgnoreCase("int")) {
						// Integer value =(Integer)m.invoke(obj,params);
						fieldValue = m.invoke(obj, params).toString();

						break checkType;
					}
					if (returnType.equalsIgnoreCase("long")) {
						// Integer value =(Integer)m.invoke(obj,params);
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType.equalsIgnoreCase("float")) {
						// Float value =(Float)m.invoke(obj,params);
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType.equalsIgnoreCase("double")) {
						// Float value =(Float)m.invoke(obj,params);
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType.equalsIgnoreCase("boolean")) {
						// Boolean value =(Boolean)m.invoke(obj,params);
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.util.GregorianCalendar")) {
						// java.util.GregorianCalendar gDate
						// =((java.util.GregorianCalendar)m.invoke(obj,params));
						fieldValue = m.invoke(obj, params).toString();

						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Date")) {

						// java.sql.Date gDate
						// =((java.sql.Date)m.invoke(obj,params));
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Time")) {
						// java.sql.Time gDate
						// =((java.sql.Time)m.invoke(obj,params));
						fieldValue = m.invoke(obj, params).toString();

						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.lang.String")) {
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.XmlCode")) {
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.HtmlCode")) {
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuffer")) {

						fieldValue = m.invoke(obj, params).toString();

						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuilder")) {
						fieldValue = m.invoke(obj, params).toString();
						break checkType;
					}

					// default Zweig beliebiger Value angenommen

					fieldValue = m.invoke(obj, params).toString();
				}

			} catch (Exception e) {
				logger.error(
						"getFieldValue Fehler bei generischerMethode Obj/Feld: "
								+ obj.getXmlClassTag() + "." + fieldName, e);
				return null;
			}

		}
		return fieldValue;

	}
}
