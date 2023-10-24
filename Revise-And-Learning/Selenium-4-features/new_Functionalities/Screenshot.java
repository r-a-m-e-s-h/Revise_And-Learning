package new_Functionalities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	
	
	//@Test(description=" Here we taking the screenshot of a WebElement")
	public void takeScreenoFaWebElement() throws IOException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]//img"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("logo.png");
		
		FileUtils.copyFile(src, dest);
		
	}
	
	@Test(description=" Here takes the screenshot of a section in a web page")
	public void screenShotSection() throws IOException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement section = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-slot\"]"));
		
		File src = section.getScreenshotAs(OutputType.FILE);
		File dest = new File("section.png");
		FileUtils.copyFile(src, dest);
			
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
