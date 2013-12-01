/**
 *
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.Auftraege;
import de.gammadata.tom.four_d_access.dbBeans.AuftragsPos;
import de.gammadata.tom.four_d_access.dbBeans.AusRech;
import de.gammadata.tom.four_d_access.dbBeans.AusRechPos;
import de.gammadata.tom.four_d_access.dbBeans.BestellPos;
import de.gammadata.tom.four_d_access.dbBeans.Bestellungen;
import de.gammadata.tom.four_d_access.dbBeans.EinRech;
import de.gammadata.tom.four_d_access.dbBeans.Lieferpos;
import de.gammadata.tom.four_d_access.dbBeans.Lieferscheine;
import com.tom.service.dto.AddressKopfDTO;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.BestellungDTO;
import com.tom.service.dto.LieferantenKopfDTO;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.ProjektKopfDTO;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import com.tom.service.dto.SteuerFallDTO;
import com.tom.service.dto.WrgDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Mappt verschiedene Objekte rund ums BelegDTO
 *
 * @author gfr_MB
 *
 */
public class BelegMapper {

  /**
   * Mappt eine Liste von Aufträgen auf eine Liste von BelegKopfDTO
   *
   * @param aList List<Auftraege>
   * @return List<BelegKopfDTO>
   */
  public static List<BelegKopfDTO> map(XmpSelection sel) {
    if (sel == null || sel.getSelection() == null) {
      return null;
    }
    List<BelegKopfDTO> res = new ArrayList<BelegKopfDTO>();

    for (Xmp obj : sel.getSelection()) {
      BelegKopfDTO bk = mapKopfDaten(obj);
      if (bk != null) {
        res.add(bk);
      }
    }

    return res;
  }

  /**
   * Mappt die Kopfdaten je nach BelegArt
   *
   * @param obj Xmp (Auftraege, AusRech, Lieferscheine , EinRech)
   * @return BelegKopfDTO
   */
  public static BelegKopfDTO mapKopfDaten(Xmp obj) {
    if (obj == null) {
      return null;
    }
    if (obj instanceof Auftraege) {
      return mapKopfDaten((Auftraege) obj);
    } else if (obj instanceof AusRech) {
      return mapKopfDaten((AusRech) obj);
    } else if (obj instanceof Lieferscheine) {
      return mapKopfDaten((Lieferscheine) obj);
    } else if (obj instanceof Bestellungen) {
      return mapKopfDaten((Bestellungen) obj);
    } else if (obj instanceof EinRech) {
      // TODO
      return null;
    } else {
      return null;
    }
  }

  /**
   * Mappt die XMP Daten je nach BelegArt auf ein BelegDTO
   *
   * @param obj Xmp (Auftraege, AusRech, Lieferscheine , EinRech)
   * @return BelegDTO
   */
  public static BelegDTO map(Xmp obj) {
    if (obj == null) {
      return null;
    }

    if (obj instanceof Auftraege) {
      return map((Auftraege) obj);
    } else if (obj instanceof AusRech) {
      return map((AusRech) obj);
    } else if (obj instanceof Lieferscheine) {
      return map((Lieferscheine) obj);
    } else if (obj instanceof Bestellungen) {
      return map((Bestellungen) obj);
    } else if (obj instanceof EinRech) {
      //TODO
      return null;
    } else {
      return null;
    }
  }

  /**
   * Mapped einen Auftrag auf ein BelegDTO
   *
   * @param auftrag Aufträge
   * @return BelegDTO
   */
  public static BelegDTO map(Auftraege auftrag) {

    BelegDTO beleg = new BelegDTO();
    mapKopfDaten(beleg, auftrag);

    beleg.setVermerk1(auftrag.getVermerk1().toString());
    beleg.setVermerk2(auftrag.getVermerk2().toString());
    beleg.setVermerk3(auftrag.getVermerk3().toString());
    beleg.setVermerk4(auftrag.getVermerk4().toString());
    if (!auftrag.getMwSt_pflichtig()) {
      beleg.setSteuerFall(SteuerFallDTO.STEUERFREI);
    }

    if (auftrag.get_009_001_Adressen_DID_LF() > 0) {
      AddressKopfDTO adr = new AddressKopfDTO();
      adr.setId(auftrag.get_009_001_Adressen_DID_LF());
      beleg.setLieferAdresse(adr);
    }
    if (auftrag.get_009_001_Adressen_DID_RG() > 0) {
      AddressKopfDTO adr = new AddressKopfDTO();
      adr.setId(auftrag.get_009_001_Adressen_DID_RG());
      beleg.setRechnungsAdresse(adr);
    }

    return beleg;

  }

