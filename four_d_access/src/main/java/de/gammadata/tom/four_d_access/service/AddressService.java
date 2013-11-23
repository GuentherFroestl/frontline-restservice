/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.LandDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.facade.AddressFacade;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.AdressenDAO;
import de.gammadata.tom.four_d_access.dao.LaenderDAO;
import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.dao.TomDbObjectNotFoundException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Adressen;
import de.gammadata.tom.four_d_access.dbBeans.Laender;
import de.gammadata.tom.four_d_access.util.mapper.AddressMapper;
import de.gammadata.tom.four_d_access.util.mapper.LandMapper;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.List;

/**
 *
 * @author gfr
 */
public class AddressService extends Abstract4DService implements AddressFacade {

  AdressenDAO adressenDao;
  LaenderDAO laenderDao;
  LandMapper landMapper = new LandMapper();

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec
   */
  public AddressService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    adressenDao = new AdressenDAO(dataBaseSpec);
    laenderDao = new LaenderDAO(dataBaseSpec);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.ejb.service.AddressServiceLocal#searchAddresses(java.lang.String)
   */
  @Override
  public List<AddressDTO> searchAddresses(SearchByStringRequest req)
          throws TomException {
    try {
      XmpSelection res = adressenDao.searchAdressen(req);
      List<AddressDTO> adrLi = AddressMapper.mapSelection(res);
      return adrLi;

    } catch (TomDbException e) {
      logger.error("Fehler beim Zugriff auf TomDB ", e);
      throw new TomException("Fehler beim Zugriff auf TomDB ", e);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.ejb.service.AddressServiceLocal#loadAddressById(java.lang.String)
   */
  @Override
  public AddressDTO loadAddressById(String id) throws TomException {
    try {
      Adressen adr = adressenDao.loadXmpBean(Integer.parseInt(id));
      return AddressMapper.map(adr);
    } catch (NumberFormatException e) {
      logger.error("Fehler beim parsen id ", e);
      throw new TomException("Fehler beim parsen id " + e.getMessage());
    } catch (TomDbObjectNotFoundException e) {
      logger.info(e.getMessage());
      throw new TomException(e);
    } catch (TomDbException e2) {
      logger.error("Fehler beim Zugriff auf TomDB ", e2);
      throw new TomException("Fehler beim Zugriff auf TomDB ", e2);
    }
  }

  @Override
  public AddressDTO loadAddressByUuid(String uid) throws TomException {
    try {
      Adressen adr = adressenDao.loadXmpBeanByUuid(uid);
      return AddressMapper.map(adr);
    } catch (NumberFormatException e) {
      logger.error("Fehler beim parsen id ", e);
      throw new TomException("Fehler beim parsen id " + e.getMessage());
    } catch (TomDbObjectNotFoundException e) {
      logger.info(e.getMessage());
      throw new TomException(e);
    } catch (TomDbException e1) {
      logger.error("Fehler beim Zugriff auf TomDB ", e1);
      throw new TomException("Fehler beim Zugriff auf TomDB ", e1);
    }
  }

  @Override
  public AddressDTO createAddress(AddressDTO adr) throws TomException {
    if (adr == null) {
      throw new TomException("Fehler AddressDTO ==null");
    }
    if (adr.getId() != null && adr.getId() != 0) {
      throw new TomException(
              "Fehler AddressDTO.id !=null, kein neues Objekt");
    }
    // TODO Validierung des AdressDTO ??

    if (adr.getUuid() == null || adr.getUuid().length() == 0) {
      adr.setUuid(createUuid());
    }

    //Land sync
    LandDTO land = syncLand(adr.getLand());
    adr.setLand(land);

    Adressen tAdr = AddressMapper.map(adr);
    Adressen radr;
    try {
      radr = adressenDao.storeXmpBean(tAdr);
    } catch (TomDbException e) {
      logger.error(e.getMessage(), e);
      throw new TomException(e);
    }
    return AddressMapper.map(radr);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.ejb.service.AddressServiceLocal#storeAddress(com.tom.ejb.dto.
   * AddressDTO)
   */
  @Override
  public AddressDTO updateAddress(AddressDTO adr) throws TomException {
    if (adr == null) {
      throw new TomException("Fehler AddressDTO ==null");
    }
    if ((adr.getId() == null || adr.getId() == 0)
            && (adr.getUuid() == null || adr.getUuid().length() == 0)) {
      throw new TomException("Fehler id oder uuid fehlt");
    }
    // TODO Validierung des AdressDTO ??

    if (adr.getUuid() == null || adr.getUuid().length() == 0) {
      adr.setUuid(createUuid());
    }
    Adressen tAdr = AddressMapper.map(adr);
    Adressen radr;
    try {
      radr = adressenDao.storeXmpBean(tAdr);
      return AddressMapper.map(radr);
    } catch (TomDbException e) {
      logger.error(e.getMessage(), e);
      throw new TomException(e);
    }

  }

  /**
   * Synchronization of an Address. Checks if the given Address already exists. If yes, it will be updated. if not, it
   * will be created.
   *
   * @param adr AddressDTO to sync, needs to have an UUID
   * @return AddressDTO the effective Address after sync
   * @throws TomException
   */
  public AddressDTO syncAddress(AddressDTO adr) throws TomException {

    AddressDTO syncResult = null;

    if (adr == null) {
      throw new TomException("Fehler AddressDTO ==null");
    }
    if ((adr.getUuid() == null || adr.getUuid().length() == 0)) {
      throw new TomException("Fehler uuid fehlt");
    }

    AddressDTO existingAdr = null;
    try {
      existingAdr = loadAddressByUuid(adr.getUuid());
    } catch (TomException tomException) {
      getLogger().info("syncAddress: Address with UUID does not exist " + tomException.getMessage() + ", " + adr);
    }

    if (existingAdr == null) {
      //Try to find it with the email address
      if ((adr.getEmail() == null || adr.getEmail().length() == 0)) {
        throw new TomException("Fehler Email-Adresse fehlt"); //must have email!
      }
      //Now search by email
      SearchByStringRequest req = new SearchByStringRequest();
      req.setSearchType(SearchType.BY_EMAIL);
      req.setSearchString(adr.getEmail());
      List<AddressDTO> adrList = searchAddresses(req);
      if (adrList != null && !adrList.isEmpty()) {
        if (adrList.size() == 1) {
          existingAdr = adrList.get(0);
        } else {
          //TODO Look for the best match
          existingAdr = adrList.get(0);
        }
      }
    }

    if (existingAdr == null) {
      //muss neu angelegt werden
      syncResult = createAddress(adr);
    } else {
      if ((existingAdr.getUuid() != null && existingAdr.getUuid().length() > 0)) {
        adr.setUuid(existingAdr.getUuid()); // take UUID of the existing adr
      }
      updateSimpleAdressObjects(existingAdr, adr);
      syncResult = updateAddress(existingAdr);
    }

    return syncResult;
  }

  public LandDTO syncLand(LandDTO land) throws TomException {

    if (land == null) {
      throw new TomException("Illegal argument LandDTO");
    }

    if (land.getId() != null && land.getId() > 0) {
      Laender ld = laenderDao.loadXmpBean(land.getId());
      if (ld != null) {
        return land;
      }
    }
    XmpSelection laender = null;

    if (land.getLandName() != null && land.getLandName().length() > 0) {
      SearchByStringRequest req = new SearchByStringRequest();
      req.setSearchString(land.getLandName());
      req.setMandantenId(land.getId());

      if (land.getId() != null && land.getId() > 0) {
        laender = laenderDao.searchLaenderByName(req);

      }
    } else if (land.getiSO3166Code_2() != null && land.getiSO3166Code_2().length() > 0) {
      SearchByStringRequest req = new SearchByStringRequest();
      req.setSearchString(land.getiSO3166Code_2());
      req.setMandantenId(land.getId());

      if (land.getId() != null && land.getId() > 0) {
        laender = laenderDao.searchLaenderByIso2Code(req);
      }
    } else if (land.getiSO3166Code_3() != null && land.getiSO3166Code_3().length() > 0) {
      SearchByStringRequest req = new SearchByStringRequest();
      req.setSearchString(land.getiSO3166Code_3());
      req.setMandantenId(land.getId());

      if (land.getId() != null && land.getId() > 0) {
        laender = laenderDao.searchLaenderByIso3Code(req);
      }
    }

    if (laender != null && laender.getSelection() != null && !laender.getSelection().isEmpty()) {
      LandDTO res = landMapper.map((Laender) laender.getSelection().get(0));
      return res;
    }

    //Land neu anlegen, da nichts gefunden wurde.

    Laender newLand = landMapper.map(land);
    newLand = laenderDao.storeXmpBean(newLand);
    LandDTO res = landMapper.map(newLand);
    return res;



  }

  private AddressDTO updateSimpleAdressObjects(AddressDTO existing, AddressDTO adr) {

    if (existing.getUuid() == null || existing.getUuid().length() == 0) {
      existing.setUuid(adr.getUuid());
    }

    existing.setAbteilung(adr.getAbteilung());
    existing.setEmail(adr.getEmail());
    existing.setFirma(adr.getFirma());
    existing.setName(adr.getName());
    existing.setVorname(adr.getVorname());
    existing.setMobilTelefon(adr.getMobilTelefon());
    existing.setTelefon(adr.getTelefon());
    existing.setPlz(adr.getPlz());
    existing.setStadt(adr.getStadt());
    existing.setStrasse(adr.getStrasse());
    existing.setTitel(adr.getTitel());
    return existing;

  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tom.ejb.service.AddressServiceLocal#deleteAddress(com.tom.dto.AddressDTO
   * )
   */
  @Override
  public void deleteAddress(AddressDTO adr) throws TomException {
    if (adr == null) {
      throw new TomException("Fehler AddressDTO ==null");
    }

    Adressen delAdr = null;

    if (adr.getUuid() != null && adr.getUuid().length() > 0) {
      AddressDTO delAdrDTO = loadAddressByUuid(adr.getUuid());
      if (delAdrDTO != null && delAdrDTO.getUuid().length() > 0) {
        delAdr = AddressMapper.map(delAdrDTO);
      } else {
        throw new TomException("Fehler AddressDTO mit uuid="
                + adr.getUuid() + " nicht vorhanden");
      }
    } else {
      delAdr = AddressMapper.map(adr);
    }
    try {
      int res = adressenDao.deleteObjectFromDB(delAdr);
    } catch (TomDbException e) {
      logger.error(e.getMessage(), e);
      throw new TomException(e);
    }

  }
}
