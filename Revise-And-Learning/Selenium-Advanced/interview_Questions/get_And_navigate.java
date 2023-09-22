package interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_And_navigate {


	@Test
	public void testdiff()
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		//driver.get("http://www.google.co.in");
		
		
		
		driver.navigate().to("http://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("hello world"+Keys.ENTER);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
	
	
	}
}
