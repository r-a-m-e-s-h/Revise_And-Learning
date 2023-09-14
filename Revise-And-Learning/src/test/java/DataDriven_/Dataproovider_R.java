package DataDriven_;

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
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproovider_R {

	@DataProvider(name="logindata")
	public Object[][] xldata() throws IOException
	{
		FileInputStream fis = new FileInputStream("C://Users//p81427//Documents//TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][colCount];

		for(int i=1;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<colCount;j++){
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}

		}
		return data;
	}


	@Test(dataProvider = "logindata")
	public void LoginTest(String name, String password)
	{
		WebDriver driver;
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement uname =driver.findElement(By.xpath("//*[@name=\"username\"]"));
		uname.sendKeys(name);
		
		WebElement pwd = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		pwd.sendKeys(password);
		
		WebElement login_btn =  driver.findElement(By.xpath("//*[text()=' Login ']"));
		login_btn.click();
		
		WebElement profileBtn = driver.findElement(By.xpath("//*[text()='Paul Collings']"));
		profileBtn.click();
		
		WebElement logoutBtn = driver.findElement(By.xpath("//*[text()='Logout']"));
		logoutBtn.click();


		driver.quit();


	}


}
