/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import com.tom.service.dto.BaseDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;

/**
 * BaseMapper für DTO - XMP
 * 
 * @author gfr_MB
 * 
 */
public class BaseMapper {

	/**
	 * mappt das DTO auf das Xmp obj
	 * 
	 * @param obj
	 *            Xmp
	 * @param dto
	 *            dto
	 */
	public static void mapDTO(Xmp obj, BaseDTO dto) {
		if (dto.getId() != null) {
			obj.setDID(dto.getId());
		}
		if (dto.getMandant() != null) {
			obj.setDMandant(dto.getMandant());
		}
	}

	/**
	 * mappt das Xmp auf das DTO obj
	 * 
	 * @param dto
	 *            BaseDTO
	 * @param obj
	 *            Xmp
	 */
	public static void mapXmp(BaseDTO dto, Xmp obj) {
		dto.setId(obj.getDID());
		dto.setMandant(obj.getDMandant());
	}

	/**
	 * Bildet einen Namen aus Teilen (Vorname, Nachname, Firma, etc.) unter
	 * Berücksichtigung von null und leeren String Strings
	 * 
	 * @param strings
	 *            String werte
	 * @return String
	 */
	public static String buildName(String delimiter, String... strings) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String in : strings) {

			if (in != null && in.length() > 0) {
				if (!first) {
					sb.append(delimiter).append(in);
				} else {
					sb.append(in);
				}
				first = false;
			}

		}

		return sb.toString();
	}

}
