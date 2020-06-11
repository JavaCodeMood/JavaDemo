package com.lhf.java.sql;

/**
 * 
 * @ClassName: DeleteSqlParser.java
 * @Description:单句删除语句解析器 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 下午2:16:47
 */
public class DeleteSqlParser extends BaseSingleSqlParser {
	public DeleteSqlParser(String originalSql) {
		super(originalSql);
	}

	@Override
	protected void initializeSegments() {
		segments.add(new SqlSegment("(delete from)(.+)( where | ENDOFSQL)", "[,]"));
		segments.add(new SqlSegment("(where)(.+)( ENDOFSQL)", "(and|or)"));
	}
}
