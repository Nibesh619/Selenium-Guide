import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Page_Login;

public class Test {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		Login();

	}

	public static void Login() {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://office.moco.com.np:8080/MerchantPortal/Login.htm?logout");
		driver.manage().window().maximize();

		// For Invalid Username Login

		try {
			Page_Login.UserName(driver).sendKeys("M00185");
			Thread.sleep(1000);

			Page_Login.Password(driver).sendKeys("1235");
			Thread.sleep(1000);

			Page_Login.Button(driver).click();
			Thread.sleep(1000);

			// For Invalid Password

			Page_Login.UserName(driver).sendKeys("M000000185");
			Thread.sleep(1000);

			Page_Login.Password(driver).sendKeys("125");
			Thread.sleep(1000);

			Page_Login.Button(driver).click();
			Thread.sleep(1000);

			// For Invalid Unregistered

			Page_Login.UserName(driver).sendKeys("M000000199");
			Thread.sleep(1000);

			Page_Login.Password(driver).sendKeys("1235");
			Thread.sleep(1000);

			Page_Login.Button(driver).click();
			Thread.sleep(1000);

			// For Invalid Operator

			Page_Login.UserName(driver).sendKeys("OP000000199");
			Thread.sleep(1000);

			Page_Login.Password(driver).sendKeys("1235");
			Thread.sleep(1000);

			Page_Login.Button(driver).click();
			Thread.sleep(1000);
		}

		catch (InterruptedException e) {
			System.out.println("Erro in Login");
		}

		driver.close();

		System.out.println("Test For Invalid Login Completed");
	}

}
