/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.SteuerBetraege;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * Mapper für diverse Steuer Objekte
 * 
 * @author gfr_MB
 * 
 */
public class SteuerMapper {

	/**
	 * mappt eine Liste von Xmp (SteuerBetraege) auf eine Liste von SteuerDTO
	 * 
	 * @param selection
	 *            List<Xmp>
	 * @return List<SteuerDTO>
	 */
	public static List<SteuerDTO> map(List<Xmp> selection) {

		List<SteuerDTO> res = null;
		if (selection != null) {
			res = new ArrayList<SteuerDTO>();

			for (Xmp obj : selection) {
				SteuerBetraege sb = (SteuerBetraege) obj;
				SteuerDTO sDTO = new SteuerDTO();
				sDTO.setBetrag(new BigDecimal(sb.getBetrag()).setScale(2,
						BigDecimal.ROUND_HALF_UP));
				sDTO.setId(sb.getDID());
				sDTO.setMandant(sb.getDMandant());
				SteuerArtDTO sa = new SteuerArtDTO();
				sa.setBezeichnung(sb.getM_003_011_Steuersatzbez());
				sa.setId(sb.get_003_001_SteuersätzeDID());
				sa.setSteuersatz(NumberMapper.convertWithRoundingToCent(sb
						.getM_003_012_SteuersatzIL()));
				sDTO.setSteuerArt(sa);

				res.add(sDTO);
			}
		}

		return res;

	}

}
