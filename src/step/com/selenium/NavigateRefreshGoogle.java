package step.com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefreshGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "https://www.yatra.com";

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url); // enter URL

		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();

		Thread.sleep(5000);
		
		driver.close();

	}

}
