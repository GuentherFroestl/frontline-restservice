/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Mitarbeiter;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 * 
 */
public class MitarbeiterDAO extends AbstractDAO<Mitarbeiter> {

	public MitarbeiterDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	/**
	 * Sucht Mitarbeiter mit namen und passwort (login)
	 * 
	 * @param name
	 *            String
	 * @param pw
	 *            String Passwort
	 * @return
	 */
	public XmpSelection searchMitarbeiter(String name, String pw,
			boolean isAktiv) throws TomDbException {

		Mitarbeiter searchObj = new Mitarbeiter();
		getDbHandler().openQuery(); // Query erzeugen
		getDbHandler().addQueryPart(
				new QueryPart(
						new QueryOperant(searchObj, Mitarbeiter.aktiv_Fn),
						QueryPart.equal, new QueryOperant(isAktiv)));
		getDbHandler().addQueryPart(
				new QueryPart(QueryPart.booleanAnd, new QueryOperant(searchObj,
						Mitarbeiter.Kürzel_Fn), QueryPart.equal,
						new QueryOperant(name)));
		getDbHandler().addQueryPart(
				new QueryPart(QueryPart.booleanAnd, new QueryOperant(searchObj,
						Mitarbeiter.passwort_Fn), QueryPart.equal,
						new QueryOperant(pw)));

		searchObj.setAllFields();
		getDbHandler().setResultObject(searchObj);
		setLimits(0, STANDARD_LIMIT);

		XmpSelection resultSelection = getDbHandler().executeQuery();

		return resultSelection;

	}

	/**
	 * @param name
	 * @param mandantenId
	 * @param isAktiv
	 * @return
	 * @throws TomDbException
	 */
	public XmpSelection searchMitarbeiter(String name, Integer mandantenId,
			boolean isAktiv) throws TomDbException {

		Mitarbeiter searchObj = new Mitarbeiter();
		getDbHandler().openQuery(); // Query erzeugen

		getDbHandler().addQueryPart(
				new QueryPart(
						new QueryOperant(searchObj, Mitarbeiter.Kürzel_Fn),
						QueryPart.contains, new QueryOperant(name)));

		getDbHandler().addQueryPart(
				new QueryPart(QueryPart.booleanOr, new QueryOperant(searchObj,
						Mitarbeiter.vorname_Fn), QueryPart.contains,
						new QueryOperant(name)));

		getDbHandler().addQueryPart(
				new QueryPart(QueryPart.booleanOr, new QueryOperant(searchObj,
						Mitarbeiter.nachname_Fn), QueryPart.contains,
						new QueryOperant(name)));

		getDbHandler().addQueryPart(
				new QueryPart(QueryPart.booleanAnd, new QueryOperant(searchObj,
						Mitarbeiter.aktiv_Fn), QueryPart.equal,
						new QueryOperant(isAktiv)));

		searchObj.setAllFields();
		getDbHandler().setResultObject(searchObj);
		setLimits(0, STANDARD_LIMIT);

		XmpSelection resultSelection = getDbHandler().executeQuery();

		if (mandantenId > 0 && resultSelection != null
				& resultSelection.getSelection() != null) {
			XmpSelection filtered = new XmpSelection();
			for (Xmp x : resultSelection.getSelection()) {
				Mitarbeiter m = (Mitarbeiter) x;
				if (m.getExtern() || m.getDMandant() == mandantenId) {
					filtered.addToSelection(m);
				}

			}
			return filtered;
		}

		return resultSelection;

	}

	@Override
	public Mitarbeiter getXmpInstance() {
		return new Mitarbeiter();
	}

}
