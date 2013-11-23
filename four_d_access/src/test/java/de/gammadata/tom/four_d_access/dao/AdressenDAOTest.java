/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.dao;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dbBeans.Adressen;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
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
public class AdressenDAOTest {
  
  private static DataBaseSpec dbSpec; 
  
  public AdressenDAOTest() {
    
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
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of searchAdressen method, of class AdressenDAO.
   */
  @Test
  public void testSearchAdressen() throws Exception {
    System.out.println("searchAdressen");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setLimit(new Integer(1));
    req.setSearchType(SearchType.BY_EMAIL);
    req.setSearchString("gfr@gammadata.de");
    AdressenDAO instance = new AdressenDAO(dbSpec);
    XmpSelection result = instance.searchAdressen(req);
    System.out.println("result="+result);
    assertNotNull("Ergebins ist null",result);
    assertNotNull("Ergebins Selection ist null",result.getSelection());
    assertTrue("ErgebnisListe.size ist nicht 1", result.getSelection().size()==1);
    Adressen adr = (Adressen)result.getSelection().get(0);
    assertNotNull("Addresse ist null",adr);
    assertEquals("Email stimmt nicht überein mit 'gfr@gammadata.de'", "gfr@gammadata.de", adr.getEMail());
    
  }

  /**
   * Test of getXmpInstance method, of class AdressenDAO.
   */
  @Test
  public void testGetXmpInstance() {
    System.out.println("getXmpInstance");
    AdressenDAO instance = new AdressenDAO(dbSpec);
    Adressen result = instance.getXmpInstance();
    assertTrue("XmpInstance ist nicht 'Adressen'", result instanceof Adressen);
  }

  /**
   * Test of getCompactFieldSpecs method, of class AdressenDAO.
   */
  @Ignore
  @Test
  public void testGetCompactFieldSpecs() {
    System.out.println("getCompactFieldSpecs");
    AdressenDAO instance = null;
    int[] expResult = null;
    int[] result = instance.getCompactFieldSpecs();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}