package step.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.facebook.com/";
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/milinpatel/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		
		driver.close();
		
		

	}

}
