package at.cyberlab.taopix_services.imports;
import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import de.gammadata.business.modelle.AuftragDO;
import de.gammadata.business.modelle.SteuerDO;
import de.gammadata.business.modelle.WrgDO;
import de.gammadata.sync.BelegSyncDO;
import de.gammadata.sync.KontaktSyncDO;
import java.util.logging.Logger;

/**
 * @author gfr
 *Handler zum Parsen des vom Taopix erzeugten xml-Files für Fotobücher
 */
public class TaopixXmlParser{
	
	SAXParserFactory factory;
	SAXParser saxParser;
	TaopixSaxHandler handler;
	TaopixKontaktImporter kontaktImporter;
	TaopixBelegImporter belegImporter;


	static final Logger logger = Logger.getLogger(TaopixXmlParser.class.getSimpleName());
	
    /*
     * Objecte für die Speicherung der Input Objekte
     */

	HashMap<String,String> userProperties;
	HashMap<String,String> orderProperties;
	HashMap<String,String> itemProperties;
	HashMap<String,String> shippingProperties;
    String currentUserId;
    String billingUserId;
    String shippingUserId;
    String orderId;
    boolean orderIdStored;
    boolean isInHeader = false;
    boolean isInItem = false;
    boolean isInShipping = false;
    boolean isInCcilog = false;
    AuftragDO importedOrder;
    WrgDO standardWrg;
	List<SteuerDO> steuerListe;
	
	public AuftragDO getImportedOrder() {
		return importedOrder;
	}


	public TaopixXmlParser() {
		init();
		
	}
	
