<?xml version="1.0" encoding="iso-8859-1" ?>
   <xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" exclude-result-prefixes="fo">
    <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
    <xsl:param name="versionParam" select="'1.0'"/>
       
     <xsl:param name="parameter">#brutto_ep</xsl:param>
       <xsl:variable name="mwstmodus_in">
           <xsl:choose>
               <xsl:when test="contains($parameter,'netto')">netto</xsl:when>
               <xsl:otherwise>brutto</xsl:otherwise>
           </xsl:choose>
       </xsl:variable>
       <xsl:variable name="preismodus_in">
           <xsl:choose>
               <xsl:when test="contains($parameter,'_ep')">einzelpreise</xsl:when>
               <xsl:otherwise>gesamtpreise</xsl:otherwise>
           </xsl:choose>
       </xsl:variable>
       
       
      
       <xsl:variable name="formulartyp"><xsl:value-of select="tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vDOKBEZ"/></xsl:variable><!-- angebot rechnung lieferschein bestellung -->
       <xsl:variable name="Dokname"><xsl:value-of select="tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vDOKBEZ"/></xsl:variable>
       <xsl:variable name="Doknummer"><xsl:value-of select="tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vDOKNR"/></xsl:variable>

<!-- Content Element Anfang: fo-styles -->
    <xsl:attribute-set name="bodytext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">normal</xsl:attribute>
    </xsl:attribute-set>
    
    <xsl:attribute-set name="headertext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
       
       <xsl:attribute-set name="mittlererheader">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">12pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>    
       
       <xsl:attribute-set name="grosserheader">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">14pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>    
       
       <xsl:attribute-set name="kleinertext">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">8pt</xsl:attribute>
           <xsl:attribute name="font-weight">normal</xsl:attribute>
       </xsl:attribute-set>
       
       <xsl:attribute-set name="zwischensumme">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">10pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>
       
       <xsl:attribute-set name="gesamtsumme">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">11pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>
       
       <xsl:attribute-set name="anschrift">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">10pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>  
       
       <xsl:attribute-set name="doknummer">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">12pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>  
       
    <xsl:attribute-set name="titletext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>

       <xsl:attribute-set name="sehrkleinertext">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">6pt</xsl:attribute>
           <xsl:attribute name="font-weight">normal</xsl:attribute>
       </xsl:attribute-set>
<!-- Content Element Ende: fo-styles -->

<!-- Content Element Anfang: fo-a4-pagemaster -->
       <xsl:template name="pagemaster-A4">
           <fo:layout-master-set>

               <fo:simple-page-master master-name="erste" page-height="29.7cm" page-width="21cm" margin-top="20mm" margin-bottom="10mm" margin-left="1mm">
                   <fo:region-body margin-top="38mm" margin-bottom="20mm" region-name="body" margin-left="18mm"/>
                   <fo:region-before extent="80mm"  region-name="kopfzeileerst" margin-left="23.1mm"/> 
                   <fo:region-after  extent="12mm" region-name="footer"/> 
               </fo:simple-page-master>
               
               <fo:simple-page-master master-name="rest" page-height="29.7cm" page-width="21cm" margin-top="20mm" margin-bottom="10mm" margin-left="1mm">
                   <fo:region-body margin-top="43mm" margin-bottom="20mm" region-name="body" margin-left="23.1mm"/>
                   <fo:region-before extent="80mm" region-name="kopfzeilerest" margin-left="23.1mm"/>   
                   <fo:region-after  extent="12mm" region-name="footer" /> 
               </fo:simple-page-master>
               
               <fo:page-sequence-master master-name="simpleA4" >
                   <fo:single-page-master-reference master-reference="erste"/>
                   <fo:repeatable-page-master-reference master-reference="rest"/>
               </fo:page-sequence-master>
               
               
           </fo:layout-master-set>       
           
       </xsl:template>

<!-- Content Element Ende: fo-a4-pagemaster -->

