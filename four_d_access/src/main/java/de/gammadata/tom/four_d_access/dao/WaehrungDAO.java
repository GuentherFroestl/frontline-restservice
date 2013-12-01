/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.dao;

import com.tom.service.dto.SearchByStringRequest;
import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Steuersaetze;
import de.gammadata.tom.four_d_access.dbBeans.Waehrungen;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * DAO fuer Steuerbetraege / SteuerArtDTO.
 *
 * @author gfr
 */
public class WaehrungDAO extends AbstractDAO<Waehrungen> {

  public WaehrungDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  public Waehrungen getXmpInstance() {
    return new Waehrungen();
  }

  /**
   * Holt die StandartSteuerart für den genannten Mandanten
   *
   * @param mandantId
   * @return
   */
  public XmpSelection searchByString(SearchByStringRequest req) throws TomDbException {

    if (req == null || req.getMandantenId() == null) {
      throw new TomDbException("Illegales Argument im Request");
    }

    Xmp searchObj = getXmpInstance();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();

    if (req.isAllrecords()) {
      XmpSelection res;
      res = getAllRecords(searchObj, req.getStartRecord(), req.getLimit());

    } else {
      if (req.getSearchString() == null) {
        throw new TomDbException("Illegales Argument im Request, no searchstring");
      } else {
        getDbHandler().addQueryPart(
                new QueryPart(new QueryOperant(searchObj,
                Waehrungen.Währungsbezeichnung_Fn),
                QueryPart.contains, new QueryOperant(req.getSearchString())));
        /*
         getDbHandler().addQueryPart(
         new QueryPart(QueryPart.booleanAnd, new QueryOperant(searchObj,
         Steuersaetze.dMandant_Fn), QueryPart.equal,
         new QueryOperant(req.getMandantenId())));
         * */
      }
    }

    searchObj.setFieldList(getCompactFieldSpecs());
    getDbHandler().setResultObject(searchObj);
    getDbHandler().setLoadOneObjects(false);
    setLimits(req.getStartRecord(), req.getLimit());
    XmpSelection res;
    res = getDbHandler().executeQuery();
    return res;
  }

  protected int[] getCompactFieldSpecs() {
    int[] fl = {
      Waehrungen.dID_Fn,
      Waehrungen.dMandant_Fn,
      Waehrungen.Währungsbezeichnung_Fn,
      Waehrungen.Währungszeichen_Fn,
      Waehrungen.aktueller_Kurs_Fn};

    return fl;
  }
}
