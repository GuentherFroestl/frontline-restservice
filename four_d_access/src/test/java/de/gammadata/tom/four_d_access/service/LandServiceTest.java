/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.LandDTO;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
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
public class LandServiceTest {

  private static DataBaseSpec dbSpec;
  private AddressService instance;

  public LandServiceTest() {
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
    instance = new AddressService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of syncAddress method, of class AddresService.
   */
  @Test
  public void testSyncLand() throws Exception {

    System.out.println("testSyncLand");
    LandDTO land = createLand();
    LandDTO resBySync = instance.syncLand(land);
    System.out.println("testSyncLand Ergebnis= "+resBySync);
    assertNotNull("LandDTO nicht erzeugt", resBySync);
    assertNotNull("LandDTO.id nicht erzeugt", resBySync.getId());
    assertTrue("LandDTO.id nicht erzeugt", resBySync.getId()>0);
    Integer landId = resBySync.getId();
    //nochmals
    LandDTO resBySync2 = instance.syncLand(land);
    System.out.println("testSyncLand Ergebnis= "+resBySync2);
    assertEquals("Land.ID nicht gleich", landId, resBySync2.getId());
    
  }

  private LandDTO createLand() {
    LandDTO land = new LandDTO();
    land.setLandName("Austria");
    land.setiSO3166Code_2("AT");
    land.setiSO3166Code_3("AUT");
    land.setMandant(new Integer(2));
    return land;
  }
}