package com.lhf.java1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {
	static String DEFAULT_TIMEZONE = "GMT+8";
	static String DEFAULT_FORMAT = "d-MMM-yyyy HH:mm (z)";

	/**
	 * ת��ʱ��ʱ��
	 * 
	 * @param convertString  ��Ҫת��ʱ���ַ���
	 * @param format         ��ʽ���ַ��� ����d-MMM-yyyy HH:mm (z)
	 * @param sourceTimeZone Դʱ��ʱ��
	 * @param targetTimeZone Ŀ��ʱ��ʱ��
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

		// ��ȡ�����ʱ��ֵ
		Long time = new Date(sdf.parse(convertString).getTime()).getTime();

		// ��ȡԴʱ��ʱ����Ե�GMTʱ��
		Long sourceRelativelyGMT = time - TimeZone.getTimeZone(sourceTimeZone).getRawOffset();

		// GMTʱ��+Ŀ��ʱ��ʱ����ƫ������ȡĿ��ʱ��
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
