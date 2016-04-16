package com.wangzhp.JustRun.JDBC;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class testJDBC {
	
   private ApplicationContext  ctc=null;
   {
	   
	   ctc=new ClassPathXmlApplicationContext("JDBC.xml");
	   
   }
	@Test
	public  void testDataSource() throws SQLException{
		
		DataSource ds=ctc.getBean(DataSource.class);
		System.out.println(ds.getConnection());
		System.out.println("----------------------");
		
	}
	
	
}
