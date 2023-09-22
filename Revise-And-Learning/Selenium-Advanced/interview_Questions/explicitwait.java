package interview_Questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwait {
	
	
	
	@Test
	public void testexplicitWait()
	{
		
		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		
		
		WebElement b1 = driver.findElement(By.id("j_idt87:j_idt89"));
		b1.click();
		
	//	WebElement ew_txt1 = driver.findElement(By.id("j_idt87:j_idt90"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement t1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt90")));
		
		t1.click();
		
		
	}

}
