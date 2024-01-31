package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upoload_File {
	
	
	@Test
	public void testupload() throws AWTException, InterruptedException
	{
		WebDriver driver ;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.leafground.com/file.xhtml");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//button click
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement ebtn =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/div[1]/div[5]/div[2]/div/div[1]/div[1]/form/span/span[1]/input"))
		 * ); ebtn.click();
		 */
		WebElement element = driver.findElement(By.xpath(
				  "/html/body/div[1]/div[5]/div[2]/div/div[1]/div[1]/form/span/span[1]/input"));
		
		/*
		 * WebElement element = driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[5]/div[2]/div/div[1]/div[1]/form/span/span[1]/input"))
		 * ; JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		/*
		 * driver.findElement(By.xpath("//*[text()='Choose'][1]")).click();

		 */
		Thread.sleep(3000);
		
		String fileLoc="C:\\Users\\p81427\\Downloads\\TestLeaf Logo.png";
		
		StringSelection selection = new StringSelection(fileLoc);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		driver.navigate().to("");
		
		
		
		
	}

}
