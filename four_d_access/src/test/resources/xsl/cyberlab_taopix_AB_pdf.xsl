<?xml version="1.0" encoding="UTF-8"?>
   <xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" exclude-result-prefixes="fo">
    <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
    <xsl:param name="versionParam" select="'1.0'"/> 

       <xsl:variable name="imagepfad" select="'file:///Z:/Toby/Frontline/cyberlab_Logos_05/'"></xsl:variable>
       <xsl:variable name="logo" select="'cyberlabprintlogotest.tif'" />
       <xsl:variable name="logoklein" select="'cyberlabprintlogo.tif'" />
       <xsl:variable name="footer" select="'cyberlab-footer.tif'" />
       <xsl:variable name="Dokname">Auftragsbestätigung</xsl:variable>
       <xsl:variable name="vermerk">Wir danken für den erhaltenen Auftrag, den wir hiermit bestätigen</xsl:variable>
       <xsl:variable name="space"> <xsl:text xml:space="preserve">&#160;</xsl:text></xsl:variable>
       <xsl:variable name="quadspace"> <xsl:text xml:space="preserve">&#160;&#160;&#160;&#160;</xsl:text></xsl:variable>
       <xsl:decimal-format name="feuro" decimal-separator="," grouping-separator="."/>
       <xsl:variable name="bc_auftrag">$ab$</xsl:variable>
       <xsl:variable name="bc_lieferschein">$ls$</xsl:variable>
       <xsl:variable name="bc_bestellung">$be$</xsl:variable>
       <xsl:variable name="bc_ausrech">$ar$</xsl:variable>
       <xsl:variable name="bc_einrech">$er$</xsl:variable>
       <xsl:variable name="bc_cmd_show">$shw</xsl:variable>
       <xsl:variable name="bc_cmd_gen_ausrech">$mar</xsl:variable>
       <xsl:variable name="bc_cmd_gen_lieferschein">$mls</xsl:variable>
       <xsl:variable name="bc_cmd_auftrag_fertig">$aok</xsl:variable>
       <xsl:variable name="bc_cmd_send_sms">$sms</xsl:variable>


<!-- Content Element Anfang: fo-styles -->
    <xsl:attribute-set name="bodytext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">normal</xsl:attribute>
    </xsl:attribute-set>
       <xsl:attribute-set name="bodytextfett">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">10pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>
       
       <xsl:attribute-set name="bodytextgrey">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">10pt</xsl:attribute>
           <xsl:attribute name="font-weight">normal</xsl:attribute>
           <xsl:attribute name="color">grey</xsl:attribute>
       </xsl:attribute-set>
    
    
       <xsl:attribute-set name="sehrgrosserheader">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">24pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>    
       
       <xsl:attribute-set name="grosserheader">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">14pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>    
       
       <xsl:attribute-set name="mittlererheader">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">12pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>    
       
       <xsl:attribute-set name="headertext">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">10pt</xsl:attribute>
           <xsl:attribute name="font-weight">bold</xsl:attribute>
       </xsl:attribute-set>
    <xsl:attribute-set name="headertext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    
       
       <xsl:attribute-set name="kleinertext">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">8pt</xsl:attribute>
           <xsl:attribute name="font-weight">normal</xsl:attribute>
       </xsl:attribute-set>

              <xsl:attribute-set name="sehrkleinertext">
           <xsl:attribute name="font-family">Arial</xsl:attribute>
           <xsl:attribute name="font-size">7pt</xsl:attribute>
           <xsl:attribute name="font-weight">normal</xsl:attribute>
       </xsl:attribute-set>

    <xsl:attribute-set name="titletext">
        <xsl:attribute name="font-family">Arial</xsl:attribute>
        <xsl:attribute name="font-size">10pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>

    </xsl:attribute-set>

<!-- Content Element Ende: fo-styles -->

