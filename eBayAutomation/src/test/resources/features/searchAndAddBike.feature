@SearchAndAddBikeTocart
Feature : Search bike and add to cart
	In order to test whether bike is added to cart 
	
	Scenario: Validate Add to cart page
	Given I am on Home page of "https://www.ebay.com.au" 
	When I search for "bike" and add to cart
	Then Validate Add to cart page 
	
	
