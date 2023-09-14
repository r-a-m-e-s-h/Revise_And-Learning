package sel_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript_Sep12 {
	
	public static WebDriver driver;
	
	@Test
	public void jsTest() throws InterruptedException
	{
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		JavascriptExecutor e = (JavascriptExecutor)driver;
	/*	driver.get("https://www.google.com/search?q=hello+world&rlz=1C1GCEA_enUS1066US1066&oq=hello+world&aqs=chrome..69i57j0i131i433i512l3j46i433i512j0i131i433i512l2j46i512j0i512j46i512.2117j1j7&sourceid=chrome&ie=UTF-8#ip=1");
		
		
	//	e.executeScript("window.scrollBy(0,250)");
		
		e.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		e.executeScript("window.scrollTo(0,0)");
		//driver.quit();
		
		Thread.sleep(3000);
		*/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement txtbox = driver.findElement(By.xpath("//*[@name=\"username\"]"));
		
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	

}
