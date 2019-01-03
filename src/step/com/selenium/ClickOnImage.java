package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		// click on the "Facebook" logo on the upper left portion
		driver.findElement(By.xpath("//a[@title = 'Go to Facebook Home']")).click();

		// verify that we are now back on Facebook's homepage
		if (driver.getTitle().equals("Facebook - log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		} else {
			System.out.println("We are NOT in Facebook's homepage");
		}
		driver.close();

	}

}
