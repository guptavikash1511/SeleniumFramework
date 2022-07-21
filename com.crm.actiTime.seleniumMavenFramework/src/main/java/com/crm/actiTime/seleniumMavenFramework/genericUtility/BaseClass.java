package com.crm.actiTime.seleniumMavenFramework.genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.crm.actiTime.seleniumMavenFramework.POMpage.LoginPageActiTime;

public class BaseClass {
	public WebDriver driver;
	public JavaUtility ju=new JavaUtility();
	public LoginPageActiTime loginpg=new LoginPageActiTime(driver);

	@BeforeSuite
	public void bsConfig() {
	System.out.println("============DataBase connection is stablished============");	
	}
	
	@BeforeTest
	public void btConfig() {
		System.out.println("===========Parallel during cross browser execution is started========");
	}
	@Parameters("browser")
	@BeforeClass
	public void bcConfig(String browser) throws IOException {
		System.out.println("Open the Browser "+browser);
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
			else {
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/geckodriver.exe");
               driver=new FirefoxDriver();
			}
   			String url = ju.getDataFromPropertyFile("url");
   			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);	
 
	}
	@BeforeMethod
	public void bmConfig() throws IOException {
		System.out.println("Login to the application");
		String username = ju.getDataFromPropertyFile("username");
		String password = ju.getDataFromPropertyFile("password");
		loginpg.loginaction(username, password);
		
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("Logout from the Application");
	}
	@AfterClass
	public void acConfig() {
		System.out.println("Quit the browser");
     }
	@AfterTest
	public void atConfig() {
		System.out.println("===========Parallel during cross browser execution is done========");

	}
	@AfterSuite
	public void asConfig() {
		System.out.println("============DataBase connection is closed============");	

	}

}
