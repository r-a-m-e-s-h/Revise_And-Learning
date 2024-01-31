package TestNG_Revise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise_Dec_1 {
	
	public static WebDriver driver;
	
	@Test(enabled=false)
	public void test1() throws AWTException
	{
		
		//webtable
		WebElement table = driver.findElement(By.xpath(""));
		List<WebElement>  header = table.findElements(By.tagName("th"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = table.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
		//window handle
		String oldwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String s: handles)
		{
			driver.switchTo().window(s);
			driver.close();
			driver.switchTo().window(oldwindow);
		}
		int size = driver.getWindowHandles().size();
		for(String newWindow : handles)
		{
			if(!newWindow.equals(oldwindow))
			driver.switchTo().window(newWindow);
			driver.close();
			driver.switchTo().window(oldwindow);
		}
		//frames
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		WebElement fbtn = driver.findElement(By.id(""));
		fbtn.click();
		driver.switchTo().defaultContent();
		//waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(3))
								.ignoring(NoSuchElementException.class);
		
		fwait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id(""));
			}
		});
		//Actions
		WebElement from = driver.findElement(By.id("")); 
		WebElement to = driver.findElement(By.id(""));
		Actions actions  = new Actions(driver);
		actions.dragAndDrop(from, to).build().perform();
		//alert
		Alert alert  = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		alert.getText();
		//file
	//upload
		String fpath="";
		StringSelection selection = new StringSelection(fpath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//download
		File loc = new File("");
		File[] totfile = loc.listFiles();
		for(File toFind : totfile)
		{
			if(toFind.getName().equals(""))
			{
				System.out.println("FILE FOUND");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
	@Test(enabled=false)
	public void test2_links() throws InterruptedException
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement link1 = driver.findElement(By.linkText("Go to Dashboard"));
		link1.click();
		
		
		driver.navigate().back();
		
		WebElement link2 = driver.findElement(By.linkText("Find the URL without clicking me."));
		String with_out_click = link2.getAttribute("href");
		System.out.println(with_out_click);
		
		List<WebElement> count_links = driver.findElements(By.tagName("a"));
		int total_links = count_links.size();
		System.out.println(" The total link are : "+total_links);
		
		WebElement brkLink = driver.findElement(By.linkText("Broken?"));
		brkLink.click();
		if(driver.getTitle().contains("404"))
		{
			System.out.println("its a broken link");
			driver.navigate().back();
		}
		//print searchbar suggestions:
		driver.get("http://google.co.in");
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("game of thrones");
		Thread.sleep(5000);
		List<WebElement> all_suggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li[@class=\"sbct\"]"));
		for(WebElement txt : all_suggestions )
		{
			System.out.println(txt.getText());
			
		}
		
		for(WebElement txt1 : all_suggestions)
		{
			String toClick_text = txt1.getText();
			
			if(toClick_text.contains("cast"))
			{
				txt1.click();
			}
			
		}
		
	}
	
	@Test
	public void testJavaPrg()
	{
		//String reverse
		
		String txt =" hello world";
		String rev = "";
		char[] c = txt.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev = rev+c[i];
		}
		System.out.println(rev);
		
		//swap 2 number
		//without temp;
		
		int first =100;
		int second=200;
		first= first-second;
		second=first+second;
		first=second-first;
		System.out.println(first);
		
		//with temp
		
		int temp;
		int a=50;
		int b=90;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(b);
		
		//number reverse
		int num = 12345;
		int rev1 =0;
		
		while(num>0)
		{
			rev1=rev1*10;
			rev1=rev1+num%10;
			num=num/10;
		}
		System.out.println(rev1);
		//2nd largest number in array
		int[] array = {1,2,3,5400,9990};
		int size = array.length;
		Arrays.sort(array);
		System.out.println(" the 2nd largest nunber is "+array[size-2]);
		
		//smallest number in a array
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		System.out.println("the smallest element in array is : "+smallest);
		
		//triangel
		int row=0,col=0;
		int row1=0,col1=0;
		int number=0;
		for(row=0;row<=5;row++)
		{
			for(col=0;col<row;col++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
			
		}
		for(row=0;row<=5;row++)
		{
			for(col=0;col<row;col++)
			{
				number=number+1;
				System.out.print(number);
			}
			System.out.println(" ");
		}
		
		
	}

}
