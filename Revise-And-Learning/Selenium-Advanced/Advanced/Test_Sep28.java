package Advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Sep28 {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@DataProvider(name="Xldata")
	public Object[][] getXLData() throws IOException
	{
		FileInputStream fis = new FileInputStream("./TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][colCount];
		for(int i=1;i<rowCount;i++)
		{
			Row row =  sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		
		return data;
		
	}
	
	
	@Test(dataProvider = "Xldata", enabled=false)
	public void fileUsingDataProvider(String uname, String pwd) {
		System.out.println(uname + "" +pwd);
		//System.out.println(pwd);
		
	}
	@Test(enabled=false)
	public void filedownload()
	{
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0wy4eqjti1b8tcs6d6vyroiah506498.node0");
		WebElement fbtn1 =  driver.findElement(By.id("j_idt93:j_idt95"));
		fbtn1.click();
		
		File floc = new File("C:\\Users\\p81427\\Downloads");
		File[] totFile = floc.listFiles();
		for (File file : totFile) {
			if(file.getName().equals("TestLeaf Logo.png"))
			{
				System.out.println("file downloaded");
				break;
			}
		}
		
		
		
		
	}
	@Test(enabled=false)
	public void test()
	{
		int a=10;
		int b=20;
		int large = a>b?a:b;
		System.out.println("large value is : "+large);
	}
	
	@Test
	public void dd() {
		
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement from = driver.findElement(By.xpath("//div[@id=\"form:drag\"][1]"));
		WebElement tp =driver.findElement(By.xpath("//div[@id=\"form:drop_content\"][1]"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(from, tp);
		actions.build().perform();
		
		
		
		
	}
	
	
	@AfterTest
	public void teradDown()
	{
		driver.quit();
	}
	

}
