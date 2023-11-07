package selenium_Intrw_Qs;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	
	
	@Test
	public void testWait()
	{
		
		WebDriver driver;
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		  
		  Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).
				  					withTimeout(Duration.ofSeconds(10))
				  					.pollingEvery(Duration.ofSeconds(3))
				  					.ignoring(NoSuchElementException.class);
		  
		WebElement fwait_btn =   	fwait.until(new Function<WebDriver, WebElement>(){
		  		
		  		
		  		public WebElement apply(WebDriver driver)
		  		{
		  			return driver.findElement(By.xpath(""));
		  		}
		  	});
		  	
		fwait_btn.click();
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		
				
		
		
		
		
	}

}
