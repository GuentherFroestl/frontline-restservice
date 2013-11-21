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
import de.gammadata.tom.four_d_access.dbBeans.AusRech;
import de.gammadata.tom.four_d_access.dbBeans.AusRechPos;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
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
public class RechnungDAO extends AbstractBelegDAO<AusRech> implements IBelegDAO {

  public RechnungDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  public int[] getCompactFieldList() {
    int[] fl = {AusRech.rechnungsnummer_Fn, AusRech.rechnungsdatum_Fn,
      AusRech.bemerkung_Fn, AusRech.betrag_Brutto_Fn,
      AusRech.betrag_MwSt_Fn, AusRech.betrag_Netto_Fn,
      AusRech.m_005_011__018_WährZeichen_Fn, AusRech.bezahlt_Fn,
      AusRech.gurschriftflag_Fn, AusRech.storniert_Fn,
      AusRech._009_001_Adressen_DID_RG_Fn,
      AusRech.m_009_011_Adressen_Firmenname_Fn,
      AusRech.m_009_014_Adressen_Nachname_Fn,
      AusRech._022_001_Vorgang_DID_Fn, AusRech.m_022_031_VorgangNr_Fn};

    return fl;
  }

  @Override
  public AusRech getXmpInstance() {
    return new AusRech();
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
              AusRech.dMandant_Fn), QueryPart.equal, new QueryOperant(req
              .getMandantenId())));
    } else {
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              AusRech.m_009_011_Adressen_Firmenname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              AusRech.m_009_014_Adressen_Nachname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler
              .addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              AusRech.m_022_031_VorgangNr_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj, AusRech.bemerkung_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, AusRech.dMandant_Fn),
              QueryPart.equal, new QueryOperant(req.getMandantenId())));
    }

    // muss noch nach typ gefintert werden
    if (!BelegTyp.RECHNUNG_UND_GUTSCHRIFT.equals(req.getBelegType())) {
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, AusRech.gurschriftflag_Fn),
              QueryPart.equal, new QueryOperant(BelegTyp.GUTSCHRIFT
              .equals(req.getBelegType()))));
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
              AusRech.rechnungsdatum_Fn), OrderPart.desc));
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              AusRech.rechnungsnummer_Fn), OrderPart.desc));
      return;
    }

    for (OrderSpecification os : searchReq.getOrderByList()) {

      int dir = OrderPart.asc;
      if (Direction.DESC.equals(os.getDirection())) {
        dir = OrderPart.desc;
      }
      QueryOperant op = null;
      if ("datum".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, AusRech.rechnungsdatum_Fn);
      } else if ("bezahlt".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, AusRech.bezahlt_Fn);
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
            AusRech._009_001_Adressen_DID_RG_Fn), QueryPart.equal,
            new QueryOperant(adrId)));

  }

  @Override
  protected void buildProjectQuery(Integer id, DataBaseHandler dbHandler,
          Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            AusRech._022_001_Vorgang_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));

  }

  @Override
  protected void buildCustomerQuery(Integer id, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            AusRech._068_001_Kunden_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));
  }

  @Override
  public List<BelegPositionDTO> loadPositionsListe(BelegKopfDTO beleg)
          throws TomDbException {
    if (beleg == null || beleg.getId() == 0) {
      return null;
    }
    Xmp searchObj = new AusRechPos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            AusRechPos._063_001_AusRech_DID_Fn), QueryPart.equal,
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
