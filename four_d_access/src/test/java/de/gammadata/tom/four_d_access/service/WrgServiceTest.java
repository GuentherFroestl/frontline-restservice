/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.dto.WrgDTO;
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
public class WrgServiceTest {

  private static DataBaseSpec dbSpec;
  private WrgService testee;

  public WrgServiceTest() {
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
    testee = new WrgService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of searchByString method, of class WrgService.
   */
  @Test
  public void testSearchByString() throws Exception {
    System.out.println("searchByString");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setSearchType(SearchType.ALL_RECORDS);
    req.setMandantenId(2);
    List<WrgDTO> result = testee.searchByString(req);
    assertNotNull("Result was null", result);
    assertTrue("Result was empty", result.size() > 0);
    System.out.println("Waehrungsliste=" + result);
  }

  /**
   * Test of loadById method, of class WrgService.
   */
  @Test
  public void testLoadById() throws Exception {
    System.out.println("loadById");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setSearchString("EUR");
    req.setMandantenId(2);
    List<WrgDTO> result = testee.searchByString(req);
    assertNotNull("Result was null", result);
    assertTrue("Result was empty", result.size() > 0);
    System.out.println("Waehrungsliste=" + result);
    Integer id= result.get(0).getId();
    WrgDTO eur = testee.loadById(id);
    assertNotNull("EUR object was null", eur);
    System.out.println("EUR=" + eur);
  }
}