package interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class underlined {
	
	
	@Test
	public void testAttribute()
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		WebElement txt =  driver.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		String underline = txt.getCssValue("text-decoration");
		
		System.out.println("before hoverinhg : "+underline);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(txt);
		
		System.out.println("After hovering : "+underline );
		
		
	}
	

}
