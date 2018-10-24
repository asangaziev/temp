	@work
	Feature: Applying field 
	Scenario Outline: Validating the error message for fields
		Given user navigates to CreditNinja web page 
		And   user check url and title of the page 
		When  all the fields are empty in apply section 
		Then  user sends information "<firstName>" "<lastName>" "<email>" "<phoneNumber>"
		And   user clicks apply and validates error message
	
	Examples:
	
	| firstName | lastName |      email	                 | phoneNumber	|
	|           | Bond     | zhanuzak+88@creditninja.com  | 3123121234    |
	| James     |          | zhanuzak+88@creditninja.com  | 3123121234    |
	| James     | Bond     |                              | 3123121234    |
	| James     | Bond     | zhanuzak+88@creditninja.com  |               |
	| James     | Bond     | zhanuzak+88@creditninja.com  | 3123121234    |
	

	
	
	
	
	