package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_Practise {
	
	
	public static WebDriver driver;
	
	public Loginpage_Practise(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name=\"username\"]")
	WebElement uname;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement pwd;
	
	@FindBy(xpath="//*[text()=\" Login \"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[text()=\"Logout\"]")
	WebElement logOutbtn;
	
	@FindBy(xpath="//*[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
	WebElement profilebtn;
	
	
	public void enterUserName(String txt)
	{
		uname.sendKeys(txt);
	}
	public void enterPassWord(String txt)
	{
		pwd.sendKeys(txt);
	}
	public void clickLoginBtn()
	{
		loginbtn.click();
	}
	public void clickLogoutBtn() throws InterruptedException
	{
		profilebtn.click();
		
		Thread.sleep(2000);
		
		logOutbtn.click();
	}
	
	
	
	
}
