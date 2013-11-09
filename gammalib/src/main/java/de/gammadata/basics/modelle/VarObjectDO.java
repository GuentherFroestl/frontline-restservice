/**
 * 
 */
package de.gammadata.basics.modelle;


/**
 * Modelliert ein variables Objekt, das mit Xstream serialisiert wurde
 * @author gfr
 *
 */

public class VarObjectDO extends PersistenceDO {

	private String objectClassName;
	private String xmlStream;

	/**
	 * @see de.gammadata.basics.modelle.VarObject#getObject()
	 */

	public Object getObject() {
		return null;
	}

	/**
	 * @see de.gammadata.basics.modelle.VarObject#getObjectClassName()
	 */
	public String getObjectClassName() {
		return this.objectClassName;
	}

	/**
	 * @see de.gammadata.basics.modelle.VarObject#getXmlStream()
	 */

	public String getXmlStream() {
		return this.xmlStream;
	}

	/**
	 * @see de.gammadata.basics.modelle.VarObject#setObject()
	 */

	public void setObject() {
		// TODO Auto-generated method stub

	}

	/**
	 * @see de.gammadata.basics.modelle.VarObject#setObjectClassName(java.lang.String)
	 */
	public void setObjectClassName(String objectClassName) {
		this.objectClassName=objectClassName;

	}

	/**
	 * @see de.gammadata.basics.modelle.VarObject#setXmlStream(java.lang.String)
	 */
	public void setXmlStream(String xmlStream) {
		this.xmlStream=xmlStream;

	}

	@Override
	public String genMatchString() {
		// TODO Auto-generated method stub
		return null;
	}

}
