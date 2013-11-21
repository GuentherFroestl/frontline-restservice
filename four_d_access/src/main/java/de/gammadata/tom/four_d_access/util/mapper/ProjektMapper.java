/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.Vorgangsverwaltung;
import com.tom.service.dto.KundenKopfDTO;
import com.tom.service.dto.ProjektDTO;
import com.tom.service.dto.ProjektKopfDTO;
import com.tom.service.dto.Status;
import com.tom.service.dto.UserKopfDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * Mappt die diversen Objekte rund ums Projekt
 * 
 * @author gfr_MB
 * 
 */
public class ProjektMapper {

	/**
	 * mappt eine XmpSelection mit Vorgangsverwaltung auf eine Liste
	 * ProjektKopfDTO
	 * 
	 * @param sel
	 *            XmpSelection (Vorgangsverwaltung)
	 * @return List of ProjektKopfDTO
	 */
	public static List<ProjektKopfDTO> mapKopfdaten(XmpSelection sel) {
		if (sel == null || sel.getSelection() == null) {
			return null;
		}
		List<ProjektKopfDTO> res = new ArrayList<ProjektKopfDTO>();

		for (Xmp obj : sel.getSelection()) {
			ProjektKopfDTO pj = mapKopfdaten((Vorgangsverwaltung) obj);
			if (pj != null) {
				res.add(pj);
			}
		}

		return res;
	}

	/**
	 * mappt die Vorgangsverwaltung auf ein ProjektKopfDTO
	 * 
	 * @param obj
	 *            Vorgangsverwaltung
	 * @return ProjektKopfDTO
	 */
	public static ProjektKopfDTO mapKopfdaten(Vorgangsverwaltung obj) {
		if (obj == null) {
			return null;
		}

		ProjektKopfDTO pk = new ProjektKopfDTO();
		mapKopfDaten(pk, obj);

		return pk;
	}

	/**
	 * Helpfer für das Mappen von Kopfdaten
	 * 
	 * @param pk
	 * @param obj
	 */
	private static void mapKopfDaten(ProjektKopfDTO pk, Vorgangsverwaltung obj) {
		BaseMapper.mapXmp(pk, obj);
		pk.setName(obj.getVorgangNr());
		pk.setKurzBezeichnung(obj.getVorgangKBZ());
		pk.setStartDatum(obj.getStartDatum());
		pk.setEndDatum(obj.getEndDatum());
		pk.setLabel(obj.getJob_Status());
		pk.setStatus(mapStatus(obj));
    pk.setBeschreibung(obj.getBeschreibung().toString());
		UserKopfDTO user = new UserKopfDTO();
		user.setId(obj.get_001_001_Mitarbeiter_DID());
		user.setKbz(obj.getM_001_021_Mitarbeiter_Kürzel());
		user.setMandant(obj.getDMandant());
		pk.setUser(user);
		KundenKopfDTO knd = new KundenKopfDTO();
		knd.setMandant(obj.getDMandant());
		knd.setId(obj.get_068_001_Kunden_DID());
		knd.setNachname(obj.getM_068_027_Kunden_Nachname());
		knd.setFirmenname(obj.getM_068_026_Kunden_Firmenname());
		knd.setKundennummer(obj.getM_068_011_KundenNr());
		pk.setKunde(knd);

	}

	/**
	 * mappt die Vorgangsverwaltung auf ein ProjektKopfDTO
	 * 
	 * @param obj
	 *            Vorgangsverwaltung
	 * @return ProjektKopfDTO
	 */
	public static ProjektDTO map(Vorgangsverwaltung obj) {
		if (obj == null) {
			return null;
		}

		ProjektDTO pk = new ProjektDTO();
		mapKopfDaten(pk, obj);
		pk.setKommentar(obj.getKommentar().toString());
		// TODO mehr Eigenschaften einführen und mappen

		return pk;
	}

	/**
	 * appt ein ProjektDTO auf die Vorgangsverwaltung
	 * 
	 * @param projekt
	 *            ProjektDTO
	 * @return Vorgangsverwaltung
	 */
	public static Vorgangsverwaltung map(ProjektDTO projekt) {
		if (projekt == null) {
			return null;
		}
		Vorgangsverwaltung res = new Vorgangsverwaltung();
		BaseMapper.mapDTO(res, projekt);
		res.setDMandant(projekt.getMandant());
		res.setVorgangNr(projekt.getName());
		res.setVorgangKBZ(projekt.getKurzBezeichnung());
		res.setStartDatum(new java.sql.Date(projekt.getStartDatum().getTime()));
		res.setEndDatum(new java.sql.Date(projekt.getEndDatum().getTime()));
		res.setJob_Status(projekt.getLabel());
		res.setBeschreibung(new StringBuilder(projekt.getBeschreibung()));
		res.setKommentar(new StringBuilder(projekt.getKommentar()));
		if (projekt.getUser() != null) {
			res.set_001_001_Mitarbeiter_DID(projekt.getUser().getId());
			res.setM_001_021_Mitarbeiter_Kürzel(projekt.getUser().getName());
		}
		if (projekt.getKunde() != null) {
			res.set_068_001_Kunden_DID(projekt.getKunde().getId());
			if (projekt.getKunde().getKundennummer() != null) {
				res.setM_068_011_KundenNr(projekt.getKunde().getKundennummer());
			}
			res.setM_068_026_Kunden_Firmenname(projekt.getKunde()
					.getFirmenname());
			res.setM_068_027_Kunden_Nachname(projekt.getKunde().getNachname());
		}

		mapStatus(res, projekt);
		return res;
	}

	/**
	 * Helfer um den Status zu mappen
	 * 
	 * @param obj
	 *            Vorgangsverwaltung
	 * @return Status
	 */
	public static Status mapStatus(Vorgangsverwaltung obj) {
		if (obj.getErledigt()) {
			return Status.ERLEDIGT;
		} else if (obj.getJobinArbeit()) {
			return Status.INARBEIT;
		} else {
			return Status.ZUTUN;
		}

	}

	public static void mapStatus(Vorgangsverwaltung obj, ProjektDTO projekt) {
		if (Status.ERLEDIGT.equals(projekt.getStatus())) {
			obj.setErledigt(true);
			obj.setJobinArbeit(false);
		} else if (Status.INARBEIT.equals(projekt.getStatus())) {
			obj.setErledigt(false);
			obj.setJobinArbeit(true);

		}
	}

}
