package com.lhf.java.sql;

/**
 * 
 * @ClassName: InsertSqlParser.java
 * @Description:  单句插入语句解析器
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 下午2:16:12
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