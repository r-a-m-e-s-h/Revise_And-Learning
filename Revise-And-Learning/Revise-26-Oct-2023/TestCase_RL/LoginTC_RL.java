package TestCase_RL;

import org.testng.annotations.Test;

import PageObjects_RL.Loginpage_RL;


public class LoginTC_RL  extends BaseClass_RL
{

	
	@Test
	public void test_login()
	{
		Loginpage_RL lp = new Loginpage_RL(driver);
		
		lp.enterUname(username);
		
		lp.enterPwd(pwd);
		
		lp.clickLoginBtn();
		
		lp.clickLogoutBtn();
	}
	
	
	
}
