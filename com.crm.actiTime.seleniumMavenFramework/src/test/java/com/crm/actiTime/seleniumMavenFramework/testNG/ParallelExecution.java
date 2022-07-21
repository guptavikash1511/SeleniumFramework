package com.crm.actiTime.seleniumMavenFramework.testNG;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.crm.actiTime.seleniumMavenFramework.genericUtility.BaseClass;

public class ParallelExecution extends BaseClass{
	
	@Test
	public void demo1() {
		   System.out.println("demo1 -thread id :"+Thread.currentThread().getId());
	}

}
