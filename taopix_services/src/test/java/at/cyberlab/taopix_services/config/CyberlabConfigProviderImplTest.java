/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gfr
 */
public class CyberlabConfigProviderImplTest {
  
  public CyberlabConfigProviderImplTest() {
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
   * Test of getTaopixConfig method, of class CyberlabConfigProviderImpl.
   */
  @org.junit.Test
  public void testGetTaopixConfig() {
    System.out.println("getTaopixConfig");
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    TaopixConfig result = instance.getTaopixConfig();
    assertNotNull("Result == null ",result);
    FtpServerConfig ftpConfig = result.getFtpServerConfig();
    assertNotNull("ftpConfig == null ",ftpConfig);
  }

  /**
   * Test of setTaopixConfig method, of class CyberlabConfigProviderImpl.
   */
  @org.junit.Test
  public void testSetTaopixConfig() {
    System.out.println("setTaopixConfig");
    TaopixConfig taopixConfig = new TaopixConfigImpl();
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    instance.setTaopixConfig(taopixConfig);
    TaopixConfig result = instance.getTaopixConfig();
    assertEquals(taopixConfig, result);
  }

  /**
   * Test of getFilesystemConfig method, of class CyberlabConfigProviderImpl.
   */
  @Ignore
  @org.junit.Test
  public void testGetFilesystemConfig() {
    System.out.println("getFilesystemConfig");
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    FileSystemConfig expResult = null;
    FileSystemConfig result = instance.getFilesystemConfig();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setFilesystemConfig method, of class CyberlabConfigProviderImpl.
   */
  @Ignore
  @org.junit.Test
  public void testSetFilesystemConfig() {
    System.out.println("setFilesystemConfig");
    FileSystemConfig filesystemConfig = null;
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    instance.setFilesystemConfig(filesystemConfig);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}