<!-- Content Element Anfang: korrespondenz-fo-tompage  -->
       <xsl:template match="tompage">   
                    <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <xsl:call-template name="pagemaster-A4"/>
                         <fo:page-sequence master-reference="simpleA4">
                             
                             <fo:static-content flow-name="kopfzeileerst">
                                 <xsl:apply-templates select="controllergencontent/pageform/pageobjects/Pagevars"/>
                             </fo:static-content>
                             
                                <fo:static-content flow-name="kopfzeilerest">
                                 <xsl:apply-templates select="controllergencontent/pageform/pageobjects/Pagevars" mode="headerrest"/>
                                </fo:static-content>
                             
                             <fo:static-content flow-name="footer">
                                 <fo:block><xsl:call-template name="footer"/> </fo:block>
                             </fo:static-content>
                             
                             <fo:flow flow-name="body">
                           <!--      <fo:block>Parameter: <xsl:value-of select="$parameter"/></fo:block>-->
                                 <xsl:apply-templates select="controllergencontent/pageform/pageobjects/Pagevars" mode="betreff"/>
                                <fo:block><xsl:call-template name="rowtable"></xsl:call-template></fo:block>
                                 <xsl:choose>
                                     <xsl:when test="$preismodus_in='einzelpreise'">
                                         <xsl:apply-templates select="controllergencontent/pageform/pageobjects/belegposliste/selection" mode="belegpos_ep">
                                             <xsl:with-param name="mwstmodus"><xsl:value-of select="$mwstmodus_in"/></xsl:with-param>
                                         </xsl:apply-templates>
                                     </xsl:when>
                                     <xsl:otherwise>
                                         <xsl:apply-templates select="controllergencontent/pageform/pageobjects/belegposliste/selection" mode="belegpos_gp">
                                             <xsl:with-param name="mwstmodus"><xsl:value-of select="$mwstmodus_in"/></xsl:with-param>
                                         </xsl:apply-templates>
                                     </xsl:otherwise>
                                 </xsl:choose>
                                 
                                 
                                 
                                 <fo:block>
                                     <xsl:apply-templates select="controllergencontent/pageform/pageobjects/Pagevars" mode="abspann"/>
                                 </fo:block>
                                 
                                 
                </fo:flow>    
            </fo:page-sequence>
                    </fo:root>  
       </xsl:template>
       
       
       <xsl:template match="Pagevars" mode="headerrest">
           <fo:block xsl:use-attribute-sets="bodytext" >
               <fo:table width="193.1mm" table-layout="fixed">
                   <fo:table-column column-width="143.1mm"/>
                   <fo:table-column column-width="50mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell><fo:block> 
                               <fo:inline font-family="Trebuchet" font-size="17pt" font-weight="bold" color="#3B5F80" letter-spacing="-0.5mm">cyber</fo:inline>
                               <fo:inline font-family="Trebuchet" font-size="17pt" font-weight="bold" color="#F0A62C" letter-spacing="-0.5mm">lab</fo:inline>
                               <fo:inline font-family="Trebuchet" font-size="17pt" font-weight="bold" color="#3B5F80" letter-spacing="-0.5mm">.at</fo:inline>
                               <!-- <fo:external-graphic src="url({$imagepfad}{$logo})"/> -->
                           </fo:block>
                               <fo:block font-family="Trebuchet" font-size="8.25pt" font-weight="normal" color="#000000" letter-spacing="0.1mm">Das Hi-Tech Fotolabor</fo:block>
                           </fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell height="5mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell height="5mm"><fo:block></fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell>
                               <fo:block  xsl:use-attribute-sets="kleinertext">   
                                   
                                   <fo:table width="70mm" border-width="5pt" table-layout="fixed">
                                       <fo:table-column column-width="30mm"/>
                                       <fo:table-column column-width="50mm"/>
                                       <fo:table-body>
                                           
                                           <fo:table-row>   
                                               <fo:table-cell ><fo:block>Kontakt bei Cyberlab:<xsl:text>  </xsl:text>
                                               </fo:block>     
                                               </fo:table-cell>
                                               <fo:table-cell ><fo:block  linefeed-treatment="preserve"> <xsl:apply-templates select="object_felder/vMAVBSIG_XML/descendant-or-self::*"/></fo:block>
                                                   <fo:block linefeed-treatment="preserve">
                                                       <xsl:apply-templates select="object_felder/vMAVBTXT_XML/descendant-or-self::*"/>
                                                   </fo:block>
                                               </fo:table-cell>
                                           </fo:table-row>
                                           
                                           <fo:table-row>
                                               <fo:table-cell>   <fo:block> &#160; </fo:block>
                                                   <fo:block></fo:block></fo:table-cell>
                                               <fo:table-cell> <fo:block>  </fo:block><fo:block></fo:block>
                                               </fo:table-cell>
                                           </fo:table-row>
                                           <fo:table-row>
                                               <fo:table-cell ><fo:block><xsl:value-of select="$Dokname"/>: 
                                                   <xsl:text>  </xsl:text> </fo:block></fo:table-cell>
                                               <fo:table-cell >
                                                   <fo:block>   
                                                       <xsl:value-of select="$Doknummer"/>
                                                   </fo:block>
                                               </fo:table-cell>
                                           </fo:table-row>
                                           <fo:table-row>
                                               <fo:table-cell>   <fo:block>
                                                   Datum:
                                               </fo:block></fo:table-cell>
                                               <fo:table-cell><fo:block> <xsl:value-of select="object_felder/vDOKDATUMD"/></fo:block></fo:table-cell>
                                           </fo:table-row>
                                           <fo:table-row>   
                                               <fo:table-cell ><fo:block> Seite: <xsl:text>  </xsl:text></fo:block></fo:table-cell>
                                               <fo:table-cell><fo:block><fo:page-number></fo:page-number></fo:block></fo:table-cell>
                                           </fo:table-row>
                                       </fo:table-body>
                                   </fo:table>
                               </fo:block>
                           
                           </fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       
       <xsl:template name="rowtable">
           <fo:block xsl:use-attribute-sets="titletext">
               <fo:table width="170mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="40mm"/>
                   <fo:table-column column-width="70mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell height="5mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell height="5mm"><fo:block></fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       <xsl:template match="Pagevars">
           <fo:block xsl:use-attribute-sets="bodytext" >
               <fo:table width="193.1mm" table-layout="fixed">
                   <fo:table-column column-width="123.1mm"/>
                   <fo:table-column column-width="70mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell><fo:block> 
                               <fo:inline font-family="Trebuchet" font-size="34pt" font-weight="bold" color="#3B5F80" letter-spacing="-0.5mm">cyber</fo:inline>
                               <fo:inline font-family="Trebuchet" font-size="34pt" font-weight="bold" color="#F0A62C" letter-spacing="-0.5mm">lab</fo:inline>
                               <fo:inline font-family="Trebuchet" font-size="34pt" font-weight="bold" color="#3B5F80" letter-spacing="-0.5mm">.at</fo:inline>
                               <!-- <fo:external-graphic src="url({$imagepfad}{$logo})"/> -->
                           </fo:block>
                               <fo:block font-family="Trebuchet" font-size="16.5pt" font-weight="normal" color="#000000" letter-spacing="0.1mm">Das Hi-Tech Fotolabor</fo:block>
                           </fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       
       <xsl:template match="Pagevars" mode="abspann">
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="180mm" table-layout="fixed">
                   <fo:table-column column-width="150mm"/>
                   <fo:table-column column-width="75mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell>
                               <fo:block  xsl:use-attribute-sets="bodytext" linefeed-treatment="preserve"><xsl:apply-templates select="object_felder/vVERMERK2_XML/descendant-or-self::*"/> </fo:block>
                               <!-- 
                               <fo:block  xsl:use-attribute-sets="bodytext"  linefeed-treatment="preserve"><xsl:apply-templates select="object_felder/vMAVBSIG_XML/descendant-or-self::*"/></fo:block>
                               -->
                           </fo:table-cell>
                           <fo:table-cell>
                               <fo:block  xsl:use-attribute-sets="bodytext">
                               </fo:block>
                           </fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
           </xsl:template>
       
       <xsl:template match="Pagevars" mode="betreff">
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="190mm" table-layout="fixed">
                   <fo:table-column column-width="105mm"/>
                   <fo:table-column column-width="85mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell><fo:block font-family="Arial" font-style="normal" font-weight="100" font-size="6pt">
                               <xsl:value-of select="object_felder/vTEXTFENSTER"/>
                           </fo:block > 
                               <fo:block>
                                   <fo:table table-layout="fixed" width="90mm">
                                       <fo:table-column column-width="90mm"/>
                                       <fo:table-body>
                                           <fo:table-row>
                                               <fo:table-cell> 
                                                   <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="anschrift"><xsl:apply-templates select="object_felder/vLABELADR1_XML/descendant-or-self::*"/></fo:block > </fo:table-cell> 
                                           </fo:table-row> 
                                       </fo:table-body>
                                   </fo:table>
                               </fo:block>
                           </fo:table-cell>
                           <fo:table-cell>
                               <fo:block  xsl:use-attribute-sets="kleinertext">   
                                   
                               <fo:table width="70mm" border-width="5pt" table-layout="fixed">
                                   <fo:table-column column-width="30mm"/>
                                   <fo:table-column column-width="50mm"/>
                                   <fo:table-body>
                                       
                                       <fo:table-row>   
                                           <fo:table-cell ><fo:block>Kontakt bei Cyberlab:<xsl:text>  </xsl:text>
                                           </fo:block>     
                                           </fo:table-cell>
                                           <fo:table-cell ><fo:block  linefeed-treatment="preserve">   <xsl:apply-templates select="object_felder/vMAVBSIG_XML/descendant-or-self::*"/></fo:block>
                                               <fo:block linefeed-treatment="preserve">
                                                   <xsl:apply-templates select="object_felder/vMAVBTXT_XML/descendant-or-self::*"/>
                                               </fo:block>
                                           </fo:table-cell>
                                       </fo:table-row>
                                      
                                       <fo:table-row>
                                           <fo:table-cell>   <fo:block> &#160; </fo:block>
                                               <fo:block></fo:block></fo:table-cell>
                                           <fo:table-cell> <fo:block>  </fo:block><fo:block></fo:block>
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell ><fo:block><xsl:value-of select="$Dokname"/>: 
                                               <xsl:text>  </xsl:text> </fo:block></fo:table-cell>
                                           <fo:table-cell >
                                               <fo:block>   
                                                   <xsl:value-of select="$Doknummer"/>
                                               </fo:block>
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell>   <fo:block>
                                               Datum:
                                           </fo:block></fo:table-cell>
                                           <fo:table-cell><fo:block> <xsl:value-of select="object_felder/vDOKDATUMD"/></fo:block></fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>   
                                           <fo:table-cell ><fo:block> Seite: <xsl:text>  </xsl:text></fo:block></fo:table-cell>
                                           <fo:table-cell><fo:block><fo:page-number></fo:page-number></fo:block></fo:table-cell>
                                       </fo:table-row>
                                   </fo:table-body>
                               </fo:table>
                           </fo:block>
                           </fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
               <fo:table width="170mm"  table-layout="fixed">
                   <fo:table-column column-width="130mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-body>
                       <xsl:if test="string-length(object_felder/vJOBNR)&gt;0">
                           <fo:table-row>
                               <fo:table-cell ><fo:block>     
                                   Projekt:  <xsl:text>  </xsl:text>
                                   <xsl:value-of select="object_felder/vJOBKBZ"/>
                               </fo:block></fo:table-cell>
                               <fo:table-cell ><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell ><fo:block> 
                               </fo:block></fo:table-cell>
                           </fo:table-row>
                           <fo:table-row>
                               <fo:table-cell ><fo:block>   
                                   Projektnr.:  <xsl:text>  </xsl:text>
                                   <xsl:value-of select="object_felder/vJOBNR"/>
                               </fo:block></fo:table-cell>
                               <fo:table-cell ><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell ><fo:block> 
                               </fo:block></fo:table-cell>
                           </fo:table-row>
                       </xsl:if>
                       <fo:table-row>
                           <fo:table-cell  height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="5mm"><fo:block></fo:block></fo:table-cell>
                           
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell ><fo:block   xsl:use-attribute-sets="doknummer">  
                               <xsl:value-of select="$Dokname"/>&#160; &#160; <xsl:value-of select="$Doknummer"/></fo:block>
                               <fo:block>
                                   <xsl:value-of select="object_felder/vBETREFF"/>
                               </fo:block>
                               
                           </fo:table-cell>
                           <fo:table-cell ><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell ><fo:block> 
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           
                           <fo:table-cell  height="5mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="5mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell  height="5mm"><fo:block> </fo:block></fo:table-cell>
                           
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell >
                               <xsl:if test="string-length(object_felder/vVERMERK1)&gt;1">
                                   <fo:block xsl:use-attribute-sets="bodytext">
                                       <xsl:value-of select="object_felder/vANREDE"/>
                                   </fo:block>
                                   <fo:block>
                                       &#160; 
                                   </fo:block>
                               </xsl:if>
                               <fo:block xsl:use-attribute-sets="bodytext">
                                   <xsl:value-of select="object_felder/vVERMERK1"/>
                               </fo:block>
                               
                           </fo:table-cell>
                           <fo:table-cell ><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell ><fo:block> 
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       <xsl:template match="selection" mode="belegpos_ep"> 
           <xsl:param name="mwstmodus">brutto</xsl:param>
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="190mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="85mm"/>
                   <fo:table-column column-width="15mm"/>
                   <fo:table-column column-width="15mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   
                   <fo:table-header>
                       <fo:table-row>
                           <fo:table-cell><fo:block color="grey">Nr.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey">Beschreibung  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Menge  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right" >MwSt </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">
                               <xsl:choose>
                                   <xsl:when test="$mwstmodus='netto'">EP-Netto </xsl:when>
                                   <xsl:otherwise>EP-Brutto </xsl:otherwise>
                               </xsl:choose>
                           </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">
                               <xsl:choose>
                               <xsl:when test="$mwstmodus='netto'">GP-Netto </xsl:when>
                               <xsl:otherwise>GP-Brutto </xsl:otherwise>
                               </xsl:choose></fo:block></fo:table-cell>
                          
                       </fo:table-row>
                   </fo:table-header>
                   <fo:table-body>
                       
                       <xsl:for-each select="Belegpos">
                           <fo:table-row>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell >   <fo:block> 
                                   <xsl:value-of select="object_felder/posnr"/>
                                   <xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell>
                                   <fo:block>
                                       <xsl:value-of select="object_felder/posbez"/>
                                   </fo:block>
                                   <fo:block xsl:use-attribute-sets="kleinertext" linefeed-treatment="preserve"><xsl:apply-templates select="object_felder/postext_xml/descendant-or-self::*"/></fo:block>
                               </fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"> 
                                   <xsl:value-of select="object_felder/menge"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"  color="grey" > 
                                   <xsl:value-of select="object_felder/mwst_satz"/>%<xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell >
                                   <fo:block text-align="right"> 
                                   <xsl:choose>
                                       <xsl:when test="$mwstmodus='netto'"><xsl:value-of select="object_felder/ep_netto"/></xsl:when>
                                       <xsl:otherwise><xsl:value-of select="object_felder/ep_brutto"/></xsl:otherwise>
                                   </xsl:choose>
                                   <xsl:text>  </xsl:text>
                                   </fo:block>
                               </fo:table-cell>
                               <fo:table-cell >  <fo:block text-align="right">
                                   <xsl:choose>
                                       <xsl:when test="$mwstmodus='netto'"><xsl:value-of select="object_felder/gp_netto"/></xsl:when>
                                       <xsl:otherwise><xsl:value-of select="object_felder/gp_brutto"/></xsl:otherwise>
                                   </xsl:choose>
                                   <xsl:text>  </xsl:text>
     
                               </fo:block></fo:table-cell>
                               
                               
                           </fo:table-row>
                           
                       </xsl:for-each>
                       <fo:table-row>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                       </fo:table-row>
                       
                       
                   </fo:table-body>
               </fo:table>
               
               <fo:table table-layout="fixed" width="200mm">
                   <fo:table-column column-width="105mm"/>
                   <fo:table-column column-width="60mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                           
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell> 
                               
                               <fo:table table-layout="fixed" width="80mm">
                                   <fo:table-column column-width="20mm"/>
                                   <fo:table-column column-width="60mm"/>
                                   <fo:table-body>
                                       
                                       
                                       <fo:table-row>
                                           <fo:table-cell >
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   Zahlungsbed.:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" >
                                                   <xsl:value-of select="../../Pagevars/object_felder/vZAHLBEDTXT"/>
                                               </fo:block>
                                               
                                               
                                               
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
                               
                           </fo:table-cell> 
                           <fo:table-cell > 
                               
                               <xsl:call-template name="gesamtsummen">
                                   <xsl:with-param name="mwstmodus"><xsl:value-of select="$mwstmodus"/></xsl:with-param>
                               </xsl:call-template>
                         
                           </fo:table-cell>
                       </fo:table-row>
                       
                   </fo:table-body>
               </fo:table>
           </fo:block>
           <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="bodytext" >
               <xsl:text xml:space="preserve">
               </xsl:text>
               
           </fo:block>
           
       </xsl:template>
       
       
       <xsl:template match="selection" mode="belegpos_gp"> 
           <xsl:param name="mwstmodus">brutto</xsl:param>
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="190mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="100mm"/>
                   <fo:table-column column-width="15mm"/>                
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="15mm"/>
                   
                   <fo:table-header>
                       <fo:table-row>
                           <fo:table-cell><fo:block color="grey">Nr.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey">Beschreibung  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Menge  </fo:block></fo:table-cell>
                        
                           <fo:table-cell><fo:block color="grey" text-align="right">
                              
                               <xsl:choose>
                                   <xsl:when test="$mwstmodus='netto'">GP-Netto </xsl:when>
                                   <xsl:otherwise>GP-Brutto </xsl:otherwise>
                               </xsl:choose>
                           </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right" >MwSt </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-header>
                   <fo:table-body>
                       
                       <xsl:for-each select="Belegpos">
                           <fo:table-row>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                         
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell >   <fo:block> 
                                   <xsl:value-of select="object_felder/posnr"/>
                                   <xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell>
                                   <fo:block>
                                       <xsl:value-of select="object_felder/posbez"/>
                                   </fo:block>
                                   <fo:block xsl:use-attribute-sets="kleinertext" linefeed-treatment="preserve"><xsl:apply-templates select="object_felder/postext_xml/descendant-or-self::*"/></fo:block>
                                   
                                   
                                   
                               </fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"> 
                                   <xsl:value-of select="object_felder/menge"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                        
                               <fo:table-cell >  <fo:block text-align="right"><xsl:choose>
                                   <xsl:when test="$mwstmodus='netto'"><xsl:value-of select="object_felder/gp_netto"/></xsl:when>
                                   <xsl:otherwise><xsl:value-of select="object_felder/gp_brutto"/></xsl:otherwise>
                               </xsl:choose><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"  color="grey" > 
                                   <xsl:value-of select="object_felder/mwst_satz"/>%<xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           
                       </xsl:for-each>
                       <fo:table-row>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                      
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                       </fo:table-row>
                       
                       
                   </fo:table-body>
               </fo:table>
               
               <fo:table table-layout="fixed" width="170mm">
                   <fo:table-column column-width="85mm"/>
                   <fo:table-column column-width="60mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                           
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell> 
                               
                               <fo:table table-layout="fixed" width="80mm">
                                   <fo:table-column column-width="20mm"/>
                                   <fo:table-column column-width="60mm"/>
                                   <fo:table-body>

                                       
                                       <fo:table-row>
                                           <fo:table-cell >
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   Zahlungsbed.:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" >
                                                   <xsl:value-of select="../../Pagevars/object_felder/vZAHLBEDTXT"/>
                                               </fo:block>
                                               
                                   
                                               
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
                               
                           </fo:table-cell> 
                           <fo:table-cell > 
                               

                               <xsl:call-template name="gesamtsummen">
                                   <xsl:with-param name="mwstmodus"><xsl:value-of select="$mwstmodus"/></xsl:with-param>
                               </xsl:call-template>
                               
                           </fo:table-cell>
                       </fo:table-row>

                   </fo:table-body>
               </fo:table>
           </fo:block>
           <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="bodytext" >
               <xsl:text xml:space="preserve">
               </xsl:text>
               
           </fo:block>
           
       </xsl:template>
       
       
       <xsl:template name="gesamtsummen">
           <xsl:param name="mwstmodus"><xsl:value-of select="$mwstmodus_in"/></xsl:param>
           <xsl:param name="preismodus"><xsl:value-of select="$preismodus_in"/></xsl:param>
           
           <xsl:choose>                            
               <xsl:when test="$mwstmodus='netto'">
                   
                   <fo:table table-layout="fixed" width="60mm">
                       <fo:table-column column-width="33mm"/>
                       <fo:table-column column-width="7mm"/>
                       <fo:table-column column-width="20mm"/>
                       <fo:table-body>
                           
                           <fo:table-row>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="zwischensumme">Nettosumme</fo:block>  
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block >
                                       
                                   </fo:block>
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="zwischensumme" text-align="right" >
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGESAMT_NETTO"/>
                                   </fo:block> 
                               </fo:table-cell>
                           </fo:table-row>
                           
                           <fo:table-row>
                               <fo:table-cell   number-columns-spanned="3" >
                                   
                                   <fo:block linefeed-treatment="preserve"  text-align="right" xsl:use-attribute-sets="kleinertext">
                                       <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vSTEUERNETTOTXT_XML/descendant-or-self::*"/>
                                   </fo:block>
                               </fo:table-cell>
                           
                          </fo:table-row>
                           <!--
                           <fo:table-row>
                               <fo:table-cell   number-columns-spanned="2" >
                                   <fo:block xsl:use-attribute-sets="kleinertext">zzgl. MwSt. </fo:block>  
                               </fo:table-cell>
                           
                               <fo:table-cell>
                                   <fo:block font-weight="bold" text-align="right" >
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGESAMT_MWST"/>
                                   </fo:block> 
                               </fo:table-cell>
                           </fo:table-row>
                           -->
                           <fo:table-row>
                               
                               <fo:table-cell number-columns-spanned="3"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell number-columns-spanned="3" height="4mm"><fo:block text-align="right" > </fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           <fo:table-row>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="gesamtsumme">Gesamtbetrag </fo:block>  
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="gesamtsumme">
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                   </fo:block>
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="gesamtsumme"   text-align="right" >
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGESAMT_BRUTTO"/>
                                   </fo:block> 
                               </fo:table-cell>
                           </fo:table-row>
                           
                           
                           
                         
 
                       </fo:table-body>
                   </fo:table>
               </xsl:when>
               <xsl:otherwise>
                   
                   
                   <fo:table table-layout="fixed" width="60mm">
                       <fo:table-column column-width="30mm"/>
                       <fo:table-column column-width="10mm"/>
                       <fo:table-column column-width="20mm"/>
                       <fo:table-body>
                           
       
                           
                           
                           <fo:table-row>
                               <fo:table-cell>
                                   <fo:block  xsl:use-attribute-sets="gesamtsumme" >   Gesamtbetrag </fo:block>  
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block   xsl:use-attribute-sets="gesamtsumme"   text-align="right" >
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                   </fo:block>
                               </fo:table-cell>
                               <fo:table-cell>
                                   <fo:block   xsl:use-attribute-sets="gesamtsumme"  text-align="right" >
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGESAMT_BRUTTO"/>
                                   </fo:block> 
                               </fo:table-cell>
                           </fo:table-row>
                           
                           
                           <fo:table-row>
                               
                               <fo:table-cell number-columns-spanned="3"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell number-columns-spanned="3" height="4mm"><fo:block text-align="right" > </fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           <xsl:if test="/tompage/controllergencontent/pageform/pageobjects/AusRech">
                              
                           
                           <fo:table-row>
                               <fo:table-cell  number-columns-spanned="3">
                              
                                   <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext"  text-align="right" >
                                       <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vSTEUERTXT_XML/descendant-or-self::*"/>
                                   </fo:block>
                               </fo:table-cell>
                               
                           </fo:table-row>
                           
                           <fo:table-row>
                               <fo:table-cell  number-columns-spanned="3">
                                   <fo:block xsl:use-attribute-sets="kleinertext"  text-align="right" >
                                       Betrag enthält insgesamt MwSt. &#160;<xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                       &#160; &#160;
                                       <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGESAMT_MWST"/>
                                       
                                   </fo:block>  
                               </fo:table-cell>
                               
                           </fo:table-row>
                               
                               </xsl:if>
                       </fo:table-body>
                   </fo:table>
               </xsl:otherwise>
           </xsl:choose>
           
       </xsl:template>
       
    
    <xsl:template match="text">
        <xsl:apply-templates/>
    </xsl:template>
       
       <xsl:template name="footer">
           <fo:block xsl:use-attribute-sets="titletext">
               <fo:table width="185mm" table-layout="fixed">
                   <fo:table-column column-width="185mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell ><fo:block text-indent="14.1mm" font-family="Tabula" font-size="10pt" font-weight="normal" color="#3B5F80" letter-spacing="0.1mm">
                             cyberlab digitale entwicklungen gmbh | www.cyberlab.at
                               <!-- <fo:external-graphic src="url({$imagepfad}{$footer})"/> --> 
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell ><fo:block text-indent="14.1mm" font-family="Tabula" font-size="10pt" font-weight="normal" color="#F0A62C" letter-spacing="0.1mm" border-before-style="solid" border-before-width="0.1mm" border-before-color="grey">               
                               A-1070 Wien | Schottenfeldgasse 51 | T: (+43-1) 522 400 400 | F: (+43-1) 522 400 499
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell ><fo:block text-indent="14.1mm" font-family="Tabula" font-size="10pt" font-weight="normal" color="#3B5F80" letter-spacing="0.1mm">
                               Bank: BA-CA | BLZ 12000 | Konto: 0974 411 66 00 | IBAN: AT54 1100 0097 4411 6600 | BIC: BKAUATWW
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           <fo:table-cell ><fo:block text-indent="14.1mm" font-family="Tabula" font-size="10pt" font-weight="normal" color="#F0A62C" letter-spacing="0.1mm" border-before-style="solid" border-before-width="0.1mm" border-before-color="grey">
                               Handelsgericht Wien FN 186784h | UID: ATU 48588005
                           </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       <xsl:template match="br">
               <xsl:text xml:space="preserve">
               </xsl:text>
       </xsl:template>
       
       <xsl:template name="br">
               <xsl:text xml:space="preserve">
               </xsl:text>
       </xsl:template>
       
       <xsl:template match="*">
           <xsl:choose>
               <xsl:when test="."><xsl:apply-templates/></xsl:when>
               <xsl:otherwise>                           <xsl:value-of select="."/>
          </xsl:otherwise>
           </xsl:choose>
       </xsl:template>
       
       <xsl:template match="text()">
               <xsl:value-of select="."/>
       </xsl:template>

</xsl:stylesheet>


