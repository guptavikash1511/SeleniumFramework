package com.crm.actiTime.seleniumMavenFramework.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class JavaUtility {

	public int randomnumber(int limit) {
		Random random = new Random();
		int randomNo = random.nextInt(1000);
		
	return random.nextInt(limit);
}
	public String getDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fisProp = new FileInputStream("./commonTestdata/data1.properties");
		Properties property=new Properties();
		property.load(fisProp);
		
		
		return property.getProperty(key) ;
	}
	
	}

