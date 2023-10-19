package TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilites.readConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Test {


	public static WebDriver driver;

	//public static Logger logger = Logger.getLogger("Testing Practise");

	readConfig config = new readConfig();
	String username = config.getUSerName();
	String pwd= config.getPassWord();
	String browserName=config.getBrowserName();
	String baseurl = config.getBaseURL();

	@BeforeTest
	public void setUp()
	{
		/*
		 * if(browserName.equalsIgnoreCase("chrome")) { driver = new ChromeDriver();
		 * WebDriverManager.chromedriver().setup(); } else
		 * if(browserName.equalsIgnoreCase("edge")) { driver = new EdgeDriver();
		 * WebDriverManager.edgedriver().setup(); } else
		 * if(browserName.equalsIgnoreCase("firefox")) { driver= new FirefoxDriver();
		 * WebDriverManager.firefoxdriver().setup(); }
		 */
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseurl);		

	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
