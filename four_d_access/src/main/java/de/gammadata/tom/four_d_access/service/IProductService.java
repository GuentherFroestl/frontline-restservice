/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gammadata.tom.four_d_access.service;

import com.tom.service.dto.ProduktDTO;
import com.tom.service.dto.ProduktKopfDTO;
import com.tom.service.dto.SearchByStringRequest;
import com.tom.service.facade.TomException;
import java.util.List;

/**
 * Service for Product data.
 *
 * @author gfr
 */
public interface IProductService {

  /**
   * search with string.
   *
   * @param req SearchByStringRequest
   * @return List of ProduktKopfDTO
   * @throws TomException
   */
  List<ProduktKopfDTO> searchByString(SearchByStringRequest req) throws TomException;

  /**
   * Load a produkt by its code.
   *
   * @param prod ProduktKopfDTO the partially defined product
   * @return ProduktDTO
   * @throws TomException
   */
  ProduktDTO loadByCode(ProduktKopfDTO prod) throws TomException;

  /**
   * Load a produkt by its id.
   *
   * @param id Integer
   * @return ProduktDTO
   * @throws TomException
   */
  ProduktDTO loadById(Integer id) throws TomException;

  /**
   * Create a produkt, returns the DTO with the id.
   *
   * @param produkt ProduktDTO
   * @return ProduktDTO
   * @throws TomException
   */
  ProduktDTO createProdukt(ProduktDTO produkt) throws TomException;

  /**
   * update a produkt, returns the updated DTO.
   *
   * @param produkt ProduktDTO
   * @return ProduktDTO
   * @throws TomException
   */
  ProduktDTO updateProdukt(ProduktDTO produkt) throws TomException;

  /**
   * deletes a produkt in the DB.
   *
   * @param produkt ProduktDTO to delete
   * @throws TomException
   */
  void deleteProdukt(ProduktDTO produkt) throws TomException;
}
