package at.cyberlab.taopix_services.imports;

import de.gammadata.basics.modelle.AdresseDO.Nutzung;
import de.gammadata.basics.modelle.EmailAdresseDO;
import de.gammadata.basics.modelle.HausAdresseDO;
import de.gammadata.basics.modelle.KommAdresseDO;
import de.gammadata.basics.modelle.KontaktDO;
import de.gammadata.basics.modelle.LandDO;
import de.gammadata.basics.modelle.PersonDO;
import de.gammadata.business.modelle.BelegDO.Type;
import de.gammadata.sync.KontaktImporterImpl;
import de.gammadata.sync.KontaktSyncDO;
import java.util.HashMap;

import javax.persistence.EntityManager;




/**
 * @author gfr
 *
 */
public class TaopixKontaktImporterImpl extends KontaktImporterImpl implements TaopixKontaktImporter{

	/**
	 * 
	 */
	
	

	
	public TaopixKontaktImporterImpl() {

	}

	/**
	 * @param em
	 */
	public TaopixKontaktImporterImpl(EntityManager em) {
		super(em);
	}
	
	

	/* 
	 * @see de.gammadata.sync.KontaktImporterImpl#getExtSourceBezeichnung()
	 */
	@Override
	public String getExtSourceBezeichnung() {
		return TaopixConfig.TAOPIX_USER;
	}
	/**
	 * 
	 * @param userId  String Taopix User-ID
	 * @param propertyListe HashMap<String,String> Eigenschaftenliste des Kontakts lt. taopix xml
	 * @return
	 */
	public KontaktSyncDO syncTaopixUser(String userId,HashMap<String,String> propertyListe){
		KontaktDO kontakt=null;
		KontaktSyncDO kso=this.searchKontaktSyncByExtRef(userId);
		if (kso==null){
			kontakt = createKontaktDO( userId,propertyListe);
			kso=createKontaktSync(userId, kontakt);
			if (kso.getKontakt()!=null)
				getLogger().debug("Synceintrag neu erstellt userID: "+userId+", KontaktID: "+kso.getKontakt().getId()+" Kontakt: "+kso.getKontakt().getNamenString());
			else
				getLogger().error("Synceintrag neu erstellt userID: "+userId+", SyncID: "+kso.getId()+", Fehler Kontakt == null !!!!!! ");
		}
		else{
			kontakt = kso.getKontakt();
			if (kso.getKontakt()!=null)
				getLogger().debug("Synceintrag gefunden userID: "+userId+", SyncID: "+kso.getId()+", KontaktID: "+kso.getKontakt().getId()+", Kontakt: "+kso.getKontakt().getNamenString());
			else
				getLogger().error("Synceintrag gefunden userID: "+userId+", SyncID: "+kso.getId()+", Fehler Kontakt == null !!!!!! ");

			//TODO Kontaktdaten auf Änderungen prüfen
		}
		return kso;
	}
	
	 KontaktDO createKontaktDO(String userId,HashMap<String,String> propertyListe){
		PersonDO kontakt=new PersonDO();
		//Namen
		kontakt.setVorname(propertyListe.get("contactfirstname"));
		kontakt.setNachname(propertyListe.get("contactlastname"));
		if (propertyListe.containsKey("customername"))
			kontakt.setName(propertyListe.get("customername"));
		
		HausAdresseDO adr = new HausAdresseDO();
		adr.setPlz(propertyListe.get("customerpostcode"));
		adr.setStadt(propertyListe.get("customercity"));
		adr.setStrasse(propertyListe.get("customeraddress1"));
		if (propertyListe.containsKey("customeraddress2")&&!adr.getStrasse().equalsIgnoreCase(propertyListe.get("customeraddress2"))){
			adr.setAdressZusatz(propertyListe.get("customeraddress2"));
		}

		LandDO land=getStandardLand();
		String iso2Code=propertyListe.get("customercountrycode");
		if (iso2Code!=null
				&&((land==null)||(!land.getIso3166_2_Code().equalsIgnoreCase(iso2Code)))){
			//TODO Land neu bestimmen
			
			LandDO landNeu=this.searchLandByIso2Code(iso2Code);
			if (landNeu!=null){
				land=landNeu;
			}
			else{
				getLogger().error("Iso2-Code ist nicht in Land-Tabelle : "+iso2Code);
			}
		}
		adr.setLand(land);
		kontakt.setHauptAdresse(adr);
		
		//Telefon
		String telefon = propertyListe.get("customertelephonenumber");
		if (telefon!=null&&telefon.length()>4){
			KommAdresseDO tel = new KommAdresseDO();
			tel.setNameNummer(propertyListe.get("customertelephonenumber"));
			tel.setNutzung(Nutzung.PRIVAT);
			if (telefon.startsWith("06")|telefon.startsWith("00436")|telefon.startsWith("+436")){
				tel.setType(KommAdresseDO.Type.MOBIL);
			}
			else{
				tel.setType(KommAdresseDO.Type.FESTNETZ);
			}
			kontakt.addKommAdresse(tel);
		}
		
		String email= propertyListe.get("customeremailaddress");
		if (email!=null&&email.length()>4){
			
			EmailAdresseDO emailAdr = new EmailAdresseDO();
			emailAdr.setNameNummer(email);
			emailAdr.setPersonalName(kontakt.getNamenString());
			kontakt.setHauptEmailAdresse(emailAdr);			
		}
		getLogger().debug("createKontaktDO, Kontakt neu erstellt: "+kontakt.getNamenString());
		return kontakt;
	}
	
	public LandDO getStandardLand() {
		return standardLand;
	}

	public void setStandardLand(LandDO standardLand) {
		this.standardLand = standardLand;
	}

	private LandDO standardLand =null;


}
