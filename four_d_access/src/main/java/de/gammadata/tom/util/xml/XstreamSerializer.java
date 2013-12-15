package de.gammadata.tom.util.xml;

import com.thoughtworks.xstream.XStream;
import java.io.StringReader;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author gfr
 */
public class XstreamSerializer implements ISerializer {

  private static String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

  @Override
  public final String serializeToXml(final Object obj) {
    XStream xstream = new XStream();
    xstream.registerConverter(new DateConverter());
    String xml = xstream.toXML(obj);
    return xml;
  }

  @Override
  public String serializeToXmlWithUTF8Header(final Object obj) {
    XStream xstream = new XStream();
    xstream.registerConverter(new DateConverter());
    StringBuilder sb = new StringBuilder();
    sb.append(XML_HEADER);
    String xml = xstream.toXML(obj);
    sb.append(xml);
    return sb.toString();
  }

  @Override
  public final Source serializeForTransformation(final Object obj) {

    XStream xstream = new XStream();
    xstream.registerConverter(new DateConverter());
    xstream.setMode(XStream.NO_REFERENCES);
    StringBuilder sbXml = new StringBuilder(XML_HEADER);
    sbXml.append(xstream.toXML(obj));
    Source result = new StreamSource(new StringReader(sbXml.toString()));
    return result;
  }

  @Override
  public final Object deserializeFromXml(final String xml) {
    XStream xstream = new XStream();
    xstream.setMode(XStream.NO_REFERENCES);
    Object obj = xstream.fromXML(xml);
    return obj;
  }
}
