package interview_Questions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class without_Sendkeys {
	
	
	
	@Test
	public void test()
	{
		WebDriver driver;
		
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("http://www.google.co.in");
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		
		e.executeScript("document.getElementsByName('q')[0].value='hello'");
		
		
	}

}
