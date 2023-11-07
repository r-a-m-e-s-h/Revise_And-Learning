package PageObjects_RL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_RL {
	
	public static WebDriver driver;
	
	public Loginpage_RL(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@name=\"username\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement pwd;
	
	@FindBy(xpath="//*[text()=\" Login \"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[text()=\"Logout\"]")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
	WebElement profileBtn;
	
	public void enterUname(String txt)
	{
		name.sendKeys(txt);
	}
	public void enterPwd(String txt)
	{
		pwd.sendKeys(txt);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void clickLogoutBtn()
	{
		profileBtn.click();
		
		logOutBtn.click();
		
	}
	
	

}
