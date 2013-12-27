/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.util.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.apache.log4j.Logger;


/**
 *
 * @author gfr
 */
public class XsltUtil implements IxsltUtil {
  
  private static final Logger LOG = Logger.getLogger(XsltUtil.class);

  TransformerFactory transFact = TransformerFactory.newInstance();
  FopFactory fopFactory;
  
  /**
   * public constructor.
   */
  public XsltUtil(){
  fopFactory = FopFactory.newInstance();
  }
  
  /**
   * Constructor with configFile.
   * @param configFile 
   */
  public XsltUtil(File configFile){
    fopFactory = FopFactory.newInstance();
    try {
      fopFactory.setUserConfig(configFile);
    } catch (Exception ex) {
      LOG.error("Error setting fop userconfig", ex);
    } 
    
  }

  @Override
  public void transform(final Source xml, final StreamSource xsl, final StreamResult result)
          throws TransformerException {


    Transformer trans = transFact.newTransformer(xsl);
    trans.transform(xml, result);
  }

  @Override
  public void transform(final File xmlFile, final File xslFile, final File resultFile)
          throws TransformerException {

    StreamSource xml = new StreamSource(xmlFile);
    StreamSource xsl = new StreamSource(xslFile);
    StreamResult result = new StreamResult(resultFile);
    transform(xml, xsl, result);
  }

  @Override
  public String transform(final Object obj, final InputStream xslFileStream) throws TransformerException {
    StreamSource xsl = new StreamSource(xslFileStream);
    ISerializer serializer = new XstreamSerializer();
    Source xml = serializer.serializeForTransformation(obj);
    Writer buffer = new StringWriter();
    StreamResult result = new StreamResult(buffer);
    transform(xml, xsl, result);
    String stringResult = buffer.toString();
    return stringResult;

  }

  @Override
  public void transformWithFOP(Object obj, InputStream xslFileStream, OutputStream result) throws TransformerException, FOPException {
    StreamSource xsl = new StreamSource(xslFileStream);
    ISerializer serializer = new XstreamSerializer();
    Source xml = serializer.serializeForTransformation(obj);
    transformWithFOP(xml, xsl, result);

  }

  @Override
  public void transformWithFOP(Source xml, StreamSource xsl, OutputStream result) throws TransformerException, FOPException {
    Transformer transformer = transFact.newTransformer(xsl);
    Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, result);
    Result res = new SAXResult(fop.getDefaultHandler());
    transformer.transform(xml, res);
  }
  
  @Override
  public void transformWithFOP(final File xmlFile, final File xslFile, final File resultFile) throws FileNotFoundException,TransformerException, FOPException {
    StreamSource xml = new StreamSource(xmlFile);
    StreamSource xsl = new StreamSource(xslFile);
    OutputStream result = new FileOutputStream(resultFile);
    transformWithFOP(xml, xsl, result);
  }
  
}
