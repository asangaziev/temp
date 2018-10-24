package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class StateLicensePage {
	private WebDriver driver;

	public StateLicensePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@class='img-fluid page__header-image']")
	public WebElement NinjaImage;

	@FindBy(id = "states")
	public WebElement StatesDropDown;

}
