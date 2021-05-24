package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPageObject;

public class LoginTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		InvalidUserId();
		InvalidPassword();
	}
	
	
	public static void InvalidUserId() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		driver = new ChromeDriver();
		LoginPageObject searchPageObj = new  LoginPageObject(driver);
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		
		searchPageObj.Login_Username("M0000000185");
		Thread.sleep(1000);
		
		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);
		
		searchPageObj.Login_Button();
		Thread.sleep(1000);
		
		driver.close();

	}
	
public static void InvalidPassword() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		driver = new ChromeDriver();
		LoginPageObject searchPageObj = new  LoginPageObject(driver);
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		
		searchPageObj.Login_Username("M000000185");
		Thread.sleep(1000);
		
		searchPageObj.Login_Password("1238");
		Thread.sleep(1000);
		
		searchPageObj.Login_Button();
		Thread.sleep(1000);
		
		driver.close();

	}
	

}
