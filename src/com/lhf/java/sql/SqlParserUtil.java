package com.lhf.java.sql;

import java.util.List;

/**
 * 
 * @ClassName: SqlParserUtil.java
 * @Description: ����Sql���������칤��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��4��18�� ����2:17:52
 */
public class SqlParserUtil {
	/** */
	/**
	 * ��������Ҫ��� @param sql:Ҫ������sql��� @return ���ؽ������
	 */
	public String getParsedSql(String sql) {
		sql = sql.trim();
		sql = sql.toLowerCase();
		sql = sql.replaceAll("\\s{1,}", " ");
		sql = "" + sql + " ENDOFSQL";
		// System.out.println(sql);
		return SingleSqlParserFactory.generateParser(sql).getParsedSql();
	}

	/** */
	/**
	 * SQL�������Ľӿ� @param sql:Ҫ������sql��� @return ���ؽ������
	 */
	public List<SqlSegment> getParsedSqlList(String sql) {
		sql = sql.trim();
		sql = sql.toLowerCase();
		sql = sql.replaceAll("\\s{1,}", " ");
		sql = "" + sql + " ENDOFSQL";
		// System.out.println(sql);
		return SingleSqlParserFactory.generateParser(sql).RetrunSqlSegments();
	}
}