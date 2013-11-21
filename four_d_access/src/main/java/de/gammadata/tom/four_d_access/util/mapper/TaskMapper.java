/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.gammadata.tom.four_d_access.dbBeans.AktionsTabelle;
import de.gammadata.tom.four_d_access.dbBeans.MAZeitverwaltung;
import com.tom.service.dto.AddressKopfDTO;
import com.tom.service.dto.ProjektKopfDTO;
import com.tom.service.dto.Status;
import com.tom.service.dto.TaskDTO;
import com.tom.service.dto.TaskTypeDTO;
import com.tom.service.dto.UserKopfDTO;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;

/**
 * @author gfr_MB
 * 
 */
public class TaskMapper {

	/**
	 * mappt eine XmpSelection mit Vorgangsverwaltung auf eine Liste
	 * ProjektKopfDTO
	 * 
	 * @param sel
	 *            XmpSelection (Vorgangsverwaltung)
	 * @return List<ProjektKopfDTO>
	 */
	public static List<TaskDTO> map(XmpSelection sel) {
		if (sel == null || sel.getSelection() == null) {
			return null;
		}
		List<TaskDTO> res = new ArrayList<TaskDTO>();

		for (Xmp obj : sel.getSelection()) {
			TaskDTO tk = map((MAZeitverwaltung) obj);
			if (tk != null) {
				res.add(tk);
			}
		}

		return res;
	}

	/**
	 * Mapper MAZeitverwaltung >> TaskDTO
	 * 
	 * @param obj
	 *            MAZeitverwaltung
	 * @return TasktDTO
	 */
	public static TaskDTO map(MAZeitverwaltung obj) {
		if (obj == null) {
			return null;
		}

		TaskDTO res = new TaskDTO();
		BaseMapper.mapXmp(res, obj);

		res.setBezeichnung(obj.getKBZ());
		res.setListType(obj.getListID());
		res.setKommentar(obj.getKommentar().toString());
		res.setDatum(NumberMapper.map(obj.getDatum(), obj.getUhrzeit()));
		res.setWeiterverrechenbar(obj.getWeiterverrechnen());

		res.setDauerInStdGeplant(NumberMapper.convertMenge(obj.getStd_geplant()));
		res.setDauerInStdGeleistet(NumberMapper.convertMenge(obj.getDauerStd()));
		if (obj.get_022_001_Vorgangsverwaltung_DID() > 0) {
			ProjektKopfDTO pk = new ProjektKopfDTO();
			pk.setId(obj.get_022_001_Vorgangsverwaltung_DID());
			pk.setName(obj.getM_022_031_VorgangNr());
			res.setProjekt(pk);
		}
		if (obj.get_001_001_Mitarbeiter_DID() > 0) {
			UserKopfDTO uk = new UserKopfDTO();
			uk.setId(obj.get_001_001_Mitarbeiter_DID());
			uk.setKbz(obj.getM_001_021_Mitarbeiter_Kürzel());
			res.setUser(uk);
		}
		if (obj.get_009_001_Adressen_DID() > 0) {
			AddressKopfDTO ak = new AddressKopfDTO();
			ak.setId(obj.get_009_001_Adressen_DID());
			ak.setVollerName(AddressMapper.buildName(
					obj.getM_009_014_Adressen_Nachname(),
					obj.getM_009_011_Adressen_Firmenname()));
			res.setAdresse(ak);
		}
		if (obj.get_021_001__AktionsTabelle_DID() > 0) {
			TaskTypeDTO tt = new TaskTypeDTO();
			tt.setId(obj.get_021_001__AktionsTabelle_DID());
			tt.setBezeichnung(obj.getM_021_011_Aktionstabelle_KBZ());
			res.setType(tt);
		}

		if (obj.getInArbeit()) {
			res.setStatus(Status.INARBEIT);
		} else if (obj.getErledigt() | obj.getBerechnet()) {
			res.setStatus(Status.ERLEDIGT);
		} else {
			res.setStatus(Status.ZUTUN);
		}

		return res;

	}

