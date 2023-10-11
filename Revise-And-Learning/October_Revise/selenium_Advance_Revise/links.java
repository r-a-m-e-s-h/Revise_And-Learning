package selenium_Advance_Revise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	
	
	
	@Test
	public void linkTest()
	{
		
		WebDriver driver;

		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link_withOut_click = driver.findElement(By.linkText("Find the URL without clicking me."));
		String text = link_withOut_click.getAttribute("href");
		System.out.println("The link without clicking is : "+ text);
		
		
		WebElement linkCount =  driver.findElement(By.linkText("How many links in this page?"));
		linkCount.click();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links in the page is : "+totalLinks.size());
		
		driver.navigate().back();
		
		WebElement brokenLink = driver.findElement(By.partialLinkText("Broken"));
		brokenLink.click();
		
		if(driver.getTitle().equalsIgnoreCase("Error 404"))
		{
			System.out.println("The Link is broken ");
			driver.close();
		}
		else {
			System.out.println("not a broken link");
		}
		
		
		
		driver.quit();
		
		
		
		
	}

}
