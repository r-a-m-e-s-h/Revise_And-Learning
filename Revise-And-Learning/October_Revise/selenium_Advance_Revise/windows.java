package selenium_Advance_Revise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {
	
	WebDriver driver;
	
	@Test
	public void testWindows()
	{
		
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node013pvdwkisejlfplvwpqhweb60528724.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement w1 = driver.findElement(By.xpath("//*[text()=\"Open\"]"));
		w1.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
			
			String newWindow_Title= driver.getTitle();
			System.out.println("Title is ; "+ newWindow_Title);
					
		}
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement w2 = driver.findElement(By.xpath("//*[text()=\"Open Multiple\"]"));
		w2.click();
		
		int opened_windows = driver.getWindowHandles().size();
		System.out.println("The number of windows opened are : "+opened_windows);
		
		WebElement w3 = driver.findElement(By.xpath("//*[text()=\"Close Windows\"]"));
		w3.click();
		
		Set<String> handles2 = driver.getWindowHandles();
		
		for (String newWindow2 : handles2) {
			
			if(!newWindow2.equals(oldWindow))
			{
				driver.switchTo().window(newWindow2);
				driver.close();
				
			}
			
		}	
				
		driver.quit();
		
	}
	
	
	
	
	

}
