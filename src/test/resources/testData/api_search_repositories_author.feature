@ApiGet	
Feature: Search Repositories API request by author name

Scenario: GET request with author name 
  	Given Accept type is JSON
	When an unauthenticated user searches users by valid author name "Jack Snitkovsky"
	Then status code is 200
	And response content should contain login as "jsnitkov"



	
	
	
	
	
	
	