/**
 * 
 */
package at.cyberlab.taopix_services.config;

/**
 * @author gfr
 *
 */
public abstract class GenericFileSystemConfigImpl implements FileSystemConfig {

	private String configDirPath="config/";
	private String dataDirPath="data/";
	private String pathSeparartor="/";

	/**
	 * @see com.tomagency.cyberlab.server.config.FileSystemConfig#getFileDirPath()
	 */
	public String getDataDirPath() {
		return getRootDirPath()+dataDirPath;
	}
	
	/**
	 * @see com.tomagency.cyberlab.server.config.FileSystemConfig#getConfigDirPath()
	 */
	public String getConfigDirPath() {
		return getRootDirPath()+configDirPath;
	}

	/**
	 * @see com.tomagency.cyberlab.server.config.FileSystemConfig#getPathSeparator()
	 */
	public abstract String getPathSeparator();

	/**
	 * @see com.tomagency.cyberlab.server.config.FileSystemConfig#getRootDirPath()
	 */
	public abstract String getRootDirPath();

}
