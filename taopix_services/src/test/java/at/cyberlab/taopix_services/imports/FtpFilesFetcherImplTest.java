/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.CyberlabConfigProviderImpl;
import at.cyberlab.taopix_services.config.FtpServerConfig;
import at.cyberlab.taopix_services.config.TaopixConfig;
import java.io.File;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author gfr
 */
@Ignore
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
   * Test of fetchFtpFiles method, of class FtpFilesFetcherImpl.
   */
  @Test
  public void testFetchSingleFtpFile() throws Exception {
    System.out.println("testFetchSingleFtpFile");
    CyberlabConfigProviderImpl instance = new CyberlabConfigProviderImpl();
    TaopixConfig config = instance.getTaopixConfig();
    assertNotNull("Result == null ", config);
    FtpServerConfig ftpConfig = config.getFtpServerConfig();
    assertNotNull("ftpConfig == null ", ftpConfig);
    String testDirPath = getTestDirectoryPath();
    File testDir = new File(testDirPath);
    Assert.assertTrue("Testverzeichnis kann nicht geschrieben werden " + testDirPath, testDir.canWrite());
    String fileName = "0006001.xml";
    File outputFile = new File(testDir.getAbsolutePath() + "/" + fileName);
    outputFile.createNewFile();

    FtpFilesFetcherImpl ftpInstance = new FtpFilesFetcherImpl();
    boolean result = ftpInstance.fetchFtpFile(ftpConfig, fileName, outputFile);
    Assert.assertTrue("Fehler FTP-Result nickt ok für File="+fileName, result);
    System.out.println("testFetchSingleFtpFile File geholt="+outputFile.getAbsolutePath());
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