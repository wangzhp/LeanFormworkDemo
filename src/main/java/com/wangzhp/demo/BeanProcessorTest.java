package com.wangzhp.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessorTest  implements   BeanPostProcessor	{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("postProcessAfterInitialization..."+beanName);
		Student stu=(Student) bean;
		stu.setName("testEdit...");
		
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("postProcessBeforeInitialization..."+beanName);
		return bean;
	}

}
