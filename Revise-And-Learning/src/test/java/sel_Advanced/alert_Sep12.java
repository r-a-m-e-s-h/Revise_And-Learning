package sel_Advanced;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_Sep12 {
	
	
	
	
	
	@Test
	public void alertTest() throws InterruptedException
	{
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		a1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.getText();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}
	

}
