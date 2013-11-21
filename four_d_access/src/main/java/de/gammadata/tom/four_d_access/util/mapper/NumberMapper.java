/**
 * 
 */
package de.gammadata.tom.four_d_access.util.mapper;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Allgemein nützliche Methoden fürs Mapping von nummerischen Werten
 * 
 * @author gfr_MB
 * 
 */
public class NumberMapper {

	public static final int CENT_SCALE = 2;
	public static final int MENGEN_SCALE = 6;
	public static final int POS_SCALE = 6;

	/**
	 * Convertieren und auf Cent runden
	 * 
	 * @param in
	 *            double
	 * @return BigDecimal
	 */
	public static BigDecimal convertWithRoundingToCent(double in) {

		BigDecimal res = new BigDecimal(in).setScale(CENT_SCALE,
				BigDecimal.ROUND_HALF_UP);

		return res;
	}

	/**
	 * Convertieren mit grösserer genauigkeit für Mengen runden
	 * 
	 * @param in
	 *            double
	 * @return BigDecimal
	 */
	public static BigDecimal convertMenge(double in) {

		BigDecimal res = new BigDecimal(in).setScale(MENGEN_SCALE,
				BigDecimal.ROUND_HALF_UP);

		return res;
	}

	/**
	 * Convertieren mit grösserer Genauigkeit für Pospreise
	 * 
	 * @param in
	 *            double
	 * @return BigDecimal
	 */
	public static BigDecimal convertPosPreis(double in) {

		BigDecimal res = new BigDecimal(in).setScale(POS_SCALE,
				BigDecimal.ROUND_HALF_UP);

		return res;
	}

	/**
	 * Konvertiert ein BigDecimal in double mit NPE check
	 * 
	 * @param inp
	 *            BigDecimal
	 * @return double
	 */
	public static double convertMenge(BigDecimal inp) {
		if (inp != null) {
			return inp.doubleValue();
		} else {
			return 0d;
		}

	}

	/**
	 * Mappt ein TomDatum Jahr-Monat-Tag und eine Tom-Zeit hh:mm in ein Java
	 * Date
	 * 
	 * @param date
	 *            java.sql.Date
	 * @param zeit
	 *            java.sql.Time
	 * @return Date
	 */
	public static java.util.Date map(java.sql.Date date, java.sql.Time zeit) {

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		Calendar tc = new GregorianCalendar();
		tc.setTime(zeit);
		int hour = tc.get(Calendar.HOUR_OF_DAY);
		int min = tc.get(Calendar.MINUTE);
		int sec = tc.get(Calendar.SECOND);

		Calendar cres = new GregorianCalendar(year, month, day, hour, min, sec);
		return cres.getTime();

	}

	/**
	 * Erzeugt ein Date, dass nur bei zur Minute genau ist
	 * 
	 * @param date
	 *            genaues datum
	 * @return Date nur minutengenau
	 */
	public static java.util.Date getDateWithOutMin(java.util.Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);

		Calendar cres = new GregorianCalendar(year, month, day, hour, min);
		return cres.getTime();

	}

}
