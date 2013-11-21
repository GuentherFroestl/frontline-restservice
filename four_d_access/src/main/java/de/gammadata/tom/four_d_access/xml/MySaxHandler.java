package de.gammadata.tom.four_d_access.xml;

import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;

public class MySaxHandler extends DefaultHandler
{


public void startDocument()
{
          System.out.println("Parsen startet; Beginn des Dokuments");
  ausgabe("<?xml version='1.0' encoding='iso-8859-1'?>");
 
}
public void endDocument() throws SAXException
{
          System.out.println("Parsen beendet; Ende des Dokuments erreicht");
 
}

public void startElement(String namespaceURI, String sName, String qName, Attributes attrs)
{

 String attributName=new String("");
 String attribute=new String("");
 String tagElement=new String("");
 int i;

 if (attrs.getLength() >=1) 
  {
    for (i = 0; i < attrs.getLength(); i++) 
     {
       attributName = attrs.getQName(i); 
       attribute=attribute+" "+attributName+"='"+attrs.getValue(i)+"'";
     }
    attribute=" "+attribute;
   }

  tagElement="<"+qName+attribute+">";

  ausgabe(tagElement);

}

public void endElement(String namespaceURI, String sName, String qName)
{

  ausgabe("</"+qName+">");

}

public void characters(char[] ch, int start, int length) 

{
 String str = new String(ch, start, length);
 ausgabe(str);

}

public void ausgabe(String s)

{

  //System.out.println(s);

}

public void error(SAXParseException e) throws SAXParseException
{
    throw e;
}



}