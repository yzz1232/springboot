package com.conf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//
//@Aspect
//@Component

public class AopConfig {
	
	@Pointcut("execution(public * com.controller..*.*(..))")
    public void webLog(){
		
	}
	
	 @Around("execution(public * com.controller..*.*(..))")
	 public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable{  
		 System.out.println("123");
		 return pjp.proceed();
	 }
	
}	
