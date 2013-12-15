package de.gammadata.tom.util.xml;

import javax.xml.transform.Source;

/**
 *
 * @author gfr
 */
public interface ISerializer {
  
  /**
   * serialize an object to xml.
   *
   * @param obj Object
   * @return String with xml
   */
  String serializeToXml(Object obj);

  /**
   * serialize an object to xml.
   *
   * @param obj Object
   * @return String with xml
   */
  String serializeToXmlWithUTF8Header(Object obj);

  /**
   * a convience methode for piplining to a XSLT transformation.
   *
   * @param obj Object
   * @return Source to be used for XSLT transformation
   */
  Source serializeForTransformation(Object obj);

  /**
   * create an object from xml made with serializeToXml.
   *
   * @param xml String
   * @return Object created
   */
  Object deserializeFromXml(String xml);
  
}
