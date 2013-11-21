/*
 * QueryArg.java
 *
 * Created on 27. September 2005, 10:43
 */

package de.gammadata.tom.four_d_access.dataBase;

/**
 * 
 * @author günther
 */
public class QueryPart {

	private int compareOperator = 0;
	public static final int allRecords = 1;
	public static final int greater = 2;
	public static final int greaterEqual = 3;
	public static final int less = 4;
	public static final int lessEqual = 5;
	public static final int startsWith = 10;
	public static final int contains = 11;
	public static final int equal = 16;
	public static final int notEqual = 17;

	private int logicOperator = 0;
	public static final int booleanAnd = 32 + 1;
	public static final int booleanOr = 32 + 4;
	public static final int not = 32 + 8;
	// public static final int notEqual = 17;
	public static final int bracketOpen = 32 + 16;
	public static final int bracketClose = 32 + 17;

	public static final int andBracketOpen = 32 + 18;
	public static final int orBracketOpen = 32 + 19;

	public static final String booleanAndTxt = "and";
	public static final String booleanOrTxt = "or";
	public static final String booleanNotTxt = "and";
	public static final String bracketOpenTxt = "(";
	public static final String bracketCloseTxt = ")";
	public static final String andBracketOpenTxt = "and(";
	public static final String orBracketOpenTxt = "or(";

	private QueryOperant operant1;
	private QueryOperant operant2;
	private boolean istJoin = false;
	private QueryOperant joinLeftTable;
	private QueryOperant joinRightTable;

	/** Creates a new instance of QueryPart */
	public QueryPart() {
	}

	public QueryPart(QueryOperant op1, int compareOperator) {
		this.compareOperator = compareOperator;
		this.operant1 = op1;
	}

	public QueryPart(int logicOperator) {
		this.logicOperator = logicOperator;
	}

	public QueryPart(QueryOperant op1, int compareOperator, QueryOperant op2) {
		this.compareOperator = compareOperator;
		this.operant1 = op1;
		this.operant2 = op2;
	}

	public QueryPart(int logicOperator, QueryOperant op1, int compareOperator,
			QueryOperant op2) {
		this.compareOperator = compareOperator;
		this.operant1 = op1;
		this.operant2 = op2;
		this.logicOperator = logicOperator;
	}

	public void setQuery(QueryOperant op1, int compareOperator, QueryOperant op2) {
		this.compareOperator = compareOperator;
		this.operant1 = op1;
		this.operant2 = op2;
	}

	public void setLogicOperator(int inp) {
		logicOperator = inp;
	}

	public int getLogicOperator() {
		return logicOperator;
	}

	public void setCompareOperator(int inp) {
		compareOperator = inp;
	}

	public int getCompareOperator() {
		return compareOperator;
	}

	public void setOperant1(QueryOperant inp) {
		operant1 = inp;
	}

	public QueryOperant getOperant1() {
		return operant1;
	}

	public void setOperant2(QueryOperant inp) {
		operant2 = inp;
	}

	public QueryOperant getOperant2() {
		return operant2;
	}

	public void setJoinLeftTable(QueryOperant inp) {
		joinLeftTable = inp;
		istJoin = true;
	}

	public QueryOperant getJoinLeftTable() {
		return joinLeftTable;
	}

	public void setJoinRightTable(QueryOperant inp) {
		joinRightTable = inp;
		istJoin = true;
	}

	public QueryOperant getJoinRightTable() {
		return joinRightTable;
	}

	public boolean isJoin() {
		return istJoin;
	}

}
