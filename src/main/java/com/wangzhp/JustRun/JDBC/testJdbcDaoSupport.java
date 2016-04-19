package com.wangzhp.JustRun.JDBC;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class testJdbcDaoSupport extends JdbcDaoSupport {

	@Autowired
	public void setDataSource2(DataSource DataSource) {
		setDataSource(DataSource);
	}

	public void testConnection() {

		System.out.println(getJdbcTemplate());

	}

	public int getCount() {

		String sql = "select count(*) from demo";
		long p = getJdbcTemplate().queryForObject(sql, Long.class);
		return (int) p;
	}

}
