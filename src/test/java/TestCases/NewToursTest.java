package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PO.NewToursPage;
import utils.BrowserSetUp;

public class NewToursTest {
	
	BrowserSetUp driver = new BrowserSetUp();
	@Test
	public void newToursTesting() {
		NewToursPage newTours = PageFactory.initElements(driver.getDriver(), NewToursPage.class);
		newTours.clickNewToursLink();
		newTours.clickOnFlights();
	}

}
