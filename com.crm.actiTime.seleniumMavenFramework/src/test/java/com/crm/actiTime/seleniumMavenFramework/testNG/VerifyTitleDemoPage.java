package com.crm.actiTime.seleniumMavenFramework.testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitleDemoPage {

	
	@Test
	public void VerifyTitleDemoPage() throws IOException {
		
	
	FileInputStream fis=new FileInputStream("./commonTestdata/data1.properties");
	Properties p=new Properties();
	p.load(fis);
	
	String url=p.getProperty("url");
	String username=p.getProperty("username");
	String password=p.getProperty("password");
	
	FileInputStream fis1=new FileInputStream("./commonTestdata/xyx.xlsx");
	Workbook wb=WorkbookFactory.create(fis1);
	String expectedTitle=wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
	
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleIs(expectedTitle));
	
	String actualTitle=driver.getTitle();
	
	System.out.println(expectedTitle);
	System.out.println(actualTitle);
	
	Assert.assertEquals(expectedTitle, actualTitle);
	System.out.println("Title is verified");
	
	Reporter.log("NOTe :Test case Not Passed");
	
	driver.quit();
	
	
	
	
	
	
	
			
	
}
}