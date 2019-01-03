package step.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeGoogleHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.com/";
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get(url);
		
		driver.close();
		
		

	}

}
