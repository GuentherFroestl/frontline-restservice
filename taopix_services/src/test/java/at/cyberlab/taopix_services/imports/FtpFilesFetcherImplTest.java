/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import at.cyberlab.taopix_services.config.FtpServerConfig;
import at.cyberlab.taopix_services.config.TaopixConfig;
import java.io.File;
import java.util.ArrayList;
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
public class FtpFilesFetcherImplTest {

  public FtpFilesFetcherImplTest() {
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
   * Test of getProcessor method, of class FtpFilesFetcherImpl.
   */
  @Test
  public void testGetProcessor() {
    System.out.println("getProcessor");
    IFileFetchPostProcessor expResult = new TestFileFetchPostProcessor();
    FtpFilesFetcherImpl instance = new FtpFilesFetcherImpl(expResult);
    IFileFetchPostProcessor result = instance.getProcessor();
    assertEquals(expResult, result);
  }

  /**
   * Test of setProcessor method, of class FtpFilesFetcherImpl.
   */
  @Test
  public void testSetProcessor() {
    System.out.println("setProcessor");
    IFileFetchPostProcessor processor = new TestFileFetchPostProcessor();;
    FtpFilesFetcherImpl instance = new FtpFilesFetcherImpl();
    instance.setProcessor(processor);
    IFileFetchPostProcessor result = instance.getProcessor();
    assertEquals(processor, result);
  }

  /**
   * Test of fetchFtpFiles method, of class FtpFilesFetcherImpl.
   */
  @Test
  public void testFetchFtpFiles() throws Exception {
    System.out.println("getTaopixConfig");
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    TaopixConfig result = instance.getTaopixConfig();
    assertNotNull("Result == null ", result);
    FtpServerConfig ftpConfig = result.getFtpServerConfig();
    assertNotNull("ftpConfig == null ", ftpConfig);
    System.out.println("fetchFtpFiles");

    FtpFilesFetcherImpl ftpInstance = new FtpFilesFetcherImpl(1);
    ftpInstance.setProcessor(new TestFileFetchPostProcessor());
    List ftpresult = ftpInstance.fetchFtpFiles(ftpConfig, getTestDirectoryPath(), IFtpFilesFetcher.FetchMode.FETCH_NEW_FILES);
    //no exception should be thrown
  }

  /**
   * Test of setIFileFetchPostProcessor method, of class FtpFilesFetcherImpl.
   */
  @Test
  public void testSetIFileFetchPostProcessor() {
    System.out.println("setIFileFetchPostProcessor");
    IFileFetchPostProcessor processor = new TestFileFetchPostProcessor();
    FtpFilesFetcherImpl instance = new FtpFilesFetcherImpl();
    instance.setIFileFetchPostProcessor(processor);
  }

  /**
   *
   * @return String of TestDirectoryPath.
   */
  private String getTestDirectoryPath() {
    String tempDir = System.getProperty("java.io.tmpdir");
    return tempDir;
  }

  /**
   * test mock impl.
   */
  public class TestFileFetchPostProcessor implements IFileFetchPostProcessor {

    @Override
    public void process(File file) throws ImportException {
      System.out.println("File zu bearbeiten " + file.getAbsolutePath());
    }
  }
}