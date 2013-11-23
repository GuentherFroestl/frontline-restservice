/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.imports.mapper.TaopixAddressMapper;
import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author gfr
 */
public class TaopixToTomXmlParserTest {

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


    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    AddressDTO address = instance.getOrderAddress();
    System.out.println("Orderaddress= " + address);
    Assert.assertNotNull("orderAdr == null", address.toString());
    Assert.assertEquals("UUID does not match " + TaopixAddressMapper.TAOPIX_UUID_STUB + "1042", TaopixAddressMapper.TAOPIX_UUID_STUB + "1042", address.getUuid());
    Assert.assertEquals("name does not match 'Ott'", "Ott", address.getName());
    Assert.assertEquals("vorname does not match 'Katrin'", "Katrin", address.getVorname());
    Assert.assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", address.getEmail());
    Assert.assertEquals("plz does not match '2345'", "2345", address.getPlz());
    Assert.assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", address.getStadt());
    Assert.assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", address.getStrasse());
    Assert.assertEquals("mobilTelefon does not match '069912273745'", "069912273745", address.getMobilTelefon());
    Assert.assertNotNull("land == null", address.getLand());
    Assert.assertEquals("land.landName does not match 'Austria'", "Austria", address.getLand().getLandName());
    Assert.assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", address.getLand().getiSO3166Code_2());

    AddressDTO shipaddress = instance.getShippingAddress();
    System.out.println("Shippingaddress=" + shipaddress);
    Assert.assertNotNull("orderAdr == null", shipaddress.toString());
    Assert.assertEquals("name does not match 'Ott'", "Ott", shipaddress.getName());
    Assert.assertEquals("vorname does not match 'Katrin'", "Katrin", shipaddress.getVorname());
    Assert.assertEquals("email does not match 'katrin.ott@hotmail.com'", "katrin.ott@hotmail.com", shipaddress.getEmail());
    Assert.assertEquals("plz does not match '2345'", "2345", shipaddress.getPlz());
    Assert.assertEquals("stadt does not match 'Brunn am Gebirge'", "Brunn am Gebirge", shipaddress.getStadt());
    Assert.assertEquals("strasse does not match 'Brunnengasse 8'", "Brunnengasse 8", shipaddress.getStrasse());
    Assert.assertEquals("mobilTelefon does not match '069912273745'", "069912273745", shipaddress.getMobilTelefon());
    Assert.assertNotNull("land == null", shipaddress.getLand());
    Assert.assertEquals("land.landName does not match 'Austria'", "Austria", shipaddress.getLand().getLandName());
    Assert.assertEquals("land.iSO3166Code_2 does not match 'AT'", "AT", shipaddress.getLand().getiSO3166Code_2());

    Assert.assertTrue("Order and shipping addresse don't match", address.equals(shipaddress));

