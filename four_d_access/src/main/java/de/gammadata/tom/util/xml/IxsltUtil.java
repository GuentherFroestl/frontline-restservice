/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.util.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.fop.apps.FOPException;

/**
 *
 * @author gfr
 */
public interface IxsltUtil {

  /**
   * transform with standard XSLT using custom Sources and Results.
   *
   * @param xml Source
   * @param xsl StreamSource
   * @param result StreamResult
   * @throws TransformerException
   */
  void transform(Source xml, StreamSource xsl, StreamResult result) throws TransformerException;

  /**
   * transform with FOP usingcustom Sources and Results.
   *
   * @param xml Source
   * @param xsl StreamSource
   * @param result OutputStream
   * @throws TransformerException
   */
  void transformWithFOP(Source xml, StreamSource xsl, OutputStream result) throws TransformerException, FOPException;

  /**
   * transform using files.
   *
   * @param xmlFile File
   * @param xslFile File
   * @param resultFile File
   * @throws TransformerException
   */
  void transform(File xmlFile, File xslFile, File resultFile) throws TransformerException;

  /**
   * Transforming using standard XSLT.
   *
   * @param obj the object to use, will be serialized
   * @param xslFileStream xsl Template
   * @returns Transformation result as String
   * @throws TransformerException
   */
  String transform(Object obj, InputStream xslFileStream) throws TransformerException;

  /**
   * Transforming using XSLT transformation and then FOP.
   *
   * @param obj the object to use, will be serialized
   * @param xslFileStream xsl Template
   * @throws TransformerException, FOPException
   */
  void transformWithFOP(Object obj, InputStream xslFileStream, OutputStream result) throws TransformerException, FOPException;

  /**
   * Transforming using XSLT transformation and then FOP.
   *
   * @param xmlFile File
   * @param xslFile File
   * @param resultFile File to write result to
   * @throws FileNotFoundException
   * @throws TransformerException
   * @throws FOPException
   */
  public void transformWithFOP(final File xmlFile, final File xslFile, final File resultFile) throws FileNotFoundException, TransformerException, FOPException;
}
