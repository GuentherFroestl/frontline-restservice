/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.SteuerArtDAO;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Steuersaetze;
import de.gammadata.tom.four_d_access.util.mapper.SteuerMapper;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.List;

/**
 *
 * @author gfr
 */
public class SteuerService extends Abstract4DService implements ISteuerService {

  SteuerArtDAO stDao;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec
   */
  public SteuerService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    stDao = new SteuerArtDAO(dataBaseSpec);
  }

  @Override
  public List<SteuerArtDTO> searchByString(SearchByStringRequest req) throws TomException {
    XmpSelection res = stDao.searchByString(req);
    return SteuerMapper.mapSteuerArtList(res);
  }

  @Override
  public SteuerArtDTO loadById(Integer id) throws TomException {
    Steuersaetze st = new Steuersaetze();
    st.setDID(id);
    st = stDao.loadXmpBean(st);
    return SteuerMapper.map(st);
  }

  @Override
  public SteuerArtDTO loadStandardSteuerArt(Integer mId) throws TomException {

    XmpSelection sel = stDao.getStandardSteuerArt(mId);
    if (!isNonEmptySelection(sel)) {
      throw new TomException("Keine Standard SteuerArt gefunden");
    }
    Steuersaetze st = (Steuersaetze) sel.getSelection().get(0);
    return SteuerMapper.map(st);
  }
}
