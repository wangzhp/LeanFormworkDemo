package com.wangzhp.JustRun.JDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class testJDBC {
	
	private JdbcTemplate template;
	private testDao dao;
	private testJdbcDaoSupport jdbcDao;
   private ApplicationContext  ctc=null;
   {
	   
	   ctc=new ClassPathXmlApplicationContext("JDBC.xml");
	   template=(JdbcTemplate) ctc.getBean("jdbcTemplate");
	   dao=(testDao) ctc.getBean(testDao.class);
	   
	   jdbcDao=(testJdbcDaoSupport) ctc.getBean(testJdbcDaoSupport.class);
   }
   

   @Test
   public void testJdbcDaoSupport(){
	      
	   
	System.out.println( jdbcDao.getCount());
	       
   }
   
   
   @Test
   public void testDao(){
	      
	   
	 System.out.println( dao.GetCount());
	       
   }
   
   
   @Test
   public void QueryForlong(){
	   
	   
	   String sql="select count(*) from demo";

	 long p=  template.queryForObject(sql, Long.class);
	    System.out.println(p);
	   
   }
   
   
   @Test
   public void GetSingeEntity(){
	   
	   
	   String sql="select * from demo where name=?";
	   RowMapper<TestPerson>  row=new BeanPropertyRowMapper<TestPerson>(TestPerson.class);
	   
	   List<TestPerson> p=  template.query(sql, new Object[]{"wangzhp4"},row);
	    System.out.println(p);
	   
   }
	@Test
	public  void testDataSource() throws SQLException{
		
		DataSource ds=ctc.getBean(DataSource.class);
		System.out.println(ds.getConnection());
		System.out.println("----------------------");
		
	}
   
   
   /**
    * ≈˙¡ø≤Â»Î
    */
 //  @Test
//   public void BatchInsert(){
//	   
//	   String sql="insert into demo values(?)";
//	   
//	   List<Object[]>  list=new ArrayList<Object[]>();
//	   
//	    list.add(new Object[]{"wangzhp1"});
//	    list.add(new Object[]{"wangzhp2"});
//	    list.add(new Object[]{"wangzhp3"});
//	    list.add(new Object[]{"wangzhp4"});
//	   
//		  int[] num=  template.batchUpdate(sql, list);
//	      System.out.println(Arrays.asList(num));
//   }
//   
   
   
   /**
    * INSERT UPDATE DELETE
    */
//   @Test
//    public void testUpdate(){
//    	
//	   String sql="insert into demo values(?)";
//
//	   //template.update(sql,"");
//	  int num=  template.update(sql,"testName1");
//	    System.out.println(num);
//           
//    }
   

	
	
	
	
	
	
}
