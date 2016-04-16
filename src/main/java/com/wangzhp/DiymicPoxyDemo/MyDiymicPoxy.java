package com.wangzhp.DiymicPoxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyDiymicPoxy {

	  private Object Obj;
	  public void setObj(Object obj) {
		Obj = obj;
	}
	 
	  public Object GetProxy() {
		
		return Proxy.newProxyInstance(Obj.getClass().getClassLoader(),Obj.getClass().getInterfaces(),new InvocationHandler() {
			
			public Object invoke(Object obj, Method md, Object[] arg2) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("执行前....");
				Object o= md.invoke(Obj,arg2);
				System.out.println("执行后....");

				return o;
			}
		});
	}
	
	
}
