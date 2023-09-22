package interview_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authentication_popup {
	
	
	
	@Test
	public void testauthPopup()
	{

		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		
	}

}
