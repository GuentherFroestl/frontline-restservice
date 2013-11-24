package at.cyberlab.taopix_services.config;

import java.math.BigDecimal;

import de.gammadata.basics.modelle.LandDO;
import de.gammadata.business.modelle.AbholungDO;
import de.gammadata.business.modelle.BarzahlungDO;
import de.gammadata.business.modelle.NettoZahlungsBedingungDO;
import de.gammadata.business.modelle.PaymentServiceZahlungsArtDO;
import de.gammadata.business.modelle.ProduktDO;
import de.gammadata.business.modelle.ProduktDO.Einheit;
import de.gammadata.business.modelle.VersandArtDO;
import de.gammadata.business.modelle.VersandDO;
import de.gammadata.business.modelle.ZahlungsBedingung;
import de.gammadata.business.modelle.ZahlungsBedingungDO;

/**
 * @author gfr
 *
 */
public class TaopixConfigImpl implements TaopixConfig {

  private String taopixKatalogName = "Taopix Fotobücher";
  private String standardSteuerBezeichnung = "Standard";
  private BigDecimal standardSteuerBetrag = new BigDecimal("20.00");
  private String reduzierteSteuerBezeichnung = "Reduziert";
  private BigDecimal reduzierteSteuerBetrag = new BigDecimal("10.00");
  private LandDO land;
  private VersandArtDO artAbholung;
  private VersandArtDO artVersand;
  private VersandArtDO artExpress;
  private ZahlungsBedingungDO barzahlung;
  private ZahlungsBedingungDO payPalzahlung;
  private ZahlungsBedingungDO nettozahlung;
  private String abholungBezeichnung = "COLLECTION";
  private String barzahlungsBezeichnung = "COD";
  private String taopixExpressVersandBezeichnung = "EXPRESS";
  private String taopixVersandBezeichnung = "STANDARDPOST";
  private String taopixPayPalzahlungsBezeichnung = "PAYPAL";
  private String versandKatalogName = "Versand";
  private ProduktDO versandArtikel;
  private ProduktDO versandArtikelReduzierteSteuer;
  private long scanIntervall;
  private FtpServerConfig taopixFtpServerConfig;
  private int startAuftragsNummer;

  public TaopixConfigImpl() {
  }

  /**
   * @see com.tomagency.cyberlab.server.imports.TaopixConfig#getTaopixKatalogName()
   */
  public String getTaopixKatalogName() {
    return taopixKatalogName;
  }

  /**
   * @see com.tomagency.cyberlab.server.imports.TaopixConfig#setTaopixKatalogName(java.lang.String)
   */
  public void setTaopixKatalogName(String name) {
    this.taopixKatalogName = name;

  }

  public String getReduzierteSteuerBezeichnung() {
    return reduzierteSteuerBezeichnung;
  }

  public String getStandardSteuerBezeichnung() {
    return standardSteuerBezeichnung;
  }

  public void setReduzierteSteuerBezeichnung(String bezeichnung) {
    this.reduzierteSteuerBezeichnung = bezeichnung;

  }

  public void setStandardSteuerBezeichnung(String bezeichnung) {
    this.standardSteuerBezeichnung = bezeichnung;

  }

  public BigDecimal getReduzierteSteuerBetrag() {
    return reduzierteSteuerBetrag;
  }

  public BigDecimal getStandardSteuerBetrag() {
    return standardSteuerBetrag;
  }

  public void setReduzierteBetrag(BigDecimal betrag) {
    this.reduzierteSteuerBetrag = betrag;

  }

  public void setStandardSteuerBetrag(BigDecimal betrag) {
    this.standardSteuerBetrag = betrag;

  }

  public LandDO getStandardLand() {
    if (land == null) {
      land = new LandDO();
      land.setName("AUSTRIA");
      land.setEigenNamen("Österreich");
      land.setIso3166_2_Code("AT");
      land.setIso3166_3_Code("AUT");
      land.setNummernCode(40);
    }

    return land;
  }

  public void setStandardLand(LandDO land) {
    this.land = land;

  }

  public VersandArtDO getArtAbholung() {
    if (this.artAbholung == null) {
      artAbholung = new AbholungDO();
      artAbholung.setBezeichnung("abholung");
      artAbholung.setBeschreibung("Abholung");
    }

    return this.artAbholung;
  }

  public VersandArtDO getArtVersand() {
    if (this.artVersand == null) {
      this.artVersand = new VersandDO();
      this.artVersand.setBezeichnung("versand");
      this.artVersand.setBeschreibung("Standardversand mit Paketdienst");
      ((VersandDO) this.artVersand).setLieferZeitInTagen(2);
    }


    return this.artVersand;
  }

