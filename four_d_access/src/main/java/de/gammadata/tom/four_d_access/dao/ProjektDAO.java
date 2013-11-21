/**
 *
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.OrderPart;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.Direction;
import com.tom.service.dto.OrderSpecification;
import com.tom.service.dto.ProjektSearchRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.dto.Status;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * Data Access für Projekte
 *
 * @author gfr_MB
 *
 */
public class ProjektDAO extends AbstractDAO<Vorgangsverwaltung> {

  /**
   * Constructor
   *
   * @param _dbSpec DataBaseSpec
   */
  public ProjektDAO(DataBaseSpec _dbSpec) {
    super(_dbSpec);
  }

  /**
   * Suche nach Projekten
   *
   * @param searchReq ProjektSearchRequest
   * @return XmpSelection
   * @throws TomDbException
   */
  public XmpSelection searchProjekteKopfdaten(ProjektSearchRequest searchReq)
          throws TomException {

    XmpSelection resultSelection = null;
    Xmp searchObj = getXmpInstance();
    DataBaseHandler handler = getDbHandler();

    bulidSearchRequest(searchReq, handler, searchObj);
    buildOrdering(searchReq, handler, searchObj);
    searchObj.setFieldList(getCompactFieldSpecs());
    handler.setResultObject(searchObj);
    handler.setLoadOneObjects(false);
    setLimits(searchReq.getStartRecord(), searchReq.getLimit());
    resultSelection = handler.executeQuery();
    return resultSelection;
  }

