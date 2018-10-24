package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//a[@class='btn-block btn-social btn-lg btn-vimeo']")
	public WebElement email;
	
	@FindBy (id="user_email")
	public WebElement userName;
	
	@FindBy (id="user_password")
	public WebElement password;
	
	@FindBy (xpath="//input[@name='commit']")
	public WebElement submit;
	
	@FindBy(xpath="//div[.='Invalid Email or password.']")
	public WebElement errorM;
}
