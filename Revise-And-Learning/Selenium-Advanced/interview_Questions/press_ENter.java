package interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class press_ENter {
	
	
	
	@Test
	public void testEter() throws AWTException
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		//driver.findElement(By.name("q")).sendKeys("hello"+Keys.ENTER);
		
		WebElement sbox = driver.findElement(By.name("q"));
		sbox.sendKeys("hello \n");
		//sbox.submit();
		
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
				
		
		
	}

}
