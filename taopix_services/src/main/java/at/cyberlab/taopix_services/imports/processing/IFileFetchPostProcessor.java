package at.cyberlab.taopix_services.imports.processing;

import java.io.File;

/**
 * Defines a postprocessor, which would be called after a file has been fetched.
 * @author gfr
 */
public interface IFileFetchPostProcessor {
  
  /**
   * process the file.
   * @param file File
   */
  public void process(File file) throws ImportException;
  
}
