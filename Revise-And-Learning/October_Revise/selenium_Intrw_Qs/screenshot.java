package selenium_Intrw_Qs;

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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium_Advance_Revise.file_download;

public class screenshot {
	
	
	@Test
	public void testScreenShot() throws IOException, AWTException
	{
	

		WebDriver driver;
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		String destFloc = System.getProperty("user.dir")+"//test-output//sample1.png";
		
		/*
		 * TakesScreenshot screenshot =(TakesScreenshot)driver; File src =
		 * screenshot.getScreenshotAs(OutputType.FILE); File dest = new File(destFloc);
		 * FileUtils.copyFile(src, dest);
		 */
		
		
		Robot robot = new Robot();
		Dimension dimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		Rectangle rect = new Rectangle(dimension);
		BufferedImage src2 =  robot.createScreenCapture(rect);
		File dest2 = new File(destFloc);
		ImageIO.write(src2, "png", dest2);
		
		
		   
		driver.quit();
		
	}
	

}
