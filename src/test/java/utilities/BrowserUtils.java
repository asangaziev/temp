package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BrowserUtils {
	

	public static void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
		jse.executeScript("scroll(0, 250);");
	}

	public static void hover(WebElement element) {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(element).perform();
	}

	/**
	 * return a list of string from a list of elements ignores any element with no
	 * text
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> getElementsText(List<WebElement> list) {
		List<String> elemTexts = new ArrayList<>();
		for (WebElement el : list) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

	public static List<String> getElementsText(By locator) {

		List<WebElement> elems = Driver.getDriver().findElements(locator);
		List<String> elemTexts = new ArrayList<>();

		for (WebElement el : elems) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

	public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement waitForVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement waitForClickablility(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForClickablility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
				.withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return webElement;
			}
		});
		return element;
	}

	public static void waitForPageToLoad(long timeOutInSeconds) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			System.out.println("Waiting for page to load...");
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
			wait.until(expectation);
		} catch (Throwable error) {
			System.out.println(
					"Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
		}
	}

	public static void waitFor(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void switchToNextWindow(WebDriver driver) {
		String handle = driver.getWindowHandle();
		String newWindowHandle = "";
		Set<String> windowHandles = driver.getWindowHandles();
		// capture the handle of the tab which is not the current tab
		for (String each : windowHandles) {
			if (!each.equals(handle)) {
				newWindowHandle = each;
			}
		}
		// switch to new window using the handle of the new window
		driver.switchTo().window(newWindowHandle);
	}

	public static void closeAndSwitchPrevious(WebDriver driver) {
		String handle = driver.getWindowHandle();
		String newWindowHandle = "";
		Set<String> windowHandles = driver.getWindowHandles();
		driver.close();
		// capture the handle of the tab which is not the current tab
		for (String each : windowHandles) {
			if (!each.equals(handle)) {
				newWindowHandle = each;
			}
		}
		// switch to new window using the handle of the new window
		driver.switchTo().window(newWindowHandle);
	}

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

}
