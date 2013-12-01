/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.inputobjects.TaopixOrder;

/**
 * Wrapper for the TaopixOrder, carring order objects and messages.
 *
 * @author gfr
 */
public class TaopixImportProcessingObject {

  private TaopixOrder taopixOrder;
  private StringBuilder messages = new StringBuilder();

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

  /**
   * to collect messages, should be not set.
   */
  public void setMessages(StringBuilder messages) {
    this.messages = messages;
  }
}
