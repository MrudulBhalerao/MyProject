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

public class BrowserSetUp {
	
	static WebDriver driver=null;
	
	public static void setBrowserAs(String browserType, String url) {
		
		
		if(browserType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrudul\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		Reporter.log("Chrome Browser launched successfully",true);
	     
		}else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "<Path>");
			driver= new FirefoxDriver();
			Reporter.log("Firefox Browser launched successfully",true);
			}
		else if (browserType.equalsIgnoreCase("internet explorer")) {
			System.setProperty("webdriver.ie.driver", "<path>");
			driver= new InternetExplorerDriver();
			Reporter.log("Internet Explorer Browser launched successfully",true);
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
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
