/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gfr
 */
public class ProductServiceTest {

  private static DataBaseSpec dbSpec;
  private ProductService testee;

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
  public void tearDown() {
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
    assertNotNull("loadById,  ProduktDTO nicht geladen für id="+id, produkt);

  }

  /**
   * Test of createProdukt method, of class ProductService.
   */
  @Ignore
  @Test
  public void testCreateProdukt() throws Exception {
    System.out.println("createProdukt");
    ProduktDTO produkt = null;
    ProductService instance = null;
    ProduktDTO expResult = null;
    ProduktDTO result = instance.createProdukt(produkt);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of updateProdukt method, of class ProductService.
   */
  @Ignore
  @Test
  public void testUpdateProdukt() throws Exception {
    System.out.println("updateProdukt");
    ProduktDTO produkt = null;
    ProductService instance = null;
    ProduktDTO expResult = null;
    ProduktDTO result = instance.updateProdukt(produkt);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of deleteProdukt method, of class ProductService.
   */
  @Test
  @Ignore
  public void testDeleteProdukt() throws Exception {
    System.out.println("deleteProdukt");
    ProduktDTO produkt = null;
    ProductService instance = null;
    instance.deleteProdukt(produkt);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}