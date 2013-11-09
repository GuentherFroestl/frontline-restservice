/**
 *
 */
package de.gammadata.business.modelle;

import de.gammadata.basics.modelle.PersistenceDO;
import de.gammadata.basics.modelle.VarObjectDO;
import de.gammadata.business.modelle.SteuerDO.SteuerFall;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author gfr
 *
 */
public class BelegPositionDO extends PersistenceDO {

  public static final boolean vomBrutto = true;
  public static final boolean vomNetto = false;
  private BelegDO beleg;
  private String beschreibung;
  private String bezeichnung;
  private BigDecimal menge = new BigDecimal("1");
  private BigDecimal einzelNettoBetrag;
  private BigDecimal gesamtNettoBetrag;
  private BigDecimal einzelBruttoBetrag;
  private BigDecimal gesamtBruttoBetrag;
  private BelegPositionDO parent;
  private int posNummer;
  private ProduktDO produkt;
  private VarObjectDO specObject;
  private List<BelegPositionDO> unterPositionsListe;
  private List<BelegVerbindungDO> belegVerbindungsListe;
  private List<BelegVerbindungDO> reverseBelegVerbindungsListe;
  private SteuerDO steuer;
  private Date llDatum;
  private boolean isLoaded = false;

  public Date getLlDatum() {
    return llDatum;
  }

  public void setLlDatum(Date lLDatum) {
    this.llDatum = lLDatum;
  }

  public BelegPositionDO() {
    super();
  }

  public BelegPositionDO(BelegDO beleg) {
    super();
    setBeleg(beleg);
  }

  public BelegDO getBeleg() {
    return this.beleg;
  }

  public String getBeschreibung() {
    return this.beschreibung;
  }

  public String getBezeichnung() {
    return this.bezeichnung;
  }

  public BigDecimal getMenge() {
    return this.menge;
  }

