
package TestNG_Revise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.it.Data;

public class practise_20_Oct_2023 implements ITestListener {
	
	
	public static WebDriver driver;
	@Test(alwaysRun = true)
	public void test()
	{
		
	}
	@Test(enabled=false)
	public void test1()
	{
		
	}
	@Test(groups= {"Test1"})
	public void test2()
	{
		
	}
	@Test()
	@Parameters({"",""})
	public void test3()
	{
		
	}
	@Test(priority=1)
	public void test4()
	{
		
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void test5()
	{
		
	}
	@BeforeSuite
	@BeforeTest
	@BeforeClass
	@BeforeMethod
	@Test
	public void test0()
	{
		
	}
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite
	
	@Test(timeOut = 5000)
	public void test6()
	{
		
	}
	@Test(invocationCount = 5)
	public void test7()
	{
		
	}
	@Test(dependsOnMethods = "test1")
	public void test8()
	{
		
	}
	@Test
	public void test9()
	{
		
	}
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }

	  
	  public  void onTestFailure(ITestResult result) {
	    // not implemented
	  }

	 
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	 
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
	
	String[][] data= {
			
			{"Admin","admin123"},
			{"Admin1","admin2"}	
	};
	
	@DataProvider(name="data1")
	public String[][] getData()
	{
		return data;
	}
	
	@DataProvider(name="XlData")
	public Object[][] getXlData() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data2 = new Object[rowCount][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				Cell cell = row.getCell(j);
				
				data2[i-1][j] = cell.getStringCellValue();
			}
		}		
		return data2;
	}
	
	@Test
	public void waits()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function <WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id(""));
			}
			
			
			
		});
		
		
		 
		
		
		
	}
	
	
	
	
	
	
	
	
}
