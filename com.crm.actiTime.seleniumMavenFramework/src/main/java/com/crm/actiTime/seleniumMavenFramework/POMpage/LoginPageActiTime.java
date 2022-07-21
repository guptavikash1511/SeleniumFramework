  package com.crm.actiTime.seleniumMavenFramework.POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActiTime {
	WebDriver driver;
	
	public LoginPageActiTime(WebDriver  driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(name="username")
	WebElement usernameTxtField;
	
	@FindBy(name="pwd")
	WebElement passwordTxtField;
	
	@FindBy(id ="loginButton")
	WebElement loginbutton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameTxtField() {
		return usernameTxtField;
	}

	public WebElement getPasswordTxtField() {
		return passwordTxtField;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}

	//Business Logic
	
	public void loginaction(String username,String password) {
		usernameTxtField.sendKeys(username);
		passwordTxtField.sendKeys(password);
		loginbutton.click();
		
	}

	

	
	
}


