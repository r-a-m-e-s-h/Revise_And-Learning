package sel_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_Sep12 {
	
	
	
	
	
	
	@Test
	public void testFrame()
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		WebDriverManager.chromedriver().setup();
		
		driver.switchTo().frame(0);
		
			WebElement fbtn1 = 
					driver.findElement(By.xpath("//*[@id=\"Click\" and @style=\"color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%\"]"));
			
			fbtn1.click();
			
			driver.switchTo().defaultContent();
	}

}
