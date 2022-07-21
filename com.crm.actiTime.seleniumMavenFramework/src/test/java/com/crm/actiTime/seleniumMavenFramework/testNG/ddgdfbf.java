package com.crm.actiTime.seleniumMavenFramework.testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ddgdfbf {
	
	@Test
	public void tc() throws EncryptedDocumentException, IOException {

		
	
			FileInputStream fisExcel = new FileInputStream("./commonTestdata/Book1.xlsx");
	       Workbook workbook = WorkbookFactory.create(fisExcel);
	       String expectedTitle = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	       System.out.println(expectedTitle);
	       
		
}
}
