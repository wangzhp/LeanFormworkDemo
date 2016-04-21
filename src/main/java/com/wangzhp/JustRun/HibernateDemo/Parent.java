package com.wangzhp.JustRun.HibernateDemo;

import java.util.HashSet;
import java.util.Set;

public class Parent{  
	  private String id;  
	  private String name;  
	  public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	private Set children = new HashSet();  
	}  
	