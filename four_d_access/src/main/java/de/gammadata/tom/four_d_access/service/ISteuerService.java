/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.dto.SteuerArtDTO;
import com.tom.service.facade.TomException;
import java.util.List;

/**
 * Interface fuer SteuerArten Service.
 *
 * @author gfr
 */
public interface ISteuerService {

  /**
   * Suche nach Steuerarten.
   * @param req SearchByStringRequest
   * @return List of SteuerArtDTO
   * @throws TomException 
   */
  List<SteuerArtDTO> searchByString(SearchByStringRequest req) throws TomException;

  /**
   * Load by ID.
   * @param id Integer
   * @return SteuerArtDTO
   * @throws TomException 
   */
  SteuerArtDTO loadById(Integer id) throws TomException;
  
    /**
   * Load the SteuerArtDTO marked as standard.
   * @param mandantId Integer Mandant ID
   * @return SteuerArtDTO
   * @throws TomException 
   */
  SteuerArtDTO loadStandardSteuerArt(Integer mandantId) throws TomException;
  
}
