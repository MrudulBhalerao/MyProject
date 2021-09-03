package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.pages;
import utils.browserSetUp;
import utils.excelReader;

public class loginToBankSite {
	
	
	@Test
	@Parameters({"browser","url"})
	public void LoginToApplication(@Optional("firefox") String browser,@Optional("https://www.google.com") String url) throws IOException, InvalidFormatException {
		WebDriver driver= browserSetUp.setBrowserAs(browser,url);
		
		String[] credentials=excelReader.read_excel();
		String uid=credentials[0];
		System.out.println(uid);
		String pwd=credentials[1];
		System.out.println(pwd);
		
		//pages p = PageFactory.initElements(driver,pages.class);
		pages p = new pages();
		p.loggedIn(uid, pwd);
		
	}

}
