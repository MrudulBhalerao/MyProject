package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.loginPages;
import utils.BrowserSetUp;
import utils.excelReader;

public class loginToBankSite {
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void LoginToApplication(@Optional("firefox") String browser,@Optional("https://www.google.com") String url,String username, String password) throws IOException, InvalidFormatException {
		//WebDriver driver= BrowserSetUp.setBrowserAs(browser,url);
		BrowserSetUp browserSetup = new BrowserSetUp();
		browserSetup.setBrowserAs(browser);
		browserSetup.getDriver().get(url);
		
		
		//pages p = PageFactory.initElements(driver,pages.class);
		loginPages p = new loginPages(browserSetup.getDriver());
		p.loggedIn(username, password);
		
	}

}
