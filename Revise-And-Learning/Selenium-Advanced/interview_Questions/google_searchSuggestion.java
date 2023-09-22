package interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_searchSuggestion {
	
	
	
	@Test
	public void testsuggestion() throws InterruptedException
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("game of thrones");
		
		Thread.sleep(5000);
		
		
		
	List <WebElement> results =	driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
	for(WebElement s : results)
	{
		System.out.println(s.getText());
	}
		
	}
	
	

}
