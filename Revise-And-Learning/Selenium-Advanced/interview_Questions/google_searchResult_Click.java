package interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_searchResult_Click {
	
	
	
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
		
		List<WebElement> list_results = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		
	int position=0;
	
	/*for(WebElement text : list_results)
	{
		System.out.println(text.getText());
		position=position+1;
		if(position==3)
		{
			text.click();
			break;
		}
	} */
	
	for(WebElement element : list_results)
	{
		String text =  element.getText();
		System.out.println(text);
		
		if(text.contains("cast"))
		{
			element.click();
			break;
		}
		
	}
		
		
		
	}

}
