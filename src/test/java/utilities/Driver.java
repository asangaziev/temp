package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (ConfigReader.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
