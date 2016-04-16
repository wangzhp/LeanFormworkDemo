package com.wangzhp.demo.cicle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangzhp.demo.Student;

public class testSpring {
    
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  p=new ClassPathXmlApplicationContext("cicle.xml");
	
		Student pp=  (Student) p.getBean("Stu");
	    
	    System.out.println(pp);
	 //   pp.Say();
	    
	    p.close();
	}
	
	
	
}
