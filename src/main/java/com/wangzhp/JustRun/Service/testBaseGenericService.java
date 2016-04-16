package com.wangzhp.JustRun.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangzhp.JustRun.Repository.testGenericRepository;


public class testBaseGenericService<T> {
    @Autowired
	private  testGenericRepository tgr;
	public void excute(){
		  System.out.println(tgr);
		
	}
}
