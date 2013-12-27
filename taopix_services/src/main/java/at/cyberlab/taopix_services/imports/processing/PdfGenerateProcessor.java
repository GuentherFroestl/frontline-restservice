/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports.processing;

import at.cyberlab.taopix_services.config.TaopixTomImportConfig;
import at.cyberlab.taopix_services.imports.ImportException;
import de.gammadata.tom.util.printing.IPrintingUtil;
import de.gammadata.tom.util.printing.PrintingUtil;
import de.gammadata.tom.util.xml.ISerializer;
import de.gammadata.tom.util.xml.IxsltUtil;
import de.gammadata.tom.util.xml.XsltUtil;
import de.gammadata.tom.util.xml.XstreamSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.xml.transform.TransformerException;
import org.apache.commons.io.IOUtils;
import org.apache.fop.apps.FOPException;
import org.apache.log4j.Logger;

/**
 * generates a pdf using the order and prints the pdf to the configurated printer.
 *
 * @author gfr
 */
public class PdfGenerateProcessor implements ITaopixOrderImportProcessor {

  private static Logger LOG = Logger.getLogger(PdfGenerateProcessor.class);
  private final TaopixTomImportConfig config;

  private IxsltUtil xsltUtil;
  private ISerializer serializer = new XstreamSerializer();
  /**
   * for unit test prurposes
   */
  private File xsl;

  public PdfGenerateProcessor(TaopixTomImportConfig config) {
    this.config = config;
    if (config.getFopConfigFilePath()!=null){
      xsltUtil = new XsltUtil(new File(config.getFopConfigFilePath()));
    }else{
      xsltUtil = new XsltUtil();
    }
  }

  @Override
  public void processOrder(TaopixImportProcessingObject processingObject) throws ImportException {
    if (xsl == null) {
      xsl = new File(config.getXslFilePath());
    }
    if (!xsl.canRead()) {
      LOG.error("xsl file nicht gefunden/lesbar pfad=" + config.getXslFileName());
      throw new ImportException("xsl file nicht gefunden/lesbar pfad=" + config.getXslFileName());
    }
    try {
      InputStream xslStream = new FileInputStream(xsl);
      File xml = File.createTempFile("taopix_order_" + processingObject.getTaopixOrder().getNummer()+"_", ".xml");
      OutputStream xmlFile = new FileOutputStream(xml);
      String xmlString = serializer.serializeToXmlWithUTF8Header(processingObject.getTaopixOrder());
      IOUtils.write(xmlString, xmlFile,"UTF-8");
      xmlFile.close();
      processingObject.getMessages().append("\nOrder in Xml-Datei geschrieben Pfad=" + xml.getAbsolutePath());
      LOG.info("Order in Xml-Datei geschrieben Pfad=" + xml.getAbsolutePath());
      File pdfFile = File.createTempFile("taopix_order_" + processingObject.getTaopixOrder().getNummer(), ".pdf");
      OutputStream pdfStream = new FileOutputStream(pdfFile);
      xsltUtil.transformWithFOP(processingObject.getTaopixOrder(), xslStream, pdfStream);
      pdfStream.close();
      LOG.info("Order in PDF-Datei geschrieben Pfad=" + pdfFile.getAbsolutePath());
      processingObject.getMessages().append("\nOrder in PDF-Datei geschrieben Pfad=" + pdfFile.getAbsolutePath());
      processingObject.setPdfOrderFile(pdfFile);
      


    } catch (FileNotFoundException ex) {
      LOG.error("xsl file nicht gefunden/lesbar pfad=" + config.getXslFileName());
      throw new ImportException("xsl file nicht gefunden/lesbar pfad=" + config.getXslFileName());
    } catch (IOException ex) {
      LOG.error("eine Datei kann nicht erzeugt werden", ex);
      throw new ImportException("eine Datei kann nicht erzeugt werden, " + ex.getMessage());
    } catch (TransformerException ex) {
      LOG.error("Bei der XSLT Transformation ist ein Fehler aufgetreten", ex);
      throw new ImportException("Bei der XSLT Transformation ist ein Fehler aufgetreten" + ex.getMessage());
    } catch (FOPException ex) {
      LOG.error("Bei der PDF Erzeugung ist ein Fehler aufgetreten", ex);
      throw new ImportException("Bei der PDF Erzeugung i ist ein Fehler aufgetreten" + ex.getMessage());
    }
  }


  public File getXsl() {
    return xsl;
  }

  public void setXsl(File xsl) {
    this.xsl = xsl;
  }
}
