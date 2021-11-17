package PO;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utils.BrowserSetUp;
import utils.excelReader;


public class loginPages {
	
	//BrowserSetUp browser = new BrowserSetUp();
	
	WebDriver driver;
	
	public loginPages(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="uid")
	private WebElement username;

	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
    private WebElement login;
	
//	public pages() throws IOException, InvalidFormatException{
//		String[] loginCred=excelReader.read_excel();
//	}
//	
	
	public void enterUsername(String arg) throws IOException {
		username.sendKeys(arg);
		//browser.getDriver().findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(arg);
		//driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(arg);
		
	}

	
	public void enterPassword(String arg) {
		password.sendKeys(arg);
		//browser.getDriver().findElement(By.name("password")).sendKeys(arg);
		//driver.findElement(By.name("password")).sendKeys(arg);
	}
	
	public void clickLogin() {
		login.click();
		//browser.getDriver().findElement(By.name("btnLogin")).click();
		//driver.findElement(By.name("btnLogin")).click();
	}
	
	public void loggedIn(String uid, String pwd) throws IOException {
		PageFactory.initElements(driver, this);
		enterUsername(uid);
		enterPassword(pwd);
		clickLogin();
		
		String actual=driver.getTitle();
		String expected ="Guru99 Bank Manager HomePage";
		Assert.assertEquals(actual, expected);
		Reporter.log("Successfully logged in to the Application", true);
		
	}
}
