package sel_Advanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table_September12 {
	
	public static WebDriver driver;
	
	@Test
	public void testTable()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0pjm9r3ebu9xi3hef9sawkzfk480495.node0");
		
		
		WebElement table = driver.findElement(By.xpath("//div[@id=\"form:j_idt89\"]"));
		List<WebElement> head = table.findElements(By.tagName("thead"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
			List<WebElement> col = table.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.print(col.get(j).getText()+"\t");
			}
			System.out.println();
		}
		
		driver.quit();
		
		
	}

}
