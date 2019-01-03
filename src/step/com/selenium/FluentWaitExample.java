package step.com.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {

	public static void main(String[] args) {

		testFluentWait();

	}

	public static void testFluentWait() {
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// driver.findElement(By.name("q")).sendKeys("abcd");
		// driver.findElement(By.xpath("//input[@type = 'submit']")).submit();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkelement = driver.findElement(By.xpath("//button[@name = 'websubmit']"));

				if (linkelement.isEnabled()) {
					System.out.println("Element Enabled");
				}
				return linkelement;
			}
		});

		element.click();

		driver.close();

	}

}
