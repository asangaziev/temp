package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ApplicationPage {
	private WebDriver driver;

	public ApplicationPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='desktop-menu']//a")
	public WebElement LogOut;

	// About You
	// CREATE ACCOUNT
	// https://qa.creditninja.com/loan_application/about_you
	// for testing make sure that url's are matching
	@FindBy(id = "loan_application_wizard_first_name")
	public WebElement FirstName;

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

	// Where you live
	// Date of birth these are dropdown list
	// https://qa.creditninja.com/loan_application/about_your_work
	// for testing make sure that url's are matching
	@FindBy(xpath = "//div[@class='form-inline']/select[@id='loan_application_wizard_date_of_birth_2i']")
	public WebElement Month;

	@FindBy(xpath = "//div[@class='form-inline']/select[@id='loan_application_wizard_date_of_birth_3i']")
	public WebElement Day;

	@FindBy(xpath = "//div[@class='form-inline']/select[@id='loan_application_wizard_date_of_birth_1i']")
	public WebElement Year;

	// Home Street Address
	@FindBy(id = "loan_application_wizard_street_address")
	public WebElement Address;

	@FindBy(id = "loan_application_wizard_street_address2")
	public WebElement AptUnit;

	@FindBy(id = "loan_application_wizard_city")
	public WebElement City;

	@FindBy(id = "loan_application_wizard_state") // States are dropdown list
	public WebElement State;

	@FindBy(id = "loan_application_wizard_zip_code")
	public WebElement Zip;

	@FindBy(id = "loan_application_wizard_period_at_residence") // Dropdown list for leaving years
	public WebElement LivingYears;

	@FindBy(xpath = "//input[@value='rent']") // Radio button
	public WebElement Rent;

	@FindBy(xpath = "//input[@value='own']") // Radio button
	public WebElement Own;

	// Social Security Numbers
	@FindBy(xpath = "//input[@class='form-control password required custom-input-social-security-number']")
	public WebElement SSN;

	@FindBy(id = "social-security-number_confirmation")
	public WebElement SSNconfirm;

	// Military Duty
	@FindBy(xpath = "//div[@class='form-group loan_application_wizard_active_military']//input[@value='1']")
	public WebElement Yes;

	@FindBy(xpath = "//div[@class='form-group loan_application_wizard_active_military']//input[@value='0']")
	public WebElement No;

	// Income Info
	@FindBy(xpath = "//select[@id='loan_application_wizard_income_source']")
	public WebElement IncomeSource;

	@FindBy(xpath = "//input[@id='loan_application_wizard_employer']")
	public WebElement EmpName;

	@FindBy(xpath = "//input[@id='loan_application_wizard_work_phone']")
	public WebElement EmpPhoneNum;

	// Type of income
	@FindBy(xpath = "//input[@value='Paper Check']")
	public WebElement PaperCheck;

	@FindBy(xpath = "//input[@value='Direct Deposit']")
	public WebElement DirectDeposit;

	@FindBy(xpath = "//input[@value='Cash']")
	public WebElement Cash;

	@FindBy(id = "loan_application_wizard_pay_period")
	public WebElement PayPeriod; // Weekly, Bi-weekly, Semi-Monthly

	@FindBy(id = "loan_application_wizard_monthly_income")
	public WebElement MonthlyIncome;

	@FindBy(id = "loan_application_wizard_first_pay_date")
	public WebElement LastPaycheck;

	@FindBy(id = "loan_application_wizard_second_pay_date")
	public WebElement NextPaycheck;

	@FindBy(id = "loan_application_wizard_pay_date_after_next")
	public WebElement AfterNextPaycheck;

	@FindBy(xpath = "//button[.=' Continue']")
	public WebElement ContinueBtn;

	// your funds
	// https://qa.creditninja.com/loan_application/bank_info
	@FindBy(id = "loan_application_wizard_loan_amount")
	public WebElement LoanAmount;
	
	@FindBy(id = "routing-number")
	public WebElement RoutingNum;
	
	@FindBy(id = "routing-number_confirmation")
	public WebElement RoutingNumConf;
	
	@FindBy(id = "account-number")
	public WebElement AccountNum;
	
	@FindBy(id = "account-number_confirmation")
	public WebElement AccountNumConf;
	

}
