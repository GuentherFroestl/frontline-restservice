/**
 * 
 */
package de.gammadata.business.modelle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import de.gammadata.basics.modelle.AdresseDO;
import de.gammadata.basics.modelle.EmailAdresseDO;
import de.gammadata.basics.modelle.KontaktDO;
import de.gammadata.basics.modelle.PersistenceDO;
import de.gammadata.business.modelle.SteuerDO.SteuerFall;


/**
 * Modelliert einen Beleg implementiert Beleg
 * @see BelegModel
 * @author gfr
 *
 */

public class BelegDO extends PersistenceDO{
  
  public enum Type{
    AUFTRAG, ANGEBOT, BESTELLUNG
  }

	private AdresseDO adresse;
	private Date datum=new Date();
	private KontaktDO kontakt;
	private List<BelegPositionDO> positionsListe;
	private String status;
	private WrgDO wrg=new WrgDO();
	
	private BigDecimal nettoBetragTotal=new BigDecimal("0.00");
	private BigDecimal steuerBetragTotal=new BigDecimal("0.00");
	private BigDecimal totalBetrag=new BigDecimal("0.00");
	private Map<SteuerDO, SteuerBetragDO> steuerMap;
	
	private EmailAdresseDO emailAdresse;

	
	private Type type;
	private String uuid;
	private int nummer;


	private boolean posChanges=true;
	private boolean bruttoBeleg=false;
	
	private List<BelegVerbindungDO> belegVerbindungsListe;
	private List<BelegVerbindungDO> reverseBelegVerbindungsListe;
	private SteuerFall steuerFall=SteuerFall.INLAND;
	
	private String subject;
	private String text;
	private String vermerk;
	private ZahlungsBedingungDO zahlungsBedingung;
	private VersandArtDO versandArt;


	/**
	 * Anschrift des Hauptkontaktes z.Z. als der beleg erstellt wurde
	 * @see de.gammadata.business.modelle.BelegModel#getAdresse()
	 */

	public AdresseDO getAdresse() {
		return this.adresse;
	}
	/**
	 * Emailadresse des Hauptkontaktes z.Z. als der beleg erstellt wurde
	 * @see de.gammadata.business.modelle.BelegModel#getEmailAdresse()
	 */

	public EmailAdresseDO getEmailAdresse() {
		return this.emailAdresse;
	}
	
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	/**
	 * Datum der Belegerstellung
	 * @see de.gammadata.business.modelle.BelegModel#getDatum()
	 */
	public Date getDatum() {
		return this.datum;
	}

	/**
	 * Der Hauptkontakt/Adressat f??r diesen Beleg
	 * @see de.gammadata.business.modelle.BelegModel#getKontakt()
	 */

	public KontaktDO getKontakt() {
		return this.kontakt;
	}


	public GeldDO getPosBruttoTotal() {
		calculateTotals();
		return new GeldDO(totalBetrag,wrg);
	}


	public GeldDO getPosNettoTotal() {
		calculateTotals();
		return new GeldDO(nettoBetragTotal,wrg);
	}


	public GeldDO getPosSteuerTotal() {
		calculateTotals();
		return new GeldDO(steuerBetragTotal,wrg);
	}

	/**
	 * es wir immer eine List<BelegPositionDO> !=null geliefert
	 * @see de.gammadata.business.modelle.BelegModel#getPositionsListe()
	 */

	public List<BelegPositionDO> getPositionsListe() {
		if (this.positionsListe==null)
			this.positionsListe = new ArrayList<BelegPositionDO>();
		return this.positionsListe;
	}

	/**
	 * es wir immer eine List<BelegVerbindungDO> !=null geliefert
	 * @return List<BelegVerbindungDO>
	 */

	public List<BelegVerbindungDO> getBelegVerbindungen() {
		if (this.belegVerbindungsListe==null)
			this.belegVerbindungsListe = new ArrayList<BelegVerbindungDO>();
		return this.belegVerbindungsListe;
	}

	public void setBelegVerbindungen(List<BelegVerbindungDO> belegVerbindingsListe) {
		this.belegVerbindungsListe=belegVerbindingsListe;		
	}
	/**
	 * es wir immer eine List<BelegVerbindungDO> !=null geliefert
	 * @return List<BelegVerbindungDO>
	 */

