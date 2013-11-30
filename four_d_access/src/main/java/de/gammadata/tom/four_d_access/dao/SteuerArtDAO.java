/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Steuersaetze;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * DAO fuer Steuerbetraege / SteuerArtDTO.
 *
 * @author gfr
 */
public class SteuerArtDAO extends AbstractDAO<Steuersaetze> {

  public SteuerArtDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  public Steuersaetze getXmpInstance() {
    return new Steuersaetze();
  }

  /**
   * Holt die StandartSteuerart für den genannten Mandanten
   *
   * @param mandantId
   * @return
   */
  public XmpSelection getStandardSteuerArt(Integer mandantId) throws TomDbException {

    Xmp searchObj = getXmpInstance();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();

    getDbHandler().addQueryPart(
            new QueryPart(new QueryOperant(searchObj,
            Steuersaetze.standardsteuersatz_Fn),
            QueryPart.equal, new QueryOperant(true)));
    getDbHandler().addQueryPart(
            new QueryPart(QueryPart.booleanAnd, new QueryOperant(searchObj,
            Steuersaetze.dMandant_Fn), QueryPart.equal,
            new QueryOperant()));

    searchObj.setFieldList(getCompactFieldSpecs());
    getDbHandler().setResultObject(searchObj);
    getDbHandler().setLoadOneObjects(false);
    XmpSelection res;
    res = getDbHandler().executeQuery();
    return res;

  }

  protected int[] getCompactFieldSpecs() {
    int[] fl = {
      Steuersaetze.dID_Fn, Steuersaetze.dMandant_Fn,
      Steuersaetze.gültig_ab_Fn, Steuersaetze.gültig_bis_Fn,
      Steuersaetze.standardsteuersatz_Fn, Steuersaetze.steuersatzIL_Fn,
      Steuersaetze.steuersatzbez_Fn};

    return fl;
  }
}
