package com.crm.actiTime.seleniumMavenFramework.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fisExcel = new FileInputStream("./commonTestdata/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		String expected=wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		
		return expected;
		
		

				
	}

}
