/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
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
  public static AddressDTO map(HashMap<String, String> propertyListe, String userId,TaopixTomImportConfig tomImportConfig) {

    AddressDTO adr = new AddressDTO();
    adr.setMandant(tomImportConfig.getMandatorId());

    adr.setUuid(TAOPIX_UUID_STUB + userId);
    //Namen
    adr.setVorname(propertyListe.get("billingcontactfirstname"));
    adr.setName(propertyListe.get("billingcontactlastname"));
    if (propertyListe.containsKey("billingcustomername")) {
      adr.setFirma(propertyListe.get("billingcustomername"));
    }

    //Adresse
    adr.setPlz(propertyListe.get("billingcustomerpostcode"));
    adr.setStadt(propertyListe.get("billingcustomercity"));

    adr.setStrasse(propertyListe.get("billingcustomeraddress1"));
    if (propertyListe.containsKey("billingcustomeraddress2") && propertyListe.get("billingcustomeraddress2").length() > 0) {
      adr.setStrasse(propertyListe.get("billingcustomeraddress1") + ", " + propertyListe.get("billingcustomeraddress2"));
    }

    //Land
    LandDTO land = new LandDTO();
    land.setMandant(tomImportConfig.getMandatorId());
    land.setiSO3166Code_2(propertyListe.get("billingcustomercountrycode"));
    land.setLandName(propertyListe.get("billingcustomercountryname"));
    adr.setLand(land);


    //Telefon
    String telefon = propertyListe.get("billingcustomertelephonenumber");
    if (telefon!=null&&(telefon.startsWith("06") | telefon.startsWith("00436") | telefon.startsWith("+436"))) {
      adr.setMobilTelefon(telefon);
    } else {
      adr.setTelefon(telefon);
    }

    //email
    String email = propertyListe.get("billingcustomeremailaddress");
    adr.setEmail(email);

    return adr;
  }
}
