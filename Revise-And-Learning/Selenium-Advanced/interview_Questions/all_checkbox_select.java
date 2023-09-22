package interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all_checkbox_select {
	
	////*[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]
	
	
	
	@Test
	public void testcheckbox()
	{
WebDriver driver;
		
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01g0i3d2buuijbgkk97ski8s83486938.node0");
		List<WebElement> all_checkbox = driver.findElements(By.xpath("*[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')]"));
		
		for(WebElement element : all_checkbox)
		{
			element.click();
		}
		
	}

}
