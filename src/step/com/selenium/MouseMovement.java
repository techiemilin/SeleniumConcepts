package step.com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		String url = "https://www.flightcentre.ca";
		
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		Actions action = new Actions (driver);
		
		action.moveToElement(driver.findElement(By.xpath("//nav[@class = 'js-main-nav']/ul/li[4]"))).build().perform();;
		
		driver.close();
		
	}

}
