package step.com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alert_messege = alert.getText();
		
		System.out.println(alert_messege);
		
		if (alert_messege.equals("Please enter a valid user name")) {
			System.out.println("Testcase has passed");
		} else {
			System.out.println("Testcase has failed");
		}
		
		alert.accept();
		
		driver.close();
		
	}

}
