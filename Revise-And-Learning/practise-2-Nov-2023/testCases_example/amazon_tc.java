package testCases_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_tc {
	
	public static WebDriver driver;
	
	@Test
	public void test_amazon() throws InterruptedException
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://amazon.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" or @id=\"nav-bb-search\"]"));
		searchBar.sendKeys("iphone"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),\"Apple iPhone 11, 64GB\")]"));
		ele.click();
		
		
		
		
		
		
	}

}
