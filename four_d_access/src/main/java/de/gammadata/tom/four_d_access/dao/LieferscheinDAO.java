/**
 *
 */
package de.gammadata.tom.four_d_access.dao;

import java.util.List;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.OrderPart;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Auftraege;
import de.gammadata.tom.four_d_access.dbBeans.Lieferpos;
import de.gammadata.tom.four_d_access.dbBeans.Lieferscheine;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.Direction;
import com.tom.service.dto.OrderSpecification;
import com.tom.service.dto.Status;
import de.gammadata.tom.four_d_access.util.mapper.BelegMapper;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr
 *
 */
public class LieferscheinDAO extends AbstractBelegDAO<Lieferscheine> implements
        IBelegDAO {

  public LieferscheinDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  public int[] getCompactFieldList() {
    int[] fl = {Lieferscheine.lfdNr_Fn, Lieferscheine.datum_Fn,
      Lieferscheine.betreff_Fn, Lieferscheine.betrag_Brutto_Fn,
      Lieferscheine.betrag_Mwst_Fn, Lieferscheine.betrag_Netto_Fn,
      Lieferscheine.m_005_011_WährZeichen_Fn,
      Lieferscheine.abgerechnet_Fn,
      Lieferscheine._009_001_Adressen_DID_Fn,
      Lieferscheine.m_009_011_Adressen_Firmenname_Fn,
      Lieferscheine.m_009_014_Adressen_Nachname_Fn,
      Lieferscheine._022_001_Vorgang_DID_Fn,
      Lieferscheine.m_022_031_VorgangNr_Fn};

    return fl;
  }

  @Override
  public Lieferscheine getXmpInstance() {
    return new Lieferscheine();
  }

  /**
   * Builds a string based search
   *
   * @param serachText
   * @param dbHandler
   * @param obj
   */
  @Override
  protected void buildStringQuery(BelegSearchRequest req,
          DataBaseHandler dbHandler, Xmp searchObj) {
    String serachText = req.getSearchString();
    dbHandler.openQuery();

    if (req.isAllrecords()) {
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Lieferscheine.dMandant_Fn), QueryPart.equal,
              new QueryOperant(req.getMandantenId())));
    } else {
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Lieferscheine.m_009_011_Adressen_Firmenname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              Lieferscheine.m_009_014_Adressen_Nachname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              Lieferscheine.m_022_031_VorgangNr_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj, Lieferscheine.betreff_Fn),
              QueryPart.contains, new QueryOperant(serachText)));

      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, Lieferscheine.dMandant_Fn),
              QueryPart.equal, new QueryOperant(req.getMandantenId())));
    }

  }

  /**
   * Baut die Sortierung in die Datenbankabfrage ein
   *
   * @param searchReq BasicSearchRequest
   * @param handler DataBaseHandler
   * @param obj Xmp
   * @throws TomDbException
   */
  @Override
  protected void buildOrdering(BasicSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) throws TomDbException {
    if (searchReq.getOrderByList() == null
            || searchReq.getOrderByList().isEmpty()) {
      // Standard
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              Lieferscheine.datum_Fn), OrderPart.desc));
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              Lieferscheine.lfdNr_Fn), OrderPart.desc));
      return;
    }

    for (OrderSpecification os : searchReq.getOrderByList()) {

      int dir = OrderPart.asc;
      if (Direction.DESC.equals(os.getDirection())) {
        dir = OrderPart.desc;
      }
      QueryOperant op = null;
      if ("datum".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Auftraege.eingangsdatum_Fn);
      } else if ("erledigt".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Auftraege.abgeschlossen_Fn);
      }
      if (op != null) {
        handler.addOrderPart(new OrderPart(op, dir));
      }
    }
  }

  /**
   * Builds a string based search
   *
   * @param serachText
   * @param dbHandler
   * @param obj
   */
  @Override
  protected void buildAdrQuery(Integer adrId, DataBaseHandler dbHandler,
          Xmp searchObj) {
    getDbHandler().openQuery();

    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Lieferscheine._009_001_Adressen_DID_Fn), QueryPart.equal,
            new QueryOperant(adrId)));

  }

  @Override
  protected void buildProjectQuery(Integer id, DataBaseHandler dbHandler,
          Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Lieferscheine._022_001_Vorgang_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));

  }

  @Override
  protected void buildCustomerQuery(Integer id, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Lieferscheine._068_001_Kunden_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));
  }

  @Override
  public List<BelegPositionDTO> loadPositionsListe(BelegKopfDTO beleg)
          throws TomDbException {
    if (beleg == null || beleg.getId() == 0) {
      return null;
    }
    Xmp searchObj = new Lieferpos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Lieferpos._066_001__Lieferscheine_DID_Fn), QueryPart.equal,
            new QueryOperant(beleg.getId())));
    searchObj.setAllLoaded(false);
    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);
    XmpSelection sel = getDbHandler().executeQuery();
    return BelegMapper.mapPosliste(sel);
  }

  @Override
  public List<BelegDTO> loadPositionenByProjektId(Integer pId,Status status) throws TomDbException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