  public VersandArtDO getArtExpressVersand() {
    if (this.artExpress == null) {
      this.artExpress = new VersandDO();
      this.artExpress.setBezeichnung("express");
      this.artExpress.setBeschreibung("Expressversand mit Paketdienst");
      ((VersandDO) this.artExpress).setLieferZeitInTagen(1);
    }


    return this.artExpress;
  }

  public ZahlungsBedingungDO getBarzahlung() {

    if (this.barzahlung == null) {
      BarzahlungDO bar = new BarzahlungDO();
      bar.setBezeichnung("bar");
      bar.setBeschreibung("Barzahlung");
      this.barzahlung = bar;
    }

    return this.barzahlung;
  }

  public ZahlungsBedingungDO getPayPalzahlung() {
    if (this.payPalzahlung == null) {
      PaymentServiceZahlungsArtDO paypal = new PaymentServiceZahlungsArtDO();
      paypal.setBezeichnung("paypal");
      paypal.setBeschreibung("Zahlung über PayPal");
      paypal.setZahlungsZielInTagen(ZahlungsBedingung.standardPaymentServiceZiel);
      this.payPalzahlung = paypal;
    }

    return this.payPalzahlung;
  }

  public ZahlungsBedingungDO getNettozahlung() {

    if (this.nettozahlung == null) {
      NettoZahlungsBedingungDO nettozahlung = new NettoZahlungsBedingungDO();
      nettozahlung.setBezeichnung("netto");
      nettozahlung.setBeschreibung("Zahlung rein netto in " + Integer.toString(ZahlungsBedingung.standardZahlungsZiel) + " Tagen");
      nettozahlung.setZahlungsZielInTagen(ZahlungsBedingung.standardZahlungsZiel);
      this.nettozahlung = nettozahlung;
    }
    return nettozahlung;
  }

  public void setNettozahlung(ZahlungsBedingungDO nettozahlung) {
    this.nettozahlung = nettozahlung;
  }

  public void setArtAbholung(VersandArtDO abholung) {
    this.artAbholung = abholung;

  }

  public void setArtVersand(VersandArtDO versand) {
    this.artVersand = versand;

  }

  public void setBarzahlung(ZahlungsBedingungDO barzahlung) {
    this.barzahlung = barzahlung;

  }

  public void setPayPalzahlung(ZahlungsBedingungDO zahlung) {
    this.payPalzahlung = zahlung;

  }

  public String getTaopixAbholungBezeichnung() {
    return this.abholungBezeichnung;
  }

  public String getTaopixBarzahlungsBezeichnung() {
    return barzahlungsBezeichnung;
  }

  public void setTaopixAbholungBezeichnung(String bezeichnung) {
    this.abholungBezeichnung = bezeichnung;

  }

  public void setTaopixBarzahlungsBezeichnung(String bezeichnung) {
    this.barzahlungsBezeichnung = bezeichnung;

  }

  public String getTaopixExpressVersandBezeichnung() {
    return this.taopixExpressVersandBezeichnung;
  }

  public String getTaopixPayPalzahlungsBezeichnung() {
    return this.taopixPayPalzahlungsBezeichnung;
  }

  public void setArtExpressVersand(VersandArtDO versand) {
    this.artExpress = versand;

  }

  public void setTaopixExpressVersandBezeichnung(String bezeichnung) {
    this.taopixExpressVersandBezeichnung = bezeichnung;

  }

  public void setTaopixPayPalzahlungsBezeichnung(String bezeichnung) {
    this.taopixPayPalzahlungsBezeichnung = bezeichnung;

  }

  public String getTaopixVersandBezeichnung() {
    return taopixVersandBezeichnung;
  }

  public void setTaopixVersandBezeichnung(String taopixVersandBezeichnung) {
    this.taopixVersandBezeichnung = taopixVersandBezeichnung;
  }

  public ProduktDO getVersandArtikel() {
    if (versandArtikel == null) {
      versandArtikel = new ProduktDO();
      versandArtikel.setArtikelCode("Versand-Std-Steuer");
      versandArtikel.setBezeichnung("Versand Standard Steuer");
      versandArtikel.setBeschreibung("Versandkosten zum standard Steuersatz");
      versandArtikel.setEinheit(Einheit.STK);
    }
    return versandArtikel;
  }

