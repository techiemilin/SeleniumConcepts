package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDropdownSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		String URL = "https://www.ebay.ca/";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		Select drpCountry = new Select(driver.findElement(By.id("gh-cat")));
		drpCountry.selectByVisibleText("Automotive");

		// Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
	}

}
