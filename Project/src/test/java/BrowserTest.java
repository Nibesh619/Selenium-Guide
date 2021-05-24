import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
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
				
		// For Proper Login 
				
		try {

			driver.findElement(By.id("Username")).sendKeys("M000000185");
			Thread.sleep(1000);
			driver.findElement(By.id("inputPassword")).sendKeys("1235");
			Thread.sleep(1000);
			driver.findElement(By.className("loginButton")).click();
			Thread.sleep(3000);

		}

		catch (InterruptedException e) {
			System.out.println("Error in Login");
		}

		driver.close();
	}

	
	
	
}
