/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.Mandanten;
import com.tom.service.dto.MandantenKopfDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * Mapper für Mandanten Objekte
 * 
 * @author gfr
 * 
 */
public class MandantenMapper {

	/**
	 * Mappt das Mandanten auf MandantenKopfDTO
	 * 
	 * @param xmp
	 *            Mandanten
	 * @return MandantenKopfDTO
	 */
	public static MandantenKopfDTO mapKopfdaten(Mandanten xmp) {

		if (xmp == null) {
			return null;
		}

		MandantenKopfDTO dto = new MandantenKopfDTO();
		dto.setId(xmp.getMandantenNr());
		dto.setMandant(xmp.getMandantenNr());
		dto.setBezeichnung(xmp.getMandantenBez());
		dto.setAktiv(xmp.getAktiv());
		dto.setStandard(xmp.getStandardMandant());

		return dto;

	}

	/**
	 * mappt eine XmpSelection mit Mandanten auf eine Liste MandantenKopfDTO
	 * 
	 * @param sel
	 *            XmpSelection (Mandanten)
	 * @return List of MandantenKopfDTO
	 */
	public static List<MandantenKopfDTO> mapKopfdaten(XmpSelection sel) {
		if (sel == null || sel.getSelection() == null) {
			return null;
		}
		List<MandantenKopfDTO> res = new ArrayList<MandantenKopfDTO>();

		for (Xmp obj : sel.getSelection()) {
			MandantenKopfDTO pj = mapKopfdaten((Mandanten) obj);
			if (pj != null) {
				res.add(pj);
			}
		}

		return res;
	}

}