  /**
   * Mapped einen Lieferscheine auf ein BelegDTO
   *
   * @param lieferschein Lieferscheine
   * @return BelegDTO
   */
  public static BelegDTO map(Lieferscheine lieferschein) {

    BelegDTO beleg = new BelegDTO();
    mapKopfDaten(beleg, lieferschein);

    beleg.setVermerk1(lieferschein.getVermerk1().toString());
    beleg.setVermerk2(lieferschein.getVermerk2().toString());
    beleg.setVermerk3(lieferschein.getVermerk3().toString());
    beleg.setVermerk4(lieferschein.getVermerk4().toString());
    if (!lieferschein.getMwSt_pflichtig()) {
      beleg.setSteuerFall(SteuerFallDTO.STEUERFREI);
    }

    if (lieferschein.get_009_001_Adressen_DID() > 0) {
      AddressKopfDTO adr = new AddressKopfDTO();
      adr.setId(lieferschein.get_009_001_Adressen_DID());
      beleg.setLieferAdresse(adr);
    }

    return beleg;

  }

  /**
   * Mappe eine Bestellung auf ein BelegDTO
   *
   * @param auftrag Aufträge
   * @return BelegDTO
   */
  public static BelegDTO map(Bestellungen best) {

    BestellungDTO beleg = new BestellungDTO();
    mapKopfDaten(beleg, best);

    beleg.setVermerk1(best.getVermerk1().toString());
    beleg.setVermerk2(best.getVermerk2().toString());
    beleg.setVermerk3(best.getVermerk3().toString());
    beleg.setVermerk4(best.getVermerk4().toString());
    if (!best.getMwSt_plichtig()) {
      beleg.setSteuerFall(SteuerFallDTO.STEUERFREI);
    }

    if (best.get_009_001_Adressen_DID_LF() > 0) {
      AddressKopfDTO adr = new AddressKopfDTO();
      adr.setId(best.get_009_001_Adressen_DID_LF());
      beleg.setLieferAdresse(adr);
    }
    if (best.get_009_001_Adressen_DID_RG() > 0) {
      AddressKopfDTO adr = new AddressKopfDTO();
      adr.setId(best.get_009_001_Adressen_DID_RG());
      beleg.setRechnungsAdresse(adr);
    }

    if (best.get_060_001__Lieferanten_DID() > 0) {
      LieferantenKopfDTO lief = new LieferantenKopfDTO();
      lief.setId(best.get_060_001__Lieferanten_DID());
      lief.setNummer(best.getM_060_011_LieferantenNr());
      lief.setFirmenname(best.getM_060_025_LieferantenName());
      beleg.setLieferant(lief);
    }

    return beleg;

  }

  /**
   * Mapped einen Auftrag auf ein BelegKopfDTO
   *
   * @param auftrag Aufträge
   * @return BelegKopfDTO
   */
  public static BelegKopfDTO mapKopfDaten(Auftraege auftrag) {

    BelegKopfDTO bk = new BelegKopfDTO();
    mapKopfDaten(bk, auftrag);
    return bk;
  }

  /**
   * Mapt eine Rechnung auf ein BelegDTO
   *
   * @param rech AusRech
   * @return BelegDTO
   */
  public static BelegDTO map(AusRech rech) {

    BelegDTO beleg = new BelegDTO();
    mapKopfDaten(beleg, rech);

    beleg.setVermerk1(rech.getVermerk1().toString());
    beleg.setVermerk2(rech.getVermerk2().toString());
    beleg.setVermerk3(rech.getVermerk3().toString());
    beleg.setVermerk4(rech.getVermerk4().toString());
    if (!rech.getMwSt_plichtig()) {
      beleg.setSteuerFall(SteuerFallDTO.STEUERFREI);
    }

    return beleg;

  }

  /**
   * Mapped einen AusRech auf ein BelegKopfDTO
   *
   * @param rech AusRech
   * @return BelegKopfDTO
   */
  public static BelegKopfDTO mapKopfDaten(AusRech rech) {

    BelegKopfDTO bk = new BelegKopfDTO();
    mapKopfDaten(bk, rech);
    return bk;
  }

