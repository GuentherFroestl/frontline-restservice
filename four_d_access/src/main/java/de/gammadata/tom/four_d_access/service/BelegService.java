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
import com.tom.service.dto.Status;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.AuftragDAO;
import de.gammadata.tom.four_d_access.dao.BestellungDAO;
import de.gammadata.tom.four_d_access.dao.IBelegDAO;
import de.gammadata.tom.four_d_access.dao.LieferscheinDAO;
import de.gammadata.tom.four_d_access.dao.RechnungDAO;
import de.gammadata.tom.four_d_access.dao.SteuerBetraegeDAO;
import de.gammadata.tom.four_d_access.dao.TomDbException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.mapper.SteuerMapper;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * @author gfr
 *
 */
public class BelegService extends Abstract4DService {

  /**
   * defines various types of loading one beleg.
   */
  public enum LoadByType {

    /**
     * by primary ID.
     */
    BY_ID,
    /**
     * by UUID
     */
    BY_UUID,
    /**
     *
     */
    BY_NUMBER
  }
  private final Logger logger = Logger.getLogger(this.getClass());

  SteuerBetraegeDAO steuerBetraegeDAO;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec
   */
  public BelegService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    steuerBetraegeDAO = new SteuerBetraegeDAO(dataBaseSpec);
  }

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

  /**
   * Loads just the basic beleg, w/o any included nested objects.
   *
   * @param type
   * @param loadTbyType
   * @param specifier
   * @return
   * @throws TomException
   */
  public BelegDTO loadBasicBeleg(BelegTyp type, LoadByType loadTbyType, Object specifier) throws TomException {

    if (type == null || loadTbyType == null || specifier == null) {
      throw new TomDbException("Illegal argument supplied");
    }
    if (loadTbyType.equals(LoadByType.BY_ID)) {
      return getBelegDAO(type).loadBelegById((Integer) specifier);
    } else if (loadTbyType.equals(LoadByType.BY_UUID)) {
      return getBelegDAO(type).loadBelegByUuid((String) specifier);
    } else if (loadTbyType.equals(LoadByType.BY_NUMBER)) {
      return getBelegDAO(type).loadBelegByNumber((Integer) specifier);
    }
    throw new TomDbException("Illegal LoadByType supplied");
  }

  public BelegDTO loadBelegByUuid(BelegTyp type, String uuid)
          throws TomException {
    BelegDTO res;
    try {
      // Objekt laden 
      res = getBelegDAO(type).loadBelegByUuid(uuid);
    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }

  public BelegDTO loadBelegById(BelegTyp type, Integer id)
          throws TomException {
    BelegDTO res;
    try {
      // Objekt laden
      res = getBelegDAO(type).loadBelegById(id);
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
      // Objekt laden
      res = getBelegDAO(type).loadBelegByNumber(belegNumber);

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
  
    /**
   * Checks if a Beleg exsits by its number.
   *
   * @param type BelegTyp
   * @param uuid String
   * @return BelegDTO
   * @throws TomException
   */
  public boolean checkBelegByUUID(BelegTyp type, String uuid)
          throws TomException {
    boolean res = false;
    try {
      // Objekt laden und mit Relationen anreichern
      res = getBelegDAO(type).checkBelegByUUID(uuid);

    } catch (TomDbException e) {
      logger.error("loadBelegByUuid() fehler=" + e.getMessage(), e);
      throw new TomException("loadBelegByUuid() fehler=" + e.getMessage());
    }
    return res;
  }
  /**
   * Get next Beleg Number.
   * @param type BelegTyp
   * @return int next number
   * @throws TomException 
   */
  public int getNextBelegNumber(BelegTyp type) throws TomException{
    if (type==null){
      throw new TomDbException("BelegType darf nicht null sein");
    }
    int res = getBelegDAO(type).getNextBelegNumber();
    if (res ==0){
      throw new TomDbException("Keine naechste Belgnummer für "+type.toString()+" von TOM 4D Service erhalten");
    }
    return res;
  }

  public List<BelegDTO> loadPositionenByProjektId(BelegTyp type, Integer pId, Status status) throws TomDbException {
    List<BelegDTO> res = getBelegDAO(type).loadPositionenByProjektId(pId, status);
    return res;
  }

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

  public BelegDTO updateBeleg(BelegDTO beleg) throws TomException {
    // TODO Auto-generated method stub
    return null;
  }

  public void deleteBeleg(BelegDTO beleg) throws TomException {
    getBelegDAO(beleg.getBelegTyp()).deleteBeleg(beleg);
  }

  /**
   * Fügt die Liste der Steuerbeträge zum Beleg hinzu.
   *
   * @param beleg BelegDTO
   * @return BelegDTO
   * @throws TomDbException
   */
  public void addSteuerBetraege(BelegDTO beleg) throws TomDbException {
    List<Xmp> sList = steuerBetraegeDAO.getSteuerBetraege(beleg);
    beleg.setSteuerListe(SteuerMapper.map(sList));
  }

  /**
   * Fügt die Positionsliste hinzu.
   *
   * @param beleg BelegDTO
   * @return BelegDTO
   * @throws TomDbException
   */
  public BelegDTO addPositionsListe(BelegDTO beleg) throws TomDbException {

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
