/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.util;

import at.cyberlab.taopix_services.imports.ImportException;

/**
 * Builds a filename out of a numberstring. "6000" to "0006000.xml"
 *
 * @author gfr
 */
public class TaopixFileNameBuilder {

  public static String build(String orderNumber) throws ImportException {
    try {
      int auftragsNummer = Integer.parseInt(orderNumber);
      String normalizedNummer = String.format("%07d", auftragsNummer);
      String fileName = normalizedNummer.concat(".xml");
      return fileName;
    } catch (Exception ex) {
      throw new ImportException(ex);
    }
  }
}
