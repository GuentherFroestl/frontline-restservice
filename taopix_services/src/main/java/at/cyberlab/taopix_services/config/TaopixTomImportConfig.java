/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

/**
 * Some configs for the order Import Taopix to Tom
 *
 * @author gfr
 */
public interface TaopixTomImportConfig {

  /**
   * This number is added to all Taopix orders to fit into the Tom Order range.
   *
   * @return Integer, number to add
   */
  public Integer getOrderNumberOffset();

  /**
   * This ID is the Tom Mandator to import the orders to.
   *
   * @return Integer MandatorId
   */
  public Integer getMandatorId();

  /**
   *
   * @return Prefix for the User UUID
   */
  public String getUserUuidPrefix();

  /**
   *
   * @return Prefix for the Order UUID
   */
  public String getOrderUuidPrefix();
}
