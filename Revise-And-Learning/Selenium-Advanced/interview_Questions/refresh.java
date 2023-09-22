package interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class refresh {


	@Test
	public void testRefresh() throws AWTException
	{
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();


		driver.navigate().to("https://www.google.co.in");
		driver.navigate().refresh();

		driver.get("https://www.bing.com");

		driver.get(driver.getCurrentUrl());

		driver.get("https://www.google.co.in");
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("location.reload()");


		driver.findElement(By.name("q")).sendKeys("hello world"+Keys.ENTER);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

	}

}
