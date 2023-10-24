package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilites_Practise.ReadConfig_Practise;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Practise {

	public static WebDriver driver;

	public static Logger logger = Logger.getLogger("Practise");
	
	ReadConfig_Practise config = new ReadConfig_Practise();
	String UserName = config.getUserName();
	String passWord = config.getpwd();
	String Url = config.geturl();


	@BeforeTest
	public void SetUp()
	{

		PropertyConfigurator.configure("log4j.properties");
		logger.info("Practise Testing");

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get(Url);
		logger.info(" URL Opened ");
		driver.manage().window().maximize();
		logger.info(" Window maximized ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	
	@AfterTest
	public void teardDown()
	{
		driver.quit();
		logger.info(" Driver Closed ");

	}

	public void ScreenShot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src, dest);
	}

}
