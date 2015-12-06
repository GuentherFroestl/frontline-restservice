/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.imports.processing.BelegPositionCalculator;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.PreisDTO;
import com.tom.service.dto.SteuerArtDTO;
import java.math.BigDecimal;
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
public class BelegPositionCalculatorTest {

  public BelegPositionCalculatorTest() {
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
   * Test of calculateFromTotalGross method, of class BelegPositionCalculator.
   */
  @Test
  public void testCalculateFromTotalGross() {
    System.out.println("calculateFromTotalGross");
    SteuerArtDTO steuerArt = new SteuerArtDTO();
    steuerArt.setSteuersatz(new BigDecimal("10.00"));
    BelegPositionDTO pos = new BelegPositionDTO();
    PreisDTO gPreis = new PreisDTO();
    gPreis.setBruttoPreis(new BigDecimal("110.00"));
    pos.setGesamtPreis(gPreis);
    pos.setMenge(BigDecimal.ONE);

    BelegPositionCalculator.calculateFromTotalGross(pos, steuerArt);
    System.out.println(pos);
    assertNotNull("kein gesamtpreis berechnet", pos.getGesamtPreis());
    assertNotNull("kein Einzelpreis berechnet", pos.getEinzelPreis());
    assertTrue("Gesamt netto ist nicht 100.00", new BigDecimal("110.00").compareTo(pos.getGesamtPreis().getBruttoPreis()) == 0);
    assertTrue("Gesamt netto ist nicht 100.00", new BigDecimal("100.00").compareTo(pos.getGesamtPreis().getNettoPreis()) == 0);
    assertTrue("Gesamt steuern ist nicht 10.00", new BigDecimal("10.00").compareTo(pos.getGesamtPreis().getSteuerBetrag()) == 0);
    assertTrue("Einzel netto ist nicht 100.00", new BigDecimal("110.00").compareTo(pos.getEinzelPreis().getBruttoPreis()) == 0);
    assertTrue("Einzel netto ist nicht 100.00", new BigDecimal("100.00").compareTo(pos.getEinzelPreis().getNettoPreis()) == 0);
    assertTrue("Einzel steuern ist nicht 10.00", new BigDecimal("10.00").compareTo(pos.getEinzelPreis().getSteuerBetrag()) == 0);
    
    pos = new BelegPositionDTO();
    gPreis = new PreisDTO();
    gPreis.setBruttoPreis(new BigDecimal("3.90"));
    pos.setGesamtPreis(gPreis);
    pos.setMenge(BigDecimal.ONE);

    BelegPositionCalculator.calculateFromTotalGross(pos, steuerArt);
    System.out.println(pos);
    assertNotNull("kein gesamtpreis berechnet", pos.getGesamtPreis());
    assertNotNull("kein Einzelpreis berechnet", pos.getEinzelPreis());
    assertTrue("Gesamt brutto ist nicht 3.90", new BigDecimal("3.90").compareTo(pos.getGesamtPreis().getBruttoPreis()) == 0);
    assertTrue("Gesamt netto ist nicht 3.55 sondern "+pos.getGesamtPreis().getNettoPreis(), new BigDecimal("3.55").compareTo(pos.getGesamtPreis().getNettoPreis()) == 0);
//    assertTrue("Gesamt steuern ist nicht 10.00", new BigDecimal("10.00").compareTo(pos.getGesamtPreis().getSteuerBetrag()) == 0);
//    assertTrue("Einzel netto ist nicht 100.00", new BigDecimal("110.00").compareTo(pos.getEinzelPreis().getBruttoPreis()) == 0);
//    assertTrue("Einzel netto ist nicht 100.00", new BigDecimal("100.00").compareTo(pos.getEinzelPreis().getNettoPreis()) == 0);
//    assertTrue("Einzel steuern ist nicht 10.00", new BigDecimal("10.00").compareTo(pos.getEinzelPreis().getSteuerBetrag()) == 0);
  }
}