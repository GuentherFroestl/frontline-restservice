/**
 *
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.BasicBean;
import com.tom.service.dto.BaseDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 *
 */
public abstract class AbstractMapper<X extends BasicBean, D extends BaseDTO> {

  /**
   * Maps the XMP to a DTO
   *
   * @param xmp XMP
   * @return DTO
   */
  public abstract D map(X xmp);

  /**
   * Maps the DTO to a XMP
   *
   * @param dto DTO
   * @return XMP
   */
  public abstract X map(D dto);

  @SuppressWarnings("unchecked")
  public List<D> map(XmpSelection sel) {
    List<D> res = new ArrayList<D>();
    if (sel == null || sel.getSize() == 0) {
      return res;
    }

    for (Xmp obj : sel.getSelection()) {
      res.add(map((X) obj));
    }
    return res;
  }

  /**
   * mappt das DTO auf das Xmp obj for ID and Mandant.
   *
   * @param obj Xmp
   * @param dto dto
   */
  public void mapDTOBasics(X obj, D dto) {
    if (dto.getId() != null) {
      obj.setDID(dto.getId());
    }
    if (dto.getMandant() != null) {
      obj.setDMandant(dto.getMandant());
    }
  }

  /**
   * mappt das Xmp auf das DTO obj for ID and Mandant.
   *
   * @param dto BaseDTO
   * @param obj Xmp
   */
  public void mapXmpBasics(D dto, X obj) {
    dto.setId(obj.getDID());
    dto.setMandant(obj.getDMandant());
  }
}
