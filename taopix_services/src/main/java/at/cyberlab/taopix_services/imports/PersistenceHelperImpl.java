/**
 * 
 */
package at.cyberlab.taopix_services.imports;

import de.gammadata.business.modelle.KatalogProduktDO;
import de.gammadata.business.modelle.SteuerDO;
import de.gammadata.business.modelle.VersandArtDO;
import de.gammadata.business.modelle.WrgDO;
import de.gammadata.business.modelle.ZahlungsBedingungDO;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



/**
 * 
 * Einige Helper Methoden für die Datenbank
 * @author gfr
 *
 */
public class PersistenceHelperImpl {
	

	
	private static Logger LOG= Logger.getLogger(PersistenceHelperImpl.class.getSimpleName());
	
	private  Logger getLogger(){
		
		return LOG;
	}
	
	public  WrgDO wrgEintrag(WrgDAO wrgDao, EntityManager em, WrgDO wrgin){
		 List<WrgDO> wrgListe = wrgDao.findByString(wrgin.getWrgBez(), SEARCHTYPE.EXACT, 0, 0, em);
		   if (wrgListe!=null&&wrgListe.size()>0){
			   WrgDO wrg = wrgListe.get(0);
			   wrg.setKurs(wrgin.getKurs());
			   wrg.setWrgSymbol(wrgin.getWrgSymbol());
			  
			   EntityTransaction tx = em.getTransaction();
			   tx.begin();			   
			   wrgDao.storeEntity(wrg, em);
			   tx.commit();
			   getLogger().info("WrgDO Eintrag gefunden und Update ID:  "+wrg.getId()+", Bez: "+wrg.getWrgBez()+" "+wrg.getWrgSymbol()+", Kurs: "+wrg.getKurs());

			   return wrg;
		   }
		   else{
			   getLogger().info("WrgDO neuer Eintrag für "+wrgin.getWrgBez());
			   EntityTransaction tx = em.getTransaction();
			   tx.begin();
			   wrgDao.persistEntity(wrgin, em);
			   tx.commit();
			   getLogger().info("WrgDO Eintrag erzeugt für "+wrgin.getWrgBez()+" ID:  "+wrgin.getId()+", Bez: "+wrgin.getWrgBez()+" "+wrgin.getWrgSymbol()+", Kurs: "+wrgin.getKurs());
		   }
		   
		   return wrgin;
	}

	public  SteuerDO steuerEintrag(SteuerDAO steuerDao, EntityManager em, SteuerDO steuer){
		 List<SteuerDO> steuerListe = steuerDao.findByString(steuer.getBezeichnung(), SEARCHTYPE.EXACT, 0, 0, em);
		   if (steuerListe!=null&&steuerListe.size()>0){
			   steuer = steuerListe.get(0);
			   getLogger().info("SteuerDO Eintrag gefunden ID:  "+steuer.getId()+", Bez: "+steuer.getBezeichnung()+", Satz: "+steuer.getSteuersatz());
		   }
		   else{
			   getLogger().info("SteuerDO neuer Eintrag für "+steuer.getBezeichnung());
			   EntityTransaction tx = em.getTransaction();
			   tx.begin();
			   steuerDao.persistEntity(steuer, em);
			   tx.commit();
			   getLogger().info("SteuerDO Eintrag erzeugt für "+steuer.getBezeichnung()+" ID:  "+steuer.getId()+", Bez: "+steuer.getBezeichnung()+", Satz: "+steuer.getSteuersatz());
			   }
		   
		   return steuer;
	}
	
	public  KatalogProduktDO katalogEintrag(ProduktDAO dao,EntityManager em, KatalogProduktDO produkt){
		KatalogProduktDO result = produkt;
		List<KatalogProduktDO> produktListe = dao.findByBezeichnung(produkt.getBezeichnung(), SEARCHTYPE.EXACT, 0, 0, em);
		if (produktListe!=null&&produktListe.size()>0){
			result = produktListe.get(0);
			getLogger().info("Katalog/Produkt gefunden, Bez: "+produkt.getBezeichnung()+" ID: "+result.getId());
		}
		else{
			getLogger().info("Katalog/Produkt nicht gefunden, neuer Eintrag für Katalog/Produkt, Bez: "+produkt.getBezeichnung());
			 EntityTransaction tx = em.getTransaction();
			   tx.begin();
			   dao.persistEntity(produkt, em);
			   tx.commit();
			   getLogger().info("neuer Eintrag für Katalog/Produkt erzeugt, Bez: "+produkt.getBezeichnung()+" ID: "+result.getId());
		}
		return result;
		
	}
	
	public  ZahlungsBedingungDO zahlungsBedingungEintrag(ZahlungsBedingungDAO dao,EntityManager em, ZahlungsBedingungDO zahlBed){
		ZahlungsBedingungDO result =zahlBed;
		List<ZahlungsBedingungDO> liste = dao.findByBezeichnung(zahlBed.getBezeichnung(), SEARCHTYPE.EXACT, 0, 0, em);
		if (liste!=null&&liste.size()>0){
			result = liste.get(0);
			getLogger().info("Zahlungsbedingung gefunden, Bez: "+zahlBed.getBezeichnung()+" ID: "+result.getId());
		}
		else{
			getLogger().info("Zahlungsbedingung nicht gefunden, Bez: "+zahlBed.getBezeichnung()+" erstelle neuen Eintrag");
			 EntityTransaction tx = em.getTransaction();
			 tx.begin();
			 dao.persistEntity(zahlBed, em);
			 tx.commit();
			 result =zahlBed;
			 getLogger().info("neuer Eintrag für Zahlungsbedingung erzeugt, Bez: "+zahlBed.getBezeichnung()+" ID: "+result.getId());
			 
			
		}
		return result;
	}
	
	public  VersandArtDO versandArtEintrag(VersandArtDAO dao,EntityManager em, VersandArtDO versandArt){
		VersandArtDO result =versandArt;
		List<VersandArtDO> liste = dao.findByBezeichnung(versandArt.getBezeichnung(), SEARCHTYPE.EXACT, 0, 0, em);
		if (liste!=null&&liste.size()>0){
			result = liste.get(0);
			getLogger().info("Zahlungsbedingung gefunden, Bez: "+versandArt.getBezeichnung()+" ID: "+result.getId());
		}
		else{
			getLogger().info("Zahlungsbedingung nicht gefunden, Bez: "+versandArt.getBezeichnung()+" erstelle neuen Eintrag");
			 EntityTransaction tx = em.getTransaction();
			 tx.begin();
			 dao.persistEntity(versandArt, em);
			 tx.commit();
			 result =versandArt;
			 getLogger().info("neuer Eintrag für Zahlungsbedingung erzeugt, Bez: "+versandArt.getBezeichnung()+" ID: "+result.getId());
			 
			
		}
		return result;
	}

}
