/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.AktionsTabelle;
import com.tom.service.dto.SearchByStringRequest;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * DAO für TaskTypen
 * 
 * @author gfr_MB
 * 
 */
public class TaskTypeDAO extends AbstractDAO<AktionsTabelle> {

	public TaskTypeDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	@Override
	public AktionsTabelle getXmpInstance() {
		return new AktionsTabelle();
	}

	public XmpSelection searchTasks(SearchByStringRequest searchReq)
			throws TomDbException {

		XmpSelection resultSelection = null;
		Xmp searchObj = getXmpInstance();
		DataBaseHandler handler = getDbHandler();
		bulidStringSearchRequest(searchReq, handler, searchObj);

		searchObj.setFieldList(getCompactFieldSpecs());
		handler.setResultObject(searchObj);
		handler.setLoadOneObjects(false);
		setLimits(searchReq.getStartRecord(), searchReq.getLimit());
		resultSelection = getDbHandler().executeQuery();

		return resultSelection;
	}

	private void bulidStringSearchRequest(SearchByStringRequest searchReq,
			DataBaseHandler handler, Xmp obj) throws TomDbException {
		handler.openQuery();
		if (searchReq.isAllrecords()) {

			handler.addQueryPart(new QueryPart(new QueryOperant(obj,
					AktionsTabelle.dMandant_Fn), QueryPart.equal,
					new QueryOperant(searchReq.getMandantenId())));
		} else {
			String searchString = searchReq.getSearchString();
			if (searchString == null || searchString.length() == 0) {
				throw new TomDbException("Suchstring unzulässig ="
						+ searchString);
			}

			handler.addQueryPart(new QueryPart(new QueryOperant(obj,
					de.gammadata.tom.four_d_access.dbBeans.AktionsTabelle.kBZ_Fn), QueryPart.contains,
					new QueryOperant(searchString)));

			handler.addQueryPart(new QueryPart(QueryPart.booleanOr,
					new QueryOperant(obj,
							de.gammadata.tom.four_d_access.dbBeans.AktionsTabelle.beschreibung_Fn),
					QueryPart.contains, new QueryOperant(searchString)));

			handler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
					new QueryOperant(obj,
							de.gammadata.tom.four_d_access.dbBeans.AktionsTabelle.dMandant_Fn),
					QueryPart.equal, new QueryOperant(searchReq
							.getMandantenId())));
		}
	}

	/**
	 * Felder für das KopfDTO
	 * 
	 * @return int[] mit feldNummern
	 */
	protected int[] getCompactFieldSpecs() {
		int[] fl = { AktionsTabelle.dID_Fn, AktionsTabelle.kBZ_Fn,
				AktionsTabelle.beschreibung_Fn };
		return fl;
	}
}