<!-- Content Element Anfang: fo-a4-pagemaster -->
       <xsl:template name="pagemaster-A4">
           <fo:layout-master-set>
               
               <fo:simple-page-master master-name="erste" page-height="29.7cm" page-width="21cm" margin-top="5mm" margin-bottom="10mm" margin-left="1mm">
                   <fo:region-body margin-top="75mm" margin-bottom="20mm" region-name="body" margin-left="23.1mm"/>
                   <fo:region-before extent="75mm"  region-name="kopfzeileerst" margin-left="23.1mm"/> 
                   <fo:region-after  extent="12mm" region-name="footer"/> 
               </fo:simple-page-master>
               
               <fo:simple-page-master master-name="rest" page-height="29.7cm" page-width="21cm" margin-top="10mm" margin-bottom="10mm" margin-left="1mm">
                   <fo:region-body margin-top="20mm" margin-bottom="20mm" region-name="body" margin-left="23.1mm"/>
                   <fo:region-before extent="55mm" region-name="kopfzeilerest" margin-left="23.1mm"/>   
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
       <xsl:template match="at.cyberlab.taopix__services.inputobjects.TaopixOrder">   
                    <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <xsl:call-template name="pagemaster-A4"/>
                         <fo:page-sequence master-reference="simpleA4">
                             <fo:static-content flow-name="kopfzeileerst">
                                 <xsl:apply-templates select="." mode="internerAbHeader"/>
                             </fo:static-content>

                             <fo:static-content flow-name="footer">
                                 <fo:block><xsl:call-template name="footer"/> </fo:block>
                             </fo:static-content>
                             <fo:flow flow-name="body">
                                 
                                 <xsl:apply-templates select="." mode="auftragsdaten"/>
<!-- 
                                <fo:block><xsl:call-template name="rowtable"></xsl:call-template></fo:block>