  public BelegPositionDO getParent() {
    return this.parent;
  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#getPosNummer()
   */
  public int getPosNummer() {
    return this.posNummer;
  }

  public ProduktDO getProdukt() {
    return this.produkt;
  }

  public VarObjectDO getSpecObject() {
    return this.specObject;
  }

  public List<BelegPositionDO> getUnterPositionsListe() {
    return this.unterPositionsListe;
  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setBeleg(de.gammadata.business.modelle.Beleg)
   */
  public void setBeleg(BelegDO beleg) {
    this.beleg = beleg;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setBeschreibung(java.lang.String)
   */
  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setBezeichnung(java.lang.String)
   */
  public void setBezeichnung(String bez) {
    this.bezeichnung = bez;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setMenge(java.math.BigDecimal)
   */
  void setMenge(BigDecimal menge) {
    this.menge = menge.setScale(GeldDO.exactscale, GeldDO.roundingMode);
//		calculateAndSetTotals(getBeleg().isBruttoBeleg());
//		getBeleg().setPosChanges(true);
  }


  public void setMenge(BigDecimal menge, boolean recalculate) {
    this.menge = menge.setScale(GeldDO.exactscale, GeldDO.roundingMode);
    if (recalculate) {
      calculateAndSetTotals(getBeleg().isBruttoBeleg());
      getBeleg().setPosChanges(true);
    }
  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setParent(de.gammadata.business.modelle.BelegPosition)
   */
  public void setParent(BelegPositionDO oberposition) {
    this.parent = oberposition;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setPosNummer(int)
   */
  public void setPosNummer(int posNummer) {
    this.posNummer = posNummer;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setProdukt(de.gammadata.business.modelle.ProduktDO)
   */
  void setProdukt(ProduktDO produkt) {

    this.produkt = produkt;
  }

  /**
   * setzt das Produkt und abhängige Größen wie Steuer und Preise
   */
  public void setProdukt(ProduktDO produkt, BigDecimal menge) {
    this.menge = menge.setScale(GeldDO.exactscale, GeldDO.roundingMode);

    this.produkt = produkt;

    this.bezeichnung = produkt.getBezeichnung();
    this.beschreibung = produkt.getBeschreibung();
    setSteuer(produkt.getSteuer());

    if (getBeleg().isBruttoBeleg()) {
      try {
        this.setEinzelBruttoPreis(produkt.getBruttoPreis());
      } catch (Exception e) {
      }
    } else {
      this.setEinzelNettoPreis(produkt.getNettoPreis());
    }
    getBeleg().setPosChanges(true);

  }

  public SteuerDO getSteuer() {
    return this.steuer;
  }

  public void setSteuer(SteuerDO steuer) {
    this.steuer = steuer;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setSpecObject(de.gammadata.basics.modelle.VarObjectDO)
   */
  public void setSpecObject(VarObjectDO specObject) {
    this.specObject = specObject;

  }

  /**
   * @see de.gammadata.business.modelle.BelegPosition#setUnterPositionsListe(java.util.List)
   */
  public void setUnterPositionsListe(List<BelegPositionDO> unterPositionsListe) {
    this.unterPositionsListe = unterPositionsListe;

  }

  public List<BelegVerbindungDO> getBelegVerbindungen() {
    return this.belegVerbindungsListe;
  }

  public void setBelegVerbindungen(List<BelegVerbindungDO> belegposliste) {
    this.belegVerbindungsListe = belegposliste;
  }

  public List<BelegVerbindungDO> getReverseBelegVerbindungen() {
    return this.reverseBelegVerbindungsListe;
  }

  public void setReverseBelegVerbindungen(List<BelegVerbindungDO> belegposliste) {
    this.reverseBelegVerbindungsListe = belegposliste;
  }

  /*
   * Felder zum Abspeichern der Beträge
   * 
   */
  BigDecimal getEinzelNettoBetrag() {
    return einzelNettoBetrag;
  }

  void setEinzelNettoBetrag(BigDecimal einzelNettoBetrag) {
    this.einzelNettoBetrag = einzelNettoBetrag;
  }

  BigDecimal getGesamtNettoBetrag() {
    return gesamtNettoBetrag;
  }

  void setGesamtNettoBetrag(BigDecimal gesamtNettoBetrag) {
    this.gesamtNettoBetrag = gesamtNettoBetrag;
  }

  BigDecimal getEinzelBruttoBetrag() {
    return einzelBruttoBetrag;
  }

  void setEinzelBruttoBetrag(BigDecimal einzelBruttoBetrag) {
    this.einzelBruttoBetrag = einzelBruttoBetrag;
  }

  BigDecimal getGesamtBruttoBetrag() {
    return gesamtBruttoBetrag;
  }

  void setGesamtBruttoBetrag(BigDecimal gesamtBruttoBetrag) {
    this.gesamtBruttoBetrag = gesamtBruttoBetrag;
  }

  /*
   * Transiente Methoden, die auf die gespeicherten Beträge zurückgreifen
   */
  public GeldDO getEinzelBruttoPreis() {
    return new GeldDO(this.getEinzelBruttoBetrag(), getBeleg().getWrg());
  }

  public GeldDO getEinzelNettoPreis() {
    return new GeldDO(this.getEinzelNettoBetrag(), getBeleg().getWrg());
  }

  public GeldDO getGesamtBruttoPreis() {
    return new GeldDO(this.getGesamtBruttoBetrag(), getBeleg().getWrg());
  }

  public String getTotalString() {
    {
      if (getGesamtBruttoBetrag() != null) {
        if (getBeleg() != null && getBeleg().getWrg() != null) {
          return getGesamtBruttoBetrag().toString() + getBeleg().getWrg().getWrgSymbol();
        } else {
          return getGesamtBruttoBetrag().toString();
        }
      } else {
        return "0";
      }
    }
  }

  public GeldDO getGesamtNettoPreis() {
    return new GeldDO(this.getGesamtNettoBetrag(), getBeleg().getWrg());
  }

  /*
   * Methoden zum Berechnen der Preise
   */
  public void setEinzelBruttoPreis(GeldDO einzelBruttoPreis) {

    if (!getBeleg().isBruttoBeleg()) {
      if (getBeleg().getSteuerFall().compareTo(SteuerFall.INLAND) == 0) { //Sollte eigentlich nicht vorkommen
      } else {
      }
    }
    this.einzelBruttoBetrag = einzelBruttoPreis.getBetrag(getBeleg().getWrg());
    calculateAndSetTotals(vomBrutto);
    calculateAndSetNettoEinzelPreis();
    getBeleg().setPosChanges(true);

  }

  /**
   * Setzt auch die abhängige Preiscascade, Einzel und Nettopreise
   *
   * @param gesamtPreis Geld
   */
  public void setGesamtBruttoPreis(GeldDO gesamtPreis){

    if (!getBeleg().isBruttoBeleg()) {
      if (getBeleg().getSteuerFall().compareTo(SteuerFall.INLAND) == 0) { //Sollte eigentlich nicht vorkommen

        gesamtBruttoBetrag = gesamtPreis.getBetrag(getBeleg().getWrg()).setScale(GeldDO.roundscale, GeldDO.roundingMode);
      } else {

      }
    } else {
      gesamtBruttoBetrag = gesamtPreis.getBetrag(getBeleg().getWrg());
    }

    calculateAndSetBruttoEinzelPreis();
    gesamtNettoBetrag = gesamtBruttoBetrag.subtract(calculateSteuerVomBrutto(gesamtBruttoBetrag));
    calculateAndSetNettoEinzelPreis();
    getBeleg().setPosChanges(true);

  }

  public void setEinzelNettoPreis(GeldDO einzelPreis) {
    if (getBeleg().isBruttoBeleg()) {
    }
    einzelNettoBetrag = einzelPreis.getBetrag(getBeleg().getWrg());
    calculateAndSetTotals(vomNetto);
    if (getBeleg().isBruttoBeleg()) {
      gesamtBruttoBetrag = gesamtBruttoBetrag.setScale(GeldDO.roundscale, GeldDO.roundingMode);
    }
    calculateAndSetBruttoEinzelPreis();
    getBeleg().setPosChanges(true);
  }

  public void setGesamtNettoPreis(GeldDO gesamtPreis) {
    if (getBeleg().isBruttoBeleg()) {
    }
    gesamtNettoBetrag = gesamtPreis.getBetrag(getBeleg().getWrg());
    calculateAndSetNettoEinzelPreis();
    gesamtBruttoBetrag = gesamtNettoBetrag.add(calculateSteuerVomNetto(gesamtNettoBetrag));
    if (getBeleg().isBruttoBeleg()) {
      gesamtBruttoBetrag = gesamtBruttoBetrag.setScale(GeldDO.roundscale, GeldDO.roundingMode);
    }
    calculateAndSetBruttoEinzelPreis();
    getBeleg().setPosChanges(true);

  }


  public void calculateAndSetTotals(boolean bruttoPreise) {
    if (bruttoPreise) {
      gesamtBruttoBetrag = einzelBruttoBetrag.multiply(menge).setScale(GeldDO.roundscale, GeldDO.roundingMode);
      gesamtNettoBetrag = gesamtBruttoBetrag.subtract(calculateSteuerVomBrutto(gesamtBruttoBetrag));
    } else {
      gesamtNettoBetrag = einzelNettoBetrag.multiply(menge).setScale(GeldDO.roundscale, GeldDO.roundingMode);
      gesamtBruttoBetrag = gesamtNettoBetrag.add(calculateSteuerVomNetto(gesamtNettoBetrag));
    }
  }


  private void calculateAndSetNettoEinzelPreis() {
    einzelNettoBetrag = gesamtNettoBetrag.divide(menge, GeldDO.exactscale, GeldDO.roundingMode);
  }


  private void calculateAndSetBruttoEinzelPreis() {
    einzelBruttoBetrag = gesamtBruttoBetrag.divide(menge, GeldDO.exactscale, GeldDO.roundingMode);
  }


  private BigDecimal calculateSteuerVomNetto(BigDecimal betrag) {
    BigDecimal steuer;
    if (getSteuer() != null) {
      steuer = getSteuer().calculateSteuerBetragVomNetto(getBeleg().getSteuerFall(), betrag, getBeleg().getDatum());
    } else {
      steuer = new BigDecimal("0");
    }

    return steuer;
  }


  private BigDecimal calculateSteuerVomBrutto(BigDecimal betrag) {
    BigDecimal steuer;
    if (getSteuer() != null) {
      steuer = getSteuer().calculateSteuerBetragVomBrutto(getBeleg().getSteuerFall(), betrag, getBeleg().getDatum());
    } else {
      steuer = new BigDecimal("0");
    }

    return steuer;
  }



  @Override
  public String genMatchString() {
    if (getProdukt() != null) {
      return getProdukt().getArtikelCode()
              + bezeichnung + MATCH_TRENNZEICHEN
              + beschreibung;
    } else {
      return bezeichnung + MATCH_TRENNZEICHEN
              + beschreibung + MATCH_TRENNZEICHEN;
    }
  }
}
