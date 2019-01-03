package step.com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestNgInstallationCheck {
	
	WebDriver driver;
	String url = "https://www.google.com/";

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void verifyHomepage() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

		if (title.equals("Google")) {
			System.out.println("google home page");
		} else {
			System.out.println("not google homepage");
		}

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
