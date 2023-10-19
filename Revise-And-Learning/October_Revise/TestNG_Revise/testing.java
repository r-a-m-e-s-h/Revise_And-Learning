package TestNG_Revise;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testing {
	
	WebDriver driver;
	
	
	
	@Test
	public void StringReverse()
	{
		String txt = "Hello world12345";
		String rev="";
		char[] c = txt.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
	}
	
	@Test
	public void numberReverse()
	{
		int number=12345;
		int rev=0;
		
		while(number!=0)
		{
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		System.out.println(rev);
		
		
	}
	
	@Test
	public void swapWithTemp()
	{
		
		int a=50;
		int b=20;
		int temp=0;
		
		temp=a;
		b=a;
		temp=b;
		
		System.out.println(b);
		
	}
	@Test
	public void swapWithOutTemp()
	{
		int first=5000;
		int second =1000;
		
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println(second);
	}
	@Test
	public void printStart()
	{
		int row,col=0;
		
		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
	}
	@Test
	public void printNumber()
	{
		int row,col=0;
		int number=0;
		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				number=number+1;
				System.out.print(number);
				
			}
			System.out.println();
		}
	}

	@Test
	public void occuranceofLetter()
	{
		String txt ="Hello world tom";
		
		char tofind='o';
		int occurance=0;
		for(int i=0;i<txt.length();i++)
		{
			if(txt.charAt(i)==tofind)
			{
				occurance++;
			}
			
		}
		System.out.println("The occurance of the letter is "+occurance);
		
	}
	
	@Test
	public void smallestElementinArray()
	{
		int[] given= {1,2,399,0,-1};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int tofind:given)
		{
			if(tofind<smallest)
			{
				smallest=tofind;
			}
		}
		System.out.println("The smallest element is : " +smallest);
		
		Arrays.sort(given);
		
		System.out.println("using inbuilt function :"+given[1]);
		
	}
	
	@DataProvider(name="xlData")
	public Object[][] getXLDATA() throws IOException
	{
		FileInputStream fis = new FileInputStream("C://Users//p81427//Documents//TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][cellCount];
		
		for(int i=1;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<cellCount;j++)
			{
				Cell cell = row.getCell(j);
				
				data[i-1][j] =cell.getStringCellValue();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "xlData")
	public void practise(String uname, String pwd)
	{
		
		System.out.println("The user name and pwd is "+uname+""+pwd);
	}
	
	@Test
	@Parameters({"username","pwd"})
	public void test_parameter(String uname, String pwd)
	{
		
	}
	
	@Test
	public void test_screenShot() throws IOException, AWTException
	{
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src, dest);
		
		Robot robot = new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dim);
		BufferedImage src1 =   robot.createScreenCapture(rect);
		File dest1 =new File("");
		ImageIO.write(src1, "png", dest1);
					
	}
	@Test
	public void test_Wait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		w.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id(""));
			}
		}	);
		
		//**********************	
		
	}
	
	@Test
	public void test_javaScript()
	{
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(0,250)");
		e.executeScript("window.ScrollTo(0,0)");
		e.executeScript("window.scrollBy(0,document.body.scrollHeight())");
		e.executeScript("document.getElementByName('q').value=''");
		e.executeScript("location-reload");
	
	}
	@Test
	public void test_frame_windows()
	{
		
		String old = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		driver.switchTo().window("old");
		
		driver.switchTo().frame(1);
		
		driver.switchTo().defaultContent();
		
		
	}
	
	@Test
	public void test_table()
	{
		WebElement tab = driver.findElement(By.xpath(""));
		
		List<WebElement> row = tab.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = tab.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
		
		
	}
	@Test
	public void test_files() throws AWTException
	{
		
		String file="";
		StringSelection selection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 File floc = new File("");
		 
		 File[] totfile = floc.listFiles();
		 
		 for (File tofind : totfile)
		 {
			 
			 if(tofind.equals(""))
			 {
				 System.out.println("file found");
				 break;
			 }
			
		}
			
		
	}
	@Test
	public void test_actions()
	{
		String txt ="helllll";
		String rev="";
		
		char[] c = txt.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
		
		int number=12345;
		int digits=0;
		int sum=0;
		
		while(number>0)
		{
			digits= number%10;
		}
		WebElement txt1 = driver.findElement(By.id(""));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold();
		actions.moveToElement(txt1);
		actions.doubleClick();
		actions.click();
		actions.dragAndDrop(null, null).build().perform();
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.getText();
		alert.sendKeys("");
		alert.dismiss();
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("arguments[0].setAttribute('value,back-ground: color')");
		
		
		
		
	}
	
	
	

}

