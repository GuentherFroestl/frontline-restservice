/**
 *
 */
package de.gammadata.tom.four_d_access.dao;

import java.util.List;

import com.tom.service.dto.BelegDTO;
import com.tom.service.dto.BelegKopfDTO;
import com.tom.service.dto.BelegPositionDTO;
import com.tom.service.dto.BelegSearchRequest;
import com.tom.service.dto.Status;

/**
 * @author gfr
 *
 */
public interface IBelegDAO {

  /**
   * Allgemeine searchRoutine für Belege wird ducht Implementierungen realisiert, je nach BelegTyp
   *
   * @param req BelegSearchRequest
   * @return XmpSelection
   */
  public List<BelegKopfDTO> searchBelege(BelegSearchRequest req)
          throws TomDbException;

  /**
   * Holt einen Beleg durch die UUID
   *
   * @param uuid String
   * @return BelegDTO
   * @throws TomDbException
   */
  public BelegDTO loadBelegByUuid(String uuid) throws TomDbException;

  /**
   * Holt einen Beleg durch die ID
   *
   * @param Integer Integer
   * @return BelegDTO
   * @throws TomDbException
   */
  public BelegDTO loadBelegById(Integer id) throws TomDbException;

  /**
   * Holt einen Beleg durch BelegNummer
   *
   * @param Integer belegNumber
   * @return BelegDTO
   * @throws TomDbException
   */
  public BelegDTO loadBelegByNumber(Integer belegNumber) throws TomDbException;

  /**
   * Schaut mit der BelegNummer ob ein Beleg da ist.
   *
   * @param Integer belegNumber
   * @return boolean true, if the Beleg with this number exists
   * @throws TomDbException
   */
  public boolean checkBelegByNumber(Integer belegNumber) throws TomDbException;

  /**
   * Lädt die Positionsliste zu einem Beleg
   *
   * @param beleg BelegKopfDTO
   * @return List<BelegPositionDTO>
   */
  public List<BelegPositionDTO> loadPositionsListe(BelegKopfDTO beleg)
          throws TomDbException;

  /**
   * Lädt die Beleg Positionen zu einem Projekt
   *
   * @param pId Integer Projekt ID
   * @param Status status of positions
   * @return List of BelegDTO condensed List madeup from poslist
   */
  public List<BelegDTO> loadPositionenByProjektId(Integer pId, Status status)
          throws TomDbException;

  /**
   * to be overridden by a implementation for each BelegType.
   *
   * @param beleg BelegDTO
   * @return BelegDTO
   * @throws TomDbException
   */
  public BelegDTO storeBeleg(BelegDTO beleg) throws TomDbException;

  /**
   * A Beleg is deleted, regardless of it's relations.
   *
   * @param beleg BelegDTO
   * @throws TomDbException
   */
  public void deleteBeleg(BelegDTO beleg) throws TomDbException;
}