	public List<BelegVerbindungDO> getReverseBelegVerbindungen() {
		if (this.reverseBelegVerbindungsListe==null)
			this.reverseBelegVerbindungsListe = new ArrayList<BelegVerbindungDO>();
		return this.reverseBelegVerbindungsListe;
	}

	public void setReverseBelegVerbindungen(List<BelegVerbindungDO> belegVerbindingsListe) {
		this.reverseBelegVerbindungsListe=belegVerbindingsListe;		
	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#getStatus()
	 */
	public String getStatus() {
		return this.status;
	}


	public WrgDO getWrg() {
		return this.wrg;
	}
	
	public BigDecimal getNettoBetragTotal() {
		calculateTotals();
		return nettoBetragTotal;
	}
	public void setNettoBetragTotal(BigDecimal nettoBetragTotal) {
		this.nettoBetragTotal = nettoBetragTotal;
	}
	public BigDecimal getSteuerBetragTotal() {
		calculateTotals();
		return steuerBetragTotal;
	}
	public void setSteuerBetragTotal(BigDecimal steuerBetragTotal) {
		this.steuerBetragTotal = steuerBetragTotal;
	}
	public BigDecimal getTotalBetrag() {
		calculateTotals();
		return totalBetrag;
	}
	public void setTotalBetrag(BigDecimal totalBetrag) {
		this.totalBetrag = totalBetrag;
	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setAdresse(de.gammadata.basics.modelle.AdresseDO)
	 */
	public void setAdresse(AdresseDO adresse) {
		this.adresse=adresse;

	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setDatum(java.util.Date)
	 */
	public void setDatum(Date datum) {
		this.datum=datum;

	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setKontakt(de.gammadata.basics.modelle.KontaktDO)
	 */
	public void setKontakt(KontaktDO kontakt) {
		this.kontakt=kontakt;

	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setPositionsListe(java.util.List)
	 */
	public void setPositionsListe(List<BelegPositionDO> positionsListe) {
		this.positionsListe=positionsListe;

	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setStatus()
	 */
	public void setStatus(String status) {
		this.status=status;

	}

	/**
	 * @see de.gammadata.business.modelle.BelegModel#setWrgDO(de.gammadata.business.modelle.Wrg)
	 */
	public void setWrg(WrgDO wrg) {
		this.wrg=wrg;

	}
	

	public Map<SteuerDO, SteuerBetragDO> getSteuerBetraege() {
		return steuerMap;
	}
	
	public void setSteuerBetraege(Map<SteuerDO, SteuerBetragDO> steuerMap){
		this.steuerMap=steuerMap;
	}

	public ZahlungsBedingungDO getZahlungsBedingung() {
		return this.zahlungsBedingung;
	}
	public void setZahlungsBedingung(ZahlungsBedingungDO zahlungsBedingung) {
		this.zahlungsBedingung=zahlungsBedingung;
		
	}
	

	public VersandArtDO getVersandArt() {
		return versandArt;
	}
	public void setVersandArt(VersandArtDO versandArt) {
		this.versandArt = versandArt;
	}
	
	
	/**
	 * @see de.gammadata.business.modelle.BelegModel#getTotal()
	 */

	public GeldDO getTotal() {
		calculateTotals();
		return new GeldDO(this.totalBetrag,this.getWrg());
	}
	

	public GeldDO getNettoTotal() {
		calculateTotals();
		return new GeldDO(this.nettoBetragTotal,this.getWrg());
	}

	public GeldDO getSteuerTotal() {
		calculateTotals();
		return new GeldDO(this.steuerBetragTotal,this.getWrg());
	}



	public void setEmailAdresse(EmailAdresseDO adresse) {
		this.emailAdresse=adresse;
		
	}

	public String getSubject() {
		return this.subject;
	}
	public Type getType() {
		return this.type;
	}
	public String getUuid() {
		return this.uuid;
	}
	public boolean hasPosChanges() {
		return this.posChanges;
	}
	public boolean isBruttoBeleg() {
		return this.bruttoBeleg;
	}
	public void setBruttoBeleg(boolean istBruttobeleg) {
		this.bruttoBeleg=istBruttobeleg;
		
	}

	public void setPosChanges(boolean haschanges) {
		this.posChanges=haschanges;
		
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
		
	}
	public void setType(Type typ) {
		this.type=typ;
		
	}
	public void setUuid(String uuid) {
		this.uuid=uuid;
		
	}
	public SteuerFall getSteuerFall() {
		return this.steuerFall;
	}
	public void setSteuerFall(SteuerFall steuerFall) {
		this.steuerFall=steuerFall;
		
	}

	public String getText() {
		return this.text;
	}
	
	public String getVermerk() {
		return this.vermerk;
	}
	public void setText(String text) {
		this.text=text;
		
	}
	public void setVermerk(String vermerk) {
		this.vermerk=vermerk;
		
	}
	/**
	 * f??gt die Position hinzu und setzt abh??ngige Gr????en: PosNummer, Beleg
	 * @see de.gammadata.business.modelle.BelegModel#addPosition(de.gammadata.business.modelle.BelegPositionDO)
	 */

	public int addPosition(BelegPositionDO pos) {
		if (positionsListe==null){
			positionsListe = new ArrayList<BelegPositionDO>();
		}
		
		int posNummer = positionsListe.size()+1;
		pos.setBeleg(this);
		pos.setPosNummer(posNummer);
		positionsListe.add(pos);
		setPosChanges(true);
		return posNummer;
	}
	/**
	 * Methode pr??ft ob es ??nderungen im Beleg gibt und berechnet die totals neu
	 */

	public void calculateTotals() {
		if (!posChanges)
			return;
		
		nettoBetragTotal= new BigDecimal("0");
		steuerBetragTotal= new BigDecimal("0");
		totalBetrag= new BigDecimal("0");
		if (steuerMap==null){
			steuerMap = new HashMap<SteuerDO, SteuerBetragDO>();
		}
		else{
			// Mal schaun ob reines Neuanlegen funktioniert
			steuerMap = new HashMap<SteuerDO, SteuerBetragDO>();
		}
		
		if (this.getPositionsListe()!=null&&this.getPositionsListe().size()>0){
			
			for(BelegPositionDO pos :this.getPositionsListe() ){
				if (!steuerMap.containsKey(pos.getSteuer())){
					steuerMap.put(pos.getSteuer(), new SteuerBetragDO(pos.getSteuer(),this.getWrg()));
				}
				steuerMap.get(pos.getSteuer()).setNettoBetrag(steuerMap.get(pos.getSteuer()).getNettoBetrag().add(pos.getGesamtNettoBetrag()));
				steuerMap.get(pos.getSteuer()).setBruttoBetrag(steuerMap.get(pos.getSteuer()).getBruttoBetrag().add(pos.getGesamtBruttoBetrag()));
			}
			
			for (SteuerDO steuer:steuerMap.keySet()){
				steuerMap.get(steuer).setBruttoBetrag(steuerMap.get(steuer).getBruttoBetrag().setScale(GeldDO.roundscale, GeldDO.roundingMode));
				steuerMap.get(steuer).setNettoBetrag(steuerMap.get(steuer).getNettoBetrag().setScale(GeldDO.roundscale, GeldDO.roundingMode));
				totalBetrag=totalBetrag.add(steuerMap.get(steuer).getBruttoBetrag());
				nettoBetragTotal=nettoBetragTotal.add(steuerMap.get(steuer).getNettoBetrag());
			}

			    totalBetrag=totalBetrag.setScale(GeldDO.roundscale, GeldDO.roundingMode);
				nettoBetragTotal=nettoBetragTotal.setScale(GeldDO.roundscale, GeldDO.roundingMode);
				steuerBetragTotal = totalBetrag.subtract(nettoBetragTotal).setScale(GeldDO.roundscale, GeldDO.roundingMode);
		}
		
		posChanges=false;
	}
	

	public void postLoad(){
		posChanges=false;
	}
	@Override
	public String genMatchString() {
		StringBuilder sb = new StringBuilder();	
		sb.append(Integer.toString(nummer)
				+MATCH_TRENNZEICHEN+uuid
				+MATCH_TRENNZEICHEN+status
				+MATCH_TRENNZEICHEN+subject);
		
		if (getKontakt()!=null)
			sb.append(MATCH_TRENNZEICHEN+getKontakt().getNamenString());
		if(getAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getAdresse().genMatchString());
		if(getEmailAdresse()!=null)
			sb.append(MATCH_TRENNZEICHEN+getEmailAdresse().genMatchString());
		return sb.toString();
	}

	public String getTotalString() {
		if (getTotal()!=null&&getTotal().getBetrag()!=null&&getTotal().getWrg()!=null)
			return getTotal().getBetrag().toString() + getTotal().getWrg().getWrgSymbol();
		else return "0";
	}


}
