/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.util.mapper;

import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.SteuerFallDTO;
import de.gammadata.tom.four_d_access.dbBeans.Auftraege;

/**
 * Maps BelegDTO to Auftraege.
 *
 * @author gfr
 */
public class AuftraegeMapper {

  /**
   * Maps BelegDTO to Auftraege.
   *
   * @param beleg BelegDTO
   * @return Auftraege
   */
  public static Auftraege map(BelegDTO beleg) {

    Auftraege auftrag = new Auftraege();
    auftrag.setDMandant(beleg.getMandant());
    if (beleg.getId() != null) {
      auftrag.setDID(beleg.getId());
    }
    auftrag.setLfd_Nr(beleg.getNummer());
    auftrag.setUuid(beleg.getUuid());
    auftrag.setBetreff(beleg.getBetreff());
    if (beleg.getVermerk1() != null) {
      auftrag.setVermerk1(new StringBuilder(beleg.getVermerk1()));
    }
    if (beleg.getVermerk2() != null) {
      auftrag.setVermerk2(new StringBuilder(beleg.getVermerk2()));
    }
    if (beleg.getVermerk3() != null) {
      auftrag.setVermerk3(new StringBuilder(beleg.getVermerk3()));
    }
    if (beleg.getVermerk4() != null) {
      auftrag.setVermerk4(new StringBuilder(beleg.getVermerk4()));
    }
    if (beleg.getDatum() != null) {
      auftrag.setEingangsdatum(new java.sql.Date(beleg.getDatum().getTime()));
    }
    if ("ABGESCHLOSSEN".equals(beleg.getStatus())) {
      auftrag.setAbgeschlossen(true);
    }
    if (BelegTyp.AUFTRAG.equals(beleg.getBelegTyp())) {
      auftrag.setAng_AuftragTyp(true);
    } else {
      auftrag.setAng_AuftragTyp(false);
    }
    if (beleg.getAdresse() != null && beleg.getAdresse().getId() != null) {
      auftrag.set_009_001_Adressen_DID_AB(beleg.getAdresse().getId());
    }
    if (beleg.getLieferAdresse() != null && beleg.getLieferAdresse().getId() != null) {
      auftrag.set_009_001_Adressen_DID_LF(beleg.getLieferAdresse().getId());
    }
    if (beleg.getRechnungsAdresse() != null && beleg.getRechnungsAdresse().getId() != null) {
      auftrag.set_009_001_Adressen_DID_RG(beleg.getRechnungsAdresse().getId());
    }

    if (SteuerFallDTO.EU.equals(beleg.getSteuerFall()) || SteuerFallDTO.STEUERFREI.equals(beleg.getSteuerFall())) {
      auftrag.setMwSt_pflichtig(false);
    } else {
      auftrag.setMwSt_pflichtig(true);
    }

    if (beleg.getWrg() != null && beleg.getWrg().getId() != null) {
      auftrag.set_005_001_Währungen_DID(beleg.getWrg().getId());
      auftrag.set_005_001_BezugsWährung_DID(beleg.getWrg().getId());
      auftrag.setM_005_011__022_WährZeichen(beleg.getWrg().getBezeichnung());
      auftrag.setKurs(beleg.getWrg().getKursInEuro().floatValue());
    }
    
    auftrag.setBetrag_Brutto(beleg.getPreis().getBruttoPreis().floatValue());
    auftrag.setBetrag_Euro(beleg.getPreis().getBruttoPreis().floatValue()); //Nur Euro keine Umrechnung
    auftrag.setBetrag_MwSt(beleg.getPreis().getSteuerBetrag().floatValue());
    auftrag.setBetrag_Netto(beleg.getPreis().getNettoPreis().floatValue());
    return auftrag;

  }
}
