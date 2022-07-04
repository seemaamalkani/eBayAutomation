package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.SearchAddBikeActions;
import pages.action.validateErrMsgActions;
import utilities.SeleniumDriver;

public class eBayStepDef {
	
	SearchAddBikeActions searchAddBikeActions = new SearchAddBikeActions();
	validateErrMsgActions ValidateErrMsgActions = new validateErrMsgActions();
	
	
  @Given("^I am on Home page of \"([^\"]*)\" $")
  public void given(String url) throws Throwable {
	  SeleniumDriver.openPage(url);
  }

  @When("^I search for \"([^\"]*)\" and add to cart $")
  public void when(String bikeName) throws Throwable {
	  System.out.println("Bike Name" +bikeName);
	  searchAddBikeActions.searchAndAddBikeToCart(bikeName);
  }

  @Then("^Validate Add to cart page")
  public void then() throws Throwable {
	  searchAddBikeActions.validateCart();
  }
  

  @When("^I click on My eBay Summary and click on Continue")
  public void I_click_on_My_eBay_Summary_and_click_on_Continue(String bikeName) throws Throwable {
	  System.out.println("Bike Name" +bikeName);
	  ValidateErrMsgActions.navigateToEbaySummaryAndContinue();
  }

  @Then("^it should throw error message")
  public void it_should_throw_error_message() throws Throwable {
	  ValidateErrMsgActions.validateErrorMsg();
}
}
