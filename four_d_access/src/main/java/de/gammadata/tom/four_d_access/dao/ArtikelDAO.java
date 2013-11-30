package de.gammadata.tom.four_d_access.dao;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Artikel;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * DAO for Artikel DB Ebtities.
 *
 * @author gfr
 */
public class ArtikelDAO extends AbstractDAO<Artikel> {

  public ArtikelDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  public XmpSelection searchArtikel(SearchByStringRequest req)
          throws TomDbException {

    XmpSelection res;
    Artikel searchObj = getXmpInstance();
    getDbHandler().openQuery();

    if (req.isAllrecords() || req.getSearchString() == null
            || req.getSearchString().length() == 0) {

      getDbHandler().addQueryPart(
              new QueryPart(new QueryOperant(searchObj,
              Artikel.dMandant_Fn), QueryPart.equal,
              new QueryOperant(req.getMandantenId())));

    } else if (SearchType.BY_CODE.equals(req.getSearchType())) {
      getDbHandler().addQueryPart(
              new QueryPart(new QueryOperant(searchObj,
              Artikel.artikelNr_Fn),
              QueryPart.equal, new QueryOperant(req
              .getSearchString())));
      
      getDbHandler().addQueryPart(
              new QueryPart(QueryPart.booleanAnd, new QueryOperant(
              searchObj, Artikel.dMandant_Fn), QueryPart.equal,
              new QueryOperant(req.getMandantenId())));
    } else if (SearchType.BY_STRING.equals(req.getSearchType())) {

      getDbHandler().addQueryPart(
              new QueryPart(new QueryOperant(searchObj,
              Artikel.artikelNr_Fn),
              QueryPart.contains, new QueryOperant(req
              .getSearchString())));

      getDbHandler().addQueryPart(
              new QueryPart(QueryPart.booleanOr, new QueryOperant(
              searchObj, Artikel.kurzbeschreibung_Fn),
              QueryPart.contains, new QueryOperant(req
              .getSearchString())));
      
            getDbHandler().addQueryPart(
              new QueryPart(QueryPart.booleanAnd, new QueryOperant(
              searchObj, Artikel.dMandant_Fn), QueryPart.equal,
              new QueryOperant(req.getMandantenId())));

    }

    searchObj.setFieldList(getCompactFieldSpecs());
    getDbHandler().setResultObject(searchObj);
    getDbHandler().setLoadOneObjects(false);
    setLimits(req.getStartRecord(), req.getLimit());

    res = getDbHandler().executeQuery();
    return res;
  }

  protected int[] getCompactFieldSpecs() {
    int[] fl = {Artikel.dID_Fn, Artikel.dMandant_Fn, Artikel.artikelNr_Fn, Artikel.kurzbeschreibung_Fn,
      Artikel.vK1_Fn, Artikel.m_005_011_Währungen_Zeichen_Fn, Artikel._005_001_Währungen_DID_Fn};

    return fl;
  }

  @Override
  public Artikel getXmpInstance() {
    return new Artikel();
  }
}
