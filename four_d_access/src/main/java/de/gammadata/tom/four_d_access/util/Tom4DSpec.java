/*
 * ApplicationControl.java
 *
 * Created on 27. November 2004, 14:07
 */

package de.gammadata.tom.four_d_access.util;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;

/**
 * 
 * @author gfr Singleton, in dem alle allg. gültigen Parameter hinterlegt sind.
 */
public class Tom4DSpec {


	private final String cxdbServerAddress = "192.168.9.84";
	private final String cxdbServerPort = "8888";

	// Context Parameter
	// static String cxdbServerAddress="127.0.0.1";
	// static String cxdbServerPort="8888";
	static String cxdbUserName = "tom";
	static String cxdbPw = "dbase";
	static String cxdbHandlerClass = "com.tom.dataBase.DB4D68Handler";
	static String cxdbMajorVersion = "6";
	static String cxdbMinorVersion = "8";
	static String cxdbType = "4D";
	static String cxdbName = "Tom";
	static String cxdbProtokoll = "TCP";

	/** Creates a new instance of ApplicationControl */
	public Tom4DSpec() {
	}


	/**
	 * @return DataBaseSpec
	 */
	public DataBaseSpec getDataBaseSpec() {
		DataBaseSpec dbSpec = new DataBaseSpec();
		dbSpec.setServerAddress(cxdbServerAddress);
		dbSpec.setServerPort(Integer.parseInt(cxdbServerPort));
		dbSpec.setUserName(cxdbUserName);
		dbSpec.setPw(cxdbPw);

		// Jetzt noch einige Vorgaben zum Test, später per property zu
		// realisieren
		dbSpec.setDataBaseHandlerClass(cxdbHandlerClass);
		dbSpec.setDataBaseMajorVersion(Integer.parseInt(cxdbMajorVersion));
		dbSpec.setDataBaseMinorVersion(Integer.parseInt(cxdbMinorVersion));
		dbSpec.setDataBaseType(cxdbType);
		dbSpec.setDataBaseName(cxdbName);
		dbSpec.setServerProtokoll(cxdbProtokoll);
		return dbSpec;
	}

}
