package interview_Questions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testPage {


	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<String> NameList = new ArrayList<String>();

		int totalPages = driver.findElements(By.xpath("//div[@id=\"dtBasicExample_paginate\"]//a")).size();

		System.out.println("The total Pages are: "+totalPages);


		do {
			if(totalPages>0)
			{

				List<WebElement> pageName = driver.findElements(By.xpath("//td[@class=\"sorting_1\"]"));

				for(WebElement name: pageName)
				{
					NameList.add(name.getText());
				}
				WebElement nextBtn = driver.findElement(By.id("dtBasicExample_next"));

				String nextclassName = nextBtn.getAttribute("class");

				if(!nextclassName.contains("disables"))
				{
					Thread.sleep(3000);
					nextBtn.click();
				}
				else
				{
					break;
				}


			}
			else
			{
				System.out.println("no pagination in this page");
			}

		}while(true);

		for(String allNames:NameList)
		{
			System.out.println("The Names are : "+allNames);
		}
		
		driver.quit();


	}

}
