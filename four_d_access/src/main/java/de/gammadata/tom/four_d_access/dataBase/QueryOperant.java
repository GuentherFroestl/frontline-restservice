/*
 * QueryOperant.java
 *
 * Created on 27. September 2005, 18:11
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import de.gammadata.tom.four_d_access.util.LocaleFormatter;
import de.gammadata.tom.four_d_access.xml.FieldSpec;
import de.gammadata.tom.four_d_access.xml.XmlBasics;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * 
 * @author günther
 */
public class QueryOperant {

	private static Logger logger = Logger.getLogger(QueryOperant.class);

	public static final int typeFeld = -1;
	public static final int typeValue = 0;
	public static final int typeStringValue = 1;
	public static final int typeSqlDateValue = 2;
	public static final int typeIntValue = 3;
	public static final int typeDoubleValue = 4;
	public static final int typeBooleanValue = 5;
	public static final int typeSqlTimeValue = 6;
	public static final int typeSqlRelativeDateValue = 7;
	public static final int typeSqlRelativeTimeValue = 8;

	public static final int typeMasterObjectField = 10;

	private boolean istFeld = true;
	private int type = 1;

	private String tableName;
	private int tabNummer;
	private String fieldName;
	private int fieldNummer;

	private String value;
	private String stringValue;
	private java.sql.Date sqlDateValue;
	private int dateOffset;
	private java.sql.Time sqlTimeValue;
	private int timeOffset;
	private int intValue;
	private double doubleValue;
	private boolean booleanValue;

	/** Creates a new instance of QueryOperant */
	public QueryOperant() {
	}

	public QueryOperant(Xmp xObj, int fieldNr) {
		this.tableName = xObj.getXmlClassTag();
		this.tabNummer = xObj.getDbTabNummer();
		this.fieldName = xObj.getFieldSpecs()[fieldNr - 1].getFieldName();
		this.fieldNummer = xObj.getFieldSpecs()[fieldNr - 1].getFieldNumber();
		istFeld = true;
		type = typeFeld;
	}

	public QueryOperant(String tableName, String fieldName) {
		this.tableName = tableName;
		this.fieldName = fieldName;
		istFeld = true;
		type = typeFeld;
	}

	public QueryOperant(int tabNummer, int fieldNummer) {
		this.tabNummer = tabNummer;
		this.fieldNummer = fieldNummer;
		istFeld = true;
		type = typeFeld;
	}

	public QueryOperant(String value) {
		this.stringValue = value;
		type = this.typeStringValue;
		istFeld = false;
	}

	public QueryOperant(java.sql.Date value) {
		this.sqlDateValue = value;
		type = this.typeSqlDateValue;
		istFeld = false;
	}

	public QueryOperant(java.util.Date value) {
		if (value != null) {
			this.sqlDateValue = new java.sql.Date(value.getTime());
			type = this.typeSqlDateValue;
			istFeld = false;
		}
	}

	public QueryOperant(java.sql.Date value, int offsetDays) {
		this.sqlDateValue = value;
		this.dateOffset = offsetDays;
		type = this.typeSqlRelativeDateValue;
		istFeld = false;
	}

	public QueryOperant(java.sql.Time value) {
		this.sqlTimeValue = value;
		this.type = this.typeSqlTimeValue;
		istFeld = false;
	}

	public QueryOperant(java.sql.Time value, int offsetSeconds) {
		this.sqlTimeValue = value;
		this.timeOffset = offsetSeconds;
		this.type = this.typeSqlRelativeTimeValue;
		istFeld = false;
	}

	public QueryOperant(int inp) {
		this.intValue = inp;
		this.type = this.typeIntValue;
		istFeld = false;
	}

	public QueryOperant(double inp) {
		this.doubleValue = inp;
		this.type = this.typeDoubleValue;
		istFeld = false;
	}

	public QueryOperant(boolean inp) {
		this.booleanValue = inp;
		this.type = this.typeBooleanValue;
		istFeld = false;
	}

