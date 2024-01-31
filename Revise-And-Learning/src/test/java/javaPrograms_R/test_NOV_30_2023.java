package javaPrograms_R;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test_NOV_30_2023 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		//string reverse
		String txt ="hello world";
		
		String rev ="";
		
		char[] c = txt.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev = rev+c[i];
			
		}
		System.out.println(rev);
		
		//swap 2 numbers;
		int a=30;
		int b=40;
		
		//without temp
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
		
		//with temp;
		
		int d=10;
		int e=50;
		int temp;
		
		temp=d;
		d=e;
		e=temp;
		System.out.println(e);
		
		//second largest  number in array
		int[] array = {1,2,3,0,99,199};
		int size = array.length;
		
		Arrays.sort(array);
		
		int second_Largest = array[size-2];
		
		System.out.println("The 2nd largest is : " +second_Largest);
		
		//smallest element in an array
		
		int array_two[] = {1,44,55,66,-199,0};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<array_two.length;i++)
		{
			if(array_two[i] < smallest)
			{
				smallest=array_two[i];
			}
		}
		System.out.println(" The smallest value is : "+smallest);
		
		// occurance of a letter
		String text = " hello world";
		
		char tofind= 'o';
		int count =0;
		
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)==tofind)
			{
				count=count+1;
			}
		}
		System.out.println("The cound of the letter is : "+count);

		//number reverse
		int number = 12345;
		
		int reverse=0;
		while(number>0)
		{
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
		System.out.println("The reverse of a number is :"+reverse);
		
		
	}
	
	
	@Test
	public void test1() throws IOException, AWTException
	{
		
		//table
		WebElement table = driver.findElement(By.xpath(""));
		List<WebElement> header= table.findElements(By.tagName("thead"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = table.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
				
			}
		}
		
		//wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait ewait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		ewait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		fwait.until(new Function<WebDriver,WebElement>(){
				
				public WebElement apply(WebDriver driver)
				{
					 return driver.findElement(By.id(""));
				}
		}
				);
		
		//screenshot
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src, dest);;
		
		//robot
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F15);
		
		//js
		JavascriptExecutor e =  (JavascriptExecutor)driver;
		e.executeScript("window.scrollTo(0,0)");
		e.executeScript("window.scrollBy(0,250)");
		e.executeScript("window.scrollby(0,document.body.scrollHeight)");
		WebElement txtbox = driver.findElement(By.id(""));
		e.executeScript("docuemnt.getElementByName('q').value='hello'",txtbox);
		e.executeScript("Location-reload");
		
		//window handles
		String oldWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String s: handles)
		{
			driver.switchTo().window(s);
			
			driver.close();
			driver.switchTo().window(oldWindow);
			
		}
		
		//alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("");
		
		//select
		Select select = new Select(txtbox);
		select.selectByIndex(0);
		
		//File Upload
		
		WebElement upload_btn = driver.findElement(By.id(""));
		upload_btn.click();
		
		String floc = "";
		
		StringSelection selection = new StringSelection(floc);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robots = new Robot();
		robots.keyPress(KeyEvent.VK_CONTROL);
		robots.keyPress(KeyEvent.VK_V);
		robots.keyRelease(KeyEvent.VK_V);
		robots.keyRelease(KeyEvent.VK_CONTROL);
		robots.keyPress(KeyEvent.VK_ENTER);
		robots.keyRelease(KeyEvent.VK_ENTER);
		
		//file download check
		
		File loc = new File("");
		
		File[] totFiles = loc.listFiles();
		
		for(File tofind : totFiles ) 
		{
			if(tofind.getName().equalsIgnoreCase("")) 
			{
				System.out.println("file found");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
	

}
