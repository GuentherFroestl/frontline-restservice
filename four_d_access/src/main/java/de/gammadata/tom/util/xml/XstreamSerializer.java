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

  private static String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";

  @Override
  public final String serializeToXml(final Object obj) {
    XStream xstream = createXstream();
    String xml = xstream.toXML(obj);
    return xml;
  }

  @Override
  public String serializeToXmlWithUTF8Header(final Object obj) {
    XStream xstream = createXstream();
    StringBuilder sb = new StringBuilder();
    sb.append(XML_HEADER);
    String xml = xstream.toXML(obj);
    sb.append(xml);
    return sb.toString();
  }

  @Override
  public final Source serializeForTransformation(final Object obj) {

    XStream xstream = createXstream();
    StringBuilder sbXml = new StringBuilder(XML_HEADER);
    sbXml.append(xstream.toXML(obj));
    Source result = new StreamSource(new StringReader(sbXml.toString()));
    return result;
  }

  @Override
  public final Object deserializeFromXml(final String xml) {
    XStream xstream = createXstream();
    Object obj = xstream.fromXML(xml);
    return obj;
  }
  
  private XStream createXstream(){
    XStream xstream = new XStream();
    xstream.setMode(XStream.NO_REFERENCES);
    xstream.registerConverter(new DateConverter()); 
    return xstream;
  }
}
