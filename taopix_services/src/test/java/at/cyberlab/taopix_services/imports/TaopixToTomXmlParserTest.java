/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.config.TaopixTomImportConfigImpl;
import at.cyberlab.taopix_services.imports.mapper.TaopixAddressMapper;
import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import java.io.InputStream;
import java.math.BigDecimal;
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
public class TaopixToTomXmlParserTest {

  TaopixTomImportConfig taopixTomConfig = new TaopixTomImportConfigImpl();

  public TaopixToTomXmlParserTest() {
  }

  @BeforeClass
  public static void setUpClass() {
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
   * Test of parse method, of class TaopixToTomXmlParser.
   */
  @Test
  public void testParseTaopixOrder() throws Exception {
    System.out.println("parse");
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005272.xml");


    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();
    assertNotNull("order == null", instance.getOrder());
    assertEquals("Mandator ID stimmt nicht ", taopixTomConfig.getMandatorId(), instance.getOrder().getMandant());
    Integer tomOrderNr = taopixTomConfig.getOrderNumberOffset()+Integer.parseInt(instance.getOrderId());
    assertEquals("TomOrderNr stimmt nicht ", new Integer(112505272), tomOrderNr);
    
    
    AddressDTO address = instance.getOrderAddress();
    System.out.println("Orderaddress= " + address);

    assertNotNull("orderAdr == null", address);
    assertEquals("Mandator ID stimmt nicht ", taopixTomConfig.getMandatorId(), address.getMandant());
    assertEquals("UUID does not match " + TaopixAddressMapper.TAOPIX_UUID_STUB + "1042", TaopixAddressMapper.TAOPIX_UUID_STUB + "1042", address.getUuid());
    assertEquals("name does not match 'Ott'", "Ott", address.getName());
    assertEquals("vorname does not match 'Katrin'", "Katrin", address.getVorname());
    assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", address.getEmail());
    assertEquals("plz does not match '2345'", "2345", address.getPlz());
    assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", address.getStadt());
    assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", address.getStrasse());
    assertEquals("mobilTelefon does not match '069912273745'", "069912273745", address.getMobilTelefon());
    assertNotNull("land == null", address.getLand());
    assertEquals("land.landName does not match 'Austria'", "Austria", address.getLand().getLandName());
    assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", address.getLand().getiSO3166Code_2());

    AddressDTO shipaddress = instance.getShippingAddress();
    System.out.println("Shippingaddress=" + shipaddress);
    assertNotNull("orderAdr == null", shipaddress);
    assertEquals("Mandator ID stimmt nicht ", taopixTomConfig.getMandatorId(), shipaddress.getMandant());
    assertEquals("name does not match 'Ott'", "Ott", shipaddress.getName());
    assertEquals("vorname does not match 'Katrin'", "Katrin", shipaddress.getVorname());
    assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", shipaddress.getEmail());
    assertEquals("plz does not match '2345'", "2345", shipaddress.getPlz());
    assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", shipaddress.getStadt());
    assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", shipaddress.getStrasse());
    assertEquals("mobilTelefon does not match '069912273745'", "069912273745", shipaddress.getMobilTelefon());
    assertNotNull("land == null", shipaddress.getLand());
    assertEquals("land.landName does not match 'Austria'", "Austria", shipaddress.getLand().getLandName());
    assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", shipaddress.getLand().getiSO3166Code_2());

    assertTrue("Order and shipping addresse don't match", address.equals(shipaddress));

    BelegPositionDTO pos = instance.getPosition();
    System.out.println("Product=" + pos);

    BelegPositionDTO transport = instance.getTransport();
    System.out.println("transport=" + transport);

    BelegPositionDTO discount = instance.getDiscount();
    System.out.println("Discount=" + discount);


  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. check, if orderAddress and shippingAddress are different,
   */
  @Test
  public void testTaopixShippingAddressParse() throws Exception {

    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    BelegPositionDTO pos2 = instance.getPosition();
    assertNotNull("Order Position == null", pos2);
    System.out.println("BelegPosition=" + pos2);
    assertFalse("Order and shipping addresse shouldn't match", instance.getOrderAddress().equals(instance.getShippingAddress()));
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testTaopixShippingPositionParse() throws Exception {

    //Test shipping
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());

    List<BelegPositionDTO> posListe = instance.getOrder().getPositionsListe();
    assertNotNull("Posliste == null", posListe);
    assertTrue("no shipping pos contained", instance.getShippingPosNumber() > 0);
    assertTrue("Posliste has wrong size, no shipping pos contained", posListe.size() >= instance.getShippingPosNumber());

    BelegPositionDTO shipping = instance.getOrder().getPositionsListe().get(instance.getShippingPosNumber());
    System.out.println("ShippingPos=" + shipping);
    assertNotNull("ShippingPos == null", shipping);
    assertEquals("pos.bezeichnung does not match 'AT'", "EXPRESS", shipping.getBezeichnung());
    assertTrue("pos.beschschreibung doesn't contain 'Ship with Courier (GLS)'", shipping.getBeschreibung().contains("Ship with Courier (GLS)"));
    assertTrue("pos.einzelPreis.nettoPreis doesn't match 3.25", shipping.getEinzelPreis().getNettoPreis().compareTo(new BigDecimal("3.25")) == 0);
    assertTrue("pos.einzelPreis.bruttoPreis doesn't match 3.90", shipping.getEinzelPreis().getBruttoPreis().compareTo(new BigDecimal("3.90")) == 0);
    assertTrue("pos.einzelPreis.steuerBetrag doesn't match 0.65", shipping.getEinzelPreis().getSteuerBetrag().compareTo(new BigDecimal("0.65")) == 0);
    assertNotNull("no list of steuern contained", shipping.getEinzelPreis().getSteuerBetrag());
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testTaopixDiscountParse() throws Exception {

    //Test shipping
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    assertNotNull("TaopixOrder == null", instance.getOrder());
    BelegPositionDTO discount = instance.getDiscount();
    assertNotNull("discount postion == null", discount);
    System.out.println("DiscountPos=" + discount);

    assertEquals("discount.bezeichnung does not match 'CYBERINTERN'", "CYBERINTERN", discount.getBezeichnung());
    assertTrue("discount.beschschreibung doesn't contain 'CYBERINTERN'", discount.getBeschreibung().contains("CYBERINTERN"));
    assertTrue("discount.einzelPreis.nettoPreis doesn't match -101.25", discount.getEinzelPreis().getNettoPreis().compareTo(new BigDecimal("-101.25")) == 0);
    assertTrue("discount.einzelPreis.bruttoPreis doesn't match -121.50", discount.getEinzelPreis().getBruttoPreis().compareTo(new BigDecimal("-121.50")) == 0);
    assertTrue("discount.einzelPreis.steuerBetrag doesn't match -20.25", discount.getEinzelPreis().getSteuerBetrag().compareTo(new BigDecimal("-20.25")) == 0);
    assertNotNull("discount, no list of steuern contained", discount.getEinzelPreis().getSteuerBetrag());
    assertTrue("no discount pos contained", instance.getDiscountPosNumber() > 0);
    assertTrue("Posliste has wrong size, no discount pos contained", instance.getOrder().getPositionsListe().size() >= instance.getDiscountPosNumber());

  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testBelegTotal_1() throws Exception {

    //Test total
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    System.out.println("Order=" + instance.getOrder());
    assertNotNull("TaopixOrder == null", instance.getOrder());
    PreisDTO preis = instance.getOrder().getPreis();
    assertNotNull("TotalPreis == null", preis);
    System.out.println("TotalPreis=" + preis);

    assertTrue("gesamtPreis.nettoPreis doesn't match 69.60", preis.getNettoPreis().compareTo(new BigDecimal("69.60")) == 0);
    assertTrue("gesamtPreis.bruttoPreis doesn't match 83.52", preis.getBruttoPreis().compareTo(new BigDecimal("83.52")) == 0);
    assertTrue("gesamtPreis.steuerBetrag doesn't match 13.92", preis.getSteuerBetrag().compareTo(new BigDecimal("13.92")) == 0);
    assertFalse("no taxes in gesamtPreis contained", preis.getSteuern().isEmpty());
    assertTrue("size of list of taxes  in gesamtPreis is not 1", preis.getSteuern().size() == 1);
    assertTrue("tax betrag doesn't match 13.92", preis.getSteuern().get(0).getBetrag().compareTo(new BigDecimal("13.92")) == 0);
    assertTrue("tax bezeichnung doesn't match MwSt.", preis.getSteuern().get(0).getSteuerArt().getBezeichnung().equalsIgnoreCase("MwSt."));
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testBelegTotal_2() throws Exception {

    //Test total
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    System.out.println("Order=" + instance.getOrder());
    assertNotNull("TaopixOrder == null", instance.getOrder());
    PreisDTO preis = instance.getOrder().getPreis();
    assertNotNull("TotalPreis == null", preis);
    System.out.println("TotalPreis=" + preis);

    assertTrue("gesamtPreis.nettoPreis doesn't match 0.00", preis.getNettoPreis().compareTo(new BigDecimal("0.00")) == 0);
    assertTrue("gesamtPreis.bruttoPreis doesn't match 0.00", preis.getBruttoPreis().compareTo(new BigDecimal("0.00")) == 0);
    assertTrue("gesamtPreis.steuerBetrag doesn't match 0.00", preis.getSteuerBetrag().compareTo(new BigDecimal("0.00")) == 0);
    assertFalse("no taxes in gesamtPreis contained", preis.getSteuern().isEmpty());
    assertTrue("size of list of taxes  in gesamtPreis is not 1", preis.getSteuern().size() == 1);
    assertTrue("tax betrag doesn't match 0.00", preis.getSteuern().get(0).getBetrag().compareTo(new BigDecimal("0.00")) == 0);
    assertTrue("tax bezeichnung doesn't match MwSt.", preis.getSteuern().get(0).getSteuerArt().getBezeichnung().equalsIgnoreCase("MwSt."));
  }
  
    /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testBelegBetreff() throws Exception {

    //Test total
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005476.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser(taopixTomConfig);
    instance.parse(xmlStream);
    xmlStream.close();

    System.out.println("Order=" + instance.getOrder());
    assertNotNull("TaopixOrder == null", instance.getOrder());
    assertNotNull("TaopixOrder.betreff == null", instance.getOrder().getBetreff());


    assertTrue("Betreff doesn't contain ordernumer ", instance.getOrder().getBetreff().contains("5476"));
    assertTrue("Betreff doesn't contain bezahlt ", instance.getOrder().getBetreff().contains("bezahlt"));
    assertTrue("Betreff doesn't contain ordernumer ", instance.getOrder().getBetreff().contains("PAYPAL"));

  }
}