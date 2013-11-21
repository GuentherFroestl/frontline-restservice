/*
 * ZeitMesser.java
 *
 * Created on 16. September 2005, 09:41
 */

package de.gammadata.tom.four_d_access.util;

/**
 * 
 * @author günther
 */
public class ZeitMesser {
	private long startZeit;
	private long stoppZeit;
	private int zeitDiff;

	/** Creates a new instance of ZeitMesser */
	public ZeitMesser() {
		startZeit = new java.util.Date().getTime();
	}

	public void startMessung() {
		startZeit = new java.util.Date().getTime();
	}

	public int getZeitDiff() {
		zeitDiff = (int) (new java.util.Date().getTime() - startZeit);
		return zeitDiff;
	}

	public String getZeitDiffString() {
		zeitDiff = (int) (new java.util.Date().getTime() - startZeit);
		String z = Integer.toString(zeitDiff) + " ms";
		return z;
	}

}
