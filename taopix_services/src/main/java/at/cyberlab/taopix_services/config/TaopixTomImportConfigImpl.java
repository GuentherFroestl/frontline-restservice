/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

/**
 *
 * @author gfr
 */
public class TaopixTomImportConfigImpl implements TaopixTomImportConfig {

  private Integer orderNumberOffset = 12500000;
  private Integer mandatorId = 2;
  private String userUuidPrefix = "TAOPIX_USER_";
  private String orderUuidPrefix = "TAOPIX_ORDER_";

  @Override
  public Integer getOrderNumberOffset() {
    return orderNumberOffset;
  }

  public void setOrderNumberOffset(Integer orderNumberOffset) {
    this.orderNumberOffset = orderNumberOffset;
  }

  @Override
  public Integer getMandatorId() {
    return mandatorId;
  }

  public void setMandatorId(Integer mandatorId) {
    this.mandatorId = mandatorId;
  }

  @Override
  public String getUserUuidPrefix() {
    return userUuidPrefix;
  }

  public void setUserUuidPrefix(String userUuidPrefix) {
    this.userUuidPrefix = userUuidPrefix;
  }

  @Override
  public String getOrderUuidPrefix() {
    return orderUuidPrefix;
  }

  public void setOrderUuidPrefix(String orderUuidPrefix) {
    this.orderUuidPrefix = orderUuidPrefix;
  }
}