  /**
   * Mapped einen AusRech auf ein BelegKopfDTO
   *
   * @param lieferschein Lieferscheine
   * @return BelegKopfDTO
   */
  public static BelegKopfDTO mapKopfDaten(Lieferscheine lieferschein) {

    BelegKopfDTO bk = new BelegKopfDTO();
    mapKopfDaten(bk, lieferschein);
    return bk;
  }

  /**
   * Mapped einen Bestellungen auf ein BelegKopfDTO
   *
   * @param Bestellungen Lieferscheine
   * @return BelegKopfDTO
   */
  public static BelegKopfDTO mapKopfDaten(Bestellungen bestellung) {

    BelegKopfDTO bk = new BelegKopfDTO();
    mapKopfDaten(bk, bestellung);
    return bk;
  }

  /**
   * mappt eine XmpSelection mit Positionobjekten (z.B. AusRechPos)
   *
   * @param sel XmpSelection
   * @return List<BelegPositionDTO>
   */
  public static List<BelegPositionDTO> mapPosliste(XmpSelection sel) {
    if (sel == null) {
      return null;
    }
    List<Xmp> xs = sel.getSelection();
    List<BelegPositionDTO> res = new ArrayList<BelegPositionDTO>();
    if (xs.size() > 0) {
      for (Xmp obj : xs) {
        if (obj instanceof AusRechPos) {
          res.add(map((AusRechPos) obj));
        } else if (obj instanceof AuftragsPos) {
          res.add(map((AuftragsPos) obj));
        } else if (obj instanceof Lieferpos) {
          res.add(map((Lieferpos) obj));
        } else if (obj instanceof BestellPos) {
          res.add(map((BestellPos) obj));
        }
      }
    }
    return res;

  }

  /**
   * mappt ein AusRechPos auf eine BelegPositionDTO
   *
   * @param arPos AusRechPos
   * @return BelegPositionDTO
   */
  public static BelegPositionDTO map(AusRechPos arPos) {
    if (arPos == null) {
      return null;
    }

    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setBeschreibung(arPos.getArtikelBeschreibung().toString());
    pos.setBezeichnung(arPos.getArtikelBez());
    pos.setId(arPos.getDID());
    pos.setLeistungsDatum(arPos.getLieferDatum());
    pos.setMandant(arPos.getDMandant());
    pos.setMenge(NumberMapper.convertMenge(arPos.getMenge()));
    pos.setPosNummer(arPos.getPosNr());
    double eBr;
    if (arPos.getMenge() != 0) {
      eBr = arPos.getVK_Gesamt_brutto() / arPos.getMenge();
    } else {
      eBr = arPos.getVK_Einzel_netto() + arPos.getVK_Einzel_netto()
              * arPos.getMWST_Satz() / 100d;
    }
    double eSt = eBr - arPos.getVK_Einzel_netto();
    pos.setEinzelPreis(mapPosPreis(arPos.getVK_Einzel_netto(), eBr, eSt,
            arPos.getMWST_Satz(), arPos.get_003_001_Steuersatz_DID()));
    double bSt = arPos.getVK_Gesamt_brutto() - arPos.getVK_Gesamt_netto();
    pos.setGesamtPreis(mapPosPreis(arPos.getVK_Gesamt_netto(),
            arPos.getVK_Gesamt_brutto(), bSt, arPos.getMWST_Satz(),
            arPos.get_003_001_Steuersatz_DID()));

    pos.setProdukt(mapProdukt(arPos.get_032_001_Artikel_DID(), arPos.getM_032_011__012_Artikel_ArtikelN()));
    return pos;

  }

