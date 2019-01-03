package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginFindElements {

	public static void main(String[] args) {

		String url = "https://www.facebook.com/";
		String User_Name = "testuse@gmail.com";
		String Password = "TestUser123";

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("email")).sendKeys(User_Name);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("u_0_2")).click();

		driver.close();

	}

}
