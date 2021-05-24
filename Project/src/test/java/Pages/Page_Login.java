package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Login {

	private static WebElement element = null;
	
	
	
	public static WebElement UserName(WebDriver driver) {
		
		 element = driver.findElement(By.id("Username"));
		return element;
	}
	
	public static WebElement Password(WebDriver driver) {
		
		 element = driver.findElement(By.id("inputPassword"));
		return element;
	}
	
	
	public static WebElement Button(WebDriver driver) {
		
		 element = driver.findElement(By.className("loginButton"));
		return element;
	}
	
}
