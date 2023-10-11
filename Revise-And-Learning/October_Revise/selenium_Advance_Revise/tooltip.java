package selenium_Advance_Revise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class tooltip {
	
	
	
	@Test
	public void testToolTip()
	{
		WebDriver driver;

		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement hovertext = driver.findElement(By.xpath("//*[contains(text(),\"Hover over\")][1]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(hovertext).build().perform();
		
		
		
		
		
		
	}

}
