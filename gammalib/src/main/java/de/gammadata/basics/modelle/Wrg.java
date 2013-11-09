package de.gammadata.basics.modelle;
/**
 * Beschreibt Geld nach Betrag und Währung
 * @author gfr
 *
 */
public interface Wrg {
	
	public void setWrgBez(String bez);
	public String getWrgBez();
	public void setWrgSymbol(String bez);
	public String getWrgSymbol();
	/**
	 * wieviel bekommt man für 1 EUR in dieser WRG
	 * @param kurs
	 */
	public void setKurs(double kurs);
	/**
	 * wieviel bekommt man für 1 EUR in dieser WRG
	 * @param kurs
	 */
	public double getKurs();
	
	public static String EURO_SYMBOL="€";
	public static String USDOLLAR_SYMBOL="$";
	public static String BPD_SYMBOL="£";
	public static String YEN_SYMBOL="¥";
	
	public static String EURO="EUR";
	public static String USDOLLAR="USD";
	public static String BPD="BPD";
	public static String YEN="YEN";

}
