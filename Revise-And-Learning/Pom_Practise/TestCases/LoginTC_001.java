package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTC_001 extends BaseClass {
	
	
	@Test
	public void testLoginPage() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		
		lp.EnterUserName(UserName);
		logger.info("user name is entered");
		
		lp.EnterPwd(passWord);
		logger.info("password is entered");
		
		lp.clickLoginBtn();
		logger.info("login buttion is clicked");
		
		
	}
	
	
	
	
	
	
	
	
	

}
