package interview_Questions;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mximize {
	
	
	@Test
	public void testMaximize()
	{

		WebDriver driver;
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");

		driver = new ChromeDriver(co);
		
		
		
		WebDriverManager.chromedriver().setup();
		
	


		driver.navigate().to("https://www.google.co.in");
		
		//driver.manage().window().maximize();
		
		//Dimension dimension = new Dimension(0,250);
		
		//driver.manage().window().setSize(dimension);
		
		
		
		
		driver.quit();
		
	}

}
