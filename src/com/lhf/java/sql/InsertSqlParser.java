package com.lhf.java.sql;

/**
 * 
 * @ClassName: InsertSqlParser.java
 * @Description:  ���������������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��4��18�� ����2:16:12
 */
public class InsertSqlParser extends BaseSingleSqlParser {
	public InsertSqlParser(String originalSql) {
		super(originalSql);
	}

	@Override
	protected void initializeSegments() {
		segments.add(new SqlSegment("(insert into)(.+)([(])", "[,]"));
		segments.add(new SqlSegment("([(])(.+)( [)] values )", "[,]"));
		segments.add(new SqlSegment("([)] values [(])(.+)( [)])", "[,]"));
	}

	@Override
	public String getParsedSql() {
		String retval = super.getParsedSql();
		retval = retval + ")";
		return retval;
	}
}