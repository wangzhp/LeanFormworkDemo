package com.wangzhp.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    
	public static void main(String[] args) {
	    ApplicationContext  p=new ClassPathXmlApplicationContext("demo.xml");
	
	    person pp=  (person) p.getBean("demo");
	    String n=  pp.getStudent().getName();
	    System.out.println(n);
	 //   pp.Say();
	    
	    
	}
	
	
	
}
