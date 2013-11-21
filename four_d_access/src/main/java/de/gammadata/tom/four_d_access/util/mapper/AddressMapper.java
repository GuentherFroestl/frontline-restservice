/**
 *
 */
package de.gammadata.tom.four_d_access.util.mapper;

import de.gammadata.tom.four_d_access.dbBeans.Adressen;
import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.AddressKopfDTO;
import com.tom.service.dto.KundenKopfDTO;
import com.tom.service.dto.LandDTO;

/**
 * Mapped Tom/4D Objekte und DTOs
 *
 * @author gfr_MB
 *
 */
public class AddressMapper extends BaseMapper {

  public static AddressKopfDTO mapKopfDaten(Adressen adr) {

    AddressKopfDTO res = new AddressKopfDTO();
    res.setMandant(adr.getDMandant());
    res.setId(adr.getDID());
    res.setUuid(adr.getUuid());
    res.setVollerName(buildName(" ", adr.getM_026_014_Anrede_Adr(),adr.getVorname(), adr.getNachname(),adr.getFirmenname()));
    return res;
  }

  /**
   * Mapped eine TomAdresse in ein AddressDTO
   *
   * @param adr Adressen
   * @return AddressDTO
   */
  public static AddressDTO map(Adressen adr) {
    if (adr == null) {
      return null;
    }
    AddressDTO res = new AddressDTO();
    res.setMandant(adr.getDMandant());
    res.setAbteilung(adr.getAbteilung());
    res.setEmail(adr.getEMail());
    res.setFirma(adr.getFirmenname());
    res.setId(adr.getDID());

    res.setMobilTelefon(adr.getHandy());
    res.setName(adr.getNachname());
    res.setPlz(adr.getPLZ());
    res.setStadt(adr.getOrt());
    res.setStrasse(adr.getAdressfeld1());
    res.setTelefon(adr.getTelefon());
    res.setTitel(adr.getTitel());
    res.setVorname(adr.getVorname());
    res.setUuid(adr.getUuid());
    res.setInaktiv(adr.getInaktiv());
    //Land
        if (adr.get_040_001_Länder_DID() > 0) {
      LandDTO land = new LandDTO();
      land.setId(adr.get_040_001_Länder_DID());
      land.setPostCode(adr.getM_040_012_Länder_PostCode());
      res.setLand(land);
    }
    //Kunde
    if (adr.get_068_001_KundenDID() > 0) {
      KundenKopfDTO kunde = new KundenKopfDTO();
      kunde.setId(adr.get_068_001_KundenDID());
      kunde.setKundennummer(adr.getM_068_011_KundenNr());
      res.setKunde(kunde);
    }

    return res;
  }

  /**
   * Mapped ein AdressDTO auf eine TomAdresse
   *
   * @param adr
   * @return
   */
  public static Adressen map(AddressDTO adr) {
    if (adr == null) {
      return null;
    }
    Adressen res = new Adressen();
    if (adr.getId() != null) {
      res.setDID(adr.getId());
    } else {
      res.setDID(0);
    }

    res.setDMandant(adr.getMandant());
    res.setAbteilung(adr.getAbteilung());
    res.setEMail(adr.getEmail());
    res.setFirmenname(adr.getFirma());
    if (adr.getLand() != null) {
      res.set_040_001_Länder_DID(adr.getLand().getId());
      res.setM_040_012_Länder_PostCode(adr.getLand().getPostCode());
    }
    res.setHandy(adr.getMobilTelefon());
    res.setNachname(adr.getName());
    res.setPLZ(adr.getPlz());
    res.setOrt(adr.getStadt());
    res.setAdressfeld1(adr.getStrasse());
    res.setTelefon(adr.getTelefon());
    res.setTitel(adr.getTitel());
    res.setVorname(adr.getVorname());
    res.setUuid(adr.getUuid());
    res.setInaktiv(adr.getInaktiv());

    // Fieldlist auf gemappte felder setzen (View pattern)
    int[] fl = {
      Adressen.dID_Fn, Adressen.dMandant_Fn, Adressen.abteilung_Fn,
      Adressen.eMail_Fn, Adressen.firmenname_Fn,
      Adressen._040_001_Länder_DID_Fn,
      Adressen.m_040_012_Länder_PostCode_Fn, Adressen.handy_Fn,
      Adressen.nachname_Fn, Adressen.pLZ_Fn, Adressen.ort_Fn,
      Adressen.adressfeld1_Fn, Adressen.telefon_Fn,
      Adressen.titel_Fn, Adressen.vorname_Fn, Adressen.uuid_Fn,
      Adressen.inaktiv_Fn
    };
    res.setFieldList(fl);
    return res;
  }
}
