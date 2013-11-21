/*
 * DataBaseFactory.java
 *
 * Created on 25. September 2005, 12:33
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * 
 * @author günther
 */
public class DataBaseFactory {
	static boolean printOn = true;
	static boolean errorOn = true;

	private static Logger logger = Logger.getLogger(DataBaseFactory.class);

	/** Creates a new instance of DataBaseFactory */
	protected DataBaseFactory() {
	}

	public static DataBaseHandler getDataBaseHandler(DataBaseSpec inp)
			throws Exception {
		try {
			DataBaseHandler dbHandler = (DataBaseHandler) Class.forName(
					inp.getDataBaseHandlerClass()).newInstance();
			dbHandler.setDataBaseSpec(inp);
			return dbHandler;
		} catch (Exception e) {
			throw e;
		}
	}

	public static Connection openPooledConnection(DataBaseSpec dbSpec) {
		Connection cnx = null;
		try {

			String dbId = dbSpec.getDataBaseId();
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:/comp/env");
			DataSource ds = (DataSource) envCtx.lookup(dbId);

			cnx = ds.getConnection();
			logger.info("openConnection: " + dbSpec.getDataBaseId());
		} catch (Exception e) {
			logger.info(
					"Fehler beim öffnen Connection Ressource: "
							+ dbSpec.getDataBaseId(), e);
		}
		return cnx;
	}

}
