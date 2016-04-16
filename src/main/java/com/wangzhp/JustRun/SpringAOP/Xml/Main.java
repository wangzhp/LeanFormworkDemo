package com.wangzhp.JustRun.SpringAOP.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        
	
	public static void main(String[] args) {
		
		   ApplicationContext  act=new ClassPathXmlApplicationContext("AspjectAop.xml");
		   DiymicPoxyInterface t=(DiymicPoxyInterface)act.getBean("target");
		   t.Play("ss", "11");
	}
}
