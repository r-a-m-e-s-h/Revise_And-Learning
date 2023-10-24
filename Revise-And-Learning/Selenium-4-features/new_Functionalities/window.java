package new_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	
	public static WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	
	
	
	//@Test(description="here we opening a new tab in chrome window")
	public void newTab() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("http://www.google.co.in");
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(description="here we opening a new window in chrome window")
	public void newwindow() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("http://www.google.co.in");
		
		Thread.sleep(5000);
		
	}

	
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
