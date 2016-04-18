package com.wangzhp.JustRun.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryFactoryImpl;
import org.hibernate.service.internal.SessionFactoryServiceRegistryFactoryInitiator;
import org.hibernate.service.internal.SessionFactoryServiceRegistryImpl;
import org.junit.Test;

public class testHibernate {

	@Test
	public void test() {

		Configuration config = new Configuration().configure();
		
        // ServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder().build();serviceRegistry
		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		TRegister rg = new TRegister();

		rg.setAge(22);
		rg.setSex("nan11");
		rg.setUserName("wangzh122221");
		rg.setUserPwd("wangzh221111111222");

		Object o= session.save(rg);
        System.out.println(o);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("±£´æ³É¹¦£¡");

	}
}
