/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Laender;
import com.tom.service.dto.SearchByStringRequest;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 * 
 */
public class LaenderDAO extends AbstractDAO<Laender> {

	public LaenderDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	public XmpSelection searchLaender(SearchByStringRequest req)
			throws TomDbException {

		XmpSelection res = null;
		Laender searchObj = getXmpInstance();
		getDbHandler().openQuery();

		if (req.isAllrecords() || req.getSearchString() == null
				|| req.getSearchString().length() == 0) {

			getDbHandler().addQueryPart(
					new QueryPart(new QueryOperant(searchObj,
							Laender.dMandant_Fn), QueryPart.equal,
							new QueryOperant(req.getMandantenId())));

		} else {

			getDbHandler().addQueryPart(
					new QueryPart(new QueryOperant(searchObj,
							de.gammadata.tom.four_d_access.dbBeans.Laender.landName_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));

			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr, new QueryOperant(
							searchObj, de.gammadata.tom.four_d_access.dbBeans.Laender.postCode_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));

			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr,
							new QueryOperant(searchObj,
									de.gammadata.tom.four_d_access.dbBeans.Laender.iSO3166Code_2_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));

			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanOr,
							new QueryOperant(searchObj,
									de.gammadata.tom.four_d_access.dbBeans.Laender.iSO3166Code_3_Fn),
							QueryPart.contains, new QueryOperant(req
									.getSearchString())));

			getDbHandler().addQueryPart(
					new QueryPart(QueryPart.booleanAnd, new QueryOperant(
							searchObj, Laender.dMandant_Fn), QueryPart.equal,
							new QueryOperant(req.getMandantenId())));
		}

		searchObj.setFieldList(getCompactFieldSpecs());
		getDbHandler().setResultObject(searchObj);
		getDbHandler().setLoadOneObjects(false);
		setLimits(req.getStartRecord(), req.getLimit());

		res = getDbHandler().executeQuery();

		return res;

	}

	@Override
	public Laender storeXmpBean(Laender land) throws TomDbException {
		if (land == null) {
			throw new TomDbException("Versuch ein Null-Objekt zu speichern");
		}
		land.setFieldList(getCompactFieldSpecs());
		return super.storeXmpBean(land);

	}

	protected int[] getCompactFieldSpecs() {
		int[] fl = { Laender.dID_Fn, Laender.dMandant_Fn, Laender.postCode_Fn,
				Laender.landName_Fn, Laender.iSO3166Code_2_Fn,
				Laender.iSO3166Code_3_Fn };

		return fl;
	}

	@Override
	public Laender getXmpInstance() {
		return new Laender();
	}

}
