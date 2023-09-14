package TestNG_Revise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class parallelExecution_R {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.co.in");
	}
	@Test
	public void openBing()
	{
		driver.get("https://www.bing.com");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
