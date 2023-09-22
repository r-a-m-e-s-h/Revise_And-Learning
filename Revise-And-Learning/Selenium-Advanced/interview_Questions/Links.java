package interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
	
	@Test
	public void testsuggestion() throws InterruptedException
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("hello"+Keys.ENTER);
		
		List<WebElement> links1 =  driver.findElements(By.tagName("a"));
		
		for(WebElement allLinks : links1)
		{
			 System.out.println(allLinks.getAttribute("href"));
		}
		
		Thread.sleep(5000);
		//2nd method to specific link
		
		driver.get("http://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("12 angry men"+Keys.ENTER);
		
		List<WebElement> s_links = driver.findElements(By.xpath("//*[@id=\"search\"]//following::h3//following::div/cite"));
		
		for(WebElement newLinks : s_links)
		{
			System.out.println(newLinks.getText());
		}
		
		
	}
	
	

}
