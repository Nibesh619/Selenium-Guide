package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.LoginPageObject;

public class ET {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
	}
	
	@BeforeTest
	public void setUptest() {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		driver = new ChromeDriver();
		LoginPageObject searchPageObj = new LoginPageObject(driver);
		
		

	}
	

	@Test
	public void test1() throws Exception {
		ExtentTest Test1 = extent.createTest("InvalidUsername", "Sample description");
		

		Test1.log(Status.INFO, "Starting Test case");
		
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		Test1.pass("Navigated to Login Page");
		
		LoginPageObject searchPageObj = new LoginPageObject(driver);
		searchPageObj.Login_Username("M000000185");
		Test1.pass("Entered Username");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);
		Test1.pass("Entered Password");
		

		searchPageObj.Login_Button();
		Thread.sleep(1000);
		
		Test1.addScreenCaptureFromPath("screenshot.png");
		Test1.pass("Login Button Clicked");
		
		
		
	}
	
	@Test
	public void test2() throws Exception {
		ExtentTest Test1 = extent.createTest("InvalidPassword", "Sample description");
		

		Test1.log(Status.INFO, "Starting Test case");
		
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		Test1.pass("Navigated to Login Page");
		
		LoginPageObject searchPageObj = new LoginPageObject(driver);
		searchPageObj.Login_Username("M000000185");
		Test1.pass("Entered Username");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);
		Test1.pass("Entered Password");
		

		searchPageObj.Login_Button();
		Thread.sleep(1000);
		
		Test1.addScreenCaptureFromPath("screenshot.png");
		Test1.pass("Login Button Clicked");
		
		
		
	}
	
	
	@Test
	public void test3() throws Exception {
		ExtentTest Test1 = extent.createTest("Handsome", "Sample description");
		

		Test1.log(Status.INFO, "Starting Test case");
		
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		Test1.pass("Navigated to Login Page");
		
		LoginPageObject searchPageObj = new LoginPageObject(driver);
		searchPageObj.Login_Username("M000000185");
		Test1.pass("Entered Username");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);
		Test1.pass("Entered Password");
		

		searchPageObj.Login_Button();
		Thread.sleep(1000);
		
		Test1.addScreenCaptureFromPath("screenshot.png");
		Test1.pass("Login Button Clicked");
		
		
		
	}
	
	

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");

	}
	

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
