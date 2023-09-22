package Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	
	
	@Test
	public void testWindow()
	{
		WebDriver driver;
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node07nmoo42xcjmuoarw7ukt192f485547.node0");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement w1 = driver.findElement(By.xpath("//*[text()=\"Open\"]"));
		w1.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String newWindow : handles)
		{
			driver.switchTo().window(newWindow);
		}
		driver.findElement(By.id("email")).sendKeys("hello@world.com");
		
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement w2 = driver.findElement(By.xpath("//*[text()=\"Open Multiple\"]"));
		w2.click();
		
		int num_windows_opned = driver.getWindowHandles().size();
		System.out.println("The number of opened windows are : "+num_windows_opned);
		
		WebElement w3 = driver.findElement(By.xpath("//*[text()=\"Close Windows\"]"));
		w3.click();
		
		Set<String> close_child= driver.getWindowHandles();
		
		for(String newchild : close_child)
		{
			if(!newchild.equals(oldWindow))
			{
				driver.switchTo().window(newchild);
				driver.close();
			}
			
		}
		
		driver.quit();
		
	}
	
	
	
	

}
