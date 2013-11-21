/*
 * OrderPart.java
 *
 * Created on 28. September 2005, 13:47
 */

package de.gammadata.tom.four_d_access.dataBase;

/**
 * 
 * @author günther
 */
public class OrderPart {
	private QueryOperant operant;

	private int orderOperator;
	public static final int asc = 64 + 1;
	public static final int desc = 64 + 2;

	/** Creates a new instance of OrderPart */

	public OrderPart() {
	}

	public OrderPart(QueryOperant inp, int operator) {
		operant = inp;
		orderOperator = operator;
	}

	public void setOperant(QueryOperant inp) {
		operant = inp;
	}

	public QueryOperant getOperant() {
		return operant;
	}

	public void setOrderOperator(int inp) {
		orderOperator = inp;
	}

	public int getOrderOperator() {
		return orderOperator;
	}
}
