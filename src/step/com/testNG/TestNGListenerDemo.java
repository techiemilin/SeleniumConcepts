
package step.com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(step.com.testNG.TestNGListeners.class)

public class TestNGListenerDemo {
	WebDriver driver;
	String url = "http://demo.guru99.com/V4/";

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	// Test to pass as to verify listeners.
	@Test
	public void Login() {
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr169903");
		driver.findElement(By.name("password")).sendKeys("Ajugapu");
		driver.findElement(By.name("btnLogin")).click();
	}

	// Forcefully failed this test as verify listener.
	@Test
	public void getTitleOfLoginPage() throws InterruptedException {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
		Thread.sleep(2000);
		driver.close();
	}
}
