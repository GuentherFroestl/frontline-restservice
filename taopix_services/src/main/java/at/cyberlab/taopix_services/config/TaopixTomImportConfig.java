/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import java.math.BigDecimal;

/**
 * Some configs for the order Import Taopix to Tom
 *
 * @author gfr
 */
public interface TaopixTomImportConfig {

  /**
   * This number is added to all Taopix orders to fit into the Tom Order range.
   *
   * @return Integer, number to add
   */
  Integer getOrderNumberOffset();

  /**
   * This ID is the Tom Mandator to import the orders to.
   *
   * @return Integer MandatorId
   */
  Integer getMandatorId();

  /**
   *
   * @return Prefix for the User UUID
   */
  String getUserUuidPrefix();

  /**
   *
   * @return Prefix for the Order UUID
   */
  String getOrderUuidPrefix();

  /**
   * codestub to be used for recognizing reduced taxation.
   *
   * @return String codeStub
   */
  String getProductCodeStubForReducedTax();

  /**
   * codestub to be used for recognizing reduced taxation.
   *
   * @param code String codeStub
   */
  void setProductCodeStubForReducedTax(String code);

  /**
   * Reduced tax rate.
   *
   * @return BigDecimal Tx rate
   */
  BigDecimal getReducedTaxRate();

  /**
   * Set Reduced tax rate.
   *
   * @param txRate BigDecimal
   */
  void setReducedTaxRate(BigDecimal txRate);

  /**
   * Currency Code to use.
   *
   * @return String curency code
   */
  String getWrg();

  /**
   * Currency Code to use.
   *
   * @param currencyToUse String
   */
  void setWrg(String currencyToUse);

  /**
   * defines TOM database connection.
   *
   * @return DataBaseSpec
   */
  public DataBaseSpec getDataBaseSpec();

  /**
   * defines TOM database connection.
   *
   * @param dataBaseSpec DataBaseSpec
   */
  public void setDataBaseSpec(DataBaseSpec dataBaseSpec);

  /**
   *
   * @return String with xsl file name
   */
  public String getXslFileName();

  /**
   *
   * @param xslFileName
   */
  public void setXslFileName(String xslFileName);

  /**
   * This is the actual path within the file system.
   *
   * @return String with xsl file path
   */
  public String getXslFilePath();

  /**
   * This is the actual path within the file system.
   *
   * @param xslFilePath String the path to be set
   */
  public void setXslFilePath(String xslFilePath);

  /**
   *
   * @return String, the path this file was stored
   */
  public String getConfigFilePath();

  /**
   *
   * @param path String, the path this file was stored
   */
  public void setConfigFilePath(String path);
  
    /**
   *
   * @return String, the PostScriptPrinter Name
   */
  public String getPsPrinterName();

  /**
   *
   * @param path String,  the PostScriptPrinter Name
   */
  public void setPsPrinterName(String psPrinterName);
  
  public String getFopConfigFile();
  
  public void setFopConfigFile(String fopConfigFile);
  
  public String getFopConfigFilePath();
  
  public void setFopConfigFilePath(String fopConfigFilePath);
  
}
