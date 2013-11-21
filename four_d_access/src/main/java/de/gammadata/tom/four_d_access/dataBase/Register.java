/*
 * Register.java
 *
 * Created on 17. Oktober 2005, 13:04
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.util.ArrayList;

/**
 * 
 * @author günther
 */
public class Register {
	private int nummer;
	private int sid;
	private String name;
	private int tabNummer;
	private String tabName;
	private String contentClassName;

	private ArrayList<Integer> fieldList;
	private ArrayList<OrderPart> orderList;
	private ArrayList<RegisterFilter> regFilterList;

	/** Creates a new instance of Register */
	public Register() {
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getNummer() {
		return nummer;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setTabNummer(int tabNummer) {
		this.tabNummer = tabNummer;
	}

	public int getTabNummer() {
		return tabNummer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getTabName() {
		return tabName;
	}

	public void setContentClassName(String className) {
		this.contentClassName = className;
	}

	public void setContentClassName(String packageName, String className) {
		// Abfrage nach absoluten oder relativen Class Namen!!

		if ((className.contains(".")) | (packageName == null)) {
			this.contentClassName = className; // absoluter Classname
		} else {

			this.contentClassName = packageName + "." + className; // innerhalb
																	// Standard
																	// Package
		}
	}

	public String getContentClassName() {
		return contentClassName;
	}

	public Class getContentClass() {
		if (getContentClassName() == null)
			return null;
		try {
			return Class.forName(getContentClassName());
		} catch (Exception e) {
			return null;
		}
	}

	public void setFieldList(ArrayList<Integer> fieldList) {
		this.fieldList = fieldList;
	}

	public ArrayList<Integer> getFieldList() {
		return fieldList;
	}

	public int[] getIntFieldList() // Hilfsroutine
	{
		int[] fieldArray = new int[this.fieldList.size()];
		for (int i = 0; i < this.fieldList.size(); i++) {
			fieldArray[i] = this.fieldList.get(i).intValue();
		}
		return fieldArray;
	}

	public void setRegFilterList(ArrayList<RegisterFilter> regFilterList) {
		this.regFilterList = regFilterList;
	}

	public ArrayList<RegisterFilter> getRegFilterList() {
		return regFilterList;
	}

	public void newOrderList() {
		orderList = new ArrayList<OrderPart>();
	}

	public void addOrderPart(OrderPart inp) {
		if (orderList != null)
			orderList.add(inp);
	}

	public void setOrderList(ArrayList<OrderPart> orderList) {
		this.orderList = orderList;
	}

	public ArrayList<OrderPart> getOrderList() {
		return this.orderList;
	}

}
