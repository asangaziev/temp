package step_definitions.api;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class Search_repositories_author_step_def {

	RequestSpecification request;
	Response response;
	String searchURL;
	String expectedAuthor;

	@Given("^Accept type is JSON$")
	public void accept_type_is_JSON() {

		request = given().accept(ContentType.JSON);

	}

	@When("^an unauthenticated user searches users by valid author name \"([^\"]*)\"$")
	public void an_unauthenticated_user_searches_users_by_valid_author_name(String authorName) {

		expectedAuthor  =  authorName;
		searchURL       =  ConfigReader.getProperty("searchGitUser");
		response        =  request.get(searchURL + authorName);

	}

	
	@Then("^status code is (\\d+)$")
	public void status_code_is(int expectedStatusCode) {

		assertEquals(response.getStatusCode(), expectedStatusCode, 
				"Status code is not matching");
		
	}

	@Then("^response content should contain login as \"([^\"]*)\"$")
	public void response_content_should_contain_login_as(String userName) {
		List<Map> listOfLogin = response.body().jsonPath().getList("items", Map.class);
		
		assertEquals(userName, listOfLogin.get(0).get("login"),
				"The login is not displayed as expected");
		}
		
		
	
}



	
	
	



