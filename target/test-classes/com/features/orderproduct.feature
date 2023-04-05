Feature: order an prduct in demoblaze site 

Scenario: user creates an new  account 
	Given user enters the url  
	When user clicks on signup button 
	And Enters his username and password 
	And clicks on signup 
	Then an alert window opens mentioning signup successful 
	
Scenario: user login into his account 
	
	 When user enters his valid username and password
	And clicks on LOGIN button 
	Then Welcome message with username is displayed 
	
Scenario: user orders nokia lumia 1520 phone 
	When  user clicks on NOkia lumia1520 phone 
	And clicks on Addto cart button 
	Then product added alert pops up 
	
Scenario: user places the orders in the cart 
	When user cliks on cart icon 
	And verifies the products he added 
	And clicks on placeorder 
	And user enters the "name" "country" "city" "credit card" "month" "year" 
	And clicks on Purchase button 
	Then Thank you for your purchase message is displayed 
	