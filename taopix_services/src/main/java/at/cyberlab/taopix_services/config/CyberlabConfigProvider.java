/**
 * 
 */
package at.cyberlab.taopix_services.config;

import at.cyberlab.taopix_services.imports.TaopixConfig;


/**
 * @author gfr
 *
 */
public interface CyberlabConfigProvider {
		
	public TaopixConfig getTaopixConfig();
	public void setTaopixConfig(TaopixConfig taopixConfig);


}
