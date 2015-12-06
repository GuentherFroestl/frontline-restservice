/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.BaseDTO;
import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.BelegTyp;
import com.tom.service.dto.SearchType;
import com.tom.service.dto.Status;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import java.util.Date;
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
public class BelegServiceTest {

  private static DataBaseSpec dbSpec;
  private BelegService testee;

  public BelegServiceTest() {
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
    testee = new BelegService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of searchBeleg method, of class BelegService.
   */
  @Test
  public void testSearchBeleg() throws Exception {
    System.out.println("searchBeleg");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List result = testee.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine Einträge", result);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, result.size());
  }

  /**
   * Test of loadBelegByUuid method, of class BelegService.
   */
  @Ignore
  @Test
  public void testLoadBelegByUuid() throws Exception {
    System.out.println("loadBelegByUuid");
    BelegTyp type = null;
    String uuid = "";
    BelegDTO expResult = null;
    BelegDTO result = testee.loadBelegByUuid(type, uuid);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of loadBelegById method, of class BelegService.
   */
  @Test
  public void testLoadBelegById() throws Exception {
    System.out.println("loadBelegById");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List<BelegKopfDTO> beList = testee.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine Einträge", beList);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, beList.size());
    BaseDTO expResult = (BaseDTO) beList.get(2);
    BelegDTO result = testee.loadBelegById(BelegTyp.AUFTRAG, expResult.getId());
    BaseDTO testResult = (BaseDTO) result;
    assertEquals("Beleg nicht geladen ID=" + expResult.getId(), expResult, testResult);
  }

  /**
   * Test of loadBelegByNumber method, of class BelegService.
   */
  @Test
  public void testLoadBelegByNumber() throws Exception {
    System.out.println("loadBelegById");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List<BelegKopfDTO> beList = testee.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine 10 Einträge", beList);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, beList.size());
    BaseDTO expResult = (BaseDTO) beList.get(3);
    Integer belegNr = beList.get(3).getNummer();
    BelegDTO result = testee.loadBelegByNumber(BelegTyp.AUFTRAG, belegNr);
    assertNotNull("Beleg nicht geladen Nummer=" + belegNr, result);
    assertEquals("Beleg nicht geladen falsche Nummer=" + belegNr, belegNr.intValue(), result.getNummer());
    BaseDTO testResult = (BaseDTO) result;
    assertEquals("Beleg nicht geladen ID=" + expResult.getId(), expResult, testResult);
  }

  /**
   * Test of checkBelegByNumber method, of class BelegService.
   */
  @Ignore
  @Test
  public void testCheckBelegByNumber() throws Exception {
    System.out.println("checkBelegByNumber");
    BelegSearchRequest searchReq = new BelegSearchRequest();
    searchReq.setSearchType(SearchType.ALL_RECORDS);
    searchReq.setBelegType(BelegTyp.AUFTRAG);
    searchReq.setLimit(10);
    searchReq.setMandantenId(2);
    List<BelegKopfDTO> beList = testee.searchBeleg(searchReq);
    assertNotNull("searchBelege,  Liste hat keine 10 Einträge", beList);
    assertEquals("searchBelege,  Liste hat keine 10 Einträge", 10, beList.size());
    BaseDTO expResult = (BaseDTO) beList.get(3);
    Integer belegNr = beList.get(3).getNummer();
    boolean result = testee.checkBelegByNumber(BelegTyp.AUFTRAG, belegNr);
    assertTrue("result should be true but was false", result);
    boolean result2 = testee.checkBelegByNumber(BelegTyp.AUFTRAG, -1);
    assertFalse("result should be false but was true", result2);
  }

  /**
   * Test of loadPositionenByProjektId method, of class BelegService.
   */
  @Test
  @Ignore
  public void testLoadPositionenByProjektId() throws Exception {
    System.out.println("loadPositionenByProjektId");
    BelegTyp type = null;
    Integer pId = null;
    Status status = null;
    BelegService instance = null;
    List expResult = null;
    List result = instance.loadPositionenByProjektId(type, pId, status);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of createBeleg method, of class BelegService.
   */
  @Test
  public void testCreateBeleg() throws Exception {
    System.out.println("testCreateBeleg");
    BelegDTO expResult = createTestBeleg();
    BelegDTO result = testee.createBeleg(expResult);
    assertNotNull("Beleg.ID ==null", result.getId());
    assertTrue("Beleg.ID ==0", result.getId() > 0);
    compareBelege(expResult, result);
    testee.deleteBeleg(result);
    BelegDTO delBeleg =null;
    try {
      delBeleg = testee.loadBelegById(result.getBelegTyp(), result.getId());
    } catch (TomException tomException) {
      //Excpected
    }
    assertNull("Error deleting Beleg "+delBeleg, delBeleg);
  }
  
  @Test
  public void testNextBelegNumber() throws Exception {
    System.out.println("testNextBelegNumber");
    int res1 = testee.getNextBelegNumber(BelegTyp.ANGEBOT);
    assertTrue("Belegnummer > 0", res1 > 0);
    int res2 = testee.getNextBelegNumber(BelegTyp.ANGEBOT);
    assertEquals("Belegnummer nicht erhöht", res1 + 1, res2);
  }

  /**
   * Test of updateBeleg method, of class BelegService.
   */
  @Test
  @Ignore
  public void testUpdateBeleg() throws Exception {
    System.out.println("updateBeleg");
    BelegDTO beleg = null;
    BelegService instance = null;
    BelegDTO expResult = null;
    BelegDTO result = instance.updateBeleg(beleg);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Create an test instance of BelegDTO.
   *
   * @return BelegDTO
   */
  private BelegDTO createTestBeleg() {

    BelegDTO beleg = new BelegDTO();
//    beleg.setNummer(123456789);
    beleg.setUuid("TEST_123456789");
    beleg.setBelegTyp(BelegTyp.AUFTRAG);
    beleg.setBetreff("Das ist der Betreff");
    beleg.setDatum(new Date());
    beleg.setMandant(2);
    beleg.setVermerk1("Vermerk_1");
    beleg.setVermerk2("Vermerk_2");
    beleg.setVermerk3("Vermerk_3");
    beleg.setVermerk4("Vermerk_4");
    beleg.setStatus("ABGESCHLOSSEN");
    return beleg;
  }

  private void compareBelege(BelegDTO expected, BelegDTO result) throws Exception {
    if (expected == null && result == null) {
      return;
    } else if (expected == null || result == null) {
      fail("Einer der Belege ist null, der andere nicht");
    }
    assertEquals("BelegNummer stimmt nicht überein", expected.getNummer(), result.getNummer());
    assertEquals("UUId stimmt nicht überein", expected.getUuid(), result.getUuid());
    assertEquals("BelegTyp stimmt nicht überein", expected.getBelegTyp(), result.getBelegTyp());
    assertEquals("Betreff stimmt nicht überein", expected.getBetreff(), result.getBetreff());
    assertEquals("Datum stimmt nicht überein", expected.getDatum(), result.getDatum());
    assertEquals("MandantenID stimmt nicht überein", expected.getMandant(), result.getMandant());
    assertEquals("Vermerk 1 stimmt nicht überein", expected.getVermerk1(), result.getVermerk1());
    assertEquals("Vermerk 2 stimmt nicht überein", expected.getVermerk2(), result.getVermerk2());
    assertEquals("Vermerk 3 stimmt nicht überein", expected.getVermerk3(), result.getVermerk3());
    assertEquals("Vermerk 4 stimmt nicht überein", expected.getVermerk4(), result.getVermerk4());
    assertEquals("Status stimmt nicht überein", expected.getStatus(), result.getStatus());

  }
}