/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.ProduktDTO;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.ProductService;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gfr
 */
public class TaopixProductSyncTest {

  private CyberlabConfigProviderImpl provider = new CyberlabConfigProviderImpl();
  private DataBaseSpec dbSpec;
  private ProductService prodService;

  public TaopixProductSyncTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    dbSpec = provider.getDataBaseSpec();
    prodService = new ProductService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testProductSync() throws Exception {
    System.out.println("test product sync");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(new TaopixTomImportConfigImpl());
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("Positionsliste == null", instance.getOrder().getPositionsListe());
    assertEquals("Positionsliste != 3", 3,instance.getOrder().getPositionsListe().size());
    
    for(BelegPositionDTO pos: instance.getOrder().getPositionsListe()){
      assertNotNull("Product == null in "+pos, pos.getProdukt());
      System.out.println("test sync for product ="+pos.getProdukt());
      try {
        ProduktDTO prod = prodService.loadByCode(pos.getProdukt());
        System.out.println("Product found "+prod);
      } catch (TomException tomException) {
        System.out.println("Product not found "+tomException);
      }
    }
  }
}