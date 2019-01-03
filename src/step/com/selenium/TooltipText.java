package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUrl = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTooltip = "Google apps";

		// Find the Github icon at the top right of the header
		WebElement github = driver.findElement(By.xpath("//div[@class = 'gb_3c']/a"));

		// get the value of the "title" attribute of the github icon
		String actualTooltip = github.getAttribute("title");

		// Assert the tooltip's value is as expected
		System.out.println("Actual Title of Tool Tip  :-" +   actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();

	}

}
