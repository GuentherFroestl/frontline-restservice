/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.Mitarbeiter;
import com.tom.service.dto.UserDTO;
import com.tom.service.dto.UserKopfDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * Mapper für User und Mitarbeiter related Okjekte
 * 
 * @author gfr
 * 
 */
public class UserMapper extends BaseMapper {

	/**
	 * Mapped einen Mitarbeiter auf ein UserKopfDTO
	 * 
	 * @param obj
	 *            Mitarbeiter
	 * @return UserDTO
	 */
	public static UserKopfDTO mapKopf(Mitarbeiter obj) {
		if (obj == null) {
			return null;
		}
		UserKopfDTO dto = new UserDTO();
		map(dto, obj);
		return dto;
	}

	/**
	 * convienience methode
	 * 
	 * @param dto
	 *            UserKopfDTO
	 * @param obj
	 *            Mitarbeiter
	 */
	public static void map(UserKopfDTO dto, Mitarbeiter obj) {
		mapXmp(dto, obj);
		dto.setName(obj.getNachname());
		dto.setVorname(obj.getVorname());
		dto.setKbz(obj.getKürzel());
	}

	/**
	 * Mapped einen Mitarbeiter auf ein UserDTO
	 * 
	 * @param obj
	 *            Mitarbeiter
	 * @return UserDTO
	 */
	public static UserDTO map(Mitarbeiter obj) {
		if (obj == null) {
			return null;
		}
		UserDTO dto = new UserDTO();
		map(dto, obj);

		dto.setAktiv(obj.getAktiv());
		dto.setAllMandators(obj.getExtern());
		dto.setKontaktDaten(obj.getKontaktDaten().toString());
		dto.setSignet(obj.getKontaktDaten().toString());
		return dto;
	}

	/**
	 * Mapped eine Liste von Mitarbeitern auf eine Liste von UserKopfDTO
	 * 
	 * @param sel
	 *            XmpSelection
	 * @return List<UserKopfDTO>
	 */
	public static List<UserKopfDTO> mapKopf(XmpSelection sel) {
		if (sel == null) {
			return null;
		}
		List<UserKopfDTO> res = new ArrayList<UserKopfDTO>();
		for (Xmp obj : sel.getSelection()) {
			res.add(mapKopf((Mitarbeiter) obj));
		}

		return res;
	}

}
