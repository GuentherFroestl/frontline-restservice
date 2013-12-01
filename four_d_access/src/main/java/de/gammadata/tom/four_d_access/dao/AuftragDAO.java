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
import de.gammadata.tom.four_d_access.dbBeans.AuftragsPos;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.Direction;
import com.tom.service.dto.OrderSpecification;
import com.tom.service.dto.Status;
import de.gammadata.tom.four_d_access.util.mapper.AuftraegeMapper;
import de.gammadata.tom.four_d_access.util.mapper.BelegMapper;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr
 *
 */
public class AuftragDAO extends AbstractBelegDAO<Auftraege> implements
        IBelegDAO {

  public AuftragDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  protected int[] getCompactFieldList() {
    int[] li = {
      Auftraege.dMandant_Fn,
      Auftraege.lfd_Nr_Fn,
      Auftraege.uuid_Fn,
      Auftraege.eingangsdatum_Fn,
      Auftraege.betrag_Brutto_Fn,
      Auftraege.betrag_MwSt_Fn,
      Auftraege.betrag_Netto_Fn,
      Auftraege.m_009_011_Adressen_Firmenname_Fn,
      Auftraege.m_009_014_Adressen_Nachname_Fn,
      Auftraege._009_001_Adressen_DID_AB_Fn,
      Auftraege.abgeschlossen_Fn,
      Auftraege.storno_Fn,
      Auftraege.ang_AuftragTyp_Fn,
      Auftraege.m_005_011__022_WährZeichen_Fn,
      Auftraege.betreff_Fn,
      Auftraege._022_001_Vorgang_DID_Fn,
      Auftraege.m_022_031_VorgangNr_Fn};

    return li;
  }

  @Override
  public Auftraege getXmpInstance() {
    return new Auftraege();
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
    getDbHandler().openQuery();

    if (req.isAllrecords()) {
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Auftraege.dMandant_Fn), QueryPart.equal, new QueryOperant(
              req.getMandantenId())));
    } else {
      String serachText = req.getSearchString();

      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Auftraege.m_009_011_Adressen_Firmenname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              Auftraege.m_009_014_Adressen_Nachname_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              Auftraege.m_022_031_VorgangNr_Fn),
              QueryPart.contains, new QueryOperant(serachText)));
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj, Auftraege.betreff_Fn),
              QueryPart.contains, new QueryOperant(serachText)));

      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, Auftraege.dMandant_Fn),
              QueryPart.equal, new QueryOperant(req.getMandantenId())));
    }

    // Es muss noch nach typ gefiltert werden
    if (!BelegTyp.ANGEBOT_UND_AUFTRAG.equals(req.getBelegType())) {
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, Auftraege.ang_AuftragTyp_Fn),
              QueryPart.equal, new QueryOperant(BelegTyp.AUFTRAG
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
              Auftraege.lfd_Nr_Fn), OrderPart.desc));
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              Auftraege.eingangsdatum_Fn), OrderPart.desc));

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
      } else if ("nummer".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Auftraege.lfd_Nr_Fn);
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
            Auftraege._009_001_Adressen_DID_AB_Fn), QueryPart.equal,
            new QueryOperant(adrId)));
    dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(searchObj,
            Auftraege._009_001_Adressen_DID_LF_Fn),
            QueryPart.equal, new QueryOperant(adrId)));
    dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(searchObj,
            Auftraege._009_001_Adressen_DID_RG_Fn),
            QueryPart.equal, new QueryOperant(adrId)));

  }

  @Override
  protected void buildProjectQuery(Integer id, DataBaseHandler dbHandler,
          Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Auftraege._022_001_Vorgang_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));

  }

  @Override
  protected void buildNumberQuery(Integer id, DataBaseHandler dbHandler, Xmp searchObj) {

    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Auftraege.lfd_Nr_Fn), QueryPart.equal,
            new QueryOperant(id)));
  }

  @Override
  protected void buildCustomerQuery(Integer id, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Auftraege._068_001_Kunden_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));
  }

  @Override
  public List<BelegPositionDTO> loadPositionsListe(BelegKopfDTO beleg)
          throws TomDbException {
    if (beleg == null || beleg.getId() == 0) {
      return null;
    }
    Xmp searchObj = new AuftragsPos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            AuftragsPos._067_001__Aufträge_DID_Fn), QueryPart.equal,
            new QueryOperant(beleg.getId())));
    searchObj.setAllLoaded(false);
    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);
    XmpSelection sel = getDbHandler().executeQuery();
    return BelegMapper.mapPosliste(sel);
  }

  public List<BelegPositionDTO> loadPositionsListeById(BelegTyp type, Integer id)
          throws TomDbException {
    if (id == null || id == 0) {
      throw new TomDbException("Illegal Argument by ID");
    }
    Xmp searchObj = new AuftragsPos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            AuftragsPos._067_001__Aufträge_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));
    searchObj.setAllLoaded(false);
    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);
    XmpSelection sel = getDbHandler().executeQuery();
    return BelegMapper.mapPosliste(sel);
  }

  @Override
  public BelegDTO storeBelegToTom(BelegDTO beleg) throws TomDbException {

    Auftraege auftrag = AuftraegeMapper.map(beleg);
    Auftraege savedAuftrag = storeXmpBean(auftrag);
    beleg.setId(savedAuftrag.getDID());
    storeAuftragsPositionen(beleg, savedAuftrag.getDID());
    return beleg;
  }

  /**
   * saves the positions to the Tom-DB.
   *
   * @param beleg BelegDTO
   * @param auftragId in Foreign Key
   * @throws TomDbException
   */
  private void storeAuftragsPositionen(BelegDTO beleg, int auftragId) throws TomDbException {
    if (beleg.getPositionsListe() != null && !beleg.getPositionsListe().isEmpty()) {
      for (BelegPositionDTO pos : beleg.getPositionsListe()) {
        AuftragsPos aPos = BelegMapper.mapAuftragsPos(pos, auftragId);
        aPos = (AuftragsPos) getDbHandler().storeObjectInDB(aPos);
        pos.setId(aPos.getDID());
      }
    }
  }

  @Override
  public List<BelegDTO> loadPositionenByProjektId(Integer pId, Status status) throws TomDbException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void deleteBelegInTom(BelegDTO beleg) throws TomDbException {
    Auftraege auftrag = AuftraegeMapper.map(beleg);
    if (beleg.getPositionsListe() != null && !beleg.getPositionsListe().isEmpty()) {
      throw new UnsupportedOperationException("Delete of Poslists not supported so far");
    }
    int res = deleteObjectFromDB(auftrag);
  }
}
