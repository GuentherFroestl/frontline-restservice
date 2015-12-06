/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.SteuerDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Calculator for calculationg beleg totals
 * @author gfr
 */
public class BelegCalculator {
  
    /**
   * sum up postions and build totals
   *
   * @param beleg BelegDTO
   */
  public static void calculateTotals(BelegDTO beleg) {

    BigDecimal netTotal = BigDecimal.ZERO;
    BigDecimal grossTotal = BigDecimal.ZERO;
    BigDecimal taxTotal = BigDecimal.ZERO;
    List<SteuerDTO> gTaxList = null;
    Map<String, SteuerDTO> taxMap = new HashMap<String, SteuerDTO>();

    if (beleg.getPositionsListe() != null && !beleg.getPositionsListe().isEmpty()) {

      for (BelegPositionDTO pos : beleg.getPositionsListe()) {
        grossTotal = grossTotal.add(pos.getGesamtPreis().getBruttoPreis());
        netTotal = netTotal.add(pos.getGesamtPreis().getNettoPreis());
        taxTotal = taxTotal.add(pos.getGesamtPreis().getSteuerBetrag());
        //Taxes
        if (pos.getGesamtPreis().getSteuern() != null) {
          for (SteuerDTO steuer : pos.getGesamtPreis().getSteuern()) {
            if (!taxMap.containsKey(steuer.getSteuerArt().getBezeichnung())) {
              SteuerDTO posSteuer = new SteuerDTO(steuer);
              taxMap.put(steuer.getSteuerArt().getBezeichnung(), posSteuer);
            } else {
              SteuerDTO steuerArtSumme = taxMap.get(steuer.getSteuerArt().getBezeichnung());
              steuerArtSumme.setBetrag(steuerArtSumme.getBetrag().add(steuer.getBetrag()));
            }
          }
        }
      }
    }
    gTaxList = new ArrayList<SteuerDTO>(taxMap.values());
    PreisDTO gPreis = new PreisDTO();
    beleg.setPreis(gPreis);
    gPreis.setBruttoPreis(grossTotal);
    gPreis.setNettoPreis(netTotal);
    gPreis.setSteuerBetrag(taxTotal);
    gPreis.setSteuern(gTaxList);

  }
  
}
