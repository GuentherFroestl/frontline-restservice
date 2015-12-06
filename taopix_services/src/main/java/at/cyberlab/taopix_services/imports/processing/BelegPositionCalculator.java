/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Does pricing calculations on BelegPositionDTO
 *
 * @author gfr
 */
public class BelegPositionCalculator {

  static BigDecimal HUNDRED = new BigDecimal("100.000000");

  /**
   * DOes a complete recalculation of all prices starting from GesamtPreis Gross
   *
   * @param pos
   */
  public static void calculateFromTotalGross(BelegPositionDTO pos, SteuerArtDTO steuerArt) {

    if (pos == null || pos.getGesamtPreis() == null || pos.getGesamtPreis().getBruttoPreis() == null || steuerArt == null) {
      throw new IllegalArgumentException("one of the properties was null");
    }

    BigDecimal gesamtNetto = pos.getGesamtPreis().getBruttoPreis().setScale(8, RoundingMode.HALF_UP)
            .divide(HUNDRED.add(steuerArt.getSteuersatz()), RoundingMode.HALF_UP);
    gesamtNetto = gesamtNetto.multiply(HUNDRED).setScale(2, RoundingMode.HALF_UP);
    pos.getGesamtPreis().setNettoPreis(gesamtNetto);
    BigDecimal taxBetrag = pos.getGesamtPreis().getBruttoPreis().subtract(gesamtNetto);
    pos.getGesamtPreis().setSteuerBetrag(taxBetrag);

    SteuerDTO gesamtSteuer = new SteuerDTO();
    gesamtSteuer.setSteuerArt(steuerArt);
    gesamtSteuer.setBetrag(taxBetrag);
    List<SteuerDTO> gSteuerList = new ArrayList<SteuerDTO>();
    gSteuerList.add(gesamtSteuer);
    pos.getGesamtPreis().setSteuern(gSteuerList);

    //EP
    pos.setEinzelPreis(new PreisDTO());
    BigDecimal einzelnBrutto = pos.getGesamtPreis().getBruttoPreis().setScale(8, RoundingMode.HALF_UP)
            .divide(pos.getMenge(), RoundingMode.HALF_UP);
    pos.getEinzelPreis().setBruttoPreis(einzelnBrutto);
    BigDecimal einzelnNetto = gesamtNetto.setScale(8, RoundingMode.HALF_UP)
            .divide(pos.getMenge(), RoundingMode.HALF_UP);
    pos.getEinzelPreis().setNettoPreis(einzelnNetto);

    BigDecimal einzelnSteuerBetrag = taxBetrag.setScale(8, RoundingMode.HALF_UP)
            .divide(pos.getMenge(), RoundingMode.HALF_UP);
    pos.getEinzelPreis().setSteuerBetrag(einzelnSteuerBetrag);

    SteuerDTO einzelSteuer = new SteuerDTO();
    gesamtSteuer.setSteuerArt(steuerArt);
    gesamtSteuer.setBetrag(einzelnSteuerBetrag);
    List<SteuerDTO> eSteuerList = new ArrayList<SteuerDTO>();
    eSteuerList.add(einzelSteuer);
    pos.getEinzelPreis().setSteuern(eSteuerList);
  }
}
