/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.entity;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegDTO;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Beleg with full blown addreses, etc.
 *
 * @author gfr
 */
public class TaopixOrder extends BelegDTO {

  private AddressDTO fullOrderAddress;
  private AddressDTO fullShippingAddress;
  private AddressDTO fullBillingAddress;

  public AddressDTO getFullOrderAddress() {
    return fullOrderAddress;
  }

  public void setFullOrderAddress(AddressDTO fullOrderAddress) {
    this.fullOrderAddress = fullOrderAddress;
  }

  public AddressDTO getFullShippingAddress() {
    return fullShippingAddress;
  }

  public void setFullShippingAddress(AddressDTO fullShippingAddress) {
    this.fullShippingAddress = fullShippingAddress;
  }

  public AddressDTO getFullBillingAddress() {
    return fullBillingAddress;
  }

  public void setFullBillingAddress(AddressDTO fullBillingAddress) {
    this.fullBillingAddress = fullBillingAddress;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE) + " " + super.toString();
  }
}