-->
                                 <xsl:apply-templates select="positionsListe"/>

                                 
                </fo:flow>    
            </fo:page-sequence>
                    </fo:root>  
       </xsl:template>
       <xsl:template match="at.cyberlab.taopix__services.inputobjects.TaopixOrder"  mode="internerAbHeader">>

           <fo:block xsl:use-attribute-sets="bodytext" >
               <fo:table width="193.1mm" table-layout="fixed">
                   <fo:table-column column-width="23mm"/>
                   <fo:table-column column-width="200mm"/>

                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell><fo:block> </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block text-align="left" xsl:use-attribute-sets="sehrgrosserheader" white-space-treatment="preserve" word-spacing="8mm">
                               <xsl:value-of select="fullOrderAddress/name"/>
                               <xsl:value-of select="$space"/><xsl:value-of select="$space"/>
                               #<xsl:value-of select="nummer"/>

                               <xsl:if test="orders/object_felder/deliveryoption!='123'"> 
                                   <xsl:value-of select="$space"/><xsl:value-of select="$space"/>Versand!
                               </xsl:if>     
                           </fo:block>
                               <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader"> 
                                   <xsl:value-of select="betreff"/>
                               </fo:block>
                               <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader"  white-space-treatment="preserve" >Auftragsdatum:  <xsl:value-of select="datum"/>
                                   <xsl:value-of select="$quadspace"/>Zahlbetrag:  <xsl:value-of select="$space"/>
                                   <xsl:value-of select="preis/bruttoPreis"/><xsl:value-of select="$space"/> 
                                   <xsl:value-of select="wrg/bezeichnung"/>
                               </fo:block>
                               <fo:block >
                                   <xsl:value-of select="$space"/>
                               </fo:block>
                                   
                               <fo:block  white-space-treatment="preserve">
                                   AB:
                                   <fo:instream-foreign-object>
                                       <barcode:barcode
                                           xmlns:barcode="http://barcode4j.krysalis.org/ns"
                                           message="{$bc_auftrag}{nummer}{$bc_cmd_show}" >
                                           <barcode:code128>
                                               <barcode:height>12mm</barcode:height>
                                               <barcode:module-width>0.3</barcode:module-width>
                                               <barcode:human-readable>
                                                   <barcode:placement>top</barcode:placement>
                                                   <barcode:font-name>font-name:Helvetica</barcode:font-name>
                                                   <barcode:font-size>10pt</barcode:font-size>
                                                   
                                               </barcode:human-readable>
                                               
                                           </barcode:code128>
                                           
                                       </barcode:barcode>
                                   </fo:instream-foreign-object>
                                   <xsl:choose>
                                       <xsl:when test="AusRech">
                                           RECH:
                                           <fo:instream-foreign-object>
                                               <barcode:barcode
                                                   xmlns:barcode="http://barcode4j.krysalis.org/ns"
                                                   message="{$bc_ausrech}{AusRech/object_felder/rechnungsnummer}{$bc_cmd_show}" >
                                                   <barcode:code128>
                                                       <barcode:height>12mm</barcode:height>
                                                       <barcode:module-width>0.3</barcode:module-width>
                                                       <barcode:human-readable>
                                                           <barcode:placement>top</barcode:placement>
                                                           <barcode:font-name>font-name:Helvetica</barcode:font-name>
                                                           <barcode:font-size>10pt</barcode:font-size>
                                                           
                                                       </barcode:human-readable>
                                                       
                                                   </barcode:code128>
                                                   
                                               </barcode:barcode>
                                           </fo:instream-foreign-object>
                                           
                                       </xsl:when>
                                       <xsl:otherwise>
                                           RECH + 
                                           <fo:instream-foreign-object>
                                               <barcode:barcode
                                                   xmlns:barcode="http://barcode4j.krysalis.org/ns"
                                                   message="{$bc_auftrag}{nummer}{$bc_cmd_gen_ausrech}" >
                                                   <barcode:code128>
                                                       <barcode:height>12mm</barcode:height>
                                                       <barcode:module-width>0.3</barcode:module-width>
                                                       <barcode:human-readable>
                                                           <barcode:placement>top</barcode:placement>
                                                           <barcode:font-name>font-name:Helvetica</barcode:font-name>
                                                           <barcode:font-size>10pt</barcode:font-size>
                                                           
                                                       </barcode:human-readable>
                                                       
                                                   </barcode:code128>
                                                   
                                               </barcode:barcode>
                                           </fo:instream-foreign-object>
                                       </xsl:otherwise>
                                   </xsl:choose>
                                   
                                 
                                   
                               </fo:block>
                               <fo:block  white-space-treatment="preserve">
                                   LS+
                                   <fo:instream-foreign-object>
                                       <barcode:barcode
                                           xmlns:barcode="http://barcode4j.krysalis.org/ns"
                                           message="{$bc_auftrag}{nummer}{$bc_cmd_gen_lieferschein}" >
                                           <barcode:code128>
                                               <barcode:height>12mm</barcode:height>
                                               <barcode:module-width>0.3</barcode:module-width>
                                               <barcode:human-readable>
                                                   <barcode:placement>top</barcode:placement>
                                                   <barcode:font-name>font-name:Helvetica</barcode:font-name>
                                                   <barcode:font-size>10pt</barcode:font-size>
                                                   
                                               </barcode:human-readable>
                                               
                                           </barcode:code128>
                                           
                                       </barcode:barcode>
                                   </fo:instream-foreign-object>
                                   SMS >> 
                                   <fo:instream-foreign-object>
                                       <barcode:barcode
                                           xmlns:barcode="http://barcode4j.krysalis.org/ns"
                                           message="{$bc_auftrag}{nummer}{$bc_cmd_send_sms}" >
                                           <barcode:code128>
                                               <barcode:height>12mm</barcode:height>
                                               <barcode:module-width>0.3</barcode:module-width>
                                               <barcode:human-readable>
                                                   <barcode:placement>top</barcode:placement>
                                                   <barcode:font-name>font-name:Helvetica</barcode:font-name>
                                                   <barcode:font-size>10pt</barcode:font-size>
                                                   
                                               </barcode:human-readable>
                                               
                                           </barcode:code128>
                                           
                                       </barcode:barcode>
                                   </fo:instream-foreign-object>
                                   </fo:block>
                               

                           </fo:table-cell>

                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
               
           </fo:block>
       </xsl:template>

       <xsl:template match="fullOrderAddress">
           
           <xsl:call-template name="adresse">
               <xsl:with-param name="vorname"><xsl:value-of select="vorname"/></xsl:with-param>
               <xsl:with-param name="nachname"><xsl:value-of select="name"/></xsl:with-param>
               <xsl:with-param name="firma"><xsl:value-of select="firma"/></xsl:with-param>
               <xsl:with-param name="plz"><xsl:value-of select="plz"/></xsl:with-param>
               <xsl:with-param name="stadt"><xsl:value-of select="stadt"/></xsl:with-param>
               <xsl:with-param name="land"><xsl:value-of select="land/landName"/></xsl:with-param>
               <xsl:with-param name="email"><xsl:value-of select="email"/></xsl:with-param>
               <xsl:with-param name="mobilTelefon"><xsl:value-of select="mobilTelefon"/></xsl:with-param>
           </xsl:call-template>
       </xsl:template>
       
       <xsl:template match="fullShippingAddress">
           <xsl:call-template name="adresse">
               <xsl:with-param name="vorname"><xsl:value-of select="vorname"/></xsl:with-param>
               <xsl:with-param name="nachname"><xsl:value-of select="name"/></xsl:with-param>
               <xsl:with-param name="firma"><xsl:value-of select="firma"/></xsl:with-param>
               <xsl:with-param name="plz"><xsl:value-of select="plz"/></xsl:with-param>
               <xsl:with-param name="stadt"><xsl:value-of select="stadt"/></xsl:with-param>
               <xsl:with-param name="land"><xsl:value-of select="land/landName"/></xsl:with-param>
               <xsl:with-param name="email"><xsl:value-of select="email"/></xsl:with-param>
               <xsl:with-param name="mobilTelefon"><xsl:value-of select="mobilTelefon"/></xsl:with-param>
           </xsl:call-template>
       </xsl:template>
       
       <xsl:template name="adresse">
           <xsl:param name="vorname"></xsl:param>
           <xsl:param name="nachname"></xsl:param>
           <xsl:param name="firma"></xsl:param>
           <xsl:param name="plz"></xsl:param>
           <xsl:param name="stadt"></xsl:param>
           <xsl:param name="land"></xsl:param>
           <xsl:param name="email"></xsl:param>
           <xsl:param name="mobilTelefon"></xsl:param>
           <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$vorname"/>&#160;<xsl:value-of select="$nachname"/>
           </fo:block>
           <xsl:if test="string-length($firma)&gt;0">
               <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$firma"/>
               </fo:block>
           </xsl:if>
           <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$plz"/>&#160;&#160;<xsl:value-of select="$stadt"/>
           </fo:block>
           <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$land"/>
           </fo:block>
           <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$email"/>
           </fo:block>
           <fo:block text-align="left" xsl:use-attribute-sets="mittlererheader">
               <xsl:value-of select="$mobilTelefon"/>
           </fo:block>
           
       </xsl:template>
       
       <xsl:template match="at.cyberlab.taopix__services.inputobjects.TaopixOrder" mode="auftragsdaten">
           <fo:block xsl:use-attribute-sets="bodytext" >
               <fo:table width="193.1mm" table-layout="fixed">
                   <fo:table-column column-width="75mm"/>
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="80mm"/>
                   <fo:table-body>
                       <fo:table-row>
                           <fo:table-cell>
                               <fo:block text-align="left" xsl:use-attribute-sets="sehrkleinertext"> Besteller:</fo:block>
                               <xsl:apply-templates select="fullOrderAddress"/>                            
                           </fo:table-cell>
                           <fo:table-cell>
                               <fo:block></fo:block>
                           </fo:table-cell>
                           <fo:table-cell>
                               <fo:block text-align="left" xsl:use-attribute-sets="sehrkleinertext"> Lieferadresse:</fo:block>                                
                               <xsl:apply-templates select="fullShippingAddress"/>
                           </fo:table-cell>
                       </fo:table-row>
                   </fo:table-body>
               </fo:table>
           </fo:block>
       </xsl:template>
       
       
       
       
       
       <xsl:template match="positionsListe"> 
           <fo:block xsl:use-attribute-sets="bodytext">
               <xsl:value-of select="$space"/>
           </fo:block>
           <fo:block xsl:use-attribute-sets="bodytext">
               <xsl:value-of select="$space"/>
           </fo:block>
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="170mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="95mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   
                   <fo:table-header>
                       <fo:table-row>
                           <fo:table-cell><fo:block color="grey">Nr.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey">Beschreibung  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Stk.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Brutto/EUR  </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-header>
                   <fo:table-body>
                       
                       <xsl:for-each select="com.tom.service.dto.BelegPositionDTO">
                           <fo:table-row>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell >   <fo:block>  <xsl:value-of select="posNummer"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell>
                                  <fo:block>
                                      <xsl:value-of select="bezeichnung"/>
                                  </fo:block>
                                   <fo:block xsl:use-attribute-sets="kleinertext">
                                       <xsl:value-of select="beschreibung"/>
                                   </fo:block>
                                   
                                   
                               </fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"> 
                                   <xsl:value-of select="menge"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell >  <fo:block text-align="right"> <xsl:value-of select="gesamtPreis/bruttoPreis"/><xsl:text>  </xsl:text>        </fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           
                       </xsl:for-each>
                       <fo:table-row>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
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
                               
                              <fo:block>
                                  
                              </fo:block>
                               
                           </fo:table-cell> 
                           <fo:table-cell > 
                               <fo:table table-layout="fixed" width="60mm">
                                   <fo:table-column column-width="30mm"/>
                                   <fo:table-column column-width="10mm"/>
                                   <fo:table-column column-width="20mm"/>
                                   <fo:table-body>
                                       
                                       
                                       <fo:table-row>
                                           <fo:table-cell  number-columns-spanned="2">
                                               <fo:block xsl:use-attribute-sets="sehrkleinertext"> 
                                                   Steuern:  
                                                   [
                                                   <xsl:for-each select="../preis/steuern">
                                                       <xsl:if test="position()&gt;1"> | </xsl:if>
                                                       <xsl:value-of select="com.tom.service.dto.SteuerDTO/steuerArt/steuersatz"/>% 
                                                       <xsl:value-of select="com.tom.service.dto.SteuerDTO/betrag"/>
                                                   </xsl:for-each>
                                                   ]</fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold"  text-align="right" > 
                                                   <xsl:value-of select="../preis/steuerBetrag"/> 
                                                   </fo:block>
                                               </fo:table-cell>
                                       </fo:table-row>
                                       
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">   Gesamtsumme </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">
                                                   <xsl:value-of select="../wrg/bezeichnung"/>
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold" text-align="right" >
                                                   <xsl:value-of select="../preis/bruttoPreis"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
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
       
       
       <xsl:template match="selection" mode="orderrow"> 
           <fo:block xsl:use-attribute-sets="bodytext">
           <fo:table width="170mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="95mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   
                   <fo:table-header>
                       <fo:table-row>
                           <fo:table-cell><fo:block color="grey">Nr.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey">Beschreibung  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Stk.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Brutto/EUR  </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-header>
               <fo:table-body>

                   <xsl:for-each select="orderrow">
                       <fo:table-row>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                       </fo:table-row>
                       <fo:table-row>
                           
                           <fo:table-cell >   <fo:block>  <xsl:value-of select="position()"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                           <fo:table-cell>
                               <xsl:choose>
                                   <xsl:when test="object_felder/code='vk'">
                                       <fo:block > 
                                           Versandkosten
                                       </fo:block>
                                   </xsl:when>
                                   <xsl:when test="object_felder/code='OECREDIT'">
                                       <fo:block > 
                                           ONLINE CREDITS
                                       </fo:block>
                                   </xsl:when>
                                   <xsl:otherwise>
                                       <fo:block > 
                                           
                                           Fotoprint  <xsl:value-of select="object_felder/artikelTxtXml/product"/> <xsl:text>  </xsl:text>
                                           <xsl:value-of select="object_felder/artikelTxtXml/surface"/>
                                       </fo:block>
                                       <xsl:if test="not(contains(object_felder/artikelTxtXml/special,'Manuell'))">
                                           <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> <xsl:value-of select="object_felder/artikelTxtXml/special"/>
                                               <xsl:text>, Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                                               <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                                               <xsl:text>  (Code: </xsl:text>
                                               <xsl:value-of select="object_felder/code"/>)
                                           </fo:block>
                                       </xsl:if>
                                       <xsl:if test="contains(object_felder/artikelTxtXml/special,'Manuell')">
                                           
                                           <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> 
                                               <xsl:text>Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                                               <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                                               <xsl:text>  (Code: </xsl:text>
                                               <xsl:value-of select="object_felder/code"/>)
                                           </fo:block>
                                           <fo:block xsl:use-attribute-sets="mittlererheader">
                                               Manuelle Korrektur !!
                                               
                                           </fo:block>
                                       </xsl:if>
                                   </xsl:otherwise>
                               </xsl:choose>
                               
  <!--                             <xsl:if test="not(object_felder/code='vk')">
                               <fo:block > 
                               
                               Fotoprint  <xsl:value-of select="object_felder/artikelTxtXml/product"/> <xsl:text>  </xsl:text>
                               <xsl:value-of select="object_felder/artikelTxtXml/surface"/>
                           </fo:block>
                               <xsl:if test="not(contains(object_felder/artikelTxtXml/special,'Manuell'))">
                               <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> <xsl:value-of select="object_felder/artikelTxtXml/special"/>
                                   <xsl:text>, Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                               <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                              <xsl:text>  (Code: </xsl:text>
                               <xsl:value-of select="object_felder/code"/>)
                               </fo:block>
                                   </xsl:if>
                               <xsl:if test="contains(object_felder/artikelTxtXml/special,'Manuell')">

                                   <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> 
                                       <xsl:text>Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                                       <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                                       <xsl:text>  (Code: </xsl:text>
                                       <xsl:value-of select="object_felder/code"/>)
                                   </fo:block>
                                   <fo:block xsl:use-attribute-sets="mittlererheader">
                                       Manuelle Korrektur !!
                            
                                   </fo:block>
                               </xsl:if>
                               </xsl:if>
                               <xsl:if test="object_felder/code='vk'">
                                   <fo:block > 
                                       Versandkosten
                                       </fo:block>
                                   </xsl:if>-->
                               
                            </fo:table-cell>
                           <fo:table-cell >   <fo:block text-align="right"> 
                               <xsl:value-of select="object_felder/quantity"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                           <fo:table-cell >  <fo:block text-align="right">  <xsl:value-of select="object_felder/price"/> <xsl:text>  </xsl:text>        </fo:block></fo:table-cell>
                       
                       </fo:table-row>

                    </xsl:for-each>
                   <fo:table-row>
                       <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                       <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                       <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
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
                                               <fo:block xsl:use-attribute-sets="kleinertext">
                                                   Lieferart:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   <xsl:call-template name="lieferart">
                                                       <xsl:with-param name="lieferart" select="/tompage/controllergencontent/pageform/pageobjects/orders/object_felder/deliveryoption"></xsl:with-param>
                                                   </xsl:call-template>                                                   
                                               </fo:block>
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell >
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   Zahlungsart:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" >
                                                   <xsl:choose>
                                                       <xsl:when test="/tompage/controllergencontent/pageform/pageobjects/Kunden">
                                                           <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Kunden/object_felder/m_012_011_Zahlungsbed_KBZ"/>
                                                       </xsl:when>
                                                       <xsl:otherwise>
                                                           
                                                           <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlbed_xml/descendant-or-self::*"/>
                                                           
                                                       </xsl:otherwise>
                                                   </xsl:choose>
                                                   
                                               </fo:block>
                                               
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" ><xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vVermerk2_xml/descendant-or-self::*"/></fo:block>
                                               
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
                               
                           </fo:table-cell> 
                           <fo:table-cell > 
                               <fo:table table-layout="fixed" width="60mm">
                                   <fo:table-column column-width="30mm"/>
                                   <fo:table-column column-width="10mm"/>
                                   <fo:table-column column-width="20mm"/>
                                   <fo:table-body>
                                       
                                       
                                       <fo:table-row>
                                           <fo:table-cell  number-columns-spanned="3">
                                               <fo:block xsl:use-attribute-sets="sehrkleinertext">20% MwSt. enthalten 
                                                   [
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Aufträge/object_felder/betrag_MwSt"/>
                                                   &#160;<xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Aufträge/object_felder/m_005_011__022_WährZeichen"/>
                                                   ]</fo:block>  
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">   Gesamtsumme </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">
                                                   <!-- <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>  -->  
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Aufträge/object_felder/m_005_011__022_WährZeichen"/>
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold" text-align="right" >
                                                   <!--  <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGesamt_brutto"/>  -->  
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Aufträge/object_felder/betrag_Brutto"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       
                                       
                                       <fo:table-row>
                                           
                                           <fo:table-cell number-columns-spanned="3"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                                           
                                       </fo:table-row>
                                       
 <!--                                      <fo:table-row>
                                           <fo:table-cell number-columns-spanned="3">
                                               <fo:block xsl:use-attribute-sets="grosserheader" ><xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlbed"/></fo:block>  
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
 -->
                                       
                                       <xsl:choose>
                                           <xsl:when test="/tompage/controllergencontent/pageform/pageobjects/AusRech/object_felder/bezahlt">
                                               <fo:table-row>
                                                   <fo:table-cell number-columns-spanned="3">
                                                       <fo:block>&#160;</fo:block>
                                                       <fo:block xsl:use-attribute-sets="mittlererheader" >
                                                           Rechnung bezahlt
                                                       </fo:block>  
                                                       <xsl:if test="../../Geldtransfer">
                                                           <fo:block xsl:use-attribute-sets="mittlererheader" >
                                                               <xsl:value-of select="../../Geldtransfer/object_felder/datum"/>, 
                                                               <xsl:value-of select="../../Geldtransfer/object_felder/m_083_011_GeldkontoBezeichnung"/>
                                                           </fo:block>
                                                       </xsl:if>
                                                   </fo:table-cell>
                                                   
                                               </fo:table-row>
                                           </xsl:when>
                                           <xsl:otherwise>
                                               
                                               <fo:table-row>
                                                   <fo:table-cell number-columns-spanned="3">
                                                       <fo:block>&#160;</fo:block>
                                                       <fo:block xsl:use-attribute-sets="mittlererheader" >
                                                           <xsl:choose>
                                                               <xsl:when test="/tompage/controllergencontent/pageform/pageobjects/Kunden">
                                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Kunden/object_felder/m_012_011_Zahlungsbed_KBZ"/>
                                                               </xsl:when>
                                                               <xsl:otherwise>
                                                                   
                                                                   <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlbed_xml/descendant-or-self::*"/>
                                                                   
                                                               </xsl:otherwise>
                                                           </xsl:choose>
                                                       </fo:block>  
                                                   </fo:table-cell>
                                                   
                                               </fo:table-row>
                                           </xsl:otherwise>
                                       </xsl:choose>
                                   </fo:table-body>
                               </fo:table>
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
       
       <xsl:template match="selection" mode="noimport"> 
           <fo:block xsl:use-attribute-sets="bodytext">
               <fo:table width="170mm" border-width="5pt" table-layout="fixed">
                   <fo:table-column column-width="10mm"/>
                   <fo:table-column column-width="95mm"/>
                   <fo:table-column column-width="20mm"/>
                   <fo:table-column column-width="20mm"/>
                   
                   <fo:table-header>
                       <fo:table-row>
                           <fo:table-cell><fo:block color="grey">Nr.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey">Beschreibung  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Stk.  </fo:block></fo:table-cell>
                           <fo:table-cell><fo:block color="grey" text-align="right">Brutto/EUR  </fo:block></fo:table-cell>
                       </fo:table-row>
                   </fo:table-header>
                   <fo:table-body>
                       
                       <xsl:for-each select="orderrow">
                           <fo:table-row>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                               <fo:table-cell  height="2mm"><fo:block> </fo:block></fo:table-cell>
                           </fo:table-row>
                           <fo:table-row>
                               
                               <fo:table-cell >   <fo:block>  <xsl:value-of select="position()"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell>
                                   <xsl:if test="not(object_felder/code='vk')">
                                       <fo:block > 
                                           
                                           Fotoprint  <xsl:value-of select="object_felder/artikelTxtXml/product"/> <xsl:text>  </xsl:text>
                                           <xsl:value-of select="object_felder/artikelTxtXml/surface"/>
                                       </fo:block>
                                       <xsl:if test="not(contains(object_felder/artikelTxtXml/special,'Manuell'))">
                                           <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> <xsl:value-of select="object_felder/artikelTxtXml/special"/>
                                               <xsl:text>, Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                                               <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                                               <xsl:text>  (Code: </xsl:text>
                                               <xsl:value-of select="object_felder/code"/>)
                                           </fo:block>
                                       </xsl:if>
                                       <xsl:if test="contains(object_felder/artikelTxtXml/special,'Manuell')">
                                           
                                           <fo:block linefeed-treatment="preserve"  xsl:use-attribute-sets="kleinertext"> 
                                               <xsl:text>Rand:   </xsl:text> <xsl:value-of select="object_felder/artikelTxtXml/border"/><xsl:text>,  </xsl:text>
                                               <xsl:value-of select="object_felder/artikelTxtXml/crop"/>
                                               <xsl:text>  (Code: </xsl:text>
                                               <xsl:value-of select="object_felder/code"/>)
                                           </fo:block>
                                           <fo:block xsl:use-attribute-sets="mittlererheader">
                                               Manuelle Korrektur !!
                                               
                                           </fo:block>
                                       </xsl:if>
                                   </xsl:if>
                                   <xsl:if test="object_felder/code='vk'">
                                       <fo:block > 
                                           Versandkosten
                                       </fo:block>
                                   </xsl:if>
                                   
                               </fo:table-cell>
                               <fo:table-cell >   <fo:block text-align="right"> 
                                   <xsl:value-of select="object_felder/quantity"/><xsl:text>  </xsl:text></fo:block></fo:table-cell>
                               <fo:table-cell >  <fo:block text-align="right">  <xsl:value-of select="object_felder/price"/> <xsl:text>  </xsl:text>        </fo:block></fo:table-cell>
                               
                           </fo:table-row>
                           
                       </xsl:for-each>
                       <fo:table-row>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
                           <fo:table-cell  height="2mm"><fo:block></fo:block></fo:table-cell>
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
                                               <fo:block xsl:use-attribute-sets="kleinertext">
                                                   Lieferart:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   <xsl:call-template name="lieferart">
                                                       <xsl:with-param name="lieferart" select="/tompage/controllergencontent/pageform/pageobjects/orders/object_felder/deliveryoption"></xsl:with-param>
                                                   </xsl:call-template>
                                                   
                                               </fo:block>
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell >
                                               <fo:block  xsl:use-attribute-sets="kleinertext">
                                                   Zahlungsart:
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" >
                                                   <xsl:choose>
                                                       <xsl:when test="/tompage/controllergencontent/pageform/pageobjects/Kunden">
                                                           <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Kunden/object_felder/m_012_011_Zahlungsbed_KBZ"/>
                                                       </xsl:when>
                                                       <xsl:otherwise>
                                                           
                                                           <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlbed_xml/descendant-or-self::*"/>
                                                           
                                                       </xsl:otherwise>
                                                   </xsl:choose>
                                                   
                                               </fo:block>
                                               <fo:block linefeed-treatment="preserve" xsl:use-attribute-sets="kleinertext" ><xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vVermerk2_xml/descendant-or-self::*"/></fo:block>
                                               
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
                               
                           </fo:table-cell> 
                           <fo:table-cell > 
                               <fo:table table-layout="fixed" width="60mm">
                                   <fo:table-column column-width="30mm"/>
                                   <fo:table-column column-width="10mm"/>
                                   <fo:table-column column-width="20mm"/>
                                   <fo:table-body>
                                       
                                       
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block xsl:use-attribute-sets="sehrkleinertext">20% MwSt. enthalten </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block></fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block  xsl:use-attribute-sets="sehrkleinertext" text-align="right"> 
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGesamt_Mwst"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">   Gesamtsumme </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold" text-align="right" >
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vGesamt_brutto"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block xsl:use-attribute-sets="sehrkleinertext">Credits </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block xsl:use-attribute-sets="kleinertext" >
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                               </fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block  xsl:use-attribute-sets="sehrkleinertext" text-align="right"> 
                                                   - <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vCreditBetrag"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           
                                           <fo:table-cell number-columns-spanned="3"><fo:block text-align="right" border-before-style="solid" border-before-width="0.2mm"></fo:block></fo:table-cell>
                                           
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">Zahlbetrag</fo:block>  
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold">
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vWRG"/>
                                               </fo:block>
                                           </fo:table-cell>
                                           <fo:table-cell>
                                               <fo:block font-weight="bold" text-align="right" >
                                                   <xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlBetrag"/>
                                               </fo:block> 
                                           </fo:table-cell>
                                       </fo:table-row>
                                       <fo:table-row>
                                           <fo:table-cell number-columns-spanned="3">
                                               <fo:block xsl:use-attribute-sets="grosserheader" ><xsl:value-of select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vZahlbed"/></fo:block>  
                                           </fo:table-cell>
                                           
                                       </fo:table-row>
                                       
                                   </fo:table-body>
                               </fo:table>
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
                               Bank: BA-CA | BLZ: 12000 | Konto: 0974 411 66 00 | IBAN: AT54 1100 0097 4411 6600 | BIC: BKAUATWW
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

