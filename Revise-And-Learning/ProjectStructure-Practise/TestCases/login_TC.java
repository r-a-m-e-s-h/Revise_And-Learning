package TestCases;

import org.testng.annotations.Test;

import PageObjects.loginPage;

public class login_TC extends BaseClass_Test{
	
	
	@Test
	public void test_Login()
	{
		loginPage lp = new loginPage(driver);
		lp.enterUsername(username);
		lp.enterPwd(pwd);
		lp.clickLoginbtn();
	}

}
