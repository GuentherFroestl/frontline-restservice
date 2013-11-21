/*
 * DataBaseControl.java
 *
 * Created on 25. September 2005, 11:53
 */

package de.gammadata.tom.four_d_access.dataBase;

/**
 * 
 * @author günther
 */
public class DataBaseSpec {
	private String dataBaseId;
	private String serverAddress;
	private int serverPort;
	private String serverProtokoll;
	private String dataBaseType;
	private int dataBaseMajorVersion;
	private int dataBaseMinorVersion;
	private String dataBaseName;
	private String dataBaseHandlerClass;
	private String userName;
	private String pw;
	private String url;

	/** Creates a new instance of DataBaseControl */
	public DataBaseSpec() {
	}

	public void setDataBaseId(String inp) {
		dataBaseId = inp;
	}

	public String getDataBaseId() {
		return dataBaseId;
	}

	public void setServerAddress(String inp) {
		serverAddress = inp;
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerPort(int inp) {
		serverPort = inp;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerProtokoll(String inp) {
		serverProtokoll = inp;
	}

	public String getServerProtokoll() {
		return serverProtokoll;
	}

	public void setDataBaseType(String inp) {
		dataBaseType = inp;
	}

	public String getDataBaseType() {
		return dataBaseType;
	}

	public void setDataBaseMajorVersion(int inp) {
		dataBaseMajorVersion = inp;
	}

	public int getDataBaseMajorVersion() {
		return dataBaseMajorVersion;
	}

	public void setDataBaseMinorVersion(int inp) {
		dataBaseMinorVersion = inp;
	}

	public int getDataBaseMinorVersion() {
		return dataBaseMinorVersion;
	}

	public void setDataBaseName(String inp) {
		dataBaseName = inp;
	}

	public String getDataBaseName() {
		return dataBaseName;
	}

	public void setDataBaseHandlerClass(String inp) {
		dataBaseHandlerClass = inp;
	}

	public String getDataBaseHandlerClass() {
		return dataBaseHandlerClass;
	}

	public void setUserName(String inp) {
		userName = inp;
	}

	public String getUserName() {
		return userName;
	}

	public void setPw(String inp) {
		pw = inp;
	}

	public String getPw() {
		return pw;
	}

	public void setUrl(String inp) {
		url = inp;
	}

	public String getUrl() {
		return url;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataBaseSpec [dataBaseId=" + dataBaseId + ", serverAddress="
				+ serverAddress + ", serverPort=" + serverPort
				+ ", serverProtokoll=" + serverProtokoll + ", dataBaseType="
				+ dataBaseType + ", dataBaseMajorVersion="
				+ dataBaseMajorVersion + ", dataBaseMinorVersion="
				+ dataBaseMinorVersion + ", dataBaseName=" + dataBaseName
				+ ", dataBaseHandlerClass=" + dataBaseHandlerClass
				+ ", userName=" + userName + ", pw=" + pw + ", url=" + url
				+ "]";
	}

}
