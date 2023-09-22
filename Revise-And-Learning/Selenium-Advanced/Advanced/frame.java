package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {





	@Test
	public void testFrame() throws InterruptedException
	{

		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);
		WebElement f1 =driver.findElement(By.id("Click"));
		f1.click();
		String ftext = f1.getText();
		System.out.println("The text inside frame is : "+ftext);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		List<WebElement> flist = driver.findElements(By.tagName("iframe"));
		System.out.println("The total frame are : "+flist.size());
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");

		WebElement f2 = driver.findElement(By.id("Click"));
		f2.click();
			
		driver.switchTo().defaultContent();
		
		
		
	}
}