    BelegPositionDTO pos = instance.getPosition();
    System.out.println("BelegPosition=" + pos);

    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());
    System.out.println("TaopixOrder=" + instance.getOrder());





  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. check, if orderAddress and shippingAddress are different,
   */
  @Test
  public void testTaopixShippingAddressParse() throws Exception {

    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    BelegPositionDTO pos2 = instance.getPosition();
    Assert.assertNotNull("Order Position == null", pos2);
    System.out.println("BelegPosition=" + pos2);
    Assert.assertFalse("Order and shipping addresse shouldn't match", instance.getOrderAddress().equals(instance.getShippingAddress()));
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testTaopixShippingPositionParse() throws Exception {

    //Test shipping
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());

    List<BelegPositionDTO> posListe = instance.getOrder().getPositionsListe();
    Assert.assertNotNull("Posliste == null", posListe);
    Assert.assertTrue("no shipping pos contained", instance.getShippingPosNumber() > 0);
    Assert.assertTrue("Posliste has wrong size, no shipping pos contained", posListe.size() >= instance.getShippingPosNumber());

    BelegPositionDTO shipping = instance.getOrder().getPositionsListe().get(instance.getShippingPosNumber());
    System.out.println("ShippingPos=" + shipping);
    Assert.assertNotNull("ShippingPos == null", shipping);
    Assert.assertEquals("pos.bezeichnung does not match 'AT'", "EXPRESS", shipping.getBezeichnung());
    Assert.assertTrue("pos.beschschreibung doesn't contain 'Ship with Courier (GLS)'", shipping.getBeschreibung().contains("Ship with Courier (GLS)"));
    Assert.assertTrue("pos.einzelPreis.nettoPreis doesn't match 3.25", shipping.getEinzelPreis().getNettoPreis().compareTo(new BigDecimal("3.25")) == 0);
    Assert.assertTrue("pos.einzelPreis.bruttoPreis doesn't match 3.90", shipping.getEinzelPreis().getBruttoPreis().compareTo(new BigDecimal("3.90")) == 0);
    Assert.assertTrue("pos.einzelPreis.steuerBetrag doesn't match 0.65", shipping.getEinzelPreis().getSteuerBetrag().compareTo(new BigDecimal("0.65")) == 0);
    Assert.assertNotNull("no list of steuern contained", shipping.getEinzelPreis().getSteuerBetrag());
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testTaopixDiscountParse() throws Exception {

    //Test shipping
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());
    BelegPositionDTO discount = instance.getDiscount();
    Assert.assertNotNull("discount postion == null", discount);
    System.out.println("DiscountPos=" + discount);

    Assert.assertEquals("discount.bezeichnung does not match 'CYBERINTERN'", "CYBERINTERN", discount.getBezeichnung());
    Assert.assertTrue("discount.beschschreibung doesn't contain 'CYBERINTERN'", discount.getBeschreibung().contains("CYBERINTERN"));
    Assert.assertTrue("discount.einzelPreis.nettoPreis doesn't match -101.25", discount.getEinzelPreis().getNettoPreis().compareTo(new BigDecimal("-101.25")) == 0);
    Assert.assertTrue("discount.einzelPreis.bruttoPreis doesn't match -121.50", discount.getEinzelPreis().getBruttoPreis().compareTo(new BigDecimal("-121.50")) == 0);
    Assert.assertTrue("discount.einzelPreis.steuerBetrag doesn't match -20.25", discount.getEinzelPreis().getSteuerBetrag().compareTo(new BigDecimal("-20.25")) == 0);
    Assert.assertNotNull("discount, no list of steuern contained", discount.getEinzelPreis().getSteuerBetrag());
    Assert.assertTrue("no discount pos contained", instance.getDiscountPosNumber() > 0);
    Assert.assertTrue("Posliste has wrong size, no discount pos contained", instance.getOrder().getPositionsListe().size() >= instance.getDiscountPosNumber());

  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testBelegTotal_1() throws Exception {

    //Test total
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005273.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    System.out.println("Order=" + instance.getOrder());
    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());
    PreisDTO preis = instance.getOrder().getPreis();
    Assert.assertNotNull("TotalPreis == null", preis);
    System.out.println("TotalPreis=" + preis);

    Assert.assertTrue("gesamtPreis.nettoPreis doesn't match 69.60", preis.getNettoPreis().compareTo(new BigDecimal("69.60")) == 0);
    Assert.assertTrue("gesamtPreis.bruttoPreis doesn't match 83.52", preis.getBruttoPreis().compareTo(new BigDecimal("83.52")) == 0);
    Assert.assertTrue("gesamtPreis.steuerBetrag doesn't match 13.92", preis.getSteuerBetrag().compareTo(new BigDecimal("13.92")) == 0);
    Assert.assertFalse("no taxes in gesamtPreis contained", preis.getSteuern().isEmpty());
    Assert.assertTrue("size of list of taxes  in gesamtPreis is not 1", preis.getSteuern().size() == 1);
    Assert.assertTrue("tax betrag doesn't match 13.92", preis.getSteuern().get(0).getBetrag().compareTo(new BigDecimal("13.92")) == 0);
    Assert.assertTrue("tax bezeichnung doesn't match MwSt.", preis.getSteuern().get(0).getSteuerArt().getBezeichnung().equalsIgnoreCase("MwSt."));
  }

  /**
   * Test of parse method, of class TaopixToTomXmlParser. Test if shipping position ist correct.
   */
  @Test
  public void testBelegTotal_2() throws Exception {

    //Test total
    InputStream xmlStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("taopix/0005343.xml");
    TaopixToTomXmlParser instance = new TaopixToTomXmlParser();
    instance.parse(xmlStream);
    xmlStream.close();

    System.out.println("Order=" + instance.getOrder());
    Assert.assertNotNull("TaopixOrder == null", instance.getOrder());
    PreisDTO preis = instance.getOrder().getPreis();
    Assert.assertNotNull("TotalPreis == null", preis);
    System.out.println("TotalPreis=" + preis);

    Assert.assertTrue("gesamtPreis.nettoPreis doesn't match 0.00", preis.getNettoPreis().compareTo(new BigDecimal("0.00")) == 0);
    Assert.assertTrue("gesamtPreis.bruttoPreis doesn't match 0.00", preis.getBruttoPreis().compareTo(new BigDecimal("0.00")) == 0);
    Assert.assertTrue("gesamtPreis.steuerBetrag doesn't match 0.00", preis.getSteuerBetrag().compareTo(new BigDecimal("0.00")) == 0);
    Assert.assertFalse("no taxes in gesamtPreis contained", preis.getSteuern().isEmpty());
    Assert.assertTrue("size of list of taxes  in gesamtPreis is not 1", preis.getSteuern().size() == 1);
    Assert.assertTrue("tax betrag doesn't match 0.00", preis.getSteuern().get(0).getBetrag().compareTo(new BigDecimal("0.00")) == 0);
    Assert.assertTrue("tax bezeichnung doesn't match MwSt.", preis.getSteuern().get(0).getSteuerArt().getBezeichnung().equalsIgnoreCase("MwSt."));
  }
}