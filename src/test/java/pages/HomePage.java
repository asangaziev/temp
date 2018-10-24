package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.BrowserUtils;
import utilities.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='navbar-brand']")
	public WebElement CreditNinjaLogo;
	
	@FindBy(xpath = "//img[@class='img-fluid header__image']")
	public WebElement NinjaImage;

	@FindBy(xpath = "//div[@id='desktop-menu']//a[.='FAQ']")
	public WebElement FAQ;

	@FindBy(xpath = "//div[@id='desktop-menu']//a[.='Contact Us']")
	public WebElement ContactUs;

	@FindBy(xpath = "//div[@id='desktop-menu']//a[.='Log In']")
	public WebElement Login;

	@FindBy(xpath = "//div[@id='desktop-menu']//a[@href='/loan_application/about_you']")
	public WebElement ApplyNow1;

	@FindBy(xpath = "//div[@class='header__title-content']//a[@href='/loan_application/about_you']")
	public WebElement ApplyNow2;

	@FindBy(xpath = "//div[@class='section__description']//a[@class='btn btn-small btn-green']")
	public WebElement ApplyNow3;
	
	@FindBy(xpath = "//div[@class='section__description']//p[@class='section__text']/a")
	public WebElement ApplyNow4Link;

	@FindBy(xpath = "//a[.='Read Our Faq']")
	public WebElement ReadOurFaq;

	@FindBy(xpath = "//a[.='Learn More']")
	public WebElement LearnMore;

	// Next 6 Elements are to Apply to CreditNinja.
	@FindBy(id = "loan_application_wizard_first_name")
	public WebElement FirstName;
	
	@FindBy(xpath = "//small[@class='text-help']")
	public WebElement errorMessage;

	@FindBy(id = "loan_application_wizard_last_name")
	public WebElement LastName;

	@FindBy(id = "loan_application_wizard_email")
	public WebElement EmailAddress;

	@FindBy(id = "loan_application_wizard_mobile_phone")
	public WebElement MobileNumber;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement ApplySubmitBtn;

	@FindBy(xpath = "//label[@class='label-checkbox']")
	public WebElement CheckBox;

	// This 3 Elements are responsible to Privacy/Terms/Licenses
	@FindBy(xpath = "//a[.='Privacy Policy']")
	public WebElement PrivacyPolicy;

	@FindBy(xpath = "//a[.='Terms & Conditions']")
	public WebElement TermsConditions;

	@FindBy(xpath = "//a[.='State Licenses']")
	public WebElement StatLicenses;

	// External links to CreditNinjas social media
	@FindBy(xpath = "//a[@class='footer__menu-social-link fa fa-facebook']")
	public WebElement FacebookBtn;

	@FindBy(xpath = "//a[@class='footer__menu-social-link fa fa-linkedin']")
	public WebElement LinkedInBtn;

	// This live chat is an iFrame
	@FindBy(xpath = "//span[.='Live Chat']")
	public WebElement LiveChat;

	@FindBy(id = "singleLine0")
	public WebElement liveFirstName;

	@FindBy(id = "singleLine1")
	public WebElement liveLastName;

	@FindBy(id = "singleLine2")
	public WebElement liveEmail;

	@FindBy(id = "btnSubmit")
	public WebElement liveSubmit;


	public void urlTitleVerify(String url, String title) {
		Assert.assertEquals(url,driver.getCurrentUrl());
		Assert.assertEquals(title, driver.getTitle());
	}

}
