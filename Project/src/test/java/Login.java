import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		
		InvalidLogin();
		InvalidLoginForPassword();
	}

public static void InvalidLogin() {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);

	// System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
	driver.manage().window().maximize();
	

	// For Invalid Login
	 
	try {

		driver.findElement(By.id("Username")).sendKeys("M00185");
		Thread.sleep(1000);
		driver.findElement(By.id("inputPassword")).sendKeys("1235");
		Thread.sleep(1000);
		driver.findElement(By.className("loginButton")).click();

		Thread.sleep(3000);

	}

	catch (InterruptedException e) {
		System.out.println("Erro in Login");
	}

	driver.close();
	
	System.out.println("Test For Invalid Login Completed");
}

public static void InvalidLoginForPassword() {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);

	// System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
	driver.manage().window().maximize();
	

	// For Invalid Login
	 
	try {

		driver.findElement(By.id("Username")).sendKeys("M00185");
		Thread.sleep(1000);
		driver.findElement(By.id("inputPassword")).sendKeys("135");
		Thread.sleep(1000);
		driver.findElement(By.className("loginButton")).click();

		Thread.sleep(3000);

	}

	catch (InterruptedException e) {
		System.out.println("Erro in Login");
	}

	driver.close();
	
	System.out.println("Test For Invalid Password in Login Completed");
}


}

