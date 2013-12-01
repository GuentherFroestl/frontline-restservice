/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.WrgDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.WaehrungDAO;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Waehrungen;
import de.gammadata.tom.four_d_access.util.mapper.SteuerMapper;
import de.gammadata.tom.four_d_access.util.mapper.WaehrungenMapper;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.List;

/**
 *
 * @author gfr
 */
public class WrgService extends Abstract4DService {

  WaehrungDAO wrgDao;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec
   */
  public WrgService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    wrgDao = new WaehrungDAO(dataBaseSpec);
  }

  public List<WrgDTO> searchByString(SearchByStringRequest req) throws TomException {
    XmpSelection res = wrgDao.searchByString(req);
    return WaehrungenMapper.map(res);
  }

  public WrgDTO loadById(Integer id) throws TomException {
    Waehrungen wrg = new Waehrungen();
    wrg.setDID(id);
    wrg = wrgDao.loadXmpBean(wrg);
    return WaehrungenMapper.map(wrg);
  }
}
