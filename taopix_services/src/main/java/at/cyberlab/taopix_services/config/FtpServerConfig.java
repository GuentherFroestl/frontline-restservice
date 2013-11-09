/**
 * 
 */
package at.cyberlab.taopix_services.config;

/**
 * @author gfr
 *
 */
public interface FtpServerConfig {
	
	public String getFtpServerName();
	public void setFtpServerName(String ftpServerName);
	public String getFtpUserName();
	public void setFtpUserName(String ftpUserName);
	public String getFtpPassword();
	public void setFtpPassword(String ftpPassword);
	public String getProcessedFolderName();
	public void setProcessedFolderName(String processedFolderName);

}
