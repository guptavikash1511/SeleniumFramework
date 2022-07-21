 package com.crm.actiTime.seleniumMavenFramework.testNG;

import org.testng.annotations.Test;

public class SElectedProduct {
	
	@Test
	public void product() {
		System.out.println("product is selected");
	}
	@Test(dependsOnMethods="product")
	public void cart() {
		System.out.println("Product added to cart");
	}
	@Test(dependsOnMethods="cart")
	public void payment() {
		System.out.println("payment is complete");
	}

}
	/*
	@Test(enabled = false)
	public void product() {
		System.out.println("product is selected");
	}
	@Test
	public void cart() {
		System.out.println("Product added to cart");
	}
	@Test
	public void payment() {
		System.out.println("payment is complete");
	}

}
*/