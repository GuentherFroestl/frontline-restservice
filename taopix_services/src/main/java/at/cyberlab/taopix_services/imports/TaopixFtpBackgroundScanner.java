package at.cyberlab.taopix_services.imports;

import com.tomagency.cyberlab.server.config.CyberlabConfigProvider;
import java.util.logging.Logger;



/**
 * Erweitert BackgroundScanner um die taopix-spezifischen Properties
 * @author gfr
 *
 */
public interface TaopixFtpBackgroundScanner extends BackgroundScanner {
	
	public CyberlabConfigProvider getCyberlabConfigProvider();
	public void  setCyberlabConfigProvider(CyberlabConfigProvider cyberlabConfigProvider);
	
	
	public PersistenceManager getPersistenceManager();
	public void setPersistenceManager(PersistenceManager pm);
	
	public void setLogger(Logger logger);
	
}
