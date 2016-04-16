package com.wangzhp.JustRun.SpringAOP;

import java.util.Arrays;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class TestAspect {

//	   @Before("execution(* com.wangzhp.JustRun.SpringAOP.Tagert.*(..))")
//	    public void BeforeMethod(JoinPoint point){
//		 String methodName=  point.getSignature().getName();
//		
//	    	  System.out.println(methodName+"BeforeMethod..."+Arrays.asList(point.getArgs()));
//	    	
//	    }
	   
//	   @AfterThrowing(value="execution(* com.wangzhp.JustRun.SpringAOP.Tagert.*(..))",throwing="res")
//	    public void ExceptionMethod(Object res){
//	    	
//	    	    System.out.println(res);
//	    }
//	   
	   
	   @AfterReturning(value="execution(* com.wangzhp.JustRun.SpringAOP.Tagert.*(..))",returning="res")
    public void ReturnlingMethod(Object res){
    	
    	    System.out.println(res);
    }
   
	
//	   @Around(value="execution(* com.wangzhp.JustRun.SpringAOP.Tagert.*(..))")
//	    public void AroundMethod(ProceedingJoinPoint pjp){
//		   
//		   System.out.println("执行前");
//		   try {
//			pjp.proceed();
//			  System.out.println("执行后");
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			  System.out.println("异常中");
//	             throw new RuntimeException(e);
//		}
//		   System.out.println("执行后");
//	    	 
//	    }
//	   
	
}
