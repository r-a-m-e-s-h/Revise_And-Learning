package sel_Advanced;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows_R {
	
	
	public WebDriver driver;
	
	
	@Test
	public void windowsTest()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement wbtn1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\" and @name=\"j_idt88:new\"]"));
		wbtn1.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String newWindow:handles)
		{
			driver.switchTo().window(newWindow);
		}
		
		
		String txtTitle = driver.getTitle();
		//System.out.println(txtTitle);
		Assert.assertEquals("Dashboard", txtTitle);
		System.out.println("The Title is crt in the new window ");
		driver.close();
		
		
		
		
	}

}
