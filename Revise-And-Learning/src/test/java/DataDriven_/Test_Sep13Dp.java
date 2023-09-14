package DataDriven_;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Sep13Dp {

	String [][]data= {
			{"Admin","admin123"},
			{"Admin1","admin112"},
			{"Admin2","admin2221"}
	};

	@DataProvider(name="LoginData")
	public String[][] getUserData()
	{
		return data;	
	}


	@Test(dataProvider = "LoginData")
	public void dataTest(String name,String pwd)
	{
		System.out.println("The users are : "+name);
		System.out.println("The password are : "+pwd);
	}

}
