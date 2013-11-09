/**
 * 
 */
package at.cyberlab.taopix_services.config;

/**
 * @author gfr
 *
 */
public class LinuxFileSystemConfigImpl extends GenericFileSystemConfigImpl {

	String rootDirPath = "/var/cyberlab/";
	String pathSeparator= "/";

	@Override
	public String getRootDirPath() {
		return rootDirPath;
	}

	@Override
	public String getPathSeparator() {
		return pathSeparator;
	}

}
