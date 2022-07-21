package com.crm.actiTime.seleniumMavenFramework.testNG;
 import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;
	import java.util.stream.IntStream;

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
	
	
import com.crm.actiTime.seleniumMavenFramework.POMpage.HomePageActiTime;
import com.crm.actiTime.seleniumMavenFramework.POMpage.LoginPageActiTime;
import com.crm.actiTime.seleniumMavenFramework.POMpage.TaskPageActiTime;
import com.crm.actiTime.seleniumMavenFramework.genericUtility.BaseClass;
import com.crm.actiTime.seleniumMavenFramework.genericUtility.ExcelUtility;
import com.crm.actiTime.seleniumMavenFramework.genericUtility.JavaUtility;

	public class VerifyHomePageActiTime  extends BaseClass{
		
		
     	@Test
		public void verifyTitleOfHomePage() throws IOException, InterruptedException {
			JavaUtility  JU = new JavaUtility();
			int randomNo = JU.randomnumber(1000);
			
			String expectedCustomerName = "TestYantra"+randomNo;
			
			String url = JU.getDataFromPropertyFile("url");
			String username = JU.getDataFromPropertyFile("username");
			String password = JU.getDataFromPropertyFile("password");

			//Fetch Data from Excel
			ExcelUtility EU=new ExcelUtility();
	        String expectedTitle = EU.getDataFromExcel("Sheet1",1,0);
		
			
			//Login Action
			LoginPageActiTime loginpg = new LoginPageActiTime(driver);
			loginpg.loginaction(username, password);
			
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			System.out.println(expectedTitle);
			
			//Verifying Title of Home page
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Title is verified");
			Reporter.log("Note: Test Case not Passed");
			
			HomePageActiTime home = new HomePageActiTime(driver);
			 home.getClickOnTaskButton();
			
			TaskPageActiTime tskpg = new TaskPageActiTime(driver);
			tskpg.addNewCustomer(expectedCustomerName, "This is the description");
			
			 String actualCutomerName = tskpg.verifyCutomerName(expectedCustomerName);
			
			 Assert.assertEquals(actualCutomerName, expectedCustomerName);
			 System.out.println("Pass: Customer is verified");
			 
			Thread.sleep(5000);
			
			home.logoutaction();
			
			driver.quit();

	}
	}

