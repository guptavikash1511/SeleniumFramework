package com.crm.actiTime.seleniumMavenFramework.testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class TESTStestng {
	String a[]= {"vikash","om","james"};
	 int  i=0;
	@Test(invocationCount = 3)
	public void tc1() {
	System.out.println(a[i]);	
	i++;	
	}

}
