package pages.action;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchAddToCartPageLocators;
import pages.locators.validateErrMsgLocators;
import utilities.SeleniumDriver;

public class validateErrMsgActions {
	
	validateErrMsgLocators ValidateErrMsgLocators = null;
	
	public validateErrMsgActions() {
		this.ValidateErrMsgLocators = new validateErrMsgLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ValidateErrMsgLocators);
	}

	public void navigateToEbaySummaryAndContinue() {
		ValidateErrMsgLocators.myeBay.click();
		ValidateErrMsgLocators.myEBaySummary.click();
		ValidateErrMsgLocators.textBox.isDisplayed();
		ValidateErrMsgLocators.continueButton.click();
	}
	
	public void validateErrorMsg() {
		ValidateErrMsgLocators.errorMsg.isDisplayed();
	}
}
