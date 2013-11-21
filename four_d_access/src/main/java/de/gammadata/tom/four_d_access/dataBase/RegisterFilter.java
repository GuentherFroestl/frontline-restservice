/*
 * RegisterFilter.java
 *
 * Created on 17. Oktober 2005, 13:26
 */

package de.gammadata.tom.four_d_access.dataBase;

import java.util.ArrayList;

/**
 * 
 * @author günther
 */
public class RegisterFilter {
	private int registerNummer;
	private String filterBez;
	private int sid;
	private int orderNummer;
	private String nativeQuery;
	protected ArrayList<QueryPart> queryList;
	protected ArrayList<OrderPart> orderList;

	/** Creates a new instance of RegisterFilter */
	public RegisterFilter() {
		queryList = new ArrayList<QueryPart>();
		orderList = new ArrayList<OrderPart>();
	}

	public void initLists() {
		queryList = new ArrayList<QueryPart>();
		orderList = new ArrayList<OrderPart>();
	}

	public void setRegisterNummer(int nummer) {
		this.registerNummer = nummer;
	}

	public int getRegisterNummer() {
		return registerNummer;
	}

	public void setOrderNummer(int nummer) {
		this.orderNummer = nummer;
	}

	public int getOrderNummer() {
		return orderNummer;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setFilterBez(String name) {
		this.filterBez = name;
	}

	public String getFilterBez() {
		return filterBez;
	}

	public void setQueryList(ArrayList<QueryPart> queryList) {
		this.queryList = queryList;
	}

	public ArrayList<QueryPart> getQueryList() {
		return this.queryList;
	}

	public void addQueryPart(QueryPart inp) {
		if (queryList != null)
			queryList.add(inp);
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
