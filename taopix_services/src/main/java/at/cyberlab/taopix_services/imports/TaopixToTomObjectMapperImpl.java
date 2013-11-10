package at.cyberlab.taopix_services.imports;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.LandDTO;
import java.util.HashMap;

/**
 * Impl. of ITaopixToTomObjectMapper
 *
 * @see ITaopixToTomObjectMapper
 * @author gfr
 */
public class TaopixToTomObjectMapperImpl implements ITaopixToTomObjectMapper {

  private LandDTO defaultLand;

  /**
   * default constructor.
   */
  public TaopixToTomObjectMapperImpl() {
  }

  /**
   * constructor with injection.
   *
   * @param defaultLand LandDTO
   */
  public TaopixToTomObjectMapperImpl(LandDTO defaultLand) {
    this.defaultLand = defaultLand;
  }

  @Override
  public AddressDTO mapAdrFromProperties(HashMap<String, String> propertyListe) {
    AddressDTO adr = new AddressDTO();

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
    if (propertyListe.containsKey("customeraddress2") && !adr.getStrasse().equalsIgnoreCase(propertyListe.get("customeraddress2"))) {
      adr.setStrasse(propertyListe.get("customeraddress1") + ", " + propertyListe.get("customeraddress2"));
    }

    //Land
    LandDTO land = getDefaultLand();
    String iso2Code = propertyListe.get("customercountrycode");
    if (iso2Code != null
            && ((land == null) || (!land.getiSO3166Code_2().equalsIgnoreCase(iso2Code)))) {
      //TODO Land neu bestimmen
      land = new LandDTO();
      land.setiSO3166Code_2(iso2Code);
    }
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

  @Override
  public BelegDTO mapBelegFromProperties(String orderID, HashMap<String, String> headerProperties, HashMap<String, String> itemProperties, HashMap<String, String> shippingProperties) {
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
  }

  public LandDTO getDefaultLand() {
    return defaultLand;
  }

  public void setDefaultLand(LandDTO defaultLand) {
    this.defaultLand = defaultLand;
  }
}
