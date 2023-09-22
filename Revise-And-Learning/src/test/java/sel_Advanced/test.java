package sel_Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	
	@Test
	public void test1() throws AWTException
	{
		WebDriver driver;
		
		driver= new ChromeDriver();
		//windows
		String oldwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		//frame
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		
		//table
		WebElement table = driver.findElement(By.xpath(""));
		
		List<WebElement> header = table.findElements(By.tagName("th"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				System.out.println(cols.get(j).getText());
			}
		}
		//File Upload
		String floc="";
		
		StringSelection selection = new StringSelection(floc);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new  Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//dowload file
		WebElement df = driver.findElement(By.id(""));
		df.click();
		
		File loc = new File("");
		File[] totfile = loc.listFiles();
		for(File myfile : totfile)
		{
			if(myfile.equals(""))
			{
				System.out.println("found");
				break;
			}
		}
		
		//alert
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("hello");
		
		//js
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollTo(0,0)" );
		e.executeScript("window.scrollBy(0,250)");
		e.executeScript("document.getElementByName(q)[0].value='Hello'");
		e.executeScript("window.scrollBy(arg[0].value='')");
		e.executeScript("window.scrollBy(0,document.body.scrollHeight");
		
		
		
		
		
		
		
		
		
	}

}
