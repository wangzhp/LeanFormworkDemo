package com.wangzhp.demo;

import java.util.HashMap;

public class InstanceFactory {

	  private   HashMap<String,Student> hm=null;

	   public InstanceFactory(){
		   
		   hm=new HashMap<String,Student>();
		      hm.put("wang1", new Student("wang1"));
		      hm.put("wang2", new Student("wang2"));
		      hm.put("wang3", new Student("wang3"));

		   
	   }
	   
	   public  Student getStudent(String name) {
			return hm.get(name);
		}
	
}
