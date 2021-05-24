package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPageObject;
import Pages.LoginPageObject;

public class TestNG_Demo {

	WebDriver driver = null;

	@BeforeTest
	public void setUptest() {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		driver = new ChromeDriver();
		LoginPageObject searchPageObj = new LoginPageObject(driver);

	}

	@Test
	public void InvalidUserId() throws Exception   {

		LoginPageObject searchPageObj = new LoginPageObject(driver);

		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();

		searchPageObj.Login_Username("M000000185");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);

		searchPageObj.Login_Button();
		Thread.sleep(1000);


	}
	
	@Test
	public void InvalidPassword() throws InterruptedException {

		LoginPageObject searchPageObj = new LoginPageObject(driver);

		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();

		searchPageObj.Login_Username("M000000185");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1234");
		Thread.sleep(1000);

		searchPageObj.Login_Button();
		Thread.sleep(1000);


	}
	
	@Test
	public void InvalidUser() throws InterruptedException {

		LoginPageObject searchPageObj = new LoginPageObject(driver);

		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();

		searchPageObj.Login_Username("Nibesh");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1234");
		Thread.sleep(1000);

		searchPageObj.Login_Button();
		Thread.sleep(1000);


	}
	

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");

	}

}
