/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.util.mapper;

import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import de.gammadata.tom.four_d_access.dbBeans.Artikel;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.math.BigDecimal;
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
    mapXmpBasics(prod, artikel);

    prod.setProduktCode(artikel.getArtikelNr());
    prod.setBezeichnung(artikel.getKurzbeschreibung());
    prod.setBeschreibung(artikel.getBeschreibung().toString());
    //Preis
    PreisDTO preis = new PreisDTO();
    preis.setNettoPreis(new BigDecimal(artikel.getVK1()));
    preis.setBruttoPreis(new BigDecimal(artikel.getVK3()));
    //Steuern
    SteuerArtDTO stArt = new SteuerArtDTO();
    stArt.setId(artikel.get_003_001_Steuersätze_DID());
    stArt.setSteuersatz(new BigDecimal(artikel.getM_003_012__034_Steuersatz_IL()));
    List<SteuerDTO> stList = new ArrayList<SteuerDTO>();
    SteuerDTO st = new SteuerDTO();
    st.setSteuerArt(stArt);
    st.setBetrag(new BigDecimal(artikel.getVK3()-artikel.getVK1()));
    stList.add(st);
    preis.setSteuern(stList);
    prod.setPreis(preis);

    return prod;
  }

  @Override
  public Artikel map(ProduktDTO dto) {

    Artikel artikel = new Artikel();
    mapDTOBasics(artikel, dto);
    artikel.setArtikelNr(dto.getProduktCode());
    artikel.setKurzbeschreibung(dto.getBezeichnung());
    if (dto.getBeschreibung() != null) {
      artikel.setBeschreibung(new StringBuilder(dto.getBeschreibung()));
    }
    //set price
    if (dto.getPreis() != null) {
      artikel.setVK1(getNullSaveDoubleValue(dto.getPreis().getNettoPreis()));
      artikel.setVK2(getNullSaveDoubleValue(dto.getPreis().getBruttoPreis()));
      //set taxes
      if (dto.getPreis().getSteuern() != null && !dto.getPreis().getSteuern().isEmpty()) {
        //only one tax supported by TOM      
        SteuerDTO st = dto.getPreis().getSteuern().get(0);
        if (st.getSteuerArt() != null) {
          artikel.set_003_001_Steuersätze_DID(st.getSteuerArt().getId());
          artikel.setM_003_012__034_Steuersatz_IL(getNullSaveDoubleValue(st.getSteuerArt().getSteuersatz()));
        }
      }
    }
    //set currency
    if (dto.getWrg() != null && dto.getWrg().getId() != null) {
      artikel.set_005_001_Währungen_DID(dto.getWrg().getId());
    }
    return artikel;

  }

  /**
   * Null save conversation to double.
   *
   * @param value BigDecimal
   * @return double
   */
  private double getNullSaveDoubleValue(BigDecimal value) {
    if (value == null) {
      return 0d;
    } else {
      return value.doubleValue();
    }
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
