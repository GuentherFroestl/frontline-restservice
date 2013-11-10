/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.cyberlab.taopix_services.imports;

import com.tom.service.dto.AddressDTO;
import com.tom.service.dto.BelegDTO;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Parst ein xml file un dliefert ein BelegDTO zurück
 *
 * @author gfr
 */
public class TaopixToTomXmlParser {

  static final Logger logger = Logger.getLogger(TaopixToTomXmlParser.class.getSimpleName());
  private SAXParserFactory factory;
  private SAXParser saxParser;
  private DefaultHandler handler;
  private ITaopixToTomObjectMapper tomObjectMapper;
  private HashMap<String, String> userProperties;
  private HashMap<String, String> orderProperties;
  private HashMap<String, String> itemProperties;
  private HashMap<String, String> shippingProperties;
  private String currentUserId;
  private String billingUserId;
  private String shippingUserId;
  private String orderId;
  private boolean orderIdStored;
  private boolean isInHeader = false;
  private boolean isInItem = false;
  private boolean isInShipping = false;
  private boolean isInCcilog = false;
  private AddressDTO orderAddress;
  private AddressDTO shippingAddress;
  private BelegDTO beleg;

  /**
   * Constructor with injection.
   *
   * @param tomObjectMapper ITaopixToTomObjectMapper
   */
  public TaopixToTomXmlParser(ITaopixToTomObjectMapper tomObjectMapper) {
    this.tomObjectMapper = tomObjectMapper;
    factory = SAXParserFactory.newInstance();
    try {
      saxParser = factory.newSAXParser();
      handler = new TaopixToTomSaxHandler();
    } catch (Exception ex) {
      logger.log(Level.SEVERE, "Fehler beim Erzeugen des SaxParsers", ex);
      throw new RuntimeException("Fehler beim Erzeugen des SaxParsers", ex);
    }
  }

  public AddressDTO getOrderAddress() {
    return orderAddress;
  }

  public AddressDTO getShippingAddress() {
    return shippingAddress;
  }

  public BelegDTO getBeleg() {
    return beleg;
  }

  /**
   * clearing of all properties
   */
  private void clearProperties() {
    userProperties = null;
    orderProperties = null;
    itemProperties = null;
    shippingProperties = null;
    currentUserId = null;
    billingUserId = null;
    shippingUserId = null;
    orderId = null;
    orderIdStored = false;
    isInHeader = false;
    isInItem = false;
    isInShipping = false;
    isInCcilog = false;
    orderAddress = null;
    shippingAddress = null;
    beleg = null;
  }

  /**
   * parse with a given file.
   *
   * @param xmlFile
   * @throws ImportException
   */
  public void parse(File xmlFile) throws ImportException {
    if ((saxParser != null) && (handler != null) && (xmlFile != null)) {
      try {
        clearProperties();
        saxParser.parse(xmlFile, handler);
      } catch (Exception ex) {
        logger.log(Level.SEVERE, "Fehler beim Erzeugen des SaxParsers", ex);
        throw new ImportException("Fehler beim pasren des xml file " + ex.getLocalizedMessage());
      }
    } else {
      throw new IllegalArgumentException("Wrong SaxParser configuration or xmlFile==null");
    }
  }

  /**
   * parse with a given InputStream.
   *
   * @param xmlFile
   * @throws ImportException
   */
  public void parse(InputStream xmlStream) throws ImportException {
    if ((saxParser != null) && (handler != null) && (xmlStream != null)) {
      try {
        clearProperties();
        saxParser.parse(xmlStream, handler);
      } catch (Exception ex) {
        logger.log(Level.SEVERE, "Fehler beim Erzeugen des SaxParsers", ex);
        throw new ImportException("Fehler beim pasren des xml file " + ex.getLocalizedMessage());
      }
    } else {
      throw new IllegalArgumentException("Wrong SaxParser configuration or xmlStream==null");
    }
  }

  /**
   * impl. of the handler for Taopix to Tom
   */
  private class TaopixToTomSaxHandler extends DefaultHandler {

    private StringBuilder charSeq;

    @Override
    public void startDocument() {
    }

    @Override
    public void endDocument() {
    }

    @Override
    public void startElement(String namespaceURI, String sName, String qName, Attributes attrs) {
      charSeq = new StringBuilder();

      if (qName.equalsIgnoreCase("order")) {
        isInHeader = false;
        isInItem = false;
        isInShipping = false;
        isInCcilog = false;
        orderId = null;
        currentUserId = null;
        billingUserId = null;
        shippingUserId = null;
        beleg = null;
        //TODO
//				 importedOrder.setWrg(getStandardWrg());
      }

      if (qName.equalsIgnoreCase("header")) {
        isInHeader = true;
        isInItem = false;
        isInShipping = false;
        isInCcilog = false;
        orderProperties = new HashMap<String, String>();
        userProperties = new HashMap<String, String>();
      } else if (qName.equalsIgnoreCase("item")) {
        isInHeader = false;
        isInItem = true;
        isInShipping = false;
        isInCcilog = false;
        itemProperties = new HashMap<String, String>();
      } else if (qName.equalsIgnoreCase("shipping")) {
        isInHeader = false;
        isInItem = false;
        isInShipping = true;
        isInCcilog = false;
        userProperties = new HashMap<String, String>();
        shippingProperties = new HashMap<String, String>();
      } else if (qName.equalsIgnoreCase("ccilog")) {
        isInHeader = false;
        isInItem = false;
        isInShipping = false;
        isInCcilog = true;
      }

    }

    @Override
    public void endElement(String namespaceURI, String sName, String qName) {
      if ((charSeq.length() > 0) & isInHeader) {

        orderProperties.put(qName, charSeq.toString());

      } else if ((charSeq.length() > 0) & isInItem) {

        itemProperties.put(qName, charSeq.toString());

      } else if ((charSeq.length() > 0) & isInShipping) {

        shippingProperties.put(qName, charSeq.toString());

      }
      /*
       * Tag abfragen und entsprechende Verarbeitunsschritte
       */
      if (qName.equalsIgnoreCase("orderid") & isInHeader) {
        orderId = charSeq.toString();
      } else if (qName.equalsIgnoreCase("userid")) {

        currentUserId = charSeq.toString();
        if (isInHeader) {
          billingUserId = currentUserId;
        } else if (isInShipping) {
          shippingUserId = currentUserId;
        }

      } else if (qName.contains("customer") | qName.contains("contact")) {
        String propertyBez = qName;
        if (qName.startsWith("billing")) {
          propertyBez = qName.substring("billing".length());
        }
        if (qName.startsWith("shipping")) {
          propertyBez = qName.substring("shipping".length());
        }

        userProperties.put(propertyBez, charSeq.toString());
//				System.out.println(qName+" : "+charSeq);
      } /*
       * Die Kopfdaten sind eingelesen
       */ else if (qName.equalsIgnoreCase("header")) {

        if (currentUserId != null) {
          orderAddress = tomObjectMapper.mapAdrFromProperties(userProperties);
        }

      } else if (qName.equalsIgnoreCase("shipping")) {

        if (currentUserId != null) {
          shippingAddress = tomObjectMapper.mapAdrFromProperties(userProperties);
        }

      } else if (qName.equalsIgnoreCase("order")) {
        beleg = tomObjectMapper.mapBelegFromProperties(orderId, orderProperties, itemProperties, shippingProperties);
      }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
      String str = new String(ch, start, length);
      charSeq.append(str);

    }
  }
}
