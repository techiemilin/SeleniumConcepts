package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		WebDriverWait wait = new WebDriverWait(driver, 20);

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		aTitle = driver.getTitle();

		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		WebElement guru99seleniumlink;

		guru99seleniumlink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//li[@class = 'dropdown']/a[contains(text(),'Selenium')]")));

		guru99seleniumlink.click();

	}

}
