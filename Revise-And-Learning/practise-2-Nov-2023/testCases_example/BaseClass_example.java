package testCases_example;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.Readconfig_example;

public class BaseClass_example {
	
	
	public static WebDriver driver;
	
	public static Logger logger = Logger.getLogger("Practise Logging");
	
	Readconfig_example config = new Readconfig_example();
	
	String userName = config.getUserName();
	String passWord = config.getUserPassWord();
	String baseUrl = config.getBaseUrl();
	
	@BeforeTest
	public void setUp()
	{
		logger.getLogger("");
		
		PropertyConfigurator.configure("");
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
