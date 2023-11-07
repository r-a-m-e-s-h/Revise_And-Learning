package Script_Revise;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {


	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(enabled=false)
	public void practise() throws AWTException, IOException
	{
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("")));

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		fwait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id(""));
			}

		});

		//javascript executor
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.ScrollTo(0,0)");
		e.executeScript("window.scrollBy(0,250)");
		e.executeScript("window.scrollBy(0,document.body.scrollheight)");
		e.executeScript("document.getElementByname('q)[0].value='hello'");
		e.executeScript("Location-reload");
		//alert
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.sendKeys("Hello ");
		alert.accept();
		alert.dismiss();
		//navigate
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().refresh();
		//window
		String olwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String s: handles)
		{
			driver.switchTo().window(s);

		}
		driver.close();
		driver.switchTo().window(olwindow);
		//frame
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		//table
		WebElement table = driver.findElement(By.xpath(""));
		List<WebElement> thead = table.findElements(By.tagName("th"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = table.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText());
			}
		}

		//actions

		WebElement from= driver.findElement(By.id(""));
		WebElement to = driver.findElement(By.id(""));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(from,to).build().perform();
		actions.moveToElement(to);
		actions.contextClick();
		actions.doubleClick();

		//file download
		File floc = new File("");
		File[] totFile = floc.listFiles();

		for(File tofind : totFile)
		{
			if(tofind.getName().equals(""))
			{
				System.out.println("found");
				break;
			}
		}
		//file upload
		String loc ="";
		StringSelection selection = new StringSelection(loc);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src, dest);

		Robot r = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage srcImage = r.createScreenCapture(rect);
		File dest2 = new File("");
		ImageIO.write(srcImage, "png", dest2);

		WebElement logo = driver.findElement(By.id(""));
		File src3 = logo.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("");
		FileUtils.copyFile(src3, dest3);

		//activeELement

		driver.switchTo().activeElement().sendKeys("helllo"+Keys.ENTER);

	}

	@Test(enabled=false)
	public void all_chck_boxes() throws InterruptedException
	{

		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0ml5fii2du6ayfhknlnutj1b4554505.node0");

		Thread.sleep(3000);

		List<WebElement> cbox = driver.findElements(By.xpath("//*[contains(@class,\"ui-chkbox-icon\")]"));
		for(WebElement c :cbox)
		{
			c.click();

		}
	}
	@Test(enabled=false)
	public void gsearch_results_click() throws InterruptedException
	{

		driver.get("http://google.co.in");

		WebElement sbar = driver.findElement(By.name("q"));
		sbar.sendKeys(" hello ");

		Thread.sleep(5000);

		List<WebElement> sresults = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]//following::li"));

		Thread.sleep(5000);

		for(WebElement txt : sresults)
		{
			System.out.println(txt.getText());

			String gtext = txt.getText();
			if(gtext.contains("Hello Molly"))
			{
				txt.click();
				break;
			}
		}


	}
	@Test(enabled=false)
	public void getLinks()
	{

		driver.get("http://google.co.in");

		WebElement sbar = driver.findElement(By.name("q"));
		sbar.sendKeys(" hello "+Keys.ENTER);

		List<WebElement> getlinks = driver.findElements(By.tagName("a"));
		
		for(WebElement links : getlinks)
		{
			System.out.println(links.getAttribute("href"));
			
		}

	}
	
	@Test(enabled=false)
	public void features() 
	{
		//window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//object location
		
		WebElement logo = driver.findElement(By.id(""));
		System.out.println(logo.getRect().getDimension().getHeight());
		logo.getRect().getDimension().getWidth();
		logo.getRect().getX();
		logo.getRect().getY();
		
		//friendly locator or relative locator
		
		driver.findElement(RelativeLocator.with(By.id("")).toLeftOf(By.id("")).above(By.id("")));
		
		
		
		
	}


}
