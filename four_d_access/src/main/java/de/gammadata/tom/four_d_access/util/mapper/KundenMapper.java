/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.Kunden;
import com.tom.service.dto.KundenKopfDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * 
 * Mapper für Kunden Objekte
 * 
 * @author gfr_MB
 * 
 */
public class KundenMapper {

	/**
	 * mapped eine XmpSelection auf eine List of KundenKopfDTO
	 * 
	 * @param sel
	 *            XmpSelection
	 * @return List of KundenKopfDTO
	 */
	public static List<KundenKopfDTO> mapKopfdaten(XmpSelection sel) {
		if (sel == null || sel.getSelection() == null) {
			return null;
		}

		List<KundenKopfDTO> res = new ArrayList<KundenKopfDTO>();

		for (Xmp obj : sel.getSelection()) {
			KundenKopfDTO knd = mapKopfdaten((Kunden) obj);
			if (knd != null) {
				res.add(knd);
			}
		}

		return res;
	}

	/**
	 * mapped Kunden auf KundenKopfDTO
	 * 
	 * @param obj
	 *            Kunden
	 * @return KundenKopfDTO
	 */
	public static KundenKopfDTO mapKopfdaten(Kunden obj) {

		KundenKopfDTO knd = new KundenKopfDTO();
		if (obj == null) {
			return null;
		}

		BaseMapper.mapXmp(knd, obj);

		knd.setVorname(obj.getM_009_013_Adressen_Vorname());
		knd.setNachname(obj.getM_009_014_Adressen_Nachname());
		knd.setFirmenname(obj.getM_009_011_Adressen_Firmenname());

		knd.setAnzahlJobs(obj.getAnzJobs());
		knd.setJobNummerTemplate(obj.getJobNrVorgabe());
		knd.setKundennummer(knd.getKundennummer());

		return knd;

	}

}
