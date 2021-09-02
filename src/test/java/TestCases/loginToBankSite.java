package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.browserSetUp;

public class loginToBankSite {
	
	//@Parameters({"browser","url"})
	@Test
	public void LoginToApplication(@Optional("firefox")String browser, @Optional("https://google.com")String url) {
		WebDriver driver= browserSetUp.setBrowserAs(browser,url);
		
	}

}
