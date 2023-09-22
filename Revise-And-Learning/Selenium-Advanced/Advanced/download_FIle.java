package Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class download_FIle {


	//

	@Test
	public void testFiled() throws InterruptedException
	{

		WebDriver driver ;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.leafground.com/file.xhtml");

		driver.findElement(By.id("j_idt93:j_idt95")).click();
		
		Thread.sleep(3000);
		
		File fileloc = new File("C:\\Users\\p81427\\Downloads");
		File[] totalFile = fileloc.listFiles();
		
		for(File myFile: totalFile)
		{
			if(myFile.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("The file is dowloaded and saved in local ");
				break;
				
			}
			
		}
		
		

	}

}
