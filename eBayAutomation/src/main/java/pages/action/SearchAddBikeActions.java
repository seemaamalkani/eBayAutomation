package pages.action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchAddToCartPageLocators;
import utilities.SeleniumDriver;

public class SearchAddBikeActions {

	SearchAddToCartPageLocators searchAddToCartPageLocators=null; 
	
	public SearchAddBikeActions() {
		this.searchAddToCartPageLocators = new SearchAddToCartPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchAddToCartPageLocators);
	}
	
	public void searchAndAddBikeToCart(String bikeName) {
		Actions action = new Actions(SeleniumDriver.getDriver());
		searchAddToCartPageLocators.searchTextBox.sendKeys(bikeName);
		searchAddToCartPageLocators.searchButton.click();
		searchAddToCartPageLocators.selectItem.click();
		SeleniumDriver.switchToNewWindow();
		searchAddToCartPageLocators.addToCartButton.click();
		searchAddToCartPageLocators.clickNoThanks.click();
	}
	
	public void validateCart() {
		searchAddToCartPageLocators.verifyAddToCart.isDisplayed();
	}
	
}
