/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Kunden;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 * 
 */
public class KundenDAO extends AbstractDAO<Kunden> {

	public KundenDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);

	}

	public XmpSelection searchKunden(SearchByStringRequest searchReq)
			throws TomException {
		XmpSelection resultSelection = null;
		Xmp searchObj = getXmpInstance();
		DataBaseHandler handler = getDbHandler();

		String searchString = searchReq.getSearchString();
		handler.openQuery(); // Query erzeugen
		handler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
				de.gammadata.tom.four_d_access.dbBeans.Kunden.m_009_013_Adressen_Vorname_Fn),
				QueryPart.contains, new QueryOperant(searchString)));

		handler.addQueryPart(new QueryPart(QueryPart.booleanOr,
				new QueryOperant(searchObj,
						de.gammadata.tom.four_d_access.dbBeans.Kunden.m_009_014_Adressen_Nachname_Fn),
				QueryPart.contains, new QueryOperant(searchString)));

		handler.addQueryPart(new QueryPart(
				QueryPart.booleanOr,
				new QueryOperant(searchObj,
						de.gammadata.tom.four_d_access.dbBeans.Kunden.m_009_011_Adressen_Firmenname_Fn),
				QueryPart.contains, new QueryOperant(searchString)));

		searchObj.setFieldList(getCompactFieldSpecs());
		handler.setResultObject(searchObj);
		handler.setLoadOneObjects(false);
		setLimits(searchReq.getStartRecord(), searchReq.getLimit());
		resultSelection = handler.executeQuery();
		return resultSelection;
	}

	@Override
	public Kunden getXmpInstance() {
		return new Kunden();
	}

	protected int[] getCompactFieldSpecs() {
		int[] fl = { Kunden.dID_Fn, Kunden.dMandant_Fn,
				Kunden.m_009_013_Adressen_Vorname_Fn,
				Kunden.m_009_014_Adressen_Nachname_Fn,
				Kunden.m_009_011_Adressen_Firmenname_Fn, Kunden.kundenNr_Fn,
				Kunden.anzJobs_Fn, Kunden.jobNrVorgabe_Fn };

		return fl;
	}

}
