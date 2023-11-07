package testCases_example;

import org.testng.annotations.Test;

import pageObjects_example.loginpage_example;

public class loginTestCase extends BaseClass_example {




	@Test
	public void logintest()
	{


		loginpage_example lpe = new loginpage_example(driver);

		lpe.enterUserName(userName);
		
		lpe.enterpassWord(passWord);
		
		lpe.clickLoginBtn();
		
		lpe.clickLogoutBtn();

	}

}
