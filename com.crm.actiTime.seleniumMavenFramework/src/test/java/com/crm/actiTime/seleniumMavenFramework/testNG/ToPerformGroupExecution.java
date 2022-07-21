package com.crm.actiTime.seleniumMavenFramework.testNG;

import org.testng.annotations.Test;

public class ToPerformGroupExecution {

	@Test(groups = "smokeTesting")
	public void login() {
		System.out.println("Logged in successfully");
	}
	@Test(groups = "smokeTesting")
	public void selectProduct() {
		System.out.println("product selected successfully");
	}
	@Test(groups = "regressionTesting")
	public void addTocart() {
		System.out.println("product added to cart successfully");
	}
	@Test(groups = "regressionTesting")
	public void payment() {
		System.out.println("payment done successfully");
	}
	@Test(groups = "regressionTesting")
	public void logout() {
		System.out.println("logout done successfully");
	}
}
