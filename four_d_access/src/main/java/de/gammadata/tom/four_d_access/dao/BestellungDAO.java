/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.OrderPart;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.BestellPos;
import de.gammadata.tom.four_d_access.dbBeans.Bestellungen;
import com.tom.service.dto.AddressKopfDTO;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author gfr
 */
public class BestellungDAO extends AbstractBelegDAO<Bestellungen> implements
        IBelegDAO {

  /**
   * Constructor
   *
   * @param _dbSpec DataBaseSpec
   */
  public BestellungDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  @Override
  protected void buildAdrQuery(Integer adrId, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();

    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Bestellungen._009_001_Adressen_DID_AB_Fn), QueryPart.equal,
            new QueryOperant(adrId)));

    dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(searchObj,
            Bestellungen._009_001_Adressen_DID_Best_Fn),
            QueryPart.equal, new QueryOperant(adrId)));

    dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(searchObj,
            Bestellungen._009_001_Adressen_DID_LF_Fn),
            QueryPart.equal, new QueryOperant(adrId)));

    dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(searchObj,
            Bestellungen._009_001_Adressen_DID_RG_Fn),
            QueryPart.equal, new QueryOperant(adrId)));
  }

  @Override
  protected void buildProjectQuery(Integer id, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Bestellungen._022_001_Vorgänge_DID_Fn), QueryPart.equal,
            new QueryOperant(id)));
  }

  @Override
  protected void buildCustomerQuery(Integer refId, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            Bestellungen._060_001__Lieferanten_DID_Fn), QueryPart.equal,
            new QueryOperant(refId)));
  }

  @Override
  protected void buildStringQuery(BelegSearchRequest req, DataBaseHandler dbHandler, Xmp searchObj) {
    getDbHandler().openQuery();
    if (req.isAllrecords()) {
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Bestellungen.dMandant_Fn), QueryPart.equal, new QueryOperant(
              req.getMandantenId())));
    } else {
      String serachText = req.getSearchString();
      dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
              Bestellungen.m_060_025_LieferantenName_Fn),
              QueryPart.contains, new QueryOperant(serachText)));

      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj,
              Bestellungen.m_022_031_VorgangNr_Fn),
              QueryPart.contains, new QueryOperant(serachText)));

      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanOr,
              new QueryOperant(searchObj, Bestellungen.betreff_Fn),
              QueryPart.contains, new QueryOperant(serachText)));

      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
              new QueryOperant(searchObj, Bestellungen.dMandant_Fn),
              QueryPart.equal, new QueryOperant(req.getMandantenId())));
    }
  }

  @Override
  public List<BelegPositionDTO> loadPositionsListe(BelegKopfDTO beleg) throws TomDbException {
    if (beleg == null || beleg.getId() == 0) {
      return null;
    }
    Xmp searchObj = new BestellPos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            BestellPos._059_001__Bestellungen_DID_Fn), QueryPart.equal,
            new QueryOperant(beleg.getId())));
    searchObj.setAllLoaded(false);
    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);
    XmpSelection sel = getDbHandler().executeQuery();
    return BelegMapper.mapPosliste(sel);
  }

  @Override
  public List<BelegDTO> loadPositionenByProjektId(Integer pId,Status status) throws TomDbException {
    Xmp searchObj = new BestellPos();
    DataBaseHandler dbHandler = getDbHandler();
    dbHandler.openQuery();
    dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
            BestellPos._022_001_Vorgänge_DID_Fn), QueryPart.equal,
            new QueryOperant(pId)));
    if (Status.INARBEIT.equals(status)||Status.ZUTUN.equals(status)){
      dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,new QueryOperant(searchObj,
            BestellPos.restmenge_Fn), QueryPart.greater,
            new QueryOperant(0)));
    }
    searchObj.setAllLoaded(false);
    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);   
    XmpSelection sel = getDbHandler().executeQuery();
    
    List<BelegDTO> bList = new ArrayList<BelegDTO>();
     if (sel != null && sel.getSelection()!=null&&!sel.getSelection().isEmpty()) {
       Map<Integer, BelegDTO> bMap = new HashMap<Integer, BelegDTO>();
       for (Xmp obj: sel.getSelection()){
         BestellPos b = (BestellPos) obj;       
         Integer bestId=b.get_059_001__Bestellungen_DID();
         BelegDTO best;
         if (!bMap.containsKey(bestId)){
           best = new BelegDTO();
           best.setPositionsListe(new ArrayList<BelegPositionDTO>());
           best.setBelegTyp(BelegTyp.BESTELLUNG);
           best.setId(bestId);
           best.setMandant(b.getDMandant());
           best.setNummer(b.getM_059_028_BestellNr());
           AddressKopfDTO adr = new AddressKopfDTO();
           adr.setVollerName(b.getM_059_032_LieferantenName());
           best.setAdresse(adr);
           bMap.put(bestId, best);
         }else{
           best = bMap.get(bestId);
         }
         BelegPositionDTO bPos = BelegMapper.map(b);
         best.getPositionsListe().add(bPos);
       }
       
       for (Entry<Integer, BelegDTO> e : bMap.entrySet()){
         bList.add(e.getValue());
       }
       
     }
    return bList;
  }

  @Override
  protected void buildOrdering(BasicSearchRequest searchReq, DataBaseHandler handler, Xmp obj) throws TomDbException {

    if (searchReq.getOrderByList() == null
            || searchReq.getOrderByList().isEmpty()) {
      // Standard
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              Bestellungen.bestellnummer_Fn), OrderPart.desc));
      handler.addOrderPart(new OrderPart(new QueryOperant(obj,
              Bestellungen.bestelldatum_Fn), OrderPart.desc));

      return;
    }

    for (OrderSpecification os : searchReq.getOrderByList()) {

      int dir = OrderPart.asc;
      if (Direction.DESC.equals(os.getDirection())) {
        dir = OrderPart.desc;
      }
      QueryOperant op = null;
      if ("datum".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Bestellungen.bestelldatum_Fn);
      } else if ("nummer".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Bestellungen.bestellnummer_Fn);
      } else if ("erledigt".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Bestellungen.abgeschlossen_Fn);
      }
      if (op != null) {
        handler.addOrderPart(new OrderPart(op, dir));
      }
    }
  }

  @Override
  protected int[] getCompactFieldList() {
    int[] li = {
      Bestellungen.bestellnummer_Fn,
      Bestellungen.bestelldatum_Fn,
      Bestellungen.betrag_Netto_Fn,
      Bestellungen.betrag_MwSt_Fn,
      Bestellungen.betrag_Brutto_Fn,
      Bestellungen.m_005_011__018_WährZeichen_Fn,
      Bestellungen.m_060_025_LieferantenName_Fn,
      Bestellungen._060_001__Lieferanten_DID_Fn,
      Bestellungen._009_001_Adressen_DID_Best_Fn,
      Bestellungen.abgeschlossen_Fn,
      Bestellungen.anfrage_Fn,
      Bestellungen.betreff_Fn,
      Bestellungen.m_022_031_VorgangNr_Fn,
      Bestellungen._022_001_Vorgänge_DID_Fn
    };
    return li;
  }

  ;

  @Override
  public Bestellungen getXmpInstance() {
    return new Bestellungen();
  }
}
