
/*
 * Merkmale.java
 *
 * automatisch erzeugtes Java-Bean
 * aus der 4D Datenbankstruktur Tabelle Nr.: 20 mit dem Namen "Merkmale"
 *
 * 
 */
 
package de.gammadata.tom.four_d_access.dbBeans;
 
import de.gammadata.tom.four_d_access.xml.*;
import java.sql.*;


/**
 *
 * @author  gfr
 */

 public class Merkmale extends BasicBean
 {
     private boolean printon = true;
     public static final String xmlClassTag = "Merkmale";
     public static final int dbTabNummer = 20;
     public String xmlObjektId = this.getClass().getName();
     
    //generierte Feldnummer-Konstanten

           public static int dID_Fn = 1;
           public static int dL_Fn = 2;
           public static int dEAM_Fn = 3;
           public static int dEVON_Fn = 4;
           public static int dGAM_Fn = 5;
           public static int dMandant_Fn = 6;
           public static int dGVON_Fn = 7;
           public static int dG_Fn = 8;
           public static int dStandort_Fn = 9;
           public static int dDEL_Fn = 10;
           public static int _025_001__MerkmalTabelle_DID_Fn = 11;
           public static int kommentar_Fn = 12;
           public static int _009_001__Adressen_DID_Fn = 13;
           public static int merkmalwert_Fn = 14;
           public static int m_025_011_MerkmalBez_Fn = 15;
           public static int m_009_011_Firmennahme_Fn = 16;
           public static int m_009_014_Nachname_Fn = 17;
           public static int m_025_015_ZielTabelle_Fn = 18;
           public static int merkmaldatum_Fn = 19;
    

    //generierte Feldkonstanten - Ende
    
     
     
    //generierte felder - Anfang
    
    private int dID = 0; 
    private boolean dL = false; 
    private java.sql.Date dEAM = new java.sql.Date(0); 
    private int dEVON = 0; 
    private java.sql.Date dGAM = new java.sql.Date(0); 
    private int dMandant = 0; 
    private int dGVON = 0; 
    private boolean dG = false; 
    private int dStandort = 0; 
    private boolean dDEL = false; 
    private int _025_001__MerkmalTabelle_DID = 0; 
    private java.lang.StringBuilder kommentar = new java.lang.StringBuilder(); 
    private int _009_001__Adressen_DID = 0; 
    private double merkmalwert = 0; 
    private java.lang.String m_025_011_MerkmalBez = ""; 
    private java.lang.String m_009_011_Firmennahme = ""; 
    private java.lang.String m_009_014_Nachname = ""; 
    private int m_025_015_ZielTabelle = 0;

    public java.sql.Date getMerkmaldatum() {
        return merkmaldatum;
    }

    public void setMerkmaldatum(java.sql.Date merkmaldatum) {
        this.merkmaldatum = merkmaldatum;
    }
    private java.sql.Date merkmaldatum = new java.sql.Date(0); 
    //generierte felder - Ende
    
     
     
    //generierte FieldSpec-Liste
    
    private static FieldSpec[] fieldSpecs=
    {
    
           new FieldSpec("dID",1,0,"int",null),
           new FieldSpec("dL",2,0,"boolean",null),
           new FieldSpec("dEAM",3,0,"java.sql.Date",null),
           new FieldSpec("dEVON",4,0,"int",null),
           new FieldSpec("dGAM",5,0,"java.sql.Date",null),
           new FieldSpec("dMandant",6,0,"int",null),
           new FieldSpec("dGVON",7,0,"int",null),
           new FieldSpec("dG",8,0,"boolean",null),
           new FieldSpec("dStandort",9,0,"int",null),
           new FieldSpec("dDEL",10,0,"boolean",null),
           new FieldSpec("_025_001__MerkmalTabelle_DID",11,0,"int",new OneObjectPointer(25,1,"MerkmalTabelle","dID")),
           new FieldSpec("kommentar",12,32768,"java.lang.StringBuilder",null),
           new FieldSpec("_009_001__Adressen_DID",13,0,"int",new OneObjectPointer(9,1,"Adressen","dID")),
           new FieldSpec("merkmalwert",14,0,"double",null),
           new FieldSpec("m_025_011_MerkmalBez",15,40,"java.lang.String",null),
           new FieldSpec("m_009_011_Firmennahme",16,50,"java.lang.String",null),
           new FieldSpec("m_009_014_Nachname",17,40,"java.lang.String",null),
           new FieldSpec("m_025_015_ZielTabelle",18,0,"int",null),
           new FieldSpec("merkmaldatum",19,0,"java.sql.Date",null),
    };
    //generierte Feldkonstanten - Ende
    
     
     public   Merkmale()
    {
        super();
    }
    
     
     
    //generierte getter/setter - Anfang
    
    public void setDID(int inp)
    {
           dID=inp;
    }
    
    public int getDID()
    
    {
           return dID;
    }
    
    public void setDL(boolean inp)
    {
           dL=inp;
    }
    
    public boolean getDL()
    
    {
           return dL;
    }
    
    public void setDEAM(java.sql.Date inp)
    {
           dEAM=inp;
    }
    
    public java.sql.Date getDEAM()
    
    {
           return dEAM;
    }
    
    public void setDEVON(int inp)
    {
           dEVON=inp;
    }
    
    public int getDEVON()
    
    {
           return dEVON;
    }
    
    public void setDGAM(java.sql.Date inp)
    {
           dGAM=inp;
    }
    
    public java.sql.Date getDGAM()
    
    {
           return dGAM;
    }
    
    public void setDMandant(int inp)
    {
           dMandant=inp;
    }
    
    public int getDMandant()
    
    {
           return dMandant;
    }
    
    public void setDGVON(int inp)
    {
           dGVON=inp;
    }
    
    public int getDGVON()
    
    {
           return dGVON;
    }
    
    public void setDG(boolean inp)
    {
           dG=inp;
    }
    
    public boolean getDG()
    
    {
           return dG;
    }
    
    public void setDStandort(int inp)
    {
           dStandort=inp;
    }
    
    public int getDStandort()
    
    {
           return dStandort;
    }
    
    public void setDDEL(boolean inp)
    {
           dDEL=inp;
    }
    
    public boolean getDDEL()
    
    {
           return dDEL;
    }
    
    public void set_025_001__MerkmalTabelle_DID(int inp)
    {
           _025_001__MerkmalTabelle_DID=inp;
    }
    
    public int get_025_001__MerkmalTabelle_DID()
    
    {
           return _025_001__MerkmalTabelle_DID;
    }
    
    public void setKommentar(java.lang.StringBuilder inp)
    {
           kommentar=inp;
    }
    
    public java.lang.StringBuilder getKommentar()
    
    {
           return kommentar;
    }
    
    public void set_009_001__Adressen_DID(int inp)
    {
           _009_001__Adressen_DID=inp;
    }
    
    public int get_009_001__Adressen_DID()
    
    {
           return _009_001__Adressen_DID;
    }
    
    public void setMerkmalwert(double inp)
    {
           merkmalwert=inp;
    }
    
    public double getMerkmalwert()
    
    {
           return merkmalwert;
    }
    
    public void setM_025_011_MerkmalBez(java.lang.String inp)
    {
           m_025_011_MerkmalBez=inp;
    }
    
    public java.lang.String getM_025_011_MerkmalBez()
    
    {
           return m_025_011_MerkmalBez;
    }
    
    public void setM_009_011_Firmennahme(java.lang.String inp)
    {
           m_009_011_Firmennahme=inp;
    }
    
    public java.lang.String getM_009_011_Firmennahme()
    
    {
           return m_009_011_Firmennahme;
    }
    
    public void setM_009_014_Nachname(java.lang.String inp)
    {
           m_009_014_Nachname=inp;
    }
    
    public java.lang.String getM_009_014_Nachname()
    
    {
           return m_009_014_Nachname;
    }
    
    public void setM_025_015_ZielTabelle(int inp)
    {
           m_025_015_ZielTabelle=inp;
    }
    
    public int getM_025_015_ZielTabelle()
    
    {
           return m_025_015_ZielTabelle;
    }
    
    
    //generierte getter/setter - Ende
    
    //Interfaceroutinen
    
     public String getXmlClassTag() 
    {
        return xmlClassTag;
    }
    
    public int getDbTabNummer()
    {
        return dbTabNummer;
    }
    
    public de.gammadata.tom.four_d_access.xml.FieldSpec[] getFieldSpecs()
    {
        return fieldSpecs;
    }
    
    public void setFieldSpecs(de.gammadata.tom.four_d_access.xml.FieldSpec[] inp)
    {
        fieldSpecs=inp;
    }
    
    public int[] getFieldList()
    {
        if (super.getFieldList()!=null) 
        {
            return super.getFieldList();
        }
        else
        {
            int[] fl = new int[fieldSpecs.length];
            for (int i=0;i < fieldSpecs.length;i++)
            {
                fl[i]=i+1; //Alle verfügbaren Feldnummern erzeugen
            }
            
            super.setFieldList(fl);
            return fl;
        }
        
    }
    
 }
 