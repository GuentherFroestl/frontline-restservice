/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.mapper;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.LandDTO;
import java.util.HashMap;

/**
 * Mapper for mapping address properties to a AddressDTO.
 *
 * @author gfr
 */
public class TaopixAddressMapper {

  public static final String TAOPIX_UUID_STUB = "TAOPIX_";

  /**
   * mapping address properties to a AddressDTO.
   *
   * @param propertyListe HashMap with properties from the parsed xml file
   * @param defaultLand LandDTO
   * @return AddressDTO
   */
  public static AddressDTO map(HashMap<String, String> propertyListe, String userId) {

    AddressDTO adr = new AddressDTO();

    adr.setUuid(TAOPIX_UUID_STUB + userId);
    //Namen
    adr.setVorname(propertyListe.get("contactfirstname"));
    adr.setName(propertyListe.get("contactlastname"));
    if (propertyListe.containsKey("customername")) {
      adr.setFirma(propertyListe.get("customername"));
    }

    //Adresse
    adr.setPlz(propertyListe.get("customerpostcode"));
    adr.setStadt(propertyListe.get("customercity"));

    adr.setStrasse(propertyListe.get("customeraddress1"));
    if (propertyListe.containsKey("customeraddress2") && propertyListe.get("customeraddress2").length() > 0) {
      adr.setStrasse(propertyListe.get("customeraddress1") + ", " + propertyListe.get("customeraddress2"));
    }

    //Land
    LandDTO land = new LandDTO();
    land.setiSO3166Code_2(propertyListe.get("customercountrycode"));
    land.setLandName(propertyListe.get("customercountryname"));
    adr.setLand(land);


    //Telefon
    String telefon = propertyListe.get("customertelephonenumber");
    if (telefon.startsWith("06") | telefon.startsWith("00436") | telefon.startsWith("+436")) {
      adr.setMobilTelefon(telefon);
    } else {
      adr.setTelefon(telefon);
    }

    //email
    String email = propertyListe.get("customeremailaddress");
    adr.setEmail(email);

    return adr;
  }
}
