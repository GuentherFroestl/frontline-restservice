/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.ba;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import org.apache.log4j.Logger;

/**
 * ABstract base class for all business activities.
 *
 * @author gfr
 */
public class AbstractBA {

  protected final Logger logger = Logger.getLogger(this.getClass());
  /**
   * specifies the 4D Connection. *
   */
  private DataBaseSpec dataBaseSpec;

  /**
   * Constructor with injection.
   *
   * @param dataBaseSpec DataBaseSpec to use
   */
  public AbstractBA(DataBaseSpec dataBaseSpec) {
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
}
