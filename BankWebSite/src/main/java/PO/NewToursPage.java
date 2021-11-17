package PO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.BrowserSetUp;

public class NewToursPage {
	
	WebDriver driver;
	
	public NewToursPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='New Tours']")
	private WebElement newTours;
	
	@FindBy(xpath="//a[contains(text(),'\"+Option+\"']")
	private WebElement optionSelected;
	
	
	@FindBy(xpath="//input[@name='tripType' and @value='+trip+']")
	private WebElement tripType;
	
	@FindBy(xpath="//select[@name='+passCount+']")
	private WebElement numberOfPassengers;
	
	@FindBy(xpath="//select[@name='+fromPort+']")
	private WebElement departingFrom;
	
	public void clickNewToursLink() {
		newTours.click();
	}

	public void clickOnLeftSidePanelOption(String Option) {
		optionSelected.click();
	}
	
	public void chooseTriptype(String trip) {
		tripType.click();
	}
	
	public void selectNoOfPassengers(String numb) {
		Select set = new Select(numberOfPassengers);
		set.selectByVisibleText(numb);
	}
	
	public void selectDepartStation(String station) {
		Select set = new Select(departingFrom);
		List<WebElement> allStations =set.getOptions();
		allStations.forEach(x -> System.out.println(x));
		
		set.selectByVisibleText(station);
	}
	
	
	
	
	
}
