package step.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	String url = "https://www.facebook.com/";

	public void openBrowser(String browser) {

		if (browser == "chrome") {

			System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get(url);

			driver.close();

		} else {
			if (browser == "firefox") {

				System.setProperty("webdriver.gecko.driver", "/Users/milinpatel/Downloads/geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().fullscreen();
				driver.get(url);

				driver.close();
			} else {
				if (browser == "safari") {
					WebDriver driver = new SafariDriver();
					driver.manage().window().fullscreen();
					driver.get(url);
					driver.manage().deleteAllCookies();
					driver.close();

				} else {
					System.out.println("Input is wrong, please spell check");
				}

			}

		}

	}

}