	public void setXmpFieldValue(Xmp xObj, int feldNummer) {
		if (xObj != null) {
			// Objekt passt
			Class cl = xObj.getClass();
			Object[] params = {};
			Class[] mParams = {};
			String returnType;
			FieldSpec fSpec = xObj.getFieldSpecs()[feldNummer - 1];
			String fieldName = fSpec.getFieldName();
			String mName = XmlBasics.genMethodName("get", fieldName);

			try {
				Method m = cl.getMethod(mName, mParams);
				returnType = m.getReturnType().toString();

				// Behandlung der Formattierten Ausgabe, je nach returnType
				checkType: {
					if (returnType.equalsIgnoreCase("short")) {
						Short value = (Short) m.invoke(xObj, params);
						this.setIntValue(value.intValue());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("int")) {
						Integer value = (Integer) m.invoke(xObj, params);
						this.setIntValue(value.intValue());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("long")) {
						Integer value = (Integer) m.invoke(xObj, params);
						this.setIntValue(value.intValue());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("float")) {
						Float value = (Float) m.invoke(xObj, params);
						this.setDoubleValue(value.doubleValue());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("double")) {
						Float value = (Float) m.invoke(xObj, params);
						this.setDoubleValue(value.doubleValue());
						break checkType;
					}
					if (returnType.equalsIgnoreCase("boolean")) {
						Boolean value = (Boolean) m.invoke(xObj, params);
						this.setBooleanValue(value.booleanValue());
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.util.GregorianCalendar")) {
						java.util.GregorianCalendar gDate = ((java.util.GregorianCalendar) m
								.invoke(xObj, params));
						this.setSqlDateValue(new java.sql.Date(gDate
								.getTimeInMillis()));

						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Date")) {

						java.sql.Date gDate = ((java.sql.Date) m.invoke(xObj,
								params));
						this.setSqlDateValue(gDate);
						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.sql.Time")) {
						java.sql.Time gDate = ((java.sql.Time) m.invoke(xObj,
								params));
						this.setSqlTimeValue(gDate);

						break checkType;
					}
					if (returnType.equalsIgnoreCase("class java.lang.String")) {
						this.setStringValue((String) m.invoke(xObj, params));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.XmlCode")) {
						this.setStringValue((String) m.invoke(xObj, params));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class de.gammadata.tom.four_d_access.util.HtmlCode")) {
						this.setStringValue((String) m.invoke(xObj, params));
						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuffer")) {

						this.setStringValue(m.invoke(xObj, params).toString());

						break checkType;
					}
					if (returnType
							.equalsIgnoreCase("class java.lang.StringBuilder")) {
						this.setStringValue(m.invoke(xObj, params).toString());
						break checkType;
					}

					// default Zweig beliebiger Value angenommen

					this.setValue(m.invoke(xObj, params).toString());
				}

			} catch (Exception e) {
				logger.error(
						")getQueryOperator2 Fehler bei generischerMethode FeldeName: "
								+ fieldName, e);
			}

		}

	}

	public void setTableAndField(String tableName, String fieldName) {
		this.tableName = tableName;
		this.fieldName = fieldName;
		istFeld = true;
		type = typeFeld;
	}

	public void setTableName(String inp) {
		tableName = inp;
		istFeld = true;
		type = typeFeld;
	}

	public String getTableName() {
		return tableName;
	}

