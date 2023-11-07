package script_practise;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test_codes {
	
	public static WebDriver driver;
	
	
	@Test
	public void test1()
	{
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		 * 
		 * 
		 * Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(3))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * 
		 * w.until(new Function <WebDriver,WebElement>() {
		 * 
		 * public WebElement apply(WebDriver driver)
		 * 
		 * { return driver.findElement(By.id("")); } });
		 */
		
		
		
		String txt = "hello1234 world";
		
		String rev="";
		
		char[] c =txt.toCharArray();
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}
			System.out.println(rev);	
			
			
			int num=123445;
			int rev1 = 0;
			
			while(num!=0)
			{
				rev1=rev1*10;
				rev1=rev1+num%10;
				num=num/10;
			}
				System.out.println(rev1);	
				
				
				
				int[] a = {1,2,34,5};
				
				int find=3;
				
				for(int check : a)
				{
					if(find==check)
					{
						System.out.println("number is present : "+check);
						break;
					}
					else
					{
						System.out.println("not present");
					}
					
				}
				
				String txt1 ="helllllooo";
				
				char  tofind ='e';
				
				int count=0;
				
				for(int i=0;i<txt1.length();i++)
				{
					if(txt1.charAt(i)==tofind)
					{
						count++;
					}
				}
				System.out.println(count);
				
				
				int temp=0;
				int a1=30;
				int b=50;
				
				temp=a1;
				a1=b ;
				b=temp;
				System.out.println(b);  
				
				int first =200;
				int second=400;
				
				first=first-second;
				second=first+second;
				first=second-first;
				
				System.out.println(first);
				
				
				
			
	}


	

}