  /**
   * mappt ein AuftragsPos auf eine BelegPositionDTO
   *
   * @param aufPos AuftragsPos
   * @return BelegPositionDTO
   */
  public static BelegPositionDTO map(AuftragsPos aufPos) {
    if (aufPos == null) {
      return null;
    }

    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setBeschreibung(aufPos.getArtikelBeschr().toString());
    pos.setBezeichnung(aufPos.getArtikelBez());
    pos.setId(aufPos.getDID());
    pos.setLeistungsDatum(aufPos.getLiefertermin());
    pos.setMandant(aufPos.getDMandant());
    pos.setMenge(NumberMapper.convertMenge(aufPos.getMenge()));
    pos.setPosNummer(aufPos.getPosNr());
    double eBr;
    if (aufPos.getMenge() != 0) {
      eBr = aufPos.getVK_Gesamt_Brutto() / aufPos.getMenge();
    } else {
      eBr = aufPos.getVK_Preis() + aufPos.getVK_Preis()
              * aufPos.getMwST_Satz() / 100d;
    }
    double eSt = eBr - aufPos.getVK_Preis();
    pos.setEinzelPreis(mapPosPreis(aufPos.getVK_Preis(), eBr, eSt,
            aufPos.getMwST_Satz(), aufPos.get_003_001_Steuersätze_DID()));
    double bSt = aufPos.getVK_Gesamt_Brutto() - aufPos.getVK_Gesamt_netto();
    pos.setGesamtPreis(mapPosPreis(aufPos.getVK_Gesamt_netto(),
            aufPos.getVK_Gesamt_Brutto(), bSt, aufPos.getMwST_Satz(),
            aufPos.get_003_001_Steuersätze_DID()));
    pos.setProdukt(mapProdukt(aufPos.get_032_001_Artikel_DID(), aufPos.getM_032_011__012_ArtikelNr()));

    return pos;

  }

  /**
   * mapped eine BelegPositionDTO aud ein Aufpos
   *
   * @param pos
   * @return
   */
  public static AuftragsPos mapAuftragsPos(BelegPositionDTO pos, int auftragId) {
    if (pos == null) {
      return null;
    }
    AuftragsPos aufPos = new AuftragsPos();
    aufPos.set_067_001__Aufträge_DID(auftragId);
    if (pos.getId() != null&&pos.getId()>0) {
      aufPos.setDID(pos.getId());
    }
    aufPos.setDMandant(pos.getMandant());
    aufPos.setArtikelBez(pos.getBezeichnung());
    aufPos.setArtikelBeschr(new StringBuilder(pos.getBeschreibung()));
    aufPos.setPosNr(pos.getPosNummer());
    if (pos.getLeistungsDatum() != null) {
      aufPos.setAE_Datum(new Date(pos.getLeistungsDatum().getTime()));
    } else {
      aufPos.setAE_Datum(new Date(System.currentTimeMillis()));
      aufPos.setLiefertermin(aufPos.getAE_Datum());
    }
    aufPos.setMenge(pos.getMenge().doubleValue());

    if (pos.getGesamtPreis() != null) {
      aufPos.setVK_Gesamt_Brutto(pos.getGesamtPreis().getBruttoPreis().doubleValue());
      aufPos.setVK_Gesamt_netto(pos.getGesamtPreis().getNettoPreis().doubleValue());

    }

    if (pos.getEinzelPreis() != null) {
      aufPos.setVK_Preis(pos.getEinzelPreis().getNettoPreis().doubleValue());
      if (pos.getEinzelPreis().getSteuern() != null && !pos.getEinzelPreis().getSteuern().isEmpty()) {
        aufPos.set_003_001_Steuersätze_DID(pos.getEinzelPreis().getSteuern().get(0).getSteuerArt().getId());
        aufPos.setMwST_Satz(pos.getEinzelPreis().getSteuern().get(0).getSteuerArt().getSteuersatz().doubleValue());
      }
    }

    if (pos.getProdukt() != null) {
      aufPos.set_032_001_Artikel_DID(pos.getProdukt().getId());
      aufPos.setLast_Artikel_DID(pos.getProdukt().getId());
      aufPos.setM_032_011__012_ArtikelNr(pos.getProdukt().getProduktCode());
    }

    return aufPos;

  }

