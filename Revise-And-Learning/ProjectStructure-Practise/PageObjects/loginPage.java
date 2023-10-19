package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	public loginPage(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	@FindBy (xpath="//*[@name=\"username\"]")
	public static WebElement uname;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	public static WebElement pwd;
	
	@FindBy(xpath="//*[text()=\" Login \"]")
	public static WebElement loginBtn;
	
	
	public void enterUsername(String txt)
	{
		uname.sendKeys(txt);
	}
	public void enterPwd(String txt2)
	{
		pwd.sendKeys(txt2);
	}
	public void clickLoginbtn()
	{
		loginBtn.click();
	}

}
