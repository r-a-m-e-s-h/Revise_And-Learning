package selenium_Advance_Revise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class file_upload {



	@Test
	public void testUploads() throws InterruptedException, AWTException
	{

		WebDriver driver;

		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement upload_btn = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div[1]/form/span/span[1]/input"));
		
		Actions actions = new Actions(driver);
		actions.click(upload_btn).build().perform();
		
		
		
		StringSelection selection = new StringSelection("C:\\Users\\p81427\\Downloads\\TestLeaf Logo.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		


	}

}