  /**
   * mappt ein AuftragsPos auf eine BelegPositionDTO
   *
   * @param lieferPos AuftragsPos
   * @return BelegPositionDTO
   */
  public static BelegPositionDTO map(Lieferpos lieferPos) {
    if (lieferPos == null) {
      return null;
    }

    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setBezeichnung(lieferPos.getArtikelbezeichnung());
    pos.setId(lieferPos.getDID());
    pos.setLeistungsDatum(lieferPos.getM_066_012_LieferscheinDatum());
    pos.setMandant(lieferPos.getDMandant());
    pos.setMenge(NumberMapper.convertMenge(lieferPos.getMenge()));
    pos.setPosNummer(lieferPos.getPosNr());

    double eSt = lieferPos.getEP_brutto() - lieferPos.getEP_netto();
    pos.setEinzelPreis(mapPosPreis(lieferPos.getEP_netto(),
            lieferPos.getEP_brutto(), eSt, lieferPos.getMwst_Satz(),
            lieferPos.get_003_001_Steuersätze_DID()));
    double bSt = lieferPos.getGP_brutto() - lieferPos.getGP_netto();
    pos.setGesamtPreis(mapPosPreis(lieferPos.getGP_netto(),
            lieferPos.getGP_brutto(), bSt, lieferPos.getMwst_Satz(),
            lieferPos.get_003_001_Steuersätze_DID()));

    pos.setProdukt(mapProdukt(lieferPos.get_032_001_Artikel_DID(), lieferPos.getM_032_011_Artikel_Nr()));

    return pos;

  }

  /**
   * mappt eine BestellPos auf eine BelegPositionDTO
   *
   * @param bPos BestellPos
   * @return BelegPositionDTO
   */
  public static BelegPositionDTO map(BestellPos bPos) {
    if (bPos == null) {
      return null;
    }
    BelegPositionDTO pos = new BelegPositionDTO();
    pos.setId(bPos.getDID());
    pos.setMandant(bPos.getDMandant());
    pos.setPosNummer(bPos.getPosNr());
    pos.setLeistungsDatum(bPos.getLieferTermin());
    pos.setBezeichnung(bPos.getBestellbez());
    pos.setBeschreibung(bPos.getZusatztext().toString());
    pos.setMenge(NumberMapper.convertMenge(bPos.getMenge()));
    pos.setEinzelPreis(mapPosPreis(bPos.getEK_Einzel_Netto(),
            bPos.getEK_Gesamt_Brutto() / bPos.getMenge() - bPos.getEK_Einzel_Netto(), bPos.getEK_Gesamt_Brutto() / bPos.getMenge(), bPos.getMwstSatz(), 0)); //keine Steuer ID da

    pos.setGesamtPreis(mapPosPreis(bPos.getEK_Gesamt_Netto(),
            bPos.getEK_Gesamt_Brutto() - bPos.getEK_Gesamt_Netto(), bPos.getEK_Gesamt_Brutto(), bPos.getMwstSatz(), 0)); //keine Steuer ID da

    pos.setProdukt(mapProdukt(bPos.get_032_001_Artikel_DID(), bPos.getM_032_011_Artikel_Nr()));
    return pos;
  }

  /**
   * mappt die Kopfdaten für eine AusRech
   *
   * @param bk BelegKopfDTO Zielobjekt
   * @param rech AusRech
   */
  private static void mapKopfDaten(BelegKopfDTO bk, AusRech rech) {

    bk.setNummer(rech.getRechnungsnummer());
    bk.setDatum(rech.getRechnungsdatum());
    bk.setId(rech.getDID());
    bk.setMandant(rech.getDMandant());
    bk.setBetreff(rech.getBemerkung());
    if (rech.getGurschriftflag()) {
      bk.setBelegTyp(BelegTyp.GUTSCHRIFT);
    } else {
      bk.setBelegTyp(BelegTyp.RECHNUNG);
    }
    if (rech.getBezahlt()) {
      bk.setStatus("BEZAHLT");
    }
    // Adresse
    AddressKopfDTO adr = new AddressKopfDTO();
    adr.setId(rech.get_009_001_Adressen_DID_RG());
    adr.setVollerName(AddressMapper.buildName(
            rech.getM_009_014_Adressen_Nachname(),
            rech.getM_009_011_Adressen_Firmenname()));
    bk.setAdresse(adr);
    // Preise
    bk.setPreis(mapGesamtPreis(rech.getBetrag_Brutto(),
            rech.getBetrag_Netto(), rech.getBetrag_MwSt()));
    // WRG
    WrgDTO wrg = new WrgDTO();
    // non Euro Währung
    if (!WrgDTO.EURO_BEZEICHNUNG.equals(rech
            .getM_005_011__018_WährZeichen())) {
      wrg.setBezeichnung(rech.getM_005_011__018_WährZeichen());
      wrg.setKursInEuro(null);
      wrg.setZeichen(rech.getM_005_011__018_WährZeichen());
    }
    bk.setWrg(wrg);
    // Projekt
    ProjektKopfDTO projekt = new ProjektKopfDTO();
    projekt.setName(rech.getM_022_031_VorgangNr());
    projekt.setId(rech.get_022_001_Vorgang_DID());
    bk.setProjekt(projekt);

  }

