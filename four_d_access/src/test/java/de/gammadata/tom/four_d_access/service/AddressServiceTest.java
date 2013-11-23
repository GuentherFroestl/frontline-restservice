/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SearchType;
import com.tom.service.facade.TomException;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AddressServiceTest {

  private static DataBaseSpec dbSpec;
  private static final String TEST_EMAIL_ADR = "Tester_1.Tom_1@test.com";
  private static final String TEST_UUID = "Test_0123456789";
  private AddressService instance;

  public AddressServiceTest() {
  }

  @BeforeClass
  public static void setUpClass() {
    dbSpec = new Tom4DSpec().getDataBaseSpec();


  }

  private static AddressDTO createTestAdrInDB() {
    AddressService svc = new AddressService(dbSpec);
    AddressDTO adr = createTestAdr();
    try {
      AddressDTO result = svc.createAddress(adr);
      return result;
    } catch (TomException ex) {
      Logger.getLogger(AddressServiceTest.class.getName()).log(Level.SEVERE, null, ex);
      fail("setUp failed " + ex.getMessage());
    }
    return null;
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
    //Delete
    AddressDTO adr = createTestAdr();
    AddressService svc = new AddressService(dbSpec);
    try {
      svc.deleteAddress(adr);
    } catch (TomException ex) {
      //EMPTY
    }
    try {

      AddressDTO checkAdr = svc.loadAddressByUuid(TEST_UUID);
      if (checkAdr != null) {
        fail("Addresse nicht gelöscht " + checkAdr);
      }
    } catch (TomException tomException) {
      //Adresse nicht gefunden ist ok
    }
  }

  /**
   *
   * @return AddressDTO
   */
  private static AddressDTO createTestAdr() {
    AddressDTO testAdr = new AddressDTO();
    testAdr.setMandant(new Integer(2));
    testAdr.setName("Tester_1");
    testAdr.setVorname("Tom_1");
    testAdr.setFirma("Testfirma");
    testAdr.setEmail(TEST_EMAIL_ADR);
    testAdr.setPlz("123456");
    testAdr.setStadt("Testhausen");
    testAdr.setStrasse("Testring 24");
    testAdr.setTelefon("0123456789");
    testAdr.setUuid(TEST_UUID);

    return testAdr;
  }

  /**
   * Test of createAddress, update, delete method, of class AddresService.
   */
  @Test
  public void testCreateAndUpdateAndDeleteAddress() throws Exception {
    System.out.println("createAddress");
    AddressDTO adr = createTestAdr();
    AddressDTO expResult = createTestAdr();

    //Create
    AddressDTO result = instance.createAddress(adr);
    compareAddresses(result, expResult);

    //Update
    result.setName("Updated name");
    result.setVorname("Updated vorname");
    AddressDTO updateResult = instance.updateAddress(result);
    compareAddresses(updateResult, result);

    //Delete
    String uuid = result.getUuid();
    instance.deleteAddress(result);
    try {
      AddressDTO checkAdr = instance.loadAddressByUuid(uuid);
      if (checkAdr != null) {
        fail("Addresse nicht gelöscht " + checkAdr);
      }
    } catch (TomException tomException) {
      //Adresse nicht gefunden ist ok
    }
  }

  /**
   * Test of searchAddresses method, of class AddresService.
   */
  @Test
  public void testSearchAddresses() throws Exception {
    AddressDTO expResult = createTestAdrInDB();
    System.out.println("searchAddresses");
    SearchByStringRequest req = new SearchByStringRequest();
    req.setLimit(new Integer(1));
    req.setSearchType(SearchType.BY_EMAIL);
    req.setSearchString(TEST_EMAIL_ADR);
    List<AddressDTO> result = instance.searchAddresses(req);
    System.out.println("result=" + result);
    assertNotNull("Ergebins ist null", result);
    assertNotNull("Ergebins Selection ist null", result);
    assertTrue("ErgebnisListe.size ist nicht 1", result.size() == 1);
    assertNotNull("Addresse ist null", result.get(0));
    compareAddresses(result.get(0), expResult);

  }

  /**
   * Test of loadAddressById method, of class AddresService.
   */
  @Test
  public void testLoadAddressByUUIdAndId() throws Exception {
    AddressDTO expResult = createTestAdrInDB();

    AddressDTO resByUUID = instance.loadAddressByUuid(TEST_UUID);
    compareAddresses(resByUUID, expResult);
    Integer id = resByUUID.getId();
    AddressDTO resById = instance.loadAddressById(id.toString());
    compareAddresses(resById, expResult);
  }

  /**
   * Test of syncAddress method, of class AddresService.
   */
  @Test
  public void testSyncAdr() throws Exception {
    AddressDTO expResult = createTestAdr();
    AddressDTO resBySync = instance.syncAddress(expResult);
    compareAddresses(resBySync, expResult);

  }

  /**
   * Test of syncAddress method, of class AddresService.
   */
  @Test
  public void testSyncAdrWithAdrExisting() throws Exception {
    AddressDTO expResult = createTestAdrInDB();
    AddressDTO resBySync = instance.syncAddress(expResult);
    compareAddresses(resBySync, expResult);
    assertEquals("ID stimmt nicht "+resBySync.getId(), expResult.getId(),resBySync.getId());

  }

  /**
   * Convienence methode.
   *
   * @param result AddressDTO
   * @param expResult AddressDTO
   * @throws Exception if fail
   */
  private void compareAddresses(AddressDTO result, AddressDTO expResult) throws Exception {
    assertEquals("UUID stimmt nicht " + result.getUuid(), expResult.getUuid(), result.getUuid());
    assertEquals("Name stimmt nicht " + result.getName(), expResult.getName(), result.getName());
    assertEquals("Vorname stimmt nicht " + result.getVorname(), expResult.getVorname(), result.getVorname());
    assertEquals("Firma stimmt nicht " + result.getFirma(), expResult.getFirma(), result.getFirma());
    assertEquals("Email stimmt nicht " + result.getEmail(), expResult.getEmail(), result.getEmail());
    assertEquals("PLZ stimmt nicht " + result.getPlz(), expResult.getPlz(), result.getPlz());
    assertEquals("Stadt stimmt nicht " + result.getStadt(), expResult.getStadt(), result.getStadt());
    assertEquals("Strasse stimmt nicht " + result.getStrasse(), expResult.getStrasse(), result.getStrasse());
    assertEquals("Telefon stimmt nicht " + result.getTelefon(), expResult.getTelefon(), result.getTelefon());

  }
}