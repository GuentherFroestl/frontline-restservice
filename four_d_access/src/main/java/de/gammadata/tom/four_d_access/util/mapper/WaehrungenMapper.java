/**
 *
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.tom.service.dto.WrgDTO;
import de.gammadata.tom.four_d_access.dbBeans.Waehrungen;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * Mapper für diverse Steuer Objekte
 *
 * @author gfr_MB
 *
 */
public class WaehrungenMapper {

  /**
   * mappt eine Liste von Xmp (SteuerBetraege) auf eine Liste von SteuerDTO
   *
   * @param selection List<Xmp>
   * @return List<SteuerDTO>
   */
  public static List<WrgDTO> map(XmpSelection xsel) {
    List<WrgDTO> res = null;
    if (xsel != null&&xsel.getSelection()!=null) {
      res = new ArrayList<WrgDTO>();

      for (Xmp obj : xsel.getSelection()) {
        res.add(map((Waehrungen) obj));
      }
    }

    return res;

  }

  /**
   * Mapper für SteuerArtDTO.
   *
   * @param xmp SteuerBetraege
   * @return
   */
  public static WrgDTO map(Waehrungen xmp) {
    if (xmp == null) {
      return null;
    }
    WrgDTO st = new WrgDTO();
    st.setId(xmp.getDID());
    st.setMandant(xmp.getDMandant());
    st.setBezeichnung(xmp.getWährungsbezeichnung());
    st.setZeichen(xmp.getWährungszeichen());
    st.setKursInEuro(new BigDecimal(xmp.getAktueller_Kurs()).
            setScale(2, BigDecimal.ROUND_HALF_UP));
    return st;
  }
}
