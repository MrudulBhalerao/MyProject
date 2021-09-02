package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class browserSetUp {
	
    
	
	public static WebDriver setBrowserAs(String browserType, String url) {
		WebDriver driver=null;
		
		if(browserType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrudul\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	     
		}else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "<Path>");
			driver= new FirefoxDriver();
			}
		else if (browserType.equalsIgnoreCase("internet explorer")) {
			System.setProperty("webdriver.ie.driver", "<path>");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	
		return driver;
		
		
		}
	
		
	@AfterTest
	public void closingBrowser() {
		
		
		
	}
	
}
