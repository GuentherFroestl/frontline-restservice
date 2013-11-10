/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import at.cyberlab.taopix_services.config.FtpServerConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;
import org.apache.commons.net.ftp.FTPReply;

/**
 * Impl of IFtpFilesFetcher.
 *
 * @see IFtpFilesFetcher
 * @author gfr
 */
public class FtpFilesFetcherImpl implements IFtpFilesFetcher {

  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FtpFilesFetcherImpl.class.getSimpleName());
  private IFileFetchPostProcessor processor;
  private Integer numerOfFilesPerBatch;

  /**
   * Default constructor.
   */
  public FtpFilesFetcherImpl() {
  }

  /**
   * Constructor with IFileFetchPostProcessor injection.
   *
   * @param processor IFileFetchPostProcessor
   */
  public FtpFilesFetcherImpl(IFileFetchPostProcessor processor) {
    this.processor = processor;
  }

  /**
   * Constructor with IFileFetchPostProcessor injection.
   *
   * @param processor IFileFetchPostProcessor
   */
  public FtpFilesFetcherImpl(Integer numerOfFilesPerBatch) {
    this.numerOfFilesPerBatch = numerOfFilesPerBatch;
  }

  /**
   * Constructor with IFileFetchPostProcessor injection.
   *
   * @param processor IFileFetchPostProcessor
   * @param numerOfFilesPerBatch Integer Files fetched per batch
   */
  public FtpFilesFetcherImpl(IFileFetchPostProcessor processor, Integer numerOfFilesPerBatch) {
    this.processor = processor;
    this.numerOfFilesPerBatch = numerOfFilesPerBatch;
  }

  @Override
  public List<String> fetchFtpFiles(FtpServerConfig config, String targetDirectory, FetchMode mode) throws ImportException {

    //validate
    validateParameters(config, targetDirectory, mode);
    //Check sync dir
    File dir = getTargetDirectoryHandle(targetDirectory);
    //FTP Connection
    FTPClient ftp = getFtpConnection(config);
    //do the import
    List<String> result = new ArrayList<String>();
    try {
      result = fetchFtpFiles(ftp, dir);
    } catch (IOException ex) {
      logger.log(Level.SEVERE, "Exception occured while importing files", ex);
      throw new ImportException(ex);
    }
    //tear down
    disconnect(ftp);

    return result;

  }

  /**
   * do the real work by fetching files from the FTP server and writing them to the target directory.
   *
   * @param ftp FTPClient
   * @param dir File target directory
   * @return List of String
   * @throws ImportException
   */
  private List<String> fetchFtpFiles(FTPClient ftp, File dir) throws ImportException, IOException {

    if (dir == null || !dir.canWrite()) {
      logger.log(Level.SEVERE, "Kann nicht in Verzeichnis schreiben: {0}", new Object[]{dir});
      throw new ImportException("Kann nicht in Verzeichnis schreiben:" + dir);
    }

    List<String> result = new ArrayList<String>();
    int filesÜbertragen = 0;
    FTPListParseEngine engine = ftp.initiateListParsing();

    while (engine.hasNext() && checkFileCountLimit(filesÜbertragen)) {
      List<FTPFile> files = Arrays.asList(engine.getNext(25));

      for (FTPFile file : files) {

        if (!checkFileCountLimit(filesÜbertragen)) {
          break;
        }

        if (file.isFile()) {
          File tempDatei = new File(dir.getAbsolutePath() + "/" + file.getName());

          if (!tempDatei.canRead()) {
            FileOutputStream output = new FileOutputStream(tempDatei);
            boolean ok = ftp.retrieveFile(file.getName(), output);
            output.close();

            if (ok) {
              filesÜbertragen++;
              result.add(tempDatei.getAbsolutePath());

              if (processor != null) {
                processor.process(tempDatei);
              }
            } else {
              logger.log(Level.SEVERE, "Fehler beim speichern: {0} to {1}", new String[]{file.getName(), tempDatei.getAbsolutePath()});
              throw new ImportException("Fehler beim speichern: " + file.getName() + " to " + tempDatei.getAbsolutePath());
            }
          } else {
            logger.log(Level.FINE, "Datei in Zielverzeichnis bereits vorhanden: {0}", tempDatei.getAbsolutePath());
          }
        } else {
          logger.info("subdir: " + file.getName() + " will not be handled");
        }
      }
    }

    return result;
  }

  /**
   * Parameter validation.
   *
   * @param config
   * @param targetDirectory
   * @param mode
   */
  private void validateParameters(FtpServerConfig config, String targetDirectory, FetchMode mode) {
    if (config == null || targetDirectory == null || mode == null) {
      throw new IllegalArgumentException("one or more given parameters are null");
    }
  }

  /**
   * Failsave creation of a file handle for targetDirectoryPath.
   *
   * @param targetDirectoryPath
   * @return File
   */
  private File getTargetDirectoryHandle(String targetDirectoryPath) {
    File dir = new File(targetDirectoryPath);
    if (!dir.exists() || !dir.canWrite() || !dir.isDirectory()) {
      logger.info("init(): Fehler kann Directory nicht schreiben: "
              + dir.getAbsolutePath()
              + ", canWrite: " + dir.canWrite()
              + ", isDirectory: " + dir.isDirectory());
      throw new IllegalArgumentException("targetDirectory doesnt exist or can not be written to " + targetDirectoryPath);
    }
    return dir;
  }

  /**
   * Get the connection.
   *
   * @param config FtpServerConfig
   * @return FTPClient
   * @throws ImportException
   */
  private FTPClient getFtpConnection(FtpServerConfig config) throws ImportException {
    FTPClient ftp = new FTPClient();
    try {

      ftp.connect(config.getFtpServerName());
      int reply = ftp.getReplyCode();

      if (!FTPReply.isPositiveCompletion(reply)) {
        logger.info("init(): Fehler  kann nicht mit Ftp-Server verbinden: " + config.getFtpServerName());
        disconnect(ftp);
        throw new ImportException("kann nicht mit Ftp-Server verbinden: " + config.getFtpServerName());
      } else {
        logger.info("init() Verbindung mit Ftp-Server ok " + config.getFtpServerName());

      }

      if (!ftp.login(config.getFtpUserName(),
              config.getFtpPassword())) {
        ftp.logout();
        ftp.disconnect();
        logger.info("Fehler  kann nicht mit Ftp-Server verbinden, Login fehlgeschlagen: " + config.getFtpServerName() + " user=" + config.getFtpUserName());
        throw new IllegalArgumentException();
      }

      return ftp;
    } catch (Exception ex) {
      logger.log(Level.SEVERE, null, ex);
      disconnect(ftp);
      throw new ImportException(ex);
    }
  }

  /**
   * disconnect if connection exists, NullPointer save.
   *
   * @param ftp FTPClient
   */
  private void disconnect(FTPClient ftp) {
    if (ftp != null && ftp.isConnected()) {
      try {
        ftp.logout();
        ftp.disconnect();
      } catch (IOException ex) {
        logger.log(Level.SEVERE, "Error disconnecting from FTP server", ex);
      }
    }
  }

  @Override
  public void setIFileFetchPostProcessor(IFileFetchPostProcessor processor) {
    this.processor = processor;
  }

  public IFileFetchPostProcessor getProcessor() {
    return processor;
  }

  public void setProcessor(IFileFetchPostProcessor processor) {
    this.processor = processor;
  }

  /**
   * checks if more files can be fetched.
   *
   * @param numberOfFilesfetched
   * @return
   */
  private boolean checkFileCountLimit(int numberOfFilesfetched) {

    boolean ok = true;

    if (getNumerOfFilesPerBatch() != null && numberOfFilesfetched >= getNumerOfFilesPerBatch().intValue()) {
      return false;
    }

    return true;

  }

  public Integer getNumerOfFilesPerBatch() {
    return numerOfFilesPerBatch;
  }

  public void setNumerOfFilesPerBatch(Integer numerOfFilesPerBatch) {
    this.numerOfFilesPerBatch = numerOfFilesPerBatch;
  }
}
