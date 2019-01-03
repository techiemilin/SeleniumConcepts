package step.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePopUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/header/h1/thrive_headline/input")).sendKeys("‎⁨/Users/milinpatel/Downloads/chromedriver");
		
		
		driver.close();
		
		

	}

}
