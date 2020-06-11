package com.lhf.java1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {
	static String DEFAULT_TIMEZONE = "GMT+8";
	static String DEFAULT_FORMAT = "d-MMM-yyyy HH:mm (z)";

	/**
	 * 转换时间时区
	 * 
	 * @param convertString  需要转的时间字符串
	 * @param format         格式话字符串 例如d-MMM-yyyy HH:mm (z)
	 * @param sourceTimeZone 源时间时区
	 * @param targetTimeZone 目标时间时区
	 * @return
	 * @throws ParseException
	 */
	public static Date ConverDateGMT(String convertString, String format, String sourceTimeZone, String targetTimeZone)
			throws ParseException {

		Date date = null;

		if (isEmpty(sourceTimeZone)) {
			sourceTimeZone = DEFAULT_TIMEZONE;
		}

		if (isEmpty(targetTimeZone)) {
			targetTimeZone = DEFAULT_TIMEZONE;
		}

		if (isEmpty(format)) {
			format = DEFAULT_FORMAT;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);

		// 获取传入的时间值
		Long time = new Date(sdf.parse(convertString).getTime()).getTime();

		// 获取源时区时间相对的GMT时间
		Long sourceRelativelyGMT = time - TimeZone.getTimeZone(sourceTimeZone).getRawOffset();

		// GMT时间+目标时间时区的偏移量获取目标时间
		Long targetTime = sourceRelativelyGMT + TimeZone.getTimeZone(targetTimeZone).getRawOffset();

		date = new Date(targetTime);

		return date;

	}

	/**
	 * Check empty string
	 * 
	 * <pre>
	 * null: true "": true " ":true </>
	 *
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		boolean emptyFlg = false;
		if (null == value || value.trim().length() <= 0) {
			emptyFlg = true;
		}
		return emptyFlg;
	}
}
