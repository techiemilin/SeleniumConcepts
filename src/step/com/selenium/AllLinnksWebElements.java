package step.com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinnksWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.facebook.com";

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(url);

		List<WebElement> all_links = driver.findElements(By.tagName("a"));

		System.out.println(all_links.size());

		for (int i = 0; i < all_links.size(); i++) {
			System.out.println(all_links.get(i).getText());
		}

		driver.close();

	}

}
