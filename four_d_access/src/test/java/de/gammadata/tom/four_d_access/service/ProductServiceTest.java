/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import java.util.List;
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
public class ProductServiceTest {

  private static DataBaseSpec dbSpec;
  private ProductService testee;
  private ProduktDTO createdObject;

  public ProductServiceTest() {
  }

  @BeforeClass
  public static void setUpClass() {
    dbSpec = new Tom4DSpec().getDataBaseSpec();
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    testee = new ProductService(dbSpec);
  }

  @After
  public void tearDown() throws TomException {
    if (createdObject != null) {
      testee.deleteProdukt(createdObject);
    }
  }

  /**
   * Test of searchByString method, of class ProductService.
   */
  @Test
  public void testSearchByString() throws Exception {
    System.out.println("searchByString");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setLimit(10);
    req.setSearchString("a");
    req.setMandantenId(2);
    List<ProduktKopfDTO> result = testee.searchByString(req);
    assertNotNull("searchBelege,  Liste hat keine Einträge", result);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, result.size());
  }

  /**
   * Test of searchByString method, of class ProductService.
   */
  @Test
  public void testSearchByCode() throws Exception {
    System.out.println("searchByString");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setSearchType(SearchType.BY_CODE);
    req.setLimit(1);
    req.setSearchString("BD10");
    req.setMandantenId(2);
    List<ProduktKopfDTO> result = testee.searchByString(req);
    assertNotNull("searchBelege,  Liste hat keine Einträge", result);
    assertEquals("searchBelege,  Liste hat keine 1 Einträge", 1, result.size());
  }

  /**
   * Test of loadById method, of class ProductService.
   */
  @Test
  public void testLoadById() throws Exception {
    System.out.println("loadById");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setLimit(1);
    req.setSearchString("a");
    req.setMandantenId(2);
    List<ProduktKopfDTO> result = testee.searchByString(req);
    assertEquals("searchBelege,  Liste hat keinen Eintrage", 1, result.size());
    Integer id = result.get(0).getId();
    ProduktDTO produkt = testee.loadById(id);
    assertNotNull("loadById,  ProduktDTO nicht geladen für id=" + id, produkt);

  }

  /**
   * Test of createProdukt method, of class ProductService.
   */
  @Test
  public void testCreateAndUpdateProdukt() throws Exception {
    System.out.println("createProdukt");
    ProduktDTO produkt = new ProduktDTO();
    produkt.setProduktCode("TEST_TOM_123456789");
    produkt.setBeschreibung("Das ist die Beschreibung");
    produkt.setBezeichnung("Das ist die Bezeichnung");
    produkt.setMandant(2);
    ProduktDTO result = testee.createProdukt(produkt);
    createdObject = result;
    assertNotNull("createProdukt,  null als Ergebnis", result);
    assertNotNull("createProdukt ID == null", result.getId());
    ProduktDTO result2 = testee.loadById(result.getId());
    assertNotNull("createProdukt,  null result beim ernueten Laden", result2);
    assertEquals("ProductCode stimmt nicht ist=" + result2.getProduktCode(), produkt.getProduktCode(), result2.getProduktCode());
    assertEquals("Bezeichnung stimmt nicht ist=" + result2.getBezeichnung(), produkt.getBezeichnung(), result2.getBezeichnung());
    assertEquals("Beschreibung stimmt nicht ist=" + result2.getBeschreibung(), produkt.getBeschreibung(), result2.getBeschreibung());

    result2.setProduktCode("TEST_neu_123456789");
    result2.setBezeichnung("neue Bezeichnung");
    result2.setBeschreibung("neue Beschreibung");
    
    ProduktDTO result3=testee.updateProdukt(result2);
     assertNotNull("createProdukt,  null result beim Update", result3);
    result3 = testee.loadById(result3.getId());
    assertNotNull("createProdukt,  null result beim ernueten Laden", result3);
    assertEquals("ProductCode stimmt nicht ist=" + result3.getProduktCode(), "TEST_neu_123456789", result3.getProduktCode());
    assertEquals("Bezeichnung stimmt nicht ist=" + result3.getBezeichnung(), "neue Bezeichnung", result3.getBezeichnung());
    assertEquals("Beschreibung stimmt nicht ist=" + result3.getBeschreibung(), "neue Beschreibung", result3.getBeschreibung());
  }
}