package com.lhf.java.sql;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: BaseSingleSqlParser.java
 * @Description: ����Sql�����������伴��Ƕ�׵���˼
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��4��18�� ����2:17:30
 */
public abstract class BaseSingleSqlParser {
	/** */
	/**
	 * ԭʼSql���
	 */
	protected String originalSql;
	/** */
	/**
	 * Sql���Ƭ��
	 */
	protected List<SqlSegment> segments;

	/** */
	/**
	 * ���캯��������ԭʼSql��䣬�������֡� @param originalSql
	 */
	public BaseSingleSqlParser(String originalSql) {
		this.originalSql = originalSql;
		segments = new ArrayList<SqlSegment>();
		initializeSegments();
		splitSql2Segment();
	}

	/** */
	/**
	 * ��ʼ��segments��ǿ������ʵ��
	 *
	 */
	protected abstract void initializeSegments();

	/** */
	/**
	 * ��originalSql���ֳ�һ����Ƭ��
	 *
	 */
	protected void splitSql2Segment() {
		for (SqlSegment sqlSegment : segments) {
			sqlSegment.parse(originalSql);
		}
	}

	/** */
	/**
	 * �õ�������ϵ�Sql��� @return
	 */
	public String getParsedSql() {

		// �����������Ƭ�ε���Ϣ
		/*
		 * for(SqlSegment sqlSegment:segments) { String start=sqlSegment.getStart();
		 * String end=sqlSegment.getEnd(); System.out.println(start);
		 * System.out.println(end); }
		 */

		StringBuffer sb = new StringBuffer();
		for (SqlSegment sqlSegment : segments) {
			sb.append(sqlSegment.getParsedSqlSegment());
		}
		String retval = sb.toString().replaceAll("@+", "\n");
		return retval;
	}

	/** */
	/**
	 * �õ�������SqlƬ��
	 * 
	 * @return
	 */
	public List<SqlSegment> RetrunSqlSegments() {
		int SegmentLength = this.segments.size();
		if (SegmentLength != 0) {
			List<SqlSegment> result = this.segments;
			return result;
		} else {
			// throw new Exception();
			return null;
		}
	}
}