<xsl:template name="lieferart">
    <xsl:param name="lieferart">123</xsl:param>
    
  
        <!--
            <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vVermerk3_xml/descendant-or-self::*"/>
        -->
        <xsl:choose>
            <xsl:when test="$lieferart='123'">
                Abholung
            </xsl:when>
            <xsl:when test="$lieferart='124'">
                Postversand (1-3 Tage)
            </xsl:when>
            <xsl:when test="$lieferart='126'">
                Postversand an alternative Adresse
            </xsl:when>
                    <xsl:when test="$lieferart='125'">
                        GLS (nächster Arbeitstag) 
            </xsl:when>
            <xsl:when test="$lieferart='127'">
                GLS-Versand an alternative Adresse
            </xsl:when>
            <xsl:when test="$lieferart='128'">
                Wien, per Bote, Empfänger zahlt
            </xsl:when>
            <xsl:otherwise>
                Vesandcode: 
                <xsl:value-of select="$lieferart"/>
            </xsl:otherwise>
        </xsl:choose>  
    
</xsl:template>
       
       <xsl:template name="lieferart_mit_code">
           <xsl:param name="lieferart">123</xsl:param>
           
           
           <!--
               <xsl:apply-templates select="/tompage/controllergencontent/pageform/pageobjects/Pagevars/object_felder/vVermerk3_xml/descendant-or-self::*"/>
           -->
           <xsl:choose>
               <xsl:when test="$lieferart='123'">
                   Abholung [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:when test="$lieferart='124'">
                   Postversand (1-3 Tage) [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:when test="$lieferart='126'">
                   Postversand an alternative Adresse [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:when test="$lieferart='125'">
                   GLS (nächster Arbeitstag) [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:when test="$lieferart='127'">
                   GLS-Versand an alternative Adresse [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:when test="$lieferart='128'">
                   Wien, per Bote, Empfänger zahlt [<xsl:value-of select="$lieferart"/>]
               </xsl:when>
               <xsl:otherwise>
                   Vesandcode: 
                   <xsl:value-of select="$lieferart"/>
               </xsl:otherwise>
           </xsl:choose>  
           
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
               <xsl:otherwise><xsl:value-of select="."/></xsl:otherwise>
           </xsl:choose>
       </xsl:template>
       
       <xsl:template match="text()"><xsl:value-of select="."/></xsl:template>

</xsl:stylesheet>

<!-- Content Element Ende: korrespondenz-fo-tompage  -->

