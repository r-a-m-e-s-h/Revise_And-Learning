package selenium_Advance_Revise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {




	@Test
	public void testFrames() throws InterruptedException
	{
		WebDriver driver;
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		WebElement b1 = driver.findElement(By.xpath("//*[contains(@id,\"Click\")][1]"));
		b1.click();

		driver.switchTo().defaultContent();


		List<WebElement>fcount = driver.findElements(By.tagName("iframe"));
		System.out.println("The total frames in this page is : "+fcount.size());
		
		Thread.sleep(2000);
		  driver.switchTo().frame(1);
		  
		  driver.switchTo().frame("frame2");
		  
		  WebElement b2 = driver.findElement(By.xpath("//*[contains(@id,\"Click\")]"));
			b2.click();
		 


		
		
		driver.quit();

	}


}
