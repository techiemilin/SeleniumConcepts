package step.com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitFacebookLoginButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "https://www.amazon.ca/";

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url); // enter URL
		clickOn(driver, driver.findElement(By.xpath("//div[@id = 'nav-xshop']/a[5]")), 20);

		driver.navigate().back();

		clickOn(driver, driver.findElement(By.xpath("//div[@id = 'nav-xshop']/a[3]")), 10);

		Thread.sleep(5000);

		

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}
}
