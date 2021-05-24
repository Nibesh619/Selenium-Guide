# Selenium-Guide
Selenium Guide to create First Script



1)Install Java: Set the path 
For refrence:https://www.youtube.com/watch?v=IJ-PJbvJBGs

2)Install Maven:from  maven apache org/ download / binary zip. Then set the environment. 
For refrence: https://www.youtube.com/watch?v=RfCWg5ay5B0

3)Install Eclipse IDE

4) Create Maven Project 

5) Add dependencies on pom.xml 
Go to maven repisotory and
add Junit and Selenium Java

(  

 <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>

<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

)


6) Then Create a class in src/test/java 

7) Then downlaod Chrome extension from https://sites.google.com/a/chromium.org/chromedriver/downloads 
Then extract to local disk C.

8) Create A folder in the Maven Project called Driver and again Create a folder called chromedriver where you paste the chromedriver.exe.


9) Then set the environment of chromedriver.exe on Path section of environment variables. By doing so we donot have to run the below code everytime when starting the project.
// System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");

) Demo Code 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");  // Helps to get the project location. 
		System.out.println(projectPath);

		// System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		try {
			Thread.sleep(3000);     // Holds for 3 second when websites opens
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}



