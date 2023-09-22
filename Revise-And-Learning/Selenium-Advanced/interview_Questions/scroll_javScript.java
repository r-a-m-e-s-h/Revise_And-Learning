package interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_javScript {
	
	
	
	@Test
	public void testScroll() throws InterruptedException, AWTException
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("hello \n");
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollTo(0,250)");
		Thread.sleep(3000);
		e.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		e.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		e.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
		WebElement jstxt  = driver.findElement(By.xpath("//*[text()=\"Hello Lyrics - Adele\"]"));
		
		e.executeScript("arguments[0].scrollIntoView(true)", jstxt);
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
				
		
		
		
	}

}
