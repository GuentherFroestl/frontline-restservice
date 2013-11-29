/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dao.ArtikelDAO;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Artikel;
import de.gammadata.tom.four_d_access.util.mapper.ProduktMapper;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.List;

/**
 * Implementation of IProductService
 *
 * @author gfr
 */
public class ProductService extends Abstract4DService implements IProductService {

  ArtikelDAO artikelDao;
  ProduktMapper mapper = new ProduktMapper();

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec
   */
  public ProductService(DataBaseSpec dataBaseSpec) {
    super(dataBaseSpec);
    artikelDao = new ArtikelDAO(dataBaseSpec);
  }

  @Override
  public List<ProduktKopfDTO> searchByString(SearchByStringRequest req) throws TomException {
    XmpSelection sel = artikelDao.searchArtikel(req);
    return ProduktMapper.mapKopf(sel);
  }

  @Override
  public ProduktDTO loadById(Integer id) throws TomException {
    Artikel artikel = artikelDao.loadXmpBean(id);
    return mapper.map(artikel);
  }

  @Override
  public ProduktDTO createProdukt(ProduktDTO produkt) throws TomException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ProduktDTO updateProdukt(ProduktDTO produkt) throws TomException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void deleteProdukt(ProduktDTO produkt) throws TomException {
    Artikel artikel = new Artikel();
    mapper.mapDTO(artikel, produkt);
    artikelDao.deleteObjectFromDB(artikel);
  }
}
