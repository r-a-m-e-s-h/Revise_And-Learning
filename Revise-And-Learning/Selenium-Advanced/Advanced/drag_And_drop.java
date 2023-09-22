package Advanced;

import java.time.Duration;

import org.apache.hc.core5.reactor.AbstractIOSessionPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_And_drop {


	@Test
	public void testdd()
	{
		WebDriver driver;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0v9962gnulbd7yh4q77a1lxxj489485.node0");

		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_content"));


		Actions actions = new Actions(driver);
		
		/*actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.build().perform(); */
		
		actions.dragAndDrop(from, to).build().perform();
		//actions.build().perform();
	}



}
