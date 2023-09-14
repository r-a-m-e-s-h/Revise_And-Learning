package sel_Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_R {
	
	
	public WebDriver driver;
	
	
	
	@Test
	public void chroemTest()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.co.in");
		
	}
	@Test
	public void edgeTest()
	{
		driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("http://bing.com");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
