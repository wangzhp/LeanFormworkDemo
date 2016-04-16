package com.wangzhp.JustRun.SpringAOP.Xml;

import org.springframework.stereotype.Service;

@Service
public class Tagert implements DiymicPoxyInterface {
          
	     
	      public String Play(String i,String b) {
	     
			 System.out.println("play...");
			 return "转而又返回值";
		}
}
