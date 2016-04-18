package com.wangzhp.JustRun.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class testHibernate {

	@Test
	public void test() {

		Configuration config = new Configuration().configure();

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		TRegister rg = new TRegister();

		rg.setAge(22);
		rg.setSex("nan11");
		rg.setUserName("wangzh122221");
		rg.setUserPwd("wangzh221111111222");

		session.save(rg);

		tx.commit();
		session.close();
		factory.close();
		System.out.println("±£´æ³É¹¦£¡");

	}
}
