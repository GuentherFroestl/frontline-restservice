/**
 *
 */
package de.gammadata.tom.four_d_access.dao;

import java.util.List;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.BasicBean;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.SearchType;
import de.gammadata.tom.four_d_access.util.mapper.BelegMapper;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 *
 */
public abstract class AbstractBelegDAO<T extends BasicBean> extends AbstractDAO<T> implements IBelegDAO {

  public AbstractBelegDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  /**
   * Baut die belegspezifische Abfrage nach Adr ID
   *
   * @param id zu der die Belege gesucht werden
   * @param dbHandler DataBaseHandler
   * @param searchObj Zieltabelleninfo
   */
  protected abstract void buildAdrQuery(Integer id,
          DataBaseHandler dbHandler, Xmp searchObj);

  /**
   * Baut die belegspezifische Abfrage nach Project ID
   *
   * @param id zu der die Belege gesucht werden
   * @param dbHandler DataBaseHandler
   * @param searchObj Zieltabelleninfo
   */
  protected abstract void buildProjectQuery(Integer id,
          DataBaseHandler dbHandler, Xmp searchObj);
  
  /**
   * Baut die belegspezifische Abfrage nach Customer ID
   *
   * @param id zu der die Belege gesucht werden
   * @param dbHandler DataBaseHandler
   * @param searchObj Zieltabelleninfo
   */
  protected abstract void buildCustomerQuery(Integer refId, DataBaseHandler dbHandler, Xmp searchObj);

  /**
   * Baut die belegspezifische Abfrage
   *
   * @param serachText Suchtext in den Belegen
   * @param dbHandler DataBaseHandler
   * @param searchObj Zieltabelleninfo
   */
  protected abstract void buildStringQuery(BelegSearchRequest req,
          DataBaseHandler dbHandler, Xmp searchObj);

  /**
   * Baut das Ordering
   *
   * @param searchReq
   * @param handler
   * @param obj
   * @throws TomDbException
   */
  protected abstract void buildOrdering(BasicSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) throws TomDbException;

  /**
   * Liefer die belegspezifischen felder für den BelegKopfDTO
   *
   * @return FieldSpec[]
   */
  protected abstract int[] getCompactFieldList();

  @Override
  public List<BelegKopfDTO> searchBelege(BelegSearchRequest req)
          throws TomDbException {
    if (req == null || req.getSearchType() == null
            || req.getBelegType() == null) {
      throw new TomDbException("malformed parameters");
    }
    Xmp searchObj = getXmpInstance();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();

    if (SearchType.ALL_RECORDS.equals(req.getSearchType()) || SearchType.BY_STRING.equals(req.getSearchType())) {
      buildStringQuery(req, dbHandler, searchObj);
    } else if (SearchType.BY_ADR_ID.equals(req.getSearchType())) {
      buildAdrQuery(req.getRefId(), dbHandler, searchObj);
    } else if (SearchType.BY_PROJECT_ID.equals(req.getSearchType())) {
      buildProjectQuery(req.getRefId(), dbHandler, searchObj);
    } else if (SearchType.BY_CUSTOMER_ID.equals(req.getSearchType())) {
      buildCustomerQuery(req.getRefId(), dbHandler, searchObj);
    }

    buildOrdering(req, dbHandler, searchObj);

    searchObj.setAllLoaded(false);
    searchObj.setFieldList(getCompactFieldList());
    getDbHandler().setResultObject(searchObj);
    setLimits(req.getStartRecord(), req.getLimit());

    XmpSelection sel = getDbHandler().executeQuery();
    return BelegMapper.map(sel);

  }

  @Override
  public BelegDTO loadBelegById(Integer id) throws TomDbException {

    BelegDTO result = null;
    if (id == null || id.equals(Integer.valueOf(0))) {
      throw new TomDbException("malformed parameters");
    }
    Xmp obj = loadXmpBean(id);
    if (obj == null) {
      return null;
    }
    result = BelegMapper.map(obj);
    result.setPositionsListe(loadPositionsListe(result));
    return result;
  }

  @Override
  public BelegDTO loadBelegByUuid(String uuid) throws TomDbException {
    if (uuid == null || uuid.length() == 0) {
      throw new TomDbException("malformed parameters");
    }
    BelegDTO result = null;
    Xmp obj = loadXmpBeanByUuid(uuid);
    if (obj == null) {
      return null;
    }
    result = BelegMapper.map(obj);
    result.setPositionsListe(loadPositionsListe(result));
    return result;

  }
}
