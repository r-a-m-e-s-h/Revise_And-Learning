package new_Functionalities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class friendly_locator {
	
	
public static WebDriver driver;
	
	
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	
	
	@Test(description="Here we test Relative Locator feature in selenium 4 version")
	public void realtiveLocator_test() throws IOException
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.thriftbooks.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement books = driver.findElement(By.xpath("//div[@class=\"BookSlideDesktop-Image\" and @id=\"slide-rec2-book3Recommendations\"]//img"));
		
		File src = books.getScreenshotAs(OutputType.FILE);
		 File dest = new File("Books.png");
		 FileUtils.copyFile(src, dest);
		
		
		books.click();
		
		//driver.findElement(RelativeLocator.with().above(By.id("")));
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
