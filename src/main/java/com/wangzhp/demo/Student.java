package com.wangzhp.demo;

public class Student {

	public Student(){
		
		
	}
	   
public Student(String name){
   this.name=name;		
		
	}
	   
	 
	   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void init(){
		
		System.out.println("init");
		
	}
	

	public void destory(){
		
		System.out.println("destory");
		
	}
	 
}
