package sel_Advanced;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_Septem12 {



	public static WebDriver driver;

	@Test
	public void windowTest()
	{
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/window.xhtml");

		String oldWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		
		
	}
}
/*
WebElement btn2 = driver.findElement(By.xpath("//*[text()=\"Close Windows\"]"));
btn2.click();
for(String s: handles)
{
	if(!s.equals(handles))
	{
		driver.switchTo().window(s);
		driver.close();
	}
}
*/
/*
WebElement btn1 = driver.findElement(By.xpath("//*[text()=\"Open\"]"));
btn1.click();

Set<String> handles = driver.getWindowHandles();

for(String s:handles)
{
	driver.switchTo().window(oldWindow);
	driver.close();
}
//driver.quit();
 */

/*
String title = driver.getTitle();
if(title.equals("Dashboard"))
{
	driver.switchTo().window(oldWindow);
}
else
{
	driver.close();
}
*/