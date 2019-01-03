package step.com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeAScreenShotAmazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca"); //enter URL
		
		// Take screenshot and store as a file format
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now copy the screenshot to desired location using copyFile //method
				Files.copy(src, new File("/Users/milinpatel/Documents/workspace/SeleniumWebDriver/src/step/com/selenium/amazon.png"));
				
				driver.close();
	}

}
