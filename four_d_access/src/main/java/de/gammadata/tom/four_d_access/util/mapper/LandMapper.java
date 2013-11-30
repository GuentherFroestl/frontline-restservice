/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import de.gammadata.tom.four_d_access.dbBeans.Laender;
import com.tom.service.dto.LandDTO;

/**
 * Mapper für Lander <> LandDTO
 * 
 * @author gfr_MB
 * 
 */
public class LandMapper extends AbstractMapper<Laender, LandDTO> {

	@Override
	public LandDTO map(Laender xmp) {

		if (xmp == null) {
			return null;
		}

		LandDTO res = new LandDTO();
		mapXmpBasics(res, xmp);
		res.setiSO3166Code_2(xmp.getISO3166Code_2());
		res.setiSO3166Code_3(xmp.getISO3166Code_3());
		res.setLandName(xmp.getLandName());
		res.setPostCode(xmp.getPostCode());
		return res;
	}

	public Laender map(LandDTO dto) {

		Laender xmp = new Laender();
		mapDTOBasics(xmp, dto);
		xmp.setISO3166Code_2(dto.getiSO3166Code_2());
		xmp.setISO3166Code_3(dto.getiSO3166Code_3());
		xmp.setLandName(dto.getLandName());
		xmp.setPostCode(dto.getPostCode());
		return xmp;

	}

}
