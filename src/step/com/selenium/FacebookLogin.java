package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("RahulPaneliya@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("RahulPaneliya");
		driver.findElement(By.id("u_0_2")).click();

		driver.close();
		
	
		
		
	}

}
