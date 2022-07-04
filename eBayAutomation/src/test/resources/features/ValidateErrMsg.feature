Feature: Validate Err Msg if username is not entered 
	Scenario: Validate error message is populated or not
	Given I am on Home page of "https://www.ebay.com.au" 
	When I click on My eBay Summary and click on Continue
	Then it should throw error message
