package selenium_Intrw_Qs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_search_suggestions {
	
	
	
	
	
	@Test
	public void gsuggestion()
	{
		
		WebDriver driver;
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.co.in");
		
		WebElement searchBar =   driver.findElement(By.name("q"));
		searchBar.sendKeys("hello");
		
		//List<WebElement> gs =    driver.findElements(By.xpath("//div[@id=\"Alh6id\"]//ul[@role=\"listbox\"]//following::li"));
		List<WebElement> gs =    driver.findElements(By.xpath("//ul[@role=\\\"listbox\\\"]//following::li"));
		
		
		for (WebElement webElement : gs) {
			
			System.out.println(webElement.getText());
		}
		
		
				
		driver.quit();		
		
		
	}
	

}
