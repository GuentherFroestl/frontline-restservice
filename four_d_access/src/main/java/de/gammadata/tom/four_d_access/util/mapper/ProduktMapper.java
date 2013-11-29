/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.util.mapper;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import de.gammadata.tom.four_d_access.dbBeans.Artikel;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.ArrayList;
import java.util.List;

/**
 * Mapper for Produkt / Artikel relatated stuff.
 *
 * @author gfr
 */
public class ProduktMapper extends AbstractMapper<Artikel, ProduktDTO> {

  /**
   * Maps most significant properties to ProduktKopfDTO.
   *
   * @param artikel Artikel
   * @return ProduktKopfDTO
   */
  public static ProduktKopfDTO mapKopf(Artikel artikel) {
    if (artikel == null) {
      return null;
    }
    ProduktKopfDTO prod = new ProduktKopfDTO();
    prod.setProduktCode(artikel.getArtikelNr());
    prod.setId(artikel.getDID());
    prod.setMandant(artikel.getDMandant());
    return prod;
  }

  @Override
  public ProduktDTO map(Artikel artikel) {
    if (artikel == null) {
      return null;
    }
    ProduktDTO prod = new ProduktDTO();
    mapXmp(prod, artikel);

    prod.setProduktCode(artikel.getArtikelNr());
    prod.setBeschreibung(artikel.getKurzbeschreibung());
    prod.setBeschreibung(artikel.getBeschreibung().toString());

    return prod;
  }

  /**
   * Maps a list of Artikel.
   *
   * @param sel XmpSelection with a list of Artikel
   * @return list of ProduktKopfDTO
   */
  public static List<ProduktKopfDTO> mapKopf(XmpSelection sel) {

    List<ProduktKopfDTO> list = new ArrayList<ProduktKopfDTO>();

    if (sel != null && sel.getListSize() > 0) {
      for (Xmp obj : sel.getSelection()) {
        ProduktKopfDTO prod = mapKopf((Artikel) obj);
        list.add(prod);
      }
    }
    return list;
  }
}
