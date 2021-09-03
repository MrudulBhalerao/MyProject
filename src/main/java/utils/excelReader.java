package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class excelReader {
	
	public static String[] read_excel() throws IOException {
		
		String path ="C://Users//Mrudul//Desktop//Mrudul//SeleniumWorkspace-Guru99 Project//BankWebSite//resources//TestDataSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		//OPCPackage pkg = OPCPackage.open(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Login Credentials");
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		String[] Credentials=new String[2];
		
		
		for (int row=1; row<=rowCount;row++) {
			
			//int cellCount = rw.getLastCellNum()-rw.getFirstCellNum
				Credentials[0]=sh.getRow(row).getCell(0).getStringCellValue();
				Reporter.log(Credentials[0], true);
				
				Credentials[1]=sh.getRow(row).getCell(1).getStringCellValue();
				Reporter.log(Credentials[1], true);
			
		}
		return Credentials;
		
	}

}
