package com.crm.actiTime.seleniumMavenFramework.POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageActiTime {
WebDriver driver;
	
	public HomePageActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//a[@Class='content tasks']")
	private WebElement clickOnTaskButton;

	public WebElement getClickOnTaskButton() {
		return clickOnTaskButton;
	}
	@FindBy(id ="logoutLink")
	WebElement logoutLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void logoutaction() {
		clickOnTaskButton.click();
		logoutLink.click();
	}

	
		
	
	
}
