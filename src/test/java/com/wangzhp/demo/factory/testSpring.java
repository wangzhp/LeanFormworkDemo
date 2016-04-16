package com.wangzhp.demo.factory;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangzhp.demo.Student;

public class testSpring {
    
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  p=new ClassPathXmlApplicationContext("cicle.xml");
	
		Student pp=  (Student) p.getBean("realBean");//factoryBean
	    
	    System.out.println(pp);
	 //   pp.Say();
	    
	    p.close();
	}
	
	
	
}
