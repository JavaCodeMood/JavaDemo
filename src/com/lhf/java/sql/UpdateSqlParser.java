package com.lhf.java.sql;

/**
 * 
 * @ClassName: UpdateSqlParser.java
 * @Description: 单句更新语句解析器
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 下午2:11:39
 */
public class UpdateSqlParser extends BaseSingleSqlParser {
	public UpdateSqlParser(String originalSql) {
		super(originalSql);
	}

	@Override
	protected void initializeSegments() {
		segments.add(new SqlSegment("(update)(.+)(set)", "[,]"));
		segments.add(new SqlSegment("(set)(.+)( where | ENDOFSQL)", "[,]"));
		segments.add(new SqlSegment("(where)(.+)( ENDOFSQL)", "(and|or)"));
	}
}
