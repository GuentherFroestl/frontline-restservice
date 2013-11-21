/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.OrderPart;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Adressen;
import com.tom.service.dto.BasicSearchRequest;
import com.tom.service.dto.Direction;
import com.tom.service.dto.OrderSpecification;
import com.tom.service.dto.SearchByStringRequest;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr
 * 
 */
public class AdressenDAO extends AbstractDAO<Adressen> {

	/**
	 * @param _dbSpec
	 */
	public AdressenDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	/**
	 * Sucht in Adressen nach dem Suchstring in Vorname, Nachname, firma, email
	 * 
	 * @param req
	 *            .getSearchString()
	 * @return XmpSelection of Adressen <br/>
	 *         felder:<br/>
	 *         Adressen.VORNAME, Adressen.NACHNAME, Adressen.FIRMENNAME,
	 *         Adressen.FIRMENNAME_2, Adressen.TELEFON, Adressen.HANDY,
	 *         Adressen.EMAIL, Adressen.EMAIL2, Adressen.STRASSE, Adressen.PLZ,
	 *         Adressen.ORT <br/>
	 * @throws TomDbException
	 */
	public XmpSelection searchAdressen(SearchByStringRequest req)
			throws TomDbException {

		if (req == null) {
			throw new TomDbException("Illegal argument in request ");
		}

		XmpSelection resultSelection = null;
		de.gammadata.tom.four_d_access.dbBeans.Adressen searchObj = new de.gammadata.tom.four_d_access.dbBeans.Adressen();

		getDbHandler().openQuery(); // Query erzeugen
		if (req.isAllrecords()) {
			getDbHandler().addQueryPart(
					new QueryPart(new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.Adressen.dMandant_Fn),
							QueryPart.equal, new QueryOperant(req
									.getMandantenId())));

		} else {
			if (req.getSearchString() == null) {
				throw new TomDbException("Illegal argument in request ");
			}
			// nach Suchwert suchen
			getDbHandler().addQueryPart(
					new QueryPart(new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.Adressen.vorname_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));
			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr, new QueryOperant(
							searchObj, de.gammadata.tom.four_d_access.dbBeans.Adressen.nachname_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));
			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr, new QueryOperant(
							searchObj, de.gammadata.tom.four_d_access.dbBeans.Adressen.firmenname_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));
			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr,
							new QueryOperant(searchObj,
									de.gammadata.tom.four_d_access.dbBeans.Adressen.firmenname2_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));
			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr, new QueryOperant(
							searchObj, de.gammadata.tom.four_d_access.dbBeans.Adressen.eMail_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));
		}

		buildOrdering(req, getDbHandler(), searchObj);

		searchObj.setFieldList(getCompactFieldSpecs());
		getDbHandler().setResultObject(searchObj);
		getDbHandler().setRecordLimit(req.getLimit());
		getDbHandler().setStartRecord(req.getStartRecord());
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
			return;
		}

		for (OrderSpecification os : searchReq.getOrderByList()) {

			int dir = OrderPart.asc;
			if (Direction.DESC.equals(os.getDirection())) {
				dir = OrderPart.desc;
			}
			QueryOperant op = null;
			if ("name".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, Adressen.nachname_Fn);
			} else if ("vorname".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, Adressen.vorname_Fn);
			} else if ("firma".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, Adressen.firmenname_Fn);
			} else if ("stadt".equalsIgnoreCase(os.getPropertyName())) {
				op = new QueryOperant(obj, Adressen.ort_Fn);
			}
			if (op != null) {
				handler.addOrderPart(new OrderPart(op, dir));
			}
		}

	}

	@Override
	public Adressen getXmpInstance() {
		return new Adressen();
	}

	/**
	 * A compact Array of fields;
	 * 
	 * @return FieldSpec[]
	 */
	public int[] getCompactFieldSpecs() {
		int[] fieldSpecs = { Adressen.dMandant_Fn, Adressen.uuid_Fn,
				Adressen.vorname_Fn, Adressen.nachname_Fn,
				Adressen.firmenname_Fn, Adressen.firmenname2_Fn,
				Adressen.telefon_Fn, Adressen.handy_Fn, Adressen.eMail_Fn,
				Adressen.email2_Fn, Adressen.adressfeld1_Fn, Adressen.pLZ_Fn,
				Adressen.ort_Fn };
		return fieldSpecs;
	}

}
