package com.wangzhp.JustRun.Controller;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wangzhp.JustRun.Service.testService;


@Controller
public class testController {
       
 	@Resource(mappedName="")
	 private testService  serice;
	 
	 public void excute(){

		  System.out.println(serice);
		  serice.excute();

	 }
	
}
