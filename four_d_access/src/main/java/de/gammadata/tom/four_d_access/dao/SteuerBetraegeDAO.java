/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import java.util.List;

import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.SteuerBetraege;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegTyp;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * DAO für Stuerbeträger
 * 
 * @author gfr_MB
 * 
 */
public class SteuerBetraegeDAO extends AbstractDAO<SteuerBetraege> {

	public SteuerBetraegeDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	@Override
	public SteuerBetraege getXmpInstance() {
		return new SteuerBetraege();
	}

	/**
	 * Lädt zu einem Beleg die Steuerbeträge
	 * 
	 * @param beleg
	 *            mit Beleg daten
	 * @return List<SteuerBetraege>
	 */
	@SuppressWarnings("unchecked")
	public List<Xmp> getSteuerBetraege(BelegKopfDTO beleg)
			throws TomDbException {
		if (beleg == null) {
			return null;
		}

		int tabNr = 63;
		if (BelegTyp.ANGEBOT.equals(beleg.getBelegTyp())
				|| BelegTyp.AUFTRAG.equals(beleg.getBelegTyp())) {
			tabNr = 67;
		}

		Xmp searchObj = getXmpInstance();
		DataBaseHandler dbHandler = getDbHandler();
		dbHandler.openQuery();

		dbHandler.addQueryPart(new QueryPart(new QueryOperant(searchObj,
				SteuerBetraege.belegTab_fn), QueryPart.equal, new QueryOperant(
				tabNr)));
		dbHandler.addQueryPart(new QueryPart(QueryPart.booleanAnd,
				new QueryOperant(searchObj, SteuerBetraege.belegDID_fn),
				QueryPart.equal, new QueryOperant(beleg.getId())));
		searchObj.setAllLoaded(false);
		searchObj.setAllFields();
		getDbHandler().setResultObject(searchObj);

		XmpSelection sel = getDbHandler().executeQuery();
		List<Xmp> res = sel.getSelection();

		return res;

	}

}
