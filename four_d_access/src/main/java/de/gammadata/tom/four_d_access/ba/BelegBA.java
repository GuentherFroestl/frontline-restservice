/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.ba;

import com.tom.service.dto.AddressKopfDTO;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.BestellungDTO;
import com.tom.service.facade.BelegFacade;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.AddressService;
import de.gammadata.tom.four_d_access.service.BelegService;
import java.util.List;

/**
 * Supplies Business Objects for the Beleg Domain.
 *
 * @author gfr
 */
public class BelegBA extends AbstractBA implements BelegFacade {

  BelegService belegService;
  AddressService adrService;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec to use
   */
  public BelegBA(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    belegService = new BelegService(dataBaseSpec);
    adrService = new AddressService(dataBaseSpec);
  }

  /**
   *
   * @param searchReq BelegSearchRequest
   * @return List of BelegKopfDTO
   * @throws TomException
   */
  @Override
  public List<BelegKopfDTO> searchBeleg(BelegSearchRequest searchReq) throws TomException {
    return belegService.searchBeleg(searchReq);
  }

  @Override
  public BelegDTO loadBelegByUuid(BelegTyp type, String uuid) throws TomException {
    BelegDTO beleg = belegService.loadBasicBeleg(type, BelegService.LoadByType.BY_UUID, uuid);
    addAdditionalProperties(beleg);
    return beleg;
  }

  @Override
  public BelegDTO loadBelegById(BelegTyp type, Integer id) throws TomException {
    BelegDTO beleg = belegService.loadBasicBeleg(type, BelegService.LoadByType.BY_ID, id);
    addAdditionalProperties(beleg);
    return beleg;
  }

  public BelegDTO loadBelegByNumber(BelegTyp type, Integer id) throws TomException {
    BelegDTO beleg = belegService.loadBasicBeleg(type, BelegService.LoadByType.BY_NUMBER, id);
    addAdditionalProperties(beleg);
    return beleg;
  }

  @Override
  public BelegDTO createBeleg(BelegDTO beleg) throws TomException {
    return belegService.createBeleg(beleg);
  }

  @Override
  public BelegDTO updateBeleg(BelegDTO beleg) throws TomException {
    return belegService.updateBeleg(beleg);
  }

  @Override
  public void deleteBeleg(BelegDTO beleg) throws TomException {
    belegService.deleteBeleg(beleg);
  }

  /**
   * Fügt die Adressen vollständig hinzu
   *
   * @param beleg BelegDTO mit gesetzten AdressDTO mit ID
   * @return angereichertes BelegDTO
   */
  private void addAddressProperties(BelegDTO beleg) throws TomException {
    if (beleg == null) {
      throw new TomDbException("Beleg == null");
    }

    //Check ob die Bestelladress aus dem Lieferanten geholt werden muss
    if ((beleg.getAdresse() == null || beleg.getAdresse().getId() == 0)
            && beleg instanceof BestellungDTO && beleg.getLieferAdresse() != null) {
      BestellungDTO best = (BestellungDTO) beleg;
      logger.info("Korrektur für bestellung.adresse mit lieferanten.id=" + best.getLieferant());
    }


    //Adressdaten vervollständigen
    //Beleg Address
    if (beleg.getAdresse() != null && beleg.getAdresse().getId() > 0) {
      AddressKopfDTO adr = adrService.loadAddressKopfById(beleg.getAdresse().getId().toString());
      beleg.setAdresse(adr);
    }

    // Lieferadresse
    if (beleg.getLieferAdresse() != null
            && beleg.getLieferAdresse().getId() > 0) {
      if (beleg.getAdresse() != null
              && beleg.getAdresse().getId().equals(
              beleg.getLieferAdresse().getId())) {
        beleg.setLieferAdresse(beleg.getAdresse());
      } else {
        AddressKopfDTO adr = adrService.loadAddressKopfById(beleg.getLieferAdresse().getId().toString());
        beleg.setLieferAdresse(adr);
      }
    }

    // Rechnungsadresse
    if (beleg.getRechnungsAdresse() != null
            && beleg.getRechnungsAdresse().getId() > 0) {
      if (beleg.getAdresse() != null
              && beleg.getAdresse().getId().equals(
              beleg.getRechnungsAdresse().getId())) {
        beleg.setRechnungsAdresse(beleg.getAdresse());
      } else if (beleg.getLieferAdresse() != null
              && beleg.getLieferAdresse().getId()
              .equals(beleg.getRechnungsAdresse().getId())) {
        beleg.setRechnungsAdresse(beleg.getLieferAdresse());
      } else {
        AddressKopfDTO adr = adrService.loadAddressKopfById(beleg.getRechnungsAdresse().getId().toString());
        beleg.setRechnungsAdresse(adr);
      }
    }
  }

  /**
   * Additiona Properties like PosList, taxes, Addresses.
   *
   * @param beleg BelegDTO
   * @throws TomException
   */
  private void addAdditionalProperties(BelegDTO beleg) throws TomException {
    if (beleg == null) {
      throw new TomDbException("Beleg == null");
    }
    addAddressProperties(beleg);
    belegService.addPositionsListe(beleg);
    belegService.addSteuerBetraege(beleg);
  }
}
