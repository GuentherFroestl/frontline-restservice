/*
 * TagNames.java
 *
 * Created on 27. August 2004, 15:48
 */

package de.gammadata.tom.four_d_access.xml;

/**
 *
 * @author  Administrator
 */
public interface TagNames {
    
    // Artikel
    
    static final String tagAuf="<";
    static final String tagZu=">";
    static final String tagAufEnde="</";
     static final String auftragTag="auftrag";
    //Artikel
    static final String artikelTag = "artikel";
    static final String artikelBezTag = "artikelbezeichnung";
     static final String artikelBeschrTag = "artikelbeschreibung";
    static final String artikelHerstellernummerTag = "artikelherstellernummer";
     static final String artikelAnzahlTag = "anzahl";
    static final String artikelPosnummerTag = "number";
     static final String artikelEpreisTag = "epreis";
    static final String artikelGpreisTag = "gpreis";
     static final String poslisteTag = "posliste";
    
    //Position
    static final String positionTag = "position";
    
    //Allgemeines
    static final String allgemeinTag = "allgemein";
    static final String zahlungTag = "zahlung";
    static final String gesamtpreisTag = "gesamtpreis";
     static final String bgesamtpreisTag = "bruttogesamtpreis";
     static final String ngesamtpreisTag = "nettogesamtpreis";
     static final String mwstTag = "mwst";

         //Kopf
     static final String kopfTag = "kopf";
     static final String anredeTag = "anrede";
    static final String datumTag = "datum";
     static final String auftragnummerTag = "nummer";
     static final String bemerkungTag = "bemerkung";
     
     //Adresse
     static final String abadresseTag = "abadresse";
     static final String telefonTag = "tel";
     static final String emailTag = "email";
     static final String emailurlTag = "url";
    
    
    //fuss
    static final String fussTag = "fuss";
    

     

     }
