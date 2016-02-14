package com.natalia;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ReminderWithAnnotation {
	
	@Pointcut("execution(* com.natalia.Apple.green(..))")
	public void green(){}
	
	@Pointcut("execution(* com.natalia.Apple.red(..))")
	public void red(){}

	@Before("green()")
	public void before() {
		System.out.println("Before by Annotation");
	}
	
	@AfterReturning("green()")
	public void after() {
		System.out.println("After by Annotation");
	}
	
	@Before("red()")
	public void beforeRed() {
		System.out.println("Before by Annotation");
	}
	
	@AfterReturning("red()")
	public void afterRed() {
		System.out.println("After by Annotation");
	}

}
