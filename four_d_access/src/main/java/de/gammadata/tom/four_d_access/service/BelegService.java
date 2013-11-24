/**
 *
 */
package de.gammadata.tom.four_d_access.service;

import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;


import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.BestellungDTO;
import com.tom.service.dto.Status;
import com.tom.service.facade.BelegFacade;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.AdressenDAO;
import de.gammadata.tom.four_d_access.dao.AuftragDAO;
import de.gammadata.tom.four_d_access.dao.BestellungDAO;
import de.gammadata.tom.four_d_access.dao.IBelegDAO;
import de.gammadata.tom.four_d_access.dao.LieferscheinDAO;
import de.gammadata.tom.four_d_access.dao.RechnungDAO;
import de.gammadata.tom.four_d_access.dao.SteuerBetraegeDAO;
import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Adressen;
import de.gammadata.tom.four_d_access.util.mapper.AddressMapper;
import de.gammadata.tom.four_d_access.util.mapper.SteuerMapper;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * @author gfr
 *
 */
public class BelegService extends Abstract4DService implements BelegFacade {

  private final Logger logger = Logger.getLogger(this.getClass());
  AdressenDAO adressenDao;
  SteuerBetraegeDAO steuerBetraegeDAO;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec
   */
  public BelegService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    adressenDao = new AdressenDAO(dataBaseSpec);
    steuerBetraegeDAO = new SteuerBetraegeDAO(dataBaseSpec);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.service.facade.BelegFacade#searchBeleg(com.tom.service.dto.SearchDTO
   * )
   */
  @Override
  public List<BelegKopfDTO> searchBeleg(BelegSearchRequest searchReq)
          throws TomException {
    List<BelegKopfDTO> li = new ArrayList<BelegKopfDTO>();
    try {
      li = getBelegDAO(searchReq.getBelegType()).searchBelege(searchReq);

    } catch (TomDbException e) {
      logger.error("searchBeleg() fehler=" + e.getMessage(), e);
      throw new TomException("searchBeleg() fehler=" + e.getMessage());
    }

    return li;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.tom.service.facade.BelegFacade#loadBelegByUuid(java.lang.String)
   */
  @Override
  public BelegDTO loadBelegByUuid(BelegTyp type, String uuid)
          throws TomException {
    BelegDTO res;
    try {
      // Objekt laden und mit Relationen anreichern
      res = getBelegDAO(type).loadBelegByUuid(uuid);
      res = addAdditionaProperties(res);
    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }

  @Override
  public BelegDTO loadBelegById(BelegTyp type, Integer id)
          throws TomException {
    BelegDTO res;
    try {
      // Objekt laden und mit Relationen anreichern
      res = getBelegDAO(type).loadBelegById(id);
      res = addAdditionaProperties(res);

    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }

  /**
   * Loads a Beleg by it's number.
   *
   * @param type BelegTyp
   * @param belegNumber Integer
   * @return BelegDTO
   * @throws TomException
   */
  public BelegDTO loadBelegByNumber(BelegTyp type, Integer belegNumber)
          throws TomException {
    BelegDTO res;
    try {
      // Objekt laden und mit Relationen anreichern
      res = getBelegDAO(type).loadBelegByNumber(belegNumber);
      res = addAdditionaProperties(res);

    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }

  /**
   * Checks if a Beleg exsits by its number.
   *
   * @param type BelegTyp
   * @param belegNumber Integer
   * @return BelegDTO
   * @throws TomException
   */
  public boolean checkBelegByNumber(BelegTyp type, Integer belegNumber)
          throws TomException {
    boolean res = false;
    try {
      // Objekt laden und mit Relationen anreichern
      res = getBelegDAO(type).checkBelegByNumber(belegNumber);

    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }

  public List<BelegDTO> loadPositionenByProjektId(BelegTyp type, Integer pId, Status status) throws TomDbException {
    List<BelegDTO> res = getBelegDAO(type).loadPositionenByProjektId(pId, status);
    return res;
  }

  private BelegDTO addAdditionaProperties(BelegDTO beleg) throws TomException {
    BelegDTO res = addAddressProperties(beleg);
    res = addSteuerBetraege(res);
    res = addPositionsListe(res);

    return res;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.service.facade.BelegFacade#storeBeleg(com.tom.service.dto.BelegDTO
   * )
   */
  @Override
  public BelegDTO createBeleg(BelegDTO beleg) throws TomException {
    if (beleg == null) {
      throw new TomException("Beleg == null");
    }
    if (beleg.getUuid() == null || beleg.getUuid().length() == 0) {
      beleg.setUuid(createUuid());
    }
    BelegDTO result = getBelegDAO(beleg.getBelegTyp()).storeBeleg(beleg);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.service.facade.BelegFacade#updateBeleg(com.tom.service.dto.BelegDTO
   * )
   */
  @Override
  public BelegDTO updateBeleg(BelegDTO beleg) throws TomException {
    // TODO Auto-generated method stub
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.service.facade.BelegFacade#deleteBeleg(com.tom.service.dto.BelegDTO
   * )
   */
  @Override
  public void deleteBeleg(BelegDTO beleg) throws TomException {
    getBelegDAO(beleg.getBelegTyp()).deleteBeleg(beleg);
  }

  /**
   * Fügt die Adressen vollständig hinzu
   *
   * @param beleg BelegDTO mit gesetzten AdressDTO mit ID
   * @return angereichertes BelegDTO
   */
  private BelegDTO addAddressProperties(BelegDTO beleg) throws TomException {
    if (beleg == null) {
      return null;
    }

    //Check ob die Bestelladress aus dem Lieferanten geholt werden muss
    if ((beleg.getAdresse() == null || beleg.getAdresse().getId() == 0)
            && beleg instanceof BestellungDTO && beleg.getLieferAdresse() != null) {
      BestellungDTO best = (BestellungDTO) beleg;
      logger.info("Korrektur für bestellung.adresse mit lieferanten.id=" + best.getLieferant());
    }


    //Adressdaten vervollständigen
    if (beleg.getAdresse() != null && beleg.getAdresse().getId() > 0) {
      Adressen abObj = adressenDao.loadXmpBean(beleg.getAdresse()
              .getId());
      beleg.setAdresse(AddressMapper.mapKopfDaten(abObj));
    }

    // Lieferadresse
    if (beleg.getLieferAdresse() != null
            && beleg.getLieferAdresse().getId() > 0) {
      if (beleg.getAdresse() != null
              && beleg.getAdresse().getId().equals(
              beleg.getLieferAdresse().getId())) {
        beleg.setLieferAdresse(beleg.getAdresse());
      } else {
        try {
          Adressen abObj = adressenDao.loadXmpBean(beleg.getLieferAdresse()
                  .getId());
          beleg.setLieferAdresse(AddressMapper.mapKopfDaten(abObj));
        } catch (TomDbException e) {
          logger.error(
                  "addAddressProperties() fehler=" + e.getMessage(),
                  e);
          throw new TomException("addAddressProperties() Fehler="
                  + e.getMessage());
        }
      }
    } else {
      beleg.setLieferAdresse(null);
    }

    // Rechnungsadresse
    if (beleg.getRechnungsAdresse() != null
            && beleg.getRechnungsAdresse().getId() > 0) {
      if (beleg.getAdresse() != null
              && beleg.getAdresse().equals(
              beleg.getRechnungsAdresse().getId())) {
        beleg.setRechnungsAdresse(beleg.getAdresse());
      } else if (beleg.getLieferAdresse() != null
              && beleg.getLieferAdresse().getId()
              .equals(beleg.getRechnungsAdresse().getId())) {
        beleg.setRechnungsAdresse(beleg.getLieferAdresse());
      } else {
        try {
          Adressen abObj = adressenDao.loadXmpBean(beleg
                  .getRechnungsAdresse().getId());
          beleg.setRechnungsAdresse(AddressMapper.mapKopfDaten(abObj));
        } catch (TomDbException e) {
          logger.error(
                  "addAddressProperties() fehler=" + e.getMessage(),
                  e);
          throw new TomException("addAddressProperties() Fehler="
                  + e.getMessage());
        }
      }
    } else {
      beleg.setRechnungsAdresse(null);
    }
    return beleg;

  }

  /**
   * Fügt die Liste der Steuerbeträge zum Beleg hinzu
   *
   * @param beleg BelegDTO
   * @return BelegDTO
   * @throws TomDbException
   */
  private BelegDTO addSteuerBetraege(BelegDTO beleg) throws TomDbException {
    List<Xmp> sList = steuerBetraegeDAO.getSteuerBetraege(beleg);
    beleg.setSteuerListe(SteuerMapper.map(sList));
    return beleg;
  }

  /**
   * Fügt die Positionsliste hinzu
   *
   * @param beleg BelegDTO
   * @return BelegDTO
   * @throws TomDbException
   */
  private BelegDTO addPositionsListe(BelegDTO beleg) throws TomDbException {

    List<BelegPositionDTO> posList = getBelegDAO(beleg.getBelegTyp())
            .loadPositionsListe(beleg);
    beleg.setPositionsListe(posList);
    return beleg;
  }

  /**
   * Returns das richtige DAO für den BelegType
   *
   * @param type BelegTyp
   * @return IBelegDAO
   * @throws TomException
   */
  private IBelegDAO getBelegDAO(BelegTyp type) throws TomDbException {

    if (BelegTyp.ANGEBOT.equals(type) || BelegTyp.AUFTRAG.equals(type)
            || BelegTyp.ANGEBOT_UND_AUFTRAG.equals(type)) {
      return new AuftragDAO(getDataBaseSpec());
    } else if (BelegTyp.RECHNUNG.equals(type)
            || BelegTyp.GUTSCHRIFT.equals(type)
            || BelegTyp.RECHNUNG_UND_GUTSCHRIFT.equals(type)) {
      return new RechnungDAO(getDataBaseSpec());
    } else if (BelegTyp.LIEFERSCHEIN.equals(type)) {
      return new LieferscheinDAO(getDataBaseSpec());
    } else if (BelegTyp.BESTELLUNG.equals(type)) {
      return new BestellungDAO(getDataBaseSpec());
    } else {
      throw new TomDbException("BelegTyp=" + type + " nicht supported");
    }
  }
}
