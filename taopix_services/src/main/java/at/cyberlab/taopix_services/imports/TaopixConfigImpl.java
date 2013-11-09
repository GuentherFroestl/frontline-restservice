package at.cyberlab.taopix_services.imports;

import java.math.BigDecimal;

import com.tomagency.cyberlab.server.config.FtpServerConfig;

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
	private String barzahlungsBezeichnung= "COD";
	private String taopixExpressVersandBezeichnung = "EXPRESS";
	private String taopixVersandBezeichnung = "STANDARDPOST";

	private String taopixPayPalzahlungsBezeichnung = "PAYPAL";
	private String versandKatalogName = "Versand";
	private ProduktDO versandArtikel;
	private ProduktDO versandArtikelReduzierteSteuer;
	
	private long scanIntervall;
	private FtpServerConfig taopixFtpServerConfig;

	private int startAuftragsNummer;
	

	public TaopixConfigImpl(){
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
		this.taopixKatalogName=name;

	}

	public String getReduzierteSteuerBezeichnung() {
		return reduzierteSteuerBezeichnung;
	}

	public String getStandardSteuerBezeichnung() {
		return standardSteuerBezeichnung;
	}

	public void setReduzierteSteuerBezeichnung(String bezeichnung) {
		this.reduzierteSteuerBezeichnung=bezeichnung;
		
	}

	public void setStandardSteuerBezeichnung(String bezeichnung) {
		this.standardSteuerBezeichnung=bezeichnung;
		
	}

	public BigDecimal getReduzierteSteuerBetrag() {
		return reduzierteSteuerBetrag;
	}

	public BigDecimal getStandardSteuerBetrag() {
		return standardSteuerBetrag;
	}

	public void setReduzierteBetrag(BigDecimal betrag) {
		this.reduzierteSteuerBetrag=betrag;
		
	}

	public void setStandardSteuerBetrag(BigDecimal betrag) {
		this.standardSteuerBetrag=betrag;
		
	}
	public LandDO getStandardLand(){
		if (land==null){
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
		this.land=land;
		
	}

	public VersandArtDO getArtAbholung() {
		if (this.artAbholung==null){
			artAbholung= new AbholungDO();
			artAbholung.setBezeichnung("abholung");
			artAbholung.setBeschreibung("Abholung");
		}

		return this.artAbholung;
	}

	public VersandArtDO getArtVersand() {
		if (this.artVersand==null){
			this.artVersand= new VersandDO();
			this.artVersand.setBezeichnung("versand");
			this.artVersand.setBeschreibung("Standardversand mit Paketdienst");
			((VersandDO)this.artVersand).setLieferZeitInTagen(2);
		}
		

		return this.artVersand;
	}
	
	public VersandArtDO getArtExpressVersand() {
		if (this.artExpress==null){
			this.artExpress= new VersandDO();
			this.artExpress.setBezeichnung("express");
			this.artExpress.setBeschreibung("Expressversand mit Paketdienst");
			((VersandDO)this.artExpress).setLieferZeitInTagen(1);
		}
		

		return this.artExpress;
	}

	public ZahlungsBedingungDO getBarzahlung() {
		
		if (this.barzahlung==null){
			BarzahlungDO bar = new BarzahlungDO();
			bar.setBezeichnung("bar");
			bar.setBeschreibung("Barzahlung");				
			this.barzahlung=bar;
		}

		return this.barzahlung;
	}

	public ZahlungsBedingungDO getPayPalzahlung() {
		if (this.payPalzahlung==null){
			PaymentServiceZahlungsArtDO paypal = new PaymentServiceZahlungsArtDO();
			paypal.setBezeichnung("paypal");
			paypal.setBeschreibung("Zahlung über PayPal");
			paypal.setZahlungsZielInTagen(ZahlungsBedingung.standardPaymentServiceZiel);
			this.payPalzahlung=paypal;
		}

		return this.payPalzahlung;
	}
	
	public ZahlungsBedingungDO getNettozahlung() {
		
		if (this.nettozahlung==null){
			NettoZahlungsBedingungDO nettozahlung = new NettoZahlungsBedingungDO();
			nettozahlung.setBezeichnung("netto");
			nettozahlung.setBeschreibung("Zahlung rein netto in "+Integer.toString(ZahlungsBedingung.standardZahlungsZiel)+" Tagen");
			nettozahlung.setZahlungsZielInTagen(ZahlungsBedingung.standardZahlungsZiel);
			this.nettozahlung=nettozahlung;
		}
		return nettozahlung;
	}

	public void setNettozahlung(ZahlungsBedingungDO nettozahlung) {
		this.nettozahlung = nettozahlung;
	}


	public void setArtAbholung(VersandArtDO abholung) {
		this.artAbholung=abholung;
		
	}

	public void setArtVersand(VersandArtDO versand) {
		this.artVersand=versand;
		
	}

	public void setBarzahlung(ZahlungsBedingungDO barzahlung) {
		this.barzahlung=barzahlung;
		
	}

	public void setPayPalzahlung(ZahlungsBedingungDO zahlung) {
		this.payPalzahlung=zahlung;
		
	}

	public String getTaopixAbholungBezeichnung() {
		return this.abholungBezeichnung;
	}

	public String getTaopixBarzahlungsBezeichnung() {
		return barzahlungsBezeichnung;
	}

	public void setTaopixAbholungBezeichnung(String bezeichnung) {
		this.abholungBezeichnung=bezeichnung;
		
	}

	public void setTaopixBarzahlungsBezeichnung(String bezeichnung) {
		this.barzahlungsBezeichnung=bezeichnung;
		
	}



	public String getTaopixExpressVersandBezeichnung() {
		return this.taopixExpressVersandBezeichnung;
	}

	public String getTaopixPayPalzahlungsBezeichnung() {
		return this.taopixPayPalzahlungsBezeichnung;
	}

	public void setArtExpressVersand(VersandArtDO versand) {
		this.artExpress=versand;
		
	}

	public void setTaopixExpressVersandBezeichnung(String bezeichnung) {
		this.taopixExpressVersandBezeichnung=bezeichnung;
		
	}

	public void setTaopixPayPalzahlungsBezeichnung(String bezeichnung) {
		this.taopixPayPalzahlungsBezeichnung=bezeichnung;
		
	}
	public String getTaopixVersandBezeichnung() {
		return taopixVersandBezeichnung;
	}

	public void setTaopixVersandBezeichnung(String taopixVersandBezeichnung) {
		this.taopixVersandBezeichnung = taopixVersandBezeichnung;
	}

	public ProduktDO getVersandArtikel() {
		if (versandArtikel==null){
			versandArtikel= new ProduktDO();
			versandArtikel.setArtikelCode("Versand-Std-Steuer");
			versandArtikel.setBezeichnung("Versand Standard Steuer");
			versandArtikel.setBeschreibung("Versandkosten zum standard Steuersatz");
			versandArtikel.setEinheit(Einheit.STK);
		}
		return versandArtikel;
	}

	public ProduktDO getVersandArtikelReduzierteSteuer() {
		if (versandArtikelReduzierteSteuer==null){
			versandArtikelReduzierteSteuer= new ProduktDO();
			versandArtikelReduzierteSteuer.setArtikelCode("Versand-Reduzierte-Steuer");
			versandArtikelReduzierteSteuer.setBezeichnung("Versand Reduzierte Steuer");
			versandArtikelReduzierteSteuer.setBeschreibung("Versandkosten zum reduzierten Steuersatz");
			versandArtikelReduzierteSteuer.setEinheit(Einheit.STK);
		}
		return versandArtikelReduzierteSteuer;
	}

	public void setVersandArtikel(ProduktDO artikel) {
		this.versandArtikel=artikel;
		
	}

	public void setVersandArtikelReduzierteSteuer(ProduktDO artikel) {
		this.versandArtikelReduzierteSteuer=artikel;
		
	}

	public String getVersandKatalogName() {
		return versandKatalogName;
	}

	public void setVersandKatalogName(String name) {
		this.versandKatalogName=name;
		
	}

	public long getScanIntervall() {
		return scanIntervall;
	}

	public FtpServerConfig getFtpServerConfig() {
		return taopixFtpServerConfig;
	}

	public void setScanIntervall(long scanIntervall) {
		this.scanIntervall=scanIntervall;
		
	}

	public void setFtpServerConfig(FtpServerConfig ftpConfig) {
		this.taopixFtpServerConfig=ftpConfig;
		
	}


	@Override
	public int getStartAuftragsNummer() {
		return startAuftragsNummer;
	}


	@Override
	public void setStartAuftragsNummer(int nummer) {
		this.startAuftragsNummer=nummer;
		
	}
}
