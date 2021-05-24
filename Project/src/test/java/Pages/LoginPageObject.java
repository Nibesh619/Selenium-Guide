package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	WebDriver driver = null;
	
	By Login_Username = By.id("Username");
	By Login_Password = By.id("inputPassword");
	By Login_Button = By.className("loginButton");
	
	
	// This constructor was created so that above driver would not be called in test case 
	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void Login_Username(String text) {
		driver.findElement(Login_Username).sendKeys(text);
		
	}
	
	public void Login_Password(String text) {
		driver.findElement(Login_Password).sendKeys(text);
		
	} 
	
	public void Login_Button() {
		driver.findElement(Login_Button).click();
		
	}
	
	
}