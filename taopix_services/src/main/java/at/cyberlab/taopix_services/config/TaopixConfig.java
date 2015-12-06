/**
 * 
 */
package at.cyberlab.taopix_services.config;

import java.math.BigDecimal;

import de.gammadata.basics.modelle.LandDO;
import de.gammadata.business.modelle.ProduktDO;
import de.gammadata.business.modelle.VersandArtDO;
import de.gammadata.business.modelle.ZahlungsBedingungDO;


/**
 * @author gfr
 *
 */
@Deprecated
public interface TaopixConfig {
	
	public static final String TAOPIX_ORDER = "taopix_order";
	public static final String TAOPIX_USER = "taopix_user";
	
	
	
	public FtpServerConfig getFtpServerConfig();
	public void setFtpServerConfig(FtpServerConfig ftpConfig);
	public long getScanIntervall();
	public void setScanIntervall(long scanIntervall);
	
	public int getStartAuftragsNummer();
	public void setStartAuftragsNummer(int nummer);
	/**
	 * 
	 * @return String Name für den Katalog mit Taopix Produkten
	 */
	public String getTaopixKatalogName();
	public void setTaopixKatalogName(String name);
	
	public String getVersandKatalogName();
	public void setVersandKatalogName(String name);
	
	public String getStandardSteuerBezeichnung();
	public void setStandardSteuerBezeichnung(String bezeichnung);
	public BigDecimal getStandardSteuerBetrag();
	public void setStandardSteuerBetrag(BigDecimal betrag);
	
	public String getReduzierteSteuerBezeichnung();
	public void setReduzierteSteuerBezeichnung(String bezeichnung);
	public BigDecimal getReduzierteSteuerBetrag();
	public void setReduzierteBetrag(BigDecimal betrag);
	
	public LandDO getStandardLand();
	public void setStandardLand(LandDO land);
	
	public VersandArtDO getArtAbholung();
	public void setArtAbholung(VersandArtDO abholung);
	public String getTaopixAbholungBezeichnung();
	public void setTaopixAbholungBezeichnung(String bezeichnung);
	
	public VersandArtDO getArtVersand();
	public void setArtVersand(VersandArtDO versand);
	public String getTaopixVersandBezeichnung();
	public void setTaopixVersandBezeichnung(String taopixVersandBezeichnung);
	
	public VersandArtDO getArtExpressVersand();
	public void setArtExpressVersand(VersandArtDO versand);
	public String getTaopixExpressVersandBezeichnung();
	public void setTaopixExpressVersandBezeichnung(String bezeichnung);
	
	public ProduktDO getVersandArtikel();
	public void setVersandArtikel(ProduktDO artikel);
	
	public ProduktDO getVersandArtikelReduzierteSteuer();
	public void setVersandArtikelReduzierteSteuer(ProduktDO artikel);
	
	public ZahlungsBedingungDO getBarzahlung();
	public void setBarzahlung(ZahlungsBedingungDO barzahlung);
	public String getTaopixBarzahlungsBezeichnung();
	public void setTaopixBarzahlungsBezeichnung(String bezeichnung);
	
	public ZahlungsBedingungDO getPayPalzahlung();
	public void setPayPalzahlung(ZahlungsBedingungDO payPalZahlung);
	public String getTaopixPayPalzahlungsBezeichnung();
	public void setTaopixPayPalzahlungsBezeichnung(String bezeichnung);
	public ZahlungsBedingungDO getNettozahlung();
	public void setNettozahlung(ZahlungsBedingungDO nettozahlung);


}
