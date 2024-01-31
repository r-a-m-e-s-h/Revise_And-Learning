package new_Functionalities;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hashMap_technique {
	
	public static WebDriver driver;
	
	@Test
	public void testLogin()
	{
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(getuserName("normal_user"));
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(getPassword("normal_user"));
		
		driver.quit();
	}
	
	public static HashMap<String, String> getCredentialsMap()
	{
		HashMap< String, String> map = new HashMap();
		
		map.put("normal_user", "Admin:admin123");
		map.put("unknown_user", "Tom:admin123");
		
		return map;
	}
	public static String getuserName(String role )
	{
		String credentials = getCredentialsMap().get(role);
		
		return credentials.split(":")[0];
	}
	public static String getPassword(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}

}
