/**
 *
 */
package de.gammadata.tom.four_d_access.dao;

import de.gammadata.tom.four_d_access.dataBase.DB4D68Handler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseHandler;
import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;
import de.gammadata.tom.four_d_access.dataBase.QueryOperant;
import de.gammadata.tom.four_d_access.dataBase.QueryPart;
import de.gammadata.tom.four_d_access.dbBeans.BasicBean;
import de.gammadata.tom.four_d_access.xml.Xmp;
import de.gammadata.tom.four_d_access.xml.XmpSelection;
import java.util.UUID;

/**
 * Abstrakte Klasse als Vater aller TomDAOs
 *
 * @author gfr
 *
 */
public abstract class AbstractDAO<T extends BasicBean> {

  public static final int STANDARD_LIMIT = 100;
  /**
   * Handler für tom DB Zugriffe
   */
  private DataBaseHandler dbHandler;

  public AbstractDAO(DataBaseSpec _dbSpec) {
    dbHandler = new DB4D68Handler(_dbSpec);
  }

  /**
   * @return the dbHandler
   */
  public DataBaseHandler getDbHandler() {
    return dbHandler;
  }

  /**
   * @param dbHandler the dbHandler to set
   */
  public void setDbHandler(DataBaseHandler dbHandler) {
    this.dbHandler = dbHandler;
  }

  public abstract T getXmpInstance();

  /**
   * Lädt ein XMP-Objekt aus der datenbank
   *
   * @param inp XMP Obj mit DID gesetzt
   * @return T extends BasicBean
   * @throws TomDbException
   */
  public T loadXmpBean(T inp) throws TomDbException {
    if (inp == null || inp.getDID() == 0) {
      throw new TomDbException(
              "Fehler= QueryObject == null oder QueryObject.getDID()==0");
    }
    try {
      XmpSelection res = getDbHandler().getObjectFromDB(inp);
      if (res != null && res.getListSize() > 0) {
        @SuppressWarnings("unchecked")
        T obj = (T) res.getSelectedObject(0);
        return obj;

      } else {
        throw new TomDbObjectNotFoundException(
                "Fehler= kein Objekt gefunden mit ID=" + inp.getDID());
      }
    } catch (Exception e) {
      throw new TomDbException("Fehler beim Tom-Zugriff= "
              + e.getMessage());
    }

  }

  /**
   * Lädt ein XMP-Objekt aus der datenbank, alle Felder werden geladen
   *
   * @param did XMP Obj mit DID gesetzt
   * @return T extends BasicBean
   * @throws TomDbException
   */
  public T loadXmpBean(int did) throws TomDbException {
    if (did == 0) {
      throw new TomDbException("Fehler= did==0");
    }
    try {
      T inp = getXmpInstance();
      inp.setDID(did);
      inp.setAllFields();

      XmpSelection res = getDbHandler().getObjectFromDB(inp);
      if (res != null && res.getListSize() > 0) {
        @SuppressWarnings("unchecked")
        T obj = (T) res.getSelectedObject(0);
        return obj;

      } else {
        throw new TomDbObjectNotFoundException(
                "Fehler= kein Objekt gefunden mit ID=" + inp.getDID());
      }
    } catch (Exception e) {
      throw new TomDbException("Fehler beim Tom-Zugriff= "
              + e.getMessage());
    }
  }

  /**
   * Findet einen datensatz durch die uuid
   *
   * @param uuid String
   * @return T
   * @throws TomDbException
   */
  @SuppressWarnings("unchecked")
  public T loadXmpBeanByUuid(String uuid) throws TomDbException {

    T searchObj = getXmpInstance();
    if (searchObj.getUuid_fn() == 0) {
      throw new TomDbException(
              "Fehler= uuid wird vom XmpBean nicht unterstützt");
    }

    XmpSelection resultSelection = null;

    getDbHandler().openQuery(); // Query erzeugen
    // nach Suchwert suchen
    getDbHandler()
            .addQueryPart(
            new QueryPart(new QueryOperant(searchObj, searchObj
            .getUuid_fn()), QueryPart.equal,
            new QueryOperant(uuid)));

    searchObj.setAllFields();
    getDbHandler().setResultObject(searchObj);
    getDbHandler().setRecordLimit(1);
    getDbHandler().setStartRecord(0);

    resultSelection = getDbHandler().executeQuery();
    if (resultSelection != null && resultSelection.getListSize() > 0) {
      return (T) resultSelection.getSelectedObject(0);
    } else {
      throw new TomDbObjectNotFoundException(
              "Fehler= kein Objekt gefunden mit uuid=" + uuid);
    }
  }
  