	/**
	 * Mappt ein TaskDto auf ein MAZeitverwaltung
	 * 
	 * @param dto
	 *            TaskDTO
	 * @return MAZeitverwaltung
	 */
	public static MAZeitverwaltung map(TaskDTO dto) {
		if (dto == null) {
			return null;
		}
		MAZeitverwaltung res = new MAZeitverwaltung();
		BaseMapper.mapDTO(res, dto);
		res.setKBZ(dto.getBezeichnung());
		if (dto.getKommentar() != null) {
			res.setKommentar(new StringBuilder(dto.getKommentar()));
		}

		res.setDauerStd(NumberMapper.convertMenge(dto.getDauerInStdGeleistet()));
		res.setStd_geplant(NumberMapper.convertMenge(dto.getDauerInStdGeplant()));
		// ListType
		if (dto.getListType() != null) {
			res.setListID(dto.getListType());
		}
		// Dateumwandlung
		if (dto.getDatum() == null) {
			dto.setDatum(new Date());
		}
		res.setUhrzeit(new java.sql.Time(dto.getDatum().getTime()));
		res.setDatum(new java.sql.Date(dto.getDatum().getTime()));

		// One Objekte
		if (dto.getType() != null) {
			res.set_021_001__AktionsTabelle_DID(dto.getType().getId());
			res.setM_021_011_Aktionstabelle_KBZ(dto.getType().getBezeichnung());
		}
		if (dto.getProjekt() != null) {
			res.set_022_001_Vorgangsverwaltung_DID(dto.getProjekt().getId());
			res.setM_022_031_VorgangNr(dto.getProjekt().getName());
		}
		if (dto.getUser() != null) {
			res.set_001_001_Mitarbeiter_DID(dto.getUser().getId());
			res.setM_001_021_Mitarbeiter_Kürzel(dto.getUser().getName());
		}
		if (dto.getAdresse() != null) {
			res.set_009_001_Adressen_DID(dto.getAdresse().getId());
		}

		if (Status.ERLEDIGT.equals(dto.getStatus())
				| Status.GESCHLOSSEN.equals(dto.getStatus())) {
			res.setErledigt(true);
			res.setInArbeit(false);
		} else if (Status.INARBEIT.equals(dto.getStatus())) {
			res.setErledigt(false);
			res.setInArbeit(true);
		} else if (Status.ZUTUN.equals(dto.getStatus())) {
			res.setInArbeit(false);
			res.setErledigt(false);
		}

		res.setWeiterverrechnen(dto.isWeiterverrechenbar());

		return res;

	}

	/**
	 * Mapper AktionsTabelle >> TaskTypeDTO
	 * 
	 * @param obj
	 *            AktionsTabelle
	 * @return TaskTypeDTO
	 */
	public static TaskTypeDTO map(AktionsTabelle obj) {

		TaskTypeDTO res = new TaskTypeDTO();
		BaseMapper.mapXmp(res, obj);
		res.setBeschreibung(obj.getBeschreibung().toString());
		res.setBezeichnung(obj.getKBZ());
		return res;

	}

	/**
	 * Mappt TaskTypeDTO >> AktionsTabelle
	 * 
	 * @param obj
	 * @return
	 */
	public static AktionsTabelle map(TaskTypeDTO obj) {
		AktionsTabelle res = new AktionsTabelle();
		BaseMapper.mapDTO(res, obj);
		res.setKBZ(obj.getBezeichnung());
		if (obj.getBeschreibung() != null) {
			res.setBeschreibung(new StringBuilder(obj.getBeschreibung()));
		}

		return res;
	}

	/**
	 * mappt eine Liste von AktionsTabelle auf eine Liste von TaskTypeDTO
	 * 
	 * @param sel
	 *            XmpSelection (AktionsTabelle)
	 * @return List of TaskTypeDTO
	 */
	public static List<TaskTypeDTO> mapAktionsTabelleListe(XmpSelection sel) {
		if (sel == null || sel.getSelection() == null) {
			return null;
		}
		List<TaskTypeDTO> res = new ArrayList<TaskTypeDTO>();

		for (Xmp obj : sel.getSelection()) {
			TaskTypeDTO tt = map((AktionsTabelle) obj);
			if (tt != null) {
				res.add(tt);
			}
		}

		return res;
	}

}
