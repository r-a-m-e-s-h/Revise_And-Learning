package selenium_Advance_Revise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	
	@Test
	public void ddTest()
	{
		
		WebDriver driver;

		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		//driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		
		WebElement drop = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		
	}
	
	
	

}
