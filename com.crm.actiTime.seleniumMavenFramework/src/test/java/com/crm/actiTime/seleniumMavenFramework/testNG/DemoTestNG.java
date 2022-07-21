package com.crm.actiTime.seleniumMavenFramework.testNG;

import org.testng.annotations.Test;

public class DemoTestNG{
	
	@Test(priority = 0,invocationCount = 4,threadPoolSize = 3)
	public void A() {
		System.out.println("demo test1 - Thread id "+ Thread.currentThread().getId());
		
		
	}
	@Test(priority = -1)
	public void B() {
		System.out.println("demo test2");
	}
	@Test
	public void C() {
		System.out.println("demo test3");
	}
	
}