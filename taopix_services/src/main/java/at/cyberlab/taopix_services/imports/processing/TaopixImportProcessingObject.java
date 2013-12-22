/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.inputobjects.TaopixOrder;
import java.io.File;

/**
 * Wrapper for the TaopixOrder, carring order objects and messages.
 *
 * @author gfr
 */
public class TaopixImportProcessingObject {

  private TaopixOrder taopixOrder;
  private StringBuilder messages = new StringBuilder();
  private File pdfOrderFile;

  public TaopixOrder getTaopixOrder() {
    return taopixOrder;
  }

  public void setTaopixOrder(TaopixOrder taopixOrder) {
    this.taopixOrder = taopixOrder;
  }

  /**
   * to collect messages.
   *
   * @return
   */
  public StringBuilder getMessages() {
    return messages;
  }


  public File getPdfOrderFile() {
    return pdfOrderFile;
  }

  public void setPdfOrderFile(File pdfOrderFile) {
    this.pdfOrderFile = pdfOrderFile;
  }
}
