package StepDefinitions;

import cucumber.api.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public void setuo() {
		SeleniumDriver.setUpDriver();
	}

}
