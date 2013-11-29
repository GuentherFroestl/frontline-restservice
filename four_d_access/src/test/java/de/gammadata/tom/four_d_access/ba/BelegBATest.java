/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.ba;

import com.tom.service.dto.BaseDTO;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.SearchType;
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
public class BelegBATest {

  private static DataBaseSpec dbSpec;
  private BelegBA belegBA;

  public BelegBATest() {
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
    belegBA = new BelegBA(dbSpec);

  }

  @After
  public void tearDown() {
  }

  /**
   * Test of searchBeleg method, of class BelegBA.
   */
  @Test
  public void testSearchBeleg() throws Exception {
    System.out.println("searchBeleg");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List result = belegBA.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine 10 Einträge", result);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, result.size());
  }

  /**
   * Test of loadBelegByUuid method, of class BelegBA.
   */
  @Ignore
  @Test
  public void testLoadBelegByUuid() throws Exception {
    System.out.println("loadBelegByUuid");
    BelegTyp type = null;
    String uuid = "";
    BelegBA instance = null;
    BelegDTO expResult = null;
    BelegDTO result = instance.loadBelegByUuid(type, uuid);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of loadBelegById method, of class BelegBA.
   */
  @Test
  public void testLoadBelegById() throws Exception {
    System.out.println("loadBelegById");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List<BelegKopfDTO> beList = belegBA.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine Einträge", beList);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, beList.size());
    BaseDTO expResult = (BaseDTO) beList.get(2);
    BelegDTO result = belegBA.loadBelegById(BelegTyp.AUFTRAG, expResult.getId());
    BaseDTO testResult = (BaseDTO) result;
    assertEquals("Beleg nicht geladen ID=" + expResult.getId(), expResult, testResult);
  }

  /**
   * Test of loadBelegByNumber method, of class BelegBA.
   */
  @Test
  public void testLoadBelegByNumber() throws Exception {
    System.out.println("loadBelegById");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List<BelegKopfDTO> beList = belegBA.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine 10 Einträge", beList);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, beList.size());
    BaseDTO expResult = (BaseDTO) beList.get(3);
    Integer belegNr = beList.get(3).getNummer();
    BelegDTO result = belegBA.loadBelegByNumber(BelegTyp.AUFTRAG, belegNr);
    assertNotNull("Beleg nicht geladen Nummer=" + belegNr, result);
    assertEquals("Beleg nicht geladen falsche Nummer=" + belegNr, belegNr.intValue(), result.getNummer());
    BaseDTO testResult = (BaseDTO) result;
    assertEquals("Beleg nicht geladen ID=" + expResult.getId(), expResult, testResult);
  }

  /**
   * Test of createBeleg method, of class BelegBA.
   */
  @Ignore
  @Test
  public void testCreateBeleg() throws Exception {
    System.out.println("createBeleg");
    BelegDTO beleg = null;
    BelegBA instance = null;
    BelegDTO expResult = null;
    BelegDTO result = instance.createBeleg(beleg);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of updateBeleg method, of class BelegBA.
   */
  @Ignore
  @Test
  public void testUpdateBeleg() throws Exception {
    System.out.println("updateBeleg");
    BelegDTO beleg = null;
    BelegBA instance = null;
    BelegDTO expResult = null;
    BelegDTO result = instance.updateBeleg(beleg);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of deleteBeleg method, of class BelegBA.
   */
  @Ignore
  @Test
  public void testDeleteBeleg() throws Exception {
    System.out.println("deleteBeleg");
    BelegDTO beleg = null;
    BelegBA instance = null;
    instance.deleteBeleg(beleg);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}