package interview_Questions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwait {




	@Test
	public void testFluentWait()
	{

		WebDriver driver;

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get("https://www.leafground.com/waits.xhtml");
		
		
		WebElement b1 =   driver.findElement(By.id("j_idt87:j_idt89"));
		b1.click();
		
		//Fluent wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
	WebElement b2 = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver d)
			{
				return driver.findElement(By.id("j_idt87:j_idt90"));
			}
			
		});
		
		b2.click();
		
		WebElement b2Text = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt90\"]//span"));
		System.out.println("The text inside b2 is : "+b2Text.getText());
		
		
		




	}

}
