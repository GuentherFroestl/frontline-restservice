/*
 * LocaleFormatter.java
 *
 * Created on 30. November 2004, 16:33
 */

package de.gammadata.tom.four_d_access.util;

import java.util.*;
import java.text.*;
import java.lang.*;


/**
 *
 * @author  gfr
 */
public class LocaleFormatter {
    
    private Locale locale;
    private NumberFormat numFormat;
    private NumberFormat geldFormat;
    private NumberFormat intFormat;
    private DateFormat dateFormat;


    private DateFormat dateOnlyFormat;
    private DateFormat timeOnlyFormat;
    private String language;


    
    /** Creates a new instance of LocaleFormatter */
    public LocaleFormatter(Locale loc) 
    {
        setLocale(loc);
    }
    
    public void setLocale(Locale loc) 
    {
        this.locale =loc;
        numFormat = NumberFormat.getInstance(loc);
        numFormat.setGroupingUsed(false);
        numFormat.setMinimumFractionDigits(2);
        
        intFormat = NumberFormat.getIntegerInstance(loc);
        intFormat.setGroupingUsed(false);
        
        geldFormat = NumberFormat.getCurrencyInstance(loc);
        
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,loc);
        dateFormat.setLenient(true);
        
        dateOnlyFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, loc);
        dateOnlyFormat.setLenient(true);
        timeOnlyFormat = DateFormat.getTimeInstance(DateFormat.SHORT, loc);
        timeOnlyFormat.setLenient(true);
        
        this.setLanguage(loc.getLanguage());
        
    }
    public Locale getLocale()
    {
        return this.locale;
    }
    
    public String formatNumber(double number)
    {
        return numFormat.format(number);
    }
    public String formatNumber(Number number)
    {
        return numFormat.format(number);
    }
    
    public String formatGeld(double number)
    {
        return geldFormat.format(number);
    }
    
    public String formatInteger(int number)
    {
        return intFormat.format((long)number);
    }
    public String formatInteger(Number number)
    {
        return intFormat.format(number);
    }
    public String formatBoolean(String inp) throws ParseException 
    {
        boolean wert=Boolean.parseBoolean(inp);
        if(this.locale.getCountry().toLowerCase().startsWith("de")) //Deutsch ?
        {
            if(wert)
                return "ja";
            else
                return "nein";
        }
        else
        {
            return Boolean.toString(wert);

        }
    }
    public String formatDate(java.util.GregorianCalendar inp)
    {
        return dateFormat.format(inp.getTime());
    }
    public String formatDate(long inp)
    {
        return dateFormat.format(inp);
    }
    public String formatSqlDate(long inp)
    {
        return dateOnlyFormat.format(inp);
    }
    public String formatSqlDate(java.sql.Date inp)
    {
        return dateOnlyFormat.format(inp.getTime());
    }
    public String formatSqlDate(java.sql.Timestamp inp)
    {
        return dateFormat.format(inp.getTime());
    }
    
    public String formatTime(long inp)
    {
        return timeOnlyFormat.format(inp);
    }
    public String formatSqlTime(java.sql.Time inp)
    {
        return timeOnlyFormat.format(inp.getTime());
    }
    public int parseInt (String inpString) throws ParseException
    {
        return numFormat.parse(inpString).intValue();
    }
    public double parseDouble (String inpString) throws ParseException
    {
        return numFormat.parse(inpString).doubleValue();
    }
    public boolean parseBoolean(String inpString)
    {
        if ((inpString.equalsIgnoreCase("true"))|inpString.equalsIgnoreCase("yes")|inpString.equalsIgnoreCase("ja")|inpString.equalsIgnoreCase("oui"))
            return true;
        else
            return false;             
    }
    public java.sql.Date parseSqlDate(String inpString) throws ParseException
    {
        java.sql.Date sqlDate=new java.sql.Date(dateOnlyFormat.parse(inpString).getTime());
        return sqlDate;
    }
    
    public java.util.Date parseDate(String inpString) throws ParseException
    {
        return dateOnlyFormat.parse(inpString);
    }
    
    public java.sql.Time parseSqlTime(String inpString) throws ParseException
    {
        java.sql.Time sqlTime=new java.sql.Time(timeOnlyFormat.parse(inpString).getTime());
        return sqlTime;
    }
    
    // Getter
    
    public NumberFormat getNumFormat()
    {
        return numFormat;
    }   
    public NumberFormat getIntFormat()
    {
        return intFormat;
    }
    public NumberFormat getGeldFormat()
    {
        return geldFormat;
    }
    public DateFormat getDateFormat()
    {
        return dateFormat;
    }
    public DateFormat getDateOnlyFormat()
    {
        return dateOnlyFormat;
    }
    public DateFormat getTimeOnlyFormat()
    {
        return timeOnlyFormat;
    }
    
    public void setLanguage(String language) {
    this.language = language;
    }
    
    public String getLanguage() {
    return language;
    }
}
