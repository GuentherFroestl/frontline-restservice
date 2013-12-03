/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.imports.ImportException;
import at.cyberlab.taopix_services.imports.calculation.BelegCalculator;
import at.cyberlab.taopix_services.imports.calculation.BelegPositionCalculator;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.Einheit;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.dto.SteuerDTO;
import com.tom.service.dto.WrgDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.ProductService;
import de.gammadata.tom.four_d_access.service.SteuerService;
import de.gammadata.tom.four_d_access.service.WrgService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Processes the Product sync Taopix and TOM, will sync or create a new product for the taopix postions.
 *
 * @author gfr
 */
public class ProductSyncProcessor implements ITaopixOrderImportProcessor {

  private static Logger LOG = Logger.getLogger(ProductSyncProcessor.class);
  private TaopixTomImportConfig config;
  private DataBaseSpec dataBaseSpec;
  private ProductService prodService;
  private SteuerService steuerService;
  private WrgService wrgService;
  private SteuerArtDTO standardSteuer;
  private SteuerArtDTO reduzierteSteuer;
  private WrgDTO standardWrg;
  
  private boolean hasSteuern = false;

  /**
   * Constructor with injection.
   *
   * @param config TaopixTomImportConfig
   */
  public ProductSyncProcessor(TaopixTomImportConfig config) {
    this.config = config;
    this.dataBaseSpec = config.getDataBaseSpec();
    prodService = new ProductService(this.dataBaseSpec);
    steuerService = new SteuerService(this.dataBaseSpec);
    wrgService = new WrgService(this.dataBaseSpec);


  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {
    if (processingObject == null || processingObject.getTaopixOrder() == null || processingObject.getTaopixOrder().getPositionsListe() == null) {
      return; //NOP
    }
    for (BelegPositionDTO pos : processingObject.getTaopixOrder().getPositionsListe()) {
      ProduktKopfDTO prod = pos.getProdukt();
      ProduktDTO tProd = null;
      try {
        tProd = prodService.loadByCode(prod);
      } catch (TomException ex) {
        LOG.info("Produkt in TOM nicht gefunden message=" + ex.getMessage() + " " + prod);
      }
      if (tProd == null || tProd.getId() == 0) {
        if (prod.getProduktCode() == null || prod.getProduktCode().length() == 0) {
          throw new ImportException("Produktcode ungültig " + prod.getProduktCode());
        }
        SteuerArtDTO stArt;
        if (prod.getProduktCode().startsWith(config.getProductCodeStubForReducedTax())) {
          stArt = getReduzierteSteuer();

        } else {
          stArt = getStandardSteuer();
        }
        ProduktDTO newProd = new ProduktDTO();
        newProd.setMandant(config.getMandatorId());
        newProd.setProduktCode(prod.getProduktCode());
        newProd.setBezeichnung(pos.getBezeichnung());
        newProd.setEinheit(Einheit.STK);
        PreisDTO preis = new PreisDTO();
        preis.setBrutto(false);
        preis.setNettoPreis(BigDecimal.ZERO);
        preis.setBruttoPreis(BigDecimal.ZERO);
        preis.setSteuerBetrag(BigDecimal.ZERO);
        preis.setSteuern(new ArrayList<SteuerDTO>());
        SteuerDTO st = new SteuerDTO();
        st.setSteuerArt(stArt);
        st.setBetrag(BigDecimal.ZERO);
        preis.getSteuern().add(st);
        newProd.setPreis(preis);
        
        newProd.setWrg(getStandardWrg());
        try {
          tProd = prodService.createProdukt(newProd);
          processingObject.getMessages()
                  .append("\nProdukt erfolgreich neu angelegt = ")
                  .append(tProd.getProduktCode())
                  .append(" ID=")
                  .append(tProd.getId());
        } catch (TomException ex) {
          processingObject.getMessages()
                  .append("\nError beim createProduct ")
                  .append(newProd).append(" ex=")
                  .append(ex.getMessage());
          LOG.error("Error beim createProduct " + newProd, ex);
          throw new ImportException(ex);
        }
      }
      //Product now known
      pos.setProdukt(new ProduktKopfDTO(tProd));
      BelegPositionCalculator.calculateFromTotalGross(pos,tProd.getPreis().getSteuern().get(0).getSteuerArt());
    }
    BelegCalculator.calculateTotals(processingObject.getTaopixOrder());
  }
  


  private SteuerArtDTO getStandardSteuer() throws ImportException {
    if (standardSteuer != null) {
      return standardSteuer;
    }
    try {
      getSteuernFromTom();
    } catch (TomException ex) {
      throw new ImportException(ex);
    }
    if (standardSteuer != null) {
      return standardSteuer;
    }
    LOG.error("Fehler: keinen Standard Steuersatz gefunden");
    throw new ImportException("keinen Standard Steuersatz gefunden");
  }

  private SteuerArtDTO getReduzierteSteuer() throws ImportException {
    if (reduzierteSteuer != null) {
      return reduzierteSteuer;
    }
    try {
      getSteuernFromTom();
    } catch (TomException ex) {
      throw new ImportException(ex);
    }
    if (reduzierteSteuer != null) {
      return reduzierteSteuer;
    }
    LOG.error("Fehler: keinen Standard Steuersatz gefunden");
    throw new ImportException("keinen Standard Steuersatz gefunden");
  }

  private void getSteuernFromTom() throws ImportException, TomException {
    if (!hasSteuern) {
      SearchByStringRequest req = new SearchByStringRequest();
      req.setSearchType(SearchType.ALL_RECORDS);
      req.setMandantenId(config.getMandatorId());
      List<SteuerArtDTO> stList = steuerService.searchByString(req);
      if (stList == null || stList.isEmpty()) {
        throw new ImportException("Fehler beim Holen der Steuerliste " + stList);
      }
      for (SteuerArtDTO stArt : stList) {
        if (stArt.isStandard()) {
          standardSteuer = stArt;
        } else if (config.getReducedTaxRate().compareTo(stArt.getSteuersatz()) == 0) {
          reduzierteSteuer = stArt;
        }
      }
    }
  }

  private WrgDTO getStandardWrg() throws ImportException {
    if (standardWrg != null) {
      return standardWrg;
    }

    SearchByStringRequest req = new SearchByStringRequest();
    req.setSearchString(config.getWrg());
    req.setMandantenId(config.getMandatorId());
    try {
      List<WrgDTO> result = wrgService.searchByString(req);
      Integer id = result.get(0).getId();
      WrgDTO eur = wrgService.loadById(id);
      if (eur == null || eur.getId() == null) {
        throw new ImportException("Standard Währung konnte nicht geladen werden ID=" + id);
      }
      return eur;

    } catch (TomException ex) {
      LOG.error("Standard Währung nicht gefunden " + config.getWrg(), ex);
      throw new ImportException("Standard Währung nicht gefunden " + config.getWrg());
    }


  }
}
