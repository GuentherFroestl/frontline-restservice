/**
 * 
 */
package com.tomagency.cyberlab.server.config;

/**
 * @author gfr
 *
 */
public class FtpServerConfigImpl implements FtpServerConfig {

	private String ftpPassword;
	private String ftpServerName;
	private String ftpUserName;
	private String processedFolderName;

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#getFtpPassword()
	 */
	public String getFtpPassword() {
		return ftpPassword;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#getFtpServerName()
	 */
	public String getFtpServerName() {
		return ftpServerName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#getFtpUserName()
	 */
	public String getFtpUserName() {
		return ftpUserName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#getProcessedFolderName()
	 */
	public String getProcessedFolderName() {
		return processedFolderName;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#setFtpPassword(java.lang.String)
	 */
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword=ftpPassword;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#setFtpServerName(java.lang.String)
	 */
	public void setFtpServerName(String ftpServerName) {
		this.ftpServerName=ftpServerName;

	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#setFtpUserName(java.lang.String)
	 */
	public void setFtpUserName(String ftpUserName) {
		this.ftpUserName=ftpUserName;

	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FtpServerConfig#setProcessedFolderName(java.lang.String)
	 */
	public void setProcessedFolderName(String processedFolderName) {
		this.processedFolderName=processedFolderName;
	}

}
