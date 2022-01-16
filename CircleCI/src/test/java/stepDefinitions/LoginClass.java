package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass {

	
	 @Given("User login to google")
	public void user_login_to_google() {
	    
 
	 System.out.println("Hello jalkaj");
	 WebDriverManager.chromedriver().arm64().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
 	 
	 }



}