  public ProduktDO getVersandArtikelReduzierteSteuer() {
    if (versandArtikelReduzierteSteuer == null) {
      versandArtikelReduzierteSteuer = new ProduktDO();
      versandArtikelReduzierteSteuer.setArtikelCode("Versand-Reduzierte-Steuer");
      versandArtikelReduzierteSteuer.setBezeichnung("Versand Reduzierte Steuer");
      versandArtikelReduzierteSteuer.setBeschreibung("Versandkosten zum reduzierten Steuersatz");
      versandArtikelReduzierteSteuer.setEinheit(Einheit.STK);
    }
    return versandArtikelReduzierteSteuer;
  }

  public void setVersandArtikel(ProduktDO artikel) {
    this.versandArtikel = artikel;

  }

  public void setVersandArtikelReduzierteSteuer(ProduktDO artikel) {
    this.versandArtikelReduzierteSteuer = artikel;

  }

  public String getVersandKatalogName() {
    return versandKatalogName;
  }

  public void setVersandKatalogName(String name) {
    this.versandKatalogName = name;

  }

  public long getScanIntervall() {
    return scanIntervall;
  }

  public FtpServerConfig getFtpServerConfig() {
    return taopixFtpServerConfig;
  }

  public void setScanIntervall(long scanIntervall) {
    this.scanIntervall = scanIntervall;

  }

  public void setFtpServerConfig(FtpServerConfig ftpConfig) {
    this.taopixFtpServerConfig = ftpConfig;

  }

  @Override
  public int getStartAuftragsNummer() {
    return startAuftragsNummer;
  }

