/**
 * 
 */
package at.cyberlab.taopix_services.config;

/**
 * @author gfr
 *
 */
public class OsxFileSystemConfigImpl extends GenericFileSystemConfigImpl{
	
	String rootDirPath = "/cyberlab/";
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
