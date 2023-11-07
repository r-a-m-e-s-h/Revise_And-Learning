package PageObjects_Nov_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_nov7 {
	
	
	public static WebDriver driver;
	
	
	public LoginPage_nov7(WebDriver rdriver)
	{
		driver =  rdriver;
		PageFactory.initElements(driver, this);
	}
	

}