	public void setFieldName(String inp) {
		fieldName = inp;
		istFeld = true;
		type = typeFeld;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFeldNummer(int nummer) {
		this.fieldNummer = nummer;
	}

	public int getFeldNummer() {
		return fieldNummer;
	}

	public void setTabNummer(int nummer) {
		this.tabNummer = nummer;
	}

	public int getTabNummer() {
		return tabNummer;
	}

	public void setValue(String inp) {
		this.value = inp;
		this.type = this.typeValue;
		istFeld = false;
	}

	public String getValue() {
		return value;
	}

	public void setStringValue(String inp) {
		this.stringValue = inp;
		this.type = this.typeStringValue;
		istFeld = false;
	}

	public String getStringValue() {
		return stringValue;

	}

	public void setSqlDateValue(java.sql.Date value) {
		this.sqlDateValue = value;
		this.type = this.typeSqlDateValue;
		istFeld = false;
	}

	public void setSqlDateValue(java.sql.Date value, int offsetDays) {
		this.sqlDateValue = value;
		this.dateOffset = offsetDays;
		type = this.typeSqlRelativeDateValue;
		istFeld = false;
	}

	public void setSqlRelativeDateValue(int offsetDays) {
		this.dateOffset = offsetDays;
		long offset = (long) 86400000 * this.dateOffset;
		this.sqlDateValue = new java.sql.Date(System.currentTimeMillis()
				+ offset);
		type = this.typeSqlRelativeDateValue;
		istFeld = false;
	}

	public java.sql.Date getSqlDateValue() {
		if (type == typeSqlRelativeDateValue) {
			long offset = (long) 86400000 * this.dateOffset;
			this.sqlDateValue = new java.sql.Date(System.currentTimeMillis()
					+ offset);
			return this.sqlDateValue;

		} else {
			return this.sqlDateValue;
		}
	}

	public void setSqlTimeValue(java.sql.Time value) {
		this.sqlTimeValue = value;
		this.type = this.typeSqlTimeValue;
		istFeld = false;
	}

	public void setSqlTimeValue(java.sql.Time value, int offsetSeconds) {
		this.timeOffset = offsetSeconds;
		long offset = (long) 1000 * this.timeOffset;
		this.sqlTimeValue = new java.sql.Time(System.currentTimeMillis()
				+ offset);
		this.type = this.typeSqlRelativeTimeValue;
		istFeld = false;
	}

	public void setSqlRelativeTimeValue(int offsetSeconds) {
		this.timeOffset = offsetSeconds;
		long offset = (long) 1000 * this.timeOffset;
		this.sqlTimeValue = new java.sql.Time(System.currentTimeMillis()
				+ offset);
		this.type = this.typeSqlRelativeTimeValue;
		istFeld = false;
	}

	public java.sql.Time getSqlTimeValue() {
		if (type == typeSqlRelativeTimeValue) {
			long offset = (long) 1000 * this.timeOffset;
			this.sqlTimeValue = new java.sql.Time(System.currentTimeMillis()
					+ offset);
			return this.sqlTimeValue;

		} else {
			return this.sqlTimeValue;
		}
	}

	public void setIntValue(int inp) {
		this.intValue = inp;
		this.type = this.typeIntValue;
		istFeld = false;
	}

	public int getIntValue() {
		return this.intValue;
	}

	public void setDoubleValue(double inp) {
		this.doubleValue = inp;
		this.type = this.typeDoubleValue;
		istFeld = false;
	}

	public double getDoubleValue() {
		return this.doubleValue;
	}

	public void setBooleanValue(boolean inp) {
		this.booleanValue = inp;
		this.type = this.typeBooleanValue;
		istFeld = false;
	}

	public boolean getBooleanValue() {
		return this.booleanValue;
	}

	public boolean isField() {
		return istFeld;
	}

	public boolean isValue() {
		return !(istFeld);
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setVarType(Xmp obj, int queryField, String value,
			LocaleFormatter locFormat) {
		// Result Object holen
		FieldSpec fSpec = obj.getFieldSpecs()[queryField - 1];
		try {
			checkType: {
				if (fSpec.getFieldType().equals("int")) {
					int intValue = locFormat.parseInt(value);
					setIntValue(intValue);
					break checkType;
				}
				if (fSpec.getFieldType().equals("double")) {
					double doubleValue = locFormat.parseDouble(value);
					setDoubleValue(doubleValue);
					break checkType;
				}
				if (fSpec.getFieldType().equals("boolean")) {
					boolean booleanValue = locFormat.parseBoolean(value);
					setBooleanValue(booleanValue);
					break checkType;
				}
				if (fSpec.getFieldType().equals("java.sql.Date")) {
					java.sql.Date dateValue = locFormat.parseSqlDate(value);
					setSqlDateValue(dateValue);
					break checkType;
				}
				if (fSpec.getFieldType().equals("java.sql.Time")) {
					java.sql.Time timeValue = locFormat.parseSqlTime(value);
					setSqlTimeValue(timeValue);
					break checkType;
				}
				if (fSpec.getFieldType().equals("java.lang.String")) {
					setStringValue(value);

					break checkType;
				}
				if (fSpec.getFieldType().equals("java.lang.StringBuilder")) {
					setStringValue(value);

					break checkType;
				}
				setValue(value); // Wert direkt setzen ohne Typisierung da nicht
									// zuordenbar
			}
		} catch (Exception e) {
			setValue(value);
		}
	}

}
