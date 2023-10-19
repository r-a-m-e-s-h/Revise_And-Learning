package selenium_Intrw_Qs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allcheckbox {
	
	
	////*[@class="ui-chkbox-icon ui-icon ui-icon-blank ui-c"]
	
	////*[starts-with(@class,"ui-chkbox-box")]
	@Test
	public void testCheckbox()
	{
		WebDriver driver;
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[starts-with(@class,\"ui-chkbox-box\")]"));
		
		for (WebElement selectAllBoxes : checkboxes) {
			selectAllBoxes.click();
		}
		
		//driver.quit();
		
		
		
	}

}
