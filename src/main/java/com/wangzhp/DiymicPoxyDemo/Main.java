package com.wangzhp.DiymicPoxyDemo;

public class Main {

	
	public static void main(String[] args) {
		     
		MyDiymicPoxy poxy=new MyDiymicPoxy();
		Tagert obj=new Tagert();
		poxy.setObj(obj);
		DiymicPoxyInterface o=	(DiymicPoxyInterface) poxy.GetProxy();
	    o.Play();

		poxy.setObj(new InstanceClassDemo());
		InstanceClassDemo d=(InstanceClassDemo) poxy.GetProxy();
				d.Say();
		
		System.out.println("Ö´ÐÐÍê±Ï£¡£¡");
	}
}
