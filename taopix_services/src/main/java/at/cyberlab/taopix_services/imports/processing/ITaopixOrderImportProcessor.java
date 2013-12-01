/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.imports.ImportException;

/**
 *
 * @author gfr
 */
public interface ITaopixOrderImportProcessor {

  /**
   * take a step in order processing
   *
   * @param order TaopixImportProcessingObject
   */
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException;
}
