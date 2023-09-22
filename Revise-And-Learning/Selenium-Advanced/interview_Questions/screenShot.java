package interview_Questions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShot {
	
	
	
	@Test
	public void testSS() throws IOException, AWTException
	{
		
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Hello world"+Keys.ENTER);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C://Users//p81427//Pictures//Screenshots//sample.png");
		FileUtils.copyFile(src, dest);
		
		// using robot class
		
		Robot robot = new Robot();
		Dimension screensize =   Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screensize);
		BufferedImage src1 = robot.createScreenCapture(rect);
		
		File dest1 = new File("C://Users//p81427//Pictures//Screenshots//sample1.png");
		ImageIO.write(src1, "png", dest1);
		
		
		
		
		
		
	}

}
