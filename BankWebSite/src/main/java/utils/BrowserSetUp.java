package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetUp {
	
	static WebDriver driver=null;
	
	public static void setBrowserAs(String browserType) {
		
		
		if(browserType.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup(); 
		driver= new ChromeDriver();
		Reporter.log("Chrome Browser launched successfully",true);
	     
		}else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup(); 
			
			driver= new FirefoxDriver();
			Reporter.log("Firefox Browser launched successfully",true);
			}
		else if (browserType.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup(); 
			driver= new InternetExplorerDriver();
			Reporter.log("Internet Explorer Browser launched successfully",true);
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	public WebDriver getDriver() {
		if(driver==null) {
			System.out.println("Check the driver setup");
		}
		return driver;
	}
		
	@AfterTest
	public void closingBrowser() {
		
		
		
	}
	
}
