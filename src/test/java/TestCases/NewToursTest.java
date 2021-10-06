package TestCases;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.NewToursPage;
import utils.BrowserSetUp;
import utils.excelReader;

public class NewToursTest {
	
	BrowserSetUp driver = new BrowserSetUp();
	
	@Test
	@Parameters({"username"})
	public void newToursTesting(String username) throws IOException {
		
	
		Map<String,List<String>>userInputsFromFile=excelReader.read_excel();
		if(userInputsFromFile.containsKey(username)) {
		
		NewToursPage newTours = PageFactory.initElements(driver.getDriver(), NewToursPage.class);
		newTours.clickNewToursLink();
		newTours.clickOnLeftSideOption(userInputsFromFile.get(username).get(1));
		newTours.chooseTriptype(userInputsFromFile.get(username).get(2));
		newTours.selectNoOfPassengers(userInputsFromFile.get(username).get(3));
		newTours.selectDepartStation(userInputsFromFile.get(username).get(4));
		}
	}

}
