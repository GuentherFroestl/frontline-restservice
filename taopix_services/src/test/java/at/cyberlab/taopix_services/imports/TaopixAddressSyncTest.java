/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import com.tom.service.dto.AddressDTO;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.service.AddressService;
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
public class TaopixAddressSyncTest {

  private CyberlabConfigProviderImpl provider = new CyberlabConfigProviderImpl();
  private DataBaseSpec dbSpec;
  private AddressService adrService;

  public TaopixAddressSyncTest() {
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
    adrService = new AddressService(dbSpec);
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testAddressSync() throws Exception {
    System.out.println("parse");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();
    
    AddressDTO orderAddress = instance.getOrderAddress();
    AddressDTO shipaddress = instance.getShippingAddress();
    System.out.println("sync order Adr");
    AddressDTO synOrderAdr = adrService.syncAddress(orderAddress);
    System.out.println("sync order Adr finshed "+synOrderAdr);
    System.out.println("sync shipping Adr");
    AddressDTO syncShippingAdr = adrService.syncAddress(shipaddress);
    System.out.println("sync shipping Adr finshed "+syncShippingAdr);
//    System.out.println("delete test adress");
//    adrService.deleteAddress(synOrderAdr);
//    adrService.deleteAddress(syncShippingAdr);
    
    
  }
}