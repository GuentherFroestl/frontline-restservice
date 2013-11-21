/**
 * 
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.Mandanten;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr
 * 
 */
public class MandantenDAO extends AbstractDAO<Mandanten> {

	public MandantenDAO(DataBaseSpec _dbSpec) {
		super(_dbSpec);
	}

	/**
	 * Lädt den Mandanten der als Standart gesetzt ist
	 * 
	 * @return
	 * @throws TomDbException
	 */
	public Mandanten loadStandardMandant() throws TomDbException {
		Mandanten stMandant = null;
		Mandanten searchObj = new Mandanten();
		getDbHandler().openQuery(); // Query erzeugen
		// nach standardMandant=true suchen
		getDbHandler().addQueryPart(
				new QueryPart(new QueryOperant(searchObj,
						Mandanten.standardMandant_Fn), QueryPart.equal,
						new QueryOperant(true)));

		searchObj.setAllFields();
		getDbHandler().setResultObject(searchObj);
		setLimits(0, STANDARD_LIMIT);

		XmpSelection resultSelection = getDbHandler().executeQuery();

		if ((resultSelection != null) && (resultSelection.getListSize() > 0)) {
			stMandant = (Mandanten) resultSelection.getXmpObject(0); // 1.
																		// Eintrag
																		// nehmen
		} else {
			throw new TomDbException("No result");
		}

		return stMandant;
	}

	/**
	 * Liefert die Liste allerMandanten zurück
	 * 
	 * @return XmpSelection mit Mandanten
	 * @throws TomDbException
	 */
	public XmpSelection listMandanten() throws TomDbException {
		Mandanten searchObj = new Mandanten();

		int[] fieldList = { Mandanten.mandantenNr_Fn,
				Mandanten.mandantenBez_Fn, Mandanten.standardMandant_Fn,
				Mandanten.aktiv_Fn };

		searchObj.setFieldList(fieldList);

		XmpSelection resultSelection = getAllRecords(searchObj,
				Integer.valueOf(0), Integer.valueOf(STANDARD_LIMIT));

		return resultSelection;
	}

	/**
	 * Liefert die Liste allerMandanten zurück
	 * 
	 * @return XmpSelection mit Mandanten
	 * @throws TomDbException
	 */
	public XmpSelection listAktiveMandanten() throws TomDbException {
		Mandanten searchObj = new Mandanten();

		int[] fieldList = { Mandanten.mandantenNr_Fn,
				Mandanten.mandantenBez_Fn, Mandanten.standardMandant_Fn,
				Mandanten.aktiv_Fn };

		searchObj.setFieldList(fieldList);

		getDbHandler().openQuery(); // Query erzeugen
		// nach standardMandant=true suchen
		getDbHandler().addQueryPart(
				new QueryPart(new QueryOperant(searchObj, Mandanten.aktiv_Fn),
						QueryPart.equal, new QueryOperant(true)));

		getDbHandler().setResultObject(searchObj);
		setLimits(0, STANDARD_LIMIT);

		XmpSelection resultSelection = getDbHandler().executeQuery();

		return resultSelection;

	}

	@Override
	public Mandanten getXmpInstance() {
		return new Mandanten();
	}

}
