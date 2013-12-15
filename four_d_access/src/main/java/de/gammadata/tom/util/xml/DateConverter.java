package de.gammadata.tom.util.xml;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gfr
 */
public class DateConverter implements Converter {
  private SimpleDateFormat formatter = new SimpleDateFormat(
      "dd.MM.yyyy");

  @Override
  public boolean canConvert(Class clazz) {
    // This converter is only for Calendar fields.
    if (clazz.getSimpleName().equals(Date.class.getSimpleName())) {
      return true;
    }
    return false;
  }

  @Override
  public void marshal(Object value, HierarchicalStreamWriter writer,
                      MarshallingContext context) {
    Date date = (Date) value;
    String test = formatter.format(date);
    writer.setValue(test);
  }

  @Override
  public Object unmarshal(HierarchicalStreamReader reader,
                          UnmarshallingContext context) {
    Date date = new Date();
    try {
      date =(formatter.parse(reader.getValue()));
    } catch (ParseException e) {
      throw new ConversionException(e.getMessage(), e);
    }
    return date;
  }
  
}
