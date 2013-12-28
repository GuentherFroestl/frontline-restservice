package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.FtpServerConfig;
import java.io.File;
import java.util.List;

/**
 * Defines an utility which fetches files from a ftp server into a given directory.
 * there are several maode of fetching, FETCH_ALL_FILES or FETCH_NEW_FILES
 * a processing hook for further treatment can be set to enable on the fly postprocessing
 * @author gfr
 */
public interface IFtpFilesFetcher {
  
  public enum FetchMode{
    /**
     * all files will be fetched, existing files in target will be overwritten.
     */
  FETCH_ALL_FILES,
  /**
   * only new, not in target existing files, will be fetched.
   */
  FETCH_NEW_FILES
          
  }
  /**
   * Do the file loading, according to the given parameters.
   * @param config FtpServerConfig
   * @param targetDirectory String
   * @param mode FetchMode
   * @return List of Strings with absolute pathes of fetched files.
   */
  public List<String> fetchFtpFiles(FtpServerConfig config, String targetDirectory, FetchMode mode) throws ImportException;
  
  /**
   * Fetch one file from the FTP Server.
   * @param config FtpServerConfig
   * @param remoteFilename String name of the remote ftpfile
   * @param outputFile File the output file
   * @return boolean true, if OK
   */
  public boolean fetchFtpFile(FtpServerConfig config, String remoteFilename,File outputFile)  throws ImportException ;
  
  /**
   * Set the Postprocessor, which will be called after a file was successful fetched.
   * @param processor IFileFetchPostProcessor
   */
  public void setIFileFetchPostProcessor(IFileFetchPostProcessor processor);
  
}
