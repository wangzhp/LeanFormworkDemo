package com.wangzhp.JustRun.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class testDao {

	@Autowired
	private JdbcTemplate template;

	public int GetCount() {

		String sql = "select count(*) from demo";
		long p = template.queryForObject(sql, Long.class);
		return (int) p;
	}

}
