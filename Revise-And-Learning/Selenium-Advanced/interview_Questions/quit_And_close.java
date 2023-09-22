package interview_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class quit_And_close {
	
	
	@Test
	public void testdiff()
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get("https://www.leafground.com/waits.xhtml");
		
		
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		
		
		driver.close();
		
		// close , closes the window which the driver has focus of
		
		// quit , quits the all the opened windows by driver 
	}

}
