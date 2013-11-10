/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegDTO;
import java.util.HashMap;

/**
 * Genric definition of a builder for taopix order properties.
 *
 * @author gfr
 */
public interface ITaopixToTomObjectMapper {

  /**
   * the address builder methode.
   *
   * @param propertyListe HashMap of String, String
   * @return AddressDTO
   */
  public AddressDTO mapAdrFromProperties(HashMap<String, String> propertyListe);

  /**
   * the order builder methode.
   *
   * @param orderID orderNumber
   * @param headerProperties HashMap of String, String
   * @param itemProperties HashMap of String, String
   * @param shippingProperties HashMap of String, String
   * @return BelegDTO
   */
  public BelegDTO mapBelegFromProperties(String orderID, HashMap<String, String> headerProperties,
          HashMap<String, String> itemProperties,
          HashMap<String, String> shippingProperties);
}
