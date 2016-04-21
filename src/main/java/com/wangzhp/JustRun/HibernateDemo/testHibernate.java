package com.wangzhp.JustRun.HibernateDemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
@SuppressWarnings("unchecked")
public class testHibernate {

	
	private	SessionFactory  factory;
	private Session session;
	private Transaction tx;
	@Before
	 public  void init(){
		
		Configuration config = new Configuration().configure();

		 factory = config.buildSessionFactory();

		 session = factory.openSession();
		 tx = session.beginTransaction();
		 System.out.println("开始执行------------------------------------");
	 }
	 
	  @After
	 public void after(){
		 
		    tx.commit();
			session.close();
			factory.close();
			 System.out.println("执行完毕------------------------------------");
	 }
	  
	  @Test
		public void testMapping() {
		  Parent p=new Parent();
		  Child c=new Child();
		 // c.setUuid("11");
		   c.setAddress("Addressads");
		   c.setPostCode("postCode2");
		   c.setUuid("uuid22");
		   c.setParent(p);
		   p.setName("wangzhp");
          //  p.setId("22");
		   p.getChildren().add(c);
		   System.out.println(p);
		  session.save(p);
		  System.out.println(p);
		   
	  }
	  @Test
	public void testSqlQuery() {
		  
		  List<TRegister> list=  session.createSQLQuery("select * from T_Register where userName=?")
				 
				  .addEntity(TRegister.class)
				.setString(0, "wangzh11")
				 .list();
				 // .setParameter("userName", "wangzh122221").list();
				 
		  for(TRegister t :list){
				 System.out.println(t.getUserName());
			}	
	  }
	  
	  @Test
		public void testCirtist() {

		List<TRegister> list= session.createCriteria(TRegister.class)
		      .add(Restrictions.eq("userName", "wangzh122221"))
		      .addOrder(Order.asc("userName"))
		      .setFirstResult(1)
		      .setMaxResults(5)
		      .list();
		     
		for(TRegister t :list){
			 System.out.println(t.getUserName());
		}	
		
	  }
	  
	  @Test
		public void testDelete() {
		  
			TRegister rg = new TRegister();
			rg.setId(1);
			session.delete(rg);
		  
	  }

	@Test
	public void testSave() {

	 
		TRegister rg = new TRegister();

		rg.setAge(22);
		rg.setSex("nan11");
		rg.setUserName("wangzh122221");
		rg.setUserPwd("wangzh221111111222");

		session.save(rg);

		
		System.out.println("保存成功！");

	}
	
	
	@Test
	public void testLoad(){
		   
		//TRegister t= session.get(TRegister.class, 1); //
		TRegister t= (TRegister)session.load(TRegister.class, 1);
		  System.out.println(t.getClass().getName());
		     
		  
		SQLQuery query=  session.createSQLQuery("select userName from t_register");

		List list=  query.list();
        t.setUserName("龙卷风");
		System.out.println(list);
		
	}

}
