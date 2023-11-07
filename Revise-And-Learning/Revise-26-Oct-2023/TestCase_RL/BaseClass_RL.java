package TestCase_RL;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilites_RL.ReadConfig_RL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_RL {

	public static WebDriver driver;

	public static Logger logger = Logger.getLogger("revise and Learning");

	ReadConfig_RL config = new ReadConfig_RL();

	String username = config.getUserName();
	String pwd = config.getPassWord();
	String BaseUrl = config.getUrl();




	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info(" Testing started ");

		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}



}
