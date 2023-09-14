package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	//https://admin-demo.nopcommerce.com/login
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//*[text()=\"Log in\"]")
	WebElement loginBtn;
	
	public void EnterUserName(String uname) throws InterruptedException
	{
		username.clear();
		Thread.sleep(1000);
		username.sendKeys(uname);
	}
	public void EnterPwd(String pwd) throws InterruptedException
	{
		password.clear();
		Thread.sleep(1000);
		password.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
			
	
	
	

	
}
