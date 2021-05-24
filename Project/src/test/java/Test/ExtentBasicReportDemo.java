package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.LoginPageObject;

public class ExtentBasicReportDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		
		ExtentTest Test1 = extent.createTest("Login", "This test is for Login as Invalid Username");

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		driver = new ChromeDriver();
		
		LoginPageObject searchPageObj = new LoginPageObject(driver);

		Test1.log(Status.INFO, "Starting Test case");
		
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		Test1.pass("Navigated to Login Page");
		

		searchPageObj.Login_Username("M000000185");
		Test1.pass("Entered Username");
		Thread.sleep(1000);

		searchPageObj.Login_Password("1235");
		Thread.sleep(1000);
		Test1.pass("Entered Password");
		

		searchPageObj.Login_Button();
		Thread.sleep(1000);
		Test1.pass("Login Button Clicked");
		
		driver.close();
		driver.quit();
		Test1.pass("Close Browser");
		
		Test1.info("test completed");
		
		
		ExtentTest Test2 = extent.createTest("Login", "This test is for Login as Invalid Password");

		String projectPath1 = System.getProperty("user.dir");
		System.out.println(projectPath1);
		driver = new ChromeDriver();
		
		LoginPageObject searchPageObj1 = new LoginPageObject(driver);

		Test2.log(Status.INFO, "Starting Test case");
		
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();
		Test1.pass("Navigated to Login Page");
		

		searchPageObj1.Login_Username("M000000185");
		Test2.pass("Entered Username");
		Thread.sleep(1000);

		searchPageObj1.Login_Password("1234");
		Thread.sleep(1000);
		Test2.fail("Entered Password");
		

		searchPageObj1.Login_Button();
		Thread.sleep(1000);
		Test2.pass("Login Button Clicked");
		
		driver.close();
		driver.quit();
		Test2.pass("Close Browser");
		
		Test2.info("test completed");
		
		
		
		extent.flush();
	}

}
