package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public static Map<String, List<String>> read_excel() throws IOException {
		Map<String,List<String>> userInputs= new HashMap<>(); //taking particular users input int hasmap <K,V>=<Username,otherfields>
		String path ="C://Users//Mrudul//Desktop//Mrudul//GitHub//resources//TestDataSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		//OPCPackage pkg = OPCPackage.open(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Login Credentials");
		int rowCount = sh.getPhysicalNumberOfRows();
		int cellCount = sh.getRow(0).getPhysicalNumberOfCells();
	
		for (int row=1; row<=rowCount-1;row++) {
			String keyAsUsername="";   //particular user
			List<String>valuesOfUser=new ArrayList<>(); //other inputs of user
			
			XSSFRow rw=sh.getRow(row);
			for(int col =0;col<=cellCount-1;col++) {
				
				String c=rw.getCell(col).getStringCellValue();
				if(col==0) {
					keyAsUsername=c;
					
				}else {
				valuesOfUser.add(c);
				
				}
			
			userInputs.put(keyAsUsername, valuesOfUser);
			
		}
		}
		
		return userInputs;
		
	}

}
