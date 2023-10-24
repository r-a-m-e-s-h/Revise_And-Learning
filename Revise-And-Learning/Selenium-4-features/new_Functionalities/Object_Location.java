package new_Functionalities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Object_Location {
	
	
	public static WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	
	
	@Test(description="Here capturing the webelement height,width the x and y positions in the web page")
	public void object_location()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]//img"));
		
		System.out.println("width is : "+logo.getRect().getDimension().getWidth());
		
		System.out.println("height is : "+logo.getRect().getDimension().getHeight());
		
		System.out.println("x co-ordinate is : "+logo.getRect().getX());
		
		System.out.println("y co-ordinate is :"+logo.getRect().getY());
		
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
