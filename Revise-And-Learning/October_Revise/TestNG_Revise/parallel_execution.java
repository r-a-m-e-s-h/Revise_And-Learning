package TestNG_Revise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_execution {

	public static WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}

	@Test
	public void test1()
	{
		driver.get("https://www.google.co.in");
	}
	@Test
	public void test2()
	{
		driver.get("http://www.bing.com");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
