package Advanced;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	

	@Test
	public void testLinks() throws InterruptedException
	{
		WebDriver driver;
		
		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement withOutClick = driver.findElement(By.linkText("Find the URL without clicking me."));
		String link = withOutClick.getAttribute("href");
		System.out.println("The without clicking link is : "+link);
		
		
		
		Thread.sleep(3000);
		
		WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("This link is broken");
			
		}
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		List<WebElement>totallinks = driver.findElements(By.tagName("a"));
		int size = totallinks.size();
		System.out.println("The total num of link in the page are : "+size);
		
		Actions actions= new Actions(driver);
		actions.clickAndHold(brokenlink);
		actions.moveToElement(brokenlink);
		actions.release(brokenlink);
		
		
	}
	

}
