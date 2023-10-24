package TestCases;

import org.testng.annotations.Test;

import Pages.Loginpage_Practise;

public class LoginTestCase extends BaseClass_Practise {
	
	
	
	@Test
	public void LoginPageTestCase() throws InterruptedException
	{
		
		
		Loginpage_Practise lp = new Loginpage_Practise(driver);
		
		lp.enterUserName(UserName);
		logger.info(" UserName Entered");
		
		lp.enterPassWord(passWord);
		logger.info(" Password entered ");
		
		lp.clickLoginBtn();
		logger.info(" login btn clicked ");
		
		lp.clickLogoutBtn();
		logger.info(" logout btn clicked ");
		
		
		
	}


}
