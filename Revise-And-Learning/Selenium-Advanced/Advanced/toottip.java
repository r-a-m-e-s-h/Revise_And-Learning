package Advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toottip {


	@Test
	public void test()
	{
		WebDriver driver;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		WebElement tp = driver.findElement(By.xpath("//*[contains(text(),'Hover over me')][1]"));
		////*[@id="main"]/div[7]/div[2]/div/text()

		Actions actions = new Actions(driver);
		actions.moveToElement(tp);
		actions.build().perform();

		WebElement toolTiptext = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/div[2]/div/span"));
		System.out.println(toolTiptext.getText());


	}


}
