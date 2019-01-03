package step.com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooLoginParameters_XMLFile {
  
	WebDriver driver;
	
	@Test @Parameters ({"url", "UserID"})
  
  public void yahooLoginDetails(String url, String UserID) {
	  System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		
	  
	  

	  
	  
	  
	  
  }
}
