/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

/**
 * Exception thrown by the iport classes and their methodes.
 * @author gfr
 */
public class ImportException extends Exception{
  
  /**
   * default constructor.
   */
  public ImportException(){
    super();
  }
  /**
   * Constructor.
   * @param message String
   */
  public ImportException(String message){
    super(message);
  }
  /**
   * Constructor.
   * @param ex Exception causing exception
   */
    public ImportException(Exception ex){
    super(ex);
  }
  
}
