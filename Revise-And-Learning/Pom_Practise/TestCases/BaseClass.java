package TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ReadConfig;

public class BaseClass {



	public static WebDriver driver;
	public static Logger logger = Logger.getLogger("Nop-Commerce");

	//Below code is for getting data from readconfig file
	ReadConfig config = new ReadConfig();
	String baseURL = config.getBaseURL();
	String UserName = config.getUserName();
	String passWord = config.getPassword();


	@BeforeTest
	public void Setup()
	{
		//below code is for generating log4j
		PropertyConfigurator.configure("log4j.properties");

		driver= new ChromeDriver();
		logger.info("driver initialized");

		WebDriverManager.chromedriver().setup();

		driver.manage().window().maximize();
		logger.info("browser maximized");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(baseURL);
		logger.info("base url is opened");
	}


	@AfterTest
	public void TearDown()
	{
		driver.quit();
		logger.info("driver is closed(quitted)");
	}



}
