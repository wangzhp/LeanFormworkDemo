package com.wangzhp.JustRun.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void test() {

	
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
		     
	 System.out.println(t);
		
	}

}
