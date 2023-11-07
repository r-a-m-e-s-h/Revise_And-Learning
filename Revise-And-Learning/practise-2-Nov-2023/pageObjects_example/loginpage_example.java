package pageObjects_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_example	 {
	
	public WebDriver driver;
	
	public loginpage_example(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="")
	WebElement username;
	
	@FindBy(xpath="")
	WebElement pwd;
	
	@FindBy(xpath="")
	WebElement loginBtn;
	
	@FindBy(xpath="")
	WebElement logoutBtn;
	
	@FindBy(xpath="")
	WebElement profileBtn;
	
	
	public void enterUserName(String txt)
	{
		username.sendKeys(txt);
	}
	public void enterpassWord(String txt)
	{
		pwd.sendKeys(txt);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void clickLogoutBtn()
	{
		logoutBtn.click();
	}
	

}
