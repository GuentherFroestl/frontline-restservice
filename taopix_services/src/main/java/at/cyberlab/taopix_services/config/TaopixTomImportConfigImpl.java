/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.config;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.util.Tom4DSpec;
import java.math.BigDecimal;

/**
 *
 * @author gfr
 */
public class TaopixTomImportConfigImpl implements TaopixTomImportConfig {

  private Integer orderNumberOffset = 112500000;
  private Integer mandatorId = 2;
  private String userUuidPrefix = "TAOPIX_USER_";
  private String orderUuidPrefix = "TAOPIX_ORDER_";
  private DataBaseSpec dataBaseSpec;
  private String productCodeStubForReducedTax = "FB";
  private BigDecimal reducedTaxRate = new BigDecimal("10.00");
  private String wrg="EUR";
  private String xslFileName = "cyberlab_beleg.xsl";
  public String xslFilePath;
  private String configFilePath;
  private String psPrinterName="myPsPrinter";
  private String fopConfigFile="fopconfig.xml";
  private String fopConfigFilePath;
  
  public TaopixTomImportConfigImpl(){
    dataBaseSpec = new Tom4DSpec().getDataBaseSpec();
  }

  @Override
  public Integer getOrderNumberOffset() {
    return orderNumberOffset;
  }

  public void setOrderNumberOffset(Integer orderNumberOffset) {
    this.orderNumberOffset = orderNumberOffset;
  }

  @Override
  public Integer getMandatorId() {
    return mandatorId;
  }

  public void setMandatorId(Integer mandatorId) {
    this.mandatorId = mandatorId;
  }

  @Override
  public String getUserUuidPrefix() {
    return userUuidPrefix;
  }

  public void setUserUuidPrefix(String userUuidPrefix) {
    this.userUuidPrefix = userUuidPrefix;
  }

  @Override
  public String getOrderUuidPrefix() {
    return orderUuidPrefix;
  }

  public void setOrderUuidPrefix(String orderUuidPrefix) {
    this.orderUuidPrefix = orderUuidPrefix;
  }

  @Override
  public String getWrg() {
    return wrg;
  }

  @Override
  public void setWrg(String wrg) {
    this.wrg = wrg;
  }
  
  

  @Override
  public DataBaseSpec getDataBaseSpec() {
    return dataBaseSpec;
  }

  @Override
  public String getProductCodeStubForReducedTax() {
    return productCodeStubForReducedTax;
  }

  @Override
  public void setProductCodeStubForReducedTax(String productCodeStubForReducedTax) {
    this.productCodeStubForReducedTax = productCodeStubForReducedTax;
  }

  @Override
  public BigDecimal getReducedTaxRate() {
    return reducedTaxRate;
  }

  @Override
  public void setReducedTaxRate(BigDecimal reducedTaxRate) {
    this.reducedTaxRate = reducedTaxRate;
  }

  @Override
  public void setDataBaseSpec(DataBaseSpec dataBaseSpec) {
    this.dataBaseSpec = dataBaseSpec;
  }

  @Override
  public String getXslFileName() {
    return xslFileName;
  }

  @Override
  public void setXslFileName(String xslFileName) {
    this.xslFileName = xslFileName;
  }  

  @Override
  public String getXslFilePath() {
    return xslFilePath;
  }

  @Override
  public void setXslFilePath(String xslFilePath) {
    this.xslFilePath = xslFilePath;
  }

  
  @Override
  public String getConfigFilePath() {
    return configFilePath;
  }

  @Override
  public void setConfigFilePath(String path) {
    this.configFilePath = path;
  }

  @Override
  public String getPsPrinterName() {
    return psPrinterName;
  }

  @Override
  public void setPsPrinterName(String psPrinterName) {
    this.psPrinterName = psPrinterName;
  }

  @Override
  public String getFopConfigFile() {
    return fopConfigFile;
  }

  @Override
  public void setFopConfigFile(String fopConfigFile) {
    this.fopConfigFile = fopConfigFile;
  }

  @Override
  public String getFopConfigFilePath() {
    return fopConfigFilePath;
  }

  @Override
  public void setFopConfigFilePath(String fopConfigFilePath) {
    this.fopConfigFilePath = fopConfigFilePath;
  }
  
}
