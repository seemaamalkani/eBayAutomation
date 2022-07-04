package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAddToCartPageLocators {
	
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement searchTextBox;

	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[contains(text(),'Opens in a new window or tab')]")
	public WebElement selectItem;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//button[contains(text(),'No thanks')]")
	public WebElement clickNoThanks;
	
	@FindBy(xpath="//h1[contains(text(),'Shopping cart (1 item)')]")
	public WebElement verifyAddToCart;
		
}

