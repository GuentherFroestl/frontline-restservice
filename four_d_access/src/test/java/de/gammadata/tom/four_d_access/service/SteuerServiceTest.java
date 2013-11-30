/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SteuerArtDTO;
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
public class SteuerServiceTest {

  private static DataBaseSpec dbSpec;
  private SteuerService testee;

  public SteuerServiceTest() {
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
    testee = new SteuerService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of loadStandardSteuerArt method, of class SteuerService.
   */
  @Test
  public void testLoadStandardSteuerArt() throws Exception {
    System.out.println("loadStandardSteuerArt");
    SteuerArtDTO expResult = null;
    SteuerArtDTO result = testee.loadStandardSteuerArt(2);
    assertNotNull("Result was null", result);
    System.out.println("StandardSteuerArt="+result);
  }

  /**
   * Test of searchByString method, of class SteuerService.
   */
  @Ignore
  @Test
  public void testSearchByString() throws Exception {
    System.out.println("searchByString");
    SearchByStringRequest req = null;
    SteuerService instance = null;
    List expResult = null;
    List result = instance.searchByString(req);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of loadById method, of class SteuerService.
   */
  @Ignore
  @Test
  public void testLoadById() throws Exception {
    System.out.println("loadById");
    Integer id = null;
    SteuerService instance = null;
    SteuerArtDTO expResult = null;
    SteuerArtDTO result = instance.loadById(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}