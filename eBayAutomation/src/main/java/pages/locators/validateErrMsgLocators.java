package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validateErrMsgLocators {

	
	@FindBy(xpath="// //a[@title='My eBay']")
	public WebElement myeBay;
	
	@FindBy(xpath="//a[contains(text(),'My eBay Summary')]")
	public WebElement myEBaySummary;
	
	@FindBy(xpath="/label[contains(text(),'Email or username')]")
	public WebElement textBox;
	
	@FindBy(xpath="//button[@id='signin-continue-btn']")
	public WebElement continueButton;
	
	@FindBy(xpath="///p[@id='errormsg']")
	public WebElement errorMsg;
}