  @Override
  public void setStartAuftragsNummer(int nummer) {
    this.startAuftragsNummer = nummer;

  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + (this.standardSteuerBezeichnung != null ? this.standardSteuerBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.standardSteuerBetrag != null ? this.standardSteuerBetrag.hashCode() : 0);
    hash = 97 * hash + (this.reduzierteSteuerBezeichnung != null ? this.reduzierteSteuerBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.reduzierteSteuerBetrag != null ? this.reduzierteSteuerBetrag.hashCode() : 0);
    hash = 97 * hash + (this.land != null ? this.land.hashCode() : 0);
    hash = 97 * hash + (this.artAbholung != null ? this.artAbholung.hashCode() : 0);
    hash = 97 * hash + (this.artVersand != null ? this.artVersand.hashCode() : 0);
    hash = 97 * hash + (this.artExpress != null ? this.artExpress.hashCode() : 0);
    hash = 97 * hash + (this.barzahlung != null ? this.barzahlung.hashCode() : 0);
    hash = 97 * hash + (this.payPalzahlung != null ? this.payPalzahlung.hashCode() : 0);
    hash = 97 * hash + (this.nettozahlung != null ? this.nettozahlung.hashCode() : 0);
    hash = 97 * hash + (this.abholungBezeichnung != null ? this.abholungBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.barzahlungsBezeichnung != null ? this.barzahlungsBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.taopixExpressVersandBezeichnung != null ? this.taopixExpressVersandBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.taopixVersandBezeichnung != null ? this.taopixVersandBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.taopixPayPalzahlungsBezeichnung != null ? this.taopixPayPalzahlungsBezeichnung.hashCode() : 0);
    hash = 97 * hash + (this.versandKatalogName != null ? this.versandKatalogName.hashCode() : 0);
    hash = 97 * hash + (this.versandArtikel != null ? this.versandArtikel.hashCode() : 0);
    hash = 97 * hash + (this.versandArtikelReduzierteSteuer != null ? this.versandArtikelReduzierteSteuer.hashCode() : 0);
    hash = 97 * hash + (int) (this.scanIntervall ^ (this.scanIntervall >>> 32));
    hash = 97 * hash + (this.taopixFtpServerConfig != null ? this.taopixFtpServerConfig.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final TaopixConfigImpl other = (TaopixConfigImpl) obj;
    if ((this.taopixKatalogName == null) ? (other.taopixKatalogName != null) : !this.taopixKatalogName.equals(other.taopixKatalogName)) {
      return false;
    }
    if ((this.standardSteuerBezeichnung == null) ? (other.standardSteuerBezeichnung != null) : !this.standardSteuerBezeichnung.equals(other.standardSteuerBezeichnung)) {
      return false;
    }
    if (this.standardSteuerBetrag != other.standardSteuerBetrag && (this.standardSteuerBetrag == null || !this.standardSteuerBetrag.equals(other.standardSteuerBetrag))) {
      return false;
    }
    if ((this.reduzierteSteuerBezeichnung == null) ? (other.reduzierteSteuerBezeichnung != null) : !this.reduzierteSteuerBezeichnung.equals(other.reduzierteSteuerBezeichnung)) {
      return false;
    }
    if (this.reduzierteSteuerBetrag != other.reduzierteSteuerBetrag && (this.reduzierteSteuerBetrag == null || !this.reduzierteSteuerBetrag.equals(other.reduzierteSteuerBetrag))) {
      return false;
    }
    if (this.land != other.land && (this.land == null || !this.land.equals(other.land))) {
      return false;
    }
    if (this.artAbholung != other.artAbholung && (this.artAbholung == null || !this.artAbholung.equals(other.artAbholung))) {
      return false;
    }
    if (this.artVersand != other.artVersand && (this.artVersand == null || !this.artVersand.equals(other.artVersand))) {
      return false;
    }
    if (this.artExpress != other.artExpress && (this.artExpress == null || !this.artExpress.equals(other.artExpress))) {
      return false;
    }
    if (this.barzahlung != other.barzahlung && (this.barzahlung == null || !this.barzahlung.equals(other.barzahlung))) {
      return false;
    }
    if (this.payPalzahlung != other.payPalzahlung && (this.payPalzahlung == null || !this.payPalzahlung.equals(other.payPalzahlung))) {
      return false;
    }
    if (this.nettozahlung != other.nettozahlung && (this.nettozahlung == null || !this.nettozahlung.equals(other.nettozahlung))) {
      return false;
    }
    if ((this.abholungBezeichnung == null) ? (other.abholungBezeichnung != null) : !this.abholungBezeichnung.equals(other.abholungBezeichnung)) {
      return false;
    }
    if ((this.barzahlungsBezeichnung == null) ? (other.barzahlungsBezeichnung != null) : !this.barzahlungsBezeichnung.equals(other.barzahlungsBezeichnung)) {
      return false;
    }
    if ((this.taopixExpressVersandBezeichnung == null) ? (other.taopixExpressVersandBezeichnung != null) : !this.taopixExpressVersandBezeichnung.equals(other.taopixExpressVersandBezeichnung)) {
      return false;
    }
    if ((this.taopixVersandBezeichnung == null) ? (other.taopixVersandBezeichnung != null) : !this.taopixVersandBezeichnung.equals(other.taopixVersandBezeichnung)) {
      return false;
    }
    if ((this.taopixPayPalzahlungsBezeichnung == null) ? (other.taopixPayPalzahlungsBezeichnung != null) : !this.taopixPayPalzahlungsBezeichnung.equals(other.taopixPayPalzahlungsBezeichnung)) {
      return false;
    }
    if ((this.versandKatalogName == null) ? (other.versandKatalogName != null) : !this.versandKatalogName.equals(other.versandKatalogName)) {
      return false;
    }
    if (this.versandArtikel != other.versandArtikel && (this.versandArtikel == null || !this.versandArtikel.equals(other.versandArtikel))) {
      return false;
    }
    if (this.versandArtikelReduzierteSteuer != other.versandArtikelReduzierteSteuer && (this.versandArtikelReduzierteSteuer == null || !this.versandArtikelReduzierteSteuer.equals(other.versandArtikelReduzierteSteuer))) {
      return false;
    }
    if (this.scanIntervall != other.scanIntervall) {
      return false;
    }
    if (this.taopixFtpServerConfig != other.taopixFtpServerConfig && (this.taopixFtpServerConfig == null || !this.taopixFtpServerConfig.equals(other.taopixFtpServerConfig))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "TaopixConfigImpl{" + "taopixKatalogName=" + taopixKatalogName + ", standardSteuerBezeichnung=" + standardSteuerBezeichnung + ", standardSteuerBetrag=" + standardSteuerBetrag + ", reduzierteSteuerBezeichnung=" + reduzierteSteuerBezeichnung + ", reduzierteSteuerBetrag=" + reduzierteSteuerBetrag + ", land=" + land + ", artAbholung=" + artAbholung + ", artVersand=" + artVersand + ", artExpress=" + artExpress + ", barzahlung=" + barzahlung + ", payPalzahlung=" + payPalzahlung + ", nettozahlung=" + nettozahlung + ", abholungBezeichnung=" + abholungBezeichnung + ", barzahlungsBezeichnung=" + barzahlungsBezeichnung + ", taopixExpressVersandBezeichnung=" + taopixExpressVersandBezeichnung + ", taopixVersandBezeichnung=" + taopixVersandBezeichnung + ", taopixPayPalzahlungsBezeichnung=" + taopixPayPalzahlungsBezeichnung + ", versandKatalogName=" + versandKatalogName + ", versandArtikel=" + versandArtikel + ", versandArtikelReduzierteSteuer=" + versandArtikelReduzierteSteuer + ", scanIntervall=" + scanIntervall + ", taopixFtpServerConfig=" + taopixFtpServerConfig + ", startAuftragsNummer=" + startAuftragsNummer + '}';
  }

}
