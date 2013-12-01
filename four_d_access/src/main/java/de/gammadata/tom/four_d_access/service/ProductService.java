/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
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
  public ProduktDTO loadByCode(ProduktKopfDTO prod) throws TomException {
    if (prod == null || prod.getProduktCode() == null || prod.getProduktCode().length() == 0) {
      throw new TomException("Illegal argument code=" + prod);
    }
    SearchByStringRequest req = new SearchByStringRequest();
    req.setSearchType(SearchType.BY_CODE);
    req.setLimit(1);
    req.setSearchString(prod.getProduktCode());
    req.setMandantenId(prod.getMandant());
    XmpSelection sel = artikelDao.searchArtikel(req);
    if (sel == null || sel.getSelection() == null || sel.getSelection().isEmpty()) {
      throw new TomException("Product not found=" + prod);
    }
    Integer id = sel.getSelection().get(0).getDID();
    return loadById(id);
  }

  @Override
  public ProduktDTO loadById(Integer id) throws TomException {
    Artikel artikel = artikelDao.loadXmpBean(id);
    return mapper.map(artikel);
  }

  @Override
  public ProduktDTO createProdukt(ProduktDTO produkt) throws TomException {
    if (produkt==null||produkt.getMandant()==null||produkt.getProduktCode()==null||produkt.getProduktCode().length()==0){
      throw new TomException("Missing properties within produkt");
    }
    Artikel artikel = mapper.map(produkt);
    Artikel artikelStored = artikelDao.storeXmpBean(artikel);
    produkt.setId(artikelStored.getDID());
    return produkt;
  }

  @Override
  public ProduktDTO updateProdukt(ProduktDTO produkt) throws TomException {
    Artikel artikel = mapper.map(produkt);
    artikel.setNewObject(false);
    Artikel artikelStored = artikelDao.storeXmpBean(artikel);
    produkt.setId(artikelStored.getDID());
    return produkt;
  }

  @Override
  public void deleteProdukt(ProduktDTO produkt) throws TomException {
    Artikel artikel = new Artikel();
    mapper.mapDTOBasics(artikel, produkt);
    artikelDao.deleteObjectFromDB(artikel);
  }
}
