package Testcase_Nov_7;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites_Nov_7.ReadConfig_Nov_7;

public class BaseClass_Nov_7 {

	
	public static WebDriver driver;
	
	public static Logger logger = Logger.getLogger("Practise-Nov-7-2023");
	
	ReadConfig_Nov_7 config = new ReadConfig_Nov_7();
	String BaseUrl =  config.getBaseUrl();
	String UserName = config.getUsername();
	String passWord = config.getPassword();
	String BrowserName = config.getbrowserName();
	
	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4jPractise.properties");
		
		logger.info("WelCome");
		
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(BaseUrl);
		
		
	}
	@AfterTest
	public void TearDown()
	{
		driver.quit();
		logger.info("Bye");
	}
	
}
