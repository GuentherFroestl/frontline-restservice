/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import java.util.UUID;
import org.apache.log4j.Logger;

/**
 *
 * @author gfr
 */
public class Abstract4DService {

  protected final Logger logger = Logger.getLogger(this.getClass());
  /**
   * specifies the 4D Connection. *
   */
  private DataBaseSpec dataBaseSpec;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec
   */
  public Abstract4DService(DataBaseSpec dataBaseSpec) {
    this.dataBaseSpec = dataBaseSpec;
  }

  public DataBaseSpec getDataBaseSpec() {
    return dataBaseSpec;
  }

  public void setDataBaseSpec(DataBaseSpec dataBaseSpec) {
    this.dataBaseSpec = dataBaseSpec;
  }

  public Logger getLogger() {
    return logger;
  }

  /**
   * Erzeugt einen Uuid Schlüssel
   *
   * @return Uuid
   */
  protected String createUuid() {
    String uuid = UUID.randomUUID().toString();
    return uuid;
  }
}
