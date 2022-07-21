package com.crm.actiTime.seleniumMavenFramework.testNG;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.actiTime.seleniumMavenFramework.genericUtility.BaseClass;

public class ParallelExecution1 extends BaseClass {
	
   @Test
	public void demo2() {
	   System.out.println("demo1 -thread id :"+Thread.currentThread().getId());
	    WebDriver driver=new FirefoxDriver();
		driver.manage().window().setPosition(new Point(1500, 0));
		driver.get("https://www.facebook.com/");
		
	}

}


