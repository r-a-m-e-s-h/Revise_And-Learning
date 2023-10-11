package selenium_Advance_Revise;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class file_download {
	
	
	
	
	@Test
	public void testdowenload() throws InterruptedException
	{
		WebDriver driver;
		
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dbtn = driver.findElement(By.xpath("//*[text()=\"Download\"]"));
		dbtn.click();
		
		Thread.sleep(3000);
		
		
		File fileloc = new File("C:\\Users\\p81427\\Downloads");
		File[] totalfile = fileloc.listFiles();
		
		for (File fileWanted : totalfile) {
			
			if(fileWanted.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("File downloaded");
				break;
			}
			
		}
		
		//driver.quit();
		
		
		
	}

}
