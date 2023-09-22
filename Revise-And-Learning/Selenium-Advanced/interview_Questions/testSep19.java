package interview_Questions;


import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testSep19 {
	
	@Test
	public void test()
	{
		WebDriver driver;
		driver= new ChromeDriver();
		
		//active element
		driver.switchTo().activeElement();
		
		//all linlk
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for(WebElement mylink : alllinks)
		{
			System.out.println(mylink.getAttribute("href"));
		}
		//checkbox
		List<WebElement> ckbox = driver.findElements(By.xpath(""));
		
		for(WebElement c :ckbox)
		{
			c.click();
		}
		//asseert
		
		Assert.assertEquals(false, true);
		System.out.println("hard Assert");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		System.out.println("Soft Assert");
		//authenticationpopup
		
		driver.get("http://admin:admin@google.com");
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		btn.click();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//fluent wait
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver) 
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
	WebElement btn2=	wait2.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver1)
			{
				return driver1.findElement(By.id(""));
			}

			
		});
	btn2.click();
	
	//get and navigate
	
	driver.get("");
	driver.navigate().to("");
	driver.navigate().forward();
	driver.navigate().back();
	
	//google search result click
	
WebElement gsearchBar = 	driver.findElement(By.name("q"));
gsearchBar.sendKeys("hello");
List<WebElement> glist = driver.findElements(By.xpath(""));

for(WebElement textWant : glist)
{
	String txt = textWant.getText();
	
	if(txt.contains("hellotune"))
	{
		textWant.click();
		
	}
}
//	maximize

ChromeOptions co = new ChromeOptions();
co.addArguments("--start-maximized");

Dimension d = new Dimension(0, 250) ;

driver.manage().window().setSize(d);

driver.manage().window().maximize();

//pres enter


		
		
		
	}
	//alwaysrun // exepcted exception
			@Test(alwaysRun = true,expectedExceptions = NoSuchElementException.class)
			public void test2()
			{
				System.out.println("always run");
			}
			@Test(invocationCount = 3, timeOut = 5000)
			public void test3()
			{
				System.out.println("Im invocation count");
			}
	

}