	boolean init(){
		try {
			factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
			handler = new TaopixSaxHandler();

			return true;
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean parse(File xmlFile){
		if ((saxParser!=null)&&(handler!=null)&&(xmlFile!=null)){
			try {
				orderId=null;
				currentUserId=null;				
				userProperties = null;
				orderProperties=null;
				itemProperties=null;
				importedOrder=null;
			   
				saxParser.parse(xmlFile, handler);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return false;
		
	}
	
	
	private class TaopixSaxHandler extends DefaultHandler {
	
		private StringBuilder charSeq;
	
		/**
		 * 
		 */
	
		@Override
	    public void startDocument() 
	    {
			 
			
	    }
		
		@Override
		public void endDocument()  {
	
		}
		
		@Override
		public void startElement(String namespaceURI, String sName, String qName, Attributes attrs)
	    {
			charSeq = new StringBuilder();
			
			if (qName.equalsIgnoreCase("order")){
				 isInHeader = false;
				 isInItem = false;
				 isInShipping = false;
				 isInCcilog = false;
				 orderId=null;
				 currentUserId=null;
				 billingUserId=null;
				 shippingUserId=null;
				 importedOrder = new AuftragDO();
				 importedOrder.setWrg(getStandardWrg());
			}
			
			if (qName.equalsIgnoreCase("header")){
				isInHeader = true;
			    isInItem = false;
			    isInShipping = false;
			    isInCcilog = false;	
			    orderProperties = new HashMap<String,String>();
			    userProperties = new HashMap<String,String>();
			}
			else if (qName.equalsIgnoreCase("item")){
				isInHeader = false;
			    isInItem = true;
			    isInShipping = false;
			    isInCcilog = false;	
			    itemProperties = new HashMap<String,String>();
			}
			else if (qName.equalsIgnoreCase("shipping")){
				isInHeader = false;
			    isInItem = false;
			    isInShipping = true;
			    isInCcilog = false;		
			    userProperties = new HashMap<String,String>();
			    shippingProperties = new HashMap<String,String>();
			}
			else if (qName.equalsIgnoreCase("ccilog")){
				isInHeader = false;
			    isInItem = false;
			    isInShipping = false;
			    isInCcilog = true;				
			}
					
	    }
		
		@Override
	    public void endElement(String namespaceURI, String sName, String qName)
	    {
			if((charSeq.length()>0)&isInHeader){
				
				orderProperties.put(qName, charSeq.toString());
				
			}
			else if((charSeq.length()>0)&isInItem){
				
				itemProperties.put(qName, charSeq.toString());
				
			}
			else if((charSeq.length()>0)&isInShipping){
				
				shippingProperties.put(qName, charSeq.toString());
				
			}
			/*
			 * Tag abfragen und entsprechende Verarbeitunsschritte
			 */
			if (qName.equalsIgnoreCase("orderid")&isInHeader){
				orderId = charSeq.toString();
			}
			else if (qName.equalsIgnoreCase("userid")){
				
				currentUserId = charSeq.toString();
				if (isInHeader){
				    billingUserId=currentUserId;				    
				}
				else if(isInShipping){
					shippingUserId=currentUserId;
				}
				
			}
			else if (qName.contains("customer")|qName.contains("contact")){
				String propertyBez = qName;
				if (qName.startsWith("billing"))
					propertyBez = qName.substring("billing".length());
				if (qName.startsWith("shipping"))
					propertyBez = qName.substring("shipping".length());
				
				userProperties.put(propertyBez, charSeq.toString());
//				System.out.println(qName+" : "+charSeq);
			}
			
			/*
			 * Die Kopfdaten sind eingelesen
			 */
			else if(qName.equalsIgnoreCase("header")){
				
				if (getKontaktImporter()!=null&&currentUserId!=null){
					KontaktSyncDO kso=getKontaktImporter().syncTaopixUser(currentUserId, userProperties);
	        		if (kso!=null&&kso.getKontakt()!=null){
	        			logger.info("Taopix Billing-User synchronisiert, UserID:  "+currentUserId+ ", SyncId: "+kso.getId()+ ", KontaktID: "+kso.getKontakt().getId());
	        			importedOrder.setKontakt(kso.getKontakt());
	        			importedOrder.setAdresse(kso.getKontakt().getHauptAdresse());
	        			importedOrder.setEmailAdresse(kso.getKontakt().getHauptEmailAdresse());
	        		}
	        		else{
	        			logger.info("Fehler beim synchronisieren Taopix Billing-User, UserID:  "+currentUserId);
	        		}
				}
				
			}
			else if(qName.equalsIgnoreCase("shipping")){
				
				if (getKontaktImporter()!=null&&currentUserId!=null){
					KontaktSyncDO kso=getKontaktImporter().syncTaopixUser(currentUserId, userProperties);
	        		if (kso!=null&&kso.getKontakt()!=null){
	        			logger.info("Taopix Shipping-User synchronisiert, UserID:  "+currentUserId+ ", SyncId: "+kso.getId()+ ", KontaktID: "+kso.getKontakt().getId());
	        			importedOrder.setLieferKontakt(kso.getKontakt());
	        			importedOrder.setLieferAdresse(kso.getKontakt().getHauptAdresse());
	        		}
	        		else{
	        			logger.info("Fehler beim synchronisieren Taopix Shipping-User, UserID:  "+currentUserId);
	        		}
				}				
			}
			else if(qName.equalsIgnoreCase("order")){
				if(getBelegImporter()!=null){
					BelegSyncDO syncDO = getBelegImporter().syncTaopixOrder(orderId, importedOrder, orderProperties, itemProperties,shippingProperties);
					if (syncDO!=null&syncDO.getBeleg()!=null&&(syncDO.getBeleg() instanceof AuftragDO)){
						importedOrder= (AuftragDO) syncDO.getBeleg();
					}
					else{
						logger.info("Fehler beim synchronisieren Taopix Order, OrderID: "+orderId);
					}
				}
			}
	    }
		
		@Override
	    public void characters(char[] ch, int start, int length) 
	
	    {
			String str = new String(ch, start, length);
			charSeq.append(str);
			
	    }
	}
	
    public TaopixKontaktImporter getKontaktImporter() {
		return kontaktImporter;
	}

	public void setKontaktImporter(TaopixKontaktImporter kontaktImporter) {
		this.kontaktImporter = kontaktImporter;
	}
	
	public TaopixBelegImporter getBelegImporter() {
		return belegImporter;
	}


	public void setBelegImporter(TaopixBelegImporter belegImporter) {
		this.belegImporter = belegImporter;
	}
	
    public WrgDO getStandardWrg() {
		return standardWrg;
	}


	public void setStandardWrg(WrgDO standardWrg) {
		this.standardWrg = standardWrg;
	}



}