  /**
   * Baut die Sortierung in die Datenbankabfrage ein
   *
   * @param searchReq BasicSearchRequest
   * @param handler DataBaseHandler
   * @param obj Xmp
   * @throws TomDbException
   */
  private void buildOrdering(BasicSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) throws TomDbException {
    if (searchReq.getOrderByList() == null
            || searchReq.getOrderByList().isEmpty()) {
      //Default ordering
      handler.addOrderPart(new OrderPart(new QueryOperant(obj, Vorgangsverwaltung.vorgangNr_Fn), OrderPart.asc));
      return;
    }

    for (OrderSpecification os : searchReq.getOrderByList()) {

      int dir = OrderPart.asc;
      if (Direction.DESC.equals(os.getDirection())) {
        dir = OrderPart.desc;
      }
      QueryOperant op = null;
      if ("erledigt".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Vorgangsverwaltung.erledigt_Fn);
      } else if ("startdatum".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Vorgangsverwaltung.startDatum_Fn);
      } else if ("enddatum".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Vorgangsverwaltung.startDatum_Fn);
      } else if ("name".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Vorgangsverwaltung.vorgangNr_Fn);
      } else if ("kurzbezeichnung".equalsIgnoreCase(os.getPropertyName())) {
        op = new QueryOperant(obj, Vorgangsverwaltung.vorgangKBZ_Fn);
      }
      if (op != null) {
        handler.addOrderPart(new OrderPart(op, dir));
      }
    }
  }

  /**
   * @param searchReq
   */
  private void bulidSearchRequest(ProjektSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) throws TomDbException {

    handler.openQuery(); // Query erzeugen
    if (SearchType.BY_STRING.equals(searchReq.getSearchType())) {
      bulidStringSearchRequest(searchReq, handler, obj);
    } else if (searchReq.isAllrecords()) {
      buildAllRecordsSearchRequest(searchReq, handler, obj);
    } else {
      throw new TomDbException("Dieser SearchType "+searchReq.getSearchType()+" wird nicht unterstützt");
    }
    /*
     * Search nach status auswerten
     */
    if (searchReq.getStatus()!=null&&!Status.NICHT_DEFINIERT.equals(searchReq.getStatus())) {
      if (Status.INARBEIT.equals(searchReq.getStatus())) {
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.jobinArbeit_Fn),
                QueryPart.equal, new QueryOperant(true)));
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.erledigt_Fn),
                QueryPart.equal, new QueryOperant(false)));
      } else if (Status.ERLEDIGT.equals(searchReq.getStatus())) {
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.erledigt_Fn),
                QueryPart.equal, new QueryOperant(true)));
      } else if (Status.GESCHLOSSEN.equals(searchReq.getStatus())) {
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.erledigt_Fn),
                QueryPart.equal, new QueryOperant(true)));
      } else if (Status.NICHT_REALISIERT.equals(searchReq.getStatus())) {
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.nicht_realisiert_Fn),
                QueryPart.equal, new QueryOperant(true)));
      } else if (Status.ZUTUN.equals(searchReq.getStatus())) {
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.jobinArbeit_Fn),
                QueryPart.equal, new QueryOperant(false)));
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.erledigt_Fn),
                QueryPart.equal, new QueryOperant(false)));
        handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
                new QueryOperant(obj, Vorgangsverwaltung.nicht_realisiert_Fn),
                QueryPart.equal, new QueryOperant(false)));
      }
    }
  }

  /**
   * Helper um den projekt search request zu bauen
   *
   * @param searchString
   * @param handler
   * @param obj
   */
  private void buildAllRecordsSearchRequest(ProjektSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) throws TomDbException {

    handler.addQueryPart(new QueryPart(new QueryOperant(obj,
            Vorgangsverwaltung.dMandant_Fn), QueryPart.equal,
            new QueryOperant(searchReq.getMandantenId())));
  }

  /**
   * Baut den String Query zusammen
   *
   * @param searchString String
   * @param handler DataBaseHandler
   * @param obj Xmp Zielobjekt
   */
  private void bulidStringSearchRequest(ProjektSearchRequest searchReq,
          DataBaseHandler handler, Xmp obj) {

    String searchString = searchReq.getSearchString();

    handler.addQueryPart(new QueryPart(new QueryOperant(obj,
            de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung.vorgangKBZ_Fn),
            QueryPart.contains, new QueryOperant(searchString)));

    handler.addQueryPart(new QueryPart(QueryPart.booleanOr,
            new QueryOperant(obj,
            de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung.vorgangNr_Fn),
            QueryPart.contains, new QueryOperant(searchString)));

    handler.addQueryPart(new QueryPart(
            QueryPart.booleanOr,
            new QueryOperant(
            obj,
            de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung.m_068_026_Kunden_Firmenname_Fn),
            QueryPart.contains, new QueryOperant(searchString)));
    handler.addQueryPart(new QueryPart(
            QueryPart.booleanOr,
            new QueryOperant(
            obj,
            de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung.m_068_027_Kunden_Nachname_Fn),
            QueryPart.contains, new QueryOperant(searchString)));

    handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
            new QueryOperant(obj, Vorgangsverwaltung.dMandant_Fn),
            QueryPart.equal, new QueryOperant(searchReq.getMandantenId())));

  }

  @Override
  public Vorgangsverwaltung getXmpInstance() {
    return new Vorgangsverwaltung();
  }

  /**
   *
   * @return
   */
  protected int[] getCompactFieldSpecs() {
    int[] fl = {Vorgangsverwaltung.dID_Fn, Vorgangsverwaltung.dMandant_Fn,
      Vorgangsverwaltung.vorgangNr_Fn,
      Vorgangsverwaltung.vorgangKBZ_Fn,
      Vorgangsverwaltung.startDatum_Fn,
      Vorgangsverwaltung.endDatum_Fn, Vorgangsverwaltung.erledigt_Fn,
      Vorgangsverwaltung.jobinArbeit_Fn,
      Vorgangsverwaltung.erledigt_Fn,
      Vorgangsverwaltung.job_Status_Fn,
      Vorgangsverwaltung.beschreibung_Fn,
      Vorgangsverwaltung._001_001_Mitarbeiter_DID_Fn,
      Vorgangsverwaltung.m_001_021_Mitarbeiter_Kürzel_Fn,
      Vorgangsverwaltung.m_068_027_Kunden_Nachname_Fn,
      Vorgangsverwaltung.m_068_026_Kunden_Firmenname_Fn,
      Vorgangsverwaltung.m_068_011_KundenNr_Fn};

    return fl;
  }
}
