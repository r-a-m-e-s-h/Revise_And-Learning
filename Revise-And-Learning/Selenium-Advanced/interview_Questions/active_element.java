package interview_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class active_element {
	
	public static WebElement q;
	
	@Test
	public void testActivElement()
	{
		
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		//driver.switchTo().activeElement().sendKeys("hekl world");
		
		PageFactory.initElements(driver, this);
		
		//WebElement q;
		q.sendKeys("hello \n");
		
		
	}
	

}
