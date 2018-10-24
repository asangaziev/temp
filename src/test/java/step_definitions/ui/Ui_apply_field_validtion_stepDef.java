package step_definitions.ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ApplicationPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.DropDown;

public class Ui_apply_field_validtion_stepDef {
	WebDriver driver = Driver.getDriver();
	HomePage homePage = new HomePage();
//	ApplicationPage appPage = new ApplicationPage();

	@When("^all the fields are empty in apply section$")
	public void all_the_fields_are_empty_in_apply_section() {
		System.out.println("all fields test is done===============");

		String fname = homePage.FirstName.getAttribute("value");
		Assert.assertTrue(fname.isEmpty(), "The First Name is already exist");

		String lname = homePage.LastName.getAttribute("value");
		Assert.assertTrue(lname.isEmpty(), "The Last Name is already exist");

		String emailValue = homePage.EmailAddress.getAttribute("value");
		Assert.assertTrue(emailValue.isEmpty(), "The email is already entered");

		String mobile = homePage.MobileNumber.getAttribute("value");
		Assert.assertTrue(mobile.isEmpty(), "The mobile is entered");

		Assert.assertTrue(!homePage.CheckBox.isSelected(), "The check box is not selected");

	}

	@Then("^user sends information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_sends_information(String firstName, String lastName, String email, String phoneNumber) {
		homePage.FirstName.sendKeys(firstName);
		homePage.LastName.sendKeys(lastName);
		homePage.EmailAddress.sendKeys(email);
		homePage.MobileNumber.sendKeys(phoneNumber);

	}

	@Then("^user clicks apply and validates error message$")
	public void user_clicks_apply_and_validates_error_message() {
		homePage.ApplySubmitBtn.click();
		Assert.assertTrue(homePage.errorMessage.getText().equals(ConfigReader.getProperty("verMessage")),
				"This field is mendatory");

	}


}
