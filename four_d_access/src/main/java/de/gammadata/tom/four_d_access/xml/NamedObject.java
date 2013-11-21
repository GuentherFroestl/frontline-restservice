/*
 * NamedObject.java
 *
 * Created on 20. März 2006, 09:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package de.gammadata.tom.four_d_access.xml;

/**
 * 
 * @author gfr
 */
public class NamedObject {

	private String objectName = "";
	private String objectScope = "";
	private String objectClassName = "";
	private Object object;

	/** Creates a new instance of NamedObject */
	public NamedObject() {
	}

	public void setObjectName(String inp) {
		objectName = inp;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectScope(String inp) {
		objectScope = inp;
	}

	public String getObjectScope() {
		return objectScope;
	}

	public void setObjectClassName(String inp) {
		objectClassName = inp;
	}

	public String getObjectClassName() {
		return objectClassName;
	}

	public void setObject(Object inp) {
		object = inp;
	}

	public Object getObject() {
		return object;
	}

}
