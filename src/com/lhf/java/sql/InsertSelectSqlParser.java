package com.lhf.java.sql;

/**
 * 
 * @ClassName: InsertSelectSqlParser.java
 * @Description: 单句查询插入语句解析器
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 上午11:48:05
 */
public class InsertSelectSqlParser extends BaseSingleSqlParser {
	public InsertSelectSqlParser(String originalSql) {
		super(originalSql);
	}

	@Override
	protected void initializeSegments() {
		segments.add(new SqlSegment("(insert into)(.+)( select )", "[,]"));
		segments.add(new SqlSegment("(select)(.+)(from)", "[,]"));
		segments.add(new SqlSegment("(from)(.+)( where | on | having | groups+by | orders+by | ENDOFSQL)",
				"(,|s+lefts+joins+|s+rights+joins+|s+inners+joins+)"));
		segments.add(new SqlSegment("(where|on|having)(.+)( groups+by | orders+by | ENDOFSQL)", "(and|or)"));
		segments.add(new SqlSegment("(groups+by)(.+)( orders+by| ENDOFSQL)", "[,]"));
		segments.add(new SqlSegment("(orders+by)(.+)( ENDOFSQL)", "[,]"));
	}
}
