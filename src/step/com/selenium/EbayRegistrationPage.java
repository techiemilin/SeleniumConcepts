package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayRegistrationPage {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.ca/");
		driver.findElement(By.xpath("//a[@_sp='m570.l2621']")).click();
		driver.findElement(By.linkText("Create a business account")).click();
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Selenium Test");

		WebElement biztype = driver.findElement(By.xpath("//select[@id='bizTypeCode']"));
		WebElement state = driver.findElement(By.id("State"));
		WebElement country = driver.findElement(By.id("country"));

		Select select = new Select(biztype);
		select.selectByVisibleText("Retailer");

		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("223 jackson st");

		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("apartment 303");

		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("apartment 303");

		Select select1 = new Select(state);

		select1.selectByVisibleText("Ontario");

		driver.findElement(By.id("zip")).sendKeys("L8P4R4");

		Select select2 = new Select(country);

		select2.selectByVisibleText("Canada");

		driver.close();

	}

}
