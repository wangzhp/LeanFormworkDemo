package com.wangzhp.demo.testAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangzhp.JustRun.Controller.testController;
import com.wangzhp.JustRun.Repository.test;
import com.wangzhp.JustRun.Repository.testRepositoryImpl;
import com.wangzhp.JustRun.Service.UserService;

public class testSpring {
    
	public static void main(String[] args) {
	    ApplicationContext  act=new ClassPathXmlApplicationContext("Annotation.xml");
	
//	    testObject obj=   (testObject) act.getBean("testObject");
//   System.out.println(obj);
//	    testService service=    (testService) act.getBean("testService");
//	    System.out.println(service);
	    testRepositoryImpl repository=    (testRepositoryImpl) act.getBean("testRepository");
	    System.out.println(repository);
	    
	    test r=    (test) act.getBean("test");
	    System.out.println(r);
	    System.out.println("-----------------------");
	    
	    
	    testController  t= (testController) act.getBean("testController");
	    t.excute();
	    System.out.println("-----------------------");
	    
	    
	    UserService  u= (UserService) act.getBean("userService");
	    u.excute();
	    
	}
	
	
	
}
