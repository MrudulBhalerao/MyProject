package PractiveProblems;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testingWebsite {
   
	WebDriver driver= null;
	
@BeforeTest
public void testingWebSite() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.get("https://www.redbus.in/");
		}
		
@Test
public void runTest() {
		
		String date = "01-Oct-2021";
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.id("dest")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']/following::div/input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("//table//child::tr[@class='rb-monthHeader']//following::td[@class='monthTitle' & contains(text(),\"Oct 2021\")]//tr//tr/td[text=\"1\"]")).click();
		driver.findElement(By.id("search_btn")).click();
		}

@AfterTest
public void quitBrowser() {
//	driver.quit();
	
}
}

