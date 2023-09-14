package DataDriven_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_dataProvider {
	
	
	String [][]data = {
			{"Admin","admin123"},
			{"Admin1","admin123"},
	};
	
	@DataProvider(name="logindata")
	public String[][] getLoginData()
	{
		return data;
	}
	
	
	@Test(dataProvider = "logindata")
	public void logintest(String uname, String pwd)
	{
		WebDriver driver;
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement name = driver.findElement(By.xpath("//*[@name=\"username\"]"));
		name.sendKeys(uname);
		WebElement pword = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		pword.sendKeys(pwd);
		driver.findElement(By.xpath("//*[text()=\" Login \"]")).click();
		driver.quit();
		
		
		
	}

}
