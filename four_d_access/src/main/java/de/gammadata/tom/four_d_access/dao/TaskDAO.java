/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.OrderPart;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.Direction;
import com.tom.service.dto.OrderSpecification;
import com.tom.service.dto.SearchType;
import com.tom.service.dto.TaskSearchRequest;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 * 
 */
public class TaskDAO extends AbstractDAO<MAZeitverwaltung> {

	public TaskDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	@Override
	public MAZeitverwaltung getXmpInstance() {
		return new MAZeitverwaltung();
	}

	/**
	 * Sucht Tasks gemäß dem request
	 * 
	 * @param searchReq
	 *            TaskSearchRequest
	 * @return XmpSelection
	 * @throws TomDbException
	 */
	public XmpSelection searchTasks(TaskSearchRequest searchReq)
			throws TomDbException {

		XmpSelection resultSelection = null;
		Xmp searchObj = getXmpInstance();
		DataBaseHandler handler = getDbHandler();
		// Basic search request
		bulidSearchRequest(searchReq, handler, searchObj);
		// Listtype
		if (searchReq.getListType() != null && searchReq.getListType() >= 0) {
			handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
					new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.listID_Fn),
					QueryPart.equal, new QueryOperant(searchReq.getListType())));
		}
		// Dates
		if (searchReq.getStartDate() != null) {
			handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
					new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.datum_Fn),
					QueryPart.greaterEqual, new QueryOperant(searchReq
							.getStartDate())));
		}

		if (searchReq.getEndDate() != null) {
			handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
					new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.datum_Fn),
					QueryPart.lessEqual, new QueryOperant(searchReq
							.getEndDate())));
		}

		handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
				new QueryOperant(searchObj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.dMandant_Fn),
				QueryPart.equal, new QueryOperant(searchReq.getMandantenId())));

		buildOrdering(searchReq, handler, searchObj);

		searchObj.setFieldList(getCompactFieldSpecs());
		handler.setResultObject(searchObj);
		handler.setLoadOneObjects(false);
		setLimits(searchReq.getStartRecord(), searchReq.getLimit());
		resultSelection = getDbHandler().executeQuery();

		return resultSelection;
	}

	/**
	 * Baut die Sortierung in die Datenbankabfrage ein
	 * 
	 * @param searchReq
	 *            BasicSearchRequest
	 * @param handler
	 *            DataBaseHandler
	 * @param obj
	 *            Xmp
	 * @throws TomDbException
	 */
	private void buildOrdering(BasicSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		if (searchReq.getOrderByList() == null
				|| searchReq.getOrderByList().isEmpty()) {
			// Standard
			handler.addOrderPart(new OrderPart(new QueryOperant(obj,
					MAZeitverwaltung.datum_Fn), OrderPart.desc));
			return;
		}

		for (OrderSpecification os : searchReq.getOrderByList()) {

			int dir = OrderPart.asc;
			if (Direction.DESC.equals(os.getDirection())) {
				dir = OrderPart.desc;
			}
			QueryOperant op = null;
			if ("datum".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, MAZeitverwaltung.datum_Fn);
			} else if ("erledigt".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, MAZeitverwaltung.erledigt_Fn);
			}
			if (op != null) {
				handler.addOrderPart(new OrderPart(op, dir));
			}
		}
	}

	/**
	 * Wrapper zum Req bilden
	 * 
	 * @param searchReq
	 * @param handler
	 * @param obj
	 * @throws TomDbException
	 */
	private void bulidSearchRequest(TaskSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {

		handler.openQuery(); // Query erzeugen
		if (SearchType.BY_STRING.equals(searchReq.getSearchType())) {
			bulidStringSearchRequest(searchReq, handler, obj);
		} else if (SearchType.BY_PROJECT_ID.equals(searchReq.getSearchType())) {
			buildProjektSearchRequest(searchReq.getProjektId(), handler, obj);
		} else if (SearchType.BY_USER_ID.equals(searchReq.getSearchType())) {
			buildUserSearchRequest(searchReq, handler, obj);
		} else if (SearchType.BY_ADR_ID.equals(searchReq.getSearchType())) {
			buildAddressSearchRequest(searchReq, handler, obj);
		} else if (searchReq.isAllrecords()) {
			buildAllTaskSearchRequest(searchReq, handler, obj);
		} else {
			throw new TomDbException("Kein searchType definiert");
		}

	}

	/**
	 * Helper um den projekt search request zu bauen
	 * 
	 * @param searchString
	 * @param handler
	 * @param obj
	 */
	private void buildAllTaskSearchRequest(TaskSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		// all == empty
	}

	/**
	 * Helper um den ProjektID search request zu bauen
	 * 
	 * @param searchString
	 * @param handler
	 * @param obj
	 */
	private void buildProjektSearchRequest(int projektId,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		if (projektId == 0) {
			throw new TomDbException("ProjektID==0 unzulässig für die Suche");
		}
		handler.addQueryPart(new QueryPart(
				new QueryOperant(
						obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung._022_001_Vorgangsverwaltung_DID_Fn),
				QueryPart.equal, new QueryOperant(projektId)));
	}

	/**
	 * Helper um den UserID search request zu bauen
	 * 
	 * @param searchString
	 * @param handler
	 * @param obj
	 */
	private void buildUserSearchRequest(TaskSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		if (searchReq.getUserId() == 0) {
			throw new TomDbException("UserID==0 unzulässig für die Suche");
		}
		handler.addQueryPart(new QueryPart(new QueryOperant(obj,
				de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung._001_001_Mitarbeiter_DID_Fn),
				QueryPart.equal, new QueryOperant(searchReq.getUserId())));

	}

	/**
	 * ‚ Helper um den AdressID search request zu bauen
	 * 
	 * @param searchString
	 * @param handler
	 * @param obj
	 */
	private void buildAddressSearchRequest(TaskSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		if (searchReq.getRefId() == 0) {
			throw new TomDbException("UserID==0 unzulässig für die Suche");
		}
		handler.addQueryPart(new QueryPart(new QueryOperant(obj,
				de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung._009_001_Adressen_DID_Fn),
				QueryPart.equal, new QueryOperant(searchReq.getRefId())));

	}

	/**
	 * Helper um den Text Search zu bauen
	 * 
	 * @param searchString
	 * @param handler
	 * @param obj
	 */
	private void bulidStringSearchRequest(TaskSearchRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		String searchString = searchReq.getSearchString();
		if (searchString == null || searchString.length() == 0) {
			throw new TomDbException("Suchstring unzulässig =" + searchString);
		}

		handler.addQueryPart(new QueryPart(new QueryOperant(obj,
				de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.kBZ_Fn), QueryPart.contains,
				new QueryOperant(searchString)));
		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.m_022_031_VorgangNr_Fn),
				QueryPart.contains, new QueryOperant(searchString)));
		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(
						obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.m_001_021_Mitarbeiter_Kürzel_Fn),
				QueryPart.contains, new QueryOperant(searchString)));
		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(
						obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.m_021_011_Aktionstabelle_KBZ_Fn),
				QueryPart.contains, new QueryOperant(searchString)));

		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(
						obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.m_009_011_Adressen_Firmenname_Fn),
				QueryPart.contains, new QueryOperant(searchString)));

		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(
						obj,
						de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung.m_009_014_Adressen_Nachname_Fn),
				QueryPart.contains, new QueryOperant(searchString)));
		if (searchReq.isHasProjektId()) {
			handler.addQueryPart(new QueryPart(
					QueryPart.booleanAnd,
					new QueryOperant(
							obj,
							de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung._022_001_Vorgangsverwaltung_DID_Fn),
					QueryPart.equal, new QueryOperant(searchReq.getProjektId())));
		}
		if (searchReq.isHasAddressId()) {
			handler.addQueryPart(new QueryPart(
					QueryPart.booleanAnd,
					new QueryOperant(
							obj,
							de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung._009_001_Adressen_DID_Fn),
					QueryPart.equal, new QueryOperant(searchReq.getRefId())));
		}

	}

	/**
	 * Felder für das KopfDTO
	 * 
	 * @return int[] mit feldNummern
	 */
	protected int[] getCompactFieldSpecs() {
		int[] fl = { MAZeitverwaltung.dID_Fn, MAZeitverwaltung.dMandant_Fn,
				MAZeitverwaltung.datum_Fn,
				MAZeitverwaltung.m_021_011_Aktionstabelle_KBZ_Fn,
				MAZeitverwaltung._021_001__AktionsTabelle_DID_Fn,
				MAZeitverwaltung.listID_Fn, MAZeitverwaltung.kBZ_Fn,
				MAZeitverwaltung.uhrzeit_Fn, MAZeitverwaltung.kommentar_Fn,
				MAZeitverwaltung.dauerStd_Fn, MAZeitverwaltung.std_geplant_Fn,
				MAZeitverwaltung.enddatum_Fn, MAZeitverwaltung.erledigt_Fn,
				MAZeitverwaltung.inArbeit_Fn,
				MAZeitverwaltung.weiterverrechnen_Fn,
				MAZeitverwaltung._022_001_Vorgangsverwaltung_DID_Fn,
				MAZeitverwaltung.m_022_031_VorgangNr_Fn,
				MAZeitverwaltung._001_001_Mitarbeiter_DID_Fn,
				MAZeitverwaltung.m_001_021_Mitarbeiter_Kürzel_Fn,
				MAZeitverwaltung._009_001_Adressen_DID_Fn,
				MAZeitverwaltung.m_009_014_Adressen_Nachname_Fn,
				MAZeitverwaltung.m_009_011_Adressen_Firmenname_Fn

		};

		return fl;
	}

}
