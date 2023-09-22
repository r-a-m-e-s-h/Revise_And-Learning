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

public class pagination {


	@Test
	public void testpagignation() throws InterruptedException
	{
		WebDriver driver;

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		List<String> listdata = new ArrayList<String>();

		int sizeofPages = driver.findElements(By.xpath("//div[@id=\"dtBasicExample_paginate\"]//a")).size();

		System.out.println("The size of pagination is : "+sizeofPages);

		if(sizeofPages>0) {


			do {
				
				List<WebElement> listofNames = driver.findElements(By.xpath("//td[@class=\"sorting_1\"]"));
				
				for(WebElement name : listofNames)
				{
					listdata.add(name.getText());
				}
				
				WebElement nextBtn = driver.findElement(By.id("dtBasicExample_next"));
				String nextClassName = nextBtn.getAttribute("class");
				
				if(!nextClassName.contains("disabled"))		
				//if(nextBtn.isEnabled())
				{
					Thread.sleep(3000);
					nextBtn.click();
				}
				else {
					break;
				}
			}
			while(true);
		}
		
		else
		{
			System.out.println("No pagination in this page");
		}
		
		for(String allName : listdata) {

			System.out.println("The list of name are "+ allName);
		}

	}

}