   /**
   * Findet einen datensatz durch die uuid
   *
   * @param uuid String
   * @return T
   * @throws TomDbException
   */
  @SuppressWarnings("unchecked")
  public boolean checkXmpBeanByUuid(String uuid) throws TomDbException {

    T searchObj = getXmpInstance();
    if (searchObj.getUuid_fn() == 0) {
      throw new TomDbException(
              "Fehler= uuid wird vom XmpBean nicht unterstützt");
    }

    XmpSelection resultSelection = null;

    getDbHandler().openQuery(); // Query erzeugen
    // nach Suchwert suchen
    getDbHandler()
            .addQueryPart(
            new QueryPart(new QueryOperant(searchObj, searchObj
            .getUuid_fn()), QueryPart.equal,
            new QueryOperant(uuid)));
    int[] fl = {1, 6};
    searchObj.setFieldList(fl);
    getDbHandler().setResultObject(searchObj);
    getDbHandler().setRecordLimit(1);
    getDbHandler().setStartRecord(0);

    resultSelection = getDbHandler().executeQuery();
    if (resultSelection != null && resultSelection.getListSize() > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Speichert ein Objekt in der TOM-DB
   *
   * @param inp T
   * @return T
   * @throws TomDbException
   */
  @SuppressWarnings("unchecked")
  public T storeXmpBean(T inp) throws TomDbException {
    if (inp == null) {
      throw new TomDbException("Versuch ein Null-Objekt zu speichern");
    }
    return (T) getDbHandler().storeObjectInDB(inp);
  }

  /**
   * Das Objekt wird aus der Datenbank gelöscht
   *
   * @param delObj
   * @return 1, wenn OK
   * @throws TomDbException
   */
  public int deleteObjectFromDB(Xmp delObj) throws TomDbException {
    if (delObj == null) {
      throw new TomDbException("Versuch ein Null-Objekt zu löschen");
    }
    return getDbHandler().deleteObjectFromDB(delObj);
  }

  public XmpSelection getAllRecords(Xmp resultObj, Integer startRecord,
          Integer limit) throws TomDbException {
    getDbHandler().openQuery(); // Query erzeugen
    // alle Records
    getDbHandler().addQueryPart(
            new QueryPart(new QueryOperant(resultObj, 1),
            QueryPart.allRecords));
    getDbHandler().setResultObject(resultObj);
    setLimits(startRecord, limit);

    XmpSelection resultSelection = getDbHandler().executeQuery();

    return resultSelection;
  }
  /**
   * Get the next Beleg Type
   * @param belegType String
   * @return int
   */
  public int getNextBelegNumber(String belegType){
    return getDbHandler().getNextNumber(belegType);
  }

  /**
   * Helper um die Limits zu setzen
   *
   * @param start Record
   * @param limit Anzahl records
   */
  protected void setLimits(Integer start, Integer limit) {
    if (limit != null) {
      getDbHandler().setRecordLimit(limit);
    }
    if (start != null && start > 0) {
      // SQL offset==0 (TOM==1)
      getDbHandler().setStartRecord(start + 1);
    } else {
      getDbHandler().setStartRecord(0);
    }
  }

  /**
   * Erzeugt einen Uuid Schlüssel
   *
   * @return Uuid
   */
  protected String createUuid() {
    String uuid = UUID.randomUUID().toString();
    return uuid;
  }
}
