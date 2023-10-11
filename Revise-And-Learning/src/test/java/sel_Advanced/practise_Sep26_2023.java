package sel_Advanced;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNG_Revise.listeners_R;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practise_Sep26_2023 {

	public static WebDriver driver;
	
	@BeforeTest(enabled=false)
	public void setUp()
	{
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(enabled=false)
	public void practise_Table()
	{
		//table
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node01j7nrkb7d8bqa1fxmc1bnyasnp502750.node0");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]"));
		List<WebElement> header = driver.findElements(By.tagName("thead"));
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = driver.findElements(By.tagName("td"));
			
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
			}
		}


	}
	@Test(enabled=false)
	public void window_Practise() throws InterruptedException
	{
		driver.get("https://www.leafground.com/window.xhtml");
		String oldWindow = driver.getWindowHandle();
		
		WebElement wbtn1 = driver.findElement(By.id("j_idt88:new"));
		wbtn1.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("The new window title is : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(oldWindow);
		Thread.sleep(2000);
		
		WebElement wbtn2 = driver.findElement(By.xpath("//*[text()=\"Open Multiple\"]"));
		wbtn2.click();
		
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("The number of windows opened are : "+numberOfWindows);
		Thread.sleep(2000);
		
		WebElement b3 = driver.findElement(By.xpath("//*[text()=\"Close Windows\"]"));
		b3.click();
		
		Set<String> closeChild = driver.getWindowHandles();
		
		for (String newWindows : closeChild) {
			
			if(!newWindows.equals(oldWindow))
			{
				driver.switchTo().window(newWindows);
				driver.close();
			}
			
		}
		
			
		}
	
	@Test(enabled=false)
	public void frameTest() throws InterruptedException
	{
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		WebElement b1 = driver.findElement(By.xpath("//*[text()=\"Click Me\"][1]"));
		b1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		List<WebElement>frame_count =  driver.findElements(By.tagName("iframe"));
		int totalFrame = frame_count.size();
		System.out.println("The total frames are : "+totalFrame);
		Thread.sleep(2000);
		
		
		  driver.switchTo().frame(1);
		  Thread.sleep(2000);
		  
		  driver.switchTo().frame("frame2");
		  		  
		  WebElement b2 = driver.findElement(By.id("Click")); 
		  b2.click();
		 	
	}
	
	@Test
	public void prg()
	{
		String s  = "Hello world";
		String rev ="";
		 
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev = rev+c[i];
					
		}
		System.out.println(rev);
		
		
		int number =1234;
		int rev1=0 ;
		
		while(number!=0)
		{
			rev1=rev1*10;
			rev1=rev1+number%10;
			number=number/10;
			
		}
		System.out.println("The reversed number is : "+rev1);
		
		
		
	}
		
	
	
	@AfterTest(enabled=false)
	public void tearDown()
	{
		driver.quit();
	}




}