  /**
   * mappt die Kopfdaten für einen Auftrag
   *
   * @param bk BelegKopfDTO Zielobjekt
   * @param rech Auftraege
   */
  private static void mapKopfDaten(BelegKopfDTO bk, Auftraege auftrag) {

    bk.setNummer(auftrag.getLfd_Nr());
    bk.setDatum(auftrag.getEingangsdatum());
    bk.setId(auftrag.getDID());
    bk.setMandant(auftrag.getDMandant());
    bk.setBetreff(auftrag.getBetreff());
    if (auftrag.getAng_AuftragTyp()) {
      bk.setBelegTyp(BelegTyp.AUFTRAG);
    } else {
      bk.setBelegTyp(BelegTyp.ANGEBOT);
    }
    if (auftrag.getAbgeschlossen()) {
      bk.setStatus("ABGESCHLOSSEN");
    }
    // Adresse
    AddressKopfDTO adr = new AddressKopfDTO();
    adr.setId(auftrag.get_009_001_Adressen_DID_AB());
    adr.setVollerName(AddressMapper.buildName(
            auftrag.getM_009_014_Adressen_Nachname(),
            auftrag.getM_009_011_Adressen_Firmenname()));
    bk.setAdresse(adr);

    // Preise
    bk.setPreis(mapGesamtPreis(auftrag.getBetrag_Brutto(),
            auftrag.getBetrag_Netto(), auftrag.getBetrag_MwSt()));
    // WRG
    WrgDTO wrg = new WrgDTO();
    // non Euro Währung
    if (!WrgDTO.EURO_BEZEICHNUNG.equals(auftrag
            .getM_005_011__022_WährZeichen())) {
      wrg.setBezeichnung(auftrag.getM_005_011__022_WährZeichen());
      wrg.setKursInEuro(null);
      wrg.setZeichen(auftrag.getM_005_011__022_WährZeichen());
    }
    bk.setWrg(wrg);
    // Projekt
    ProjektKopfDTO projekt = new ProjektKopfDTO();
    projekt.setName(auftrag.getM_022_031_VorgangNr());
    projekt.setId(auftrag.get_022_001_Vorgang_DID());
    bk.setProjekt(projekt);

  }

  /**
   * mappt die Kopfdaten für einen Lieferschein
   *
   * @param bk BelegKopfDTO Zielobjekt
   * @param lieferschein Lieferscheine
   */
  private static void mapKopfDaten(BelegKopfDTO bk, Lieferscheine lieferschein) {

    bk.setNummer(lieferschein.getLfdNr());
    bk.setDatum(lieferschein.getDatum());
    bk.setId(lieferschein.getDID());
    bk.setMandant(lieferschein.getDMandant());
    bk.setBetreff(lieferschein.getBetreff());

    bk.setBelegTyp(BelegTyp.LIEFERSCHEIN);

    if (lieferschein.getAbgerechnet()) {
      bk.setStatus("ABGERECHNET");
    }
    // Adresse
    AddressKopfDTO adr = new AddressKopfDTO();
    adr.setId(lieferschein.get_009_001_Adressen_DID());
    adr.setVollerName(AddressMapper.buildName(
            lieferschein.getM_009_014_Adressen_Nachname(),
            lieferschein.getM_009_011_Adressen_Firmenname()));
    bk.setAdresse(adr);

    // Preise
    bk.setPreis(mapGesamtPreis(lieferschein.getBetrag_Brutto(),
            lieferschein.getBetrag_Netto(), lieferschein.getBetrag_Mwst()));
    // WRG
    WrgDTO wrg = new WrgDTO();
    // non Euro Währung
    if (!WrgDTO.EURO_BEZEICHNUNG.equals(lieferschein
            .getM_005_011_WährZeichen())) {
      wrg.setBezeichnung(lieferschein.getM_005_011_WährZeichen());
      wrg.setKursInEuro(null);
      wrg.setZeichen(lieferschein.getM_005_011_WährZeichen());
    }
    bk.setWrg(wrg);
    // Projekt
    ProjektKopfDTO projekt = new ProjektKopfDTO();
    projekt.setName(lieferschein.getM_022_031_VorgangNr());
    projekt.setId(lieferschein.get_022_001_Vorgang_DID());
    bk.setProjekt(projekt);

  }

