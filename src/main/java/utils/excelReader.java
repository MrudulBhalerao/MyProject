package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class excelReader {
	
	public static void reader() throws IOException {
		
		String path ="C:\\Users\\Mrudul\\Desktop\\Mrudul\\SeleniumWorkspace-Guru99 Project\\BankWebSite\\resources\\TestDataSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Login Credentials");
		int rowCount = sh.getLastRowNum();
		
		
		
		for (int row=2; row<=rowCount;row++) {
			
		}
		
	}

}
