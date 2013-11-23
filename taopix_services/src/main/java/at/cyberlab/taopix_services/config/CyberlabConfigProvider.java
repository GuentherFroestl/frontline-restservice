/**
 * 
 */
package at.cyberlab.taopix_services.config;

import de.gammadata.tom.four_d_access.dataBase.DataBaseSpec;


/**
 * @author gfr
 *
 */
public interface CyberlabConfigProvider {
		
	public TaopixConfig getTaopixConfig();
	public void setTaopixConfig(TaopixConfig taopixConfig);
  public DataBaseSpec getDataBaseSpec();
  public void setDataBaseSpec(DataBaseSpec dbSpec);


}