  /**
   * mappt die Kopfdaten für eine Bestellung
   *
   * @param bk BelegKopfDTO Zielobjekt
   * @param best Bestellungen
   */
  private static void mapKopfDaten(BelegKopfDTO bk, Bestellungen best) {

    bk.setNummer(best.getBestellnummer());
    bk.setDatum(best.getBestelldatum());
    bk.setId(best.getDID());
    bk.setMandant(best.getDMandant());
    bk.setBetreff(best.getBetreff());

    bk.setBelegTyp(BelegTyp.BESTELLUNG);

    if (best.getAbgeschlossen()) {
      bk.setStatus("ABGESCHLOSSEN");
    }
    // Adresse
    AddressKopfDTO adr = new AddressKopfDTO();
    adr.setId(best.get_009_001_Adressen_DID_Best());
    adr.setVollerName(
            best.getM_060_025_LieferantenName());
    bk.setAdresse(adr);

    // Preise
    bk.setPreis(mapGesamtPreis(best.getBetrag_Brutto(),
            best.getBetrag_Netto(), best.getBetrag_MwSt()));
    // WRG
    WrgDTO wrg = new WrgDTO();
    // non Euro Währung
    if (!WrgDTO.EURO_BEZEICHNUNG.equals(best
            .getM_005_011__018_WährZeichen())) {
      wrg.setBezeichnung(best
              .getM_005_011__018_WährZeichen());
      wrg.setKursInEuro(new BigDecimal(best.getKurs()));
      wrg.setZeichen(best
              .getM_005_011__018_WährZeichen());
    }
    bk.setWrg(wrg);
    // Projekt
    ProjektKopfDTO projekt = new ProjektKopfDTO();
    projekt.setName(best.getM_022_031_VorgangNr());
    projekt.setId(best.get_022_001_Vorgänge_DID());
    bk.setProjekt(projekt);


  }

  /**
   * mappt Gesamtpreis mit Rundung auf Cent
   *
   * @param brutto
   * @param netto
   * @param steuer
   * @return PreisDTO
   */
  private static PreisDTO mapGesamtPreis(double brutto, double netto,
          double steuer) {

    PreisDTO preis = new PreisDTO();
    preis.setBruttoPreis(NumberMapper.convertWithRoundingToCent(brutto));
    preis.setNettoPreis(NumberMapper.convertWithRoundingToCent(netto));
    preis.setSteuerBetrag(NumberMapper.convertWithRoundingToCent(steuer));
    return preis;

  }

  /**
   * mappt Gesamtpreis mit Rundung auf Pos rechengenauigkeit und Erzeugen der Steuerliste
   *
   * @param brutto
   * @param netto
   * @param steuer
   * @param steuerSatz
   * @param steuerId
   * @return PreisDTO
   */
  private static PreisDTO mapPosPreis(double netto, double brutto,
          double steuer, double steuerSatz, int steuerId) {

    PreisDTO preis = new PreisDTO();
    preis.setBruttoPreis(NumberMapper.convertPosPreis(brutto));
    preis.setNettoPreis(NumberMapper.convertPosPreis(netto));
    preis.setSteuerBetrag(NumberMapper.convertPosPreis(steuer));
    SteuerDTO st = new SteuerDTO();
    st.setBetrag(preis.getSteuerBetrag());
    SteuerArtDTO sa = new SteuerArtDTO();
    sa.setId(steuerId);
    sa.setSteuersatz(NumberMapper.convertWithRoundingToCent(steuerSatz));
    st.setSteuerArt(sa);
    List<SteuerDTO> sl = new ArrayList<SteuerDTO>();
    sl.add(st);
    preis.setSteuern(sl);
    return preis;

  }

  private static ProduktKopfDTO mapProdukt(Integer id, String produktCode) {
    ProduktKopfDTO prod = new ProduktKopfDTO();
    prod.setId(id);
    prod.setProduktCode(produktCode);
    return prod;

  }
}
