package PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserSetUp;

public class NewToursPage {
	
	//BrowserSetUp browser = new BrowserSetUp();
	
	WebDriver driver;
	
	public NewToursPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//a[text()='New Tours']")
	private WebElement newTours;
	
	@FindBy(xpath="//a[text()='Flights']")
	private WebElement flights;
	

	public void clickNewToursLink() {
		newTours.click();
	}

	
	public void clickOnFlights() {
		
		flights.click();
	}
	
}
