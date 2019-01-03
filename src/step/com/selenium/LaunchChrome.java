package step.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().fullscreen();
		driver1.get("https://www.youtube.com");

		driver1.close();

		WebDriver driver = new SafariDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.youtube.com");
		driver.manage().deleteAllCookies();
		driver.close();

		System.setProperty("webdriver.gecko.driver", "/Users/milinpatel/Downloads/geckodriver");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().fullscreen();
		driver2.get("https://www.facebook.com");

		driver2.close();

	}

}
